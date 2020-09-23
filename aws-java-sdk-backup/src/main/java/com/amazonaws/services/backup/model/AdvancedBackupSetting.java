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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of backup options for each resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/AdvancedBackupSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedBackupSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon
     * EC2.
     * </p>
     * <p>
     * Valid values: <code>EC2</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs.
     * </p>
     * <p>
     * Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise, creates a
     * regular backup.
     * </p>
     * <p>
     * If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     * </p>
     * <p>
     * For more information about Windows VSS backups, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled Windows
     * Backup</a>.
     * </p>
     */
    private java.util.Map<String, String> backupOptions;

    /**
     * <p>
     * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon
     * EC2.
     * </p>
     * <p>
     * Valid values: <code>EC2</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is
     *        Amazon EC2.</p>
     *        <p>
     *        Valid values: <code>EC2</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon
     * EC2.
     * </p>
     * <p>
     * Valid values: <code>EC2</code>.
     * </p>
     * 
     * @return The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is
     *         Amazon EC2.</p>
     *         <p>
     *         Valid values: <code>EC2</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon
     * EC2.
     * </p>
     * <p>
     * Valid values: <code>EC2</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is
     *        Amazon EC2.</p>
     *        <p>
     *        Valid values: <code>EC2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedBackupSetting withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs.
     * </p>
     * <p>
     * Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise, creates a
     * regular backup.
     * </p>
     * <p>
     * If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     * </p>
     * <p>
     * For more information about Windows VSS backups, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled Windows
     * Backup</a>.
     * </p>
     * 
     * @return Specifies the backup option for a selected resource. This option is only available for Windows VSS backup
     *         jobs.</p>
     *         <p>
     *         Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise,
     *         creates a regular backup.
     *         </p>
     *         <p>
     *         If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     *         </p>
     *         <p>
     *         For more information about Windows VSS backups, see <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled
     *         Windows Backup</a>.
     */

    public java.util.Map<String, String> getBackupOptions() {
        return backupOptions;
    }

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs.
     * </p>
     * <p>
     * Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise, creates a
     * regular backup.
     * </p>
     * <p>
     * If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     * </p>
     * <p>
     * For more information about Windows VSS backups, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled Windows
     * Backup</a>.
     * </p>
     * 
     * @param backupOptions
     *        Specifies the backup option for a selected resource. This option is only available for Windows VSS backup
     *        jobs.</p>
     *        <p>
     *        Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise,
     *        creates a regular backup.
     *        </p>
     *        <p>
     *        If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     *        </p>
     *        <p>
     *        For more information about Windows VSS backups, see <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled
     *        Windows Backup</a>.
     */

    public void setBackupOptions(java.util.Map<String, String> backupOptions) {
        this.backupOptions = backupOptions;
    }

    /**
     * <p>
     * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs.
     * </p>
     * <p>
     * Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise, creates a
     * regular backup.
     * </p>
     * <p>
     * If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     * </p>
     * <p>
     * For more information about Windows VSS backups, see <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled Windows
     * Backup</a>.
     * </p>
     * 
     * @param backupOptions
     *        Specifies the backup option for a selected resource. This option is only available for Windows VSS backup
     *        jobs.</p>
     *        <p>
     *        Valid value: <code>"WindowsVSS”:“enabled"</code>. If enabled, creates a VSS Windows backup; otherwise,
     *        creates a regular backup.
     *        </p>
     *        <p>
     *        If you specify an invalid option, you get an <code>InvalidParameterValueException</code> exception.
     *        </p>
     *        <p>
     *        For more information about Windows VSS backups, see <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html">Creating a VSS-Enabled
     *        Windows Backup</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedBackupSetting withBackupOptions(java.util.Map<String, String> backupOptions) {
        setBackupOptions(backupOptions);
        return this;
    }

    /**
     * Add a single BackupOptions entry
     *
     * @see AdvancedBackupSetting#withBackupOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedBackupSetting addBackupOptionsEntry(String key, String value) {
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

    public AdvancedBackupSetting clearBackupOptionsEntries() {
        this.backupOptions = null;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getBackupOptions() != null)
            sb.append("BackupOptions: ").append(getBackupOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedBackupSetting == false)
            return false;
        AdvancedBackupSetting other = (AdvancedBackupSetting) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getBackupOptions() == null ^ this.getBackupOptions() == null)
            return false;
        if (other.getBackupOptions() != null && other.getBackupOptions().equals(this.getBackupOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getBackupOptions() == null) ? 0 : getBackupOptions().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedBackupSetting clone() {
        try {
            return (AdvancedBackupSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.AdvancedBackupSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
