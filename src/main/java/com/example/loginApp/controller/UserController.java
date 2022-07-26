
@RestController
public class UserController {
	
	 
	 @PostMapping("user")
     public ResponseEntity<?>(String  userName , String password){
         String token = 	  
    	  
      }
	 
	 private String getJWTToken(String userName , String Password){
		 //validar que exista el user
		 String secretKey = "educacionIt";
		 
		 String token = Jwts
				 .builder()
				 .setId("clase19")
				 .setSubject(userName)
				 .claim("role","ROLE_USER")
				 .setIssuedAt(new Date(System.currentTimeMillis()))
				 .setExpiration(new Date(System.currentTimeMillis()+ 600000))
				 .signWith(SignatureAlgorithm.HS512,secretKey.getBytes()).compact();
		 
		 return "Bearer" + token 
				 
	 }
}
