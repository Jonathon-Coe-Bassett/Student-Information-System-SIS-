import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu
	{
		private static final long serialVersionUID=1L;
		static JFrame frame=new JFrame();
		public static void doMain()
			{
				int mainChoice;
				Object[] options = {"Add or Delete Student", "Change Student's Grade/Schedule", "Sort Students"};
				ImageIcon icon =  new ImageIcon("mn.jpg");
				mainChoice = JOptionPane.showOptionDialog(null, 
					"",
					"Student Information System",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					icon,
					options, 
					options[1]);
					switch(mainChoice)
					{
					case 0:
						{
						doAddDeleteMenu();
						break;
						}
					case 1:
						{
						doChangeMenu();
						break;
						}
					case 2:
						{
						doSortMenu();
						break;
						}
					}
			}
		public static void doAddDeleteMenu()
		{
			int addDeleteChoice;
			Object[] options = {"Add a Student", "Delete a Student"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			addDeleteChoice = JOptionPane.showOptionDialog(null, 
				"Add or Delete Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(addDeleteChoice)
				{
				case 0:
					{
					ManipulateStudent.addStudent();
					break;
					}
				case 1:
					{
					ManipulateStudent.deleteStudent();
					break;
					}
				}
		}
		public static void doChangeMenu()
		{
			int changeChoice;
			Object[] options = {"Change Grade", "Switch Classes"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			changeChoice = JOptionPane.showOptionDialog(null, 
				"Change Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(changeChoice)
				{
				case 0:
					{
					ManipulateClass.changeGrade();
					break;
					}
				case 1:
					{
					ManipulateClass.switchClass();
					break;
					}
				}
		}
		public static void doSortMenu()
		{
			int sortChoice;
			Object[] options = {"Sort by Last Name", "Sort by GPA", "Sort by Class"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			sortChoice = JOptionPane.showOptionDialog(null, 
				"Main Menu",
				"Student Information System",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(sortChoice)
				{
				case 0:
					{
					Sort.sortByLast();
					break;
					}
				case 1:
					{
					Sort.sortByGPA();
					break;
					}
				case 2:
					{
					sortClass();
					break;
					}
				}
		}
		public static void sortClass()
		{
			int sortChoice;
			Object[] options = {"Period 1", "Period 2", "Period 3"};
			ImageIcon icon =  new ImageIcon("32.jpg");
			sortChoice = JOptionPane.showOptionDialog(null, 
				"Sort by Class",
				"Sort By",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				icon,
				options, 
				options[1]);
				switch(sortChoice)
				{
				case 0:
					{
					Sort.sortByPeriod1();
					break;
					}
				case 1:
					{
					Sort.sortByPeriod2();
					break;
					}
				case 2:
					{
					Sort.sortByPeriod3();
					break;
					}
				}
		}
	}
