package package1;

import javax.swing.JOptionPane;

class EmptyFirstName extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field First Name Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyLastName extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field Last Name Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyPhoneNumber extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Phone Number Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyEmailId extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field Email Id Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyAddress extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field Address Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyGender extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field Gender Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyDateOfBirth extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Field DOB Can't Be Empty", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
class EmptyEducation extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void throwMessage() {
		
		JOptionPane.showMessageDialog(null, "Please Select Your Education", "Empty Field", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
