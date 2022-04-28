public class Benjamin extends Spiderman implements BenjaminActions{
    public Benjamin(int id, String universe, String name, String nickName, String gender, String custom) {
        super(id, universe, name, nickName, gender, custom);
    }

    @Override
    public void cureFactor(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Cure factor\n", "Trebuchet", 26, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\cureFactorB.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void superAgility(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Super Agility\n", "Trebuchet", 26, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\superAgilityB.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void superjump(Screen s) {
        s.cls();
        s.repaint();
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Super Jump\n", "Trebuchet", 26, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\superJumpB.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void perfectBalance(Screen s) {
        s.cls();
        s.repaint();
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Perfect Balance\n", "Trebuchet", 26, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\perfectbalanceB.jpg");
        s.setBounds(200, 150, 1000, 900);
    }

    @Override
    public void spiderWebFluid(Screen s) {
        s.cls();
        s.repaint();
        s.out(showInfo(), "Trebuchet", 28, Colors.BlueGrey);
        s.out("Spider web Fluid\n", "Trebuchet", 26, Colors.BlueHorizon);
        s.showImage("C:\\Users\\Dell\\IdeaProjects\\practicaMultiverse\\spiderWebFluidB.jpg");
        s.setBounds(200, 150, 1000, 900);
    }
}
