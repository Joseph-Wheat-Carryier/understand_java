package com.banyuan.club;

public class Repository {
    int max_numbers;
    Car[] car;
    int car_count;

    public Repository(int max_numbers) {
        this.max_numbers = max_numbers;
        car = new Car[max_numbers];
        car_count = 0;
    }

    public void add_car(Car car) {
        if (car_count < max_numbers) {
            this.car[car_count] = car;
            car_count++;
            System.out.println("添加成功");
        } else {
            System.out.println("no space to add!");
        }
    }

    public void reduce_car(String type) {
        if (car_count == 0) {
            System.out.println("no reserve");
        }
        for (int i = 0; i < car_count; i++) {
            if (car[i].type.equals(type)) {
                for (int j = i; j < car_count; j++) {
                    if (j != car_count - 1) {
                        car[i] = i == max_numbers - 1 ? null : car[i + 1];
                        car_count--;
                    }else {
                        car[j] = null;
                    }
                }
                System.out.println("删除成功");
                break;
            } else if(i==car_count-1&&!car[i].type.equals(type)) {
                System.out.println("no reserve");;
            }
        }
    }

    public void show_cars() {
        for (int i = 0; i < this.car_count; i++) {
            System.out.print(this.car[i].type);
        }
    }
}
