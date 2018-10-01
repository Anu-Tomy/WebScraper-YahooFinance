package com.webscraper;

public class Stock {
	
	private int id;
	private String symbol;
	private String name;
	private double price;
	private double chang;
	private double percentChang;
    private String volum;
    private String avgVol;
	private double marketCap;
	private String peRatio;
	
	//constructor without id
	/**
	 * @param symbol
	 * @param name
	 * @param price
	 * @param chang
	 * @param percentChang
	 * @param volum
	 * @param avgVol
	 * @param marketCap
	 * @param peRatio
	 */
	public Stock(String symbol, String name, double price, double chang, double percentChang, String volum,
			String avgVol, double marketCap, String peRatio) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.price = price;
		this.chang = chang;
		this.percentChang = percentChang;
		this.volum = volum;
		this.avgVol = avgVol;
		this.marketCap = marketCap;
		this.peRatio = peRatio;
	}
	
	//constructor with id
	/**
	 * @param id
	 * @param symbol
	 * @param name
	 * @param price
	 * @param chang
	 * @param percentChang
	 * @param volum
	 * @param avgVol
	 * @param marketCap
	 * @param peRatio
	 */
	public Stock(int id, String symbol, String name, double price, double chang, double percentChang, String volum,
			String avgVol, double marketCap, String peRatio) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.name = name;
		this.price = price;
		this.chang = chang;
		this.percentChang = percentChang;
		this.volum = volum;
		this.avgVol = avgVol;
		this.marketCap = marketCap;
		this.peRatio = peRatio;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the chang
	 */
	public double getChang() {
		return chang;
	}

	/**
	 * @param chang the chang to set
	 */
	public void setChang(double chang) {
		this.chang = chang;
	}

	/**
	 * @return the percentChang
	 */
	public double getPercentChang() {
		return percentChang;
	}

	/**
	 * @param percentChang the percentChang to set
	 */
	public void setPercentChang(double percentChang) {
		this.percentChang = percentChang;
	}

	/**
	 * @return the volum
	 */
	public String getVolum() {
		return volum;
	}

	/**
	 * @param volum the volum to set
	 */
	public void setVolum(String volum) {
		this.volum = volum;
	}

	/**
	 * @return the avgVol
	 */
	public String getAvgVol() {
		return avgVol;
	}

	/**
	 * @param avgVol the avgVol to set
	 */
	public void setAvgVol(String avgVol) {
		this.avgVol = avgVol;
	}

	/**
	 * @return the marketCap
	 */
	public double getMarketCap() {
		return marketCap;
	}

	/**
	 * @param marketCap the marketCap to set
	 */
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	/**
	 * @return the peRatio
	 */
	public String getPeRatio() {
		return peRatio;
	}

	/**
	 * @param peRatio the peRatio to set
	 */
	public void setPeRatio(String peRatio) {
		this.peRatio = peRatio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock [id=" + id + ", symbol=" + symbol + ", name=" + name + ", price=" + price + ", chang=" + chang
				+ ", percentChang=" + percentChang + ", volum=" + volum + ", avgVol=" + avgVol + ", marketCap="
				+ marketCap + ", peRatio=" + peRatio + "]";
	}

	

}
