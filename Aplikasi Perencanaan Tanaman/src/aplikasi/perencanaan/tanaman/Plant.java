/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.perencanaan.tanaman;

class Plant {
    private String name;
    private int growthTime;
    private String season;
    
    public Plant(String name, int growthTime, String season) {
        this.name = name;
        this.growthTime = growthTime;
        this.season = season;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrowthTime() {
        return growthTime;
    }
    
    public String getSeason() {
        return season;
    }
    
    @Override
    public String toString() {
        return "Tanaman: " + name + ", Waktu Tumbuh: " + growthTime + " hari, Musim: " + season;
    }
}
