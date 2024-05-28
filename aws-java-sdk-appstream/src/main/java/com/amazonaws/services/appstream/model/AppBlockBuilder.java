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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an app block builder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AppBlockBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppBlockBuilder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the app block builder.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the app block builder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the app block builder.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The instance type of the app block builder.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Indicates whether default internet access is enabled for the app block builder.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The ARN of the IAM role that is applied to the app block builder.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The state of the app block builder.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The creation time of the app block builder.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The app block builder errors.
     * </p>
     */
    private java.util.List<ResourceError> appBlockBuilderErrors;
    /**
     * <p>
     * The state change reason.
     * </p>
     */
    private AppBlockBuilderStateChangeReason stateChangeReason;
    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     */
    private java.util.List<AccessEndpoint> accessEndpoints;

    /**
     * <p>
     * The ARN of the app block builder.
     * </p>
     * 
     * @param arn
     *        The ARN of the app block builder.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the app block builder.
     * </p>
     * 
     * @return The ARN of the app block builder.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the app block builder.
     * </p>
     * 
     * @param arn
     *        The ARN of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @param name
     *        The name of the app block builder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @return The name of the app block builder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @param name
     *        The name of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block builder.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @return The display name of the app block builder.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the app block builder.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @param description
     *        The description of the app block builder.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @return The description of the app block builder.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the app block builder.
     * </p>
     * 
     * @param description
     *        The description of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @see AppBlockBuilderPlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @return The platform of the app block builder.</p>
     *         <p>
     *         <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @see AppBlockBuilderPlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderPlatformType
     */

    public AppBlockBuilder withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the app block builder.
     * </p>
     * <p>
     * <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * </p>
     * 
     * @param platform
     *        The platform of the app block builder.</p>
     *        <p>
     *        <code>WINDOWS_SERVER_2019</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderPlatformType
     */

    public AppBlockBuilder withPlatform(AppBlockBuilderPlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The instance type of the app block builder.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the app block builder.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the app block builder.
     * </p>
     * 
     * @return The instance type of the app block builder.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the app block builder.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the app block builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Indicates whether default internet access is enabled for the app block builder.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the app block builder.
     * </p>
     * 
     * @return Indicates whether default internet access is enabled for the app block builder.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the app block builder.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Indicates whether default internet access is enabled for the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether default internet access is enabled for the app block builder.
     * </p>
     * 
     * @return Indicates whether default internet access is enabled for the app block builder.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the app block builder.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the app block builder.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the app block builder.
     * </p>
     * 
     * @return The ARN of the IAM role that is applied to the app block builder.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that is applied to the app block builder.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that is applied to the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the app block builder.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * 
     * @return The VPC configuration for the app block builder.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the app block builder.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The state of the app block builder.
     * </p>
     * 
     * @param state
     *        The state of the app block builder.
     * @see AppBlockBuilderState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the app block builder.
     * </p>
     * 
     * @return The state of the app block builder.
     * @see AppBlockBuilderState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the app block builder.
     * </p>
     * 
     * @param state
     *        The state of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderState
     */

    public AppBlockBuilder withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the app block builder.
     * </p>
     * 
     * @param state
     *        The state of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppBlockBuilderState
     */

    public AppBlockBuilder withState(AppBlockBuilderState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the app block builder.
     * </p>
     * 
     * @param createdTime
     *        The creation time of the app block builder.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The creation time of the app block builder.
     * </p>
     * 
     * @return The creation time of the app block builder.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The creation time of the app block builder.
     * </p>
     * 
     * @param createdTime
     *        The creation time of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The app block builder errors.
     * </p>
     * 
     * @return The app block builder errors.
     */

    public java.util.List<ResourceError> getAppBlockBuilderErrors() {
        return appBlockBuilderErrors;
    }

    /**
     * <p>
     * The app block builder errors.
     * </p>
     * 
     * @param appBlockBuilderErrors
     *        The app block builder errors.
     */

    public void setAppBlockBuilderErrors(java.util.Collection<ResourceError> appBlockBuilderErrors) {
        if (appBlockBuilderErrors == null) {
            this.appBlockBuilderErrors = null;
            return;
        }

        this.appBlockBuilderErrors = new java.util.ArrayList<ResourceError>(appBlockBuilderErrors);
    }

    /**
     * <p>
     * The app block builder errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppBlockBuilderErrors(java.util.Collection)} or
     * {@link #withAppBlockBuilderErrors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param appBlockBuilderErrors
     *        The app block builder errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withAppBlockBuilderErrors(ResourceError... appBlockBuilderErrors) {
        if (this.appBlockBuilderErrors == null) {
            setAppBlockBuilderErrors(new java.util.ArrayList<ResourceError>(appBlockBuilderErrors.length));
        }
        for (ResourceError ele : appBlockBuilderErrors) {
            this.appBlockBuilderErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The app block builder errors.
     * </p>
     * 
     * @param appBlockBuilderErrors
     *        The app block builder errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withAppBlockBuilderErrors(java.util.Collection<ResourceError> appBlockBuilderErrors) {
        setAppBlockBuilderErrors(appBlockBuilderErrors);
        return this;
    }

    /**
     * <p>
     * The state change reason.
     * </p>
     * 
     * @param stateChangeReason
     *        The state change reason.
     */

    public void setStateChangeReason(AppBlockBuilderStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The state change reason.
     * </p>
     * 
     * @return The state change reason.
     */

    public AppBlockBuilderStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The state change reason.
     * </p>
     * 
     * @param stateChangeReason
     *        The state change reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withStateChangeReason(AppBlockBuilderStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @return The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *         block builder only through the specified endpoints.
     */

    public java.util.List<AccessEndpoint> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
     */

    public void setAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        if (accessEndpoints == null) {
            this.accessEndpoints = null;
            return;
        }

        this.accessEndpoints = new java.util.ArrayList<AccessEndpoint>(accessEndpoints);
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessEndpoints(java.util.Collection)} or {@link #withAccessEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withAccessEndpoints(AccessEndpoint... accessEndpoints) {
        if (this.accessEndpoints == null) {
            setAccessEndpoints(new java.util.ArrayList<AccessEndpoint>(accessEndpoints.length));
        }
        for (AccessEndpoint ele : accessEndpoints) {
            this.accessEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app block
     * builder only through the specified endpoints.
     * </p>
     * 
     * @param accessEndpoints
     *        The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the app
     *        block builder only through the specified endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBlockBuilder withAccessEndpoints(java.util.Collection<AccessEndpoint> accessEndpoints) {
        setAccessEndpoints(accessEndpoints);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getAppBlockBuilderErrors() != null)
            sb.append("AppBlockBuilderErrors: ").append(getAppBlockBuilderErrors()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getAccessEndpoints() != null)
            sb.append("AccessEndpoints: ").append(getAccessEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppBlockBuilder == false)
            return false;
        AppBlockBuilder other = (AppBlockBuilder) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getAppBlockBuilderErrors() == null ^ this.getAppBlockBuilderErrors() == null)
            return false;
        if (other.getAppBlockBuilderErrors() != null && other.getAppBlockBuilderErrors().equals(this.getAppBlockBuilderErrors()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getAccessEndpoints() == null ^ this.getAccessEndpoints() == null)
            return false;
        if (other.getAccessEndpoints() != null && other.getAccessEndpoints().equals(this.getAccessEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getAppBlockBuilderErrors() == null) ? 0 : getAppBlockBuilderErrors().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getAccessEndpoints() == null) ? 0 : getAccessEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public AppBlockBuilder clone() {
        try {
            return (AppBlockBuilder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.AppBlockBuilderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
