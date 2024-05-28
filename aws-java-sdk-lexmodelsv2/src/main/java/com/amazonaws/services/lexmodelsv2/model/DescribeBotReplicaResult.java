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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotReplica" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotReplicaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique bot ID of the replicated bot being monitored.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The region of the replicated bot being monitored.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The source region of the replicated bot being monitored.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The creation date and time of the replicated bot being monitored.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The operational status of the replicated bot being monitored.
     * </p>
     */
    private String botReplicaStatus;
    /**
     * <p>
     * The failure reasons the bot being monitored failed to replicate.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The unique bot ID of the replicated bot being monitored.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot being monitored.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot being monitored.
     * </p>
     * 
     * @return The unique bot ID of the replicated bot being monitored.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique bot ID of the replicated bot being monitored.
     * </p>
     * 
     * @param botId
     *        The unique bot ID of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The region of the replicated bot being monitored.
     * </p>
     * 
     * @param replicaRegion
     *        The region of the replicated bot being monitored.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The region of the replicated bot being monitored.
     * </p>
     * 
     * @return The region of the replicated bot being monitored.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The region of the replicated bot being monitored.
     * </p>
     * 
     * @param replicaRegion
     *        The region of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The source region of the replicated bot being monitored.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the replicated bot being monitored.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region of the replicated bot being monitored.
     * </p>
     * 
     * @return The source region of the replicated bot being monitored.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region of the replicated bot being monitored.
     * </p>
     * 
     * @param sourceRegion
     *        The source region of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The creation date and time of the replicated bot being monitored.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the replicated bot being monitored.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the replicated bot being monitored.
     * </p>
     * 
     * @return The creation date and time of the replicated bot being monitored.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the replicated bot being monitored.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The operational status of the replicated bot being monitored.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot being monitored.
     * @see BotReplicaStatus
     */

    public void setBotReplicaStatus(String botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus;
    }

    /**
     * <p>
     * The operational status of the replicated bot being monitored.
     * </p>
     * 
     * @return The operational status of the replicated bot being monitored.
     * @see BotReplicaStatus
     */

    public String getBotReplicaStatus() {
        return this.botReplicaStatus;
    }

    /**
     * <p>
     * The operational status of the replicated bot being monitored.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public DescribeBotReplicaResult withBotReplicaStatus(String botReplicaStatus) {
        setBotReplicaStatus(botReplicaStatus);
        return this;
    }

    /**
     * <p>
     * The operational status of the replicated bot being monitored.
     * </p>
     * 
     * @param botReplicaStatus
     *        The operational status of the replicated bot being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotReplicaStatus
     */

    public DescribeBotReplicaResult withBotReplicaStatus(BotReplicaStatus botReplicaStatus) {
        this.botReplicaStatus = botReplicaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The failure reasons the bot being monitored failed to replicate.
     * </p>
     * 
     * @return The failure reasons the bot being monitored failed to replicate.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The failure reasons the bot being monitored failed to replicate.
     * </p>
     * 
     * @param failureReasons
     *        The failure reasons the bot being monitored failed to replicate.
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
     * The failure reasons the bot being monitored failed to replicate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The failure reasons the bot being monitored failed to replicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withFailureReasons(String... failureReasons) {
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
     * The failure reasons the bot being monitored failed to replicate.
     * </p>
     * 
     * @param failureReasons
     *        The failure reasons the bot being monitored failed to replicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotReplicaResult withFailureReasons(java.util.Collection<String> failureReasons) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
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

        if (obj instanceof DescribeBotReplicaResult == false)
            return false;
        DescribeBotReplicaResult other = (DescribeBotReplicaResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getBotReplicaStatus() == null) ? 0 : getBotReplicaStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotReplicaResult clone() {
        try {
            return (DescribeBotReplicaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
