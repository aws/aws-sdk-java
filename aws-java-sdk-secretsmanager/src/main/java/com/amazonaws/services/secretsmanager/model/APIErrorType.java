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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error Secrets Manager encountered while retrieving an individual secret as part of <a>BatchGetSecretValue</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/APIErrorType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APIErrorType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * The error Secrets Manager encountered while retrieving an individual secret as part of
     * <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     * <code>InvalidParameterException</code>, <code>InvalidRequestException</code>, <code>DecryptionFailure</code>, or
     * <code>AccessDeniedException</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A message describing the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @return The ARN or name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIErrorType withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The error Secrets Manager encountered while retrieving an individual secret as part of
     * <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     * <code>InvalidParameterException</code>, <code>InvalidRequestException</code>, <code>DecryptionFailure</code>, or
     * <code>AccessDeniedException</code>.
     * </p>
     * 
     * @param errorCode
     *        The error Secrets Manager encountered while retrieving an individual secret as part of
     *        <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     *        <code>InvalidParameterException</code>, <code>InvalidRequestException</code>,
     *        <code>DecryptionFailure</code>, or <code>AccessDeniedException</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error Secrets Manager encountered while retrieving an individual secret as part of
     * <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     * <code>InvalidParameterException</code>, <code>InvalidRequestException</code>, <code>DecryptionFailure</code>, or
     * <code>AccessDeniedException</code>.
     * </p>
     * 
     * @return The error Secrets Manager encountered while retrieving an individual secret as part of
     *         <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     *         <code>InvalidParameterException</code>, <code>InvalidRequestException</code>,
     *         <code>DecryptionFailure</code>, or <code>AccessDeniedException</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error Secrets Manager encountered while retrieving an individual secret as part of
     * <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     * <code>InvalidParameterException</code>, <code>InvalidRequestException</code>, <code>DecryptionFailure</code>, or
     * <code>AccessDeniedException</code>.
     * </p>
     * 
     * @param errorCode
     *        The error Secrets Manager encountered while retrieving an individual secret as part of
     *        <a>BatchGetSecretValue</a>, for example <code>ResourceNotFoundException</code>,
     *        <code>InvalidParameterException</code>, <code>InvalidRequestException</code>,
     *        <code>DecryptionFailure</code>, or <code>AccessDeniedException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIErrorType withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param message
     *        A message describing the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @return A message describing the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param message
     *        A message describing the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APIErrorType withMessage(String message) {
        setMessage(message);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APIErrorType == false)
            return false;
        APIErrorType other = (APIErrorType) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public APIErrorType clone() {
        try {
            return (APIErrorType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.APIErrorTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
