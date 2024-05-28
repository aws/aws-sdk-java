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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information for all the version replication statuses applicable for Global resiliency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotVersionReplicaSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotVersionReplicaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bot version for the summary information for all the version replication statuses.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The version replication status for all the replicated bots.
     * </p>
     */
    private String botVersionReplicationStatus;
    /**
     * <p>
     * The creation date and time of the replication status for all the replicated bots.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The reasons for replication failure for all the replicated bots.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The bot version for the summary information for all the version replication statuses.
     * </p>
     * 
     * @param botVersion
     *        The bot version for the summary information for all the version replication statuses.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version for the summary information for all the version replication statuses.
     * </p>
     * 
     * @return The bot version for the summary information for all the version replication statuses.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version for the summary information for all the version replication statuses.
     * </p>
     * 
     * @param botVersion
     *        The bot version for the summary information for all the version replication statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionReplicaSummary withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The version replication status for all the replicated bots.
     * </p>
     * 
     * @param botVersionReplicationStatus
     *        The version replication status for all the replicated bots.
     * @see BotVersionReplicationStatus
     */

    public void setBotVersionReplicationStatus(String botVersionReplicationStatus) {
        this.botVersionReplicationStatus = botVersionReplicationStatus;
    }

    /**
     * <p>
     * The version replication status for all the replicated bots.
     * </p>
     * 
     * @return The version replication status for all the replicated bots.
     * @see BotVersionReplicationStatus
     */

    public String getBotVersionReplicationStatus() {
        return this.botVersionReplicationStatus;
    }

    /**
     * <p>
     * The version replication status for all the replicated bots.
     * </p>
     * 
     * @param botVersionReplicationStatus
     *        The version replication status for all the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotVersionReplicationStatus
     */

    public BotVersionReplicaSummary withBotVersionReplicationStatus(String botVersionReplicationStatus) {
        setBotVersionReplicationStatus(botVersionReplicationStatus);
        return this;
    }

    /**
     * <p>
     * The version replication status for all the replicated bots.
     * </p>
     * 
     * @param botVersionReplicationStatus
     *        The version replication status for all the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotVersionReplicationStatus
     */

    public BotVersionReplicaSummary withBotVersionReplicationStatus(BotVersionReplicationStatus botVersionReplicationStatus) {
        this.botVersionReplicationStatus = botVersionReplicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the replication status for all the replicated bots.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the replication status for all the replicated bots.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the replication status for all the replicated bots.
     * </p>
     * 
     * @return The creation date and time of the replication status for all the replicated bots.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the replication status for all the replicated bots.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the replication status for all the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionReplicaSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The reasons for replication failure for all the replicated bots.
     * </p>
     * 
     * @return The reasons for replication failure for all the replicated bots.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The reasons for replication failure for all the replicated bots.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for replication failure for all the replicated bots.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * The reasons for replication failure for all the replicated bots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for replication failure for all the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionReplicaSummary withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reasons for replication failure for all the replicated bots.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for replication failure for all the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotVersionReplicaSummary withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotVersionReplicationStatus() != null)
            sb.append("BotVersionReplicationStatus: ").append(getBotVersionReplicationStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotVersionReplicaSummary == false)
            return false;
        BotVersionReplicaSummary other = (BotVersionReplicaSummary) obj;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotVersionReplicationStatus() == null ^ this.getBotVersionReplicationStatus() == null)
            return false;
        if (other.getBotVersionReplicationStatus() != null && other.getBotVersionReplicationStatus().equals(this.getBotVersionReplicationStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotVersionReplicationStatus() == null) ? 0 : getBotVersionReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public BotVersionReplicaSummary clone() {
        try {
            return (BotVersionReplicaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotVersionReplicaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
