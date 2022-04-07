package com;

import java.util.List;
import java.util.Map;

public class DID {
    private String season;
    private List<String> sponsors;
    private Map<Participant,String> participate;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<String> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<String> sponsors) {
        this.sponsors = sponsors;
    }

    public Map<Participant, String> getParticipate() {
        return participate;
    }

    public void setParticipate(Map<Participant, String> participate) {
        this.participate = participate;
    }
    public void display(){
        System.out.println("Season "+getSeason());
        List<String> brands=getSponsors();
        for(String s:brands){
            System.out.println(s);
        }
        Map<Participant,String> teams=getParticipate();
        for(Map.Entry<Participant,String> p:teams.entrySet()){
            System.out.println(p.getKey()+" "+p.getValue());
        }
    }
}
