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
 * Returns the status for an organization conformance pack in an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConformancePackStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConformancePackStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you assign to organization conformance pack.
     * </p>
     */
    private String organizationConformancePackName;
    /**
     * <p>
     * Indicates deployment status of an organization conformance pack. When master account calls
     * PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts.
     * When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated
     * in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts
     * join or leave an organization. Conformance pack status is deleted when the master account deletes
     * OrganizationConformancePack in all the member accounts and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * An error code that is returned when organization conformance pack creation or deletion has failed in a member
     * account.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message indicating that organization conformance pack creation or deletion failed due to an error.
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
     * The name that you assign to organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name that you assign to organization conformance pack.
     */

    public void setOrganizationConformancePackName(String organizationConformancePackName) {
        this.organizationConformancePackName = organizationConformancePackName;
    }

    /**
     * <p>
     * The name that you assign to organization conformance pack.
     * </p>
     * 
     * @return The name that you assign to organization conformance pack.
     */

    public String getOrganizationConformancePackName() {
        return this.organizationConformancePackName;
    }

    /**
     * <p>
     * The name that you assign to organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name that you assign to organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackStatus withOrganizationConformancePackName(String organizationConformancePackName) {
        setOrganizationConformancePackName(organizationConformancePackName);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of an organization conformance pack. When master account calls
     * PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts.
     * When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated
     * in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts
     * join or leave an organization. Conformance pack status is deleted when the master account deletes
     * OrganizationConformancePack in all the member accounts and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status of an organization conformance pack. When master account calls
     *        PutOrganizationConformancePack for the first time, conformance pack status is created in all the member
     *        accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack
     *        status is updated in all the member accounts. Additionally, conformance pack status is updated when one or
     *        more member accounts join or leave an organization. Conformance pack status is deleted when the master
     *        account deletes OrganizationConformancePack in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from
     *        all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     * @see OrganizationResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates deployment status of an organization conformance pack. When master account calls
     * PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts.
     * When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated
     * in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts
     * join or leave an organization. Conformance pack status is deleted when the master account deletes
     * OrganizationConformancePack in all the member accounts and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status of an organization conformance pack. When master account calls
     *         PutOrganizationConformancePack for the first time, conformance pack status is created in all the member
     *         accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack
     *         status is updated in all the member accounts. Additionally, conformance pack status is updated when one
     *         or more member accounts join or leave an organization. Conformance pack status is deleted when the master
     *         account deletes OrganizationConformancePack in all the member accounts and disables service access for
     *         <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *         <p>
     *         AWS Config sets the state of the conformance pack to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all
     *         the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member
     *         accounts within that organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member
     *         accounts within that organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from
     *         all the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all
     *         the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member
     *         accounts within that organization.
     *         </p>
     *         </li>
     * @see OrganizationResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates deployment status of an organization conformance pack. When master account calls
     * PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts.
     * When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated
     * in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts
     * join or leave an organization. Conformance pack status is deleted when the master account deletes
     * OrganizationConformancePack in all the member accounts and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status of an organization conformance pack. When master account calls
     *        PutOrganizationConformancePack for the first time, conformance pack status is created in all the member
     *        accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack
     *        status is updated in all the member accounts. Additionally, conformance pack status is updated when one or
     *        more member accounts join or leave an organization. Conformance pack status is deleted when the master
     *        account deletes OrganizationConformancePack in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from
     *        all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceStatus
     */

    public OrganizationConformancePackStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of an organization conformance pack. When master account calls
     * PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts.
     * When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated
     * in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts
     * join or leave an organization. Conformance pack status is deleted when the master account deletes
     * OrganizationConformancePack in all the member accounts and disables service access for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all the
     * member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member accounts
     * within that organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates deployment status of an organization conformance pack. When master account calls
     *        PutOrganizationConformancePack for the first time, conformance pack status is created in all the member
     *        accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack
     *        status is updated in all the member accounts. Additionally, conformance pack status is updated when one or
     *        more member accounts join or leave an organization. Conformance pack status is deleted when the master
     *        account deletes OrganizationConformancePack in all the member accounts and disables service access for
     *        <code>config-multiaccountsetup.amazonaws.com</code>.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_SUCCESSFUL</code> when an organization conformance pack has been successfully created in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> when an organization conformance pack creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> when an organization conformance pack creation failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> when an organization conformance pack deletion failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_IN_PROGRESS</code> when an organization conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SUCCESSFUL</code> when an organization conformance pack has been successfully deleted from
     *        all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code> when an organization conformance pack has been successfully updated in all
     *        the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> when an organization conformance pack update is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code> when an organization conformance pack update failed in one or more member
     *        accounts within that organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceStatus
     */

    public OrganizationConformancePackStatus withStatus(OrganizationResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error code that is returned when organization conformance pack creation or deletion has failed in a member
     * account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when organization conformance pack creation or deletion has failed in a
     *        member account.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that is returned when organization conformance pack creation or deletion has failed in a member
     * account.
     * </p>
     * 
     * @return An error code that is returned when organization conformance pack creation or deletion has failed in a
     *         member account.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that is returned when organization conformance pack creation or deletion has failed in a member
     * account.
     * </p>
     * 
     * @param errorCode
     *        An error code that is returned when organization conformance pack creation or deletion has failed in a
     *        member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackStatus withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message indicating that organization conformance pack creation or deletion failed due to an error.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that organization conformance pack creation or deletion failed due to an
     *        error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message indicating that organization conformance pack creation or deletion failed due to an error.
     * </p>
     * 
     * @return An error message indicating that organization conformance pack creation or deletion failed due to an
     *         error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message indicating that organization conformance pack creation or deletion failed due to an error.
     * </p>
     * 
     * @param errorMessage
     *        An error message indicating that organization conformance pack creation or deletion failed due to an
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePackStatus withErrorMessage(String errorMessage) {
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

    public OrganizationConformancePackStatus withLastUpdateTime(java.util.Date lastUpdateTime) {
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
        if (getOrganizationConformancePackName() != null)
            sb.append("OrganizationConformancePackName: ").append(getOrganizationConformancePackName()).append(",");
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

        if (obj instanceof OrganizationConformancePackStatus == false)
            return false;
        OrganizationConformancePackStatus other = (OrganizationConformancePackStatus) obj;
        if (other.getOrganizationConformancePackName() == null ^ this.getOrganizationConformancePackName() == null)
            return false;
        if (other.getOrganizationConformancePackName() != null
                && other.getOrganizationConformancePackName().equals(this.getOrganizationConformancePackName()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConformancePackName() == null) ? 0 : getOrganizationConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConformancePackStatus clone() {
        try {
            return (OrganizationConformancePackStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConformancePackStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
