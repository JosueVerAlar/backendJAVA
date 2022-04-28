public class Silk extends Spiderman implements SilkActions{
    public Silk(int id, String universe, String name, String nickName, String gender, String custom) {
        super(id, universe, name, nickName, gender, custom);
    }

    @Override
    public void handToHand(Screen s) {
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Hand to Hand\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\handToHandS.jpg");
        s.setBounds(200,150,1000, 900);
    }

    @Override
    public void superStrength(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Hand to Hand\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\strenghtS.jpg");
        s.setBounds(200,150,1000,900);
    }

    @Override
    public void superSpeed(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Super Speed\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\speedS.jpg");
        s.setBounds(200,150, 1000, 900);
    }

    @Override
    public void reflexes(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Reflexes\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\reflexesS.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void shootSpiderWeb(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Spider Web\n", "Trebuchet", 24, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\spiderWebS.jpg");
        s.setBounds(200, 150, 1000, 900);
    }
}
