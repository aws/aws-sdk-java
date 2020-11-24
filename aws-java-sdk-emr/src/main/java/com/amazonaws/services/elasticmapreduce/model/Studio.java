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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an Amazon EMR Studio including ID, creation time, name, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Studio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Studio implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the EMR Studio.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * </p>
     */
    private String studioArn;
    /**
     * <p>
     * The name of the EMR Studio.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * </p>
     */
    private String authMode;
    /**
     * <p>
     * The ID of the VPC associated with the EMR Studio.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The list of IDs of the subnets associated with the Amazon EMR Studio.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The name of the IAM role assumed by the Amazon EMR Studio.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     * </p>
     */
    private String userRole;
    /**
     * <p>
     * The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group allows
     * outbound network traffic to resources in the Engine security group and to the internet.
     * </p>
     */
    private String workspaceSecurityGroupId;
    /**
     * <p>
     * The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group allows
     * inbound network traffic from resources in the Workspace security group.
     * </p>
     */
    private String engineSecurityGroupId;
    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The time the Amazon EMR Studio was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * </p>
     */
    private String defaultS3Location;
    /**
     * <p>
     * A list of tags associated with the Amazon EMR Studio.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the EMR Studio.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the EMR Studio.
     * </p>
     * 
     * @return The ID of the EMR Studio.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * </p>
     * 
     * @param studioArn
     *        The Amazon Resource Name (ARN) of the EMR Studio.
     */

    public void setStudioArn(String studioArn) {
        this.studioArn = studioArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the EMR Studio.
     */

    public String getStudioArn() {
        return this.studioArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EMR Studio.
     * </p>
     * 
     * @param studioArn
     *        The Amazon Resource Name (ARN) of the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withStudioArn(String studioArn) {
        setStudioArn(studioArn);
        return this;
    }

    /**
     * <p>
     * The name of the EMR Studio.
     * </p>
     * 
     * @param name
     *        The name of the EMR Studio.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the EMR Studio.
     * </p>
     * 
     * @return The name of the EMR Studio.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the EMR Studio.
     * </p>
     * 
     * @param name
     *        The name of the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @param description
     *        The detailed description of the EMR Studio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @return The detailed description of the EMR Studio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The detailed description of the EMR Studio.
     * </p>
     * 
     * @param description
     *        The detailed description of the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * @see AuthMode
     */

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * </p>
     * 
     * @return Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * @see AuthMode
     */

    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public Studio withAuthMode(String authMode) {
        setAuthMode(authMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * </p>
     * 
     * @param authMode
     *        Specifies whether the Studio authenticates users using single sign-on (SSO) or IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public Studio withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC associated with the EMR Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC associated with the EMR Studio.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC associated with the EMR Studio.
     * </p>
     * 
     * @return The ID of the VPC associated with the EMR Studio.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC associated with the EMR Studio.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC associated with the EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The list of IDs of the subnets associated with the Amazon EMR Studio.
     * </p>
     * 
     * @return The list of IDs of the subnets associated with the Amazon EMR Studio.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The list of IDs of the subnets associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param subnetIds
     *        The list of IDs of the subnets associated with the Amazon EMR Studio.
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
     * The list of IDs of the subnets associated with the Amazon EMR Studio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of IDs of the subnets associated with the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withSubnetIds(String... subnetIds) {
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
     * The list of IDs of the subnets associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param subnetIds
     *        The list of IDs of the subnets associated with the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role assumed by the Amazon EMR Studio.
     * </p>
     * 
     * @param serviceRole
     *        The name of the IAM role assumed by the Amazon EMR Studio.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The name of the IAM role assumed by the Amazon EMR Studio.
     * </p>
     * 
     * @return The name of the IAM role assumed by the Amazon EMR Studio.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The name of the IAM role assumed by the Amazon EMR Studio.
     * </p>
     * 
     * @param serviceRole
     *        The name of the IAM role assumed by the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     * </p>
     * 
     * @param userRole
     *        The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     */

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     * </p>
     * 
     * @return The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     */

    public String getUserRole() {
        return this.userRole;
    }

    /**
     * <p>
     * The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     * </p>
     * 
     * @param userRole
     *        The name of the IAM role assumed by users logged in to the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withUserRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    /**
     * <p>
     * The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group allows
     * outbound network traffic to resources in the Engine security group and to the internet.
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group
     *        allows outbound network traffic to resources in the Engine security group and to the internet.
     */

    public void setWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group allows
     * outbound network traffic to resources in the Engine security group and to the internet.
     * </p>
     * 
     * @return The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security
     *         group allows outbound network traffic to resources in the Engine security group and to the internet.
     */

    public String getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group allows
     * outbound network traffic to resources in the Engine security group and to the internet.
     * </p>
     * 
     * @param workspaceSecurityGroupId
     *        The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group
     *        allows outbound network traffic to resources in the Engine security group and to the internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withWorkspaceSecurityGroupId(String workspaceSecurityGroupId) {
        setWorkspaceSecurityGroupId(workspaceSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group allows
     * inbound network traffic from resources in the Workspace security group.
     * </p>
     * 
     * @param engineSecurityGroupId
     *        The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group
     *        allows inbound network traffic from resources in the Workspace security group.
     */

    public void setEngineSecurityGroupId(String engineSecurityGroupId) {
        this.engineSecurityGroupId = engineSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group allows
     * inbound network traffic from resources in the Workspace security group.
     * </p>
     * 
     * @return The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group
     *         allows inbound network traffic from resources in the Workspace security group.
     */

    public String getEngineSecurityGroupId() {
        return this.engineSecurityGroupId;
    }

    /**
     * <p>
     * The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group allows
     * inbound network traffic from resources in the Workspace security group.
     * </p>
     * 
     * @param engineSecurityGroupId
     *        The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group
     *        allows inbound network traffic from resources in the Workspace security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withEngineSecurityGroupId(String engineSecurityGroupId) {
        setEngineSecurityGroupId(engineSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @param url
     *        The unique access URL of the Amazon EMR Studio.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @return The unique access URL of the Amazon EMR Studio.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The unique access URL of the Amazon EMR Studio.
     * </p>
     * 
     * @param url
     *        The unique access URL of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The time the Amazon EMR Studio was created.
     * </p>
     * 
     * @param creationTime
     *        The time the Amazon EMR Studio was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the Amazon EMR Studio was created.
     * </p>
     * 
     * @return The time the Amazon EMR Studio was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the Amazon EMR Studio was created.
     * </p>
     * 
     * @param creationTime
     *        The time the Amazon EMR Studio was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * </p>
     * 
     * @param defaultS3Location
     *        The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     */

    public void setDefaultS3Location(String defaultS3Location) {
        this.defaultS3Location = defaultS3Location;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * </p>
     * 
     * @return The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     */

    public String getDefaultS3Location() {
        return this.defaultS3Location;
    }

    /**
     * <p>
     * The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * </p>
     * 
     * @param defaultS3Location
     *        The default Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withDefaultS3Location(String defaultS3Location) {
        setDefaultS3Location(defaultS3Location);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the Amazon EMR Studio.
     * </p>
     * 
     * @return A list of tags associated with the Amazon EMR Studio.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Amazon EMR Studio.
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
     * A list of tags associated with the Amazon EMR Studio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withTags(Tag... tags) {
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
     * A list of tags associated with the Amazon EMR Studio.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Studio withTags(java.util.Collection<Tag> tags) {
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getStudioArn() != null)
            sb.append("StudioArn: ").append(getStudioArn()).append(",");
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof Studio == false)
            return false;
        Studio other = (Studio) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getStudioArn() == null ^ this.getStudioArn() == null)
            return false;
        if (other.getStudioArn() != null && other.getStudioArn().equals(this.getStudioArn()) == false)
            return false;
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
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getStudioArn() == null) ? 0 : getStudioArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAuthMode() == null) ? 0 : getAuthMode().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceSecurityGroupId() == null) ? 0 : getWorkspaceSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getEngineSecurityGroupId() == null) ? 0 : getEngineSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDefaultS3Location() == null) ? 0 : getDefaultS3Location().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Studio clone() {
        try {
            return (Studio) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StudioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
