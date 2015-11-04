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
 * on 2015-11-04 at 07:25:36 UTC 
 * Modify at your own risk.
 */

package com.appspot.campus_connect_2015.clubs.model;

/**
 * Model definition for ModelsFeed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsFeed extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attendees;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("club_id")
  private java.lang.String clubId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clubphoto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collegeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String completed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("end_date")
  private java.lang.String endDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("end_time")
  private java.lang.String endTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("event_creator")
  private java.lang.String eventCreator;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String isAlumni;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> likers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("start_date")
  private java.lang.String startDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("start_time")
  private java.lang.String startTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tags;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String venue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String views;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttendees() {
    return attendees;
  }

  /**
   * @param attendees attendees or {@code null} for none
   */
  public ModelsFeed setAttendees(java.util.List<java.lang.String> attendees) {
    this.attendees = attendees;
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
  public ModelsFeed setClubId(java.lang.String clubId) {
    this.clubId = clubId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClubphoto() {
    return clubphoto;
  }

  /**
   * @param clubphoto clubphoto or {@code null} for none
   */
  public ModelsFeed setClubphoto(java.lang.String clubphoto) {
    this.clubphoto = clubphoto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCollegeId() {
    return collegeId;
  }

  /**
   * @param collegeId collegeId or {@code null} for none
   */
  public ModelsFeed setCollegeId(java.lang.String collegeId) {
    this.collegeId = collegeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCompleted() {
    return completed;
  }

  /**
   * @param completed completed or {@code null} for none
   */
  public ModelsFeed setCompleted(java.lang.String completed) {
    this.completed = completed;
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
  public ModelsFeed setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public ModelsFeed setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTime() {
    return endTime;
  }

  /**
   * @param endTime endTime or {@code null} for none
   */
  public ModelsFeed setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEventCreator() {
    return eventCreator;
  }

  /**
   * @param eventCreator eventCreator or {@code null} for none
   */
  public ModelsFeed setEventCreator(java.lang.String eventCreator) {
    this.eventCreator = eventCreator;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIsAlumni() {
    return isAlumni;
  }

  /**
   * @param isAlumni isAlumni or {@code null} for none
   */
  public ModelsFeed setIsAlumni(java.lang.String isAlumni) {
    this.isAlumni = isAlumni;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLikers() {
    return likers;
  }

  /**
   * @param likers likers or {@code null} for none
   */
  public ModelsFeed setLikers(java.util.List<java.lang.String> likers) {
    this.likers = likers;
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
  public ModelsFeed setPhoto(java.lang.String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPid() {
    return pid;
  }

  /**
   * @param pid pid or {@code null} for none
   */
  public ModelsFeed setPid(java.lang.String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public ModelsFeed setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * @param startTime startTime or {@code null} for none
   */
  public ModelsFeed setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTags() {
    return tags;
  }

  /**
   * @param tags tags or {@code null} for none
   */
  public ModelsFeed setTags(java.lang.String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp timestamp or {@code null} for none
   */
  public ModelsFeed setTimestamp(java.lang.String timestamp) {
    this.timestamp = timestamp;
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
  public ModelsFeed setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVenue() {
    return venue;
  }

  /**
   * @param venue venue or {@code null} for none
   */
  public ModelsFeed setVenue(java.lang.String venue) {
    this.venue = venue;
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
  public ModelsFeed setViews(java.lang.String views) {
    this.views = views;
    return this;
  }

  @Override
  public ModelsFeed set(String fieldName, Object value) {
    return (ModelsFeed) super.set(fieldName, value);
  }

  @Override
  public ModelsFeed clone() {
    return (ModelsFeed) super.clone();
  }

}
