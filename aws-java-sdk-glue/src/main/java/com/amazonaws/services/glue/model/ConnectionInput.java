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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that is used to specify a connection to create or update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConnectionInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connection. Connection will not function as expected without a name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the connection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     * </p>
     * <p>
     * <code>JDBC</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     * <code>JDBC_CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>, <code>CUSTOM_JDBC_CERT_STRING</code>,
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are used to configure SSL with JDBC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     * </p>
     * <p>
     * <code>KAFKA</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     * <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     * <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client configuration
     * with SSL in <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>, <code>GSSAPI</code>,
     * or <code>AWS_MSK_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure SASL/SCRAM-SHA-512
     * authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     * <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are used to
     * configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     * </p>
     * <p>
     * <code>MONGODB</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private Cloud
     * environment (Amazon VPC).
     * </p>
     * <p>
     * <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     * Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     * </p>
     * <p>
     * <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     * <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     * <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write to data
     * stores that are not natively supported by Glue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>SFTP</code> is not supported.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue, consult <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection properties</a>.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue Studio,
     * consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using connectors and
     * connections</a>.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     */
    private java.util.List<String> matchCriteria;
    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     */
    private java.util.Map<String, String> connectionProperties;
    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to successfully make this connection.
     * </p>
     */
    private PhysicalConnectionRequirements physicalConnectionRequirements;

    /**
     * <p>
     * The name of the connection. Connection will not function as expected without a name.
     * </p>
     * 
     * @param name
     *        The name of the connection. Connection will not function as expected without a name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connection. Connection will not function as expected without a name.
     * </p>
     * 
     * @return The name of the connection. Connection will not function as expected without a name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the connection. Connection will not function as expected without a name.
     * </p>
     * 
     * @param name
     *        The name of the connection. Connection will not function as expected without a name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @param description
     *        The description of the connection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @return The description of the connection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @param description
     *        The description of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     * </p>
     * <p>
     * <code>JDBC</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     * <code>JDBC_CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>, <code>CUSTOM_JDBC_CERT_STRING</code>,
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are used to configure SSL with JDBC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     * </p>
     * <p>
     * <code>KAFKA</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     * <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     * <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client configuration
     * with SSL in <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>, <code>GSSAPI</code>,
     * or <code>AWS_MSK_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure SASL/SCRAM-SHA-512
     * authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     * <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are used to
     * configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     * </p>
     * <p>
     * <code>MONGODB</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private Cloud
     * environment (Amazon VPC).
     * </p>
     * <p>
     * <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     * Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     * </p>
     * <p>
     * <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     * <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     * <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write to data
     * stores that are not natively supported by Glue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>SFTP</code> is not supported.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue, consult <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection properties</a>.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue Studio,
     * consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using connectors and
     * connections</a>.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, these types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     *        </p>
     *        <p>
     *        <code>JDBC</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     *        <code>JDBC_CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>,
     *        <code>CUSTOM_JDBC_CERT_STRING</code>, <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are
     *        used to configure SSL with JDBC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     *        </p>
     *        <p>
     *        <code>KAFKA</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     *        <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     *        <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client
     *        configuration with SSL in <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>,
     *        <code>GSSAPI</code>, or <code>AWS_MSK_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure
     *        SASL/SCRAM-SHA-512 authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     *        <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are
     *        used to configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     *        </p>
     *        <p>
     *        <code>MONGODB</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private
     *        Cloud environment (Amazon VPC).
     *        </p>
     *        <p>
     *        <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     *        PhysicalConnectionRequirements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     *        Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     *        </p>
     *        <p>
     *        <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     *        <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     *        <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write
     *        to data stores that are not natively supported by Glue.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>SFTP</code> is not supported.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue,
     *        consult <a href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection
     *        properties</a>.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue
     *        Studio, consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using
     *        connectors and connections</a>.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     * </p>
     * <p>
     * <code>JDBC</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     * <code>JDBC_CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>, <code>CUSTOM_JDBC_CERT_STRING</code>,
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are used to configure SSL with JDBC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     * </p>
     * <p>
     * <code>KAFKA</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     * <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     * <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client configuration
     * with SSL in <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>, <code>GSSAPI</code>,
     * or <code>AWS_MSK_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure SASL/SCRAM-SHA-512
     * authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     * <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are used to
     * configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     * </p>
     * <p>
     * <code>MONGODB</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private Cloud
     * environment (Amazon VPC).
     * </p>
     * <p>
     * <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     * Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     * </p>
     * <p>
     * <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     * <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     * <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write to data
     * stores that are not natively supported by Glue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>SFTP</code> is not supported.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue, consult <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection properties</a>.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue Studio,
     * consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using connectors and
     * connections</a>.
     * </p>
     * 
     * @return The type of the connection. Currently, these types are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     *         </p>
     *         <p>
     *         <code>JDBC</code> Connections use the following ConnectionParameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     *         <code>JDBC_CONNECTION_URL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>,
     *         <code>CUSTOM_JDBC_CERT_STRING</code>, <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are
     *         used to configure SSL with JDBC.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     *         </p>
     *         <p>
     *         <code>KAFKA</code> Connections use the following ConnectionParameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     *         <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     *         <code>KAFKA</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *         <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *         <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client
     *         configuration with SSL in <code>KAFKA</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>,
     *         <code>GSSAPI</code>, or <code>AWS_MSK_IAM</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     *         <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure
     *         SASL/SCRAM-SHA-512 authentication with <code>KAFKA</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     *         <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are
     *         used to configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     *         </p>
     *         <p>
     *         <code>MONGODB</code> Connections use the following ConnectionParameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required: <code>CONNECTION_URL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private
     *         Cloud environment (Amazon VPC).
     *         </p>
     *         <p>
     *         <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     *         PhysicalConnectionRequirements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     *         Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     *         </p>
     *         <p>
     *         <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     *         <code>CONNECTION_URL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     *         <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write
     *         to data stores that are not natively supported by Glue.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>SFTP</code> is not supported.
     *         </p>
     *         <p>
     *         For more information about how optional ConnectionProperties are used to configure features in Glue,
     *         consult <a href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection
     *         properties</a>.
     *         </p>
     *         <p>
     *         For more information about how optional ConnectionProperties are used to configure features in Glue
     *         Studio, consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using
     *         connectors and connections</a>.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     * </p>
     * <p>
     * <code>JDBC</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     * <code>JDBC_CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>, <code>CUSTOM_JDBC_CERT_STRING</code>,
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are used to configure SSL with JDBC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     * </p>
     * <p>
     * <code>KAFKA</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     * <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     * <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client configuration
     * with SSL in <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>, <code>GSSAPI</code>,
     * or <code>AWS_MSK_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure SASL/SCRAM-SHA-512
     * authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     * <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are used to
     * configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     * </p>
     * <p>
     * <code>MONGODB</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private Cloud
     * environment (Amazon VPC).
     * </p>
     * <p>
     * <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     * Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     * </p>
     * <p>
     * <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     * <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     * <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write to data
     * stores that are not natively supported by Glue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>SFTP</code> is not supported.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue, consult <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection properties</a>.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue Studio,
     * consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using connectors and
     * connections</a>.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, these types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     *        </p>
     *        <p>
     *        <code>JDBC</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     *        <code>JDBC_CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>,
     *        <code>CUSTOM_JDBC_CERT_STRING</code>, <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are
     *        used to configure SSL with JDBC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     *        </p>
     *        <p>
     *        <code>KAFKA</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     *        <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     *        <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client
     *        configuration with SSL in <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>,
     *        <code>GSSAPI</code>, or <code>AWS_MSK_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure
     *        SASL/SCRAM-SHA-512 authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     *        <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are
     *        used to configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     *        </p>
     *        <p>
     *        <code>MONGODB</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private
     *        Cloud environment (Amazon VPC).
     *        </p>
     *        <p>
     *        <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     *        PhysicalConnectionRequirements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     *        Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     *        </p>
     *        <p>
     *        <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     *        <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     *        <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write
     *        to data stores that are not natively supported by Glue.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>SFTP</code> is not supported.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue,
     *        consult <a href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection
     *        properties</a>.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue
     *        Studio, consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using
     *        connectors and connections</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public ConnectionInput withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, these types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     * </p>
     * <p>
     * <code>JDBC</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     * <code>JDBC_CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>, <code>CUSTOM_JDBC_CERT_STRING</code>,
     * <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are used to configure SSL with JDBC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     * </p>
     * <p>
     * <code>KAFKA</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     * <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     * <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client configuration
     * with SSL in <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>, <code>GSSAPI</code>,
     * or <code>AWS_MSK_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     * <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure SASL/SCRAM-SHA-512
     * authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     * <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are used to
     * configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     * </p>
     * <p>
     * <code>MONGODB</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private Cloud
     * environment (Amazon VPC).
     * </p>
     * <p>
     * <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     * Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     * </p>
     * <p>
     * <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     * <code>CONNECTION_URL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     * <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write to data
     * stores that are not natively supported by Glue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>SFTP</code> is not supported.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue, consult <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection properties</a>.
     * </p>
     * <p>
     * For more information about how optional ConnectionProperties are used to configure features in Glue Studio,
     * consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using connectors and
     * connections</a>.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, these types are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JDBC</code> - Designates a connection to a database through Java Database Connectivity (JDBC).
     *        </p>
     *        <p>
     *        <code>JDBC</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: All of (<code>HOST</code>, <code>PORT</code>, <code>JDBC_ENGINE</code>) or
     *        <code>JDBC_CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>JDBC_ENFORCE_SSL</code>, <code>CUSTOM_JDBC_CERT</code>,
     *        <code>CUSTOM_JDBC_CERT_STRING</code>, <code>SKIP_CUSTOM_JDBC_CERT_VALIDATION</code>. These parameters are
     *        used to configure SSL with JDBC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KAFKA</code> - Designates a connection to an Apache Kafka streaming platform.
     *        </p>
     *        <p>
     *        <code>KAFKA</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>KAFKA_BOOTSTRAP_SERVERS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SSL_ENABLED</code>, <code>KAFKA_CUSTOM_CERT</code>,
     *        <code>KAFKA_SKIP_CUSTOM_CERT_VALIDATION</code>. These parameters are used to configure SSL with
     *        <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_CLIENT_KEYSTORE</code>, <code>KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>KAFKA_CLIENT_KEY_PASSWORD</code>, <code>ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD</code>. These parameters are used to configure TLS client
     *        configuration with SSL in <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_MECHANISM</code>. Can be specified as <code>SCRAM-SHA-512</code>,
     *        <code>GSSAPI</code>, or <code>AWS_MSK_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_SCRAM_USERNAME</code>, <code>KAFKA_SASL_SCRAM_PASSWORD</code>,
     *        <code>ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD</code>. These parameters are used to configure
     *        SASL/SCRAM-SHA-512 authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optional: <code>KAFKA_SASL_GSSAPI_KEYTAB</code>, <code>KAFKA_SASL_GSSAPI_KRB5_CONF</code>,
     *        <code>KAFKA_SASL_GSSAPI_SERVICE</code>, <code>KAFKA_SASL_GSSAPI_PRINCIPAL</code>. These parameters are
     *        used to configure SASL/GSSAPI authentication with <code>KAFKA</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONGODB</code> - Designates a connection to a MongoDB document database.
     *        </p>
     *        <p>
     *        <code>MONGODB</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required: All of (<code>USERNAME</code>, <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK</code> - Designates a network connection to a data source within an Amazon Virtual Private
     *        Cloud environment (Amazon VPC).
     *        </p>
     *        <p>
     *        <code>NETWORK</code> Connections do not require ConnectionParameters. Instead, provide a
     *        PhysicalConnectionRequirements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE</code> - Uses configuration settings contained in a connector purchased from Amazon Web
     *        Services Marketplace to read from and write to data stores that are not natively supported by Glue.
     *        </p>
     *        <p>
     *        <code>MARKETPLACE</code> Connections use the following ConnectionParameters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required: <code>CONNECTOR_TYPE</code>, <code>CONNECTOR_URL</code>, <code>CONNECTOR_CLASS_NAME</code>,
     *        <code>CONNECTION_URL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Required for <code>JDBC</code> <code>CONNECTOR_TYPE</code> connections: All of (<code>USERNAME</code>,
     *        <code>PASSWORD</code>) or <code>SECRET_ID</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Uses configuration settings contained in a custom connector to read from and write
     *        to data stores that are not natively supported by Glue.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>SFTP</code> is not supported.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue,
     *        consult <a href="https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html">Glue connection
     *        properties</a>.
     *        </p>
     *        <p>
     *        For more information about how optional ConnectionProperties are used to configure features in Glue
     *        Studio, consult <a href="https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html">Using
     *        connectors and connections</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public ConnectionInput withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * 
     * @return A list of criteria that can be used in selecting this connection.
     */

    public java.util.List<String> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * 
     * @param matchCriteria
     *        A list of criteria that can be used in selecting this connection.
     */

    public void setMatchCriteria(java.util.Collection<String> matchCriteria) {
        if (matchCriteria == null) {
            this.matchCriteria = null;
            return;
        }

        this.matchCriteria = new java.util.ArrayList<String>(matchCriteria);
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchCriteria(java.util.Collection)} or {@link #withMatchCriteria(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchCriteria
     *        A list of criteria that can be used in selecting this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withMatchCriteria(String... matchCriteria) {
        if (this.matchCriteria == null) {
            setMatchCriteria(new java.util.ArrayList<String>(matchCriteria.length));
        }
        for (String ele : matchCriteria) {
            this.matchCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of criteria that can be used in selecting this connection.
     * </p>
     * 
     * @param matchCriteria
     *        A list of criteria that can be used in selecting this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     * 
     * @return These key-value pairs define parameters for the connection.
     */

    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     * 
     * @param connectionProperties
     *        These key-value pairs define parameters for the connection.
     */

    public void setConnectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection.
     * </p>
     * 
     * @param connectionProperties
     *        These key-value pairs define parameters for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withConnectionProperties(java.util.Map<String, String> connectionProperties) {
        setConnectionProperties(connectionProperties);
        return this;
    }

    /**
     * Add a single ConnectionProperties entry
     *
     * @see ConnectionInput#withConnectionProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput addConnectionPropertiesEntry(String key, String value) {
        if (null == this.connectionProperties) {
            this.connectionProperties = new java.util.HashMap<String, String>();
        }
        if (this.connectionProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.connectionProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConnectionProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput clearConnectionPropertiesEntries() {
        this.connectionProperties = null;
        return this;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to successfully make this connection.
     * </p>
     * 
     * @param physicalConnectionRequirements
     *        A map of physical connection requirements, such as virtual private cloud (VPC) and
     *        <code>SecurityGroup</code>, that are needed to successfully make this connection.
     */

    public void setPhysicalConnectionRequirements(PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to successfully make this connection.
     * </p>
     * 
     * @return A map of physical connection requirements, such as virtual private cloud (VPC) and
     *         <code>SecurityGroup</code>, that are needed to successfully make this connection.
     */

    public PhysicalConnectionRequirements getPhysicalConnectionRequirements() {
        return this.physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to successfully make this connection.
     * </p>
     * 
     * @param physicalConnectionRequirements
     *        A map of physical connection requirements, such as virtual private cloud (VPC) and
     *        <code>SecurityGroup</code>, that are needed to successfully make this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionInput withPhysicalConnectionRequirements(PhysicalConnectionRequirements physicalConnectionRequirements) {
        setPhysicalConnectionRequirements(physicalConnectionRequirements);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: ").append(getMatchCriteria()).append(",");
        if (getConnectionProperties() != null)
            sb.append("ConnectionProperties: ").append(getConnectionProperties()).append(",");
        if (getPhysicalConnectionRequirements() != null)
            sb.append("PhysicalConnectionRequirements: ").append(getPhysicalConnectionRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionInput == false)
            return false;
        ConnectionInput other = (ConnectionInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getConnectionProperties() == null ^ this.getConnectionProperties() == null)
            return false;
        if (other.getConnectionProperties() != null && other.getConnectionProperties().equals(this.getConnectionProperties()) == false)
            return false;
        if (other.getPhysicalConnectionRequirements() == null ^ this.getPhysicalConnectionRequirements() == null)
            return false;
        if (other.getPhysicalConnectionRequirements() != null
                && other.getPhysicalConnectionRequirements().equals(this.getPhysicalConnectionRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getConnectionProperties() == null) ? 0 : getConnectionProperties().hashCode());
        hashCode = prime * hashCode + ((getPhysicalConnectionRequirements() == null) ? 0 : getPhysicalConnectionRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionInput clone() {
        try {
            return (ConnectionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConnectionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
