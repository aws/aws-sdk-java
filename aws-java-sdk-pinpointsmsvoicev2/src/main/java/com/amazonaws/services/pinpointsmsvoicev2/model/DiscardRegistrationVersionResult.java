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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DiscardRegistrationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscardRegistrationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     */
    private String registrationArn;
    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The version number of the registration.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The status of the registration version.
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
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     */

    public void setRegistrationArn(String registrationArn) {
        this.registrationArn = registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration.
     */

    public String getRegistrationArn() {
        return this.registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscardRegistrationVersionResult withRegistrationArn(String registrationArn) {
        setRegistrationArn(registrationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscardRegistrationVersionResult withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

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

    public DiscardRegistrationVersionResult withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The status of the registration version.
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
     *        The status of the registration version.</p>
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
     * The status of the registration version.
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
     * @return The status of the registration version.</p>
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
     * The status of the registration version.
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
     *        The status of the registration version.</p>
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

    public DiscardRegistrationVersionResult withRegistrationVersionStatus(String registrationVersionStatus) {
        setRegistrationVersionStatus(registrationVersionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the registration version.
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
     *        The status of the registration version.</p>
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

    public DiscardRegistrationVersionResult withRegistrationVersionStatus(RegistrationVersionStatus registrationVersionStatus) {
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

    public DiscardRegistrationVersionResult withRegistrationVersionStatusHistory(RegistrationVersionStatusHistory registrationVersionStatusHistory) {
        setRegistrationVersionStatusHistory(registrationVersionStatusHistory);
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
        if (getRegistrationArn() != null)
            sb.append("RegistrationArn: ").append(getRegistrationArn()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getRegistrationVersionStatus() != null)
            sb.append("RegistrationVersionStatus: ").append(getRegistrationVersionStatus()).append(",");
        if (getRegistrationVersionStatusHistory() != null)
            sb.append("RegistrationVersionStatusHistory: ").append(getRegistrationVersionStatusHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscardRegistrationVersionResult == false)
            return false;
        DiscardRegistrationVersionResult other = (DiscardRegistrationVersionResult) obj;
        if (other.getRegistrationArn() == null ^ this.getRegistrationArn() == null)
            return false;
        if (other.getRegistrationArn() != null && other.getRegistrationArn().equals(this.getRegistrationArn()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationArn() == null) ? 0 : getRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getRegistrationVersionStatus() == null) ? 0 : getRegistrationVersionStatus().hashCode());
        hashCode = prime * hashCode + ((getRegistrationVersionStatusHistory() == null) ? 0 : getRegistrationVersionStatusHistory().hashCode());
        return hashCode;
    }

    @Override
    public DiscardRegistrationVersionResult clone() {
        try {
            return (DiscardRegistrationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
