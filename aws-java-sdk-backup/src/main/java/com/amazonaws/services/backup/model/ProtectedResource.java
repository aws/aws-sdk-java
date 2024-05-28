/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that contains information about a backed-up resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ProtectedResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service (VSS) backups,
     * the only supported resource type is Amazon EC2.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastBackupTime;
    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     */
    private String lastBackupVaultArn;
    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     */
    private String lastRecoveryPointArn;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param resourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param resourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service (VSS) backups,
     * the only supported resource type is Amazon EC2.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *        or an Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service
     *        (VSS) backups, the only supported resource type is Amazon EC2.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service (VSS) backups,
     * the only supported resource type is Amazon EC2.
     * </p>
     * 
     * @return The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *         or an Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service
     *         (VSS) backups, the only supported resource type is Amazon EC2.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service (VSS) backups,
     * the only supported resource type is Amazon EC2.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *        or an Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service
     *        (VSS) backups, the only supported resource type is Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastBackupTime(java.util.Date lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
    }

    /**
     * <p>
     * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastBackupTime() {
        return this.lastBackupTime;
    }

    /**
     * <p>
     * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withLastBackupTime(java.util.Date lastBackupTime) {
        setLastBackupTime(lastBackupTime);
        return this;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @param resourceName
     *        This is the non-unique name of the resource that belongs to the specified backup.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @return This is the non-unique name of the resource that belongs to the specified backup.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @param resourceName
     *        This is the non-unique name of the resource that belongs to the specified backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @param lastBackupVaultArn
     *        This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *        point.
     */

    public void setLastBackupVaultArn(String lastBackupVaultArn) {
        this.lastBackupVaultArn = lastBackupVaultArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @return This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *         point.
     */

    public String getLastBackupVaultArn() {
        return this.lastBackupVaultArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @param lastBackupVaultArn
     *        This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *        point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withLastBackupVaultArn(String lastBackupVaultArn) {
        setLastBackupVaultArn(lastBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @param lastRecoveryPointArn
     *        This is the ARN (Amazon Resource Name) of the most recent recovery point.
     */

    public void setLastRecoveryPointArn(String lastRecoveryPointArn) {
        this.lastRecoveryPointArn = lastRecoveryPointArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @return This is the ARN (Amazon Resource Name) of the most recent recovery point.
     */

    public String getLastRecoveryPointArn() {
        return this.lastRecoveryPointArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @param lastRecoveryPointArn
     *        This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResource withLastRecoveryPointArn(String lastRecoveryPointArn) {
        setLastRecoveryPointArn(lastRecoveryPointArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLastBackupTime() != null)
            sb.append("LastBackupTime: ").append(getLastBackupTime()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getLastBackupVaultArn() != null)
            sb.append("LastBackupVaultArn: ").append(getLastBackupVaultArn()).append(",");
        if (getLastRecoveryPointArn() != null)
            sb.append("LastRecoveryPointArn: ").append(getLastRecoveryPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedResource == false)
            return false;
        ProtectedResource other = (ProtectedResource) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastBackupTime() == null ^ this.getLastBackupTime() == null)
            return false;
        if (other.getLastBackupTime() != null && other.getLastBackupTime().equals(this.getLastBackupTime()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getLastBackupVaultArn() == null ^ this.getLastBackupVaultArn() == null)
            return false;
        if (other.getLastBackupVaultArn() != null && other.getLastBackupVaultArn().equals(this.getLastBackupVaultArn()) == false)
            return false;
        if (other.getLastRecoveryPointArn() == null ^ this.getLastRecoveryPointArn() == null)
            return false;
        if (other.getLastRecoveryPointArn() != null && other.getLastRecoveryPointArn().equals(this.getLastRecoveryPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLastBackupTime() == null) ? 0 : getLastBackupTime().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getLastBackupVaultArn() == null) ? 0 : getLastBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getLastRecoveryPointArn() == null) ? 0 : getLastRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedResource clone() {
        try {
            return (ProtectedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ProtectedResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
