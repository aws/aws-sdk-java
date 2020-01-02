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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the status for an organization config rule in an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConfigRuleStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfigRuleStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you assign to organization config rule.
     * </p>
     */
    private String organizationConfigRuleName;
    /**
     * <p>
     * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule
     * action for the first time, config rule status is created in all the member accounts. When master account calls
     * PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts.
     * Additionally, config rule status is updated when one or more member accounts join or leave an organization.
     * Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts
     * and disables service access for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * </ul>
     */
    private String organizationRuleStatus;
    /**
     * <p>
     * An error code that is returned when organization config rule creation or deletion has failed.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message indicating that organization config rule creation or deletion failed due to an error.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The timestamp of the last update.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name that you assign to organization config rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name that you assign to organization config rule.
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * <p>
     * The name that you assign to organization config rule.
     * </p>
     * 
     * @return The name that you assign to organization config rule.
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * <p>
     * The name that you assign to organization config rule.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name that you assign to organization config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule
     * action for the first time, config rule status is created in all the member accounts. When master account calls
     * PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts.
     * Additionally, config rule status is updated when one or more member accounts join or leave an organization.
     * Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts
     * and disables service access for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationRuleStatus
     *        Indicates deployment status of an organization config rule. When master account calls
     *        PutOrganizationConfigRule action for the first time, config rule status is created in all the member
     *        accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule
     *        status is updated in all the member accounts. Additionally, config rule status is updated when one or more
     *        member accounts join or leave an organization. Config rule status is deleted when the master account
     *        deletes OrganizationConfigRule in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     * @see OrganizationRuleStatus
     */

    public void setOrganizationRuleStatus(String organizationRuleStatus) {
        this.organizationRuleStatus = organizationRuleStatus;
    }

    /**
     * <p>
     * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule
     * action for the first time, config rule status is created in all the member accounts. When master account calls
     * PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts.
     * Additionally, config rule status is updated when one or more member accounts join or leave an organization.
     * Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts
     * and disables service access for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status of an organization config rule. When master account calls
     *         PutOrganizationConfigRule action for the first time, config rule status is created in all the member
     *         accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule
     *         status is updated in all the member accounts. Additionally, config rule status is updated when one or
     *         more member accounts join or leave an organization. Config rule status is deleted when the master account
     *         deletes OrganizationConfigRule in all the member accounts and disables service access for
     *         <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *         <p>
     *         AWS Config sets the state of the rule to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the
     *         member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member
     *         accounts within that organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member
     *         accounts within that organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all
     *         the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the
     *         member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts
     *         within that organization.
     *         </p>
     *         </li>
     * @see OrganizationRuleStatus
     */

    public String getOrganizationRuleStatus() {
        return this.organizationRuleStatus;
    }

    /**
     * <p>
     * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule
     * action for the first time, config rule status is created in all the member accounts. When master account calls
     * PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts.
     * Additionally, config rule status is updated when one or more member accounts join or leave an organization.
     * Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts
     * and disables service access for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationRuleStatus
     *        Indicates deployment status of an organization config rule. When master account calls
     *        PutOrganizationConfigRule action for the first time, config rule status is created in all the member
     *        accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule
     *        status is updated in all the member accounts. Additionally, config rule status is updated when one or more
     *        member accounts join or leave an organization. Config rule status is deleted when the master account
     *        deletes OrganizationConfigRule in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationRuleStatus
     */

    public OrganizationConfigRuleStatus withOrganizationRuleStatus(String organizationRuleStatus) {
        setOrganizationRuleStatus(organizationRuleStatus);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule
     * action for the first time, config rule status is created in all the member accounts. When master account calls
     * PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts.
     * Additionally, config rule status is updated when one or more member accounts join or leave an organization.
     * Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts
     * and disables service access for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the member
     * accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts within
     * that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationRuleStatus
     *        Indicates deployment status of an organization config rule. When master account calls
     *        PutOrganizationConfigRule action for the first time, config rule status is created in all the member
     *        accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule
     *        status is updated in all the member accounts. Additionally, config rule status is updated when one or more
     *        member accounts join or leave an organization. Config rule status is deleted when the master account
     *        deletes OrganizationConfigRule in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization config rule has been successfully created in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization config rule creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization config rule creation failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization config rule deletion failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization config rule deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization config rule has been successfully deleted from all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization config rule has been successfully updated in all the
     *        member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization config rule update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization config rule update failed in one or more member accounts
     *        within that organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationRuleStatus
     */

    public OrganizationConfigRuleStatus withOrganizationRuleStatus(OrganizationRuleStatus organizationRuleStatus) {
        this.organizationRuleStatus = organizationRuleStatus.toString();
        return this;
    }

    /**
     * <p>
     * An error code that is returned when organization config rule creation or deletion has failed.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when organization config rule creation or deletion has failed.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that is returned when organization config rule creation or deletion has failed.
     * </p>
     * 
     * @return An error code that is returned when organization config rule creation or deletion has failed.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that is returned when organization config rule creation or deletion has failed.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when organization config rule creation or deletion has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message indicating that organization config rule creation or deletion failed due to an error.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that organization config rule creation or deletion failed due to an error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message indicating that organization config rule creation or deletion failed due to an error.
     * </p>
     * 
     * @return An error message indicating that organization config rule creation or deletion failed due to an error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message indicating that organization config rule creation or deletion failed due to an error.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that organization config rule creation or deletion failed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The timestamp of the last update.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The timestamp of the last update.
     * </p>
     * 
     * @return The timestamp of the last update.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The timestamp of the last update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The timestamp of the last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfigRuleStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getOrganizationConfigRuleName() != null)
            sb.append("OrganizationConfigRuleName: ").append(getOrganizationConfigRuleName()).append(",");
        if (getOrganizationRuleStatus() != null)
            sb.append("OrganizationRuleStatus: ").append(getOrganizationRuleStatus()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConfigRuleStatus == false)
            return false;
        OrganizationConfigRuleStatus other = (OrganizationConfigRuleStatus) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        if (other.getOrganizationRuleStatus() == null ^ this.getOrganizationRuleStatus() == null)
            return false;
        if (other.getOrganizationRuleStatus() != null && other.getOrganizationRuleStatus().equals(this.getOrganizationRuleStatus()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRuleStatus() == null) ? 0 : getOrganizationRuleStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConfigRuleStatus clone() {
        try {
            return (OrganizationConfigRuleStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConfigRuleStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
