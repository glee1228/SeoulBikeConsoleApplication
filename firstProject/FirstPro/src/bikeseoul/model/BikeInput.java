package bikeseoul.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import bikeseoul.domain.BikeSeoulDTO;
import bikeseoul.domain.Location;
import bikeseoul.domain.Rent;
import bikeseoul.domain.Station;

public class BikeInput {
	
	public static void ReadCSV() {
		BufferedReader in = null;
		//BufferedWriter out = null;
		
		ArrayList<BikeSeoulDTO> bikelist = BikeModel.getInstance().list;
		
		Location l = null;
		Rent r = null;
		Station s = null;
		
		String Filename = "BikeSeoulDTO.csv";
		try {

			in = new BufferedReader(new FileReader(Filename));
			String data = in.readLine();
			String[] data2 = null;
			
			while (data != null) {
				data2 = data.split(",");
				s= new Station(data2[1],data2[2],data2[3],data2[4]);
				l= new Location(Double.parseDouble(data2[5]), Double.parseDouble(data2[6]));
				r = new Rent(Integer.parseInt(data2[7]),Integer.parseInt(data2[8]));
				
				bikelist.add(new BikeSeoulDTO(data2[0],s,l,r));
				
				data = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				//out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
