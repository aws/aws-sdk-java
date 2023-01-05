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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the capacity allocated to the connector. Exactly one of the two properties must be specified.
     * </p>
     */
    private Capacity capacity;
    /**
     * <p>
     * A map of keys to values that represent the configuration for the connector.
     * </p>
     */
    private java.util.Map<String, String> connectorConfiguration;
    /**
     * <p>
     * A summary description of the connector.
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
     * Specifies which Apache Kafka cluster to connect to.
     * </p>
     */
    private KafkaCluster kafkaCluster;
    /**
     * <p>
     * Details of the client authentication used by the Apache Kafka cluster.
     * </p>
     */
    private KafkaClusterClientAuthentication kafkaClusterClientAuthentication;
    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     */
    private KafkaClusterEncryptionInTransit kafkaClusterEncryptionInTransit;
    /**
     * <p>
     * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the
     * plugins.
     * </p>
     */
    private String kafkaConnectVersion;
    /**
     * <p>
     * Details about log delivery.
     * </p>
     */
    private LogDelivery logDelivery;
    /**
     * <p>
     * Specifies which plugins to use for the connector.
     * </p>
     */
    private java.util.List<Plugin> plugins;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources
     * that it needs. The types of resources depends on the logic of the connector. For example, a connector that has
     * Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
     * </p>
     */
    private String serviceExecutionRoleArn;
    /**
     * <p>
     * Specifies which worker configuration to use with the connector.
     * </p>
     */
    private WorkerConfiguration workerConfiguration;

    /**
     * <p>
     * Information about the capacity allocated to the connector. Exactly one of the two properties must be specified.
     * </p>
     * 
     * @param capacity
     *        Information about the capacity allocated to the connector. Exactly one of the two properties must be
     *        specified.
     */

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * Information about the capacity allocated to the connector. Exactly one of the two properties must be specified.
     * </p>
     * 
     * @return Information about the capacity allocated to the connector. Exactly one of the two properties must be
     *         specified.
     */

    public Capacity getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * Information about the capacity allocated to the connector. Exactly one of the two properties must be specified.
     * </p>
     * 
     * @param capacity
     *        Information about the capacity allocated to the connector. Exactly one of the two properties must be
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withCapacity(Capacity capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * A map of keys to values that represent the configuration for the connector.
     * </p>
     * 
     * @return A map of keys to values that represent the configuration for the connector.
     */

    public java.util.Map<String, String> getConnectorConfiguration() {
        return connectorConfiguration;
    }

    /**
     * <p>
     * A map of keys to values that represent the configuration for the connector.
     * </p>
     * 
     * @param connectorConfiguration
     *        A map of keys to values that represent the configuration for the connector.
     */

    public void setConnectorConfiguration(java.util.Map<String, String> connectorConfiguration) {
        this.connectorConfiguration = connectorConfiguration;
    }

    /**
     * <p>
     * A map of keys to values that represent the configuration for the connector.
     * </p>
     * 
     * @param connectorConfiguration
     *        A map of keys to values that represent the configuration for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withConnectorConfiguration(java.util.Map<String, String> connectorConfiguration) {
        setConnectorConfiguration(connectorConfiguration);
        return this;
    }

    /**
     * Add a single ConnectorConfiguration entry
     *
     * @see CreateConnectorRequest#withConnectorConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest addConnectorConfigurationEntry(String key, String value) {
        if (null == this.connectorConfiguration) {
            this.connectorConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.connectorConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.connectorConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConnectorConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest clearConnectorConfigurationEntries() {
        this.connectorConfiguration = null;
        return this;
    }

    /**
     * <p>
     * A summary description of the connector.
     * </p>
     * 
     * @param connectorDescription
     *        A summary description of the connector.
     */

    public void setConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    /**
     * <p>
     * A summary description of the connector.
     * </p>
     * 
     * @return A summary description of the connector.
     */

    public String getConnectorDescription() {
        return this.connectorDescription;
    }

    /**
     * <p>
     * A summary description of the connector.
     * </p>
     * 
     * @param connectorDescription
     *        A summary description of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withConnectorDescription(String connectorDescription) {
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

    public CreateConnectorRequest withConnectorName(String connectorName) {
        setConnectorName(connectorName);
        return this;
    }

    /**
     * <p>
     * Specifies which Apache Kafka cluster to connect to.
     * </p>
     * 
     * @param kafkaCluster
     *        Specifies which Apache Kafka cluster to connect to.
     */

    public void setKafkaCluster(KafkaCluster kafkaCluster) {
        this.kafkaCluster = kafkaCluster;
    }

    /**
     * <p>
     * Specifies which Apache Kafka cluster to connect to.
     * </p>
     * 
     * @return Specifies which Apache Kafka cluster to connect to.
     */

    public KafkaCluster getKafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * <p>
     * Specifies which Apache Kafka cluster to connect to.
     * </p>
     * 
     * @param kafkaCluster
     *        Specifies which Apache Kafka cluster to connect to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withKafkaCluster(KafkaCluster kafkaCluster) {
        setKafkaCluster(kafkaCluster);
        return this;
    }

    /**
     * <p>
     * Details of the client authentication used by the Apache Kafka cluster.
     * </p>
     * 
     * @param kafkaClusterClientAuthentication
     *        Details of the client authentication used by the Apache Kafka cluster.
     */

    public void setKafkaClusterClientAuthentication(KafkaClusterClientAuthentication kafkaClusterClientAuthentication) {
        this.kafkaClusterClientAuthentication = kafkaClusterClientAuthentication;
    }

    /**
     * <p>
     * Details of the client authentication used by the Apache Kafka cluster.
     * </p>
     * 
     * @return Details of the client authentication used by the Apache Kafka cluster.
     */

    public KafkaClusterClientAuthentication getKafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }

    /**
     * <p>
     * Details of the client authentication used by the Apache Kafka cluster.
     * </p>
     * 
     * @param kafkaClusterClientAuthentication
     *        Details of the client authentication used by the Apache Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withKafkaClusterClientAuthentication(KafkaClusterClientAuthentication kafkaClusterClientAuthentication) {
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

    public void setKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransit kafkaClusterEncryptionInTransit) {
        this.kafkaClusterEncryptionInTransit = kafkaClusterEncryptionInTransit;
    }

    /**
     * <p>
     * Details of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @return Details of encryption in transit to the Apache Kafka cluster.
     */

    public KafkaClusterEncryptionInTransit getKafkaClusterEncryptionInTransit() {
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

    public CreateConnectorRequest withKafkaClusterEncryptionInTransit(KafkaClusterEncryptionInTransit kafkaClusterEncryptionInTransit) {
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

    public CreateConnectorRequest withKafkaConnectVersion(String kafkaConnectVersion) {
        setKafkaConnectVersion(kafkaConnectVersion);
        return this;
    }

    /**
     * <p>
     * Details about log delivery.
     * </p>
     * 
     * @param logDelivery
     *        Details about log delivery.
     */

    public void setLogDelivery(LogDelivery logDelivery) {
        this.logDelivery = logDelivery;
    }

    /**
     * <p>
     * Details about log delivery.
     * </p>
     * 
     * @return Details about log delivery.
     */

    public LogDelivery getLogDelivery() {
        return this.logDelivery;
    }

    /**
     * <p>
     * Details about log delivery.
     * </p>
     * 
     * @param logDelivery
     *        Details about log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withLogDelivery(LogDelivery logDelivery) {
        setLogDelivery(logDelivery);
        return this;
    }

    /**
     * <p>
     * Specifies which plugins to use for the connector.
     * </p>
     * 
     * @return Specifies which plugins to use for the connector.
     */

    public java.util.List<Plugin> getPlugins() {
        return plugins;
    }

    /**
     * <p>
     * Specifies which plugins to use for the connector.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins to use for the connector.
     */

    public void setPlugins(java.util.Collection<Plugin> plugins) {
        if (plugins == null) {
            this.plugins = null;
            return;
        }

        this.plugins = new java.util.ArrayList<Plugin>(plugins);
    }

    /**
     * <p>
     * Specifies which plugins to use for the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlugins(java.util.Collection)} or {@link #withPlugins(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins to use for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withPlugins(Plugin... plugins) {
        if (this.plugins == null) {
            setPlugins(new java.util.ArrayList<Plugin>(plugins.length));
        }
        for (Plugin ele : plugins) {
            this.plugins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies which plugins to use for the connector.
     * </p>
     * 
     * @param plugins
     *        Specifies which plugins to use for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withPlugins(java.util.Collection<Plugin> plugins) {
        setPlugins(plugins);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources
     * that it needs. The types of resources depends on the logic of the connector. For example, a connector that has
     * Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services
     *        resources that it needs. The types of resources depends on the logic of the connector. For example, a
     *        connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3
     *        destination bucket.
     */

    public void setServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        this.serviceExecutionRoleArn = serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources
     * that it needs. The types of resources depends on the logic of the connector. For example, a connector that has
     * Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services
     *         resources that it needs. The types of resources depends on the logic of the connector. For example, a
     *         connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3
     *         destination bucket.
     */

    public String getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources
     * that it needs. The types of resources depends on the logic of the connector. For example, a connector that has
     * Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services
     *        resources that it needs. The types of resources depends on the logic of the connector. For example, a
     *        connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3
     *        destination bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        setServiceExecutionRoleArn(serviceExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies which worker configuration to use with the connector.
     * </p>
     * 
     * @param workerConfiguration
     *        Specifies which worker configuration to use with the connector.
     */

    public void setWorkerConfiguration(WorkerConfiguration workerConfiguration) {
        this.workerConfiguration = workerConfiguration;
    }

    /**
     * <p>
     * Specifies which worker configuration to use with the connector.
     * </p>
     * 
     * @return Specifies which worker configuration to use with the connector.
     */

    public WorkerConfiguration getWorkerConfiguration() {
        return this.workerConfiguration;
    }

    /**
     * <p>
     * Specifies which worker configuration to use with the connector.
     * </p>
     * 
     * @param workerConfiguration
     *        Specifies which worker configuration to use with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withWorkerConfiguration(WorkerConfiguration workerConfiguration) {
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
        if (getConnectorConfiguration() != null)
            sb.append("ConnectorConfiguration: ").append("***Sensitive Data Redacted***").append(",");
        if (getConnectorDescription() != null)
            sb.append("ConnectorDescription: ").append(getConnectorDescription()).append(",");
        if (getConnectorName() != null)
            sb.append("ConnectorName: ").append(getConnectorName()).append(",");
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

        if (obj instanceof CreateConnectorRequest == false)
            return false;
        CreateConnectorRequest other = (CreateConnectorRequest) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getConnectorConfiguration() == null ^ this.getConnectorConfiguration() == null)
            return false;
        if (other.getConnectorConfiguration() != null && other.getConnectorConfiguration().equals(this.getConnectorConfiguration()) == false)
            return false;
        if (other.getConnectorDescription() == null ^ this.getConnectorDescription() == null)
            return false;
        if (other.getConnectorDescription() != null && other.getConnectorDescription().equals(this.getConnectorDescription()) == false)
            return false;
        if (other.getConnectorName() == null ^ this.getConnectorName() == null)
            return false;
        if (other.getConnectorName() != null && other.getConnectorName().equals(this.getConnectorName()) == false)
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
        hashCode = prime * hashCode + ((getConnectorConfiguration() == null) ? 0 : getConnectorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConnectorDescription() == null) ? 0 : getConnectorDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectorName() == null) ? 0 : getConnectorName().hashCode());
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
    public CreateConnectorRequest clone() {
        return (CreateConnectorRequest) super.clone();
    }

}
