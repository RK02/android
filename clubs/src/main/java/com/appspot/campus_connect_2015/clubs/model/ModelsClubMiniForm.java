/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-10-11 at 08:41:11 UTC 
 * Modify at your own risk.
 */

package com.appspot.campus_connect_2015.clubs.model;

/**
 * Model definition for ModelsClubMiniForm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsClubMiniForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abbreviation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String admin;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("club_id")
  private java.lang.String clubId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collegeName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String followers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String members;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAbbreviation() {
    return abbreviation;
  }

  /**
   * @param abbreviation abbreviation or {@code null} for none
   */
  public ModelsClubMiniForm setAbbreviation(java.lang.String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAdmin() {
    return admin;
  }

  /**
   * @param admin admin or {@code null} for none
   */
  public ModelsClubMiniForm setAdmin(java.lang.String admin) {
    this.admin = admin;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClubId() {
    return clubId;
  }

  /**
   * @param clubId clubId or {@code null} for none
   */
  public ModelsClubMiniForm setClubId(java.lang.String clubId) {
    this.clubId = clubId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCollegeName() {
    return collegeName;
  }

  /**
   * @param collegeName collegeName or {@code null} for none
   */
  public ModelsClubMiniForm setCollegeName(java.lang.String collegeName) {
    this.collegeName = collegeName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ModelsClubMiniForm setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFollowers() {
    return followers;
  }

  /**
   * @param followers followers or {@code null} for none
   */
  public ModelsClubMiniForm setFollowers(java.lang.String followers) {
    this.followers = followers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMembers() {
    return members;
  }

  /**
   * @param members members or {@code null} for none
   */
  public ModelsClubMiniForm setMembers(java.lang.String members) {
    this.members = members;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ModelsClubMiniForm setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ModelsClubMiniForm set(String fieldName, Object value) {
    return (ModelsClubMiniForm) super.set(fieldName, value);
  }

  @Override
  public ModelsClubMiniForm clone() {
    return (ModelsClubMiniForm) super.clone();
  }

}
