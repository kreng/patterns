package behavioral.mediator;

public interface Dispatcher {
    String callTaxi();
    String orderFlowers();
    String callRepairer();

    void registerTask(Task task);

    class ConciergeService implements Dispatcher {

        private TaxiService taxiService;
        private FlowerService flowerService;
        private RepairerService repairerService;

        @Override
        public String callTaxi() {
            return taxiService.process("Вызываю такси");
        }

        @Override
        public String orderFlowers() {
            return repairerService.process("Вызываю мастера");
        }

        @Override
        public String callRepairer() {
            return taxiService.process("Оформляю доставку цветов");
        }

        @Override
        public void registerTask(Task task){
            if(task.getClass() == TaxiService.class){
                taxiService = (TaxiService)task;
            } else if(task.getClass() == RepairerService.class){
                repairerService = (RepairerService) task;
            } else if(task.getClass() == FlowerService.class) {
                flowerService = (FlowerService)task;
            }
        }
    }
}