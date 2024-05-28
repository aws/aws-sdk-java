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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results.
     * </p>
     */
    @Deprecated
    private Boolean autoEnable;
    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator account for your organization.
     * </p>
     */
    private Boolean memberAccountLimitReached;
    /**
     * <p>
     * Describes which data sources are enabled automatically for member accounts.
     * </p>
     */
    @Deprecated
    private OrganizationDataSourceConfigurationsResult dataSources;
    /**
     * <p>
     * A list of features that are configured for this organization.
     * </p>
     */
    private java.util.List<OrganizationFeatureConfigurationResult> features;
    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for the
     * member accounts in the organization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or any of
     * the corresponding protection plans enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the corresponding
     * protection plans enabled automatically. This includes <code>NEW</code> accounts that join the organization and
     * accounts that may have been suspended or removed from the organization in GuardDuty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     * automatically enabled for any account in the organization. The administrator must manage GuardDuty for each
     * account in the organization individually.
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
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether GuardDuty is automatically enabled for accounts added to the organization.</p>
     *        <p>
     *        Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *        achieve the similar results.
     */
    @Deprecated
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results.
     * </p>
     * 
     * @return Indicates whether GuardDuty is automatically enabled for accounts added to the organization.</p>
     *         <p>
     *         Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *         achieve the similar results.
     */
    @Deprecated
    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether GuardDuty is automatically enabled for accounts added to the organization.</p>
     *        <p>
     *        Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *        achieve the similar results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
     * </p>
     * <p>
     * Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to achieve the
     * similar results.
     * </p>
     * 
     * @return Indicates whether GuardDuty is automatically enabled for accounts added to the organization.</p>
     *         <p>
     *         Even though this is still supported, we recommend using <code>AutoEnableOrganizationMembers</code> to
     *         achieve the similar results.
     */
    @Deprecated
    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator account for your organization.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *        administrator account for your organization.
     */

    public void setMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        this.memberAccountLimitReached = memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator account for your organization.
     * </p>
     * 
     * @return Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *         administrator account for your organization.
     */

    public Boolean getMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator account for your organization.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *        administrator account for your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        setMemberAccountLimitReached(memberAccountLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     * administrator account for your organization.
     * </p>
     * 
     * @return Indicates whether the maximum number of allowed member accounts are already associated with the delegated
     *         administrator account for your organization.
     */

    public Boolean isMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
    }

    /**
     * <p>
     * Describes which data sources are enabled automatically for member accounts.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are enabled automatically for member accounts.
     */
    @Deprecated
    public void setDataSources(OrganizationDataSourceConfigurationsResult dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources are enabled automatically for member accounts.
     * </p>
     * 
     * @return Describes which data sources are enabled automatically for member accounts.
     */
    @Deprecated
    public OrganizationDataSourceConfigurationsResult getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources are enabled automatically for member accounts.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are enabled automatically for member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DescribeOrganizationConfigurationResult withDataSources(OrganizationDataSourceConfigurationsResult dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * A list of features that are configured for this organization.
     * </p>
     * 
     * @return A list of features that are configured for this organization.
     */

    public java.util.List<OrganizationFeatureConfigurationResult> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of features that are configured for this organization.
     * </p>
     * 
     * @param features
     *        A list of features that are configured for this organization.
     */

    public void setFeatures(java.util.Collection<OrganizationFeatureConfigurationResult> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<OrganizationFeatureConfigurationResult>(features);
    }

    /**
     * <p>
     * A list of features that are configured for this organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        A list of features that are configured for this organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withFeatures(OrganizationFeatureConfigurationResult... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<OrganizationFeatureConfigurationResult>(features.length));
        }
        for (OrganizationFeatureConfigurationResult ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of features that are configured for this organization.
     * </p>
     * 
     * @param features
     *        A list of features that are configured for this organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withFeatures(java.util.Collection<OrganizationFeatureConfigurationResult> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for the
     * member accounts in the organization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or any of
     * the corresponding protection plans enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the corresponding
     * protection plans enabled automatically. This includes <code>NEW</code> accounts that join the organization and
     * accounts that may have been suspended or removed from the organization in GuardDuty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     * automatically enabled for any account in the organization. The administrator must manage GuardDuty for each
     * account in the organization individually.
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
     *        Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for
     *        the member accounts in the organization.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or
     *        any of the corresponding protection plans enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the
     *        corresponding protection plans enabled automatically. This includes <code>NEW</code> accounts that join
     *        the organization and accounts that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     *        automatically enabled for any account in the organization. The administrator must manage GuardDuty for
     *        each account in the organization individually.
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
     * Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for the
     * member accounts in the organization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or any of
     * the corresponding protection plans enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the corresponding
     * protection plans enabled automatically. This includes <code>NEW</code> accounts that join the organization and
     * accounts that may have been suspended or removed from the organization in GuardDuty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     * automatically enabled for any account in the organization. The administrator must manage GuardDuty for each
     * account in the organization individually.
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
     * @return Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for
     *         the member accounts in the organization.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or
     *         any of the corresponding protection plans enabled automatically.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the
     *         corresponding protection plans enabled automatically. This includes <code>NEW</code> accounts that join
     *         the organization and accounts that may have been suspended or removed from the organization in GuardDuty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     *         automatically enabled for any account in the organization. The administrator must manage GuardDuty for
     *         each account in the organization individually.
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
     * Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for the
     * member accounts in the organization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or any of
     * the corresponding protection plans enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the corresponding
     * protection plans enabled automatically. This includes <code>NEW</code> accounts that join the organization and
     * accounts that may have been suspended or removed from the organization in GuardDuty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     * automatically enabled for any account in the organization. The administrator must manage GuardDuty for each
     * account in the organization individually.
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
     *        Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for
     *        the member accounts in the organization.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or
     *        any of the corresponding protection plans enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the
     *        corresponding protection plans enabled automatically. This includes <code>NEW</code> accounts that join
     *        the organization and accounts that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     *        automatically enabled for any account in the organization. The administrator must manage GuardDuty for
     *        each account in the organization individually.
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

    public DescribeOrganizationConfigurationResult withAutoEnableOrganizationMembers(String autoEnableOrganizationMembers) {
        setAutoEnableOrganizationMembers(autoEnableOrganizationMembers);
        return this;
    }

    /**
     * <p>
     * Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for the
     * member accounts in the organization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or any of
     * the corresponding protection plans enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the corresponding
     * protection plans enabled automatically. This includes <code>NEW</code> accounts that join the organization and
     * accounts that may have been suspended or removed from the organization in GuardDuty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     * automatically enabled for any account in the organization. The administrator must manage GuardDuty for each
     * account in the organization individually.
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
     *        Indicates the auto-enablement configuration of GuardDuty or any of the corresponding protection plans for
     *        the member accounts in the organization.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have GuardDuty or
     *        any of the corresponding protection plans enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have GuardDuty and any of the
     *        corresponding protection plans enabled automatically. This includes <code>NEW</code> accounts that join
     *        the organization and accounts that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that GuardDuty or any of the corresponding protection plans will not be
     *        automatically enabled for any account in the organization. The administrator must manage GuardDuty for
     *        each account in the organization individually.
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

    public DescribeOrganizationConfigurationResult withAutoEnableOrganizationMembers(AutoEnableMembers autoEnableOrganizationMembers) {
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
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getMemberAccountLimitReached() != null)
            sb.append("MemberAccountLimitReached: ").append(getMemberAccountLimitReached()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof DescribeOrganizationConfigurationResult == false)
            return false;
        DescribeOrganizationConfigurationResult other = (DescribeOrganizationConfigurationResult) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getMemberAccountLimitReached() == null ^ this.getMemberAccountLimitReached() == null)
            return false;
        if (other.getMemberAccountLimitReached() != null && other.getMemberAccountLimitReached().equals(this.getMemberAccountLimitReached()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountLimitReached() == null) ? 0 : getMemberAccountLimitReached().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAutoEnableOrganizationMembers() == null) ? 0 : getAutoEnableOrganizationMembers().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigurationResult clone() {
        try {
            return (DescribeOrganizationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
