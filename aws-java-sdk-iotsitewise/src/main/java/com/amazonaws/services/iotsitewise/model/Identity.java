/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains an identity that can access an IoT SiteWise Monitor resource.
 * </p>
 * <note>
 * <p>
 * Currently, you can't use Amazon Web Services APIs to retrieve Amazon Web Services SSO identity IDs. You can find the
 * Amazon Web Services SSO identity IDs in the URL of user and group pages in the <a
 * href="https://console.aws.amazon.com/singlesignon">Amazon Web Services SSO console</a>.
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
     * An Amazon Web Services SSO user identity.
     * </p>
     */
    private UserIdentity user;
    /**
     * <p>
     * An Amazon Web Services SSO group identity.
     * </p>
     */
    private GroupIdentity group;
    /**
     * <p>
     * An IAM user identity.
     * </p>
     */
    private IAMUserIdentity iamUser;
    /**
     * <p>
     * An IAM role identity.
     * </p>
     */
    private IAMRoleIdentity iamRole;

    /**
     * <p>
     * An Amazon Web Services SSO user identity.
     * </p>
     * 
     * @param user
     *        An Amazon Web Services SSO user identity.
     */

    public void setUser(UserIdentity user) {
        this.user = user;
    }

    /**
     * <p>
     * An Amazon Web Services SSO user identity.
     * </p>
     * 
     * @return An Amazon Web Services SSO user identity.
     */

    public UserIdentity getUser() {
        return this.user;
    }

    /**
     * <p>
     * An Amazon Web Services SSO user identity.
     * </p>
     * 
     * @param user
     *        An Amazon Web Services SSO user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withUser(UserIdentity user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * An Amazon Web Services SSO group identity.
     * </p>
     * 
     * @param group
     *        An Amazon Web Services SSO group identity.
     */

    public void setGroup(GroupIdentity group) {
        this.group = group;
    }

    /**
     * <p>
     * An Amazon Web Services SSO group identity.
     * </p>
     * 
     * @return An Amazon Web Services SSO group identity.
     */

    public GroupIdentity getGroup() {
        return this.group;
    }

    /**
     * <p>
     * An Amazon Web Services SSO group identity.
     * </p>
     * 
     * @param group
     *        An Amazon Web Services SSO group identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withGroup(GroupIdentity group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * An IAM user identity.
     * </p>
     * 
     * @param iamUser
     *        An IAM user identity.
     */

    public void setIamUser(IAMUserIdentity iamUser) {
        this.iamUser = iamUser;
    }

    /**
     * <p>
     * An IAM user identity.
     * </p>
     * 
     * @return An IAM user identity.
     */

    public IAMUserIdentity getIamUser() {
        return this.iamUser;
    }

    /**
     * <p>
     * An IAM user identity.
     * </p>
     * 
     * @param iamUser
     *        An IAM user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withIamUser(IAMUserIdentity iamUser) {
        setIamUser(iamUser);
        return this;
    }

    /**
     * <p>
     * An IAM role identity.
     * </p>
     * 
     * @param iamRole
     *        An IAM role identity.
     */

    public void setIamRole(IAMRoleIdentity iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * An IAM role identity.
     * </p>
     * 
     * @return An IAM role identity.
     */

    public IAMRoleIdentity getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * An IAM role identity.
     * </p>
     * 
     * @param iamRole
     *        An IAM role identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withIamRole(IAMRoleIdentity iamRole) {
        setIamRole(iamRole);
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
            sb.append("Group: ").append(getGroup()).append(",");
        if (getIamUser() != null)
            sb.append("IamUser: ").append(getIamUser()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole());
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
        if (other.getIamUser() == null ^ this.getIamUser() == null)
            return false;
        if (other.getIamUser() != null && other.getIamUser().equals(this.getIamUser()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getIamUser() == null) ? 0 : getIamUser().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
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
