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
 * Summarized information about Kafka Cluster used as source / target for replication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/KafkaClusterSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaClusterSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details of an Amazon MSK Cluster.
     * </p>
     */
    private AmazonMskCluster amazonMskCluster;
    /**
     * <p>
     * The alias of the Kafka cluster. Used to prefix names of replicated topics.
     * </p>
     */
    private String kafkaClusterAlias;

    /**
     * <p>
     * Details of an Amazon MSK Cluster.
     * </p>
     * 
     * @param amazonMskCluster
     *        Details of an Amazon MSK Cluster.
     */

    public void setAmazonMskCluster(AmazonMskCluster amazonMskCluster) {
        this.amazonMskCluster = amazonMskCluster;
    }

    /**
     * <p>
     * Details of an Amazon MSK Cluster.
     * </p>
     * 
     * @return Details of an Amazon MSK Cluster.
     */

    public AmazonMskCluster getAmazonMskCluster() {
        return this.amazonMskCluster;
    }

    /**
     * <p>
     * Details of an Amazon MSK Cluster.
     * </p>
     * 
     * @param amazonMskCluster
     *        Details of an Amazon MSK Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaClusterSummary withAmazonMskCluster(AmazonMskCluster amazonMskCluster) {
        setAmazonMskCluster(amazonMskCluster);
        return this;
    }

    /**
     * <p>
     * The alias of the Kafka cluster. Used to prefix names of replicated topics.
     * </p>
     * 
     * @param kafkaClusterAlias
     *        The alias of the Kafka cluster. Used to prefix names of replicated topics.
     */

    public void setKafkaClusterAlias(String kafkaClusterAlias) {
        this.kafkaClusterAlias = kafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the Kafka cluster. Used to prefix names of replicated topics.
     * </p>
     * 
     * @return The alias of the Kafka cluster. Used to prefix names of replicated topics.
     */

    public String getKafkaClusterAlias() {
        return this.kafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the Kafka cluster. Used to prefix names of replicated topics.
     * </p>
     * 
     * @param kafkaClusterAlias
     *        The alias of the Kafka cluster. Used to prefix names of replicated topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaClusterSummary withKafkaClusterAlias(String kafkaClusterAlias) {
        setKafkaClusterAlias(kafkaClusterAlias);
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
        if (getAmazonMskCluster() != null)
            sb.append("AmazonMskCluster: ").append(getAmazonMskCluster()).append(",");
        if (getKafkaClusterAlias() != null)
            sb.append("KafkaClusterAlias: ").append(getKafkaClusterAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaClusterSummary == false)
            return false;
        KafkaClusterSummary other = (KafkaClusterSummary) obj;
        if (other.getAmazonMskCluster() == null ^ this.getAmazonMskCluster() == null)
            return false;
        if (other.getAmazonMskCluster() != null && other.getAmazonMskCluster().equals(this.getAmazonMskCluster()) == false)
            return false;
        if (other.getKafkaClusterAlias() == null ^ this.getKafkaClusterAlias() == null)
            return false;
        if (other.getKafkaClusterAlias() != null && other.getKafkaClusterAlias().equals(this.getKafkaClusterAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonMskCluster() == null) ? 0 : getAmazonMskCluster().hashCode());
        hashCode = prime * hashCode + ((getKafkaClusterAlias() == null) ? 0 : getKafkaClusterAlias().hashCode());
        return hashCode;
    }

    @Override
    public KafkaClusterSummary clone() {
        try {
            return (KafkaClusterSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.KafkaClusterSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
