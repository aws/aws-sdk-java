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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipeSourceSelfManagedKafkaParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipeSourceSelfManagedKafkaParameters implements Serializable, Cloneable, StructuredPojo {

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
     * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is
     * to be used.
     * </p>
     */
    private SelfManagedKafkaAccessConfigurationVpc vpc;

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

    public UpdatePipeSourceSelfManagedKafkaParameters withBatchSize(Integer batchSize) {
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

    public UpdatePipeSourceSelfManagedKafkaParameters withCredentials(SelfManagedKafkaAccessConfigurationCredentials credentials) {
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

    public UpdatePipeSourceSelfManagedKafkaParameters withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
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

    public UpdatePipeSourceSelfManagedKafkaParameters withServerRootCaCertificate(String serverRootCaCertificate) {
        setServerRootCaCertificate(serverRootCaCertificate);
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

    public UpdatePipeSourceSelfManagedKafkaParameters withVpc(SelfManagedKafkaAccessConfigurationVpc vpc) {
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
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getServerRootCaCertificate() != null)
            sb.append("ServerRootCaCertificate: ").append(getServerRootCaCertificate()).append(",");
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

        if (obj instanceof UpdatePipeSourceSelfManagedKafkaParameters == false)
            return false;
        UpdatePipeSourceSelfManagedKafkaParameters other = (UpdatePipeSourceSelfManagedKafkaParameters) obj;
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
        if (other.getServerRootCaCertificate() == null ^ this.getServerRootCaCertificate() == null)
            return false;
        if (other.getServerRootCaCertificate() != null && other.getServerRootCaCertificate().equals(this.getServerRootCaCertificate()) == false)
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

        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getServerRootCaCertificate() == null) ? 0 : getServerRootCaCertificate().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipeSourceSelfManagedKafkaParameters clone() {
        try {
            return (UpdatePipeSourceSelfManagedKafkaParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.UpdatePipeSourceSelfManagedKafkaParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
