package task_4;

import javax.xml.bind.annotation.*;
import java.util.Objects;
@XmlType(name ="owner")
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {
@XmlAttribute(name = "first_name")
  private String name;
  @XmlElement( name = "cellphone")
  private int phone;

  public Owner() {
  }

  public Owner(String name, int phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Owner owner)) return false;
    return phone == owner.phone && Objects.equals(name, owner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone);
  }

  @Override
  public String toString() {
    return String.format("Owner: name - %s, Phone - %s.", name, phone);
  }
}
