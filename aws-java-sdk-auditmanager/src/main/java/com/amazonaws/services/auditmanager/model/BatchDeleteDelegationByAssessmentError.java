/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error entity for the <code>BatchDeleteDelegationByAssessment</code> API. This is used to provide more meaningful
 * errors than a simple string message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessmentError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDelegationByAssessmentError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the specified delegation.
     * </p>
     */
    private String delegationId;
    /**
     * <p>
     * The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier for the specified delegation.
     * </p>
     * 
     * @param delegationId
     *        The identifier for the specified delegation.
     */

    public void setDelegationId(String delegationId) {
        this.delegationId = delegationId;
    }

    /**
     * <p>
     * The identifier for the specified delegation.
     * </p>
     * 
     * @return The identifier for the specified delegation.
     */

    public String getDelegationId() {
        return this.delegationId;
    }

    /**
     * <p>
     * The identifier for the specified delegation.
     * </p>
     * 
     * @param delegationId
     *        The identifier for the specified delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentError withDelegationId(String delegationId) {
        setDelegationId(delegationId);
        return this;
    }

    /**
     * <p>
     * The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errorCode
     *        The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @return The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errorCode
     *        The error code returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @return The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * </p>
     * 
     * @param errorMessage
     *        The error message returned by the <code>BatchDeleteDelegationByAssessment</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getDelegationId() != null)
            sb.append("DelegationId: ").append(getDelegationId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDelegationByAssessmentError == false)
            return false;
        BatchDeleteDelegationByAssessmentError other = (BatchDeleteDelegationByAssessmentError) obj;
        if (other.getDelegationId() == null ^ this.getDelegationId() == null)
            return false;
        if (other.getDelegationId() != null && other.getDelegationId().equals(this.getDelegationId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegationId() == null) ? 0 : getDelegationId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDelegationByAssessmentError clone() {
        try {
            return (BatchDeleteDelegationByAssessmentError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.BatchDeleteDelegationByAssessmentErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
