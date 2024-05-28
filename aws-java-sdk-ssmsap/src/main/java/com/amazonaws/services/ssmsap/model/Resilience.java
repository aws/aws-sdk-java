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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the SAP HANA system replication for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Resilience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resilience implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tier of the component.
     * </p>
     */
    private String hsrTier;
    /**
     * <p>
     * The replication mode of the component.
     * </p>
     */
    private String hsrReplicationMode;
    /**
     * <p>
     * The operation mode of the component.
     * </p>
     */
    private String hsrOperationMode;
    /**
     * <p>
     * The cluster status of the component.
     * </p>
     */
    private String clusterStatus;
    /**
     * <p>
     * Indicates if or not enqueue replication is enabled for the ASCS component.
     * </p>
     */
    private Boolean enqueueReplication;

    /**
     * <p>
     * The tier of the component.
     * </p>
     * 
     * @param hsrTier
     *        The tier of the component.
     */

    public void setHsrTier(String hsrTier) {
        this.hsrTier = hsrTier;
    }

    /**
     * <p>
     * The tier of the component.
     * </p>
     * 
     * @return The tier of the component.
     */

    public String getHsrTier() {
        return this.hsrTier;
    }

    /**
     * <p>
     * The tier of the component.
     * </p>
     * 
     * @param hsrTier
     *        The tier of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resilience withHsrTier(String hsrTier) {
        setHsrTier(hsrTier);
        return this;
    }

    /**
     * <p>
     * The replication mode of the component.
     * </p>
     * 
     * @param hsrReplicationMode
     *        The replication mode of the component.
     * @see ReplicationMode
     */

    public void setHsrReplicationMode(String hsrReplicationMode) {
        this.hsrReplicationMode = hsrReplicationMode;
    }

    /**
     * <p>
     * The replication mode of the component.
     * </p>
     * 
     * @return The replication mode of the component.
     * @see ReplicationMode
     */

    public String getHsrReplicationMode() {
        return this.hsrReplicationMode;
    }

    /**
     * <p>
     * The replication mode of the component.
     * </p>
     * 
     * @param hsrReplicationMode
     *        The replication mode of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationMode
     */

    public Resilience withHsrReplicationMode(String hsrReplicationMode) {
        setHsrReplicationMode(hsrReplicationMode);
        return this;
    }

    /**
     * <p>
     * The replication mode of the component.
     * </p>
     * 
     * @param hsrReplicationMode
     *        The replication mode of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationMode
     */

    public Resilience withHsrReplicationMode(ReplicationMode hsrReplicationMode) {
        this.hsrReplicationMode = hsrReplicationMode.toString();
        return this;
    }

    /**
     * <p>
     * The operation mode of the component.
     * </p>
     * 
     * @param hsrOperationMode
     *        The operation mode of the component.
     * @see OperationMode
     */

    public void setHsrOperationMode(String hsrOperationMode) {
        this.hsrOperationMode = hsrOperationMode;
    }

    /**
     * <p>
     * The operation mode of the component.
     * </p>
     * 
     * @return The operation mode of the component.
     * @see OperationMode
     */

    public String getHsrOperationMode() {
        return this.hsrOperationMode;
    }

    /**
     * <p>
     * The operation mode of the component.
     * </p>
     * 
     * @param hsrOperationMode
     *        The operation mode of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationMode
     */

    public Resilience withHsrOperationMode(String hsrOperationMode) {
        setHsrOperationMode(hsrOperationMode);
        return this;
    }

    /**
     * <p>
     * The operation mode of the component.
     * </p>
     * 
     * @param hsrOperationMode
     *        The operation mode of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationMode
     */

    public Resilience withHsrOperationMode(OperationMode hsrOperationMode) {
        this.hsrOperationMode = hsrOperationMode.toString();
        return this;
    }

    /**
     * <p>
     * The cluster status of the component.
     * </p>
     * 
     * @param clusterStatus
     *        The cluster status of the component.
     * @see ClusterStatus
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The cluster status of the component.
     * </p>
     * 
     * @return The cluster status of the component.
     * @see ClusterStatus
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The cluster status of the component.
     * </p>
     * 
     * @param clusterStatus
     *        The cluster status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public Resilience withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The cluster status of the component.
     * </p>
     * 
     * @param clusterStatus
     *        The cluster status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterStatus
     */

    public Resilience withClusterStatus(ClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if or not enqueue replication is enabled for the ASCS component.
     * </p>
     * 
     * @param enqueueReplication
     *        Indicates if or not enqueue replication is enabled for the ASCS component.
     */

    public void setEnqueueReplication(Boolean enqueueReplication) {
        this.enqueueReplication = enqueueReplication;
    }

    /**
     * <p>
     * Indicates if or not enqueue replication is enabled for the ASCS component.
     * </p>
     * 
     * @return Indicates if or not enqueue replication is enabled for the ASCS component.
     */

    public Boolean getEnqueueReplication() {
        return this.enqueueReplication;
    }

    /**
     * <p>
     * Indicates if or not enqueue replication is enabled for the ASCS component.
     * </p>
     * 
     * @param enqueueReplication
     *        Indicates if or not enqueue replication is enabled for the ASCS component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resilience withEnqueueReplication(Boolean enqueueReplication) {
        setEnqueueReplication(enqueueReplication);
        return this;
    }

    /**
     * <p>
     * Indicates if or not enqueue replication is enabled for the ASCS component.
     * </p>
     * 
     * @return Indicates if or not enqueue replication is enabled for the ASCS component.
     */

    public Boolean isEnqueueReplication() {
        return this.enqueueReplication;
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
        if (getHsrTier() != null)
            sb.append("HsrTier: ").append(getHsrTier()).append(",");
        if (getHsrReplicationMode() != null)
            sb.append("HsrReplicationMode: ").append(getHsrReplicationMode()).append(",");
        if (getHsrOperationMode() != null)
            sb.append("HsrOperationMode: ").append(getHsrOperationMode()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus()).append(",");
        if (getEnqueueReplication() != null)
            sb.append("EnqueueReplication: ").append(getEnqueueReplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resilience == false)
            return false;
        Resilience other = (Resilience) obj;
        if (other.getHsrTier() == null ^ this.getHsrTier() == null)
            return false;
        if (other.getHsrTier() != null && other.getHsrTier().equals(this.getHsrTier()) == false)
            return false;
        if (other.getHsrReplicationMode() == null ^ this.getHsrReplicationMode() == null)
            return false;
        if (other.getHsrReplicationMode() != null && other.getHsrReplicationMode().equals(this.getHsrReplicationMode()) == false)
            return false;
        if (other.getHsrOperationMode() == null ^ this.getHsrOperationMode() == null)
            return false;
        if (other.getHsrOperationMode() != null && other.getHsrOperationMode().equals(this.getHsrOperationMode()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getEnqueueReplication() == null ^ this.getEnqueueReplication() == null)
            return false;
        if (other.getEnqueueReplication() != null && other.getEnqueueReplication().equals(this.getEnqueueReplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsrTier() == null) ? 0 : getHsrTier().hashCode());
        hashCode = prime * hashCode + ((getHsrReplicationMode() == null) ? 0 : getHsrReplicationMode().hashCode());
        hashCode = prime * hashCode + ((getHsrOperationMode() == null) ? 0 : getHsrOperationMode().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getEnqueueReplication() == null) ? 0 : getEnqueueReplication().hashCode());
        return hashCode;
    }

    @Override
    public Resilience clone() {
        try {
            return (Resilience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ResilienceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
