
package me.goa456.pokemon;

import jgame.*;
import jgame.platform.*;
/** Minimal shooter illustrating Eclipse usage. */
public class Main extends StdGame {
	
	public static void main(String[]args) {
		Main game = new Main();
	}
	
	public Main() {
		initEngine(640, 480);
	}

	@Override
	public void initCanvas() {
		setCanvasSettings(
			20,  // width of the canvas in tiles
			15,  // height of the canvas in tiles
			16,  // width of one tile
			16,  // height of one tile
			     //    (note: total size = 20*16=320  x  15*16=240)
			null,// foreground colour -> use default colour white
			null,// background colour -> use default colour black
			null // standard font -> use default font
		);
	}
	
	public void initGame() {
		// We can set the frame rate, load graphics, etc, at this point. 
		// (note that we can also do any of these later on if we wish)
		setFrameRate(
			35,// 35 = frame rate, 35 frames per second
			2  //  2 = frame skip, skip at most 2 frames before displaying
			   //      a frame again
		);
	}
}
