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
 * Provides user and group information used for filtering documents to use for generating Amazon Q Business conversation
 * responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user associated with the principal.
     * </p>
     */
    private PrincipalUser user;
    /**
     * <p>
     * The group associated with the principal.
     * </p>
     */
    private PrincipalGroup group;

    /**
     * <p>
     * The user associated with the principal.
     * </p>
     * 
     * @param user
     *        The user associated with the principal.
     */

    public void setUser(PrincipalUser user) {
        this.user = user;
    }

    /**
     * <p>
     * The user associated with the principal.
     * </p>
     * 
     * @return The user associated with the principal.
     */

    public PrincipalUser getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user associated with the principal.
     * </p>
     * 
     * @param user
     *        The user associated with the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withUser(PrincipalUser user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The group associated with the principal.
     * </p>
     * 
     * @param group
     *        The group associated with the principal.
     */

    public void setGroup(PrincipalGroup group) {
        this.group = group;
    }

    /**
     * <p>
     * The group associated with the principal.
     * </p>
     * 
     * @return The group associated with the principal.
     */

    public PrincipalGroup getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The group associated with the principal.
     * </p>
     * 
     * @param group
     *        The group associated with the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withGroup(PrincipalGroup group) {
        setGroup(group);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
