/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.IF10K.NIM10119907.TDoni.no3;

/**
 *
 * @author T Doni
 */
public class Metal extends HardRock implements HeavyMetal, Punk {
    
    public void genreMetal(String artistName) {
        System.out.println(artistName.concat("adalah musisi Metal"));
    }
    
    public void genreGruge(String artistName) {
        System.out.println(artistName.concat("adalah musisi Gruge"));
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName.concat("adalah musisi Heavy Metal"));
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName.concat("adalah musisi Punk"));
    }
}
