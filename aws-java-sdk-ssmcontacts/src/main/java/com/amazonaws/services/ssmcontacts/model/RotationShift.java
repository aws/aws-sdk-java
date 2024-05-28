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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a shift that belongs to an on-call rotation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/RotationShift" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotationShift implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * </p>
     */
    private java.util.List<String> contactIds;
    /**
     * <p>
     * The time a shift rotation begins.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time a shift rotation ends.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The type of shift rotation.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Additional information about an on-call rotation shift.
     * </p>
     */
    private ShiftDetails shiftDetails;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     */

    public java.util.List<String> getContactIds() {
        return contactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
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
     * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactIds(java.util.Collection)} or {@link #withContactIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationShift withContactIds(String... contactIds) {
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
     * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationShift withContactIds(java.util.Collection<String> contactIds) {
        setContactIds(contactIds);
        return this;
    }

    /**
     * <p>
     * The time a shift rotation begins.
     * </p>
     * 
     * @param startTime
     *        The time a shift rotation begins.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time a shift rotation begins.
     * </p>
     * 
     * @return The time a shift rotation begins.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time a shift rotation begins.
     * </p>
     * 
     * @param startTime
     *        The time a shift rotation begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationShift withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time a shift rotation ends.
     * </p>
     * 
     * @param endTime
     *        The time a shift rotation ends.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time a shift rotation ends.
     * </p>
     * 
     * @return The time a shift rotation ends.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time a shift rotation ends.
     * </p>
     * 
     * @param endTime
     *        The time a shift rotation ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationShift withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The type of shift rotation.
     * </p>
     * 
     * @param type
     *        The type of shift rotation.
     * @see ShiftType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of shift rotation.
     * </p>
     * 
     * @return The type of shift rotation.
     * @see ShiftType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of shift rotation.
     * </p>
     * 
     * @param type
     *        The type of shift rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShiftType
     */

    public RotationShift withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of shift rotation.
     * </p>
     * 
     * @param type
     *        The type of shift rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShiftType
     */

    public RotationShift withType(ShiftType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about an on-call rotation shift.
     * </p>
     * 
     * @param shiftDetails
     *        Additional information about an on-call rotation shift.
     */

    public void setShiftDetails(ShiftDetails shiftDetails) {
        this.shiftDetails = shiftDetails;
    }

    /**
     * <p>
     * Additional information about an on-call rotation shift.
     * </p>
     * 
     * @return Additional information about an on-call rotation shift.
     */

    public ShiftDetails getShiftDetails() {
        return this.shiftDetails;
    }

    /**
     * <p>
     * Additional information about an on-call rotation shift.
     * </p>
     * 
     * @param shiftDetails
     *        Additional information about an on-call rotation shift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotationShift withShiftDetails(ShiftDetails shiftDetails) {
        setShiftDetails(shiftDetails);
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
        if (getContactIds() != null)
            sb.append("ContactIds: ").append(getContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getShiftDetails() != null)
            sb.append("ShiftDetails: ").append(getShiftDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotationShift == false)
            return false;
        RotationShift other = (RotationShift) obj;
        if (other.getContactIds() == null ^ this.getContactIds() == null)
            return false;
        if (other.getContactIds() != null && other.getContactIds().equals(this.getContactIds()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getShiftDetails() == null ^ this.getShiftDetails() == null)
            return false;
        if (other.getShiftDetails() != null && other.getShiftDetails().equals(this.getShiftDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactIds() == null) ? 0 : getContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getShiftDetails() == null) ? 0 : getShiftDetails().hashCode());
        return hashCode;
    }

    @Override
    public RotationShift clone() {
        try {
            return (RotationShift) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.RotationShiftMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
