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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectQualificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectQualificationRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     * </p>
     */
    private String qualificationRequestId;
    /**
     * <p>
     * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     */

    public void setQualificationRequestId(String qualificationRequestId) {
        this.qualificationRequestId = qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     * </p>
     * 
     * @return The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     */

    public String getQualificationRequestId() {
        return this.qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, as returned by the <code>ListQualificationRequests</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectQualificationRequestRequest withQualificationRequestId(String qualificationRequestId) {
        setQualificationRequestId(qualificationRequestId);
        return this;
    }

    /**
     * <p>
     * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     * </p>
     * 
     * @param reason
     *        A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     * </p>
     * 
     * @return A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     * </p>
     * 
     * @param reason
     *        A text message explaining why the request was rejected, to be shown to the Worker who made the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectQualificationRequestRequest withReason(String reason) {
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
        if (getQualificationRequestId() != null)
            sb.append("QualificationRequestId: ").append(getQualificationRequestId()).append(",");
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

        if (obj instanceof RejectQualificationRequestRequest == false)
            return false;
        RejectQualificationRequestRequest other = (RejectQualificationRequestRequest) obj;
        if (other.getQualificationRequestId() == null ^ this.getQualificationRequestId() == null)
            return false;
        if (other.getQualificationRequestId() != null && other.getQualificationRequestId().equals(this.getQualificationRequestId()) == false)
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

        hashCode = prime * hashCode + ((getQualificationRequestId() == null) ? 0 : getQualificationRequestId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public RejectQualificationRequestRequest clone() {
        return (RejectQualificationRequestRequest) super.clone();
    }

}
