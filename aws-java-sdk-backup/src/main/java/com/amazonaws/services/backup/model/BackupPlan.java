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
 * Contains an optional backup plan display name and an array of <code>BackupRule</code> objects, each of which
 * specifies a backup rule. Each rule in a backup plan is a separate scheduled task and can back up a different
 * selection of AWS resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupPlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of a backup plan.
     * </p>
     */
    private String backupPlanName;
    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     */
    private java.util.List<BackupRule> rules;

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

    public BackupPlan withBackupPlanName(String backupPlanName) {
        setBackupPlanName(backupPlanName);
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

    public java.util.List<BackupRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * 
     * @param rules
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     */

    public void setRules(java.util.Collection<BackupRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<BackupRule>(rules);
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupPlan withRules(BackupRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<BackupRule>(rules.length));
        }
        for (BackupRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a
     * selection of resources.
     * </p>
     * 
     * @param rules
     *        An array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back
     *        up a selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupPlan withRules(java.util.Collection<BackupRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPlan == false)
            return false;
        BackupPlan other = (BackupPlan) obj;
        if (other.getBackupPlanName() == null ^ this.getBackupPlanName() == null)
            return false;
        if (other.getBackupPlanName() != null && other.getBackupPlanName().equals(this.getBackupPlanName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanName() == null) ? 0 : getBackupPlanName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public BackupPlan clone() {
        try {
            return (BackupPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
