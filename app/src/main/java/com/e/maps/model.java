package com.e.maps;

public class model {
    private double lat;
    private double lon;
    private String marker;

    public model(double lat, double lon, String marker) {
        this.lat = lat;
        this.lon = lon;
        this.marker = marker;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getMarker() {
        return marker;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
