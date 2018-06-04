package edu.cnm.deepdive.codebreaker.models;

import com.google.gson.annotations.Expose;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Game {

  @Expose(deserialize = true, serialize = false) // receive only
  private UUID id;
  @Expose(deserialize = true, serialize = false)
  private URI href;
  @Expose(deserialize = true, serialize = false)
  private Date created;
  @Expose // send and receive 
  private Integer length;
  @Expose
  private String characters;
  @Expose
  private Boolean repettitionAllowed;
  @Expose(deserialize = true, serialize = false)
  private boolean surrendered;
  @Expose(deserialize = true, serialize = false)
  private boolean solved;
  private String code;
  @Expose(deserialize = true, serialize = false)
  private List<Guess> guesses;


  public URI getHref() {
    return href;
  }

  public Date getCreated() {
    return created;
  }

  public void setLength(Integer length) {
    this.length = length;
  }
  public Integer getLength() {
    return length;
  }



  public void setCharacters(String characters) {
    this.characters = characters;
  }

  public String getCharacters() {
    return characters;
  }

  public void setRepettitionAllowed(Boolean repettitionAllowed) {
    this.repettitionAllowed = repettitionAllowed;
  }

  public Boolean getRepettitionAllowed() {
    return repettitionAllowed;
  }

  public boolean isSolved() {
    return solved;
  }

  public String getCode() {
    return code;
  }

  public List<Guess> getGuesses() {
    return guesses;
  }
}
