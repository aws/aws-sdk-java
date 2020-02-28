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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ReserveContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReserveContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * End time of a contact.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Name of a ground station.
     * </p>
     */
    private String groundStation;
    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     */
    private String missionProfileArn;
    /**
     * <p>
     * ARN of a satellite
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

    public ReserveContactRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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

    public ReserveContactRequest withGroundStation(String groundStation) {
        setGroundStation(groundStation);
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

    public ReserveContactRequest withMissionProfileArn(String missionProfileArn) {
        setMissionProfileArn(missionProfileArn);
        return this;
    }

    /**
     * <p>
     * ARN of a satellite
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite
     */

    public void setSatelliteArn(String satelliteArn) {
        this.satelliteArn = satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite
     * </p>
     * 
     * @return ARN of a satellite
     */

    public String getSatelliteArn() {
        return this.satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReserveContactRequest withSatelliteArn(String satelliteArn) {
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

    public ReserveContactRequest withStartTime(java.util.Date startTime) {
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

    public ReserveContactRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ReserveContactRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReserveContactRequest addTagsEntry(String key, String value) {
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

    public ReserveContactRequest clearTagsEntries() {
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getGroundStation() != null)
            sb.append("GroundStation: ").append(getGroundStation()).append(",");
        if (getMissionProfileArn() != null)
            sb.append("MissionProfileArn: ").append(getMissionProfileArn()).append(",");
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

        if (obj instanceof ReserveContactRequest == false)
            return false;
        ReserveContactRequest other = (ReserveContactRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getGroundStation() == null ^ this.getGroundStation() == null)
            return false;
        if (other.getGroundStation() != null && other.getGroundStation().equals(this.getGroundStation()) == false)
            return false;
        if (other.getMissionProfileArn() == null ^ this.getMissionProfileArn() == null)
            return false;
        if (other.getMissionProfileArn() != null && other.getMissionProfileArn().equals(this.getMissionProfileArn()) == false)
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

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getGroundStation() == null) ? 0 : getGroundStation().hashCode());
        hashCode = prime * hashCode + ((getMissionProfileArn() == null) ? 0 : getMissionProfileArn().hashCode());
        hashCode = prime * hashCode + ((getSatelliteArn() == null) ? 0 : getSatelliteArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ReserveContactRequest clone() {
        return (ReserveContactRequest) super.clone();
    }

}
