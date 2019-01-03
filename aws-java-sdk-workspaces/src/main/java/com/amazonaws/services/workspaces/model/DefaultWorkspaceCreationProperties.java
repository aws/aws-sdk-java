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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the default values used to create a WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DefaultWorkspaceCreationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultWorkspaceCreationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the directory is enabled for Amazon WorkDocs.
     * </p>
     */
    private Boolean enableWorkDocs;
    /**
     * <p>
     * The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * </p>
     */
    private Boolean enableInternetAccess;
    /**
     * <p>
     * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     * </p>
     */
    private String defaultOu;
    /**
     * <p>
     * The identifier of any security groups to apply to WorkSpaces when they are created.
     * </p>
     */
    private String customSecurityGroupId;
    /**
     * <p>
     * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * </p>
     */
    private Boolean userEnabledAsLocalAdministrator;

    /**
     * <p>
     * Specifies whether the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @param enableWorkDocs
     *        Specifies whether the directory is enabled for Amazon WorkDocs.
     */

    public void setEnableWorkDocs(Boolean enableWorkDocs) {
        this.enableWorkDocs = enableWorkDocs;
    }

    /**
     * <p>
     * Specifies whether the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @return Specifies whether the directory is enabled for Amazon WorkDocs.
     */

    public Boolean getEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * Specifies whether the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @param enableWorkDocs
     *        Specifies whether the directory is enabled for Amazon WorkDocs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultWorkspaceCreationProperties withEnableWorkDocs(Boolean enableWorkDocs) {
        setEnableWorkDocs(enableWorkDocs);
        return this;
    }

    /**
     * <p>
     * Specifies whether the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @return Specifies whether the directory is enabled for Amazon WorkDocs.
     */

    public Boolean isEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * </p>
     * 
     * @param enableInternetAccess
     *        The public IP address to attach to all WorkSpaces that are created or rebuilt.
     */

    public void setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
    }

    /**
     * <p>
     * The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * </p>
     * 
     * @return The public IP address to attach to all WorkSpaces that are created or rebuilt.
     */

    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * </p>
     * 
     * @param enableInternetAccess
     *        The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultWorkspaceCreationProperties withEnableInternetAccess(Boolean enableInternetAccess) {
        setEnableInternetAccess(enableInternetAccess);
        return this;
    }

    /**
     * <p>
     * The public IP address to attach to all WorkSpaces that are created or rebuilt.
     * </p>
     * 
     * @return The public IP address to attach to all WorkSpaces that are created or rebuilt.
     */

    public Boolean isEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     * </p>
     * 
     * @param defaultOu
     *        The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     */

    public void setDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     * </p>
     * 
     * @return The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     */

    public String getDefaultOu() {
        return this.defaultOu;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     * </p>
     * 
     * @param defaultOu
     *        The organizational unit (OU) in the directory for the WorkSpace machine accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultWorkspaceCreationProperties withDefaultOu(String defaultOu) {
        setDefaultOu(defaultOu);
        return this;
    }

    /**
     * <p>
     * The identifier of any security groups to apply to WorkSpaces when they are created.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of any security groups to apply to WorkSpaces when they are created.
     */

    public void setCustomSecurityGroupId(String customSecurityGroupId) {
        this.customSecurityGroupId = customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of any security groups to apply to WorkSpaces when they are created.
     * </p>
     * 
     * @return The identifier of any security groups to apply to WorkSpaces when they are created.
     */

    public String getCustomSecurityGroupId() {
        return this.customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of any security groups to apply to WorkSpaces when they are created.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of any security groups to apply to WorkSpaces when they are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultWorkspaceCreationProperties withCustomSecurityGroupId(String customSecurityGroupId) {
        setCustomSecurityGroupId(customSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     */

    public void setUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @return Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     */

    public Boolean getUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultWorkspaceCreationProperties withUserEnabledAsLocalAdministrator(Boolean userEnabledAsLocalAdministrator) {
        setUserEnabledAsLocalAdministrator(userEnabledAsLocalAdministrator);
        return this;
    }

    /**
     * <p>
     * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @return Specifies whether the WorkSpace user is an administrator on the WorkSpace.
     */

    public Boolean isUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
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
            sb.append("UserEnabledAsLocalAdministrator: ").append(getUserEnabledAsLocalAdministrator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultWorkspaceCreationProperties == false)
            return false;
        DefaultWorkspaceCreationProperties other = (DefaultWorkspaceCreationProperties) obj;
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
        return hashCode;
    }

    @Override
    public DefaultWorkspaceCreationProperties clone() {
        try {
            return (DefaultWorkspaceCreationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.DefaultWorkspaceCreationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
