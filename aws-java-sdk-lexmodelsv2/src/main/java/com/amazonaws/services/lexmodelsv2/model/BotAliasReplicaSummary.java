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
 * Contains information about all the aliases replication statuses applicable for global resiliency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotAliasReplicaSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotAliasReplicaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bot alias ID for all the alias bot replications.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The replication statuses for all the alias bot replications.
     * </p>
     */
    private String botAliasReplicationStatus;
    /**
     * <p>
     * The bot version for all the alias bot replications.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The creation time and date for all the alias bot replications.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The last time and date updated for all the alias bot replications.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The reasons for failure for the aliases bot replications.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The bot alias ID for all the alias bot replications.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias ID for all the alias bot replications.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The bot alias ID for all the alias bot replications.
     * </p>
     * 
     * @return The bot alias ID for all the alias bot replications.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The bot alias ID for all the alias bot replications.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias ID for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The replication statuses for all the alias bot replications.
     * </p>
     * 
     * @param botAliasReplicationStatus
     *        The replication statuses for all the alias bot replications.
     * @see BotAliasReplicationStatus
     */

    public void setBotAliasReplicationStatus(String botAliasReplicationStatus) {
        this.botAliasReplicationStatus = botAliasReplicationStatus;
    }

    /**
     * <p>
     * The replication statuses for all the alias bot replications.
     * </p>
     * 
     * @return The replication statuses for all the alias bot replications.
     * @see BotAliasReplicationStatus
     */

    public String getBotAliasReplicationStatus() {
        return this.botAliasReplicationStatus;
    }

    /**
     * <p>
     * The replication statuses for all the alias bot replications.
     * </p>
     * 
     * @param botAliasReplicationStatus
     *        The replication statuses for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasReplicationStatus
     */

    public BotAliasReplicaSummary withBotAliasReplicationStatus(String botAliasReplicationStatus) {
        setBotAliasReplicationStatus(botAliasReplicationStatus);
        return this;
    }

    /**
     * <p>
     * The replication statuses for all the alias bot replications.
     * </p>
     * 
     * @param botAliasReplicationStatus
     *        The replication statuses for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasReplicationStatus
     */

    public BotAliasReplicaSummary withBotAliasReplicationStatus(BotAliasReplicationStatus botAliasReplicationStatus) {
        this.botAliasReplicationStatus = botAliasReplicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The bot version for all the alias bot replications.
     * </p>
     * 
     * @param botVersion
     *        The bot version for all the alias bot replications.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version for all the alias bot replications.
     * </p>
     * 
     * @return The bot version for all the alias bot replications.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version for all the alias bot replications.
     * </p>
     * 
     * @param botVersion
     *        The bot version for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The creation time and date for all the alias bot replications.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time and date for all the alias bot replications.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation time and date for all the alias bot replications.
     * </p>
     * 
     * @return The creation time and date for all the alias bot replications.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation time and date for all the alias bot replications.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time and date for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The last time and date updated for all the alias bot replications.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last time and date updated for all the alias bot replications.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last time and date updated for all the alias bot replications.
     * </p>
     * 
     * @return The last time and date updated for all the alias bot replications.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last time and date updated for all the alias bot replications.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last time and date updated for all the alias bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The reasons for failure for the aliases bot replications.
     * </p>
     * 
     * @return The reasons for failure for the aliases bot replications.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The reasons for failure for the aliases bot replications.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for failure for the aliases bot replications.
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
     * The reasons for failure for the aliases bot replications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for failure for the aliases bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withFailureReasons(String... failureReasons) {
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
     * The reasons for failure for the aliases bot replications.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for failure for the aliases bot replications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasReplicaSummary withFailureReasons(java.util.Collection<String> failureReasons) {
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotAliasReplicationStatus() != null)
            sb.append("BotAliasReplicationStatus: ").append(getBotAliasReplicationStatus()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
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

        if (obj instanceof BotAliasReplicaSummary == false)
            return false;
        BotAliasReplicaSummary other = (BotAliasReplicaSummary) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotAliasReplicationStatus() == null ^ this.getBotAliasReplicationStatus() == null)
            return false;
        if (other.getBotAliasReplicationStatus() != null && other.getBotAliasReplicationStatus().equals(this.getBotAliasReplicationStatus()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasReplicationStatus() == null) ? 0 : getBotAliasReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public BotAliasReplicaSummary clone() {
        try {
            return (BotAliasReplicaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotAliasReplicaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
