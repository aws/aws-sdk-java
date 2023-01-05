/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreatePermissionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePermissionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the permission group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description for the permission group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> applicationPermissions;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @param name
     *        The name of the permission group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @return The name of the permission group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the permission group.
     * </p>
     * 
     * @param name
     *        The name of the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description for the permission group.
     * </p>
     * 
     * @param description
     *        A brief description for the permission group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description for the permission group.
     * </p>
     * 
     * @return A brief description for the permission group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description for the permission group.
     * </p>
     * 
     * @param description
     *        A brief description for the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The option to indicate FinSpace application permissions that are granted to a specific group.</p>
     *         <important>
     *         <p>
     *         When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code>
     *         allows users to grant themselves or others access to any functionality in their FinSpace environment's
     *         application. It should only be granted to trusted users.
     *         </p>
     *         </important>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreateDataset</code> – Group members can create new datasets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a
     *         privileged permission that allows users to grant themselves or others access to any functionality in the
     *         application. It should only be granted to trusted users.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ViewAuditData</code> – Group members can view audit data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     *         </p>
     *         </li>
     * @see ApplicationPermission
     */

    public java.util.List<String> getApplicationPermissions() {
        return applicationPermissions;
    }

    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applicationPermissions
     *        The option to indicate FinSpace application permissions that are granted to a specific group.</p>
     *        <important>
     *        <p>
     *        When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code>
     *        allows users to grant themselves or others access to any functionality in their FinSpace environment's
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateDataset</code> – Group members can create new datasets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a
     *        privileged permission that allows users to grant themselves or others access to any functionality in the
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ViewAuditData</code> – Group members can view audit data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     *        </p>
     *        </li>
     * @see ApplicationPermission
     */

    public void setApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        if (applicationPermissions == null) {
            this.applicationPermissions = null;
            return;
        }

        this.applicationPermissions = new java.util.ArrayList<String>(applicationPermissions);
    }

    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationPermissions(java.util.Collection)} or
     * {@link #withApplicationPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationPermissions
     *        The option to indicate FinSpace application permissions that are granted to a specific group.</p>
     *        <important>
     *        <p>
     *        When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code>
     *        allows users to grant themselves or others access to any functionality in their FinSpace environment's
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateDataset</code> – Group members can create new datasets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a
     *        privileged permission that allows users to grant themselves or others access to any functionality in the
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ViewAuditData</code> – Group members can view audit data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationPermission
     */

    public CreatePermissionGroupRequest withApplicationPermissions(String... applicationPermissions) {
        if (this.applicationPermissions == null) {
            setApplicationPermissions(new java.util.ArrayList<String>(applicationPermissions.length));
        }
        for (String ele : applicationPermissions) {
            this.applicationPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applicationPermissions
     *        The option to indicate FinSpace application permissions that are granted to a specific group.</p>
     *        <important>
     *        <p>
     *        When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code>
     *        allows users to grant themselves or others access to any functionality in their FinSpace environment's
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateDataset</code> – Group members can create new datasets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a
     *        privileged permission that allows users to grant themselves or others access to any functionality in the
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ViewAuditData</code> – Group members can view audit data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationPermission
     */

    public CreatePermissionGroupRequest withApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        setApplicationPermissions(applicationPermissions);
        return this;
    }

    /**
     * <p>
     * The option to indicate FinSpace application permissions that are granted to a specific group.
     * </p>
     * <important>
     * <p>
     * When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code> allows
     * users to grant themselves or others access to any functionality in their FinSpace environment's application. It
     * should only be granted to trusted users.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <code>CreateDataset</code> – Group members can create new datasets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a privileged
     * permission that allows users to grant themselves or others access to any functionality in the application. It
     * should only be granted to trusted users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ViewAuditData</code> – Group members can view audit data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applicationPermissions
     *        The option to indicate FinSpace application permissions that are granted to a specific group.</p>
     *        <important>
     *        <p>
     *        When assigning application permissions, be aware that the permission <code>ManageUsersAndGroups</code>
     *        allows users to grant themselves or others access to any functionality in their FinSpace environment's
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreateDataset</code> – Group members can create new datasets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageClusters</code> – Group members can manage Apache Spark clusters from FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageUsersAndGroups</code> – Group members can manage users and permission groups. This is a
     *        privileged permission that allows users to grant themselves or others access to any functionality in the
     *        application. It should only be granted to trusted users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ManageAttributeSets</code> – Group members can manage attribute sets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ViewAuditData</code> – Group members can view audit data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccessNotebooks</code> – Group members will have access to FinSpace notebooks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetTemporaryCredentials</code> – Group members can get temporary API credentials.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationPermission
     */

    public CreatePermissionGroupRequest withApplicationPermissions(ApplicationPermission... applicationPermissions) {
        java.util.ArrayList<String> applicationPermissionsCopy = new java.util.ArrayList<String>(applicationPermissions.length);
        for (ApplicationPermission value : applicationPermissions) {
            applicationPermissionsCopy.add(value.toString());
        }
        if (getApplicationPermissions() == null) {
            setApplicationPermissions(applicationPermissionsCopy);
        } else {
            getApplicationPermissions().addAll(applicationPermissionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getApplicationPermissions() != null)
            sb.append("ApplicationPermissions: ").append(getApplicationPermissions()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePermissionGroupRequest == false)
            return false;
        CreatePermissionGroupRequest other = (CreatePermissionGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApplicationPermissions() == null ^ this.getApplicationPermissions() == null)
            return false;
        if (other.getApplicationPermissions() != null && other.getApplicationPermissions().equals(this.getApplicationPermissions()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationPermissions() == null) ? 0 : getApplicationPermissions().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePermissionGroupRequest clone() {
        return (CreatePermissionGroupRequest) super.clone();
    }

}
