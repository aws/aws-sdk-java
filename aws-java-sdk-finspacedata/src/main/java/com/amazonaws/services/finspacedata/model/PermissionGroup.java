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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure for a permission group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/PermissionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     */
    private String permissionGroupId;
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
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     * The timestamp at which the group was created in FinSpace. The value is determined as epoch time in milliseconds.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * Describes the last time the permission group was updated. The value is determined as epoch time in milliseconds.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     */
    private String membershipStatus;

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     */

    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @return The unique identifier for the permission group.
     */

    public String getPermissionGroupId() {
        return this.permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroup withPermissionGroupId(String permissionGroupId) {
        setPermissionGroupId(permissionGroupId);
        return this;
    }

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

    public PermissionGroup withName(String name) {
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

    public PermissionGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     * @return Indicates the permissions that are granted to a specific group for accessing the FinSpace
     *         application.</p> <important>
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
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     *        Indicates the permissions that are granted to a specific group for accessing the FinSpace application.</p>
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
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     *        Indicates the permissions that are granted to a specific group for accessing the FinSpace application.</p>
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

    public PermissionGroup withApplicationPermissions(String... applicationPermissions) {
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
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     *        Indicates the permissions that are granted to a specific group for accessing the FinSpace application.</p>
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

    public PermissionGroup withApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        setApplicationPermissions(applicationPermissions);
        return this;
    }

    /**
     * <p>
     * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.
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
     *        Indicates the permissions that are granted to a specific group for accessing the FinSpace application.</p>
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

    public PermissionGroup withApplicationPermissions(ApplicationPermission... applicationPermissions) {
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
     * The timestamp at which the group was created in FinSpace. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp at which the group was created in FinSpace. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @return The timestamp at which the group was created in FinSpace. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp at which the group was created in FinSpace. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroup withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Describes the last time the permission group was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastModifiedTime
     *        Describes the last time the permission group was updated. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Describes the last time the permission group was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @return Describes the last time the permission group was updated. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Describes the last time the permission group was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastModifiedTime
     *        Describes the last time the permission group was updated. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionGroup withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @see PermissionGroupMembershipStatus
     */

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of the user account within a permission group.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *         </p>
     *         </li>
     * @see PermissionGroupMembershipStatus
     */

    public String getMembershipStatus() {
        return this.membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public PermissionGroup withMembershipStatus(String membershipStatus) {
        setMembershipStatus(membershipStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public PermissionGroup withMembershipStatus(PermissionGroupMembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus.toString();
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
        if (getPermissionGroupId() != null)
            sb.append("PermissionGroupId: ").append(getPermissionGroupId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getApplicationPermissions() != null)
            sb.append("ApplicationPermissions: ").append(getApplicationPermissions()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMembershipStatus() != null)
            sb.append("MembershipStatus: ").append(getMembershipStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionGroup == false)
            return false;
        PermissionGroup other = (PermissionGroup) obj;
        if (other.getPermissionGroupId() == null ^ this.getPermissionGroupId() == null)
            return false;
        if (other.getPermissionGroupId() != null && other.getPermissionGroupId().equals(this.getPermissionGroupId()) == false)
            return false;
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
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMembershipStatus() == null ^ this.getMembershipStatus() == null)
            return false;
        if (other.getMembershipStatus() != null && other.getMembershipStatus().equals(this.getMembershipStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationPermissions() == null) ? 0 : getApplicationPermissions().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMembershipStatus() == null) ? 0 : getMembershipStatus().hashCode());
        return hashCode;
    }

    @Override
    public PermissionGroup clone() {
        try {
            return (PermissionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.PermissionGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
