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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about consumer group replication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ConsumerGroupReplicationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsumerGroupReplicationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups that should not be replicated.
     * </p>
     */
    private java.util.List<String> consumerGroupsToExclude;
    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups to copy.
     * </p>
     */
    private java.util.List<String> consumerGroupsToReplicate;
    /**
     * <p>
     * Enables synchronization of consumer groups to target cluster.
     * </p>
     */
    private Boolean detectAndCopyNewConsumerGroups;
    /**
     * <p>
     * Enables synchronization of consumer group offsets to target cluster. The translated offsets will be written to
     * topic __consumer_offsets.
     * </p>
     */
    private Boolean synchroniseConsumerGroupOffsets;

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups that should not be replicated.
     * </p>
     * 
     * @return List of regular expression patterns indicating the consumer groups that should not be replicated.
     */

    public java.util.List<String> getConsumerGroupsToExclude() {
        return consumerGroupsToExclude;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups that should not be replicated.
     * </p>
     * 
     * @param consumerGroupsToExclude
     *        List of regular expression patterns indicating the consumer groups that should not be replicated.
     */

    public void setConsumerGroupsToExclude(java.util.Collection<String> consumerGroupsToExclude) {
        if (consumerGroupsToExclude == null) {
            this.consumerGroupsToExclude = null;
            return;
        }

        this.consumerGroupsToExclude = new java.util.ArrayList<String>(consumerGroupsToExclude);
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups that should not be replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumerGroupsToExclude(java.util.Collection)} or
     * {@link #withConsumerGroupsToExclude(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param consumerGroupsToExclude
     *        List of regular expression patterns indicating the consumer groups that should not be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withConsumerGroupsToExclude(String... consumerGroupsToExclude) {
        if (this.consumerGroupsToExclude == null) {
            setConsumerGroupsToExclude(new java.util.ArrayList<String>(consumerGroupsToExclude.length));
        }
        for (String ele : consumerGroupsToExclude) {
            this.consumerGroupsToExclude.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups that should not be replicated.
     * </p>
     * 
     * @param consumerGroupsToExclude
     *        List of regular expression patterns indicating the consumer groups that should not be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withConsumerGroupsToExclude(java.util.Collection<String> consumerGroupsToExclude) {
        setConsumerGroupsToExclude(consumerGroupsToExclude);
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups to copy.
     * </p>
     * 
     * @return List of regular expression patterns indicating the consumer groups to copy.
     */

    public java.util.List<String> getConsumerGroupsToReplicate() {
        return consumerGroupsToReplicate;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups to copy.
     * </p>
     * 
     * @param consumerGroupsToReplicate
     *        List of regular expression patterns indicating the consumer groups to copy.
     */

    public void setConsumerGroupsToReplicate(java.util.Collection<String> consumerGroupsToReplicate) {
        if (consumerGroupsToReplicate == null) {
            this.consumerGroupsToReplicate = null;
            return;
        }

        this.consumerGroupsToReplicate = new java.util.ArrayList<String>(consumerGroupsToReplicate);
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups to copy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumerGroupsToReplicate(java.util.Collection)} or
     * {@link #withConsumerGroupsToReplicate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param consumerGroupsToReplicate
     *        List of regular expression patterns indicating the consumer groups to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withConsumerGroupsToReplicate(String... consumerGroupsToReplicate) {
        if (this.consumerGroupsToReplicate == null) {
            setConsumerGroupsToReplicate(new java.util.ArrayList<String>(consumerGroupsToReplicate.length));
        }
        for (String ele : consumerGroupsToReplicate) {
            this.consumerGroupsToReplicate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the consumer groups to copy.
     * </p>
     * 
     * @param consumerGroupsToReplicate
     *        List of regular expression patterns indicating the consumer groups to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withConsumerGroupsToReplicate(java.util.Collection<String> consumerGroupsToReplicate) {
        setConsumerGroupsToReplicate(consumerGroupsToReplicate);
        return this;
    }

    /**
     * <p>
     * Enables synchronization of consumer groups to target cluster.
     * </p>
     * 
     * @param detectAndCopyNewConsumerGroups
     *        Enables synchronization of consumer groups to target cluster.
     */

    public void setDetectAndCopyNewConsumerGroups(Boolean detectAndCopyNewConsumerGroups) {
        this.detectAndCopyNewConsumerGroups = detectAndCopyNewConsumerGroups;
    }

    /**
     * <p>
     * Enables synchronization of consumer groups to target cluster.
     * </p>
     * 
     * @return Enables synchronization of consumer groups to target cluster.
     */

    public Boolean getDetectAndCopyNewConsumerGroups() {
        return this.detectAndCopyNewConsumerGroups;
    }

    /**
     * <p>
     * Enables synchronization of consumer groups to target cluster.
     * </p>
     * 
     * @param detectAndCopyNewConsumerGroups
     *        Enables synchronization of consumer groups to target cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withDetectAndCopyNewConsumerGroups(Boolean detectAndCopyNewConsumerGroups) {
        setDetectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups);
        return this;
    }

    /**
     * <p>
     * Enables synchronization of consumer groups to target cluster.
     * </p>
     * 
     * @return Enables synchronization of consumer groups to target cluster.
     */

    public Boolean isDetectAndCopyNewConsumerGroups() {
        return this.detectAndCopyNewConsumerGroups;
    }

    /**
     * <p>
     * Enables synchronization of consumer group offsets to target cluster. The translated offsets will be written to
     * topic __consumer_offsets.
     * </p>
     * 
     * @param synchroniseConsumerGroupOffsets
     *        Enables synchronization of consumer group offsets to target cluster. The translated offsets will be
     *        written to topic __consumer_offsets.
     */

    public void setSynchroniseConsumerGroupOffsets(Boolean synchroniseConsumerGroupOffsets) {
        this.synchroniseConsumerGroupOffsets = synchroniseConsumerGroupOffsets;
    }

    /**
     * <p>
     * Enables synchronization of consumer group offsets to target cluster. The translated offsets will be written to
     * topic __consumer_offsets.
     * </p>
     * 
     * @return Enables synchronization of consumer group offsets to target cluster. The translated offsets will be
     *         written to topic __consumer_offsets.
     */

    public Boolean getSynchroniseConsumerGroupOffsets() {
        return this.synchroniseConsumerGroupOffsets;
    }

    /**
     * <p>
     * Enables synchronization of consumer group offsets to target cluster. The translated offsets will be written to
     * topic __consumer_offsets.
     * </p>
     * 
     * @param synchroniseConsumerGroupOffsets
     *        Enables synchronization of consumer group offsets to target cluster. The translated offsets will be
     *        written to topic __consumer_offsets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerGroupReplicationUpdate withSynchroniseConsumerGroupOffsets(Boolean synchroniseConsumerGroupOffsets) {
        setSynchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets);
        return this;
    }

    /**
     * <p>
     * Enables synchronization of consumer group offsets to target cluster. The translated offsets will be written to
     * topic __consumer_offsets.
     * </p>
     * 
     * @return Enables synchronization of consumer group offsets to target cluster. The translated offsets will be
     *         written to topic __consumer_offsets.
     */

    public Boolean isSynchroniseConsumerGroupOffsets() {
        return this.synchroniseConsumerGroupOffsets;
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
        if (getConsumerGroupsToExclude() != null)
            sb.append("ConsumerGroupsToExclude: ").append(getConsumerGroupsToExclude()).append(",");
        if (getConsumerGroupsToReplicate() != null)
            sb.append("ConsumerGroupsToReplicate: ").append(getConsumerGroupsToReplicate()).append(",");
        if (getDetectAndCopyNewConsumerGroups() != null)
            sb.append("DetectAndCopyNewConsumerGroups: ").append(getDetectAndCopyNewConsumerGroups()).append(",");
        if (getSynchroniseConsumerGroupOffsets() != null)
            sb.append("SynchroniseConsumerGroupOffsets: ").append(getSynchroniseConsumerGroupOffsets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsumerGroupReplicationUpdate == false)
            return false;
        ConsumerGroupReplicationUpdate other = (ConsumerGroupReplicationUpdate) obj;
        if (other.getConsumerGroupsToExclude() == null ^ this.getConsumerGroupsToExclude() == null)
            return false;
        if (other.getConsumerGroupsToExclude() != null && other.getConsumerGroupsToExclude().equals(this.getConsumerGroupsToExclude()) == false)
            return false;
        if (other.getConsumerGroupsToReplicate() == null ^ this.getConsumerGroupsToReplicate() == null)
            return false;
        if (other.getConsumerGroupsToReplicate() != null && other.getConsumerGroupsToReplicate().equals(this.getConsumerGroupsToReplicate()) == false)
            return false;
        if (other.getDetectAndCopyNewConsumerGroups() == null ^ this.getDetectAndCopyNewConsumerGroups() == null)
            return false;
        if (other.getDetectAndCopyNewConsumerGroups() != null
                && other.getDetectAndCopyNewConsumerGroups().equals(this.getDetectAndCopyNewConsumerGroups()) == false)
            return false;
        if (other.getSynchroniseConsumerGroupOffsets() == null ^ this.getSynchroniseConsumerGroupOffsets() == null)
            return false;
        if (other.getSynchroniseConsumerGroupOffsets() != null
                && other.getSynchroniseConsumerGroupOffsets().equals(this.getSynchroniseConsumerGroupOffsets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerGroupsToExclude() == null) ? 0 : getConsumerGroupsToExclude().hashCode());
        hashCode = prime * hashCode + ((getConsumerGroupsToReplicate() == null) ? 0 : getConsumerGroupsToReplicate().hashCode());
        hashCode = prime * hashCode + ((getDetectAndCopyNewConsumerGroups() == null) ? 0 : getDetectAndCopyNewConsumerGroups().hashCode());
        hashCode = prime * hashCode + ((getSynchroniseConsumerGroupOffsets() == null) ? 0 : getSynchroniseConsumerGroupOffsets().hashCode());
        return hashCode;
    }

    @Override
    public ConsumerGroupReplicationUpdate clone() {
        try {
            return (ConsumerGroupReplicationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ConsumerGroupReplicationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
