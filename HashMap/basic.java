/*

HashMap is used to store values in key,value 
----------------------------------------------------------------------

HashMap<String, Integer> mp = new HashMap<>();

// insert or update using put
mp.put(”key”,1);
mp.put(”kk”,2);

// remove element with a key using remove method
hm.remove(4);

//get value
hm.get(”key”); // 1

//size 
hm.size()
-----------------------------------------------------------------------------------------------------------
conditions

```java
if(mp.containsKey(”key”));  // map.containsKey(keyToBeChecked); 

mp.containsValue(Object Value)   // returns true if any key contains this obj, else false

mp.put(sum,mp.getOrDefault(sum,o)+1) //numbers.getOrDefault(4, "Not Found")
```
---------------------------------------------------------------------------------------------------------------
Looping

```java
//for each   (// pass lambda expression to forEach()
prices.forEach((key, value) -> {
  // value = value - value * 10/100;
  System.out.print(key + "=" + value + " ");  
});
  
 //keySet()
 for (String i : prices.keySet()){
    sout (mp.get(i));
 }
 
------------------------------------------------------------------------------------------------------- 
```

Others :

1. use another hashmap :

HashMap<Integer, String> hm2
= new HashMap<Integer, String>(hm1);

*/