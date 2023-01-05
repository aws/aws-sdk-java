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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might add,
     * replace, or remove an attribute.
     * </p>
     */
    private java.util.List<AttributeOperation> operations;

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @return The globally unique identifier for the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @return The identifier for a user in the identity store.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might add,
     * replace, or remove an attribute.
     * </p>
     * 
     * @return A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might
     *         add, replace, or remove an attribute.
     */

    public java.util.List<AttributeOperation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might add,
     * replace, or remove an attribute.
     * </p>
     * 
     * @param operations
     *        A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might
     *        add, replace, or remove an attribute.
     */

    public void setOperations(java.util.Collection<AttributeOperation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<AttributeOperation>(operations);
    }

    /**
     * <p>
     * A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might add,
     * replace, or remove an attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might
     *        add, replace, or remove an attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withOperations(AttributeOperation... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<AttributeOperation>(operations.length));
        }
        for (AttributeOperation ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might add,
     * replace, or remove an attribute.
     * </p>
     * 
     * @param operations
     *        A list of <code>AttributeOperation</code> objects to apply to the requested user. These operations might
     *        add, replace, or remove an attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withOperations(java.util.Collection<AttributeOperation> operations) {
        setOperations(operations);
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
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
