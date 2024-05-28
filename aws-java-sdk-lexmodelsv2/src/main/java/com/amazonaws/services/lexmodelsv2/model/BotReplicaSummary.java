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
 * Contains summary information about all the replication statuses applicable for global resiliency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotReplicaSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotReplicaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The replica region used in the replication statuses summary.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The creation time and date for the replicated bots.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The operation status for the replicated bot applicable.
     * </p>
     */
    private String botReplicaStatus;
    /**
     * <p>
     * The reasons for the failure for the replicated bot.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The replica region used in the replication statuses summary.
     * </p>
     * 
     * @param replicaRegion
     *        The replica region used in the replication statuses summary.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The replica region used in the replication statuses summary.
     * </p>
     * 
     * @return The replica region used in the replication statuses summary.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The replica region used in the replication statuses summary.
     * </p>
     * 
     * @param replicaRegion
     *        The replica region used in the replication statuses summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotReplicaSummary withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The creation time and date for the replicated bots.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time and date for the replicated bots.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation time and date for the replicated bots.
     * </p>
     * 
     * @return The creation time and date for the replicated bots.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation time and date for the replicated bots.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time and date for the replicated bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotReplicaSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The operation status for the replicated bot applicable.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operation status for the replicated bot applicable.
     * @see BotReplicaStatus
     */

    public void setBotReplicaStatus(String botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus;
    }

    /**
     * <p>
     * The operation status for the replicated bot applicable.
     * </p>
     * 
     * @return The operation status for the replicated bot applicable.
     * @see BotReplicaStatus
     */

    public String getBotReplicaStatus() {
        return this.botReplicaStatus;
    }

    /**
     * <p>
     * The operation status for the replicated bot applicable.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operation status for the replicated bot applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public BotReplicaSummary withBotReplicaStatus(String botReplicaStatus) {
        setBotReplicaStatus(botReplicaStatus);
        return this;
    }

    /**
     * <p>
     * The operation status for the replicated bot applicable.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operation status for the replicated bot applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public BotReplicaSummary withBotReplicaStatus(BotReplicaStatus botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reasons for the failure for the replicated bot.
     * </p>
     * 
     * @return The reasons for the failure for the replicated bot.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The reasons for the failure for the replicated bot.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for the failure for the replicated bot.
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
     * The reasons for the failure for the replicated bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for the failure for the replicated bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotReplicaSummary withFailureReasons(String... failureReasons) {
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
     * The reasons for the failure for the replicated bot.
     * </p>
     * 
     * @param failureReasons
     *        The reasons for the failure for the replicated bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotReplicaSummary withFailureReasons(java.util.Collection<String> failureReasons) {
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
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getBotReplicaStatus() != null)
            sb.append("BotReplicaStatus: ").append(getBotReplicaStatus()).append(",");
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

        if (obj instanceof BotReplicaSummary == false)
            return false;
        BotReplicaSummary other = (BotReplicaSummary) obj;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getBotReplicaStatus() == null ^ this.getBotReplicaStatus() == null)
            return false;
        if (other.getBotReplicaStatus() != null && other.getBotReplicaStatus().equals(this.getBotReplicaStatus()) == false)
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

        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getBotReplicaStatus() == null) ? 0 : getBotReplicaStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public BotReplicaSummary clone() {
        try {
            return (BotReplicaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotReplicaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
