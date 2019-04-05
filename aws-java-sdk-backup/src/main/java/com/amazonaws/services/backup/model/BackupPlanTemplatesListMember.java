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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object specifying metadata associated with a backup plan template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupPlanTemplatesListMember"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupPlanTemplatesListMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     */
    private String backupPlanTemplateId;
    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     */
    private String backupPlanTemplateName;

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateId
     *        Uniquely identifies a stored backup plan template.
     */

    public void setBackupPlanTemplateId(String backupPlanTemplateId) {
        this.backupPlanTemplateId = backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @return Uniquely identifies a stored backup plan template.
     */

    public String getBackupPlanTemplateId() {
        return this.backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateId
     *        Uniquely identifies a stored backup plan template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupPlanTemplatesListMember withBackupPlanTemplateId(String backupPlanTemplateId) {
        setBackupPlanTemplateId(backupPlanTemplateId);
        return this;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateName
     *        The optional display name of a backup plan template.
     */

    public void setBackupPlanTemplateName(String backupPlanTemplateName) {
        this.backupPlanTemplateName = backupPlanTemplateName;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     * 
     * @return The optional display name of a backup plan template.
     */

    public String getBackupPlanTemplateName() {
        return this.backupPlanTemplateName;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     * 
     * @param backupPlanTemplateName
     *        The optional display name of a backup plan template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupPlanTemplatesListMember withBackupPlanTemplateName(String backupPlanTemplateName) {
        setBackupPlanTemplateName(backupPlanTemplateName);
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
        if (getBackupPlanTemplateId() != null)
            sb.append("BackupPlanTemplateId: ").append(getBackupPlanTemplateId()).append(",");
        if (getBackupPlanTemplateName() != null)
            sb.append("BackupPlanTemplateName: ").append(getBackupPlanTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPlanTemplatesListMember == false)
            return false;
        BackupPlanTemplatesListMember other = (BackupPlanTemplatesListMember) obj;
        if (other.getBackupPlanTemplateId() == null ^ this.getBackupPlanTemplateId() == null)
            return false;
        if (other.getBackupPlanTemplateId() != null && other.getBackupPlanTemplateId().equals(this.getBackupPlanTemplateId()) == false)
            return false;
        if (other.getBackupPlanTemplateName() == null ^ this.getBackupPlanTemplateName() == null)
            return false;
        if (other.getBackupPlanTemplateName() != null && other.getBackupPlanTemplateName().equals(this.getBackupPlanTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanTemplateId() == null) ? 0 : getBackupPlanTemplateId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanTemplateName() == null) ? 0 : getBackupPlanTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public BackupPlanTemplatesListMember clone() {
        try {
            return (BackupPlanTemplatesListMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupPlanTemplatesListMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
