public class Miles extends Spiderman implements MilesActions{
    public Miles(int id, String universe, String name, String nickName, String gender, String custom) {
        super(id, universe, name, nickName, gender, custom);
    }

    @Override
    public void spiderSense(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Spider Sense\n","Trebuchet", 28, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\spiderSenseM.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void venomBlast(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Venom Blast\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\venomBlastM.jpg");
        s.setBounds(200,150, 1000, 900);
    }

    @Override
    public void electricThreads(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Electric Threads\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\electricThreadsM.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void invisible(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Invisibility\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\invisibleM.jpg");
        s.setBounds(200, 150, 1000, 900);
    }
}
