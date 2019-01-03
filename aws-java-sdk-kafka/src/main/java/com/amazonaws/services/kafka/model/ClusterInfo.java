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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     */
    private BrokerSoftwareInfo currentBrokerSoftwareInfo;
    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     */
    private EncryptionInfo encryptionInfo;
    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p>
     */
    private String enhancedMonitoring;
    /**
     * <p>
     * The number of Kafka broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;
    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     */
    private String zookeeperConnectString;

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        Information about the broker nodes.
     */

    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @return Information about the broker nodes.
     */

    public BrokerNodeGroupInfo getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        Information about the broker nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        setBrokerNodeGroupInfo(brokerNodeGroupInfo);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
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

    public ClusterInfo withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the cluster was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @return The time when the cluster was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     */

    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @return Information about the version of software currently deployed on the Kafka brokers in the cluster.
     */

    public BrokerSoftwareInfo getCurrentBrokerSoftwareInfo() {
        return this.currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        setCurrentBrokerSoftwareInfo(currentBrokerSoftwareInfo);
        return this;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the MSK cluster.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @return The current version of the MSK cluster.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
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

    public ClusterInfo withEncryptionInfo(EncryptionInfo encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
        return this;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * @see EnhancedMonitoring
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @return Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *         DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * @see EnhancedMonitoring
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public ClusterInfo withEnhancedMonitoring(String enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public ClusterInfo withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of Kafka broker nodes in the cluster.
     */

    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the cluster.
     * </p>
     * 
     * @return The number of Kafka broker nodes in the cluster.
     */

    public Integer getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of Kafka broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of Kafka broker nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @return The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterInfo withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     * 
     * @param state
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterInfo withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @param zookeeperConnectString
     *        The connection string to use to connect to the Apache ZooKeeper cluster.
     */

    public void setZookeeperConnectString(String zookeeperConnectString) {
        this.zookeeperConnectString = zookeeperConnectString;
    }

    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @return The connection string to use to connect to the Apache ZooKeeper cluster.
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
     *        The connection string to use to connect to the Apache ZooKeeper cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withZookeeperConnectString(String zookeeperConnectString) {
        setZookeeperConnectString(zookeeperConnectString);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentBrokerSoftwareInfo() != null)
            sb.append("CurrentBrokerSoftwareInfo: ").append(getCurrentBrokerSoftwareInfo()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getZookeeperConnectString() != null)
            sb.append("ZookeeperConnectString: ").append(getZookeeperConnectString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterInfo == false)
            return false;
        ClusterInfo other = (ClusterInfo) obj;
        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() == null ^ this.getCurrentBrokerSoftwareInfo() == null)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() != null && other.getCurrentBrokerSoftwareInfo().equals(this.getCurrentBrokerSoftwareInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getZookeeperConnectString() == null ^ this.getZookeeperConnectString() == null)
            return false;
        if (other.getZookeeperConnectString() != null && other.getZookeeperConnectString().equals(this.getZookeeperConnectString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getZookeeperConnectString() == null) ? 0 : getZookeeperConnectString().hashCode());
        return hashCode;
    }

    @Override
    public ClusterInfo clone() {
        try {
            return (ClusterInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
