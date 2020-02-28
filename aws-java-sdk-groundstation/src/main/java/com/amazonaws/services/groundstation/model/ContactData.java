/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data describing a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ContactData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * UUID of a contact.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * Status of a contact.
     * </p>
     */
    private String contactStatus;
    /**
     * <p>
     * End time of a contact.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Error message of a contact.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Name of a ground station.
     * </p>
     */
    private String groundStation;
    /**
     * <p>
     * Maximum elevation angle of a contact.
     * </p>
     */
    private Elevation maximumElevation;
    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     */
    private String missionProfileArn;
    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     */
    private java.util.Date postPassEndTime;
    /**
     * <p>
     * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
     * </p>
     */
    private java.util.Date prePassStartTime;
    /**
     * <p>
     * Region of a contact.
     * </p>
     */
    private String region;
    /**
     * <p>
     * ARN of a satellite.
     * </p>
     */
    private String satelliteArn;
    /**
     * <p>
     * Start time of a contact.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Tags assigned to a contact.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * UUID of a contact.
     * </p>
     * 
     * @param contactId
     *        UUID of a contact.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * UUID of a contact.
     * </p>
     * 
     * @return UUID of a contact.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * UUID of a contact.
     * </p>
     * 
     * @param contactId
     *        UUID of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * Status of a contact.
     * </p>
     * 
     * @param contactStatus
     *        Status of a contact.
     * @see ContactStatus
     */

    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    /**
     * <p>
     * Status of a contact.
     * </p>
     * 
     * @return Status of a contact.
     * @see ContactStatus
     */

    public String getContactStatus() {
        return this.contactStatus;
    }

    /**
     * <p>
     * Status of a contact.
     * </p>
     * 
     * @param contactStatus
     *        Status of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactStatus
     */

    public ContactData withContactStatus(String contactStatus) {
        setContactStatus(contactStatus);
        return this;
    }

    /**
     * <p>
     * Status of a contact.
     * </p>
     * 
     * @param contactStatus
     *        Status of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactStatus
     */

    public ContactData withContactStatus(ContactStatus contactStatus) {
        this.contactStatus = contactStatus.toString();
        return this;
    }

    /**
     * <p>
     * End time of a contact.
     * </p>
     * 
     * @param endTime
     *        End time of a contact.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * End time of a contact.
     * </p>
     * 
     * @return End time of a contact.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * End time of a contact.
     * </p>
     * 
     * @param endTime
     *        End time of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Error message of a contact.
     * </p>
     * 
     * @param errorMessage
     *        Error message of a contact.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Error message of a contact.
     * </p>
     * 
     * @return Error message of a contact.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Error message of a contact.
     * </p>
     * 
     * @param errorMessage
     *        Error message of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @param groundStation
     *        Name of a ground station.
     */

    public void setGroundStation(String groundStation) {
        this.groundStation = groundStation;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @return Name of a ground station.
     */

    public String getGroundStation() {
        return this.groundStation;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @param groundStation
     *        Name of a ground station.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withGroundStation(String groundStation) {
        setGroundStation(groundStation);
        return this;
    }

    /**
     * <p>
     * Maximum elevation angle of a contact.
     * </p>
     * 
     * @param maximumElevation
     *        Maximum elevation angle of a contact.
     */

    public void setMaximumElevation(Elevation maximumElevation) {
        this.maximumElevation = maximumElevation;
    }

    /**
     * <p>
     * Maximum elevation angle of a contact.
     * </p>
     * 
     * @return Maximum elevation angle of a contact.
     */

    public Elevation getMaximumElevation() {
        return this.maximumElevation;
    }

    /**
     * <p>
     * Maximum elevation angle of a contact.
     * </p>
     * 
     * @param maximumElevation
     *        Maximum elevation angle of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withMaximumElevation(Elevation maximumElevation) {
        setMaximumElevation(maximumElevation);
        return this;
    }

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @param missionProfileArn
     *        ARN of a mission profile.
     */

    public void setMissionProfileArn(String missionProfileArn) {
        this.missionProfileArn = missionProfileArn;
    }

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @return ARN of a mission profile.
     */

    public String getMissionProfileArn() {
        return this.missionProfileArn;
    }

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @param missionProfileArn
     *        ARN of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withMissionProfileArn(String missionProfileArn) {
        setMissionProfileArn(missionProfileArn);
        return this;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param postPassEndTime
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     */

    public void setPostPassEndTime(java.util.Date postPassEndTime) {
        this.postPassEndTime = postPassEndTime;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @return Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *         finished.
     */

    public java.util.Date getPostPassEndTime() {
        return this.postPassEndTime;
    }

    /**
     * <p>
     * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     * finished.
     * </p>
     * 
     * @param postPassEndTime
     *        Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has
     *        finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withPostPassEndTime(java.util.Date postPassEndTime) {
        setPostPassEndTime(postPassEndTime);
        return this;
    }

    /**
     * <p>
     * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
     * </p>
     * 
     * @param prePassStartTime
     *        Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming
     *        pass.
     */

    public void setPrePassStartTime(java.util.Date prePassStartTime) {
        this.prePassStartTime = prePassStartTime;
    }

    /**
     * <p>
     * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
     * </p>
     * 
     * @return Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming
     *         pass.
     */

    public java.util.Date getPrePassStartTime() {
        return this.prePassStartTime;
    }

    /**
     * <p>
     * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
     * </p>
     * 
     * @param prePassStartTime
     *        Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming
     *        pass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withPrePassStartTime(java.util.Date prePassStartTime) {
        setPrePassStartTime(prePassStartTime);
        return this;
    }

    /**
     * <p>
     * Region of a contact.
     * </p>
     * 
     * @param region
     *        Region of a contact.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Region of a contact.
     * </p>
     * 
     * @return Region of a contact.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Region of a contact.
     * </p>
     * 
     * @param region
     *        Region of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite.
     */

    public void setSatelliteArn(String satelliteArn) {
        this.satelliteArn = satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @return ARN of a satellite.
     */

    public String getSatelliteArn() {
        return this.satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withSatelliteArn(String satelliteArn) {
        setSatelliteArn(satelliteArn);
        return this;
    }

    /**
     * <p>
     * Start time of a contact.
     * </p>
     * 
     * @param startTime
     *        Start time of a contact.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Start time of a contact.
     * </p>
     * 
     * @return Start time of a contact.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Start time of a contact.
     * </p>
     * 
     * @param startTime
     *        Start time of a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Tags assigned to a contact.
     * </p>
     * 
     * @return Tags assigned to a contact.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to a contact.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a contact.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to a contact.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ContactData#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContactData addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getContactStatus() != null)
            sb.append("ContactStatus: ").append(getContactStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getGroundStation() != null)
            sb.append("GroundStation: ").append(getGroundStation()).append(",");
        if (getMaximumElevation() != null)
            sb.append("MaximumElevation: ").append(getMaximumElevation()).append(",");
        if (getMissionProfileArn() != null)
            sb.append("MissionProfileArn: ").append(getMissionProfileArn()).append(",");
        if (getPostPassEndTime() != null)
            sb.append("PostPassEndTime: ").append(getPostPassEndTime()).append(",");
        if (getPrePassStartTime() != null)
            sb.append("PrePassStartTime: ").append(getPrePassStartTime()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getSatelliteArn() != null)
            sb.append("SatelliteArn: ").append(getSatelliteArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactData == false)
            return false;
        ContactData other = (ContactData) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getContactStatus() == null ^ this.getContactStatus() == null)
            return false;
        if (other.getContactStatus() != null && other.getContactStatus().equals(this.getContactStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getGroundStation() == null ^ this.getGroundStation() == null)
            return false;
        if (other.getGroundStation() != null && other.getGroundStation().equals(this.getGroundStation()) == false)
            return false;
        if (other.getMaximumElevation() == null ^ this.getMaximumElevation() == null)
            return false;
        if (other.getMaximumElevation() != null && other.getMaximumElevation().equals(this.getMaximumElevation()) == false)
            return false;
        if (other.getMissionProfileArn() == null ^ this.getMissionProfileArn() == null)
            return false;
        if (other.getMissionProfileArn() != null && other.getMissionProfileArn().equals(this.getMissionProfileArn()) == false)
            return false;
        if (other.getPostPassEndTime() == null ^ this.getPostPassEndTime() == null)
            return false;
        if (other.getPostPassEndTime() != null && other.getPostPassEndTime().equals(this.getPostPassEndTime()) == false)
            return false;
        if (other.getPrePassStartTime() == null ^ this.getPrePassStartTime() == null)
            return false;
        if (other.getPrePassStartTime() != null && other.getPrePassStartTime().equals(this.getPrePassStartTime()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSatelliteArn() == null ^ this.getSatelliteArn() == null)
            return false;
        if (other.getSatelliteArn() != null && other.getSatelliteArn().equals(this.getSatelliteArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getContactStatus() == null) ? 0 : getContactStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getGroundStation() == null) ? 0 : getGroundStation().hashCode());
        hashCode = prime * hashCode + ((getMaximumElevation() == null) ? 0 : getMaximumElevation().hashCode());
        hashCode = prime * hashCode + ((getMissionProfileArn() == null) ? 0 : getMissionProfileArn().hashCode());
        hashCode = prime * hashCode + ((getPostPassEndTime() == null) ? 0 : getPostPassEndTime().hashCode());
        hashCode = prime * hashCode + ((getPrePassStartTime() == null) ? 0 : getPrePassStartTime().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSatelliteArn() == null) ? 0 : getSatelliteArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ContactData clone() {
        try {
            return (ContactData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.ContactDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
