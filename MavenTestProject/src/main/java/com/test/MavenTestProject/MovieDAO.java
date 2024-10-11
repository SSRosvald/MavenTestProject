package com.test.MavenTestProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
	public List<Movie> getAllMovies() throws SQLException{
		List<Movie> movies = new ArrayList<>();
		Connection conn = DatabaseConnection.getConnection();
		String query = "SELECT * FROM film";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			Movie movie = new Movie(rs.getInt("id"), rs.getString("title"), rs.getString("category"), rs.getInt("release_year"));
			movies.add(movie);
		}
		return movies;
	}
	
	public MovieDAO() {
		// TODO Auto-generated constructor stub
	}

}
