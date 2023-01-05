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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for a launch permission. The launch permission modification request is sent to the <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html">Amazon EC2
 * ModifyImageAttribute</a> API on behalf of the user for each Region they have selected to distribute the AMI. To make
 * an AMI public, set the launch permission authorized accounts to <code>all</code>. See the examples for making an AMI
 * public at <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html">Amazon EC2
 * ModifyImageAttribute</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LaunchPermissionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchPermissionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private java.util.List<String> userIds;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private java.util.List<String> userGroups;
    /**
     * <p>
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     * Organizations?</a>.
     * </p>
     */
    private java.util.List<String> organizationArns;
    /**
     * <p>
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information
     * about key concepts for Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     * >Organizations terminology and concepts</a>.
     * </p>
     */
    private java.util.List<String> organizationalUnitArns;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param userIds
     *        The Amazon Web Services account ID.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param userIds
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param userGroups
     *        The name of the group.
     */

    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new java.util.ArrayList<String>(userGroups);
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withUserGroups(String... userGroups) {
        if (this.userGroups == null) {
            setUserGroups(new java.util.ArrayList<String>(userGroups.length));
        }
        for (String ele : userGroups) {
            this.userGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param userGroups
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     * Organizations?</a>.
     * </p>
     * 
     * @return The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     *         Organizations?</a>.
     */

    public java.util.List<String> getOrganizationArns() {
        return organizationArns;
    }

    /**
     * <p>
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     * Organizations?</a>.
     * </p>
     * 
     * @param organizationArns
     *        The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     *        Organizations?</a>.
     */

    public void setOrganizationArns(java.util.Collection<String> organizationArns) {
        if (organizationArns == null) {
            this.organizationArns = null;
            return;
        }

        this.organizationArns = new java.util.ArrayList<String>(organizationArns);
    }

    /**
     * <p>
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     * Organizations?</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationArns(java.util.Collection)} or {@link #withOrganizationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param organizationArns
     *        The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     *        Organizations?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withOrganizationArns(String... organizationArns) {
        if (this.organizationArns == null) {
            setOrganizationArns(new java.util.ArrayList<String>(organizationArns.length));
        }
        for (String ele : organizationArns) {
            this.organizationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     * Organizations?</a>.
     * </p>
     * 
     * @param organizationArns
     *        The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What is
     *        Organizations?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withOrganizationArns(java.util.Collection<String> organizationArns) {
        setOrganizationArns(organizationArns);
        return this;
    }

    /**
     * <p>
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information
     * about key concepts for Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     * >Organizations terminology and concepts</a>.
     * </p>
     * 
     * @return The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more
     *         information about key concepts for Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     *         >Organizations terminology and concepts</a>.
     */

    public java.util.List<String> getOrganizationalUnitArns() {
        return organizationalUnitArns;
    }

    /**
     * <p>
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information
     * about key concepts for Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     * >Organizations terminology and concepts</a>.
     * </p>
     * 
     * @param organizationalUnitArns
     *        The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more
     *        information about key concepts for Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     *        >Organizations terminology and concepts</a>.
     */

    public void setOrganizationalUnitArns(java.util.Collection<String> organizationalUnitArns) {
        if (organizationalUnitArns == null) {
            this.organizationalUnitArns = null;
            return;
        }

        this.organizationalUnitArns = new java.util.ArrayList<String>(organizationalUnitArns);
    }

    /**
     * <p>
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information
     * about key concepts for Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     * >Organizations terminology and concepts</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnitArns(java.util.Collection)} or
     * {@link #withOrganizationalUnitArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnitArns
     *        The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more
     *        information about key concepts for Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     *        >Organizations terminology and concepts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withOrganizationalUnitArns(String... organizationalUnitArns) {
        if (this.organizationalUnitArns == null) {
            setOrganizationalUnitArns(new java.util.ArrayList<String>(organizationalUnitArns.length));
        }
        for (String ele : organizationalUnitArns) {
            this.organizationalUnitArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information
     * about key concepts for Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     * >Organizations terminology and concepts</a>.
     * </p>
     * 
     * @param organizationalUnitArns
     *        The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more
     *        information about key concepts for Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html"
     *        >Organizations terminology and concepts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermissionConfiguration withOrganizationalUnitArns(java.util.Collection<String> organizationalUnitArns) {
        setOrganizationalUnitArns(organizationalUnitArns);
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
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups()).append(",");
        if (getOrganizationArns() != null)
            sb.append("OrganizationArns: ").append(getOrganizationArns()).append(",");
        if (getOrganizationalUnitArns() != null)
            sb.append("OrganizationalUnitArns: ").append(getOrganizationalUnitArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPermissionConfiguration == false)
            return false;
        LaunchPermissionConfiguration other = (LaunchPermissionConfiguration) obj;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getOrganizationArns() == null ^ this.getOrganizationArns() == null)
            return false;
        if (other.getOrganizationArns() != null && other.getOrganizationArns().equals(this.getOrganizationArns()) == false)
            return false;
        if (other.getOrganizationalUnitArns() == null ^ this.getOrganizationalUnitArns() == null)
            return false;
        if (other.getOrganizationalUnitArns() != null && other.getOrganizationalUnitArns().equals(this.getOrganizationalUnitArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getOrganizationArns() == null) ? 0 : getOrganizationArns().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitArns() == null) ? 0 : getOrganizationalUnitArns().hashCode());
        return hashCode;
    }

    @Override
    public LaunchPermissionConfiguration clone() {
        try {
            return (LaunchPermissionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LaunchPermissionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
