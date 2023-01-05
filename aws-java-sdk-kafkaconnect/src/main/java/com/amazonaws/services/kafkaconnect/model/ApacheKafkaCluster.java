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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the Apache Kafka cluster to which the connector is connected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ApacheKafkaCluster" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApacheKafkaCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bootstrap servers of the cluster.
     * </p>
     */
    private String bootstrapServers;
    /**
     * <p>
     * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * </p>
     */
    private Vpc vpc;

    /**
     * <p>
     * The bootstrap servers of the cluster.
     * </p>
     * 
     * @param bootstrapServers
     *        The bootstrap servers of the cluster.
     */

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    /**
     * <p>
     * The bootstrap servers of the cluster.
     * </p>
     * 
     * @return The bootstrap servers of the cluster.
     */

    public String getBootstrapServers() {
        return this.bootstrapServers;
    }

    /**
     * <p>
     * The bootstrap servers of the cluster.
     * </p>
     * 
     * @param bootstrapServers
     *        The bootstrap servers of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApacheKafkaCluster withBootstrapServers(String bootstrapServers) {
        setBootstrapServers(bootstrapServers);
        return this;
    }

    /**
     * <p>
     * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * </p>
     * 
     * @param vpc
     *        Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     */

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * </p>
     * 
     * @return Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     */

    public Vpc getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * </p>
     * 
     * @param vpc
     *        Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApacheKafkaCluster withVpc(Vpc vpc) {
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
        if (getBootstrapServers() != null)
            sb.append("BootstrapServers: ").append(getBootstrapServers()).append(",");
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

        if (obj instanceof ApacheKafkaCluster == false)
            return false;
        ApacheKafkaCluster other = (ApacheKafkaCluster) obj;
        if (other.getBootstrapServers() == null ^ this.getBootstrapServers() == null)
            return false;
        if (other.getBootstrapServers() != null && other.getBootstrapServers().equals(this.getBootstrapServers()) == false)
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

        hashCode = prime * hashCode + ((getBootstrapServers() == null) ? 0 : getBootstrapServers().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public ApacheKafkaCluster clone() {
        try {
            return (ApacheKafkaCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.ApacheKafkaClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
