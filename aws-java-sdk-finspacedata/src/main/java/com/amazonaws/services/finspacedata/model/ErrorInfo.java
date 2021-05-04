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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ErrorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The category of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VALIDATION</code> -The inputs to this request are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to increase
     * quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - A user recoverable error has occurred.
     * </p>
     * </li>
     * </ul>
     */
    private String errorCategory;

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @return The text of the error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInfo withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VALIDATION</code> -The inputs to this request are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to increase
     * quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - A user recoverable error has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCategory
     *        The category of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VALIDATION</code> -The inputs to this request are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to
     *        increase quotas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - A user recoverable error has occurred.
     *        </p>
     *        </li>
     * @see ErrorCategory
     */

    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VALIDATION</code> -The inputs to this request are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to increase
     * quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - A user recoverable error has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The category of the error.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VALIDATION</code> -The inputs to this request are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to
     *         increase quotas.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> - A user recoverable error has occurred.
     *         </p>
     *         </li>
     * @see ErrorCategory
     */

    public String getErrorCategory() {
        return this.errorCategory;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VALIDATION</code> -The inputs to this request are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to increase
     * quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - A user recoverable error has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCategory
     *        The category of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VALIDATION</code> -The inputs to this request are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to
     *        increase quotas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - A user recoverable error has occurred.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCategory
     */

    public ErrorInfo withErrorCategory(String errorCategory) {
        setErrorCategory(errorCategory);
        return this;
    }

    /**
     * <p>
     * The category of the error.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VALIDATION</code> -The inputs to this request are invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to increase
     * quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - A user recoverable error has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCategory
     *        The category of the error.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VALIDATION</code> -The inputs to this request are invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_QUOTA_EXCEEDED</code> - Service quotas have been exceeded. Please contact AWS support to
     *        increase quotas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code> - Missing required permission to perform this request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_NOT_FOUND</code> - One or more inputs to this request were not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THROTTLING</code> - The system temporarily lacks sufficient resources to process the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_SERVICE_EXCEPTION</code> - An internal service error has occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - A user recoverable error has occurred.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCategory
     */

    public ErrorInfo withErrorCategory(ErrorCategory errorCategory) {
        this.errorCategory = errorCategory.toString();
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorCategory() != null)
            sb.append("ErrorCategory: ").append(getErrorCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCategory() == null ^ this.getErrorCategory() == null)
            return false;
        if (other.getErrorCategory() != null && other.getErrorCategory().equals(this.getErrorCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCategory() == null) ? 0 : getErrorCategory().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInfo clone() {
        try {
            return (ErrorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.ErrorInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
