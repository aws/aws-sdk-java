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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Qualification data structure represents a Qualification assigned to a user, including the Qualification type and
 * the value (score).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/Qualification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Qualification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Qualification type for the Qualification.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The ID of the Worker who possesses the Qualification.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and
     * then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the
     * AcceptQualificationRequest operation.
     * </p>
     */
    private java.util.Date grantTime;
    /**
     * <p>
     * The value (score) of the Qualification, if the Qualification has an integer value.
     * </p>
     */
    private Integer integerValue;

    private Locale localeValue;
    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the Qualification type for the Qualification.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type for the Qualification.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type for the Qualification.
     * </p>
     * 
     * @return The ID of the Qualification type for the Qualification.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type for the Qualification.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type for the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualification withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who possesses the Qualification.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification.
     * </p>
     * 
     * @return The ID of the Worker who possesses the Qualification.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who possesses the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualification withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and
     * then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the
     * AcceptQualificationRequest operation.
     * </p>
     * 
     * @param grantTime
     *        The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked,
     *        and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call
     *        to the AcceptQualificationRequest operation.
     */

    public void setGrantTime(java.util.Date grantTime) {
        this.grantTime = grantTime;
    }

    /**
     * <p>
     * The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and
     * then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the
     * AcceptQualificationRequest operation.
     * </p>
     * 
     * @return The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked,
     *         and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call
     *         to the AcceptQualificationRequest operation.
     */

    public java.util.Date getGrantTime() {
        return this.grantTime;
    }

    /**
     * <p>
     * The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and
     * then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the
     * AcceptQualificationRequest operation.
     * </p>
     * 
     * @param grantTime
     *        The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked,
     *        and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call
     *        to the AcceptQualificationRequest operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualification withGrantTime(java.util.Date grantTime) {
        setGrantTime(grantTime);
        return this;
    }

    /**
     * <p>
     * The value (score) of the Qualification, if the Qualification has an integer value.
     * </p>
     * 
     * @param integerValue
     *        The value (score) of the Qualification, if the Qualification has an integer value.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The value (score) of the Qualification, if the Qualification has an integer value.
     * </p>
     * 
     * @return The value (score) of the Qualification, if the Qualification has an integer value.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The value (score) of the Qualification, if the Qualification has an integer value.
     * </p>
     * 
     * @param integerValue
     *        The value (score) of the Qualification, if the Qualification has an integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualification withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * @param localeValue
     */

    public void setLocaleValue(Locale localeValue) {
        this.localeValue = localeValue;
    }

    /**
     * @return
     */

    public Locale getLocaleValue() {
        return this.localeValue;
    }

    /**
     * @param localeValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualification withLocaleValue(Locale localeValue) {
        setLocaleValue(localeValue);
        return this;
    }

    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     * 
     * @param status
     *        The status of the Qualification. Valid values are Granted | Revoked.
     * @see QualificationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     * 
     * @return The status of the Qualification. Valid values are Granted | Revoked.
     * @see QualificationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     * 
     * @param status
     *        The status of the Qualification. Valid values are Granted | Revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationStatus
     */

    public Qualification withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     * 
     * @param status
     *        The status of the Qualification. Valid values are Granted | Revoked.
     * @see QualificationStatus
     */

    public void setStatus(QualificationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the Qualification. Valid values are Granted | Revoked.
     * </p>
     * 
     * @param status
     *        The status of the Qualification. Valid values are Granted | Revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationStatus
     */

    public Qualification withStatus(QualificationStatus status) {
        this.status = status.toString();
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getGrantTime() != null)
            sb.append("GrantTime: ").append(getGrantTime()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getLocaleValue() != null)
            sb.append("LocaleValue: ").append(getLocaleValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Qualification == false)
            return false;
        Qualification other = (Qualification) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getGrantTime() == null ^ this.getGrantTime() == null)
            return false;
        if (other.getGrantTime() != null && other.getGrantTime().equals(this.getGrantTime()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getLocaleValue() == null ^ this.getLocaleValue() == null)
            return false;
        if (other.getLocaleValue() != null && other.getLocaleValue().equals(this.getLocaleValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getGrantTime() == null) ? 0 : getGrantTime().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getLocaleValue() == null) ? 0 : getLocaleValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Qualification clone() {
        try {
            return (Qualification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.QualificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
