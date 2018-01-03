/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageBuilderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the image used to create the builder.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The instance type to use when launching the image builder.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The description for display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image builder name for display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The information needed to join a Microsoft Active Directory domain.
     * </p>
     */
    private DomainJoinInfo domainJoinInfo;
    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     */
    private String appstreamAgentVersion;

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @param name
     *        A unique name for the image builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @return A unique name for the image builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the image builder.
     * </p>
     * 
     * @param name
     *        A unique name for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the image used to create the builder.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the builder.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image used to create the builder.
     * </p>
     * 
     * @return The name of the image used to create the builder.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image used to create the builder.
     * </p>
     * 
     * @param imageName
     *        The name of the image used to create the builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder.
     * </p>
     * 
     * @param instanceType
     *        The instance type to use when launching the image builder.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder.
     * </p>
     * 
     * @return The instance type to use when launching the image builder.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to use when launching the image builder.
     * </p>
     * 
     * @param instanceType
     *        The instance type to use when launching the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @return The description for display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image builder name for display.
     * </p>
     * 
     * @param displayName
     *        The image builder name for display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The image builder name for display.
     * </p>
     * 
     * @return The image builder name for display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The image builder name for display.
     * </p>
     * 
     * @param displayName
     *        The image builder name for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the image builder. You can specify only one subnet.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @return The VPC configuration for the image builder. You can specify only one subnet.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the image builder. You can specify only one subnet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the image builder. You can specify only one subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the image builder.
     * </p>
     * 
     * @return Enables or disables default internet access for the image builder.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The information needed to join a Microsoft Active Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The information needed to join a Microsoft Active Directory domain.
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * <p>
     * The information needed to join a Microsoft Active Directory domain.
     * </p>
     * 
     * @return The information needed to join a Microsoft Active Directory domain.
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * <p>
     * The information needed to join a Microsoft Active Directory domain.
     * </p>
     * 
     * @param domainJoinInfo
     *        The information needed to join a Microsoft Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *        AppStream 2.0 agent, specify [LATEST].
     */

    public void setAppstreamAgentVersion(String appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @return The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *         AppStream 2.0 agent, specify [LATEST].
     */

    public String getAppstreamAgentVersion() {
        return this.appstreamAgentVersion;
    }

    /**
     * <p>
     * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream
     * 2.0 agent, specify [LATEST].
     * </p>
     * 
     * @param appstreamAgentVersion
     *        The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the
     *        AppStream 2.0 agent, specify [LATEST].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderRequest withAppstreamAgentVersion(String appstreamAgentVersion) {
        setAppstreamAgentVersion(appstreamAgentVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getAppstreamAgentVersion() != null)
            sb.append("AppstreamAgentVersion: ").append(getAppstreamAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageBuilderRequest == false)
            return false;
        CreateImageBuilderRequest other = (CreateImageBuilderRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getAppstreamAgentVersion() == null ^ this.getAppstreamAgentVersion() == null)
            return false;
        if (other.getAppstreamAgentVersion() != null && other.getAppstreamAgentVersion().equals(this.getAppstreamAgentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getAppstreamAgentVersion() == null) ? 0 : getAppstreamAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageBuilderRequest clone() {
        return (CreateImageBuilderRequest) super.clone();
    }

}
