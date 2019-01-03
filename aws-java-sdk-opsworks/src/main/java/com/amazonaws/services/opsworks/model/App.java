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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/App" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The app stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The app's short name.
     * </p>
     */
    private String shortname;
    /**
     * <p>
     * The app name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The app's data sources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DataSource> dataSources;
    /**
     * <p>
     * The app type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>Source</code> object that describes the app repository.
     * </p>
     */
    private Source appSource;
    /**
     * <p>
     * The app vhost settings with multiple domains separated by commas. For example:
     * <code>'www.example.com, example.com'</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> domains;
    /**
     * <p>
     * Whether to enable SSL for the app.
     * </p>
     */
    private Boolean enableSsl;
    /**
     * <p>
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * </p>
     */
    private SslConfiguration sslConfiguration;
    /**
     * <p>
     * The stack attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * When the app was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated with the
     * app. After you deploy the app, these variables are defined on the associated app server instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     * > Environment Variables</a>.
     * </p>
     * <note>
     * <p>
     * There is no specific limit on the number of environment variables. However, the size of the associated data
     * structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240
     * Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an
     * exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<EnvironmentVariable> environment;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The app stack ID.
     * </p>
     * 
     * @param stackId
     *        The app stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The app stack ID.
     * </p>
     * 
     * @return The app stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The app stack ID.
     * </p>
     * 
     * @param stackId
     *        The app stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The app's short name.
     * </p>
     * 
     * @param shortname
     *        The app's short name.
     */

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * <p>
     * The app's short name.
     * </p>
     * 
     * @return The app's short name.
     */

    public String getShortname() {
        return this.shortname;
    }

    /**
     * <p>
     * The app's short name.
     * </p>
     * 
     * @param shortname
     *        The app's short name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withShortname(String shortname) {
        setShortname(shortname);
        return this;
    }

    /**
     * <p>
     * The app name.
     * </p>
     * 
     * @param name
     *        The app name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The app name.
     * </p>
     * 
     * @return The app name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The app name.
     * </p>
     * 
     * @param name
     *        The app name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the app.
     * </p>
     * 
     * @param description
     *        A description of the app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the app.
     * </p>
     * 
     * @return A description of the app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the app.
     * </p>
     * 
     * @param description
     *        A description of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The app's data sources.
     * </p>
     * 
     * @return The app's data sources.
     */

    public java.util.List<DataSource> getDataSources() {
        if (dataSources == null) {
            dataSources = new com.amazonaws.internal.SdkInternalList<DataSource>();
        }
        return dataSources;
    }

    /**
     * <p>
     * The app's data sources.
     * </p>
     * 
     * @param dataSources
     *        The app's data sources.
     */

    public void setDataSources(java.util.Collection<DataSource> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new com.amazonaws.internal.SdkInternalList<DataSource>(dataSources);
    }

    /**
     * <p>
     * The app's data sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        The app's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDataSources(DataSource... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new com.amazonaws.internal.SdkInternalList<DataSource>(dataSources.length));
        }
        for (DataSource ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The app's data sources.
     * </p>
     * 
     * @param dataSources
     *        The app's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDataSources(java.util.Collection<DataSource> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * The app type.
     * </p>
     * 
     * @param type
     *        The app type.
     * @see AppType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The app type.
     * </p>
     * 
     * @return The app type.
     * @see AppType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The app type.
     * </p>
     * 
     * @param type
     *        The app type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public App withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The app type.
     * </p>
     * 
     * @param type
     *        The app type.
     * @see AppType
     */

    public void setType(AppType type) {
        withType(type);
    }

    /**
     * <p>
     * The app type.
     * </p>
     * 
     * @param type
     *        The app type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public App withType(AppType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>Source</code> object that describes the app repository.
     * </p>
     * 
     * @param appSource
     *        A <code>Source</code> object that describes the app repository.
     */

    public void setAppSource(Source appSource) {
        this.appSource = appSource;
    }

    /**
     * <p>
     * A <code>Source</code> object that describes the app repository.
     * </p>
     * 
     * @return A <code>Source</code> object that describes the app repository.
     */

    public Source getAppSource() {
        return this.appSource;
    }

    /**
     * <p>
     * A <code>Source</code> object that describes the app repository.
     * </p>
     * 
     * @param appSource
     *        A <code>Source</code> object that describes the app repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppSource(Source appSource) {
        setAppSource(appSource);
        return this;
    }

    /**
     * <p>
     * The app vhost settings with multiple domains separated by commas. For example:
     * <code>'www.example.com, example.com'</code>
     * </p>
     * 
     * @return The app vhost settings with multiple domains separated by commas. For example:
     *         <code>'www.example.com, example.com'</code>
     */

    public java.util.List<String> getDomains() {
        if (domains == null) {
            domains = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return domains;
    }

    /**
     * <p>
     * The app vhost settings with multiple domains separated by commas. For example:
     * <code>'www.example.com, example.com'</code>
     * </p>
     * 
     * @param domains
     *        The app vhost settings with multiple domains separated by commas. For example:
     *        <code>'www.example.com, example.com'</code>
     */

    public void setDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new com.amazonaws.internal.SdkInternalList<String>(domains);
    }

    /**
     * <p>
     * The app vhost settings with multiple domains separated by commas. For example:
     * <code>'www.example.com, example.com'</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        The app vhost settings with multiple domains separated by commas. For example:
     *        <code>'www.example.com, example.com'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDomains(String... domains) {
        if (this.domains == null) {
            setDomains(new com.amazonaws.internal.SdkInternalList<String>(domains.length));
        }
        for (String ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The app vhost settings with multiple domains separated by commas. For example:
     * <code>'www.example.com, example.com'</code>
     * </p>
     * 
     * @param domains
     *        The app vhost settings with multiple domains separated by commas. For example:
     *        <code>'www.example.com, example.com'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDomains(java.util.Collection<String> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * Whether to enable SSL for the app.
     * </p>
     * 
     * @param enableSsl
     *        Whether to enable SSL for the app.
     */

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    /**
     * <p>
     * Whether to enable SSL for the app.
     * </p>
     * 
     * @return Whether to enable SSL for the app.
     */

    public Boolean getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * <p>
     * Whether to enable SSL for the app.
     * </p>
     * 
     * @param enableSsl
     *        Whether to enable SSL for the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnableSsl(Boolean enableSsl) {
        setEnableSsl(enableSsl);
        return this;
    }

    /**
     * <p>
     * Whether to enable SSL for the app.
     * </p>
     * 
     * @return Whether to enable SSL for the app.
     */

    public Boolean isEnableSsl() {
        return this.enableSsl;
    }

    /**
     * <p>
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * </p>
     * 
     * @param sslConfiguration
     *        An <code>SslConfiguration</code> object with the SSL configuration.
     */

    public void setSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
    }

    /**
     * <p>
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * </p>
     * 
     * @return An <code>SslConfiguration</code> object with the SSL configuration.
     */

    public SslConfiguration getSslConfiguration() {
        return this.sslConfiguration;
    }

    /**
     * <p>
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * </p>
     * 
     * @param sslConfiguration
     *        An <code>SslConfiguration</code> object with the SSL configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withSslConfiguration(SslConfiguration sslConfiguration) {
        setSslConfiguration(sslConfiguration);
        return this;
    }

    /**
     * <p>
     * The stack attributes.
     * </p>
     * 
     * @return The stack attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * The stack attributes.
     * </p>
     * 
     * @param attributes
     *        The stack attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * The stack attributes.
     * </p>
     * 
     * @param attributes
     *        The stack attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public App addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * When the app was created.
     * </p>
     * 
     * @param createdAt
     *        When the app was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the app was created.
     * </p>
     * 
     * @return When the app was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the app was created.
     * </p>
     * 
     * @param createdAt
     *        When the app was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated with the
     * app. After you deploy the app, these variables are defined on the associated app server instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     * > Environment Variables</a>.
     * </p>
     * <note>
     * <p>
     * There is no specific limit on the number of environment variables. However, the size of the associated data
     * structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240
     * Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an
     * exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     * </p>
     * </note>
     * 
     * @return An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated
     *         with the app. After you deploy the app, these variables are defined on the associated app server
     *         instances. For more information, see <a href=
     *         "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     *         > Environment Variables</a>. </p> <note>
     *         <p>
     *         There is no specific limit on the number of environment variables. However, the size of the associated
     *         data structure - which includes the variable names, values, and protected flag values - cannot exceed 10
     *         KB (10240 Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you
     *         will cause an exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     *         </p>
     */

    public java.util.List<EnvironmentVariable> getEnvironment() {
        if (environment == null) {
            environment = new com.amazonaws.internal.SdkInternalList<EnvironmentVariable>();
        }
        return environment;
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated with the
     * app. After you deploy the app, these variables are defined on the associated app server instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     * > Environment Variables</a>.
     * </p>
     * <note>
     * <p>
     * There is no specific limit on the number of environment variables. However, the size of the associated data
     * structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240
     * Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an
     * exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     * </p>
     * </note>
     * 
     * @param environment
     *        An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated
     *        with the app. After you deploy the app, these variables are defined on the associated app server
     *        instances. For more information, see <a href=
     *        "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     *        > Environment Variables</a>. </p> <note>
     *        <p>
     *        There is no specific limit on the number of environment variables. However, the size of the associated
     *        data structure - which includes the variable names, values, and protected flag values - cannot exceed 10
     *        KB (10240 Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you
     *        will cause an exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     *        </p>
     */

    public void setEnvironment(java.util.Collection<EnvironmentVariable> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }

        this.environment = new com.amazonaws.internal.SdkInternalList<EnvironmentVariable>(environment);
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated with the
     * app. After you deploy the app, these variables are defined on the associated app server instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     * > Environment Variables</a>.
     * </p>
     * <note>
     * <p>
     * There is no specific limit on the number of environment variables. However, the size of the associated data
     * structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240
     * Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an
     * exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironment(java.util.Collection)} or {@link #withEnvironment(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environment
     *        An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated
     *        with the app. After you deploy the app, these variables are defined on the associated app server
     *        instances. For more information, see <a href=
     *        "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     *        > Environment Variables</a>. </p> <note>
     *        <p>
     *        There is no specific limit on the number of environment variables. However, the size of the associated
     *        data structure - which includes the variable names, values, and protected flag values - cannot exceed 10
     *        KB (10240 Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you
     *        will cause an exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnvironment(EnvironmentVariable... environment) {
        if (this.environment == null) {
            setEnvironment(new com.amazonaws.internal.SdkInternalList<EnvironmentVariable>(environment.length));
        }
        for (EnvironmentVariable ele : environment) {
            this.environment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated with the
     * app. After you deploy the app, these variables are defined on the associated app server instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     * > Environment Variables</a>.
     * </p>
     * <note>
     * <p>
     * There is no specific limit on the number of environment variables. However, the size of the associated data
     * structure - which includes the variable names, values, and protected flag values - cannot exceed 10 KB (10240
     * Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an
     * exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     * </p>
     * </note>
     * 
     * @param environment
     *        An array of <code>EnvironmentVariable</code> objects that specify environment variables to be associated
     *        with the app. After you deploy the app, these variables are defined on the associated app server
     *        instances. For more information, see <a href=
     *        "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment"
     *        > Environment Variables</a>. </p> <note>
     *        <p>
     *        There is no specific limit on the number of environment variables. However, the size of the associated
     *        data structure - which includes the variable names, values, and protected flag values - cannot exceed 10
     *        KB (10240 Bytes). This limit should accommodate most if not all use cases, but if you do exceed it, you
     *        will cause an exception (API) with an "Environment: is too large (maximum is 10KB)" message.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEnvironment(java.util.Collection<EnvironmentVariable> environment) {
        setEnvironment(environment);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getShortname() != null)
            sb.append("Shortname: ").append(getShortname()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAppSource() != null)
            sb.append("AppSource: ").append(getAppSource()).append(",");
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains()).append(",");
        if (getEnableSsl() != null)
            sb.append("EnableSsl: ").append(getEnableSsl()).append(",");
        if (getSslConfiguration() != null)
            sb.append("SslConfiguration: ").append(getSslConfiguration()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof App == false)
            return false;
        App other = (App) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getShortname() == null ^ this.getShortname() == null)
            return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAppSource() == null ^ this.getAppSource() == null)
            return false;
        if (other.getAppSource() != null && other.getAppSource().equals(this.getAppSource()) == false)
            return false;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        if (other.getEnableSsl() == null ^ this.getEnableSsl() == null)
            return false;
        if (other.getEnableSsl() != null && other.getEnableSsl().equals(this.getEnableSsl()) == false)
            return false;
        if (other.getSslConfiguration() == null ^ this.getSslConfiguration() == null)
            return false;
        if (other.getSslConfiguration() != null && other.getSslConfiguration().equals(this.getSslConfiguration()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAppSource() == null) ? 0 : getAppSource().hashCode());
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getEnableSsl() == null) ? 0 : getEnableSsl().hashCode());
        hashCode = prime * hashCode + ((getSslConfiguration() == null) ? 0 : getSslConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public App clone() {
        try {
            return (App) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.AppMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
