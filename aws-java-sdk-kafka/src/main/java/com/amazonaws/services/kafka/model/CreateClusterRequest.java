/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the broker nodes in the cluster.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     */
    private EncryptionInfo encryptionInfo;
    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     * PER_TOPIC_PER_BROKER.
     * </p>
     */
    private String enhancedMonitoring;
    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     */
    private String kafkaVersion;
    /**
     * <p>
     * The number of Kafka broker nodes in the Amazon MSK cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;

    /**
     * <p>
     * Information about the broker nodes in the cluster.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        Information about the broker nodes in the cluster.
     */

    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the broker nodes in the cluster.
     * </p>
     * 
     * @return Information about the broker nodes in the cluster.
     */

    public BrokerNodeGroupInfo getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the broker nodes in the cluster.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        Information about the broker nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        setBrokerNodeGroupInfo(brokerNodeGroupInfo);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo
     *        Includes all encryption-related information.
     */

    public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @return Includes all encryption-related information.
     */

    public EncryptionInfo getEncryptionInfo() {
        return this.encryptionInfo;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo
     *        Includes all encryption-related information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withEncryptionInfo(EncryptionInfo encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     * PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     *        PER_TOPIC_PER_BROKER.
     * @see EnhancedMonitoring
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     * PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @return Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     *         PER_TOPIC_PER_BROKER.
     * @see EnhancedMonitoring
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     * PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     *        PER_TOPIC_PER_BROKER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public CreateClusterRequest withEnhancedMonitoring(String enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     * PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and
     *        PER_TOPIC_PER_BROKER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public CreateClusterRequest withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @param kafkaVersion
     *        The version of Apache Kafka.
     */

    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @return The version of Apache Kafka.
     */

    public String getKafkaVersion() {
        return this.kafkaVersion;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @param kafkaVersion
     *        The version of Apache Kafka.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withKafkaVersion(String kafkaVersion) {
        setKafkaVersion(kafkaVersion);
        return this;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the Amazon MSK cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of Kafka broker nodes in the Amazon MSK cluster.
     */

    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the Amazon MSK cluster.
     * </p>
     * 
     * @return The number of Kafka broker nodes in the Amazon MSK cluster.
     */

    public Integer getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the Amazon MSK cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of Kafka broker nodes in the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
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
        if (getBrokerNodeGroupInfo() != null)
            sb.append("BrokerNodeGroupInfo: ").append(getBrokerNodeGroupInfo()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: ").append(getKafkaVersion()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getKafkaVersion() == null ^ this.getKafkaVersion() == null)
            return false;
        if (other.getKafkaVersion() != null && other.getKafkaVersion().equals(this.getKafkaVersion()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
