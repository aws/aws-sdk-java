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
 * The details of the copy operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CopyAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyAction implements Serializable, Cloneable, StructuredPojo {

    private Lifecycle lifecycle;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For
     * example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     */
    private String destinationBackupVaultArn;

    /**
     * @param lifecycle
     */

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * @return
     */

    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @param lifecycle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyAction withLifecycle(Lifecycle lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For
     * example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     *        For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     */

    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For
     * example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied
     *         backup. For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     */

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For
     * example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
     *        For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyAction withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        setDestinationBackupVaultArn(destinationBackupVaultArn);
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: ").append(getDestinationBackupVaultArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyAction == false)
            return false;
        CopyAction other = (CopyAction) obj;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn().hashCode());
        return hashCode;
    }

    @Override
    public CopyAction clone() {
        try {
            return (CopyAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.CopyActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
