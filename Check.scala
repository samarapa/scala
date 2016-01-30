//Checking greater than zero...

val val1: Double = 0.0
val val2 : Double = 1.0

if (val1 == 0) {
 println(s"Same") 
  } else if (val1 > 0)
  {
 println(s"Greater") 
 }else{
 println(s"Less than zero") 
 }

val res_match = val2 match {
                 case 0 => s"Same"
		 case g if  g > 0 => s"Greater"
		 case l if l < 0 => s"less"
		 }
			
    
