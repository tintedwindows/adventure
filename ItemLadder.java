public class ItemLadder extends Item implements Holdable, Visible {

	public ItemLadder(String s, String sd, String[] a) {
		super(s, sd, a);
	} 
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean b) {
		this.visible = b;
	}
	protected boolean visible = true;
}
