/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS.IF10K.NIM10119907.TDoni.no3;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk uts no 3
 */
public class UTS12018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var rnb = new Rnb();
        rnb.genreBlues("Jimmy Hendrick ");
        rnb.genreJazz("Chad Baker ");
        
        var folk = new Folk();
        folk.genreFolk("Bob Dylan ");
        
        var rockabilly = new Rockabily();
        rockabilly.genreRokabily("Elvis Prasely ");
        
        var metal = new Metal();
        metal.genreProgressiveRock("DreamTheater ");
        metal.genrePhysicodellic("The Doors ");
        metal.genrePopRock("Kiss ");
        metal.genreHeavyMetal("METALLICA ");
        
        var grindCore = new Grindcore();
        grindCore.genreGrindcore("Mesin Tempur ");
        
        var deathMetal = new DeathMetal();
        deathMetal.genreDeathMetal("JASAD ");
        
        var deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate ");
        
        var blackMetal = new BlackMetal();
        blackMetal.genreBlackMetal("Behemoth ");
        
        var newSkul = new NewSkul();
        newSkul.genreNewSkull("HATEBREED ");
    }
    
}
