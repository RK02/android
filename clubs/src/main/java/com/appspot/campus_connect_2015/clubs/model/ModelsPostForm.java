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
 * Model definition for ModelsPostForm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsPostForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("from_pid")
  private java.lang.String fromPid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String likers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String likes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String views;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ModelsPostForm setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFromPid() {
    return fromPid;
  }

  /**
   * @param fromPid fromPid or {@code null} for none
   */
  public ModelsPostForm setFromPid(java.lang.String fromPid) {
    this.fromPid = fromPid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLikers() {
    return likers;
  }

  /**
   * @param likers likers or {@code null} for none
   */
  public ModelsPostForm setLikers(java.lang.String likers) {
    this.likers = likers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLikes() {
    return likes;
  }

  /**
   * @param likes likes or {@code null} for none
   */
  public ModelsPostForm setLikes(java.lang.String likes) {
    this.likes = likes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoto() {
    return photo;
  }

  /**
   * @param photo photo or {@code null} for none
   */
  public ModelsPostForm setPhoto(java.lang.String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public ModelsPostForm setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getViews() {
    return views;
  }

  /**
   * @param views views or {@code null} for none
   */
  public ModelsPostForm setViews(java.lang.String views) {
    this.views = views;
    return this;
  }

  @Override
  public ModelsPostForm set(String fieldName, Object value) {
    return (ModelsPostForm) super.set(fieldName, value);
  }

  @Override
  public ModelsPostForm clone() {
    return (ModelsPostForm) super.clone();
  }

}
