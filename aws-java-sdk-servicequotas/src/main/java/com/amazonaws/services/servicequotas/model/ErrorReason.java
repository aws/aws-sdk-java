/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns an error that explains why the action did not succeed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ErrorReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Service Quotas returns the following error values.
     * </p>
     * <p>
     * <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call the
     * service or service quota. To resolve the error, you need permission to access the service or service quota.
     * </p>
     * <p>
     * <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service Quotas.
     * </p>
     * <p>
     * <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     * </p>
     * <p>
     * <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message that provides more detail.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Service Quotas returns the following error values.
     * </p>
     * <p>
     * <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call the
     * service or service quota. To resolve the error, you need permission to access the service or service quota.
     * </p>
     * <p>
     * <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service Quotas.
     * </p>
     * <p>
     * <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     * </p>
     * <p>
     * <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * </p>
     * 
     * @param errorCode
     *        Service Quotas returns the following error values. </p>
     *        <p>
     *        <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call
     *        the service or service quota. To resolve the error, you need permission to access the service or service
     *        quota.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service
     *        Quotas.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     *        </p>
     *        <p>
     *        <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Service Quotas returns the following error values.
     * </p>
     * <p>
     * <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call the
     * service or service quota. To resolve the error, you need permission to access the service or service quota.
     * </p>
     * <p>
     * <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service Quotas.
     * </p>
     * <p>
     * <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     * </p>
     * <p>
     * <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * </p>
     * 
     * @return Service Quotas returns the following error values. </p>
     *         <p>
     *         <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call
     *         the service or service quota. To resolve the error, you need permission to access the service or service
     *         quota.
     *         </p>
     *         <p>
     *         <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service
     *         Quotas.
     *         </p>
     *         <p>
     *         <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     *         </p>
     *         <p>
     *         <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Service Quotas returns the following error values.
     * </p>
     * <p>
     * <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call the
     * service or service quota. To resolve the error, you need permission to access the service or service quota.
     * </p>
     * <p>
     * <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service Quotas.
     * </p>
     * <p>
     * <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     * </p>
     * <p>
     * <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * </p>
     * 
     * @param errorCode
     *        Service Quotas returns the following error values. </p>
     *        <p>
     *        <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call
     *        the service or service quota. To resolve the error, you need permission to access the service or service
     *        quota.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service
     *        Quotas.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     *        </p>
     *        <p>
     *        <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorReason withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Service Quotas returns the following error values.
     * </p>
     * <p>
     * <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call the
     * service or service quota. To resolve the error, you need permission to access the service or service quota.
     * </p>
     * <p>
     * <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service Quotas.
     * </p>
     * <p>
     * <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     * </p>
     * <p>
     * <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * </p>
     * 
     * @param errorCode
     *        Service Quotas returns the following error values. </p>
     *        <p>
     *        <code>DEPENDENCY_ACCESS_DENIED_ERROR</code> is returned when the caller does not have permission to call
     *        the service or service quota. To resolve the error, you need permission to access the service or service
     *        quota.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_THROTTLING_ERROR</code> is returned when the service being called is throttling Service
     *        Quotas.
     *        </p>
     *        <p>
     *        <code>DEPENDENCY_SERVICE_ERROR</code> is returned when the service being called has availability issues.
     *        </p>
     *        <p>
     *        <code>SERVICE_QUOTA_NOT_AVAILABLE_ERROR</code> is returned when there was an error in Service Quotas.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorReason withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message that provides more detail.
     * </p>
     * 
     * @param errorMessage
     *        The error message that provides more detail.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that provides more detail.
     * </p>
     * 
     * @return The error message that provides more detail.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that provides more detail.
     * </p>
     * 
     * @param errorMessage
     *        The error message that provides more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorReason withErrorMessage(String errorMessage) {
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

        if (obj instanceof ErrorReason == false)
            return false;
        ErrorReason other = (ErrorReason) obj;
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

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ErrorReason clone() {
        try {
            return (ErrorReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicequotas.model.transform.ErrorReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
