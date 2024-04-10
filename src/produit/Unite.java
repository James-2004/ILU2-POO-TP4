package produit;

public enum Unite {
	LITRE("l"), GRAMME("G"), KILOGRAMME("K"), CENTILITRE("C"), MILILITRE("M"), PAR_PIECE("P");
	private final String unit ;
	
	Unite(String string) {
		this.unit=string;
	}

	public String getUnit()
	{
		return unit;
	}
}
