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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Maximum number of contacts returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     */
    private String missionProfileArn;
    /**
     * <p>
     * Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     */
    private String nextToken;
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
     * Status of a contact reservation.
     * </p>
     */
    private java.util.List<String> statusList;

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

    public ListContactsRequest withEndTime(java.util.Date endTime) {
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

    public ListContactsRequest withGroundStation(String groundStation) {
        setGroundStation(groundStation);
        return this;
    }

    /**
     * <p>
     * Maximum number of contacts returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of contacts returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of contacts returned.
     * </p>
     * 
     * @return Maximum number of contacts returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of contacts returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of contacts returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListContactsRequest withMissionProfileArn(String missionProfileArn) {
        setMissionProfileArn(missionProfileArn);
        return this;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page
     *        of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @return Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the request of a previous <code>ListContacts</code> call. Used to get the next page
     *        of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListContactsRequest withSatelliteArn(String satelliteArn) {
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

    public ListContactsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Status of a contact reservation.
     * </p>
     * 
     * @return Status of a contact reservation.
     * @see ContactStatus
     */

    public java.util.List<String> getStatusList() {
        return statusList;
    }

    /**
     * <p>
     * Status of a contact reservation.
     * </p>
     * 
     * @param statusList
     *        Status of a contact reservation.
     * @see ContactStatus
     */

    public void setStatusList(java.util.Collection<String> statusList) {
        if (statusList == null) {
            this.statusList = null;
            return;
        }

        this.statusList = new java.util.ArrayList<String>(statusList);
    }

    /**
     * <p>
     * Status of a contact reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusList(java.util.Collection)} or {@link #withStatusList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusList
     *        Status of a contact reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactStatus
     */

    public ListContactsRequest withStatusList(String... statusList) {
        if (this.statusList == null) {
            setStatusList(new java.util.ArrayList<String>(statusList.length));
        }
        for (String ele : statusList) {
            this.statusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status of a contact reservation.
     * </p>
     * 
     * @param statusList
     *        Status of a contact reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactStatus
     */

    public ListContactsRequest withStatusList(java.util.Collection<String> statusList) {
        setStatusList(statusList);
        return this;
    }

    /**
     * <p>
     * Status of a contact reservation.
     * </p>
     * 
     * @param statusList
     *        Status of a contact reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactStatus
     */

    public ListContactsRequest withStatusList(ContactStatus... statusList) {
        java.util.ArrayList<String> statusListCopy = new java.util.ArrayList<String>(statusList.length);
        for (ContactStatus value : statusList) {
            statusListCopy.add(value.toString());
        }
        if (getStatusList() == null) {
            setStatusList(statusListCopy);
        } else {
            getStatusList().addAll(statusListCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMissionProfileArn() != null)
            sb.append("MissionProfileArn: ").append(getMissionProfileArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSatelliteArn() != null)
            sb.append("SatelliteArn: ").append(getSatelliteArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatusList() != null)
            sb.append("StatusList: ").append(getStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactsRequest == false)
            return false;
        ListContactsRequest other = (ListContactsRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getGroundStation() == null ^ this.getGroundStation() == null)
            return false;
        if (other.getGroundStation() != null && other.getGroundStation().equals(this.getGroundStation()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMissionProfileArn() == null ^ this.getMissionProfileArn() == null)
            return false;
        if (other.getMissionProfileArn() != null && other.getMissionProfileArn().equals(this.getMissionProfileArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSatelliteArn() == null ^ this.getSatelliteArn() == null)
            return false;
        if (other.getSatelliteArn() != null && other.getSatelliteArn().equals(this.getSatelliteArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatusList() == null ^ this.getStatusList() == null)
            return false;
        if (other.getStatusList() != null && other.getStatusList().equals(this.getStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getGroundStation() == null) ? 0 : getGroundStation().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMissionProfileArn() == null) ? 0 : getMissionProfileArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSatelliteArn() == null) ? 0 : getSatelliteArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatusList() == null) ? 0 : getStatusList().hashCode());
        return hashCode;
    }

    @Override
    public ListContactsRequest clone() {
        return (ListContactsRequest) super.clone();
    }

}
