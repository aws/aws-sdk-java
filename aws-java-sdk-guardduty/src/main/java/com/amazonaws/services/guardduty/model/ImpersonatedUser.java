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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the impersonated user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ImpersonatedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpersonatedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the <code>username</code> that was being impersonated.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The <code>group</code> to which the user name belongs.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * Information about the <code>username</code> that was being impersonated.
     * </p>
     * 
     * @param username
     *        Information about the <code>username</code> that was being impersonated.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * Information about the <code>username</code> that was being impersonated.
     * </p>
     * 
     * @return Information about the <code>username</code> that was being impersonated.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * Information about the <code>username</code> that was being impersonated.
     * </p>
     * 
     * @param username
     *        Information about the <code>username</code> that was being impersonated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonatedUser withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The <code>group</code> to which the user name belongs.
     * </p>
     * 
     * @return The <code>group</code> to which the user name belongs.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The <code>group</code> to which the user name belongs.
     * </p>
     * 
     * @param groups
     *        The <code>group</code> to which the user name belongs.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The <code>group</code> to which the user name belongs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The <code>group</code> to which the user name belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonatedUser withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>group</code> to which the user name belongs.
     * </p>
     * 
     * @param groups
     *        The <code>group</code> to which the user name belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpersonatedUser withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImpersonatedUser == false)
            return false;
        ImpersonatedUser other = (ImpersonatedUser) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public ImpersonatedUser clone() {
        try {
            return (ImpersonatedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ImpersonatedUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
