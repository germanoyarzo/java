package com.Oyarzo.ejercicio1;

public class Rectangulo {
  private float height=1.0F;
  private float width=1.0F;
  float area=0F;
  float perimetro=0F;

  public void setHeight(float height){////métodos que usamos en las clases para modificar (set)
      this.height=height;
  }
  public float getHeight(){//métodos que usamos en las clases para mostrar (get)
      return height;
  }

  public void setWidth(float width){
      this.width=width;
  }
  public float getWidth(){
      return width;
  }
  public float getArea(){
      return this.height*this.width;
  }
  public float getPerimetro(){
      return (this.height+this.width)*2;
  }

  @Override
    public String toString(){
      return "Alto: "+ this.height + " Ancho: " + this.width;
  }

}
