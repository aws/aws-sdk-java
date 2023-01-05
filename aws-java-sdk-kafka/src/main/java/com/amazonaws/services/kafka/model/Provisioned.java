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
 * Provisioned cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/Provisioned" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Provisioned implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the brokers.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;
    /**
     * <p>
     * Information about the Apache Kafka version deployed on the brokers.
     * </p>
     */
    private BrokerSoftwareInfo currentBrokerSoftwareInfo;
    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     */
    private ClientAuthentication clientAuthentication;
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
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     */
    private String zookeeperConnectString;
    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     * </p>
     */
    private String zookeeperConnectStringTls;
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

    public Provisioned withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        setBrokerNodeGroupInfo(brokerNodeGroupInfo);
        return this;
    }

    /**
     * <p>
     * Information about the Apache Kafka version deployed on the brokers.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        <p>
     *        Information about the Apache Kafka version deployed on the brokers.
     *        </p>
     */

    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the Apache Kafka version deployed on the brokers.
     * </p>
     * 
     * @return <p>
     *         Information about the Apache Kafka version deployed on the brokers.
     *         </p>
     */

    public BrokerSoftwareInfo getCurrentBrokerSoftwareInfo() {
        return this.currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the Apache Kafka version deployed on the brokers.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        <p>
     *        Information about the Apache Kafka version deployed on the brokers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Provisioned withCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        setCurrentBrokerSoftwareInfo(currentBrokerSoftwareInfo);
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

    public Provisioned withClientAuthentication(ClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
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

    public Provisioned withEncryptionInfo(EncryptionInfo encryptionInfo) {
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

    public Provisioned withEnhancedMonitoring(String enhancedMonitoring) {
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

    public Provisioned withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
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

    public Provisioned withOpenMonitoring(OpenMonitoringInfo openMonitoring) {
        setOpenMonitoring(openMonitoring);
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

    public Provisioned withLoggingInfo(LoggingInfo loggingInfo) {
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

    public Provisioned withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
        return this;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @param zookeeperConnectString
     *        <p>
     *        The connection string to use to connect to the Apache ZooKeeper cluster.
     *        </p>
     */

    public void setZookeeperConnectString(String zookeeperConnectString) {
        this.zookeeperConnectString = zookeeperConnectString;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @return <p>
     *         The connection string to use to connect to the Apache ZooKeeper cluster.
     *         </p>
     */

    public String getZookeeperConnectString() {
        return this.zookeeperConnectString;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @param zookeeperConnectString
     *        <p>
     *        The connection string to use to connect to the Apache ZooKeeper cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Provisioned withZookeeperConnectString(String zookeeperConnectString) {
        setZookeeperConnectString(zookeeperConnectString);
        return this;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     * </p>
     * 
     * @param zookeeperConnectStringTls
     *        <p>
     *        The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     *        </p>
     */

    public void setZookeeperConnectStringTls(String zookeeperConnectStringTls) {
        this.zookeeperConnectStringTls = zookeeperConnectStringTls;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     * </p>
     * 
     * @return <p>
     *         The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     *         </p>
     */

    public String getZookeeperConnectStringTls() {
        return this.zookeeperConnectStringTls;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     * </p>
     * 
     * @param zookeeperConnectStringTls
     *        <p>
     *        The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Provisioned withZookeeperConnectStringTls(String zookeeperConnectStringTls) {
        setZookeeperConnectStringTls(zookeeperConnectStringTls);
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

    public Provisioned withStorageMode(String storageMode) {
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

    public Provisioned withStorageMode(StorageMode storageMode) {
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
        if (getCurrentBrokerSoftwareInfo() != null)
            sb.append("CurrentBrokerSoftwareInfo: ").append(getCurrentBrokerSoftwareInfo()).append(",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication()).append(",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: ").append(getOpenMonitoring()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getZookeeperConnectString() != null)
            sb.append("ZookeeperConnectString: ").append(getZookeeperConnectString()).append(",");
        if (getZookeeperConnectStringTls() != null)
            sb.append("ZookeeperConnectStringTls: ").append(getZookeeperConnectStringTls()).append(",");
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

        if (obj instanceof Provisioned == false)
            return false;
        Provisioned other = (Provisioned) obj;
        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() == null ^ this.getCurrentBrokerSoftwareInfo() == null)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() != null && other.getCurrentBrokerSoftwareInfo().equals(this.getCurrentBrokerSoftwareInfo()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
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
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getZookeeperConnectString() == null ^ this.getZookeeperConnectString() == null)
            return false;
        if (other.getZookeeperConnectString() != null && other.getZookeeperConnectString().equals(this.getZookeeperConnectString()) == false)
            return false;
        if (other.getZookeeperConnectStringTls() == null ^ this.getZookeeperConnectStringTls() == null)
            return false;
        if (other.getZookeeperConnectStringTls() != null && other.getZookeeperConnectStringTls().equals(this.getZookeeperConnectStringTls()) == false)
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
        hashCode = prime * hashCode + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo().hashCode());
        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getZookeeperConnectString() == null) ? 0 : getZookeeperConnectString().hashCode());
        hashCode = prime * hashCode + ((getZookeeperConnectStringTls() == null) ? 0 : getZookeeperConnectStringTls().hashCode());
        hashCode = prime * hashCode + ((getStorageMode() == null) ? 0 : getStorageMode().hashCode());
        return hashCode;
    }

    @Override
    public Provisioned clone() {
        try {
            return (Provisioned) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ProvisionedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
