package IksOksLogika;

public class Igrica {
	
    private Tabela poljanaZaIgru;
    private int aktivniIgrac;

    public Igrica(){
    	poljanaZaIgru = new Tabela();
    	aktivniIgrac = Polje.PRVI_IGRAC;
    }
    
    public boolean provjeriDaLiJeDozvoljenPotez(int i, int j){
    if(poljanaZaIgru.provjeriPolje(i, j))
    	return poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja() == Polje.prazno_polje;
    return false;
    }
    /**
     * Funkcija koja ce odigrati potez. U nasu tabelu ce upisati potez, i promjeniti igraca. Takodjer provjerava da li je potez ispravan.
     * @param i
     * @param j
     * @throws Exception
     */
    public void odigrajPotez(int i, int j) throws Exception{
    	if(provjeriDaLiJeDozvoljenPotez(i, j)){
    		poljanaZaIgru.setPolje(aktivniIgrac, i, j);
    		
    		if(aktivniIgrac == Polje.PRVI_IGRAC){
    			aktivniIgrac = Polje.DRUGI_IGRAC;
    		}
    		else{
    			aktivniIgrac = Polje.PRVI_IGRAC;
    		}
    	}else{
    		throw new Exception("Potez nije dozvoljen");
    	}
    }
    
    public boolean daLiJeKrajIgre(){
    	boolean imaPraznihPolja = false;
    	
    	for(int i=0;i<3;i++){
    		for(int j=0;j<3;j++){
                imaPraznihPolja |= (poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja()==Polje.prazno_polje); 
    		}
    	}
    	if(!imaPraznihPolja)
    		return true;
    	return nekoJePobjedio();
    }

	private boolean nekoJePobjedio() {
		// TODO Auto-generated method stub
		return false;
	}
}
