package br.dev.ferreiras.dslearn.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "tb_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String email;
  private String password;
  private String phone;
  private LocalDate birthDate;

  @ManyToMany
  @JoinTable(
      name = "tb_user_role",
      joinColumns = @JoinColumn (name="user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  Set<Role> roles = new HashSet<>();

  @OneToMany(mappedBy = "user")
  List<Notifications> notifications = new ArrayList<>();

  public User() {
  }

  public User(Long id, String name, String email, String password, String phone, LocalDate birthDate, Set<Role> roles) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.birthDate = birthDate;
    this.roles = roles;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public List<Notifications> getNotifications() {
    return notifications;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;
    return Objects.equals(id, user.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
