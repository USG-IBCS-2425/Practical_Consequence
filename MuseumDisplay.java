import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MuseumDisplay {
	private JFrame startFrame;
	private JLabel welcomeText;

	public MuseumDisplay() {
		startFrame = new JFrame("Museum Display");
		startFrame.setSize(800, 720);
		welcomeText = new JLabel("Welcome to my Album Museum!", JLabel.CENTER);
		welcomeText.setBounds(200, 50, 400, 60);

		startFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        });

        JFrame f = new JFrame();
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("album1.png");
		//https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.com%2FHIT-HARD-SOFT-Billie-Eilish%2Fdp%2FB0CZWKXLQ3&psig=AOvVaw03NvGjzt-lNFNEPJeQX5LU&ust=1738186838113000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKiX6_-xmYsDFQAAAAAdAAAAABAE
		ImageIcon icon2 = new ImageIcon("album2.png");
		//https://www.google.com/url?sa=i&url=https%3A%2F%2Fopen.spotify.com%2Falbum%2F5oT7xqbRbQCevZ0XC5aBFu&psig=AOvVaw3hDvYeRiEu0ko2deawpBg9&ust=1738186872503000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMCLpfuxmYsDFQAAAAAdAAAAABAE
		ImageIcon icon3 = new ImageIcon("album3.png");
		//https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FI_Love_You_%2528The_Neighbourhood_album%2529&psig=AOvVaw1l41_hcxxL2xSYLWSzzi-T&ust=1738186912763000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCODry_WxmYsDFQAAAAAdAAAAABAE
		ImageIcon icon4 = new ImageIcon("album4.png");
		//https://www.google.com/url?sa=i&url=https%3A%2F%2Fopen.spotify.com%2Falbum%2F2jX6yKrWw9bY7JAYHhhtqZ&psig=AOvVaw1v5xemzILApfm5FUPPVy90&ust=1738186930360000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLijtO-xmYsDFQAAAAAdAAAAABAE
		ImageIcon icon5 = new ImageIcon("album5.png");
		//https://www.google.com/url?sa=i&url=https%3A%2F%2Fopen.spotify.com%2Falbum%2F69g3CtOVg98TPOwqmI2K7Q&psig=AOvVaw2zl8-F3rANQh4K-F2LLrRZ&ust=1738186961563000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLC935SxmYsDFQAAAAAdAAAAABAQ
		JLabel lab = new JLabel(icon);
		f.add(p);
		p.add(lab);
		f.pack();
		// shrinks/exapnds window to fit the size of the image
		f.setVisible(true);

        JButton billieButton = new JButton("HIT ME HARD AND SOFT");
        billieButton.setActionCommand("HIT ME HARD AND SOFT");
        billieButton.addActionListener(new ButtonClickListener()); 
        billieButton.setBounds(300, 120, 200, 80);
        //(x, y, width, height)
		startFrame.add(billieButton);

        JButton beaButton = new JButton("THIS IS HOW TOMORROW MOVES");
        beaButton.setActionCommand("THIS IS HOW TOMORROW MOVES");
        beaButton.addActionListener(new ButtonClickListener()); 
        beaButton.setBounds(250, 220, 300, 80);
		startFrame.add(beaButton);

		JButton nbhdButton = new JButton("I LOVE YOU.");
        nbhdButton.setActionCommand("I LOVE YOU.");
        nbhdButton.addActionListener(new ButtonClickListener()); 
        nbhdButton.setBounds(300, 320, 200, 80);
		startFrame.add(nbhdButton);

        JButton malcolmButton = new JButton("SWEET BOY");
        malcolmButton.setActionCommand("SWEET BOY");
        malcolmButton.addActionListener(new ButtonClickListener()); 
        malcolmButton.setBounds(300, 420, 200, 80);
		startFrame.add(malcolmButton);

        JButton theinternetButton = new JButton("EGO DEATH");
        theinternetButton.setActionCommand("EGO DEATH");
        theinternetButton.addActionListener(new ButtonClickListener()); 
        theinternetButton.setBounds(300, 520, 200, 80);
		startFrame.add(theinternetButton);

        startFrame.add(welcomeText);
        startFrame.setLayout(null);
        startFrame.setVisible(true);
    
	}

	public static void main(String[] args) {
		MuseumDisplay mWin = new MuseumDisplay();      
	}

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();  
         
            if(command.equals("HIT ME HARD AND SOFT")) {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("album1.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				// shrinks/exapnds window to fit the size of the image
				f.setVisible(true);  
			}
           if(command.equals("THIS IS HOW TOMORROW MOVES")) {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon2 = new ImageIcon("album2.png");
				JLabel lab = new JLabel(icon2);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);  
			}
           if(command.equals("I LOVE YOU.")) {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon3 = new ImageIcon("album3.png");
				JLabel lab = new JLabel(icon3);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);  
			}
           if(command.equals("SWEET BOY")) {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon4 = new ImageIcon("album4.png");
				JLabel lab = new JLabel(icon4);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);  
			}
           if(command.equals("EGO DEATH")) {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon5 = new ImageIcon("album5.png");
				JLabel lab = new JLabel(icon5);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);  
			}
         }
           
   }

}