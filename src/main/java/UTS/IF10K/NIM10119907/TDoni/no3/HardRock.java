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
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PhysicodellicRock {
    public void genreHardRock(String artistName) {
        System.out.println(artistName.concat("adalah musisi Hard Rock"));
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName.concat("adalah musisi Pop Rock"));
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName.concat("adalah musisi Progressive Rock"));
    }
    
    @Override
    public void genrePhysicodellic(String artistName) {
        System.out.println(artistName.concat("adalah musisi Physicodellic"));
    }
}
