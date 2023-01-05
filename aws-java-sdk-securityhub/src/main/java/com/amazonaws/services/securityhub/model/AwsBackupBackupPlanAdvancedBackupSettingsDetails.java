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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a list of backup options for each resource type.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupPlanAdvancedBackupSettingsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanAdvancedBackupSettingsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy
     * Service (VSS) backup jobs. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS backup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is not
     * enabled by default.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> backupOptions;
    /**
     * <p>
     * The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows VSS.
     * </p>
     * <p>
     * The only valid value is <code>EC2</code>.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy
     * Service (VSS) backup jobs. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS backup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is not
     * enabled by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the backup option for a selected resource. This option is only available for Windows Volume
     *         Shadow Copy Service (VSS) backup jobs. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS
     *         backup.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option
     *         is not enabled by default.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getBackupOptions() {
        return backupOptions;
    }

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy
     * Service (VSS) backup jobs. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS backup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is not
     * enabled by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupOptions
     *        Specifies the backup option for a selected resource. This option is only available for Windows Volume
     *        Shadow Copy Service (VSS) backup jobs. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS
     *        backup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is
     *        not enabled by default.
     *        </p>
     *        </li>
     */

    public void setBackupOptions(java.util.Map<String, String> backupOptions) {
        this.backupOptions = backupOptions;
    }

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy
     * Service (VSS) backup jobs. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS backup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is not
     * enabled by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupOptions
     *        Specifies the backup option for a selected resource. This option is only available for Windows Volume
     *        Shadow Copy Service (VSS) backup jobs. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>WindowsVSS: enabled</code> to enable the WindowsVSS backup option and create a Windows VSS
     *        backup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>WindowsVSS: disabled</code> to create a regular backup. The <code>WindowsVSS</code> option is
     *        not enabled by default.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanAdvancedBackupSettingsDetails withBackupOptions(java.util.Map<String, String> backupOptions) {
        setBackupOptions(backupOptions);
        return this;
    }

    /**
     * Add a single BackupOptions entry
     *
     * @see AwsBackupBackupPlanAdvancedBackupSettingsDetails#withBackupOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanAdvancedBackupSettingsDetails addBackupOptionsEntry(String key, String value) {
        if (null == this.backupOptions) {
            this.backupOptions = new java.util.HashMap<String, String>();
        }
        if (this.backupOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.backupOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BackupOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanAdvancedBackupSettingsDetails clearBackupOptionsEntries() {
        this.backupOptions = null;
        return this;
    }

    /**
     * <p>
     * The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows VSS.
     * </p>
     * <p>
     * The only valid value is <code>EC2</code>.
     * </p>
     * 
     * @param resourceType
     *        The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows
     *        VSS.</p>
     *        <p>
     *        The only valid value is <code>EC2</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows VSS.
     * </p>
     * <p>
     * The only valid value is <code>EC2</code>.
     * </p>
     * 
     * @return The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows
     *         VSS.</p>
     *         <p>
     *         The only valid value is <code>EC2</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows VSS.
     * </p>
     * <p>
     * The only valid value is <code>EC2</code>.
     * </p>
     * 
     * @param resourceType
     *        The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows
     *        VSS.</p>
     *        <p>
     *        The only valid value is <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanAdvancedBackupSettingsDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getBackupOptions() != null)
            sb.append("BackupOptions: ").append(getBackupOptions()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupPlanAdvancedBackupSettingsDetails == false)
            return false;
        AwsBackupBackupPlanAdvancedBackupSettingsDetails other = (AwsBackupBackupPlanAdvancedBackupSettingsDetails) obj;
        if (other.getBackupOptions() == null ^ this.getBackupOptions() == null)
            return false;
        if (other.getBackupOptions() != null && other.getBackupOptions().equals(this.getBackupOptions()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupOptions() == null) ? 0 : getBackupOptions().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupPlanAdvancedBackupSettingsDetails clone() {
        try {
            return (AwsBackupBackupPlanAdvancedBackupSettingsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupPlanAdvancedBackupSettingsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
