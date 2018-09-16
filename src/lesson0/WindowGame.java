package lesson0;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class WindowGame extends BasicGame {
	
	public void main(String[] args) throws SlickException {
		new AppGameContainer(new WindowGame(), 1024, 768, false).start();
	}
	
	private GameContainer container;
	
	public WindowGame() {
		super("Lesson 1: Window Game");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		this.container = container;
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {

	}
	
	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			container.exit();
		}
	}

}
