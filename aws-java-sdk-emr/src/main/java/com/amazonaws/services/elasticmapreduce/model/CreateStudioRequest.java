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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CreateStudio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStudioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A detailed description of the Amazon EMR Studio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio currently
     * only supports SSO authentication.
     * </p>
     */
    private String authMode;
    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The
     * subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in any of the
     * specified subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR Studio
     * to interoperate with other AWS services.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The permissions
     * attached to this IAM role can be scoped down for each user or group using session policies.
     * </p>
     */
    private String userRole;
    /**
     * <p>
     * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network
     * traffic to resources in the Engine security group, and it must be in the same VPC specified by <code>VpcId</code>
     * .
     * </p>
     */
    private String workspaceSecurityGroupId;
    /**
     * <p>
     * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic
     * from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     * </p>
     */
    private String engineSecurityGroupId;
    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user can
     * select an alternative Amazon S3 location when creating a Workspace.
     * </p>
     */
    private String defaultS3Location;
    /**
     * <p>
     * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional value string with a maximum of 256
     * characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        A descriptive name for the Amazon EMR Studio.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @return A descriptive name for the Amazon EMR Studio.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        A descriptive name for the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A detailed description of the Amazon EMR Studio.
     * </p>
     * 
     * @param description
     *        A detailed description of the Amazon EMR Studio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A detailed description of the Amazon EMR Studio.
     * </p>
     * 
     * @return A detailed description of the Amazon EMR Studio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A detailed description of the Amazon EMR Studio.
     * </p>
     * 
     * @param description
     *        A detailed description of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio currently
     * only supports SSO authentication.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio
     *        currently only supports SSO authentication.
     * @see AuthMode
     */

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio currently
     * only supports SSO authentication.
     * </p>
     * 
     * @return Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio
     *         currently only supports SSO authentication.
     * @see AuthMode
     */

    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio currently
     * only supports SSO authentication.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio
     *        currently only supports SSO authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateStudioRequest withAuthMode(String authMode) {
        setAuthMode(authMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio currently
     * only supports SSO authentication.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM. Amazon EMR Studio
     *        currently only supports SSO authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateStudioRequest withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * </p>
     * 
     * @return The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The
     * subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in any of the
     * specified subnets.
     * </p>
     * 
     * @return A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets.
     *         The subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace
     *         in any of the specified subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The
     * subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in any of the
     * specified subnets.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets.
     *        The subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in
     *        any of the specified subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The
     * subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in any of the
     * specified subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets.
     *        The subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in
     *        any of the specified subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The
     * subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in any of the
     * specified subnets.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets.
     *        The subnets must belong to the VPC specified by <code>VpcId</code>. Studio users can create a Workspace in
     *        any of the specified subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR Studio
     * to interoperate with other AWS services.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR
     *        Studio to interoperate with other AWS services.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR Studio
     * to interoperate with other AWS services.
     * </p>
     * 
     * @return The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon
     *         EMR Studio to interoperate with other AWS services.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR Studio
     * to interoperate with other AWS services.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR Studio. The service role provides a way for Amazon EMR
     *        Studio to interoperate with other AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The permissions
     * attached to this IAM role can be scoped down for each user or group using session policies.
     * </p>
     * 
     * @param userRole
     *        The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The
     *        permissions attached to this IAM role can be scoped down for each user or group using session policies.
     */

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The permissions
     * attached to this IAM role can be scoped down for each user or group using session policies.
     * </p>
     * 
     * @return The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The
     *         permissions attached to this IAM role can be scoped down for each user or group using session policies.
     */

    public String getUserRole() {
        return this.userRole;
    }

    /**
     * <p>
     * The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The permissions
     * attached to this IAM role can be scoped down for each user or group using session policies.
     * </p>
     * 
     * @param userRole
     *        The IAM user role that will be assumed by users and groups logged in to an Amazon EMR Studio. The
     *        permissions attached to this IAM role can be scoped down for each user or group using session policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withUserRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network
     * traffic to resources in the Engine security group, and it must be in the same VPC specified by <code>VpcId</code>
     * .
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound
     *        network traffic to resources in the Engine security group, and it must be in the same VPC specified by
     *        <code>VpcId</code>.
     */

    public void setWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network
     * traffic to resources in the Engine security group, and it must be in the same VPC specified by <code>VpcId</code>
     * .
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound
     *         network traffic to resources in the Engine security group, and it must be in the same VPC specified by
     *         <code>VpcId</code>.
     */

    public String getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network
     * traffic to resources in the Engine security group, and it must be in the same VPC specified by <code>VpcId</code>
     * .
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound
     *        network traffic to resources in the Engine security group, and it must be in the same VPC specified by
     *        <code>VpcId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        setWorkspaceSecurityGroupId(workspaceSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic
     * from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     * </p>
     * 
     * @param engineSecurityGroupId
     *        The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network
     *        traffic from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     */

    public void setEngineSecurityGroupId(String engineSecurityGroupId) {
        this.engineSecurityGroupId = engineSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic
     * from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network
     *         traffic from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>
     *         .
     */

    public String getEngineSecurityGroupId() {
        return this.engineSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic
     * from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     * </p>
     * 
     * @param engineSecurityGroupId
     *        The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network
     *        traffic from the Workspace security group, and it must be in the same VPC specified by <code>VpcId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withEngineSecurityGroupId(String engineSecurityGroupId) {
        setEngineSecurityGroupId(engineSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user can
     * select an alternative Amazon S3 location when creating a Workspace.
     * </p>
     * 
     * @param defaultS3Location
     *        The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user
     *        can select an alternative Amazon S3 location when creating a Workspace.
     */

    public void setDefaultS3Location(String defaultS3Location) {
        this.defaultS3Location = defaultS3Location;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user can
     * select an alternative Amazon S3 location when creating a Workspace.
     * </p>
     * 
     * @return The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user
     *         can select an alternative Amazon S3 location when creating a Workspace.
     */

    public String getDefaultS3Location() {
        return this.defaultS3Location;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user can
     * select an alternative Amazon S3 location when creating a Workspace.
     * </p>
     * 
     * @param defaultS3Location
     *        The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files. A Studio user
     *        can select an alternative Amazon S3 location when creating a Workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withDefaultS3Location(String defaultS3Location) {
        setDefaultS3Location(defaultS3Location);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @return A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that
     *         consist of a required key string with a maximum of 128 characters, and an optional value string with a
     *         maximum of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist
     *        of a required key string with a maximum of 128 characters, and an optional value string with a maximum of
     *        256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional value string with a maximum of 256
     * characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist
     *        of a required key string with a maximum of 128 characters, and an optional value string with a maximum of
     *        256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist
     *        of a required key string with a maximum of 128 characters, and an optional value string with a maximum of
     *        256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAuthMode() != null)
            sb.append("AuthMode: ").append(getAuthMode()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getUserRole() != null)
            sb.append("UserRole: ").append(getUserRole()).append(",");
        if (getWorkspaceSecurityGroupId() != null)
            sb.append("WorkspaceSecurityGroupId: ").append(getWorkspaceSecurityGroupId()).append(",");
        if (getEngineSecurityGroupId() != null)
            sb.append("EngineSecurityGroupId: ").append(getEngineSecurityGroupId()).append(",");
        if (getDefaultS3Location() != null)
            sb.append("DefaultS3Location: ").append(getDefaultS3Location()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStudioRequest == false)
            return false;
        CreateStudioRequest other = (CreateStudioRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAuthMode() == null ^ this.getAuthMode() == null)
            return false;
        if (other.getAuthMode() != null && other.getAuthMode().equals(this.getAuthMode()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        if (other.getWorkspaceSecurityGroupId() == null ^ this.getWorkspaceSecurityGroupId() == null)
            return false;
        if (other.getWorkspaceSecurityGroupId() != null && other.getWorkspaceSecurityGroupId().equals(this.getWorkspaceSecurityGroupId()) == false)
            return false;
        if (other.getEngineSecurityGroupId() == null ^ this.getEngineSecurityGroupId() == null)
            return false;
        if (other.getEngineSecurityGroupId() != null && other.getEngineSecurityGroupId().equals(this.getEngineSecurityGroupId()) == false)
            return false;
        if (other.getDefaultS3Location() == null ^ this.getDefaultS3Location() == null)
            return false;
        if (other.getDefaultS3Location() != null && other.getDefaultS3Location().equals(this.getDefaultS3Location()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAuthMode() == null) ? 0 : getAuthMode().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceSecurityGroupId() == null) ? 0 : getWorkspaceSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getEngineSecurityGroupId() == null) ? 0 : getEngineSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getDefaultS3Location() == null) ? 0 : getDefaultS3Location().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStudioRequest clone() {
        return (CreateStudioRequest) super.clone();
    }

}
