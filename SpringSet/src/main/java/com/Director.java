package com;

import java.util.Set;

public class Director {
    private String name;
    private Set<Movie> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
    public void display(){
        System.out.println("Name "+getName());
        Set<Movie> movies1=getMovies();
        for(Movie m:movies1){
            System.out.println(m);
        }
    }
}
