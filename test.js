var java = require('java');
java.classpath.push('./src');
var c = java.newInstanceSync("com.kismis.hello.C");
var a = c.fillSync();
console.log(a);
