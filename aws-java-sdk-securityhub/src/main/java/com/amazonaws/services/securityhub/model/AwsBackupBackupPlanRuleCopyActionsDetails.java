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
 * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupPlanRuleCopyActionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanRuleCopyActionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * </p>
     */
    private String destinationBackupVaultArn;
    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     */
    private AwsBackupBackupPlanLifecycleDetails lifecycle;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     */

    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied
     *         backup.
     */

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleCopyActionsDetails withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        setDestinationBackupVaultArn(destinationBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @param lifecycle
     *        Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *        and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *        lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     */

    public void setLifecycle(AwsBackupBackupPlanLifecycleDetails lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @return Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *         and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *         lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     */

    public AwsBackupBackupPlanLifecycleDetails getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @param lifecycle
     *        Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *        and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *        lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleCopyActionsDetails withLifecycle(AwsBackupBackupPlanLifecycleDetails lifecycle) {
        setLifecycle(lifecycle);
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
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: ").append(getDestinationBackupVaultArn()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupPlanRuleCopyActionsDetails == false)
            return false;
        AwsBackupBackupPlanRuleCopyActionsDetails other = (AwsBackupBackupPlanRuleCopyActionsDetails) obj;
        if (other.getDestinationBackupVaultArn() == null ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupPlanRuleCopyActionsDetails clone() {
        try {
            return (AwsBackupBackupPlanRuleCopyActionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupPlanRuleCopyActionsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
