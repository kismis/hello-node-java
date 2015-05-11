package com.kismis.hello;

public class C {
  private A a = new A();
  public A fill() {
    for (int i = 0; i < 10; i++) {
      B b = new B();
      b.title = "Haha";
      a.titles.add(b);
    }
    return this.a;
  }
}