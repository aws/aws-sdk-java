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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Provisioned cluster request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ProvisionedRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the brokers.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;
    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     */
    private ClientAuthentication clientAuthentication;
    /**
     * <p>
     * Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     * </p>
     */
    private ConfigurationInfo configurationInfo;
    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     */
    private EncryptionInfo encryptionInfo;
    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     * PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     * </p>
     */
    private String enhancedMonitoring;
    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     */
    private OpenMonitoringInfo openMonitoring;
    /**
     * <p>
     * The Apache Kafka version that you want for the cluster.
     * </p>
     */
    private String kafkaVersion;
    /**
     * <p>
     * Log delivery information for the cluster.
     * </p>
     */
    private LoggingInfo loggingInfo;
    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;
    /**
     * <p>
     * This controls storage mode for supported storage tiers.
     * </p>
     */
    private String storageMode;

    /**
     * <p>
     * Information about the brokers.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        <p>
     *        Information about the brokers.
     *        </p>
     */

    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the brokers.
     * </p>
     * 
     * @return <p>
     *         Information about the brokers.
     *         </p>
     */

    public BrokerNodeGroupInfo getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the brokers.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        <p>
     *        Information about the brokers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        setBrokerNodeGroupInfo(brokerNodeGroupInfo);
        return this;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information.
     *        </p>
     */

    public void setClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication information.
     *         </p>
     */

    public ClientAuthentication getClientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withClientAuthentication(ClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
        return this;
    }

    /**
     * <p>
     * Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     *        </p>
     */

    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * <p>
     * Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @return <p>
     *         Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     *         </p>
     */

    public ConfigurationInfo getConfigurationInfo() {
        return this.configurationInfo;
    }

    /**
     * <p>
     * Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withConfigurationInfo(ConfigurationInfo configurationInfo) {
        setConfigurationInfo(configurationInfo);
        return this;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo
     *        <p>
     *        Includes all encryption-related information.
     *        </p>
     */

    public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @return <p>
     *         Includes all encryption-related information.
     *         </p>
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
     *        <p>
     *        Includes all encryption-related information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withEncryptionInfo(EncryptionInfo encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     * PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     *        PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     *        </p>
     * @see EnhancedMonitoring
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     * PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     * </p>
     * 
     * @return <p>
     *         Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     *         PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     *         </p>
     * @see EnhancedMonitoring
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     * PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     *        PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public ProvisionedRequest withEnhancedMonitoring(String enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     * PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER,
     *        PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public ProvisionedRequest withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        The settings for open monitoring.
     *        </p>
     */

    public void setOpenMonitoring(OpenMonitoringInfo openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @return <p>
     *         The settings for open monitoring.
     *         </p>
     */

    public OpenMonitoringInfo getOpenMonitoring() {
        return this.openMonitoring;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        The settings for open monitoring.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withOpenMonitoring(OpenMonitoringInfo openMonitoring) {
        setOpenMonitoring(openMonitoring);
        return this;
    }

    /**
     * <p>
     * The Apache Kafka version that you want for the cluster.
     * </p>
     * 
     * @param kafkaVersion
     *        <p>
     *        The Apache Kafka version that you want for the cluster.
     *        </p>
     */

    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * <p>
     * The Apache Kafka version that you want for the cluster.
     * </p>
     * 
     * @return <p>
     *         The Apache Kafka version that you want for the cluster.
     *         </p>
     */

    public String getKafkaVersion() {
        return this.kafkaVersion;
    }

    /**
     * <p>
     * The Apache Kafka version that you want for the cluster.
     * </p>
     * 
     * @param kafkaVersion
     *        <p>
     *        The Apache Kafka version that you want for the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withKafkaVersion(String kafkaVersion) {
        setKafkaVersion(kafkaVersion);
        return this;
    }

    /**
     * <p>
     * Log delivery information for the cluster.
     * </p>
     * 
     * @param loggingInfo
     *        <p>
     *        Log delivery information for the cluster.
     *        </p>
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * Log delivery information for the cluster.
     * </p>
     * 
     * @return <p>
     *         Log delivery information for the cluster.
     *         </p>
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * <p>
     * Log delivery information for the cluster.
     * </p>
     * 
     * @param loggingInfo
     *        <p>
     *        Log delivery information for the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        <p>
     *        The number of broker nodes in the cluster.
     *        </p>
     */

    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @return <p>
     *         The number of broker nodes in the cluster.
     *         </p>
     */

    public Integer getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        <p>
     *        The number of broker nodes in the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedRequest withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
        return this;
    }

    /**
     * <p>
     * This controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        This controls storage mode for supported storage tiers.
     *        </p>
     * @see StorageMode
     */

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * <p>
     * This controls storage mode for supported storage tiers.
     * </p>
     * 
     * @return <p>
     *         This controls storage mode for supported storage tiers.
     *         </p>
     * @see StorageMode
     */

    public String getStorageMode() {
        return this.storageMode;
    }

    /**
     * <p>
     * This controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        This controls storage mode for supported storage tiers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageMode
     */

    public ProvisionedRequest withStorageMode(String storageMode) {
        setStorageMode(storageMode);
        return this;
    }

    /**
     * <p>
     * This controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        This controls storage mode for supported storage tiers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageMode
     */

    public ProvisionedRequest withStorageMode(StorageMode storageMode) {
        this.storageMode = storageMode.toString();
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
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication()).append(",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: ").append(getConfigurationInfo()).append(",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: ").append(getOpenMonitoring()).append(",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: ").append(getKafkaVersion()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getStorageMode() != null)
            sb.append("StorageMode: ").append(getStorageMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedRequest == false)
            return false;
        ProvisionedRequest other = (ProvisionedRequest) obj;
        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getOpenMonitoring() == null ^ this.getOpenMonitoring() == null)
            return false;
        if (other.getOpenMonitoring() != null && other.getOpenMonitoring().equals(this.getOpenMonitoring()) == false)
            return false;
        if (other.getKafkaVersion() == null ^ this.getKafkaVersion() == null)
            return false;
        if (other.getKafkaVersion() != null && other.getKafkaVersion().equals(this.getKafkaVersion()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getStorageMode() == null ^ this.getStorageMode() == null)
            return false;
        if (other.getStorageMode() != null && other.getStorageMode().equals(this.getStorageMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getStorageMode() == null) ? 0 : getStorageMode().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedRequest clone() {
        try {
            return (ProvisionedRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ProvisionedRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
