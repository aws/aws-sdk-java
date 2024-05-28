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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrganizationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector that configures the delegated administrator.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Represents whether or not to automatically enable member accounts in the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results. You must provide a value for either <code>autoEnableOrganizationMembers</code> or
     * <code>autoEnable</code>.
     * </p>
     */
    @Deprecated
    private Boolean autoEnable;
    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     */
    @Deprecated
    private OrganizationDataSourceConfigurations dataSources;
    /**
     * <p>
     * A list of features that will be configured for the organization.
     * </p>
     */
    private java.util.List<OrganizationFeatureConfiguration> features;
    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You must
     * provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * </p>
     * <p>
     * Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty enabled
     * automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically. This
     * includes <code>NEW</code> accounts that join the organization and accounts that may have been suspended or
     * removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     * organization. The administrator must manage GuardDuty for each account in the organization individually.
     * </p>
     * <p>
     * When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>, this
     * action doesn't disable the corresponding option for your existing accounts. This configuration will apply to the
     * new accounts that join the organization. After you update the auto-enable settings, no new account will have the
     * corresponding option as enabled.
     * </p>
     * </li>
     * </ul>
     */
    private String autoEnableOrganizationMembers;

    /**
     * <p>
     * The ID of the detector that configures the delegated administrator.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that configures the delegated administrator.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector that configures the delegated administrator.
     * </p>
     * 
     * @return The ID of the detector that configures the delegated administrator.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector that configures the delegated administrator.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector that configures the delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Represents whether or not to automatically enable member accounts in the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results. You must provide a value for either <code>autoEnableOrganizationMembers</code> or
     * <code>autoEnable</code>.
     * </p>
     * 
     * @param autoEnable
     *        Represents whether or not to automatically enable member accounts in the organization.</p>
     *        <p>
     *        Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *        achieve the similar results. You must provide a value for either
     *        <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     */
    @Deprecated
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Represents whether or not to automatically enable member accounts in the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results. You must provide a value for either <code>autoEnableOrganizationMembers</code> or
     * <code>autoEnable</code>.
     * </p>
     * 
     * @return Represents whether or not to automatically enable member accounts in the organization.</p>
     *         <p>
     *         Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *         achieve the similar results. You must provide a value for either
     *         <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     */
    @Deprecated
    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Represents whether or not to automatically enable member accounts in the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results. You must provide a value for either <code>autoEnableOrganizationMembers</code> or
     * <code>autoEnable</code>.
     * </p>
     * 
     * @param autoEnable
     *        Represents whether or not to automatically enable member accounts in the organization.</p>
     *        <p>
     *        Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *        achieve the similar results. You must provide a value for either
     *        <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateOrganizationConfigurationRequest withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Represents whether or not to automatically enable member accounts in the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results. You must provide a value for either <code>autoEnableOrganizationMembers</code> or
     * <code>autoEnable</code>.
     * </p>
     * 
     * @return Represents whether or not to automatically enable member accounts in the organization.</p>
     *         <p>
     *         Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *         achieve the similar results. You must provide a value for either
     *         <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     */
    @Deprecated
    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.
     */
    @Deprecated
    public void setDataSources(OrganizationDataSourceConfigurations dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @return Describes which data sources will be updated.
     */
    @Deprecated
    public OrganizationDataSourceConfigurations getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateOrganizationConfigurationRequest withDataSources(OrganizationDataSourceConfigurations dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * A list of features that will be configured for the organization.
     * </p>
     * 
     * @return A list of features that will be configured for the organization.
     */

    public java.util.List<OrganizationFeatureConfiguration> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of features that will be configured for the organization.
     * </p>
     * 
     * @param features
     *        A list of features that will be configured for the organization.
     */

    public void setFeatures(java.util.Collection<OrganizationFeatureConfiguration> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<OrganizationFeatureConfiguration>(features);
    }

    /**
     * <p>
     * A list of features that will be configured for the organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        A list of features that will be configured for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withFeatures(OrganizationFeatureConfiguration... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<OrganizationFeatureConfiguration>(features.length));
        }
        for (OrganizationFeatureConfiguration ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of features that will be configured for the organization.
     * </p>
     * 
     * @param features
     *        A list of features that will be configured for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withFeatures(java.util.Collection<OrganizationFeatureConfiguration> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You must
     * provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * </p>
     * <p>
     * Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty enabled
     * automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically. This
     * includes <code>NEW</code> accounts that join the organization and accounts that may have been suspended or
     * removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     * organization. The administrator must manage GuardDuty for each account in the organization individually.
     * </p>
     * <p>
     * When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>, this
     * action doesn't disable the corresponding option for your existing accounts. This configuration will apply to the
     * new accounts that join the organization. After you update the auto-enable settings, no new account will have the
     * corresponding option as enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnableOrganizationMembers
     *        Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You
     *        must provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     *        </p>
     *        <p>
     *        Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty
     *        enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically.
     *        This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     *        suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     *        organization. The administrator must manage GuardDuty for each account in the organization individually.
     *        </p>
     *        <p>
     *        When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>,
     *        this action doesn't disable the corresponding option for your existing accounts. This configuration will
     *        apply to the new accounts that join the organization. After you update the auto-enable settings, no new
     *        account will have the corresponding option as enabled.
     *        </p>
     *        </li>
     * @see AutoEnableMembers
     */

    public void setAutoEnableOrganizationMembers(String autoEnableOrganizationMembers) {
        this.autoEnableOrganizationMembers = autoEnableOrganizationMembers;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You must
     * provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * </p>
     * <p>
     * Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty enabled
     * automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically. This
     * includes <code>NEW</code> accounts that join the organization and accounts that may have been suspended or
     * removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     * organization. The administrator must manage GuardDuty for each account in the organization individually.
     * </p>
     * <p>
     * When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>, this
     * action doesn't disable the corresponding option for your existing accounts. This configuration will apply to the
     * new accounts that join the organization. After you update the auto-enable settings, no new account will have the
     * corresponding option as enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You
     *         must provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     *         </p>
     *         <p>
     *         Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty
     *         enabled automatically.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically.
     *         This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     *         suspended or removed from the organization in GuardDuty.
     *         </p>
     *         <p>
     *         It may take up to 24 hours to update the configuration for all the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     *         organization. The administrator must manage GuardDuty for each account in the organization individually.
     *         </p>
     *         <p>
     *         When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>,
     *         this action doesn't disable the corresponding option for your existing accounts. This configuration will
     *         apply to the new accounts that join the organization. After you update the auto-enable settings, no new
     *         account will have the corresponding option as enabled.
     *         </p>
     *         </li>
     * @see AutoEnableMembers
     */

    public String getAutoEnableOrganizationMembers() {
        return this.autoEnableOrganizationMembers;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You must
     * provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * </p>
     * <p>
     * Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty enabled
     * automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically. This
     * includes <code>NEW</code> accounts that join the organization and accounts that may have been suspended or
     * removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     * organization. The administrator must manage GuardDuty for each account in the organization individually.
     * </p>
     * <p>
     * When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>, this
     * action doesn't disable the corresponding option for your existing accounts. This configuration will apply to the
     * new accounts that join the organization. After you update the auto-enable settings, no new account will have the
     * corresponding option as enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnableOrganizationMembers
     *        Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You
     *        must provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     *        </p>
     *        <p>
     *        Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty
     *        enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically.
     *        This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     *        suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     *        organization. The administrator must manage GuardDuty for each account in the organization individually.
     *        </p>
     *        <p>
     *        When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>,
     *        this action doesn't disable the corresponding option for your existing accounts. This configuration will
     *        apply to the new accounts that join the organization. After you update the auto-enable settings, no new
     *        account will have the corresponding option as enabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoEnableMembers
     */

    public UpdateOrganizationConfigurationRequest withAutoEnableOrganizationMembers(String autoEnableOrganizationMembers) {
        setAutoEnableOrganizationMembers(autoEnableOrganizationMembers);
        return this;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You must
     * provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     * </p>
     * <p>
     * Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty enabled
     * automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically. This
     * includes <code>NEW</code> accounts that join the organization and accounts that may have been suspended or
     * removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     * organization. The administrator must manage GuardDuty for each account in the organization individually.
     * </p>
     * <p>
     * When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>, this
     * action doesn't disable the corresponding option for your existing accounts. This configuration will apply to the
     * new accounts that join the organization. After you update the auto-enable settings, no new account will have the
     * corresponding option as enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnableOrganizationMembers
     *        Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. You
     *        must provide a value for either <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>.
     *        </p>
     *        <p>
     *        Use one of the following configuration values for <code>autoEnableOrganizationMembers</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty
     *        enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty enabled automatically.
     *        This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     *        suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty will not be automatically enabled for any account in the
     *        organization. The administrator must manage GuardDuty for each account in the organization individually.
     *        </p>
     *        <p>
     *        When you update the auto-enable setting from <code>ALL</code> or <code>NEW</code> to <code>NONE</code>,
     *        this action doesn't disable the corresponding option for your existing accounts. This configuration will
     *        apply to the new accounts that join the organization. After you update the auto-enable settings, no new
     *        account will have the corresponding option as enabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoEnableMembers
     */

    public UpdateOrganizationConfigurationRequest withAutoEnableOrganizationMembers(AutoEnableMembers autoEnableOrganizationMembers) {
        this.autoEnableOrganizationMembers = autoEnableOrganizationMembers.toString();
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getAutoEnableOrganizationMembers() != null)
            sb.append("AutoEnableOrganizationMembers: ").append(getAutoEnableOrganizationMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationConfigurationRequest == false)
            return false;
        UpdateOrganizationConfigurationRequest other = (UpdateOrganizationConfigurationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getAutoEnableOrganizationMembers() == null ^ this.getAutoEnableOrganizationMembers() == null)
            return false;
        if (other.getAutoEnableOrganizationMembers() != null
                && other.getAutoEnableOrganizationMembers().equals(this.getAutoEnableOrganizationMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getAutoEnableOrganizationMembers() == null) ? 0 : getAutoEnableOrganizationMembers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrganizationConfigurationRequest clone() {
        return (UpdateOrganizationConfigurationRequest) super.clone();
    }

}
