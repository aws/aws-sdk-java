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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed
     * prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is
     * generated at the time that a new identity store is created.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed
     * prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is
     * generated at the time that a new identity store is created.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a
     *        fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters.
     *        This value is generated at the time that a new identity store is created.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed
     * prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is
     * generated at the time that a new identity store is created.
     * </p>
     * 
     * @return The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a
     *         fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters.
     *         This value is generated at the time that a new identity store is created.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed
     * prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is
     * generated at the time that a new identity store is created.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a
     *        fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters.
     *        This value is generated at the time that a new identity store is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @return The identifier for a group in the identity store.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupRequest withGroupId(String groupId) {
        setGroupId(groupId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGroupRequest == false)
            return false;
        DescribeGroupRequest other = (DescribeGroupRequest) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGroupRequest clone() {
        return (DescribeGroupRequest) super.clone();
    }

}
