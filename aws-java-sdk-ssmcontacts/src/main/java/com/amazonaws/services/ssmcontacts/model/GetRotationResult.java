/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetRotation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRotationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation.
     * </p>
     */
    private String rotationArn;
    /**
     * <p>
     * The name of the on-call rotation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * </p>
     */
    private java.util.List<String> contactIds;
    /**
     * <p>
     * The specified start time for the on-call rotation.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     */
    private String timeZoneId;
    /**
     * <p>
     * Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     * </p>
     */
    private RecurrenceSettings recurrence;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the on-call rotation.
     */

    public void setRotationArn(String rotationArn) {
        this.rotationArn = rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the on-call rotation.
     */

    public String getRotationArn() {
        return this.rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withRotationArn(String rotationArn) {
        setRotationArn(rotationArn);
        return this;
    }

    /**
     * <p>
     * The name of the on-call rotation.
     * </p>
     * 
     * @param name
     *        The name of the on-call rotation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the on-call rotation.
     * </p>
     * 
     * @return The name of the on-call rotation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the on-call rotation.
     * </p>
     * 
     * @param name
     *        The name of the on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     */

    public java.util.List<String> getContactIds() {
        return contactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     */

    public void setContactIds(java.util.Collection<String> contactIds) {
        if (contactIds == null) {
            this.contactIds = null;
            return;
        }

        this.contactIds = new java.util.ArrayList<String>(contactIds);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactIds(java.util.Collection)} or {@link #withContactIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withContactIds(String... contactIds) {
        if (this.contactIds == null) {
            setContactIds(new java.util.ArrayList<String>(contactIds.length));
        }
        for (String ele : contactIds) {
            this.contactIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withContactIds(java.util.Collection<String> contactIds) {
        setContactIds(contactIds);
        return this;
    }

    /**
     * <p>
     * The specified start time for the on-call rotation.
     * </p>
     * 
     * @param startTime
     *        The specified start time for the on-call rotation.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The specified start time for the on-call rotation.
     * </p>
     * 
     * @return The specified start time for the on-call rotation.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The specified start time for the on-call rotation.
     * </p>
     * 
     * @param startTime
     *        The specified start time for the on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA)
     *        format.
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     * 
     * @return The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA)
     *         format.
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA)
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     */

    public void setRecurrence(RecurrenceSettings recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @return Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     */

    public RecurrenceSettings getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Specifies how long a rotation lasts before restarting at the beginning of the shift order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationResult withRecurrence(RecurrenceSettings recurrence) {
        setRecurrence(recurrence);
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
        if (getRotationArn() != null)
            sb.append("RotationArn: ").append(getRotationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContactIds() != null)
            sb.append("ContactIds: ").append(getContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRotationResult == false)
            return false;
        GetRotationResult other = (GetRotationResult) obj;
        if (other.getRotationArn() == null ^ this.getRotationArn() == null)
            return false;
        if (other.getRotationArn() != null && other.getRotationArn().equals(this.getRotationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContactIds() == null ^ this.getContactIds() == null)
            return false;
        if (other.getContactIds() != null && other.getContactIds().equals(this.getContactIds()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationArn() == null) ? 0 : getRotationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContactIds() == null) ? 0 : getContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public GetRotationResult clone() {
        try {
            return (GetRotationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
