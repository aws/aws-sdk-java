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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DisassociateQualificationFromWorker"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateQualificationFromWorkerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification to be revoked.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The ID of the Qualification type of the Qualification to be revoked.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this
     * message.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification to be revoked.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who possesses the Qualification to be revoked.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification to be revoked.
     * </p>
     * 
     * @return The ID of the Worker who possesses the Qualification to be revoked.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker who possesses the Qualification to be revoked.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who possesses the Qualification to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateQualificationFromWorkerRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The ID of the Qualification type of the Qualification to be revoked.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type of the Qualification to be revoked.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type of the Qualification to be revoked.
     * </p>
     * 
     * @return The ID of the Qualification type of the Qualification to be revoked.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type of the Qualification to be revoked.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type of the Qualification to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateQualificationFromWorkerRequest withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this
     * message.
     * </p>
     * 
     * @param reason
     *        A text message that explains why the Qualification was revoked. The user who had the Qualification sees
     *        this message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this
     * message.
     * </p>
     * 
     * @return A text message that explains why the Qualification was revoked. The user who had the Qualification sees
     *         this message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this
     * message.
     * </p>
     * 
     * @param reason
     *        A text message that explains why the Qualification was revoked. The user who had the Qualification sees
     *        this message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateQualificationFromWorkerRequest withReason(String reason) {
        setReason(reason);
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
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateQualificationFromWorkerRequest == false)
            return false;
        DisassociateQualificationFromWorkerRequest other = (DisassociateQualificationFromWorkerRequest) obj;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateQualificationFromWorkerRequest clone() {
        return (DisassociateQualificationFromWorkerRequest) super.clone();
    }

}
