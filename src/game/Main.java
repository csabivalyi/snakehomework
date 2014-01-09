package game;

import iooperations.FileHandler;
import listeners.SnakeKeyListener;
import menu.Menu;
import menu.MenuBar;

public class Main {

	public static void main(String[] args) {
	    SnakeKeyListener snakeKeyListener = new SnakeKeyListener();
	    FileHandler fileHandler = new FileHandler();
	    
	    Menu menu = new Menu();
	    MenuBar menuBar = new MenuBar();	    
		Snake snake = new Snake(snakeKeyListener, fileHandler);
		
		menu.setSnake(snake);
		menuBar.addMenus(menu.getMenus());
		snake.setJMenuBar(menuBar);
		
		snakeKeyListener.setSnake(snake);
		snake.start();
	}

}
