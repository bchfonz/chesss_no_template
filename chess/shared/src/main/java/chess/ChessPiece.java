package chess;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final ChessPiece.PieceType type;
    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> legalMoves = new ArrayList<>();
        ChessPosition tempPosition = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition1 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition2 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition3 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        if(board.getPiece(myPosition).type == ChessPiece.PieceType.ROOK){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.KNIGHT){

        }
        //Generates legal moves for Bishop
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.BISHOP){
            //TODO:Figure out how many times to loop
            for(int i = myPosition.getRow(); i < (myPosition.getRow()) - 8; i++){
                int tempRow = myPosition.getRow();
                int tempCol = myPosition.getColumn();
                //Will this mess up memory allocation?
                if(board.getPiece(tempPosition) != null){

                }
                if(board.getPiece(tempPosition1)!= null){

                }
                if(board.getPiece(tempPosition2)!= null){

                }
                if(board.getPiece(tempPosition3)!= null){

                }
            }
        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.QUEEN){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.KING){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.PAWN){

        }


        return legalMoves;
    }
    /**
     * Bishop moves
     * @returns collection of valid Bishop Moves
     */
}
