package Project1;

	import java.awt.*;
	import java.awt.event.*;
	import java.io.IOException;
	import java.net.URI;
	import java.net.URISyntaxException;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
import javax.swing.SwingConstants;


	public class Gui extends JFrame implements ActionListener {
		/**
		 * 
		 */
		private Label stocks;
		private TextField searchbar;
		//private Button Nasdaq;
		//private JFrame Frame;
		
		//Stuff I am adding for later addition to master
		//private String _searchie;
		private JPanel _buttons;
		private JPanel _bar;
		
		private static final long serialVersionUID = 1L;
		public Gui() {
			setLayout(new GridLayout(2,2));
			add(_buttons = new JPanel());
			add(_bar = new JPanel());
			stocks= new Label("Stocks",JLabel.LEFT);
			_buttons.add(stocks);
			
			JButton j;
			_buttons.add(j = new JButton("Do Nothing"));
			j.setVisible(true);
			setSize(200,200);
			setVisible(true);
			
		


			searchbar = new TextField("Type Here");
			searchbar.setEditable(true);
			_bar.add(searchbar);
			searchbar.setSize(5,10);
			searchbar.setVisible(true);
			
			searchbar.addActionListener(this);
			this.pack();
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			

		
			
			
			
			
			
			JButton Menu;
			
			_buttons.add(Menu= new JButton("Menu To be"));
			Menu.setVisible(true);
			setSize(200,200);
			Menu.setAlignmentX(LEFT_ALIGNMENT);
			setVisible(true);
			Menu.addActionListener(new Action());
			
		}static class Action implements ActionListener{
				
				public void actionPerformed (ActionEvent e) {
					JFrame menuframe = new JFrame("Menu to be");
					menuframe.setVisible(true);
					menuframe.setSize(750,750);
					JLabel menulabel= new JLabel("Menu to do nothing");
					JPanel menupanel = new JPanel();
					menuframe.add(menupanel);
					menupanel.add(menulabel);
				}
				
			}
	
			
						
			
			
		     
		   public void actionPerformed1(ActionEvent e) {
			// TODO Auto-generated method stub	}
				
		System.out.println("Success");
		Desktop browser= Desktop.getDesktop();
		try {
			browser.browse(new URI("https://www.nasdaq.com/"));
		}
		catch(IOException err) {
			
		} catch (URISyntaxException err) {
			
			System.exit(0);
				
		}
		}
		 public static void main(String[] args) {
		      new Gui();
	}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}

	
	
