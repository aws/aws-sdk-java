/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Arn of active cluster operation.
     * </p>
     */
    private String activeOperationArn;
    /**
     * <p>
     * Information about the broker nodes.
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
     * PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     * </p>
     */
    private String enhancedMonitoring;
    /**
     * <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     */
    private OpenMonitoring openMonitoring;

    private LoggingInfo loggingInfo;
    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;
    /**
     * <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     * </p>
     */
    private String state;

    private StateInfo stateInfo;
    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     */
    private String zookeeperConnectString;

    /**
     * <p>
     * Arn of active cluster operation.
     * </p>
     * 
     * @param activeOperationArn
     *        <p>
     *        Arn of active cluster operation.
     *        </p>
     */

    public void setActiveOperationArn(String activeOperationArn) {
        this.activeOperationArn = activeOperationArn;
    }

    /**
     * <p>
     * Arn of active cluster operation.
     * </p>
     * 
     * @return <p>
     *         Arn of active cluster operation.
     *         </p>
     */

    public String getActiveOperationArn() {
        return this.activeOperationArn;
    }

    /**
     * <p>
     * Arn of active cluster operation.
     * </p>
     * 
     * @param activeOperationArn
     *        <p>
     *        Arn of active cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withActiveOperationArn(String activeOperationArn) {
        setActiveOperationArn(activeOperationArn);
        return this;
    }

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @param brokerNodeGroupInfo
     *        <p>
     *        Information about the broker nodes.
     *        </p>
     */

    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @return <p>
     *         Information about the broker nodes.
     *         </p>
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
     *        <p>
     *        Information about the broker nodes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
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

    public ClusterInfo withClientAuthentication(ClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *         </p>
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
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
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
     *        <p>
     *        The name of the cluster.
     *        </p>
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return <p>
     *         The name of the cluster.
     *         </p>
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
     *        <p>
     *        The name of the cluster.
     *        </p>
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
     *        <p>
     *        The time when the cluster was created.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @return <p>
     *         The time when the cluster was created.
     *         </p>
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
     *        <p>
     *        The time when the cluster was created.
     *        </p>
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
     *        <p>
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *        </p>
     */

    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * <p>
     * Information about the version of software currently deployed on the Kafka brokers in the cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *         </p>
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
     *        <p>
     *        Information about the version of software currently deployed on the Kafka brokers in the cluster.
     *        </p>
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
     *        <p>
     *        The current version of the MSK cluster.
     *        </p>
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @return <p>
     *         The current version of the MSK cluster.
     *         </p>
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
     *        <p>
     *        The current version of the MSK cluster.
     *        </p>
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

    public ClusterInfo withEncryptionInfo(EncryptionInfo encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
        return this;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these
     *        three levels of monitoring, see <a
     *        href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     *        </p>
     * @see EnhancedMonitoring
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     * </p>
     * 
     * @return <p>
     *         Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *         DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these
     *         three levels of monitoring, see <a
     *         href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     *         </p>
     * @see EnhancedMonitoring
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
     * PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these
     *        three levels of monitoring, see <a
     *        href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     *        </p>
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
     * PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which metrics are gathered for the MSK cluster. This property has three possible values:
     *        DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these
     *        three levels of monitoring, see <a
     *        href="https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html">Monitoring</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public ClusterInfo withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        Settings for open monitoring using Prometheus.
     *        </p>
     */

    public void setOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    /**
     * <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     * 
     * @return <p>
     *         Settings for open monitoring using Prometheus.
     *         </p>
     */

    public OpenMonitoring getOpenMonitoring() {
        return this.openMonitoring;
    }

    /**
     * <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        Settings for open monitoring using Prometheus.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withOpenMonitoring(OpenMonitoring openMonitoring) {
        setOpenMonitoring(openMonitoring);
        return this;
    }

    /**
     * @param loggingInfo
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * @return
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * @param loggingInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withLoggingInfo(LoggingInfo loggingInfo) {
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
     *        <p>
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     *        </p>
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
     * @return <p>
     *         The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     *         </p>
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
     *        <p>
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     *        </p>
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
     *        <p>
     *        The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterInfo withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param stateInfo
     */

    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    /**
     * @return
     */

    public StateInfo getStateInfo() {
        return this.stateInfo;
    }

    /**
     * @param stateInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withStateInfo(StateInfo stateInfo) {
        setStateInfo(stateInfo);
        return this;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @return <p>
     *         Tags attached to the cluster.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @param tags
     *        <p>
     *        Tags attached to the cluster.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @param tags
     *        <p>
     *        Tags attached to the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ClusterInfo#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInfo addTagsEntry(String key, String value) {
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

    public ClusterInfo clearTagsEntries() {
        this.tags = null;
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
        if (getActiveOperationArn() != null)
            sb.append("ActiveOperationArn: ").append(getActiveOperationArn()).append(",");
        if (getBrokerNodeGroupInfo() != null)
            sb.append("BrokerNodeGroupInfo: ").append(getBrokerNodeGroupInfo()).append(",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication()).append(",");
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
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: ").append(getOpenMonitoring()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateInfo() != null)
            sb.append("StateInfo: ").append(getStateInfo()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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
        if (other.getActiveOperationArn() == null ^ this.getActiveOperationArn() == null)
            return false;
        if (other.getActiveOperationArn() != null && other.getActiveOperationArn().equals(this.getActiveOperationArn()) == false)
            return false;
        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateInfo() == null ^ this.getStateInfo() == null)
            return false;
        if (other.getStateInfo() != null && other.getStateInfo().equals(this.getStateInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getActiveOperationArn() == null) ? 0 : getActiveOperationArn().hashCode());
        hashCode = prime * hashCode + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateInfo() == null) ? 0 : getStateInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
