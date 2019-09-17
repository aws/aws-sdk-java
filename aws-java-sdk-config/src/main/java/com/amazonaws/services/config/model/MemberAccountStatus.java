/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Organization config rule creation or deletion status in each member account. This includes the name of the rule, the
 * status, error code and error message when the rule creation or deletion failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/MemberAccountStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberAccountStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID of a member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of config rule deployed in the member account.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * Indicates deployment status for config rule in the member account. When master account calls
     * <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the member
     * account. When master account calls <code>PutOrganizationConfigRule</code> action for the second time, config rule
     * status is updated in the member account. Config rule status is deleted when the master account deletes
     * <code>OrganizationConfigRule</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     */
    private String memberAccountRuleStatus;
    /**
     * <p>
     * An error code that is returned when config rule creation or deletion failed in the member account.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message indicating that config rule account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The timestamp of the last status update.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The 12-digit account ID of a member account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of a member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of a member account.
     * </p>
     * 
     * @return The 12-digit account ID of a member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of a member account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of config rule deployed in the member account.
     * </p>
     * 
     * @param configRuleName
     *        The name of config rule deployed in the member account.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of config rule deployed in the member account.
     * </p>
     * 
     * @return The name of config rule deployed in the member account.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of config rule deployed in the member account.
     * </p>
     * 
     * @param configRuleName
     *        The name of config rule deployed in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountStatus withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for config rule in the member account. When master account calls
     * <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the member
     * account. When master account calls <code>PutOrganizationConfigRule</code> action for the second time, config rule
     * status is updated in the member account. Config rule status is deleted when the master account deletes
     * <code>OrganizationConfigRule</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param memberAccountRuleStatus
     *        Indicates deployment status for config rule in the member account. When master account calls
     *        <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the
     *        member account. When master account calls <code>PutOrganizationConfigRule</code> action for the second
     *        time, config rule status is updated in the member account. Config rule status is deleted when the master
     *        account deletes <code>OrganizationConfigRule</code> and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     * @see MemberAccountRuleStatus
     */

    public void setMemberAccountRuleStatus(String memberAccountRuleStatus) {
        this.memberAccountRuleStatus = memberAccountRuleStatus;
    }

    /**
     * <p>
     * Indicates deployment status for config rule in the member account. When master account calls
     * <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the member
     * account. When master account calls <code>PutOrganizationConfigRule</code> action for the second time, config rule
     * status is updated in the member account. Config rule status is deleted when the master account deletes
     * <code>OrganizationConfigRule</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status for config rule in the member account. When master account calls
     *         <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the
     *         member account. When master account calls <code>PutOrganizationConfigRule</code> action for the second
     *         time, config rule status is updated in the member account. Config rule status is deleted when the master
     *         account deletes <code>OrganizationConfigRule</code> and disables service access for
     *         <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *         <p>
     *         AWS Config sets the state of the rule to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     *         </p>
     *         </li>
     * @see MemberAccountRuleStatus
     */

    public String getMemberAccountRuleStatus() {
        return this.memberAccountRuleStatus;
    }

    /**
     * <p>
     * Indicates deployment status for config rule in the member account. When master account calls
     * <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the member
     * account. When master account calls <code>PutOrganizationConfigRule</code> action for the second time, config rule
     * status is updated in the member account. Config rule status is deleted when the master account deletes
     * <code>OrganizationConfigRule</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param memberAccountRuleStatus
     *        Indicates deployment status for config rule in the member account. When master account calls
     *        <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the
     *        member account. When master account calls <code>PutOrganizationConfigRule</code> action for the second
     *        time, config rule status is updated in the member account. Config rule status is deleted when the master
     *        account deletes <code>OrganizationConfigRule</code> and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountRuleStatus
     */

    public MemberAccountStatus withMemberAccountRuleStatus(String memberAccountRuleStatus) {
        setMemberAccountRuleStatus(memberAccountRuleStatus);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for config rule in the member account. When master account calls
     * <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the member
     * account. When master account calls <code>PutOrganizationConfigRule</code> action for the second time, config rule
     * status is updated in the member account. Config rule status is deleted when the master account deletes
     * <code>OrganizationConfigRule</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the rule to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param memberAccountRuleStatus
     *        Indicates deployment status for config rule in the member account. When master account calls
     *        <code>PutOrganizationConfigRule</code> action for the first time, config rule status is created in the
     *        member account. When master account calls <code>PutOrganizationConfigRule</code> action for the second
     *        time, config rule status is updated in the member account. Config rule status is deleted when the master
     *        account deletes <code>OrganizationConfigRule</code> and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the rule to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when config rule has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when config rule is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when config rule creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when config rule is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when config rule has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when config rule has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when config rule is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when config rule deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountRuleStatus
     */

    public MemberAccountStatus withMemberAccountRuleStatus(MemberAccountRuleStatus memberAccountRuleStatus) {
        this.memberAccountRuleStatus = memberAccountRuleStatus.toString();
        return this;
    }

    /**
     * <p>
     * An error code that is returned when config rule creation or deletion failed in the member account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when config rule creation or deletion failed in the member account.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that is returned when config rule creation or deletion failed in the member account.
     * </p>
     * 
     * @return An error code that is returned when config rule creation or deletion failed in the member account.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that is returned when config rule creation or deletion failed in the member account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when config rule creation or deletion failed in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountStatus withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message indicating that config rule account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that config rule account creation or deletion has failed due to an error in
     *        the member account.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message indicating that config rule account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @return An error message indicating that config rule account creation or deletion has failed due to an error in
     *         the member account.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message indicating that config rule account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that config rule account creation or deletion has failed due to an error in
     *        the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountStatus withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last status update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The timestamp of the last status update.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The timestamp of the last status update.
     * </p>
     * 
     * @return The timestamp of the last status update.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The timestamp of the last status update.
     * </p>
     * 
     * @param lastUpdateTime
     *        The timestamp of the last status update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getMemberAccountRuleStatus() != null)
            sb.append("MemberAccountRuleStatus: ").append(getMemberAccountRuleStatus()).append(",");
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

        if (obj instanceof MemberAccountStatus == false)
            return false;
        MemberAccountStatus other = (MemberAccountStatus) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getMemberAccountRuleStatus() == null ^ this.getMemberAccountRuleStatus() == null)
            return false;
        if (other.getMemberAccountRuleStatus() != null && other.getMemberAccountRuleStatus().equals(this.getMemberAccountRuleStatus()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountRuleStatus() == null) ? 0 : getMemberAccountRuleStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public MemberAccountStatus clone() {
        try {
            return (MemberAccountStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.MemberAccountStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
