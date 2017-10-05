/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ImageBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageBuilder implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String arn;

    private String imageArn;

    private String description;

    private String displayName;

    private VpcConfig vpcConfig;

    private String instanceType;

    private String platform;

    private String state;

    private ImageBuilderStateChangeReason stateChangeReason;

    private java.util.Date createdTime;

    private Boolean enableDefaultInternetAccess;

    private DomainJoinInfo domainJoinInfo;

    private java.util.List<ResourceError> imageBuilderErrors;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param imageArn
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * @return
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * @param imageArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageArn(String imageArn) {
        setImageArn(imageArn);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param displayName
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @param displayName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * @param instanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * @return
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @param instanceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * @param platform
     * @see PlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return
     * @see PlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * @param platform
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public ImageBuilder withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * @param platform
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public ImageBuilder withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * @param state
     * @see ImageBuilderState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ImageBuilderState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBuilderState
     */

    public ImageBuilder withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBuilderState
     */

    public ImageBuilder withState(ImageBuilderState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param stateChangeReason
     */

    public void setStateChangeReason(ImageBuilderStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * @return
     */

    public ImageBuilderStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * @param stateChangeReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withStateChangeReason(ImageBuilderStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * @param createdTime
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @param createdTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * @param enableDefaultInternetAccess
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * @return
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * @param enableDefaultInternetAccess
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * @param domainJoinInfo
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * @return
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * @param domainJoinInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ResourceError> getImageBuilderErrors() {
        return imageBuilderErrors;
    }

    /**
     * @param imageBuilderErrors
     */

    public void setImageBuilderErrors(java.util.Collection<ResourceError> imageBuilderErrors) {
        if (imageBuilderErrors == null) {
            this.imageBuilderErrors = null;
            return;
        }

        this.imageBuilderErrors = new java.util.ArrayList<ResourceError>(imageBuilderErrors);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageBuilderErrors(java.util.Collection)} or {@link #withImageBuilderErrors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param imageBuilderErrors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageBuilderErrors(ResourceError... imageBuilderErrors) {
        if (this.imageBuilderErrors == null) {
            setImageBuilderErrors(new java.util.ArrayList<ResourceError>(imageBuilderErrors.length));
        }
        for (ResourceError ele : imageBuilderErrors) {
            this.imageBuilderErrors.add(ele);
        }
        return this;
    }

    /**
     * @param imageBuilderErrors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBuilder withImageBuilderErrors(java.util.Collection<ResourceError> imageBuilderErrors) {
        setImageBuilderErrors(imageBuilderErrors);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getImageBuilderErrors() != null)
            sb.append("ImageBuilderErrors: ").append(getImageBuilderErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageBuilder == false)
            return false;
        ImageBuilder other = (ImageBuilder) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
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
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getImageBuilderErrors() == null ^ this.getImageBuilderErrors() == null)
            return false;
        if (other.getImageBuilderErrors() != null && other.getImageBuilderErrors().equals(this.getImageBuilderErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getImageBuilderErrors() == null) ? 0 : getImageBuilderErrors().hashCode());
        return hashCode;
    }

    @Override
    public ImageBuilder clone() {
        try {
            return (ImageBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ImageBuilderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
