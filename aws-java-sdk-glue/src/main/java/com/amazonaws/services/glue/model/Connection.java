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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a connection to a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Connection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connection definition.
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
     * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
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
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     * database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is listening
     * for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     * <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     * <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     * encrypted password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with
     * hostname matching will be enforced for the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> connectionProperties;
    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to make this connection successfully.
     * </p>
     */
    private PhysicalConnectionRequirements physicalConnectionRequirements;
    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     */
    private String lastUpdatedBy;

    /**
     * <p>
     * The name of the connection definition.
     * </p>
     * 
     * @param name
     *        The name of the connection definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connection definition.
     * </p>
     * 
     * @return The name of the connection definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the connection definition.
     * </p>
     * 
     * @param name
     *        The name of the connection definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withName(String name) {
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

    public Connection withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @return The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Connection withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Connection withConnectionType(ConnectionType connectionType) {
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

    public Connection withMatchCriteria(String... matchCriteria) {
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

    public Connection withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     * database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is listening
     * for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     * <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     * <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     * encrypted password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with
     * hostname matching will be enforced for the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * </ul>
     * 
     * @return These key-value pairs define parameters for the connection:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of
     *         the database host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is
     *         listening for database connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     *         <code>USER_NAME</code> is "<code>USERNAME</code>".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASSWORD</code> - A password, if one is used, for the user name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     *         <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     *         encrypted password.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to
     *         use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONFIG_FILES</code> - (Reserved for future use).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSTANCE_ID</code> - The instance ID to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer
     *         (SSL) with hostname matching will be enforced for the JDBC connection on the client. The default is
     *         false.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     * database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is listening
     * for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     * <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     * <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     * encrypted password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with
     * hostname matching will be enforced for the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionProperties
     *        These key-value pairs define parameters for the connection:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     *        database host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is
     *        listening for database connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     *        <code>USER_NAME</code> is "<code>USERNAME</code>".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD</code> - A password, if one is used, for the user name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     *        <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     *        encrypted password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to
     *        use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFIG_FILES</code> - (Reserved for future use).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_ID</code> - The instance ID to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer
     *        (SSL) with hostname matching will be enforced for the JDBC connection on the client. The default is false.
     *        </p>
     *        </li>
     */

    public void setConnectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * <p>
     * These key-value pairs define parameters for the connection:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     * database host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is listening
     * for database connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     * <code>USER_NAME</code> is "<code>USERNAME</code>".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASSWORD</code> - A password, if one is used, for the user name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     * <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     * encrypted password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFIG_FILES</code> - (Reserved for future use).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_ID</code> - The instance ID to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with
     * hostname matching will be enforced for the JDBC connection on the client. The default is false.
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionProperties
     *        These key-value pairs define parameters for the connection:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HOST</code> - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the
     *        database host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PORT</code> - The port number, between 1024 and 65535, of the port on which the database host is
     *        listening for database connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>USER_NAME</code> - The name under which to log in to the database. The value string for
     *        <code>USER_NAME</code> is "<code>USERNAME</code>".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASSWORD</code> - A password, if one is used, for the user name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENCRYPTED_PASSWORD</code> - When you enable connection password protection by setting
     *        <code>ConnectionPasswordEncryption</code> in the Data Catalog encryption settings, this field stores the
     *        encrypted password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_DRIVER_JAR_URI</code> - The Amazon S3 path of the JAR file that contains the JDBC driver to
     *        use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_DRIVER_CLASS_NAME</code> - The class name of the JDBC driver to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENGINE</code> - The name of the JDBC engine to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENGINE_VERSION</code> - The version of the JDBC engine to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFIG_FILES</code> - (Reserved for future use).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSTANCE_ID</code> - The instance ID to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_CONNECTION_URL</code> - The URL for the JDBC connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JDBC_ENFORCE_SSL</code> - A Boolean string (true, false) specifying whether Secure Sockets Layer
     *        (SSL) with hostname matching will be enforced for the JDBC connection on the client. The default is false.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionProperties(java.util.Map<String, String> connectionProperties) {
        setConnectionProperties(connectionProperties);
        return this;
    }

    public Connection addConnectionPropertiesEntry(String key, String value) {
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

    public Connection clearConnectionPropertiesEntries() {
        this.connectionProperties = null;
        return this;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to make this connection successfully.
     * </p>
     * 
     * @param physicalConnectionRequirements
     *        A map of physical connection requirements, such as virtual private cloud (VPC) and
     *        <code>SecurityGroup</code>, that are needed to make this connection successfully.
     */

    public void setPhysicalConnectionRequirements(PhysicalConnectionRequirements physicalConnectionRequirements) {
        this.physicalConnectionRequirements = physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to make this connection successfully.
     * </p>
     * 
     * @return A map of physical connection requirements, such as virtual private cloud (VPC) and
     *         <code>SecurityGroup</code>, that are needed to make this connection successfully.
     */

    public PhysicalConnectionRequirements getPhysicalConnectionRequirements() {
        return this.physicalConnectionRequirements;
    }

    /**
     * <p>
     * A map of physical connection requirements, such as virtual private cloud (VPC) and <code>SecurityGroup</code>,
     * that are needed to make this connection successfully.
     * </p>
     * 
     * @param physicalConnectionRequirements
     *        A map of physical connection requirements, such as virtual private cloud (VPC) and
     *        <code>SecurityGroup</code>, that are needed to make this connection successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withPhysicalConnectionRequirements(PhysicalConnectionRequirements physicalConnectionRequirements) {
        setPhysicalConnectionRequirements(physicalConnectionRequirements);
        return this;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this connection definition was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     * 
     * @return The time that this connection definition was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that this connection definition was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this connection definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this connection definition was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     * 
     * @return The last time that this connection definition was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this connection definition was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this connection definition was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The user, group, or role that last updated this connection definition.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * 
     * @return The user, group, or role that last updated this connection definition.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The user, group, or role that last updated this connection definition.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The user, group, or role that last updated this connection definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
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
            sb.append("PhysicalConnectionRequirements: ").append(getPhysicalConnectionRequirements()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connection == false)
            return false;
        Connection other = (Connection) obj;
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public Connection clone() {
        try {
            return (Connection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
