/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetSatellite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSatelliteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When a satellite was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * When a satellite was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     */
    private Integer noradSatelliteID;
    /**
     * <p>
     * ARN of a satellite.
     * </p>
     */
    private String satelliteArn;
    /**
     * <p>
     * UUID of a satellite.
     * </p>
     */
    private String satelliteId;
    /**
     * <p>
     * Tags assigned to a satellite.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * When a satellite was created.
     * </p>
     * 
     * @param dateCreated
     *        When a satellite was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * When a satellite was created.
     * </p>
     * 
     * @return When a satellite was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * When a satellite was created.
     * </p>
     * 
     * @param dateCreated
     *        When a satellite was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSatelliteResult withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * When a satellite was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        When a satellite was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When a satellite was last updated.
     * </p>
     * 
     * @return When a satellite was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * When a satellite was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        When a satellite was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSatelliteResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @param noradSatelliteID
     *        NORAD satellite ID number.
     */

    public void setNoradSatelliteID(Integer noradSatelliteID) {
        this.noradSatelliteID = noradSatelliteID;
    }

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @return NORAD satellite ID number.
     */

    public Integer getNoradSatelliteID() {
        return this.noradSatelliteID;
    }

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @param noradSatelliteID
     *        NORAD satellite ID number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSatelliteResult withNoradSatelliteID(Integer noradSatelliteID) {
        setNoradSatelliteID(noradSatelliteID);
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

    public GetSatelliteResult withSatelliteArn(String satelliteArn) {
        setSatelliteArn(satelliteArn);
        return this;
    }

    /**
     * <p>
     * UUID of a satellite.
     * </p>
     * 
     * @param satelliteId
     *        UUID of a satellite.
     */

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * <p>
     * UUID of a satellite.
     * </p>
     * 
     * @return UUID of a satellite.
     */

    public String getSatelliteId() {
        return this.satelliteId;
    }

    /**
     * <p>
     * UUID of a satellite.
     * </p>
     * 
     * @param satelliteId
     *        UUID of a satellite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSatelliteResult withSatelliteId(String satelliteId) {
        setSatelliteId(satelliteId);
        return this;
    }

    /**
     * <p>
     * Tags assigned to a satellite.
     * </p>
     * 
     * @return Tags assigned to a satellite.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to a satellite.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a satellite.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to a satellite.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a satellite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSatelliteResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public GetSatelliteResult addTagsEntry(String key, String value) {
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

    public GetSatelliteResult clearTagsEntries() {
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
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getNoradSatelliteID() != null)
            sb.append("NoradSatelliteID: ").append(getNoradSatelliteID()).append(",");
        if (getSatelliteArn() != null)
            sb.append("SatelliteArn: ").append(getSatelliteArn()).append(",");
        if (getSatelliteId() != null)
            sb.append("SatelliteId: ").append(getSatelliteId()).append(",");
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

        if (obj instanceof GetSatelliteResult == false)
            return false;
        GetSatelliteResult other = (GetSatelliteResult) obj;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getNoradSatelliteID() == null ^ this.getNoradSatelliteID() == null)
            return false;
        if (other.getNoradSatelliteID() != null && other.getNoradSatelliteID().equals(this.getNoradSatelliteID()) == false)
            return false;
        if (other.getSatelliteArn() == null ^ this.getSatelliteArn() == null)
            return false;
        if (other.getSatelliteArn() != null && other.getSatelliteArn().equals(this.getSatelliteArn()) == false)
            return false;
        if (other.getSatelliteId() == null ^ this.getSatelliteId() == null)
            return false;
        if (other.getSatelliteId() != null && other.getSatelliteId().equals(this.getSatelliteId()) == false)
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

        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getNoradSatelliteID() == null) ? 0 : getNoradSatelliteID().hashCode());
        hashCode = prime * hashCode + ((getSatelliteArn() == null) ? 0 : getSatelliteArn().hashCode());
        hashCode = prime * hashCode + ((getSatelliteId() == null) ? 0 : getSatelliteId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetSatelliteResult clone() {
        try {
            return (GetSatelliteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
