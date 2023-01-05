/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result from the inspection of the web request for a valid challenge token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ChallengeResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChallengeResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP response code indicating the status of the challenge token in the web request. If the token is missing,
     * invalid, or expired, this code is <code>202 Request Accepted</code>.
     * </p>
     */
    private Integer responseCode;
    /**
     * <p>
     * The time that the challenge was last solved for the supplied token.
     * </p>
     */
    private Long solveTimestamp;
    /**
     * <p>
     * The reason for failure, populated when the evaluation of the token fails.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The HTTP response code indicating the status of the challenge token in the web request. If the token is missing,
     * invalid, or expired, this code is <code>202 Request Accepted</code>.
     * </p>
     * 
     * @param responseCode
     *        The HTTP response code indicating the status of the challenge token in the web request. If the token is
     *        missing, invalid, or expired, this code is <code>202 Request Accepted</code>.
     */

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The HTTP response code indicating the status of the challenge token in the web request. If the token is missing,
     * invalid, or expired, this code is <code>202 Request Accepted</code>.
     * </p>
     * 
     * @return The HTTP response code indicating the status of the challenge token in the web request. If the token is
     *         missing, invalid, or expired, this code is <code>202 Request Accepted</code>.
     */

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The HTTP response code indicating the status of the challenge token in the web request. If the token is missing,
     * invalid, or expired, this code is <code>202 Request Accepted</code>.
     * </p>
     * 
     * @param responseCode
     *        The HTTP response code indicating the status of the challenge token in the web request. If the token is
     *        missing, invalid, or expired, this code is <code>202 Request Accepted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChallengeResponse withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The time that the challenge was last solved for the supplied token.
     * </p>
     * 
     * @param solveTimestamp
     *        The time that the challenge was last solved for the supplied token.
     */

    public void setSolveTimestamp(Long solveTimestamp) {
        this.solveTimestamp = solveTimestamp;
    }

    /**
     * <p>
     * The time that the challenge was last solved for the supplied token.
     * </p>
     * 
     * @return The time that the challenge was last solved for the supplied token.
     */

    public Long getSolveTimestamp() {
        return this.solveTimestamp;
    }

    /**
     * <p>
     * The time that the challenge was last solved for the supplied token.
     * </p>
     * 
     * @param solveTimestamp
     *        The time that the challenge was last solved for the supplied token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChallengeResponse withSolveTimestamp(Long solveTimestamp) {
        setSolveTimestamp(solveTimestamp);
        return this;
    }

    /**
     * <p>
     * The reason for failure, populated when the evaluation of the token fails.
     * </p>
     * 
     * @param failureReason
     *        The reason for failure, populated when the evaluation of the token fails.
     * @see FailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for failure, populated when the evaluation of the token fails.
     * </p>
     * 
     * @return The reason for failure, populated when the evaluation of the token fails.
     * @see FailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for failure, populated when the evaluation of the token fails.
     * </p>
     * 
     * @param failureReason
     *        The reason for failure, populated when the evaluation of the token fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public ChallengeResponse withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The reason for failure, populated when the evaluation of the token fails.
     * </p>
     * 
     * @param failureReason
     *        The reason for failure, populated when the evaluation of the token fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public ChallengeResponse withFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason.toString();
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
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getSolveTimestamp() != null)
            sb.append("SolveTimestamp: ").append(getSolveTimestamp()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChallengeResponse == false)
            return false;
        ChallengeResponse other = (ChallengeResponse) obj;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getSolveTimestamp() == null ^ this.getSolveTimestamp() == null)
            return false;
        if (other.getSolveTimestamp() != null && other.getSolveTimestamp().equals(this.getSolveTimestamp()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getSolveTimestamp() == null) ? 0 : getSolveTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public ChallengeResponse clone() {
        try {
            return (ChallengeResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ChallengeResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
