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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The users that belong to a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/MemberUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the user you want to map to a group.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The type of the user.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the user you want to map to a group.
     * </p>
     * 
     * @param userId
     *        The identifier of the user you want to map to a group.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user you want to map to a group.
     * </p>
     * 
     * @return The identifier of the user you want to map to a group.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user you want to map to a group.
     * </p>
     * 
     * @param userId
     *        The identifier of the user you want to map to a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberUser withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @see MembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @return The type of the user.
     * @see MembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public MemberUser withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the user.
     * </p>
     * 
     * @param type
     *        The type of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public MemberUser withType(MembershipType type) {
        this.type = type.toString();
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberUser == false)
            return false;
        MemberUser other = (MemberUser) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MemberUser clone() {
        try {
            return (MemberUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.MemberUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
