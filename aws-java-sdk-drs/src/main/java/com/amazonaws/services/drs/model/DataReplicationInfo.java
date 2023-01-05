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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about Data Replication
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DataReplicationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error in data replication.
     * </p>
     */
    private DataReplicationError dataReplicationError;
    /**
     * <p>
     * Information about whether the data replication has been initiated.
     * </p>
     */
    private DataReplicationInitiation dataReplicationInitiation;
    /**
     * <p>
     * The state of the data replication.
     * </p>
     */
    private String dataReplicationState;
    /**
     * <p>
     * An estimate of when the data replication will be completed.
     * </p>
     */
    private String etaDateTime;
    /**
     * <p>
     * Data replication lag duration.
     * </p>
     */
    private String lagDuration;
    /**
     * <p>
     * The disks that should be replicated.
     * </p>
     */
    private java.util.List<DataReplicationInfoReplicatedDisk> replicatedDisks;

    /**
     * <p>
     * Error in data replication.
     * </p>
     * 
     * @param dataReplicationError
     *        Error in data replication.
     */

    public void setDataReplicationError(DataReplicationError dataReplicationError) {
        this.dataReplicationError = dataReplicationError;
    }

    /**
     * <p>
     * Error in data replication.
     * </p>
     * 
     * @return Error in data replication.
     */

    public DataReplicationError getDataReplicationError() {
        return this.dataReplicationError;
    }

    /**
     * <p>
     * Error in data replication.
     * </p>
     * 
     * @param dataReplicationError
     *        Error in data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withDataReplicationError(DataReplicationError dataReplicationError) {
        setDataReplicationError(dataReplicationError);
        return this;
    }

    /**
     * <p>
     * Information about whether the data replication has been initiated.
     * </p>
     * 
     * @param dataReplicationInitiation
     *        Information about whether the data replication has been initiated.
     */

    public void setDataReplicationInitiation(DataReplicationInitiation dataReplicationInitiation) {
        this.dataReplicationInitiation = dataReplicationInitiation;
    }

    /**
     * <p>
     * Information about whether the data replication has been initiated.
     * </p>
     * 
     * @return Information about whether the data replication has been initiated.
     */

    public DataReplicationInitiation getDataReplicationInitiation() {
        return this.dataReplicationInitiation;
    }

    /**
     * <p>
     * Information about whether the data replication has been initiated.
     * </p>
     * 
     * @param dataReplicationInitiation
     *        Information about whether the data replication has been initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withDataReplicationInitiation(DataReplicationInitiation dataReplicationInitiation) {
        setDataReplicationInitiation(dataReplicationInitiation);
        return this;
    }

    /**
     * <p>
     * The state of the data replication.
     * </p>
     * 
     * @param dataReplicationState
     *        The state of the data replication.
     * @see DataReplicationState
     */

    public void setDataReplicationState(String dataReplicationState) {
        this.dataReplicationState = dataReplicationState;
    }

    /**
     * <p>
     * The state of the data replication.
     * </p>
     * 
     * @return The state of the data replication.
     * @see DataReplicationState
     */

    public String getDataReplicationState() {
        return this.dataReplicationState;
    }

    /**
     * <p>
     * The state of the data replication.
     * </p>
     * 
     * @param dataReplicationState
     *        The state of the data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationState
     */

    public DataReplicationInfo withDataReplicationState(String dataReplicationState) {
        setDataReplicationState(dataReplicationState);
        return this;
    }

    /**
     * <p>
     * The state of the data replication.
     * </p>
     * 
     * @param dataReplicationState
     *        The state of the data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationState
     */

    public DataReplicationInfo withDataReplicationState(DataReplicationState dataReplicationState) {
        this.dataReplicationState = dataReplicationState.toString();
        return this;
    }

    /**
     * <p>
     * An estimate of when the data replication will be completed.
     * </p>
     * 
     * @param etaDateTime
     *        An estimate of when the data replication will be completed.
     */

    public void setEtaDateTime(String etaDateTime) {
        this.etaDateTime = etaDateTime;
    }

    /**
     * <p>
     * An estimate of when the data replication will be completed.
     * </p>
     * 
     * @return An estimate of when the data replication will be completed.
     */

    public String getEtaDateTime() {
        return this.etaDateTime;
    }

    /**
     * <p>
     * An estimate of when the data replication will be completed.
     * </p>
     * 
     * @param etaDateTime
     *        An estimate of when the data replication will be completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withEtaDateTime(String etaDateTime) {
        setEtaDateTime(etaDateTime);
        return this;
    }

    /**
     * <p>
     * Data replication lag duration.
     * </p>
     * 
     * @param lagDuration
     *        Data replication lag duration.
     */

    public void setLagDuration(String lagDuration) {
        this.lagDuration = lagDuration;
    }

    /**
     * <p>
     * Data replication lag duration.
     * </p>
     * 
     * @return Data replication lag duration.
     */

    public String getLagDuration() {
        return this.lagDuration;
    }

    /**
     * <p>
     * Data replication lag duration.
     * </p>
     * 
     * @param lagDuration
     *        Data replication lag duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withLagDuration(String lagDuration) {
        setLagDuration(lagDuration);
        return this;
    }

    /**
     * <p>
     * The disks that should be replicated.
     * </p>
     * 
     * @return The disks that should be replicated.
     */

    public java.util.List<DataReplicationInfoReplicatedDisk> getReplicatedDisks() {
        return replicatedDisks;
    }

    /**
     * <p>
     * The disks that should be replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        The disks that should be replicated.
     */

    public void setReplicatedDisks(java.util.Collection<DataReplicationInfoReplicatedDisk> replicatedDisks) {
        if (replicatedDisks == null) {
            this.replicatedDisks = null;
            return;
        }

        this.replicatedDisks = new java.util.ArrayList<DataReplicationInfoReplicatedDisk>(replicatedDisks);
    }

    /**
     * <p>
     * The disks that should be replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatedDisks(java.util.Collection)} or {@link #withReplicatedDisks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatedDisks
     *        The disks that should be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withReplicatedDisks(DataReplicationInfoReplicatedDisk... replicatedDisks) {
        if (this.replicatedDisks == null) {
            setReplicatedDisks(new java.util.ArrayList<DataReplicationInfoReplicatedDisk>(replicatedDisks.length));
        }
        for (DataReplicationInfoReplicatedDisk ele : replicatedDisks) {
            this.replicatedDisks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The disks that should be replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        The disks that should be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withReplicatedDisks(java.util.Collection<DataReplicationInfoReplicatedDisk> replicatedDisks) {
        setReplicatedDisks(replicatedDisks);
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
        if (getDataReplicationError() != null)
            sb.append("DataReplicationError: ").append(getDataReplicationError()).append(",");
        if (getDataReplicationInitiation() != null)
            sb.append("DataReplicationInitiation: ").append(getDataReplicationInitiation()).append(",");
        if (getDataReplicationState() != null)
            sb.append("DataReplicationState: ").append(getDataReplicationState()).append(",");
        if (getEtaDateTime() != null)
            sb.append("EtaDateTime: ").append(getEtaDateTime()).append(",");
        if (getLagDuration() != null)
            sb.append("LagDuration: ").append(getLagDuration()).append(",");
        if (getReplicatedDisks() != null)
            sb.append("ReplicatedDisks: ").append(getReplicatedDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataReplicationInfo == false)
            return false;
        DataReplicationInfo other = (DataReplicationInfo) obj;
        if (other.getDataReplicationError() == null ^ this.getDataReplicationError() == null)
            return false;
        if (other.getDataReplicationError() != null && other.getDataReplicationError().equals(this.getDataReplicationError()) == false)
            return false;
        if (other.getDataReplicationInitiation() == null ^ this.getDataReplicationInitiation() == null)
            return false;
        if (other.getDataReplicationInitiation() != null && other.getDataReplicationInitiation().equals(this.getDataReplicationInitiation()) == false)
            return false;
        if (other.getDataReplicationState() == null ^ this.getDataReplicationState() == null)
            return false;
        if (other.getDataReplicationState() != null && other.getDataReplicationState().equals(this.getDataReplicationState()) == false)
            return false;
        if (other.getEtaDateTime() == null ^ this.getEtaDateTime() == null)
            return false;
        if (other.getEtaDateTime() != null && other.getEtaDateTime().equals(this.getEtaDateTime()) == false)
            return false;
        if (other.getLagDuration() == null ^ this.getLagDuration() == null)
            return false;
        if (other.getLagDuration() != null && other.getLagDuration().equals(this.getLagDuration()) == false)
            return false;
        if (other.getReplicatedDisks() == null ^ this.getReplicatedDisks() == null)
            return false;
        if (other.getReplicatedDisks() != null && other.getReplicatedDisks().equals(this.getReplicatedDisks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataReplicationError() == null) ? 0 : getDataReplicationError().hashCode());
        hashCode = prime * hashCode + ((getDataReplicationInitiation() == null) ? 0 : getDataReplicationInitiation().hashCode());
        hashCode = prime * hashCode + ((getDataReplicationState() == null) ? 0 : getDataReplicationState().hashCode());
        hashCode = prime * hashCode + ((getEtaDateTime() == null) ? 0 : getEtaDateTime().hashCode());
        hashCode = prime * hashCode + ((getLagDuration() == null) ? 0 : getLagDuration().hashCode());
        hashCode = prime * hashCode + ((getReplicatedDisks() == null) ? 0 : getReplicatedDisks().hashCode());
        return hashCode;
    }

    @Override
    public DataReplicationInfo clone() {
        try {
            return (DataReplicationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.DataReplicationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
