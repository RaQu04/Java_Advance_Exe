package Szkola;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Sala {
    int number;
    int seats;

    Board board;
    int numberBoard;
    Chair chair;
    int numberChair;
    Table table;
    int numberTable;

    @Override
    public String toString() {
        return "Sala{" +
                "number=" + number +
                ", seats=" + seats +
                ", board=" + board.getName() +
                ", numberBoard=" + numberBoard +
                ", serial number= " + board.getSerialNumber() +
                ", chair=" + chair.getName() +
                ", numberChair=" + numberChair +
                ", serial number= " + chair.getSerialNumber() +
                ", table=" + table.getName() +
                ", numberTable=" + numberTable +
                ", serial number= " + table.getSerialNumber() +
                '}';
    }
}
