package com.example.demo.model;

import java.util.Date;

public class City {
    private Integer id;

	private String name;

	private String countrycode;

	private String district;

	private Integer population;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode == null ? null : countrycode.trim();
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district == null ? null : district.trim();
	}

	public Integer getPopulation() {
		return population;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}
	public void setCityId(Short cityId) {
		this.cityId = cityId;
	}

	public void setCountryId(Short countryId) {
		this.countryId = countryId;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	private String cityName;

	private String cityCode;

	public String getCityName() {
		return cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	private Short cityId;

    private String city;

    private Short countryId;

    private Date lastUpdate;

    public Short getCityId() {
        return cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Short getCountryId() {
        return countryId;
    }

}