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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * AcceptInvitation request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of the detector of the GuardDuty member account. */
    private String detectorId;
    /** This value is used to validate the master account to the member account. */
    private String invitationId;
    /** The account ID of the master GuardDuty account whose invitation you're accepting. */
    private String masterId;

    /**
     * The unique ID of the detector of the GuardDuty member account.
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty member account.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector of the GuardDuty member account.
     * 
     * @return The unique ID of the detector of the GuardDuty member account.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector of the GuardDuty member account.
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * This value is used to validate the master account to the member account.
     * 
     * @param invitationId
     *        This value is used to validate the master account to the member account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * This value is used to validate the master account to the member account.
     * 
     * @return This value is used to validate the master account to the member account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * This value is used to validate the master account to the member account.
     * 
     * @param invitationId
     *        This value is used to validate the master account to the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * The account ID of the master GuardDuty account whose invitation you're accepting.
     * 
     * @param masterId
     *        The account ID of the master GuardDuty account whose invitation you're accepting.
     */

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * The account ID of the master GuardDuty account whose invitation you're accepting.
     * 
     * @return The account ID of the master GuardDuty account whose invitation you're accepting.
     */

    public String getMasterId() {
        return this.masterId;
    }

    /**
     * The account ID of the master GuardDuty account whose invitation you're accepting.
     * 
     * @param masterId
     *        The account ID of the master GuardDuty account whose invitation you're accepting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withMasterId(String masterId) {
        setMasterId(masterId);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInvitationRequest == false)
            return false;
        AcceptInvitationRequest other = (AcceptInvitationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptInvitationRequest clone() {
        return (AcceptInvitationRequest) super.clone();
    }

}
