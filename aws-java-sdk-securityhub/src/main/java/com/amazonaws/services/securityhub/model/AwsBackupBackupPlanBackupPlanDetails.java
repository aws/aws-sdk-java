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
 * Provides details about an Backup backup plan and an array of <code>BackupRule</code> objects, each of which specifies
 * a backup rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupPlanBackupPlanDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanBackupPlanDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     */
    private String backupPlanName;
    /**
     * <p>
     * A list of backup options for each resource type.
     * </p>
     */
    private java.util.List<AwsBackupBackupPlanAdvancedBackupSettingsDetails> advancedBackupSettings;
    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     */
    private java.util.List<AwsBackupBackupPlanRuleDetails> backupPlanRule;

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     * 
     * @param backupPlanName
     *        The display name of a backup plan.
     */

    public void setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
    }

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     * 
     * @return The display name of a backup plan.
     */

    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     * 
     * @param backupPlanName
     *        The display name of a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanBackupPlanDetails withBackupPlanName(String backupPlanName) {
        setBackupPlanName(backupPlanName);
        return this;
    }

    /**
     * <p>
     * A list of backup options for each resource type.
     * </p>
     * 
     * @return A list of backup options for each resource type.
     */

    public java.util.List<AwsBackupBackupPlanAdvancedBackupSettingsDetails> getAdvancedBackupSettings() {
        return advancedBackupSettings;
    }

    /**
     * <p>
     * A list of backup options for each resource type.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of backup options for each resource type.
     */

    public void setAdvancedBackupSettings(java.util.Collection<AwsBackupBackupPlanAdvancedBackupSettingsDetails> advancedBackupSettings) {
        if (advancedBackupSettings == null) {
            this.advancedBackupSettings = null;
            return;
        }

        this.advancedBackupSettings = new java.util.ArrayList<AwsBackupBackupPlanAdvancedBackupSettingsDetails>(advancedBackupSettings);
    }

    /**
     * <p>
     * A list of backup options for each resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedBackupSettings(java.util.Collection)} or
     * {@link #withAdvancedBackupSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of backup options for each resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanBackupPlanDetails withAdvancedBackupSettings(AwsBackupBackupPlanAdvancedBackupSettingsDetails... advancedBackupSettings) {
        if (this.advancedBackupSettings == null) {
            setAdvancedBackupSettings(new java.util.ArrayList<AwsBackupBackupPlanAdvancedBackupSettingsDetails>(advancedBackupSettings.length));
        }
        for (AwsBackupBackupPlanAdvancedBackupSettingsDetails ele : advancedBackupSettings) {
            this.advancedBackupSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of backup options for each resource type.
     * </p>
     * 
     * @param advancedBackupSettings
     *        A list of backup options for each resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanBackupPlanDetails withAdvancedBackupSettings(
            java.util.Collection<AwsBackupBackupPlanAdvancedBackupSettingsDetails> advancedBackupSettings) {
        setAdvancedBackupSettings(advancedBackupSettings);
        return this;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * 
     * @return An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to
     *         back up a selection of resources.
     */

    public java.util.List<AwsBackupBackupPlanRuleDetails> getBackupPlanRule() {
        return backupPlanRule;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * 
     * @param backupPlanRule
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     */

    public void setBackupPlanRule(java.util.Collection<AwsBackupBackupPlanRuleDetails> backupPlanRule) {
        if (backupPlanRule == null) {
            this.backupPlanRule = null;
            return;
        }

        this.backupPlanRule = new java.util.ArrayList<AwsBackupBackupPlanRuleDetails>(backupPlanRule);
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupPlanRule(java.util.Collection)} or {@link #withBackupPlanRule(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param backupPlanRule
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanBackupPlanDetails withBackupPlanRule(AwsBackupBackupPlanRuleDetails... backupPlanRule) {
        if (this.backupPlanRule == null) {
            setBackupPlanRule(new java.util.ArrayList<AwsBackupBackupPlanRuleDetails>(backupPlanRule.length));
        }
        for (AwsBackupBackupPlanRuleDetails ele : backupPlanRule) {
            this.backupPlanRule.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * 
     * @param backupPlanRule
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanBackupPlanDetails withBackupPlanRule(java.util.Collection<AwsBackupBackupPlanRuleDetails> backupPlanRule) {
        setBackupPlanRule(backupPlanRule);
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
        if (getBackupPlanName() != null)
            sb.append("BackupPlanName: ").append(getBackupPlanName()).append(",");
        if (getAdvancedBackupSettings() != null)
            sb.append("AdvancedBackupSettings: ").append(getAdvancedBackupSettings()).append(",");
        if (getBackupPlanRule() != null)
            sb.append("BackupPlanRule: ").append(getBackupPlanRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupPlanBackupPlanDetails == false)
            return false;
        AwsBackupBackupPlanBackupPlanDetails other = (AwsBackupBackupPlanBackupPlanDetails) obj;
        if (other.getBackupPlanName() == null ^ this.getBackupPlanName() == null)
            return false;
        if (other.getBackupPlanName() != null && other.getBackupPlanName().equals(this.getBackupPlanName()) == false)
            return false;
        if (other.getAdvancedBackupSettings() == null ^ this.getAdvancedBackupSettings() == null)
            return false;
        if (other.getAdvancedBackupSettings() != null && other.getAdvancedBackupSettings().equals(this.getAdvancedBackupSettings()) == false)
            return false;
        if (other.getBackupPlanRule() == null ^ this.getBackupPlanRule() == null)
            return false;
        if (other.getBackupPlanRule() != null && other.getBackupPlanRule().equals(this.getBackupPlanRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanName() == null) ? 0 : getBackupPlanName().hashCode());
        hashCode = prime * hashCode + ((getAdvancedBackupSettings() == null) ? 0 : getAdvancedBackupSettings().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanRule() == null) ? 0 : getBackupPlanRule().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupPlanBackupPlanDetails clone() {
        try {
            return (AwsBackupBackupPlanBackupPlanDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupPlanBackupPlanDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
