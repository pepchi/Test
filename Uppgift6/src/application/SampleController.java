package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import application.Account;
import application.Person;
import application.PersonReg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SampleController {
	PersonReg reg = new PersonReg();
	@FXML
	private TextField txtPersonName;
	@FXML
	private TextField txtpNbr;
	@FXML
	private TextField txtAccBalance;
	@FXML
	private TextField txtAccNbr;
	@FXML
	private Label lblResponse;
	@FXML
	private RadioButton rbtnHasAccount;
	@FXML
	private RadioButton rbtnNoAccount;

	@FXML
	public void btnAdd_Click(ActionEvent event) {
		String name = txtPersonName.getText();
		String pNbr = txtpNbr.getText();
		Person tmpPerson = new Person(pNbr, name);
		lblResponse.setText("Response:");
		if (rbtnHasAccount.isSelected()) {
			String balance = txtAccBalance.getText();
			int accNumber;
			try {
				accNumber = Integer.parseInt(txtAccNbr.getText());
				Account account = new Account(accNumber, cardType);
				tmpPerson.setAccounts(creditCard);
				creditCard.setHolder(tmpCustomer);
			} catch (Exception e1) {
				lblResponse.setText("Response: Error, Card Number.");
			}
		} else {
			lblResponse.setText("Response:");
		}
		reg.addPersons(tmpPerson);
	}

	@FXML
	public void btnFind_Click(ActionEvent event) {
		String cNumber = txtpNbr.getText();
		Person tmpPerson = reg.findPerson(pNbr);
		if (tmpPerson != null) {
			lblResponse.setText("Response:");
			txtpNbr.setText(tmpPerson.getpNbr());
			txtPersonName.setText(tmpPerson.getName());

			if (tmpPerson.getAccounts() != null) {
				ArrayList<Account> acc = tmpPerson.getAccounts();
				txtCardType.setText(card.getType());
				txtCardNbr.setText(Integer.toString(card.getCardNumber()));
				rbtnHasCard.setSelected(true);
			} else {
				txtCardType.setText("");
				txtCardNbr.setText("");
				rbtnNoCard.setSelected(true);
			}
		} else {
			lblResponse.setText("Response: Customer not found");
		}
	}

	@FXML
	public void btnDelete_Click(ActionEvent event) {
		String pNbr = txtpNbr.getText();
		reg.removePerson(pNbr);
		lblResponse.setText("Response:");
	}

	@FXML
	public void btnNewName_Click(ActionEvent event) {
		String cNumber = txtpNbr.getText();
		Person tmpCustomer = reg.findPerson(cNumber);
		if (tmpCustomer != null) {
			lblResponse.setText("Response:");
			String newName = txtPersonName.getText();
			reg.setPersonName(cNumber, newName);
		} else {
			lblResponse.setText("Response: Customer not found");
		}
	}
	
}
