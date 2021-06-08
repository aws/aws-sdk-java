/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request data replication info.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DataReplicationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error in obtaining data replication info.
     * </p>
     */
    private DataReplicationError dataReplicationError;
    /**
     * <p>
     * Request to query whether data replication has been initiated.
     * </p>
     */
    private DataReplicationInitiation dataReplicationInitiation;
    /**
     * <p>
     * Request to query the data replication state.
     * </p>
     */
    private String dataReplicationState;
    /**
     * <p>
     * Request to query the time when data replication will be complete.
     * </p>
     */
    private String etaDateTime;
    /**
     * <p>
     * Request to query data replication lag durating.
     * </p>
     */
    private String lagDuration;
    /**
     * <p>
     * Request to query disks replicated.
     * </p>
     */
    private java.util.List<DataReplicationInfoReplicatedDisk> replicatedDisks;

    /**
     * <p>
     * Error in obtaining data replication info.
     * </p>
     * 
     * @param dataReplicationError
     *        Error in obtaining data replication info.
     */

    public void setDataReplicationError(DataReplicationError dataReplicationError) {
        this.dataReplicationError = dataReplicationError;
    }

    /**
     * <p>
     * Error in obtaining data replication info.
     * </p>
     * 
     * @return Error in obtaining data replication info.
     */

    public DataReplicationError getDataReplicationError() {
        return this.dataReplicationError;
    }

    /**
     * <p>
     * Error in obtaining data replication info.
     * </p>
     * 
     * @param dataReplicationError
     *        Error in obtaining data replication info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withDataReplicationError(DataReplicationError dataReplicationError) {
        setDataReplicationError(dataReplicationError);
        return this;
    }

    /**
     * <p>
     * Request to query whether data replication has been initiated.
     * </p>
     * 
     * @param dataReplicationInitiation
     *        Request to query whether data replication has been initiated.
     */

    public void setDataReplicationInitiation(DataReplicationInitiation dataReplicationInitiation) {
        this.dataReplicationInitiation = dataReplicationInitiation;
    }

    /**
     * <p>
     * Request to query whether data replication has been initiated.
     * </p>
     * 
     * @return Request to query whether data replication has been initiated.
     */

    public DataReplicationInitiation getDataReplicationInitiation() {
        return this.dataReplicationInitiation;
    }

    /**
     * <p>
     * Request to query whether data replication has been initiated.
     * </p>
     * 
     * @param dataReplicationInitiation
     *        Request to query whether data replication has been initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withDataReplicationInitiation(DataReplicationInitiation dataReplicationInitiation) {
        setDataReplicationInitiation(dataReplicationInitiation);
        return this;
    }

    /**
     * <p>
     * Request to query the data replication state.
     * </p>
     * 
     * @param dataReplicationState
     *        Request to query the data replication state.
     * @see DataReplicationState
     */

    public void setDataReplicationState(String dataReplicationState) {
        this.dataReplicationState = dataReplicationState;
    }

    /**
     * <p>
     * Request to query the data replication state.
     * </p>
     * 
     * @return Request to query the data replication state.
     * @see DataReplicationState
     */

    public String getDataReplicationState() {
        return this.dataReplicationState;
    }

    /**
     * <p>
     * Request to query the data replication state.
     * </p>
     * 
     * @param dataReplicationState
     *        Request to query the data replication state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationState
     */

    public DataReplicationInfo withDataReplicationState(String dataReplicationState) {
        setDataReplicationState(dataReplicationState);
        return this;
    }

    /**
     * <p>
     * Request to query the data replication state.
     * </p>
     * 
     * @param dataReplicationState
     *        Request to query the data replication state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationState
     */

    public DataReplicationInfo withDataReplicationState(DataReplicationState dataReplicationState) {
        this.dataReplicationState = dataReplicationState.toString();
        return this;
    }

    /**
     * <p>
     * Request to query the time when data replication will be complete.
     * </p>
     * 
     * @param etaDateTime
     *        Request to query the time when data replication will be complete.
     */

    public void setEtaDateTime(String etaDateTime) {
        this.etaDateTime = etaDateTime;
    }

    /**
     * <p>
     * Request to query the time when data replication will be complete.
     * </p>
     * 
     * @return Request to query the time when data replication will be complete.
     */

    public String getEtaDateTime() {
        return this.etaDateTime;
    }

    /**
     * <p>
     * Request to query the time when data replication will be complete.
     * </p>
     * 
     * @param etaDateTime
     *        Request to query the time when data replication will be complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withEtaDateTime(String etaDateTime) {
        setEtaDateTime(etaDateTime);
        return this;
    }

    /**
     * <p>
     * Request to query data replication lag durating.
     * </p>
     * 
     * @param lagDuration
     *        Request to query data replication lag durating.
     */

    public void setLagDuration(String lagDuration) {
        this.lagDuration = lagDuration;
    }

    /**
     * <p>
     * Request to query data replication lag durating.
     * </p>
     * 
     * @return Request to query data replication lag durating.
     */

    public String getLagDuration() {
        return this.lagDuration;
    }

    /**
     * <p>
     * Request to query data replication lag durating.
     * </p>
     * 
     * @param lagDuration
     *        Request to query data replication lag durating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfo withLagDuration(String lagDuration) {
        setLagDuration(lagDuration);
        return this;
    }

    /**
     * <p>
     * Request to query disks replicated.
     * </p>
     * 
     * @return Request to query disks replicated.
     */

    public java.util.List<DataReplicationInfoReplicatedDisk> getReplicatedDisks() {
        return replicatedDisks;
    }

    /**
     * <p>
     * Request to query disks replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        Request to query disks replicated.
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
     * Request to query disks replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatedDisks(java.util.Collection)} or {@link #withReplicatedDisks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatedDisks
     *        Request to query disks replicated.
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
     * Request to query disks replicated.
     * </p>
     * 
     * @param replicatedDisks
     *        Request to query disks replicated.
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
        com.amazonaws.services.mgn.model.transform.DataReplicationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
