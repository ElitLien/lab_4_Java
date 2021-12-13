package com.pizza.pizza.dto.pizza.response;

import com.pizza.pizza.dto.grocery.response.GroceryResponseDto;

public class PizzaGroceryResponseDto {
    private GroceryResponseDto grocery;

    public GroceryResponseDto getGrocery() {
        return grocery;
    }

    public void setGrocery(GroceryResponseDto grocery) {
        this.grocery = grocery;
    }
}
