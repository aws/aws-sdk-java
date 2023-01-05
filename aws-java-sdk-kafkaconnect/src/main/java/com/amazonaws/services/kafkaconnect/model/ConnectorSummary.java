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
 * Summary of a connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ConnectorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector's compute capacity settings.
     * </p>
     */
    private CapacityDescription capacity;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The description of the connector.
     * </p>
     */
    private String connectorDescription;
    /**
     * <p>
     * The name of the connector.
     * </p>
     */
    private String connectorName;
    /**
     * <p>
     * The state of the connector.
     * </p>
     */
    private String connectorState;
    /**
     * <p>
     * The time that the connector was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The current version of the connector.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The details of the Apache Kafka cluster to which the connector is connected.
     * </p>
     */
    private KafkaClusterDescription kafkaCluster;
    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no client
     * authentication is used.
     * </p>
     */
    private KafkaClusterClientAuthenticationDescription kafkaClusterClientAuthentication;
    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     */
    private KafkaClusterEncryptionInTransitDescription kafkaClusterEncryptionInTransit;
    /**
     * <p>
     * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     * plugins.
     * </p>
     */
    private String kafkaConnectVersion;
    /**
     * <p>
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     * </p>
     */
    private LogDeliveryDescription logDelivery;
    /**
     * <p>
     * Specifies which plugins were used for this connector.
     * </p>
     */
    private java.util.List<PluginDescription> plugins;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services resources.
     * </p>
     */
    private String serviceExecutionRoleArn;
    /**
     * <p>
     * The worker configurations that are in use with the connector.
     * </p>
     */
    private WorkerConfigurationDescription workerConfiguration;

    /**
     * <p>
     * The connector's compute capacity settings.
     * </p>
     * 
     * @param capacity
     *        The connector's compute capacity settings.
     */

    public void setCapacity(CapacityDescription capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The connector's compute capacity settings.
     * </p>
     * 
     * @return The connector's compute capacity settings.
     */

    public CapacityDescription getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The connector's compute capacity settings.
     * </p>
     * 
     * @param capacity
     *        The connector's compute capacity settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCapacity(CapacityDescription capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The description of the connector.
     * </p>
     * 
     * @param connectorDescription
     *        The description of the connector.
     */

    public void setConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    /**
     * <p>
     * The description of the connector.
     * </p>
     * 
     * @return The description of the connector.
     */

    public String getConnectorDescription() {
        return this.connectorDescription;
    }

    /**
     * <p>
     * The description of the connector.
     * </p>
     * 
     * @param connectorDescription
     *        The description of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withConnectorDescription(String connectorDescription) {
        setConnectorDescription(connectorDescription);
        return this;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @param connectorName
     *        The name of the connector.
     */

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @return The name of the connector.
     */

    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @param connectorName
     *        The name of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withConnectorName(String connectorName) {
        setConnectorName(connectorName);
        return this;
    }

    /**
     * <p>
     * The state of the connector.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector.
     * @see ConnectorState
     */

    public void setConnectorState(String connectorState) {
        this.connectorState = connectorState;
    }

    /**
     * <p>
     * The state of the connector.
     * </p>
     * 
     * @return The state of the connector.
     * @see ConnectorState
     */

    public String getConnectorState() {
        return this.connectorState;
    }

    /**
     * <p>
     * The state of the connector.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorState
     */

    public ConnectorSummary withConnectorState(String connectorState) {
        setConnectorState(connectorState);
        return this;
    }

    /**
     * <p>
     * The state of the connector.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorState
     */

    public ConnectorSummary withConnectorState(ConnectorState connectorState) {
        this.connectorState = connectorState.toString();
        return this;
    }

    /**
     * <p>
     * The time that the connector was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the connector was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the connector was created.
     * </p>
     * 
     * @return The time that the connector was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the connector was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the connector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current version of the connector.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the connector.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the connector.
     * </p>
     * 
     * @return The current version of the connector.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the connector.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The details of the Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @param kafkaCluster
     *        The details of the Apache Kafka cluster to which the connector is connected.
     */

    public void setKafkaCluster(KafkaClusterDescription kafkaCluster) {
        this.kafkaCluster = kafkaCluster;
    }

    /**
     * <p>
     * The details of the Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @return The details of the Apache Kafka cluster to which the connector is connected.
     */

    public KafkaClusterDescription getKafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * <p>
     * The details of the Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @param kafkaCluster
     *        The details of the Apache Kafka cluster to which the connector is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withKafkaCluster(KafkaClusterDescription kafkaCluster) {
        setKafkaCluster(kafkaCluster);
        return this;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no client
     * authentication is used.
     * </p>
     * 
     * @param kafkaClusterClientAuthentication
     *        The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no
     *        client authentication is used.
     */

    public void setKafkaClusterClientAuthentication(KafkaClusterClientAuthenticationDescription kafkaClusterClientAuthentication) {
        this.kafkaClusterClientAuthentication = kafkaClusterClientAuthentication;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no client
     * authentication is used.
     * </p>
     * 
     * @return The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no
     *         client authentication is used.
     */

    public KafkaClusterClientAuthenticationDescription getKafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no client
     * authentication is used.
     * </p>
     * 
     * @param kafkaClusterClientAuthentication
     *        The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no
     *        client authentication is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withKafkaClusterClientAuthentication(KafkaClusterClientAuthenticationDescription kafkaClusterClientAuthentication) {
        setKafkaClusterClientAuthentication(kafkaClusterClientAuthentication);
        return this;
    }

    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @param kafkaClusterEncryptionInTransit
     *        Details of encryption in transit to the Apache Kafka cluster.
     */

    public void setKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitDescription kafkaClusterEncryptionInTransit) {
        this.kafkaClusterEncryptionInTransit = kafkaClusterEncryptionInTransit;
    }

    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @return Details of encryption in transit to the Apache Kafka cluster.
     */

    public KafkaClusterEncryptionInTransitDescription getKafkaClusterEncryptionInTransit() {
        return this.kafkaClusterEncryptionInTransit;
    }

    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @param kafkaClusterEncryptionInTransit
     *        Details of encryption in transit to the Apache Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransitDescription kafkaClusterEncryptionInTransit) {
        setKafkaClusterEncryptionInTransit(kafkaClusterEncryptionInTransit);
        return this;
    }

    /**
     * <p>
     * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     * plugins.
     * </p>
     * 
     * @param kafkaConnectVersion
     *        The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     *        plugins.
     */

    public void setKafkaConnectVersion(String kafkaConnectVersion) {
        this.kafkaConnectVersion = kafkaConnectVersion;
    }

    /**
     * <p>
     * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     * plugins.
     * </p>
     * 
     * @return The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and
     *         the plugins.
     */

    public String getKafkaConnectVersion() {
        return this.kafkaConnectVersion;
    }

    /**
     * <p>
     * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     * plugins.
     * </p>
     * 
     * @param kafkaConnectVersion
     *        The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     *        plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withKafkaConnectVersion(String kafkaConnectVersion) {
        setKafkaConnectVersion(kafkaConnectVersion);
        return this;
    }

    /**
     * <p>
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logDelivery
     *        The settings for delivering connector logs to Amazon CloudWatch Logs.
     */

    public void setLogDelivery(LogDeliveryDescription logDelivery) {
        this.logDelivery = logDelivery;
    }

    /**
     * <p>
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The settings for delivering connector logs to Amazon CloudWatch Logs.
     */

    public LogDeliveryDescription getLogDelivery() {
        return this.logDelivery;
    }

    /**
     * <p>
     * The settings for delivering connector logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logDelivery
     *        The settings for delivering connector logs to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withLogDelivery(LogDeliveryDescription logDelivery) {
        setLogDelivery(logDelivery);
        return this;
    }

    /**
     * <p>
     * Specifies which plugins were used for this connector.
     * </p>
     * 
     * @return Specifies which plugins were used for this connector.
     */

    public java.util.List<PluginDescription> getPlugins() {
        return plugins;
    }

    /**
     * <p>
     * Specifies which plugins were used for this connector.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins were used for this connector.
     */

    public void setPlugins(java.util.Collection<PluginDescription> plugins) {
        if (plugins == null) {
            this.plugins = null;
            return;
        }

        this.plugins = new java.util.ArrayList<PluginDescription>(plugins);
    }

    /**
     * <p>
     * Specifies which plugins were used for this connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlugins(java.util.Collection)} or {@link #withPlugins(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins were used for this connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withPlugins(PluginDescription... plugins) {
        if (this.plugins == null) {
            setPlugins(new java.util.ArrayList<PluginDescription>(plugins.length));
        }
        for (PluginDescription ele : plugins) {
            this.plugins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies which plugins were used for this connector.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins were used for this connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withPlugins(java.util.Collection<PluginDescription> plugins) {
        setPlugins(plugins);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services resources.
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services
     *        resources.
     */

    public void setServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        this.serviceExecutionRoleArn = serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services
     *         resources.
     */

    public String getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services resources.
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        setServiceExecutionRoleArn(serviceExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * The worker configurations that are in use with the connector.
     * </p>
     * 
     * @param workerConfiguration
     *        The worker configurations that are in use with the connector.
     */

    public void setWorkerConfiguration(WorkerConfigurationDescription workerConfiguration) {
        this.workerConfiguration = workerConfiguration;
    }

    /**
     * <p>
     * The worker configurations that are in use with the connector.
     * </p>
     * 
     * @return The worker configurations that are in use with the connector.
     */

    public WorkerConfigurationDescription getWorkerConfiguration() {
        return this.workerConfiguration;
    }

    /**
     * <p>
     * The worker configurations that are in use with the connector.
     * </p>
     * 
     * @param workerConfiguration
     *        The worker configurations that are in use with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSummary withWorkerConfiguration(WorkerConfigurationDescription workerConfiguration) {
        setWorkerConfiguration(workerConfiguration);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getConnectorDescription() != null)
            sb.append("ConnectorDescription: ").append(getConnectorDescription()).append(",");
        if (getConnectorName() != null)
            sb.append("ConnectorName: ").append(getConnectorName()).append(",");
        if (getConnectorState() != null)
            sb.append("ConnectorState: ").append(getConnectorState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getKafkaCluster() != null)
            sb.append("KafkaCluster: ").append(getKafkaCluster()).append(",");
        if (getKafkaClusterClientAuthentication() != null)
            sb.append("KafkaClusterClientAuthentication: ").append(getKafkaClusterClientAuthentication()).append(",");
        if (getKafkaClusterEncryptionInTransit() != null)
            sb.append("KafkaClusterEncryptionInTransit: ").append(getKafkaClusterEncryptionInTransit()).append(",");
        if (getKafkaConnectVersion() != null)
            sb.append("KafkaConnectVersion: ").append(getKafkaConnectVersion()).append(",");
        if (getLogDelivery() != null)
            sb.append("LogDelivery: ").append(getLogDelivery()).append(",");
        if (getPlugins() != null)
            sb.append("Plugins: ").append(getPlugins()).append(",");
        if (getServiceExecutionRoleArn() != null)
            sb.append("ServiceExecutionRoleArn: ").append(getServiceExecutionRoleArn()).append(",");
        if (getWorkerConfiguration() != null)
            sb.append("WorkerConfiguration: ").append(getWorkerConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorSummary == false)
            return false;
        ConnectorSummary other = (ConnectorSummary) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getConnectorDescription() == null ^ this.getConnectorDescription() == null)
            return false;
        if (other.getConnectorDescription() != null && other.getConnectorDescription().equals(this.getConnectorDescription()) == false)
            return false;
        if (other.getConnectorName() == null ^ this.getConnectorName() == null)
            return false;
        if (other.getConnectorName() != null && other.getConnectorName().equals(this.getConnectorName()) == false)
            return false;
        if (other.getConnectorState() == null ^ this.getConnectorState() == null)
            return false;
        if (other.getConnectorState() != null && other.getConnectorState().equals(this.getConnectorState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getKafkaCluster() == null ^ this.getKafkaCluster() == null)
            return false;
        if (other.getKafkaCluster() != null && other.getKafkaCluster().equals(this.getKafkaCluster()) == false)
            return false;
        if (other.getKafkaClusterClientAuthentication() == null ^ this.getKafkaClusterClientAuthentication() == null)
            return false;
        if (other.getKafkaClusterClientAuthentication() != null
                && other.getKafkaClusterClientAuthentication().equals(this.getKafkaClusterClientAuthentication()) == false)
            return false;
        if (other.getKafkaClusterEncryptionInTransit() == null ^ this.getKafkaClusterEncryptionInTransit() == null)
            return false;
        if (other.getKafkaClusterEncryptionInTransit() != null
                && other.getKafkaClusterEncryptionInTransit().equals(this.getKafkaClusterEncryptionInTransit()) == false)
            return false;
        if (other.getKafkaConnectVersion() == null ^ this.getKafkaConnectVersion() == null)
            return false;
        if (other.getKafkaConnectVersion() != null && other.getKafkaConnectVersion().equals(this.getKafkaConnectVersion()) == false)
            return false;
        if (other.getLogDelivery() == null ^ this.getLogDelivery() == null)
            return false;
        if (other.getLogDelivery() != null && other.getLogDelivery().equals(this.getLogDelivery()) == false)
            return false;
        if (other.getPlugins() == null ^ this.getPlugins() == null)
            return false;
        if (other.getPlugins() != null && other.getPlugins().equals(this.getPlugins()) == false)
            return false;
        if (other.getServiceExecutionRoleArn() == null ^ this.getServiceExecutionRoleArn() == null)
            return false;
        if (other.getServiceExecutionRoleArn() != null && other.getServiceExecutionRoleArn().equals(this.getServiceExecutionRoleArn()) == false)
            return false;
        if (other.getWorkerConfiguration() == null ^ this.getWorkerConfiguration() == null)
            return false;
        if (other.getWorkerConfiguration() != null && other.getWorkerConfiguration().equals(this.getWorkerConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorDescription() == null) ? 0 : getConnectorDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectorName() == null) ? 0 : getConnectorName().hashCode());
        hashCode = prime * hashCode + ((getConnectorState() == null) ? 0 : getConnectorState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getKafkaCluster() == null) ? 0 : getKafkaCluster().hashCode());
        hashCode = prime * hashCode + ((getKafkaClusterClientAuthentication() == null) ? 0 : getKafkaClusterClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getKafkaClusterEncryptionInTransit() == null) ? 0 : getKafkaClusterEncryptionInTransit().hashCode());
        hashCode = prime * hashCode + ((getKafkaConnectVersion() == null) ? 0 : getKafkaConnectVersion().hashCode());
        hashCode = prime * hashCode + ((getLogDelivery() == null) ? 0 : getLogDelivery().hashCode());
        hashCode = prime * hashCode + ((getPlugins() == null) ? 0 : getPlugins().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRoleArn() == null) ? 0 : getServiceExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getWorkerConfiguration() == null) ? 0 : getWorkerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorSummary clone() {
        try {
            return (ConnectorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.ConnectorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
