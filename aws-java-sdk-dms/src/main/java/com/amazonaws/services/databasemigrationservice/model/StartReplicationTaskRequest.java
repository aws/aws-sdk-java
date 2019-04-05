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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The type of replication task.
     * </p>
     */
    private String startReplicationTaskType;
    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     */
    private java.util.Date cdcStartTime;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     */
    private String cdcStartPosition;
    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     * </p>
     */
    private String cdcStopPosition;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task to be started.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task to be started.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task to be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public void setStartReplicationTaskType(String startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @return The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public String getStartReplicationTaskType() {
        return this.startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartReplicationTaskTypeValue
     */

    public StartReplicationTaskRequest withStartReplicationTaskType(String startReplicationTaskType) {
        setStartReplicationTaskType(startReplicationTaskType);
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public void setStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
        withStartReplicationTaskType(startReplicationTaskType);
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartReplicationTaskTypeValue
     */

    public StartReplicationTaskRequest withStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @return Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *         CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
     *         <p>
     *         Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition
     * to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * 
     * @param cdcStartTime
     *        Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or
     *        CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     */

    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *         CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *         error.</p>
     *         <p>
     *         The value can be in date, checkpoint, or LSN/SCN format.
     *         </p>
     *         <p>
     *         Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *         </p>
     *         <p>
     *         Checkpoint Example: --cdc-start-position
     *         "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *         </p>
     *         <p>
     *         LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     */

    public String getCdcStartPosition() {
        return this.cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     * CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * 
     * @param cdcStartPosition
     *        Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or
     *        CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an
     *        error.</p>
     *        <p>
     *        The value can be in date, checkpoint, or LSN/SCN format.
     *        </p>
     *        <p>
     *        Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *        </p>
     *        <p>
     *        Checkpoint Example: --cdc-start-position
     *        "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *        </p>
     *        <p>
     *        LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
        setCdcStartPosition(cdcStartPosition);
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     */

    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     * </p>
     * 
     * @return Indicates when you want a change data capture (CDC) operation to stop. The value can be either server
     *         time or commit time.</p>
     *         <p>
     *         Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     *         </p>
     *         <p>
     *         Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     */

    public String getCdcStopPosition() {
        return this.cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or
     * commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     * </p>
     * 
     * @param cdcStopPosition
     *        Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time
     *        or commit time.</p>
     *        <p>
     *        Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12”
     *        </p>
     *        <p>
     *        Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getStartReplicationTaskType() != null)
            sb.append("StartReplicationTaskType: ").append(getStartReplicationTaskType()).append(",");
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

        if (obj instanceof StartReplicationTaskRequest == false)
            return false;
        StartReplicationTaskRequest other = (StartReplicationTaskRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getStartReplicationTaskType() == null ^ this.getStartReplicationTaskType() == null)
            return false;
        if (other.getStartReplicationTaskType() != null && other.getStartReplicationTaskType().equals(this.getStartReplicationTaskType()) == false)
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

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getStartReplicationTaskType() == null) ? 0 : getStartReplicationTaskType().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        return hashCode;
    }

    @Override
    public StartReplicationTaskRequest clone() {
        return (StartReplicationTaskRequest) super.clone();
    }

}
