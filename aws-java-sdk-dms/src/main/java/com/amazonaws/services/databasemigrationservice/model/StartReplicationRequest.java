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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name of the replication for which to start replication.
     * </p>
     */
    private String replicationConfigArn;
    /**
     * <p>
     * The replication type.
     * </p>
     */
    private String startReplicationType;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     */
    private java.util.Date cdcStartTime;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want a CDC operation to start. Specifying both values results in
     * an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     */
    private String cdcStopPosition;

    /**
     * <p>
     * The Amazon Resource Name of the replication for which to start replication.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication for which to start replication.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication for which to start replication.
     * </p>
     * 
     * @return The Amazon Resource Name of the replication for which to start replication.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication for which to start replication.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication for which to start replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationRequest withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
        return this;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @param startReplicationType
     *        The replication type.
     */

    public void setStartReplicationType(String startReplicationType) {
        this.startReplicationType = startReplicationType;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @return The replication type.
     */

    public String getStartReplicationType() {
        return this.startReplicationType;
    }

    /**
     * <p>
     * The replication type.
     * </p>
     * 
     * @param startReplicationType
     *        The replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationRequest withStartReplicationType(String startReplicationType) {
        setStartReplicationType(startReplicationType);
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *         or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both
     *         values results in an error.
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code> or
     * <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values results
     * in an error.
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either <code>CdcStartTime</code>
     *        or <code>CdcStartPosition</code> to specify when you want a CDC operation to start. Specifying both values
     *        results in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want a CDC operation to start. Specifying both values results in
     * an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either
     *        <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want a CDC operation to
     *        start. Specifying both values results in an error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want a CDC operation to start. Specifying both values results in
     * an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. Use either
     *         <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want a CDC operation to
     *         start. Specifying both values results in an error.</p>
     *         <p>
     *         The value can be in date, checkpoint, or LSN/SCN format.
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either <code>CdcStartPosition</code>
     * or <code>CdcStartTime</code> to specify when you want a CDC operation to start. Specifying both values results in
     * an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either
     *        <code>CdcStartPosition</code> or <code>CdcStartTime</code> to specify when you want a CDC operation to
     *        start. Specifying both values results in an error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationRequest withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to stop. The value can be either server
     *         time or commit time.
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationRequest withCdcStopPosition(String cdcStopPosition) {
        setCdcStopPosition(cdcStopPosition);
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
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn()).append(",");
        if (getStartReplicationType() != null)
            sb.append("StartReplicationType: ").append(getStartReplicationType()).append(",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: ").append(getCdcStartTime()).append(",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: ").append(getCdcStartPosition()).append(",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: ").append(getCdcStopPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplicationRequest == false)
            return false;
        StartReplicationRequest other = (StartReplicationRequest) obj;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
            return false;
        if (other.getStartReplicationType() == null ^ this.getStartReplicationType() == null)
            return false;
        if (other.getStartReplicationType() != null && other.getStartReplicationType().equals(this.getStartReplicationType()) == false)
            return false;
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
            return false;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        hashCode = prime * hashCode + ((getStartReplicationType() == null) ? 0 : getStartReplicationType().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        return hashCode;
    }

    @Override
    public StartReplicationRequest clone() {
        return (StartReplicationRequest) super.clone();
    }

}
