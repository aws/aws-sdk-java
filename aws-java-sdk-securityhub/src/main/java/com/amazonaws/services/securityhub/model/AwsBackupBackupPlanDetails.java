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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupPlanDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     */
    private AwsBackupBackupPlanBackupPlanDetails backupPlan;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     * </p>
     */
    private String backupPlanArn;
    /**
     * <p>
     * A unique ID for the backup plan.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @param backupPlan
     *        Uniquely identifies the backup plan to be associated with the selection of resources.
     */

    public void setBackupPlan(AwsBackupBackupPlanBackupPlanDetails backupPlan) {
        this.backupPlan = backupPlan;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @return Uniquely identifies the backup plan to be associated with the selection of resources.
     */

    public AwsBackupBackupPlanBackupPlanDetails getBackupPlan() {
        return this.backupPlan;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     * </p>
     * 
     * @param backupPlan
     *        Uniquely identifies the backup plan to be associated with the selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanDetails withBackupPlan(AwsBackupBackupPlanBackupPlanDetails backupPlan) {
        setBackupPlan(backupPlan);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     */

    public void setBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     */

    public String getBackupPlanArn() {
        return this.backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanDetails withBackupPlanArn(String backupPlanArn) {
        setBackupPlanArn(backupPlanArn);
        return this;
    }

    /**
     * <p>
     * A unique ID for the backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        A unique ID for the backup plan.
     */

    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * A unique ID for the backup plan.
     * </p>
     * 
     * @return A unique ID for the backup plan.
     */

    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * <p>
     * A unique ID for the backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        A unique ID for the backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanDetails withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     * </p>
     * 
     * @return Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanDetails withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getBackupPlan() != null)
            sb.append("BackupPlan: ").append(getBackupPlan()).append(",");
        if (getBackupPlanArn() != null)
            sb.append("BackupPlanArn: ").append(getBackupPlanArn()).append(",");
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupPlanDetails == false)
            return false;
        AwsBackupBackupPlanDetails other = (AwsBackupBackupPlanDetails) obj;
        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        if (other.getBackupPlanArn() == null ^ this.getBackupPlanArn() == null)
            return false;
        if (other.getBackupPlanArn() != null && other.getBackupPlanArn().equals(this.getBackupPlanArn()) == false)
            return false;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanArn() == null) ? 0 : getBackupPlanArn().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupPlanDetails clone() {
        try {
            return (AwsBackupBackupPlanDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupPlanDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
