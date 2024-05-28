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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The POSIX user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PosixUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PosixUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the POSIX user's group.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The name of the POSIX user.
     * </p>
     */
    private String user;

    /**
     * <p>
     * The name of the POSIX user's group.
     * </p>
     * 
     * @param group
     *        The name of the POSIX user's group.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the POSIX user's group.
     * </p>
     * 
     * @return The name of the POSIX user's group.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the POSIX user's group.
     * </p>
     * 
     * @param group
     *        The name of the POSIX user's group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The name of the POSIX user.
     * </p>
     * 
     * @param user
     *        The name of the POSIX user.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The name of the POSIX user.
     * </p>
     * 
     * @return The name of the POSIX user.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The name of the POSIX user.
     * </p>
     * 
     * @param user
     *        The name of the POSIX user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PosixUser withUser(String user) {
        setUser(user);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PosixUser == false)
            return false;
        PosixUser other = (PosixUser) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public PosixUser clone() {
        try {
            return (PosixUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.PosixUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
