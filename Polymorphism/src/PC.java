public class PC {
    private Case theCase;
    private Monitor monitor;
    private MOtherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MOtherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
