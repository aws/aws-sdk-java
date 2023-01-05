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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using a Rabbit MQ broker as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeSourceRabbitMQBrokerParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceRabbitMQBrokerParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     */
    private MQBrokerAccessCredentials credentials;
    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     */
    private String queueName;
    /**
     * <p>
     * The name of the virtual host associated with the source broker.
     * </p>
     */
    private String virtualHost;

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @return The maximum number of records to include in each batch.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceRabbitMQBrokerParameters withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @param credentials
     *        The credentials needed to access the resource.
     */

    public void setCredentials(MQBrokerAccessCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @return The credentials needed to access the resource.
     */

    public MQBrokerAccessCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @param credentials
     *        The credentials needed to access the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceRabbitMQBrokerParameters withCredentials(MQBrokerAccessCredentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @return The maximum length of a time to wait for events.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceRabbitMQBrokerParameters withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param queueName
     *        The name of the destination queue to consume.
     */

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @return The name of the destination queue to consume.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param queueName
     *        The name of the destination queue to consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceRabbitMQBrokerParameters withQueueName(String queueName) {
        setQueueName(queueName);
        return this;
    }

    /**
     * <p>
     * The name of the virtual host associated with the source broker.
     * </p>
     * 
     * @param virtualHost
     *        The name of the virtual host associated with the source broker.
     */

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    /**
     * <p>
     * The name of the virtual host associated with the source broker.
     * </p>
     * 
     * @return The name of the virtual host associated with the source broker.
     */

    public String getVirtualHost() {
        return this.virtualHost;
    }

    /**
     * <p>
     * The name of the virtual host associated with the source broker.
     * </p>
     * 
     * @param virtualHost
     *        The name of the virtual host associated with the source broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceRabbitMQBrokerParameters withVirtualHost(String virtualHost) {
        setVirtualHost(virtualHost);
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
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getQueueName() != null)
            sb.append("QueueName: ").append("***Sensitive Data Redacted***").append(",");
        if (getVirtualHost() != null)
            sb.append("VirtualHost: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeSourceRabbitMQBrokerParameters == false)
            return false;
        PipeSourceRabbitMQBrokerParameters other = (PipeSourceRabbitMQBrokerParameters) obj;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getVirtualHost() == null ^ this.getVirtualHost() == null)
            return false;
        if (other.getVirtualHost() != null && other.getVirtualHost().equals(this.getVirtualHost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getVirtualHost() == null) ? 0 : getVirtualHost().hashCode());
        return hashCode;
    }

    @Override
    public PipeSourceRabbitMQBrokerParameters clone() {
        try {
            return (PipeSourceRabbitMQBrokerParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeSourceRabbitMQBrokerParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
