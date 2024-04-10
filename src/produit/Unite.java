package produit;

public enum Unite {
	LITRE("l"), GRAMME("g"), KILOGRAMME("Kg"), CENTILITRE("Cl"), MILILITRE("Ml"), PAR_PIECE("P");
	private final String unit ;
	
	Unite(String string) {
		this.unit=string;
	}

	public String getUnit()
	{
		return unit;
	}
}
