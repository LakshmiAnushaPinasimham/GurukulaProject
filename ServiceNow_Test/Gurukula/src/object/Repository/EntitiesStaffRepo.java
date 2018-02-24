package object.Repository;

import org.openqa.selenium.By;

public class EntitiesStaffRepo {
	public static By staff = By.xpath("//a[contains(@href, '#/staff')]");
	public static By create_Staff = By.xpath(".//*[contains(@class,'btn btn-primary')]");
	public static By name_TextField = By.name("name");
	public static By branch_DropDown = By.name("related_branch");
	public static By save_Button = By.xpath(".//*[contains(@class,'glyphicon glyphicon-save')]");
	public static By view_Button = By.xpath("//span[@class='glyphicon glyphicon-eye-open']");
	public static By back_Button = By.cssSelector("button.btn.btn-info");
	public static By edit_Button = By.cssSelector("button.btn.btn-primary.btn-sm");
	public static By delete_Button = By.cssSelector("button.btn.btn-danger.btn-sm");
	public static By delete_Form = By.name("deleteForm");
	public static By delete_FormButton = By.xpath(".//*[contains(@class,'btn btn-danger')]");

}
