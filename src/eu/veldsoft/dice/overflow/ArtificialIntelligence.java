package eu.veldsoft.dice.overflow;

/**
 * Interface which each computer opponent class needs to implement.
 * 
 * @author Todor Balabanov
 */
interface ArtificialIntelligence {
	/**
	 * At each game turn each player should do a single move. The move is
	 * coordinates of a cell on the board.
	 * 
	 * @param cells
	 *            Cells on the board.
	 * 
	 * @param player
	 *            Current player reference.
	 * 
	 * @return Move coordinates.
	 * 
	 * @throws ImpossibleMoveException
	 *             If the move is not possible at all rise an exception.
	 */
	public int[] move(Cell cells[][], Cell.Type player) throws ImpossibleMoveException;
}
