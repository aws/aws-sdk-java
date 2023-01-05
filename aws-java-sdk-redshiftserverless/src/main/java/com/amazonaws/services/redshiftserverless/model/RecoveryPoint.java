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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The automatically created recovery point of a namespace. Recovery points are created every 30 minutes and kept for 24
 * hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RecoveryPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the namespace the recovery point is associated with.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The time the recovery point is created.
     * </p>
     */
    private java.util.Date recoveryPointCreateTime;
    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     */
    private String recoveryPointId;
    /**
     * <p>
     * The total size of the data in the recovery point in megabytes.
     * </p>
     */
    private Double totalSizeInMegaBytes;
    /**
     * <p>
     * The name of the workgroup the recovery point is associated with.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace the recovery point is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the namespace the recovery point is associated with.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace the recovery point is associated with.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace the recovery point is associated with.
     * </p>
     * 
     * @return The name of the namespace the recovery point is associated with.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace the recovery point is associated with.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace the recovery point is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The time the recovery point is created.
     * </p>
     * 
     * @param recoveryPointCreateTime
     *        The time the recovery point is created.
     */

    public void setRecoveryPointCreateTime(java.util.Date recoveryPointCreateTime) {
        this.recoveryPointCreateTime = recoveryPointCreateTime;
    }

    /**
     * <p>
     * The time the recovery point is created.
     * </p>
     * 
     * @return The time the recovery point is created.
     */

    public java.util.Date getRecoveryPointCreateTime() {
        return this.recoveryPointCreateTime;
    }

    /**
     * <p>
     * The time the recovery point is created.
     * </p>
     * 
     * @param recoveryPointCreateTime
     *        The time the recovery point is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withRecoveryPointCreateTime(java.util.Date recoveryPointCreateTime) {
        setRecoveryPointCreateTime(recoveryPointCreateTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point.
     */

    public void setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @return The unique identifier of the recovery point.
     */

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withRecoveryPointId(String recoveryPointId) {
        setRecoveryPointId(recoveryPointId);
        return this;
    }

    /**
     * <p>
     * The total size of the data in the recovery point in megabytes.
     * </p>
     * 
     * @param totalSizeInMegaBytes
     *        The total size of the data in the recovery point in megabytes.
     */

    public void setTotalSizeInMegaBytes(Double totalSizeInMegaBytes) {
        this.totalSizeInMegaBytes = totalSizeInMegaBytes;
    }

    /**
     * <p>
     * The total size of the data in the recovery point in megabytes.
     * </p>
     * 
     * @return The total size of the data in the recovery point in megabytes.
     */

    public Double getTotalSizeInMegaBytes() {
        return this.totalSizeInMegaBytes;
    }

    /**
     * <p>
     * The total size of the data in the recovery point in megabytes.
     * </p>
     * 
     * @param totalSizeInMegaBytes
     *        The total size of the data in the recovery point in megabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withTotalSizeInMegaBytes(Double totalSizeInMegaBytes) {
        setTotalSizeInMegaBytes(totalSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup the recovery point is associated with.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup the recovery point is associated with.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup the recovery point is associated with.
     * </p>
     * 
     * @return The name of the workgroup the recovery point is associated with.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup the recovery point is associated with.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup the recovery point is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPoint withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getRecoveryPointCreateTime() != null)
            sb.append("RecoveryPointCreateTime: ").append(getRecoveryPointCreateTime()).append(",");
        if (getRecoveryPointId() != null)
            sb.append("RecoveryPointId: ").append(getRecoveryPointId()).append(",");
        if (getTotalSizeInMegaBytes() != null)
            sb.append("TotalSizeInMegaBytes: ").append(getTotalSizeInMegaBytes()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPoint == false)
            return false;
        RecoveryPoint other = (RecoveryPoint) obj;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getRecoveryPointCreateTime() == null ^ this.getRecoveryPointCreateTime() == null)
            return false;
        if (other.getRecoveryPointCreateTime() != null && other.getRecoveryPointCreateTime().equals(this.getRecoveryPointCreateTime()) == false)
            return false;
        if (other.getRecoveryPointId() == null ^ this.getRecoveryPointId() == null)
            return false;
        if (other.getRecoveryPointId() != null && other.getRecoveryPointId().equals(this.getRecoveryPointId()) == false)
            return false;
        if (other.getTotalSizeInMegaBytes() == null ^ this.getTotalSizeInMegaBytes() == null)
            return false;
        if (other.getTotalSizeInMegaBytes() != null && other.getTotalSizeInMegaBytes().equals(this.getTotalSizeInMegaBytes()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointCreateTime() == null) ? 0 : getRecoveryPointCreateTime().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointId() == null) ? 0 : getRecoveryPointId().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeInMegaBytes() == null) ? 0 : getTotalSizeInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryPoint clone() {
        try {
            return (RecoveryPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.RecoveryPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
