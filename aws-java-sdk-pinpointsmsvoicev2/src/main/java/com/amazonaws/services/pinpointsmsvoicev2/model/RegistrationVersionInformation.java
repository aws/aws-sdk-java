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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the specified version of the registration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationVersionInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationVersionInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the registration.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAFT</code>: The initial status of a registration version after it’s created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code>: Your registration has been approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVOKED</code>: Your previously approved registration has been revoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more recently
     * submitted version is approved.
     * </p>
     * </li>
     * </ul>
     */
    private String registrationVersionStatus;
    /**
     * <p>
     * The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations status
     * changes.
     * </p>
     */
    private RegistrationVersionStatusHistory registrationVersionStatusHistory;
    /**
     * <p>
     * An array of RegistrationDeniedReasonInformation objects.
     * </p>
     */
    private java.util.List<RegistrationDeniedReasonInformation> deniedReasons;

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @return The version number of the registration.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionInformation withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAFT</code>: The initial status of a registration version after it’s created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code>: Your registration has been approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVOKED</code>: Your previously approved registration has been revoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more recently
     * submitted version is approved.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationVersionStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAFT</code>: The initial status of a registration version after it’s created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code>: Your registration has been approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVOKED</code>: Your previously approved registration has been revoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more
     *        recently submitted version is approved.
     *        </p>
     *        </li>
     * @see RegistrationVersionStatus
     */

    public void setRegistrationVersionStatus(String registrationVersionStatus) {
        this.registrationVersionStatus = registrationVersionStatus;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAFT</code>: The initial status of a registration version after it’s created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code>: Your registration has been approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVOKED</code>: Your previously approved registration has been revoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more recently
     * submitted version is approved.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the registration.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRAFT</code>: The initial status of a registration version after it’s created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBMITTED</code>: Your registration has been submitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPROVED</code>: Your registration has been approved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new
     *         version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DENIED</code>: You must fix your registration and resubmit it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REVOKED</code>: Your previously approved registration has been revoked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more
     *         recently submitted version is approved.
     *         </p>
     *         </li>
     * @see RegistrationVersionStatus
     */

    public String getRegistrationVersionStatus() {
        return this.registrationVersionStatus;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAFT</code>: The initial status of a registration version after it’s created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code>: Your registration has been approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVOKED</code>: Your previously approved registration has been revoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more recently
     * submitted version is approved.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationVersionStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAFT</code>: The initial status of a registration version after it’s created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code>: Your registration has been approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVOKED</code>: Your previously approved registration has been revoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more
     *        recently submitted version is approved.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationVersionStatus
     */

    public RegistrationVersionInformation withRegistrationVersionStatus(String registrationVersionStatus) {
        setRegistrationVersionStatus(registrationVersionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAFT</code>: The initial status of a registration version after it’s created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code>: Your registration has been approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVOKED</code>: Your previously approved registration has been revoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more recently
     * submitted version is approved.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationVersionStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAFT</code>: The initial status of a registration version after it’s created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code>: Your registration has been approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCARDED</code>: You've abandon this version of their registration to start over with a new
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVOKED</code>: Your previously approved registration has been revoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: Your previously approved registration version moves into this status when a more
     *        recently submitted version is approved.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationVersionStatus
     */

    public RegistrationVersionInformation withRegistrationVersionStatus(RegistrationVersionStatus registrationVersionStatus) {
        this.registrationVersionStatus = registrationVersionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations status
     * changes.
     * </p>
     * 
     * @param registrationVersionStatusHistory
     *        The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations
     *        status changes.
     */

    public void setRegistrationVersionStatusHistory(RegistrationVersionStatusHistory registrationVersionStatusHistory) {
        this.registrationVersionStatusHistory = registrationVersionStatusHistory;
    }

    /**
     * <p>
     * The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations status
     * changes.
     * </p>
     * 
     * @return The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations
     *         status changes.
     */

    public RegistrationVersionStatusHistory getRegistrationVersionStatusHistory() {
        return this.registrationVersionStatusHistory;
    }

    /**
     * <p>
     * The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations status
     * changes.
     * </p>
     * 
     * @param registrationVersionStatusHistory
     *        The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations
     *        status changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionInformation withRegistrationVersionStatusHistory(RegistrationVersionStatusHistory registrationVersionStatusHistory) {
        setRegistrationVersionStatusHistory(registrationVersionStatusHistory);
        return this;
    }

    /**
     * <p>
     * An array of RegistrationDeniedReasonInformation objects.
     * </p>
     * 
     * @return An array of RegistrationDeniedReasonInformation objects.
     */

    public java.util.List<RegistrationDeniedReasonInformation> getDeniedReasons() {
        return deniedReasons;
    }

    /**
     * <p>
     * An array of RegistrationDeniedReasonInformation objects.
     * </p>
     * 
     * @param deniedReasons
     *        An array of RegistrationDeniedReasonInformation objects.
     */

    public void setDeniedReasons(java.util.Collection<RegistrationDeniedReasonInformation> deniedReasons) {
        if (deniedReasons == null) {
            this.deniedReasons = null;
            return;
        }

        this.deniedReasons = new java.util.ArrayList<RegistrationDeniedReasonInformation>(deniedReasons);
    }

    /**
     * <p>
     * An array of RegistrationDeniedReasonInformation objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeniedReasons(java.util.Collection)} or {@link #withDeniedReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deniedReasons
     *        An array of RegistrationDeniedReasonInformation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionInformation withDeniedReasons(RegistrationDeniedReasonInformation... deniedReasons) {
        if (this.deniedReasons == null) {
            setDeniedReasons(new java.util.ArrayList<RegistrationDeniedReasonInformation>(deniedReasons.length));
        }
        for (RegistrationDeniedReasonInformation ele : deniedReasons) {
            this.deniedReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of RegistrationDeniedReasonInformation objects.
     * </p>
     * 
     * @param deniedReasons
     *        An array of RegistrationDeniedReasonInformation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionInformation withDeniedReasons(java.util.Collection<RegistrationDeniedReasonInformation> deniedReasons) {
        setDeniedReasons(deniedReasons);
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getRegistrationVersionStatus() != null)
            sb.append("RegistrationVersionStatus: ").append(getRegistrationVersionStatus()).append(",");
        if (getRegistrationVersionStatusHistory() != null)
            sb.append("RegistrationVersionStatusHistory: ").append(getRegistrationVersionStatusHistory()).append(",");
        if (getDeniedReasons() != null)
            sb.append("DeniedReasons: ").append(getDeniedReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationVersionInformation == false)
            return false;
        RegistrationVersionInformation other = (RegistrationVersionInformation) obj;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getRegistrationVersionStatus() == null ^ this.getRegistrationVersionStatus() == null)
            return false;
        if (other.getRegistrationVersionStatus() != null && other.getRegistrationVersionStatus().equals(this.getRegistrationVersionStatus()) == false)
            return false;
        if (other.getRegistrationVersionStatusHistory() == null ^ this.getRegistrationVersionStatusHistory() == null)
            return false;
        if (other.getRegistrationVersionStatusHistory() != null
                && other.getRegistrationVersionStatusHistory().equals(this.getRegistrationVersionStatusHistory()) == false)
            return false;
        if (other.getDeniedReasons() == null ^ this.getDeniedReasons() == null)
            return false;
        if (other.getDeniedReasons() != null && other.getDeniedReasons().equals(this.getDeniedReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getRegistrationVersionStatus() == null) ? 0 : getRegistrationVersionStatus().hashCode());
        hashCode = prime * hashCode + ((getRegistrationVersionStatusHistory() == null) ? 0 : getRegistrationVersionStatusHistory().hashCode());
        hashCode = prime * hashCode + ((getDeniedReasons() == null) ? 0 : getDeniedReasons().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationVersionInformation clone() {
        try {
            return (RegistrationVersionInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationVersionInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
