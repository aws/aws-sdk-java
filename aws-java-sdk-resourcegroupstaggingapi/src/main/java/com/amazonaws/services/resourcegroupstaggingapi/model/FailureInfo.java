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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the common errors that all actions return.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/FailureInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message of the common error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code of the common error.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     * 
     * @return The HTTP status code of the common error.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code of the common error.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code of the common error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureInfo withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     * 
     * @param errorCode
     *        The code of the common error. Valid values include <code>InternalServiceException</code>,
     *        <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts
     *        the resource that you want to tag.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     * 
     * @return The code of the common error. Valid values include <code>InternalServiceException</code>,
     *         <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts
     *         the resource that you want to tag.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     * 
     * @param errorCode
     *        The code of the common error. Valid values include <code>InternalServiceException</code>,
     *        <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts
     *        the resource that you want to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public FailureInfo withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     * 
     * @param errorCode
     *        The code of the common error. Valid values include <code>InternalServiceException</code>,
     *        <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts
     *        the resource that you want to tag.
     * @see ErrorCode
     */

    public void setErrorCode(ErrorCode errorCode) {
        withErrorCode(errorCode);
    }

    /**
     * <p>
     * The code of the common error. Valid values include <code>InternalServiceException</code>,
     * <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts the
     * resource that you want to tag.
     * </p>
     * 
     * @param errorCode
     *        The code of the common error. Valid values include <code>InternalServiceException</code>,
     *        <code>InvalidParameterException</code>, and any valid error code returned by the AWS service that hosts
     *        the resource that you want to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public FailureInfo withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     * 
     * @param errorMessage
     *        The message of the common error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     * 
     * @return The message of the common error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message of the common error.
     * </p>
     * 
     * @param errorMessage
     *        The message of the common error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureInfo withErrorMessage(String errorMessage) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
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

        if (obj instanceof FailureInfo == false)
            return false;
        FailureInfo other = (FailureInfo) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
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

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailureInfo clone() {
        try {
            return (FailureInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroupstaggingapi.model.transform.FailureInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
