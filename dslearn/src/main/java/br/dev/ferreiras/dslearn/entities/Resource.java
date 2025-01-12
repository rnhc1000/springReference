package br.dev.ferreiras.dslearn.entities;

import br.dev.ferreiras.dslearn.entities.enums.ResourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table (name = "tb_resource")
@JsonPropertyOrder(alphabetic = true)
public class Resource {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String description;
  private Integer position;
  private String imgUri;
  private ResourceType type;

  @ManyToOne
  @JoinColumn(name = "offer_id")
  private Offer offer;

  public Resource(Long id, String title, String description, Integer position, String imgUri, ResourceType type, Offer offer) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.position = position;
    this.imgUri = imgUri;
    this.type = type;
    this.offer = offer;
  }

  public Resource() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
  }

  public ResourceType getResourceType() {
    return type;
  }

  public void setResourceType(ResourceType type) {
    this.type = type;
  }

  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Resource resource = (Resource) o;
    return Objects.equals(id, resource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
