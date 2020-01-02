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
 * Organization conformance pack creation or deletion status in each member account. This includes the name of the
 * conformance pack, the status, error code and error message when the conformance pack creation or deletion failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConformancePackDetailedStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConformancePackDetailedStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID of a member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of conformance pack deployed in the member account.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * An error code that is returned when conformance pack creation or deletion failed in the member account.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message indicating that conformance pack account creation or deletion has failed due to an error in the
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

    public OrganizationConformancePackDetailedStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of conformance pack deployed in the member account.
     * </p>
     * 
     * @param conformancePackName
     *        The name of conformance pack deployed in the member account.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * The name of conformance pack deployed in the member account.
     * </p>
     * 
     * @return The name of conformance pack deployed in the member account.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * The name of conformance pack deployed in the member account.
     * </p>
     * 
     * @param conformancePackName
     *        The name of conformance pack deployed in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackDetailedStatus withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @see OrganizationResourceDetailedStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status for conformance pack in a member account. When master account calls
     *         <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *         in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *         the second time, conformance pack status is updated in the member account. Conformance pack status is
     *         deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *         access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *         <p>
     *         AWS Config sets the state of the conformance pack to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *         </p>
     *         </li>
     * @see OrganizationResourceDetailedStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceDetailedStatus
     */

    public OrganizationConformancePackDetailedStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status for conformance pack in a member account. When master account calls
     * <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created in the
     * member account. When master account calls <code>PutOrganizationConformancePack</code> action for the second time,
     * conformance pack status is updated in the member account. Conformance pack status is deleted when the master
     * account deletes <code>OrganizationConformancePack</code> and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status for conformance pack in a member account. When master account calls
     *        <code>PutOrganizationConformancePack</code> action for the first time, conformance pack status is created
     *        in the member account. When master account calls <code>PutOrganizationConformancePack</code> action for
     *        the second time, conformance pack status is updated in the member account. Conformance pack status is
     *        deleted when the master account deletes <code>OrganizationConformancePack</code> and disables service
     *        access for <code>config-multiaccountsetup.amazonaws.com</code>. </p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when conformance pack has been created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when conformance pack is being created in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when conformance pack creation has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when conformance pack is being deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when conformance pack has been deleted in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when conformance pack has been updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when conformance pack is being updated in the member account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when conformance pack deletion has failed in the member account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceDetailedStatus
     */

    public OrganizationConformancePackDetailedStatus withStatus(OrganizationResourceDetailedStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error code that is returned when conformance pack creation or deletion failed in the member account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when conformance pack creation or deletion failed in the member account.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that is returned when conformance pack creation or deletion failed in the member account.
     * </p>
     * 
     * @return An error code that is returned when conformance pack creation or deletion failed in the member account.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that is returned when conformance pack creation or deletion failed in the member account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when conformance pack creation or deletion failed in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackDetailedStatus withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message indicating that conformance pack account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that conformance pack account creation or deletion has failed due to an error
     *        in the member account.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message indicating that conformance pack account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @return An error message indicating that conformance pack account creation or deletion has failed due to an error
     *         in the member account.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message indicating that conformance pack account creation or deletion has failed due to an error in the
     * member account.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that conformance pack account creation or deletion has failed due to an error
     *        in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackDetailedStatus withErrorMessage(String errorMessage) {
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

    public OrganizationConformancePackDetailedStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof OrganizationConformancePackDetailedStatus == false)
            return false;
        OrganizationConformancePackDetailedStatus other = (OrganizationConformancePackDetailedStatus) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConformancePackDetailedStatus clone() {
        try {
            return (OrganizationConformancePackDetailedStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConformancePackDetailedStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
