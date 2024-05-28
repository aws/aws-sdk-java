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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings defaultUserSettings;
    /**
     * <p>
     * A collection of <code>DomainSettings</code> configuration values to update.
     * </p>
     */
    private DomainSettingsForUpdate domainSettingsForUpdate;
    /**
     * <p>
     * The entity that creates and manages the required security groups for inter-app communication in
     * <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is <code>VPCOnly</code>
     * and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting up
     * the domain for use with RStudio, this value must be set to <code>Service</code>.
     * </p>
     */
    private String appSecurityGroupManagement;
    /**
     * <p>
     * The default settings used to create a space within the domain.
     * </p>
     */
    private DefaultSpaceSettings defaultSpaceSettings;
    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     * <code>Deleting</code> state.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This configuration can only be modified if there are no apps in the <code>InService</code>, <code>Pending</code>,
     * or <code>Deleting</code> state. The configuration cannot be updated if
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of the same
     * request.
     * </p>
     */
    private String appNetworkAccessType;

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @return The ID of the domain to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        A collection of settings.
     */

    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @return A collection of settings.
     */

    public UserSettings getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        A collection of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        setDefaultUserSettings(defaultUserSettings);
        return this;
    }

    /**
     * <p>
     * A collection of <code>DomainSettings</code> configuration values to update.
     * </p>
     * 
     * @param domainSettingsForUpdate
     *        A collection of <code>DomainSettings</code> configuration values to update.
     */

    public void setDomainSettingsForUpdate(DomainSettingsForUpdate domainSettingsForUpdate) {
        this.domainSettingsForUpdate = domainSettingsForUpdate;
    }

    /**
     * <p>
     * A collection of <code>DomainSettings</code> configuration values to update.
     * </p>
     * 
     * @return A collection of <code>DomainSettings</code> configuration values to update.
     */

    public DomainSettingsForUpdate getDomainSettingsForUpdate() {
        return this.domainSettingsForUpdate;
    }

    /**
     * <p>
     * A collection of <code>DomainSettings</code> configuration values to update.
     * </p>
     * 
     * @param domainSettingsForUpdate
     *        A collection of <code>DomainSettings</code> configuration values to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDomainSettingsForUpdate(DomainSettingsForUpdate domainSettingsForUpdate) {
        setDomainSettingsForUpdate(domainSettingsForUpdate);
        return this;
    }

    /**
     * <p>
     * The entity that creates and manages the required security groups for inter-app communication in
     * <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is <code>VPCOnly</code>
     * and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting up
     * the domain for use with RStudio, this value must be set to <code>Service</code>.
     * </p>
     * 
     * @param appSecurityGroupManagement
     *        The entity that creates and manages the required security groups for inter-app communication in
     *        <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is
     *        <code>VPCOnly</code> and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code>
     *        is provided. If setting up the domain for use with RStudio, this value must be set to <code>Service</code>
     *        .
     * @see AppSecurityGroupManagement
     */

    public void setAppSecurityGroupManagement(String appSecurityGroupManagement) {
        this.appSecurityGroupManagement = appSecurityGroupManagement;
    }

    /**
     * <p>
     * The entity that creates and manages the required security groups for inter-app communication in
     * <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is <code>VPCOnly</code>
     * and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting up
     * the domain for use with RStudio, this value must be set to <code>Service</code>.
     * </p>
     * 
     * @return The entity that creates and manages the required security groups for inter-app communication in
     *         <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is
     *         <code>VPCOnly</code> and
     *         <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting
     *         up the domain for use with RStudio, this value must be set to <code>Service</code>.
     * @see AppSecurityGroupManagement
     */

    public String getAppSecurityGroupManagement() {
        return this.appSecurityGroupManagement;
    }

    /**
     * <p>
     * The entity that creates and manages the required security groups for inter-app communication in
     * <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is <code>VPCOnly</code>
     * and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting up
     * the domain for use with RStudio, this value must be set to <code>Service</code>.
     * </p>
     * 
     * @param appSecurityGroupManagement
     *        The entity that creates and manages the required security groups for inter-app communication in
     *        <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is
     *        <code>VPCOnly</code> and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code>
     *        is provided. If setting up the domain for use with RStudio, this value must be set to <code>Service</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppSecurityGroupManagement
     */

    public UpdateDomainRequest withAppSecurityGroupManagement(String appSecurityGroupManagement) {
        setAppSecurityGroupManagement(appSecurityGroupManagement);
        return this;
    }

    /**
     * <p>
     * The entity that creates and manages the required security groups for inter-app communication in
     * <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is <code>VPCOnly</code>
     * and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided. If setting up
     * the domain for use with RStudio, this value must be set to <code>Service</code>.
     * </p>
     * 
     * @param appSecurityGroupManagement
     *        The entity that creates and manages the required security groups for inter-app communication in
     *        <code>VPCOnly</code> mode. Required when <code>CreateDomain.AppNetworkAccessType</code> is
     *        <code>VPCOnly</code> and <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code>
     *        is provided. If setting up the domain for use with RStudio, this value must be set to <code>Service</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppSecurityGroupManagement
     */

    public UpdateDomainRequest withAppSecurityGroupManagement(AppSecurityGroupManagement appSecurityGroupManagement) {
        this.appSecurityGroupManagement = appSecurityGroupManagement.toString();
        return this;
    }

    /**
     * <p>
     * The default settings used to create a space within the domain.
     * </p>
     * 
     * @param defaultSpaceSettings
     *        The default settings used to create a space within the domain.
     */

    public void setDefaultSpaceSettings(DefaultSpaceSettings defaultSpaceSettings) {
        this.defaultSpaceSettings = defaultSpaceSettings;
    }

    /**
     * <p>
     * The default settings used to create a space within the domain.
     * </p>
     * 
     * @return The default settings used to create a space within the domain.
     */

    public DefaultSpaceSettings getDefaultSpaceSettings() {
        return this.defaultSpaceSettings;
    }

    /**
     * <p>
     * The default settings used to create a space within the domain.
     * </p>
     * 
     * @param defaultSpaceSettings
     *        The default settings used to create a space within the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDefaultSpaceSettings(DefaultSpaceSettings defaultSpaceSettings) {
        setDefaultSpaceSettings(defaultSpaceSettings);
        return this;
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     * <code>Deleting</code> state.
     * </p>
     * 
     * @return The VPC subnets that Studio uses for communication.</p>
     *         <p>
     *         If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     *         <code>Deleting</code> state.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     * <code>Deleting</code> state.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.</p>
     *        <p>
     *        If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     *        <code>Deleting</code> state.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     * <code>Deleting</code> state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.</p>
     *        <p>
     *        If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     *        <code>Deleting</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     * <code>Deleting</code> state.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.</p>
     *        <p>
     *        If removing subnets, ensure there are no apps in the <code>InService</code>, <code>Pending</code>, or
     *        <code>Deleting</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This configuration can only be modified if there are no apps in the <code>InService</code>, <code>Pending</code>,
     * or <code>Deleting</code> state. The configuration cannot be updated if
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of the same
     * request.
     * </p>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This configuration can only be modified if there are no apps in the <code>InService</code>,
     *        <code>Pending</code>, or <code>Deleting</code> state. The configuration cannot be updated if
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of
     *        the same request.
     * @see AppNetworkAccessType
     */

    public void setAppNetworkAccessType(String appNetworkAccessType) {
        this.appNetworkAccessType = appNetworkAccessType;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This configuration can only be modified if there are no apps in the <code>InService</code>, <code>Pending</code>,
     * or <code>Deleting</code> state. The configuration cannot be updated if
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of the same
     * request.
     * </p>
     * 
     * @return Specifies the VPC used for non-EFS traffic.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *         allows direct internet access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This configuration can only be modified if there are no apps in the <code>InService</code>,
     *         <code>Pending</code>, or <code>Deleting</code> state. The configuration cannot be updated if
     *         <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     *         <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of
     *         the same request.
     * @see AppNetworkAccessType
     */

    public String getAppNetworkAccessType() {
        return this.appNetworkAccessType;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This configuration can only be modified if there are no apps in the <code>InService</code>, <code>Pending</code>,
     * or <code>Deleting</code> state. The configuration cannot be updated if
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of the same
     * request.
     * </p>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This configuration can only be modified if there are no apps in the <code>InService</code>,
     *        <code>Pending</code>, or <code>Deleting</code> state. The configuration cannot be updated if
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of
     *        the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppNetworkAccessType
     */

    public UpdateDomainRequest withAppNetworkAccessType(String appNetworkAccessType) {
        setAppNetworkAccessType(appNetworkAccessType);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This configuration can only be modified if there are no apps in the <code>InService</code>, <code>Pending</code>,
     * or <code>Deleting</code> state. The configuration cannot be updated if
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     * <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of the same
     * request.
     * </p>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This configuration can only be modified if there are no apps in the <code>InService</code>,
     *        <code>Pending</code>, or <code>Deleting</code> state. The configuration cannot be updated if
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is already set or
     *        <code>DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn</code> is provided as part of
     *        the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppNetworkAccessType
     */

    public UpdateDomainRequest withAppNetworkAccessType(AppNetworkAccessType appNetworkAccessType) {
        this.appNetworkAccessType = appNetworkAccessType.toString();
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: ").append(getDefaultUserSettings()).append(",");
        if (getDomainSettingsForUpdate() != null)
            sb.append("DomainSettingsForUpdate: ").append(getDomainSettingsForUpdate()).append(",");
        if (getAppSecurityGroupManagement() != null)
            sb.append("AppSecurityGroupManagement: ").append(getAppSecurityGroupManagement()).append(",");
        if (getDefaultSpaceSettings() != null)
            sb.append("DefaultSpaceSettings: ").append(getDefaultSpaceSettings()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getAppNetworkAccessType() != null)
            sb.append("AppNetworkAccessType: ").append(getAppNetworkAccessType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainRequest == false)
            return false;
        UpdateDomainRequest other = (UpdateDomainRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        if (other.getDomainSettingsForUpdate() == null ^ this.getDomainSettingsForUpdate() == null)
            return false;
        if (other.getDomainSettingsForUpdate() != null && other.getDomainSettingsForUpdate().equals(this.getDomainSettingsForUpdate()) == false)
            return false;
        if (other.getAppSecurityGroupManagement() == null ^ this.getAppSecurityGroupManagement() == null)
            return false;
        if (other.getAppSecurityGroupManagement() != null && other.getAppSecurityGroupManagement().equals(this.getAppSecurityGroupManagement()) == false)
            return false;
        if (other.getDefaultSpaceSettings() == null ^ this.getDefaultSpaceSettings() == null)
            return false;
        if (other.getDefaultSpaceSettings() != null && other.getDefaultSpaceSettings().equals(this.getDefaultSpaceSettings()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getAppNetworkAccessType() == null ^ this.getAppNetworkAccessType() == null)
            return false;
        if (other.getAppNetworkAccessType() != null && other.getAppNetworkAccessType().equals(this.getAppNetworkAccessType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        hashCode = prime * hashCode + ((getDomainSettingsForUpdate() == null) ? 0 : getDomainSettingsForUpdate().hashCode());
        hashCode = prime * hashCode + ((getAppSecurityGroupManagement() == null) ? 0 : getAppSecurityGroupManagement().hashCode());
        hashCode = prime * hashCode + ((getDefaultSpaceSettings() == null) ? 0 : getDefaultSpaceSettings().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getAppNetworkAccessType() == null) ? 0 : getAppNetworkAccessType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainRequest clone() {
        return (UpdateDomainRequest) super.clone();
    }

}
