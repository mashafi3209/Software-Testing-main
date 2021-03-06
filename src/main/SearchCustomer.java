package main;

import com.toedter.calendar.JDateChooser;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SearchCustomer extends javax.swing.JInternalFrame {

	private static final long serialVersionUID = 1L;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton jButtonBrowse;
	private JButton jButtonUpdate;
	private JButton jButtonCancel;
	private JButton jButtonFind;
	private JLabel jLabelFirstName;
	private JLabel jLabelContact;
	private JLabel jLabelLastName;
	private JLabel jLabelNicNo;
	private JLabel jLabelPassID;
	private JLabel jLabelAddress;
	private JLabel jLabelCusID;
	private JLabel jLabelDOB;
	private JLabel jLabelGender;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JRadioButton radioButtonMale;
	private JRadioButton radioButtonFemale;
	private JTextArea txtaddress;
	private JTextField txtcontact;
	private JTextField txtcustid;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtnic;
	private JTextField txtpassport;
	private JDateChooser txtdob;
	private JLabel txtphoto;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form AddCustomer
	 */
	public SearchCustomer() {
		initComponents();
	}

	Connection con;
	PreparedStatement pst;

	String path = null;
	byte[] userimage = null;

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabelFirstName = new javax.swing.JLabel();
		jLabelLastName = new javax.swing.JLabel();
		jLabelNicNo = new javax.swing.JLabel();
		jLabelPassID = new javax.swing.JLabel();
		jLabelAddress = new javax.swing.JLabel();
		txtlastname = new javax.swing.JTextField();
		txtfirstname = new javax.swing.JTextField();
		txtnic = new javax.swing.JTextField();
		txtpassport = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtaddress = new javax.swing.JTextArea();
		jLabelCusID = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabelDOB = new javax.swing.JLabel();
		jLabelGender = new javax.swing.JLabel();
		jLabelContact = new javax.swing.JLabel();
		radioButtonMale = new javax.swing.JRadioButton();
		radioButtonFemale = new javax.swing.JRadioButton();
		txtcontact = new javax.swing.JTextField();
		txtphoto = new javax.swing.JLabel();
		txtdob = new JDateChooser();
		jButtonBrowse = new javax.swing.JButton();
		jButtonUpdate = new javax.swing.JButton();
		jButtonCancel = new javax.swing.JButton();
		txtcustid = new javax.swing.JTextField();
		jButtonFind = new javax.swing.JButton();

		jPanel1.setBackground(new java.awt.Color(51, 0, 255));

		jLabelFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelFirstName.setForeground(new java.awt.Color(255, 255, 255));
		jLabelFirstName.setText("FirstName");

		jLabelLastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelLastName.setForeground(new java.awt.Color(255, 255, 255));
		jLabelLastName.setText("LastName");

		jLabelNicNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelNicNo.setForeground(new java.awt.Color(255, 255, 255));
		jLabelNicNo.setText("Nic No");

		jLabelPassID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelPassID.setForeground(new java.awt.Color(255, 255, 255));
		jLabelPassID.setText("Passport ID");

		jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelAddress.setForeground(new java.awt.Color(255, 255, 255));
		jLabelAddress.setText("Address");

		txtlastname.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtlastnameActionPerformed(evt);
			}
		});

		txtpassport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtpassportActionPerformed(evt);
			}
		});

		txtaddress.setColumns(20);
		txtaddress.setRows(5);
		jScrollPane1.setViewportView(txtaddress);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(26, 26, 26)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														false)
												.addGroup(jPanel1Layout
														.createSequentialGroup()
														.addComponent(jLabelFirstName)
														.addGap(47, 47, 47)
														.addComponent(
																txtfirstname))
												.addGroup(jPanel1Layout
														.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(
																		jLabelAddress)
																.addComponent(
																		jLabelPassID)
																.addComponent(
																		jLabelNicNo))
														.addGap(38, 38, 38)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(
																		jScrollPane1)
																.addComponent(
																		txtpassport)
																.addComponent(
																		txtnic))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabelLastName)
										.addGap(48, 48, 48)
										.addComponent(txtlastname,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												166,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(37, 37, 37)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelFirstName)
								.addComponent(txtfirstname,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelLastName).addComponent(txtlastname,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelNicNo).addComponent(txtnic,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelPassID).addComponent(txtpassport,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelAddress)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										62,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)));

		jLabelCusID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabelCusID.setText("Customer ID");

		jPanel2.setBackground(new java.awt.Color(51, 0, 255));

		jLabelDOB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelDOB.setForeground(new java.awt.Color(255, 255, 255));
		jLabelDOB.setText("Date of Birth");

		jLabelGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
		jLabelGender.setText("Gender");

		jLabelContact.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabelContact.setForeground(new java.awt.Color(255, 255, 255));
		jLabelContact.setText("Contact");

		radioButtonMale.setText("Male");
		radioButtonFemale.setText("Female");
		
		radioButtonMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButtonFemale.setSelected(false);
			}
		});
		radioButtonFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButtonMale.setSelected(false);
			}
		});


		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(22, 22, 22)
						.addGroup(jPanel2Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelDOB)
								.addComponent(txtdob,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										174, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabelGender)
												.addComponent(jLabelContact))
										.addGap(43, 43, 43)
										.addGroup(jPanel2Layout
												.createParallelGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														false)
												.addGroup(jPanel2Layout
														.createSequentialGroup()
														.addComponent(radioButtonMale)
														.addGap(18, 18, 18)
														.addComponent(radioButtonFemale))
												.addComponent(txtcontact))))
						.addContainerGap(41, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(37, 37, 37).addComponent(jLabelDOB)
						.addComponent(txtdob,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelGender).addComponent(radioButtonMale)
								.addComponent(radioButtonFemale))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelContact).addComponent(txtcontact,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(108, Short.MAX_VALUE)));

		txtphoto.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jButtonBrowse.setText("Browse");
		jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBrowseActionPerformed(evt);
			}
		});

		jButtonUpdate.setText("Update");
		jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonUpdateActionPerformed(evt);
			}
		});

		jButtonCancel.setText("Cancel");
		jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelActionPerformed(evt);
			}
		});

		jButtonFind.setText("Find");
		jButtonFind.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonFindActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(jLabelCusID)
										.addGap(29, 29, 29)
										.addComponent(txtcustid,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												147,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap().addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout
														.createSequentialGroup()
														.addComponent(jPanel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(txtphoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																250,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout
														.createSequentialGroup()
														.addGap(337, 337, 337)
														.addComponent(jButtonBrowse,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																87,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(layout.createSequentialGroup()
										.addGap(39, 39, 39)
										.addComponent(jButtonUpdate,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jButtonCancel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												100,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGap(30, 30, 30)
										.addComponent(jButtonFind,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												81,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(24, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
						.createSequentialGroup()
						.addContainerGap(17, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelCusID)
								.addComponent(txtcustid,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonFind))
						.addGap(38, 38, 38)
						.addGroup(layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING,
								false)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addGap(25, 25, 25)
										.addGroup(layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(txtphoto,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														250, Short.MAX_VALUE)
												.addComponent(jPanel2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addComponent(jButtonBrowse,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonUpdate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonCancel,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														38,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(49, 49, 49)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void txtpassportActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			JFileChooser picchooser = new JFileChooser();
			picchooser.showOpenDialog(null);
			File pic = picchooser.getSelectedFile();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"*.images", "png", "jpg");
			picchooser.addChoosableFileFilter(filter);
			path = pic.getAbsolutePath();
			BufferedImage img;
			img = ImageIO.read(picchooser.getSelectedFile());
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage()
					.getScaledInstance(250, 250, Image.SCALE_DEFAULT));
			txtphoto.setIcon(imageIcon);

			File image = new File(path);
			FileInputStream fis = new FileInputStream(image);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buff = new byte[1024];
			for (int readNum; (readNum = fis.read(buff)) != -1;) {
				baos.write(buff, 0, readNum);
			}
			userimage = baos.toByteArray();
			fis.close();
		} catch (IOException ex) {
			Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		}

	}

	private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {

		String id = txtcustid.getText();
		String firstname = txtfirstname.getText();
		String lastname = txtlastname.getText();
		String nic = txtnic.getText();
		String passport = txtpassport.getText();
		String address = txtaddress.getText();

		DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
		String date = da.format(txtdob.getDate());
		String Gender;

		if (radioButtonMale.isSelected()) {
			Gender = "Male";
		} else {
			Gender = "FeMale";
		}
		
		

		String contact = txtcontact.getText();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline",
					"root", "1234");
			pst = con.prepareStatement(
					"update customer set firstname = ?,lastname = ?,nic = ?,passport = ?,address= ?,dob = ?,gender = ?,contact = ?,photo = ? where id = ?");

			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setString(3, nic);
			pst.setString(4, passport);
			pst.setString(5, address);
			pst.setString(6, date);
			pst.setString(7, Gender);
			pst.setString(8, contact);
			pst.setBytes(9, userimage);
			pst.setString(10, id);
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null,
					"Registation Updated...");

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		}

	}

	private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
		this.hide();
	}

	private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {
		String id = txtcustid.getText();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline",
					"root", "1234");
			pst = con.prepareStatement("select * from customer where id = ?");
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next() == false) {
				JOptionPane.showMessageDialog(this, "Record not Found");
			} else {
				String fname = rs.getString("firstname");
				String lname = rs.getString("lastname");
				String nic = rs.getString("nic");
				String passport = rs.getString("passport");

				String address = rs.getString("address");
				String dob = rs.getString("dob");
				Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
				String gender = rs.getString("gender");

				Blob blob = rs.getBlob("photo");
				byte[] _imagebytes = blob.getBytes(1, (int) blob.length());
				ImageIcon image = new ImageIcon(_imagebytes);
				Image im = image.getImage();
				Image myImg = im.getScaledInstance(txtphoto.getWidth(),
						txtphoto.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon newImage = new ImageIcon(myImg);

				if (gender.equals("Female")) {
					radioButtonMale.setSelected(false);
					radioButtonFemale.setSelected(true);

				} else {
					radioButtonMale.setSelected(true);
					radioButtonFemale.setSelected(false);
				}
				String contact = rs.getString("contact");

				txtfirstname.setText(fname.trim());
				txtlastname.setText(lname.trim());
				txtnic.setText(nic.trim());
				txtpassport.setText(passport.trim());
				txtaddress.setText(address.trim());
				txtcontact.setText(contact.trim());
				txtdob.setDate(date1);
				txtphoto.setIcon(newImage);
			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		} catch (ParseException ex) {
			Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE,
					null, ex);
		}

	}

}
