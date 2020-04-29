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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an AWS SSO identity ID for a user or group.
 * </p>
 * <note>
 * <p>
 * Currently, you can't use AWS APIs to retrieve AWS SSO identity IDs. You can find the AWS SSO identity IDs in the URL
 * of user and group pages in the <a href="https://console.aws.amazon.com/singlesignon">AWS SSO console</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Identity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Identity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A user identity.
     * </p>
     */
    private UserIdentity user;
    /**
     * <p>
     * A group identity.
     * </p>
     */
    private GroupIdentity group;

    /**
     * <p>
     * A user identity.
     * </p>
     * 
     * @param user
     *        A user identity.
     */

    public void setUser(UserIdentity user) {
        this.user = user;
    }

    /**
     * <p>
     * A user identity.
     * </p>
     * 
     * @return A user identity.
     */

    public UserIdentity getUser() {
        return this.user;
    }

    /**
     * <p>
     * A user identity.
     * </p>
     * 
     * @param user
     *        A user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withUser(UserIdentity user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * A group identity.
     * </p>
     * 
     * @param group
     *        A group identity.
     */

    public void setGroup(GroupIdentity group) {
        this.group = group;
    }

    /**
     * <p>
     * A group identity.
     * </p>
     * 
     * @return A group identity.
     */

    public GroupIdentity getGroup() {
        return this.group;
    }

    /**
     * <p>
     * A group identity.
     * </p>
     * 
     * @param group
     *        A group identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withGroup(GroupIdentity group) {
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

        if (obj instanceof Identity == false)
            return false;
        Identity other = (Identity) obj;
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
    public Identity clone() {
        try {
            return (Identity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.IdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
