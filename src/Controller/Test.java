/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author user
 */
public class Test {
    public String nama;

    public String pilihanS[];
    public boolean pilihanB[];

    public Test(){
        nama = "kokoko";

        pilihanS = new String[3];
        pilihanS[0] = "pilihan 1";
        pilihanS[1] = "pilihan 2";
        pilihanS[2] = "pilihan 3";

        pilihanB = new boolean[3];
    }

    @Override
    public String toString() {
        return nama;
    }



}
