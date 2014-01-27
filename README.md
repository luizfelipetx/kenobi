kenobi
======

Kenobi API

- for Java Projects : kenobi.jar file
- for Android : library kenoby importing to your project


Example:
```
Util util = new Util();

//point you want to check if it is within the region
Ponto pontoOrigem = new Ponto(-22,4837593,-43,4384765753); 

// this is center of region
Ponto x = new Ponto(-22,847359479,-43,483759387);  

// Raio of circle ==4km
boolean insideRegion = util.isNearPoints(pontoOrigem, x, 4); 
System.out.println(insideRegion);
```

