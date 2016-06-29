package OptionalClass;

import java.util.Optional;

public class OptionalDemo{

	public String getNullString(){
	  return(null);
	}
	
	public Optional<String> getOptionalNullString(){
	  return(null);
	}

	public static void main(String[] args){
		OptionalDemo optionalTest=new OptionalDemo();
		String nullString=optionalTest.getNullString();
		
		try{
			System.out.println(nullString.toString());
		}catch(NullPointerException x){
			System.out.println("Oh the humanity, a NullPointerException!");
		}
		///fsddgfaga
		if(nullString!=null){
			  System.out.println(nullString.toString());
			}else{
			  System.out.println("nullString is null, man that check was a lot of work");
			}
		//fdsakjfla
		Optional<String> optionalString=optionalTest.getOptionalNullString();
		try{
		  if(optionalString.isPresent()){
		  System.out.println(optionalString.get().toString());
		  }
		}catch(NullPointerException x){
		  System.out.println("Optional object can be null, sorry dude.");
		}
		//sdfmjlajlghg
		try{
			  optionalString=Optional.of(optionalTest.getNullString());
			  if(optionalString.isPresent()){
			  System.out.println(optionalString.get().toString());
			  }
			}catch(NullPointerException x){
			  System.out.println("NullPointerException, I thought Optional totally banished these?!");
			}
		//sdfkajdlgjla
		optionalString=Optional.ofNullable(optionalTest.getNullString());
		optionalString.ifPresent(s->{System.out.println(s.toString());});
		//sfjlajlfjal
		
	}
}