package collection.dao;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO {
	public static ArrayList<MemberDTO> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register( MemberDTO dto ) {
		System.out.println("dao register 연동");
		//System.out.println( dto.getName() );
		//System.out.println( dto.getAddr() );
		arr.add(dto);
	}
	public ArrayList<MemberDTO> getData() {
		return arr;
	}
	public MemberDTO search(String name ) {
		for(MemberDTO d : arr) {
			if(name.equals( d.getName() ) ) {
				return d;
			}
		}
		return null;
	}
}










