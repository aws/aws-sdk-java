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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Queue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Queue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the queue.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     */
    private String queueArn;
    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The description of the queue.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     */
    private OutboundCallerConfig outboundCallerConfig;
    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     */
    private String hoursOfOperationId;
    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     */
    private Integer maxContacts;
    /**
     * <p>
     * The status of the queue.
     * </p>
     */
    private String status;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param name
     *        The name of the queue.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @return The name of the queue.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param name
     *        The name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     * 
     * @param queueArn
     *        The Amazon Resource Name (ARN) for the queue.
     */

    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the queue.
     */

    public String getQueueArn() {
        return this.queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the queue.
     * </p>
     * 
     * @param queueArn
     *        The Amazon Resource Name (ARN) for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withQueueArn(String queueArn) {
        setQueueArn(queueArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @return The identifier for the queue.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * 
     * @param queueId
     *        The identifier for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @param description
     *        The description of the queue.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @return The description of the queue.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @param description
     *        The description of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     * 
     * @param outboundCallerConfig
     *        The outbound caller ID name, number, and outbound whisper flow.
     */

    public void setOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
        this.outboundCallerConfig = outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     * 
     * @return The outbound caller ID name, number, and outbound whisper flow.
     */

    public OutboundCallerConfig getOutboundCallerConfig() {
        return this.outboundCallerConfig;
    }

    /**
     * <p>
     * The outbound caller ID name, number, and outbound whisper flow.
     * </p>
     * 
     * @param outboundCallerConfig
     *        The outbound caller ID name, number, and outbound whisper flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withOutboundCallerConfig(OutboundCallerConfig outboundCallerConfig) {
        setOutboundCallerConfig(outboundCallerConfig);
        return this;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationId
     *        The identifier for the hours of operation.
     */

    public void setHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @return The identifier for the hours of operation.
     */

    public String getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationId
     *        The identifier for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withHoursOfOperationId(String hoursOfOperationId) {
        setHoursOfOperationId(hoursOfOperationId);
        return this;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @param maxContacts
     *        The maximum number of contacts that can be in the queue before it is considered full.
     */

    public void setMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @return The maximum number of contacts that can be in the queue before it is considered full.
     */

    public Integer getMaxContacts() {
        return this.maxContacts;
    }

    /**
     * <p>
     * The maximum number of contacts that can be in the queue before it is considered full.
     * </p>
     * 
     * @param maxContacts
     *        The maximum number of contacts that can be in the queue before it is considered full.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withMaxContacts(Integer maxContacts) {
        setMaxContacts(maxContacts);
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * 
     * @param status
     *        The status of the queue.
     * @see QueueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * 
     * @return The status of the queue.
     * @see QueueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * 
     * @param status
     *        The status of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public Queue withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * 
     * @param status
     *        The status of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public Queue withStatus(QueueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Queue#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Queue addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueueArn() != null)
            sb.append("QueueArn: ").append(getQueueArn()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOutboundCallerConfig() != null)
            sb.append("OutboundCallerConfig: ").append(getOutboundCallerConfig()).append(",");
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: ").append(getHoursOfOperationId()).append(",");
        if (getMaxContacts() != null)
            sb.append("MaxContacts: ").append(getMaxContacts()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Queue == false)
            return false;
        Queue other = (Queue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOutboundCallerConfig() == null ^ this.getOutboundCallerConfig() == null)
            return false;
        if (other.getOutboundCallerConfig() != null && other.getOutboundCallerConfig().equals(this.getOutboundCallerConfig()) == false)
            return false;
        if (other.getHoursOfOperationId() == null ^ this.getHoursOfOperationId() == null)
            return false;
        if (other.getHoursOfOperationId() != null && other.getHoursOfOperationId().equals(this.getHoursOfOperationId()) == false)
            return false;
        if (other.getMaxContacts() == null ^ this.getMaxContacts() == null)
            return false;
        if (other.getMaxContacts() != null && other.getMaxContacts().equals(this.getMaxContacts()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOutboundCallerConfig() == null) ? 0 : getOutboundCallerConfig().hashCode());
        hashCode = prime * hashCode + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode + ((getMaxContacts() == null) ? 0 : getMaxContacts().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Queue clone() {
        try {
            return (Queue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.QueueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
