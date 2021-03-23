public class Application {
    public static void main(String[] args){
        AreaAggregator  aggregator=new AreaAggregator();
        aggregator.addShape(new Circle(5.7));
        aggregator.addShape(new Circle(1.2));
        aggregator.addShape(new Square(8.8));
        System.out.println(aggregator.output());
    }
}
