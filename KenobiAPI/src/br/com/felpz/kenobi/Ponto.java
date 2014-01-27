package br.com.felpz.kenobi;

public class Ponto {
	
	private Long id;
	private String lat;
	private String lon;
	private String desc;
	private String desc_full;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc_full() {
		return desc_full;
	}
	public void setDesc_full(String desc_full) {
		this.desc_full = desc_full;
	}
	
	@Override
	public String toString() {
		return "Ponto [id=" + id + ", lat=" + lat + ", lon=" + lon + ", desc="
				+ desc + ", desc_full=" + desc_full + "]";
	}
	public Ponto(Long id, String lat, String lon, String desc, String desc_full) {
		super();
		this.id = id;
		this.lat = lat;
		this.lon = lon;
		this.desc = desc;
		this.desc_full = desc_full;
	}
	
	public Ponto(String lat, String lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	public Ponto(){
		
	}
}
