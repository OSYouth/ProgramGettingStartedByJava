package castle;

public class HandlerGo extends Handler{
	public HandlerGo(Game game){
		super(game);
	}
	@Override
	public void goCmd(String word) {
		// TODO Auto-generated method stub
		game.goRoom(word);
	}

}
