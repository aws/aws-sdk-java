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
 * The parameters for using a self-managed Apache Kafka stream as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeSourceSelfManagedKafkaParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceSelfManagedKafkaParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of server URLs.
     * </p>
     */
    private java.util.List<String> additionalBootstrapServers;
    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     */
    private String consumerGroupID;
    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     */
    private SelfManagedKafkaAccessConfigurationCredentials credentials;
    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * The ARN of the Secrets Manager secret used for certification.
     * </p>
     */
    private String serverRootCaCertificate;
    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is
     * to be used.
     * </p>
     */
    private SelfManagedKafkaAccessConfigurationVpc vpc;

    /**
     * <p>
     * An array of server URLs.
     * </p>
     * 
     * @return An array of server URLs.
     */

    public java.util.List<String> getAdditionalBootstrapServers() {
        return additionalBootstrapServers;
    }

    /**
     * <p>
     * An array of server URLs.
     * </p>
     * 
     * @param additionalBootstrapServers
     *        An array of server URLs.
     */

    public void setAdditionalBootstrapServers(java.util.Collection<String> additionalBootstrapServers) {
        if (additionalBootstrapServers == null) {
            this.additionalBootstrapServers = null;
            return;
        }

        this.additionalBootstrapServers = new java.util.ArrayList<String>(additionalBootstrapServers);
    }

    /**
     * <p>
     * An array of server URLs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalBootstrapServers(java.util.Collection)} or
     * {@link #withAdditionalBootstrapServers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalBootstrapServers
     *        An array of server URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withAdditionalBootstrapServers(String... additionalBootstrapServers) {
        if (this.additionalBootstrapServers == null) {
            setAdditionalBootstrapServers(new java.util.ArrayList<String>(additionalBootstrapServers.length));
        }
        for (String ele : additionalBootstrapServers) {
            this.additionalBootstrapServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of server URLs.
     * </p>
     * 
     * @param additionalBootstrapServers
     *        An array of server URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withAdditionalBootstrapServers(java.util.Collection<String> additionalBootstrapServers) {
        setAdditionalBootstrapServers(additionalBootstrapServers);
        return this;
    }

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

    public PipeSourceSelfManagedKafkaParameters withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param consumerGroupID
     *        The name of the destination queue to consume.
     */

    public void setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @return The name of the destination queue to consume.
     */

    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param consumerGroupID
     *        The name of the destination queue to consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withConsumerGroupID(String consumerGroupID) {
        setConsumerGroupID(consumerGroupID);
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

    public void setCredentials(SelfManagedKafkaAccessConfigurationCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @return The credentials needed to access the resource.
     */

    public SelfManagedKafkaAccessConfigurationCredentials getCredentials() {
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

    public PipeSourceSelfManagedKafkaParameters withCredentials(SelfManagedKafkaAccessConfigurationCredentials credentials) {
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

    public PipeSourceSelfManagedKafkaParameters withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret used for certification.
     * </p>
     * 
     * @param serverRootCaCertificate
     *        The ARN of the Secrets Manager secret used for certification.
     */

    public void setServerRootCaCertificate(String serverRootCaCertificate) {
        this.serverRootCaCertificate = serverRootCaCertificate;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret used for certification.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret used for certification.
     */

    public String getServerRootCaCertificate() {
        return this.serverRootCaCertificate;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret used for certification.
     * </p>
     * 
     * @param serverRootCaCertificate
     *        The ARN of the Secrets Manager secret used for certification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withServerRootCaCertificate(String serverRootCaCertificate) {
        setServerRootCaCertificate(serverRootCaCertificate);
        return this;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @see SelfManagedKafkaStartPosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @return (Streams only) The position in a stream from which to start reading.
     * @see SelfManagedKafkaStartPosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfManagedKafkaStartPosition
     */

    public PipeSourceSelfManagedKafkaParameters withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfManagedKafkaStartPosition
     */

    public PipeSourceSelfManagedKafkaParameters withStartingPosition(SelfManagedKafkaStartPosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @param topicName
     *        The name of the topic that the pipe will read from.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @return The name of the topic that the pipe will read from.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @param topicName
     *        The name of the topic that the pipe will read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is
     * to be used.
     * </p>
     * 
     * @param vpc
     *        This structure specifies the VPC subnets and security groups for the stream, and whether a public IP
     *        address is to be used.
     */

    public void setVpc(SelfManagedKafkaAccessConfigurationVpc vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is
     * to be used.
     * </p>
     * 
     * @return This structure specifies the VPC subnets and security groups for the stream, and whether a public IP
     *         address is to be used.
     */

    public SelfManagedKafkaAccessConfigurationVpc getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is
     * to be used.
     * </p>
     * 
     * @param vpc
     *        This structure specifies the VPC subnets and security groups for the stream, and whether a public IP
     *        address is to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceSelfManagedKafkaParameters withVpc(SelfManagedKafkaAccessConfigurationVpc vpc) {
        setVpc(vpc);
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
        if (getAdditionalBootstrapServers() != null)
            sb.append("AdditionalBootstrapServers: ").append("***Sensitive Data Redacted***").append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getConsumerGroupID() != null)
            sb.append("ConsumerGroupID: ").append("***Sensitive Data Redacted***").append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getServerRootCaCertificate() != null)
            sb.append("ServerRootCaCertificate: ").append(getServerRootCaCertificate()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append("***Sensitive Data Redacted***").append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeSourceSelfManagedKafkaParameters == false)
            return false;
        PipeSourceSelfManagedKafkaParameters other = (PipeSourceSelfManagedKafkaParameters) obj;
        if (other.getAdditionalBootstrapServers() == null ^ this.getAdditionalBootstrapServers() == null)
            return false;
        if (other.getAdditionalBootstrapServers() != null && other.getAdditionalBootstrapServers().equals(this.getAdditionalBootstrapServers()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getConsumerGroupID() == null ^ this.getConsumerGroupID() == null)
            return false;
        if (other.getConsumerGroupID() != null && other.getConsumerGroupID().equals(this.getConsumerGroupID()) == false)
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
        if (other.getServerRootCaCertificate() == null ^ this.getServerRootCaCertificate() == null)
            return false;
        if (other.getServerRootCaCertificate() != null && other.getServerRootCaCertificate().equals(this.getServerRootCaCertificate()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalBootstrapServers() == null) ? 0 : getAdditionalBootstrapServers().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getConsumerGroupID() == null) ? 0 : getConsumerGroupID().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getServerRootCaCertificate() == null) ? 0 : getServerRootCaCertificate().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public PipeSourceSelfManagedKafkaParameters clone() {
        try {
            return (PipeSourceSelfManagedKafkaParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeSourceSelfManagedKafkaParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
