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
     * Indicates whether internet access is enabled for your WorkSpaces.
     * </p>
     */
    private Boolean enableInternetAccess;
    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpace directories.
     * </p>
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
     * The default organizational unit (OU) for your WorkSpace directories.
     * </p>
     * 
     * @param defaultOu
     *        The default organizational unit (OU) for your WorkSpace directories.
     */

    public void setDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
    }

    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpace directories.
     * </p>
     * 
     * @return The default organizational unit (OU) for your WorkSpace directories.
     */

    public String getDefaultOu() {
        return this.defaultOu;
    }

    /**
     * <p>
     * The default organizational unit (OU) for your WorkSpace directories.
     * </p>
     * 
     * @param defaultOu
     *        The default organizational unit (OU) for your WorkSpace directories.
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
