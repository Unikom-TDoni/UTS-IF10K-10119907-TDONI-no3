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
public class Rnb extends MusicGenre implements Blues, Jazz {

    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName.concat("adalah musisi Blues"));
    }

    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName.concat("adalah musisi Jazz"));
    }
    
}
