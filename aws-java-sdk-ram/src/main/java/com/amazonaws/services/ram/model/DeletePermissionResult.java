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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePermissionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A boolean that indicates whether the delete operations succeeded.
     * </p>
     */
    private Boolean returnValue;
    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * This operation is performed asynchronously, and this response parameter indicates the current status.
     * </p>
     */
    private String permissionStatus;

    /**
     * <p>
     * A boolean that indicates whether the delete operations succeeded.
     * </p>
     * 
     * @param returnValue
     *        A boolean that indicates whether the delete operations succeeded.
     */

    public void setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * A boolean that indicates whether the delete operations succeeded.
     * </p>
     * 
     * @return A boolean that indicates whether the delete operations succeeded.
     */

    public Boolean getReturnValue() {
        return this.returnValue;
    }

    /**
     * <p>
     * A boolean that indicates whether the delete operations succeeded.
     * </p>
     * 
     * @param returnValue
     *        A boolean that indicates whether the delete operations succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePermissionResult withReturnValue(Boolean returnValue) {
        setReturnValue(returnValue);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether the delete operations succeeded.
     * </p>
     * 
     * @return A boolean that indicates whether the delete operations succeeded.
     */

    public Boolean isReturnValue() {
        return this.returnValue;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @param clientToken
     *        The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *        idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *        that later call. All other parameters must also have the same values that you used in the first call.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @return The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *         idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *         that later call. All other parameters must also have the same values that you used in the first call.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @param clientToken
     *        The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *        idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *        that later call. All other parameters must also have the same values that you used in the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePermissionResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * This operation is performed asynchronously, and this response parameter indicates the current status.
     * </p>
     * 
     * @param permissionStatus
     *        This operation is performed asynchronously, and this response parameter indicates the current status.
     * @see PermissionStatus
     */

    public void setPermissionStatus(String permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    /**
     * <p>
     * This operation is performed asynchronously, and this response parameter indicates the current status.
     * </p>
     * 
     * @return This operation is performed asynchronously, and this response parameter indicates the current status.
     * @see PermissionStatus
     */

    public String getPermissionStatus() {
        return this.permissionStatus;
    }

    /**
     * <p>
     * This operation is performed asynchronously, and this response parameter indicates the current status.
     * </p>
     * 
     * @param permissionStatus
     *        This operation is performed asynchronously, and this response parameter indicates the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionStatus
     */

    public DeletePermissionResult withPermissionStatus(String permissionStatus) {
        setPermissionStatus(permissionStatus);
        return this;
    }

    /**
     * <p>
     * This operation is performed asynchronously, and this response parameter indicates the current status.
     * </p>
     * 
     * @param permissionStatus
     *        This operation is performed asynchronously, and this response parameter indicates the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionStatus
     */

    public DeletePermissionResult withPermissionStatus(PermissionStatus permissionStatus) {
        this.permissionStatus = permissionStatus.toString();
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
        if (getReturnValue() != null)
            sb.append("ReturnValue: ").append(getReturnValue()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPermissionStatus() != null)
            sb.append("PermissionStatus: ").append(getPermissionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePermissionResult == false)
            return false;
        DeletePermissionResult other = (DeletePermissionResult) obj;
        if (other.getReturnValue() == null ^ this.getReturnValue() == null)
            return false;
        if (other.getReturnValue() != null && other.getReturnValue().equals(this.getReturnValue()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPermissionStatus() == null ^ this.getPermissionStatus() == null)
            return false;
        if (other.getPermissionStatus() != null && other.getPermissionStatus().equals(this.getPermissionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturnValue() == null) ? 0 : getReturnValue().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPermissionStatus() == null) ? 0 : getPermissionStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeletePermissionResult clone() {
        try {
            return (DeletePermissionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
