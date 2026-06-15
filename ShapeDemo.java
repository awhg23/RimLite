// 1. 定义接口 IShape1 (包含 area 方法)
interface IShape1 {
    double area();
}

// 2. 定义接口 IShape2 (包含 perimeter 方法)
interface IShape2 {
    double perimeter();
}

// 3. 定义接口 IShape3 (包含 setColor 方法)
interface IShape3 {
    void setColor(String c);
}

// 4. 定义 Cycle (圆) 类
class Cycle implements IShape1, IShape2, IShape3 {
    private double r; // 半径
    private String color; // 颜色

    // 构造方法
    public Cycle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r; // 计算面积
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r; // 计算周长
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    // 输出信息的方法
    public void information() {
        System.out.println("半径：" + r + " 面积：" + area() + " 周长：" + perimeter() + " 颜色：" + color);
    }
}

// 5. 定义 Square (正方形) 类
class Square implements IShape1, IShape2, IShape3 {
    private double l; // 边长
    private String color; // 颜色

    // 构造方法
    public Square(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l * l; // 计算面积
    }

    @Override
    public double perimeter() {
        return 4 * l; // 计算周长
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    // 输出信息的方法
    public void information() {
        System.out.println("边长：" + l + " 面积：" + area() + " 周长：" + perimeter() + " 颜色：" + color);
    }
}
