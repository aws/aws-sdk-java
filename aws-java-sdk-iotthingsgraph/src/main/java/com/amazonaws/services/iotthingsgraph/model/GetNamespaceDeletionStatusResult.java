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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetNamespaceDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNamespaceDeletionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the namespace that is being deleted.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the namespace that is being deleted.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The status of the deletion request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The ARN of the namespace that is being deleted.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the namespace that is being deleted.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The ARN of the namespace that is being deleted.
     * </p>
     * 
     * @return The ARN of the namespace that is being deleted.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The ARN of the namespace that is being deleted.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the namespace that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNamespaceDeletionStatusResult withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the namespace that is being deleted.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that is being deleted.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that is being deleted.
     * </p>
     * 
     * @return The name of the namespace that is being deleted.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that is being deleted.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNamespaceDeletionStatusResult withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The status of the deletion request.
     * </p>
     * 
     * @param status
     *        The status of the deletion request.
     * @see NamespaceDeletionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deletion request.
     * </p>
     * 
     * @return The status of the deletion request.
     * @see NamespaceDeletionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deletion request.
     * </p>
     * 
     * @param status
     *        The status of the deletion request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceDeletionStatus
     */

    public GetNamespaceDeletionStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deletion request.
     * </p>
     * 
     * @param status
     *        The status of the deletion request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceDeletionStatus
     */

    public GetNamespaceDeletionStatusResult withStatus(NamespaceDeletionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @param errorCode
     *        An error code returned by the namespace deletion task.
     * @see NamespaceDeletionStatusErrorCodes
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @return An error code returned by the namespace deletion task.
     * @see NamespaceDeletionStatusErrorCodes
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @param errorCode
     *        An error code returned by the namespace deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceDeletionStatusErrorCodes
     */

    public GetNamespaceDeletionStatusResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @param errorCode
     *        An error code returned by the namespace deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceDeletionStatusErrorCodes
     */

    public GetNamespaceDeletionStatusResult withErrorCode(NamespaceDeletionStatusErrorCodes errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @param errorMessage
     *        An error code returned by the namespace deletion task.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @return An error code returned by the namespace deletion task.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error code returned by the namespace deletion task.
     * </p>
     * 
     * @param errorMessage
     *        An error code returned by the namespace deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNamespaceDeletionStatusResult withErrorMessage(String errorMessage) {
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
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetNamespaceDeletionStatusResult == false)
            return false;
        GetNamespaceDeletionStatusResult other = (GetNamespaceDeletionStatusResult) obj;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetNamespaceDeletionStatusResult clone() {
        try {
            return (GetNamespaceDeletionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
