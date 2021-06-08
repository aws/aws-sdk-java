/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the default properties that are used for creating WorkSpaces. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html">Update Directory
 * Details for Your WorkSpaces</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceCreationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceCreationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.
     * </p>
     * <note>
     * <p>
     * If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the
     * directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless
     * you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to
     * WorkDocs, see <a href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling
     * Users</a> in the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     * <i>Amazon WorkDocs Administration Guide</i>.
     * </p>
     * <p>
     * If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new
     * WorkSpaces that are launched in the directory will have WorkDocs enabled.
     * </p>
     * </note>
     */
    private Boolean enableWorkDocs;
    /**
     * <p>
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     */
    private Boolean enableInternetAccess;
    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpaces directories. This string must be the full Lightweight
     * Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be in the form
     * <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any string of characters,
     * and the number of domain components (DCs) is two or more. For example,
     * <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * To avoid errors, certain characters in the distinguished name must be escaped. For more information, see <a
     * href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names"> Distinguished
     * Names</a> in the Microsoft documentation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API doesn't validate whether the OU exists.
     * </p>
     * </li>
     * </ul>
     * </important>
     */
    private String defaultOu;
    /**
     * <p>
     * The identifier of your custom security group.
     * </p>
     */
    private String customSecurityGroupId;
    /**
     * <p>
     * Indicates whether users are local administrators of their WorkSpaces.
     * </p>
     */
    private Boolean userEnabledAsLocalAdministrator;
    /**
     * <p>
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     * Maintenance</a>.
     * </p>
     */
    private Boolean enableMaintenanceMode;

    /**
     * <p>
     * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.
     * </p>
     * <note>
     * <p>
     * If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the
     * directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless
     * you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to
     * WorkDocs, see <a href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling
     * Users</a> in the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     * <i>Amazon WorkDocs Administration Guide</i>.
     * </p>
     * <p>
     * If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new
     * WorkSpaces that are launched in the directory will have WorkDocs enabled.
     * </p>
     * </note>
     * 
     * @param enableWorkDocs
     *        Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.</p> <note>
     *        <p>
     *        If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in
     *        the directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing
     *        WorkSpaces, unless you either disable users' access to WorkDocs or you delete the WorkDocs site. To
     *        disable users' access to WorkDocs, see <a
     *        href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling Users</a> in
     *        the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     *        href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     *        <i>Amazon WorkDocs Administration Guide</i>.
     *        </p>
     *        <p>
     *        If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and
     *        any new WorkSpaces that are launched in the directory will have WorkDocs enabled.
     *        </p>
     */

    public void setEnableWorkDocs(Boolean enableWorkDocs) {
        this.enableWorkDocs = enableWorkDocs;
    }

    /**
     * <p>
     * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.
     * </p>
     * <note>
     * <p>
     * If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the
     * directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless
     * you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to
     * WorkDocs, see <a href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling
     * Users</a> in the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     * <i>Amazon WorkDocs Administration Guide</i>.
     * </p>
     * <p>
     * If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new
     * WorkSpaces that are launched in the directory will have WorkDocs enabled.
     * </p>
     * </note>
     * 
     * @return Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.</p> <note>
     *         <p>
     *         If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in
     *         the directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing
     *         WorkSpaces, unless you either disable users' access to WorkDocs or you delete the WorkDocs site. To
     *         disable users' access to WorkDocs, see <a
     *         href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling Users</a> in
     *         the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     *         href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in
     *         the <i>Amazon WorkDocs Administration Guide</i>.
     *         </p>
     *         <p>
     *         If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and
     *         any new WorkSpaces that are launched in the directory will have WorkDocs enabled.
     *         </p>
     */

    public Boolean getEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.
     * </p>
     * <note>
     * <p>
     * If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the
     * directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless
     * you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to
     * WorkDocs, see <a href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling
     * Users</a> in the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     * <i>Amazon WorkDocs Administration Guide</i>.
     * </p>
     * <p>
     * If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new
     * WorkSpaces that are launched in the directory will have WorkDocs enabled.
     * </p>
     * </note>
     * 
     * @param enableWorkDocs
     *        Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.</p> <note>
     *        <p>
     *        If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in
     *        the directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing
     *        WorkSpaces, unless you either disable users' access to WorkDocs or you delete the WorkDocs site. To
     *        disable users' access to WorkDocs, see <a
     *        href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling Users</a> in
     *        the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     *        href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     *        <i>Amazon WorkDocs Administration Guide</i>.
     *        </p>
     *        <p>
     *        If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and
     *        any new WorkSpaces that are launched in the directory will have WorkDocs enabled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withEnableWorkDocs(Boolean enableWorkDocs) {
        setEnableWorkDocs(enableWorkDocs);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.
     * </p>
     * <note>
     * <p>
     * If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the
     * directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless
     * you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to
     * WorkDocs, see <a href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling
     * Users</a> in the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in the
     * <i>Amazon WorkDocs Administration Guide</i>.
     * </p>
     * <p>
     * If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new
     * WorkSpaces that are launched in the directory will have WorkDocs enabled.
     * </p>
     * </note>
     * 
     * @return Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.</p> <note>
     *         <p>
     *         If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in
     *         the directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing
     *         WorkSpaces, unless you either disable users' access to WorkDocs or you delete the WorkDocs site. To
     *         disable users' access to WorkDocs, see <a
     *         href="https://docs.aws.amazon.com/workdocs/latest/adminguide/inactive-user.html">Disabling Users</a> in
     *         the <i>Amazon WorkDocs Administration Guide</i>. To delete a WorkDocs site, see <a
     *         href="https://docs.aws.amazon.com/workdocs/latest/adminguide/manage-sites.html">Deleting a Site</a> in
     *         the <i>Amazon WorkDocs Administration Guide</i>.
     *         </p>
     *         <p>
     *         If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and
     *         any new WorkSpaces that are launched in the directory will have WorkDocs enabled.
     *         </p>
     */

    public Boolean isEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     * 
     * @param enableInternetAccess
     *        Indicates whether internet access is enabled for your WorkSpaces.
     */

    public void setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
    }

    /**
     * <p>
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     * 
     * @return Indicates whether internet access is enabled for your WorkSpaces.
     */

    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     * 
     * @param enableInternetAccess
     *        Indicates whether internet access is enabled for your WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withEnableInternetAccess(Boolean enableInternetAccess) {
        setEnableInternetAccess(enableInternetAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     * 
     * @return Indicates whether internet access is enabled for your WorkSpaces.
     */

    public Boolean isEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpaces directories. This string must be the full Lightweight
     * Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be in the form
     * <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any string of characters,
     * and the number of domain components (DCs) is two or more. For example,
     * <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * To avoid errors, certain characters in the distinguished name must be escaped. For more information, see <a
     * href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names"> Distinguished
     * Names</a> in the Microsoft documentation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API doesn't validate whether the OU exists.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param defaultOu
     *        The default organizational unit (OU) for your WorkSpaces directories. This string must be the full
     *        Lightweight Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be
     *        in the form <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any
     *        string of characters, and the number of domain components (DCs) is two or more. For example,
     *        <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>. </p> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        To avoid errors, certain characters in the distinguished name must be escaped. For more information, see
     *        <a href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names">
     *        Distinguished Names</a> in the Microsoft documentation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The API doesn't validate whether the OU exists.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
    }

    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpaces directories. This string must be the full Lightweight
     * Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be in the form
     * <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any string of characters,
     * and the number of domain components (DCs) is two or more. For example,
     * <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * To avoid errors, certain characters in the distinguished name must be escaped. For more information, see <a
     * href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names"> Distinguished
     * Names</a> in the Microsoft documentation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API doesn't validate whether the OU exists.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @return The default organizational unit (OU) for your WorkSpaces directories. This string must be the full
     *         Lightweight Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be
     *         in the form <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any
     *         string of characters, and the number of domain components (DCs) is two or more. For example,
     *         <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>. </p> <important>
     *         <ul>
     *         <li>
     *         <p>
     *         To avoid errors, certain characters in the distinguished name must be escaped. For more information, see
     *         <a href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names">
     *         Distinguished Names</a> in the Microsoft documentation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The API doesn't validate whether the OU exists.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getDefaultOu() {
        return this.defaultOu;
    }

    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpaces directories. This string must be the full Lightweight
     * Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be in the form
     * <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any string of characters,
     * and the number of domain components (DCs) is two or more. For example,
     * <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * To avoid errors, certain characters in the distinguished name must be escaped. For more information, see <a
     * href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names"> Distinguished
     * Names</a> in the Microsoft documentation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API doesn't validate whether the OU exists.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param defaultOu
     *        The default organizational unit (OU) for your WorkSpaces directories. This string must be the full
     *        Lightweight Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be
     *        in the form <code>"OU=<i>value</i>,DC=<i>value</i>,DC=<i>value</i>"</code>, where <i>value</i> is any
     *        string of characters, and the number of domain components (DCs) is two or more. For example,
     *        <code>OU=WorkSpaces_machines,DC=machines,DC=example,DC=com</code>. </p> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        To avoid errors, certain characters in the distinguished name must be escaped. For more information, see
     *        <a href="https://docs.microsoft.com/previous-versions/windows/desktop/ldap/distinguished-names">
     *        Distinguished Names</a> in the Microsoft documentation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The API doesn't validate whether the OU exists.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withDefaultOu(String defaultOu) {
        setDefaultOu(defaultOu);
        return this;
    }

    /**
     * <p>
     * The identifier of your custom security group.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of your custom security group.
     */

    public void setCustomSecurityGroupId(String customSecurityGroupId) {
        this.customSecurityGroupId = customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of your custom security group.
     * </p>
     * 
     * @return The identifier of your custom security group.
     */

    public String getCustomSecurityGroupId() {
        return this.customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of your custom security group.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of your custom security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withCustomSecurityGroupId(String customSecurityGroupId) {
        setCustomSecurityGroupId(customSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * Indicates whether users are local administrators of their WorkSpaces.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        Indicates whether users are local administrators of their WorkSpaces.
     */

    public void setUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * Indicates whether users are local administrators of their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users are local administrators of their WorkSpaces.
     */

    public Boolean getUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * Indicates whether users are local administrators of their WorkSpaces.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        Indicates whether users are local administrators of their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        setUserEnabledAsLocalAdministrator(userEnabledAsLocalAdministrator);
        return this;
    }

    /**
     * <p>
     * Indicates whether users are local administrators of their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users are local administrators of their WorkSpaces.
     */

    public Boolean isUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     * Maintenance</a>.
     * </p>
     * 
     * @param enableMaintenanceMode
     *        Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     *        Maintenance</a>.
     */

    public void setEnableMaintenanceMode(Boolean enableMaintenanceMode) {
        this.enableMaintenanceMode = enableMaintenanceMode;
    }

    /**
     * <p>
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     * Maintenance</a>.
     * </p>
     * 
     * @return Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     *         Maintenance</a>.
     */

    public Boolean getEnableMaintenanceMode() {
        return this.enableMaintenanceMode;
    }

    /**
     * <p>
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     * Maintenance</a>.
     * </p>
     * 
     * @param enableMaintenanceMode
     *        Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     *        Maintenance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceCreationProperties withEnableMaintenanceMode(Boolean enableMaintenanceMode) {
        setEnableMaintenanceMode(enableMaintenanceMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     * Maintenance</a>.
     * </p>
     * 
     * @return Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html">WorkSpace
     *         Maintenance</a>.
     */

    public Boolean isEnableMaintenanceMode() {
        return this.enableMaintenanceMode;
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
        if (getEnableWorkDocs() != null)
            sb.append("EnableWorkDocs: ").append(getEnableWorkDocs()).append(",");
        if (getEnableInternetAccess() != null)
            sb.append("EnableInternetAccess: ").append(getEnableInternetAccess()).append(",");
        if (getDefaultOu() != null)
            sb.append("DefaultOu: ").append(getDefaultOu()).append(",");
        if (getCustomSecurityGroupId() != null)
            sb.append("CustomSecurityGroupId: ").append(getCustomSecurityGroupId()).append(",");
        if (getUserEnabledAsLocalAdministrator() != null)
            sb.append("UserEnabledAsLocalAdministrator: ").append(getUserEnabledAsLocalAdministrator()).append(",");
        if (getEnableMaintenanceMode() != null)
            sb.append("EnableMaintenanceMode: ").append(getEnableMaintenanceMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceCreationProperties == false)
            return false;
        WorkspaceCreationProperties other = (WorkspaceCreationProperties) obj;
        if (other.getEnableWorkDocs() == null ^ this.getEnableWorkDocs() == null)
            return false;
        if (other.getEnableWorkDocs() != null && other.getEnableWorkDocs().equals(this.getEnableWorkDocs()) == false)
            return false;
        if (other.getEnableInternetAccess() == null ^ this.getEnableInternetAccess() == null)
            return false;
        if (other.getEnableInternetAccess() != null && other.getEnableInternetAccess().equals(this.getEnableInternetAccess()) == false)
            return false;
        if (other.getDefaultOu() == null ^ this.getDefaultOu() == null)
            return false;
        if (other.getDefaultOu() != null && other.getDefaultOu().equals(this.getDefaultOu()) == false)
            return false;
        if (other.getCustomSecurityGroupId() == null ^ this.getCustomSecurityGroupId() == null)
            return false;
        if (other.getCustomSecurityGroupId() != null && other.getCustomSecurityGroupId().equals(this.getCustomSecurityGroupId()) == false)
            return false;
        if (other.getUserEnabledAsLocalAdministrator() == null ^ this.getUserEnabledAsLocalAdministrator() == null)
            return false;
        if (other.getUserEnabledAsLocalAdministrator() != null
                && other.getUserEnabledAsLocalAdministrator().equals(this.getUserEnabledAsLocalAdministrator()) == false)
            return false;
        if (other.getEnableMaintenanceMode() == null ^ this.getEnableMaintenanceMode() == null)
            return false;
        if (other.getEnableMaintenanceMode() != null && other.getEnableMaintenanceMode().equals(this.getEnableMaintenanceMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableWorkDocs() == null) ? 0 : getEnableWorkDocs().hashCode());
        hashCode = prime * hashCode + ((getEnableInternetAccess() == null) ? 0 : getEnableInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDefaultOu() == null) ? 0 : getDefaultOu().hashCode());
        hashCode = prime * hashCode + ((getCustomSecurityGroupId() == null) ? 0 : getCustomSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getUserEnabledAsLocalAdministrator() == null) ? 0 : getUserEnabledAsLocalAdministrator().hashCode());
        hashCode = prime * hashCode + ((getEnableMaintenanceMode() == null) ? 0 : getEnableMaintenanceMode().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceCreationProperties clone() {
        try {
            return (WorkspaceCreationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceCreationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
