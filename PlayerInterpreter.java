import java.util.Arrays;

public class PlayerInterpreter {

	public Action interpretString(String string) {

		return action(string.toLowerCase().split(" "));
	}
	public Action action(String[] string) throws ArrayIndexOutOfBoundsException {
		
		if(string == null || string.length == 0) {
			return Action.ActionUnknown;
		}
		if(string[0].compareTo("go") == 0 || string[0].compareTo("travel") == 0 || string[0].compareTo("jump") == 0){
			String[] command = Arrays.copyOfRange(string, 1, string.length);
			return action(command);
		}
		else {

			// input could be northeast, put cpu in vax, throw shovel, examine bin
			
			String s = string[0];
			Action action = null;
			out:{
				for(Action a : Action.values()) {
					for(String alias : a.getAliases()) {

						if(s.compareTo(alias) == 0) {
							action = a;
							break out;
						}
					}
				}
			}
			if(action == null) {
				return Action.ActionUnknown;
			}
			switch(action.type()) {
				case TYPE_DIRECTIONAL:
					return action;
				case TYPE_HASDIRECTOBJECT:
					// test direct object
					// "throw SHOVEL"
					if(string.length > 1) {

						String d = string[1];
						Item item = null;
						for(Item i : Item.values()) {
							for(String alias : i.getAliases()) {
								if(d.compareTo(alias) == 0) {
									item = i;
									break;
								}
							}
						}
						// item is the direct object of the action
						action.setDirectObject(item);
						return action;
					}
					else {
						System.out.println("You must supply a direct object");
						return Action.ActionError;
					}
				case TYPE_HASINDIRECTOBJECT:
				
					// test if it has indirect object
					// "put CPU IN VAX"

					if(string.length > 1) {

						String d = string[1];
						Item item = null;
						for(Item i : Item.values()) {
							for(String alias : i.getAliases()) {
								if(d.compareTo(alias) == 0) {
									item = i;
									break;
								}
							}
						}
						// item is the direct object of the action
						action.setDirectObject(item);
						
						if(string.length > 2) {
							String in = string[2];
							if(in.compareTo("in") == 0) {
								
								if(string.length > 3) {
									String io = string[3];
									Item indob = null;
									for(Item i2 : Item.values()) {
										if(io.compareTo(i2.toString()) == 0) {
											indob = i2;
											break;
										}
									}
									action.setIndirectObject(indob);	
									return action;
								}
								else {
									System.out.println("You must supply an indirect object");
									return Action.ActionError;
								}
							}
							else {
								return Action.ActionUnknown;
							}
						}
						
					}
					else {
						System.out.println("You must supply a direct object");
						return Action.ActionError;
					}
					break;
				case TYPE_HASNOOBJECT:
					return action;
				case TYPE_UNKNOWN:
					return Action.ActionUnknown;
				default:
					System.out.println("Unknown type");
					break;
			}
		}
		
		return Action.ActionUnknown;
	}
}
