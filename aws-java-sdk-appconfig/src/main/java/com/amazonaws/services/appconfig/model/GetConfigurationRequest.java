/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application to get. Specify either the application name or the application ID.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The environment to get. Specify either the environment name or the environment ID.
     * </p>
     */
    private String environment;
    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the configuration ID.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration
     * in intervals, as defined in the deployment strategy.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The configuration version returned in the most recent <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each call
     * to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged each time your
     * clients receive a configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value with
     * every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent calls to
     * <code>GetConfiguration</code> must pass this value by using the <code>ClientConfigurationVersion</code>
     * parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     */
    private String clientConfigurationVersion;

    /**
     * <p>
     * The application to get. Specify either the application name or the application ID.
     * </p>
     * 
     * @param application
     *        The application to get. Specify either the application name or the application ID.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application to get. Specify either the application name or the application ID.
     * </p>
     * 
     * @return The application to get. Specify either the application name or the application ID.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application to get. Specify either the application name or the application ID.
     * </p>
     * 
     * @param application
     *        The application to get. Specify either the application name or the application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the environment ID.
     * </p>
     * 
     * @param environment
     *        The environment to get. Specify either the environment name or the environment ID.
     */

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the environment ID.
     * </p>
     * 
     * @return The environment to get. Specify either the environment name or the environment ID.
     */

    public String getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the environment ID.
     * </p>
     * 
     * @param environment
     *        The environment to get. Specify either the environment name or the environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationRequest withEnvironment(String environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the configuration ID.
     * </p>
     * 
     * @param configuration
     *        The configuration to get. Specify either the configuration name or the configuration ID.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the configuration ID.
     * </p>
     * 
     * @return The configuration to get. Specify either the configuration name or the configuration ID.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the configuration ID.
     * </p>
     * 
     * @param configuration
     *        The configuration to get. Specify either the configuration name or the configuration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationRequest withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration
     * in intervals, as defined in the deployment strategy.
     * </p>
     * 
     * @param clientId
     *        A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the
     *        configuration in intervals, as defined in the deployment strategy.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration
     * in intervals, as defined in the deployment strategy.
     * </p>
     * 
     * @return A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the
     *         configuration in intervals, as defined in the deployment strategy.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration
     * in intervals, as defined in the deployment strategy.
     * </p>
     * 
     * @param clientId
     *        A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the
     *        configuration in intervals, as defined in the deployment strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The configuration version returned in the most recent <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each call
     * to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged each time your
     * clients receive a configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value with
     * every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent calls to
     * <code>GetConfiguration</code> must pass this value by using the <code>ClientConfigurationVersion</code>
     * parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * 
     * @param clientConfigurationVersion
     *        The configuration version returned in the most recent <code>GetConfiguration</code> response.</p>
     *        <important>
     *        <p>
     *        AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     *        configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each
     *        call to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged
     *        each time your clients receive a configuration.
     *        </p>
     *        <p>
     *        To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value
     *        with every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent
     *        calls to <code>GetConfiguration</code> must pass this value by using the
     *        <code>ClientConfigurationVersion</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        For more information about working with configurations, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *        >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     */

    public void setClientConfigurationVersion(String clientConfigurationVersion) {
        this.clientConfigurationVersion = clientConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version returned in the most recent <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each call
     * to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged each time your
     * clients receive a configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value with
     * every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent calls to
     * <code>GetConfiguration</code> must pass this value by using the <code>ClientConfigurationVersion</code>
     * parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * 
     * @return The configuration version returned in the most recent <code>GetConfiguration</code> response.</p>
     *         <important>
     *         <p>
     *         AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     *         configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with
     *         each call to <code>GetConfiguration</code>, your clients receive the current configuration. You are
     *         charged each time your clients receive a configuration.
     *         </p>
     *         <p>
     *         To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value
     *         with every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent
     *         calls to <code>GetConfiguration</code> must pass this value by using the
     *         <code>ClientConfigurationVersion</code> parameter.
     *         </p>
     *         </important>
     *         <p>
     *         For more information about working with configurations, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *         >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     */

    public String getClientConfigurationVersion() {
        return this.clientConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version returned in the most recent <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each call
     * to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged each time your
     * clients receive a configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value with
     * every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent calls to
     * <code>GetConfiguration</code> must pass this value by using the <code>ClientConfigurationVersion</code>
     * parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * 
     * @param clientConfigurationVersion
     *        The configuration version returned in the most recent <code>GetConfiguration</code> response.</p>
     *        <important>
     *        <p>
     *        AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code> parameter to identify the
     *        configuration version on your clients. If you don’t send <code>ClientConfigurationVersion</code> with each
     *        call to <code>GetConfiguration</code>, your clients receive the current configuration. You are charged
     *        each time your clients receive a configuration.
     *        </p>
     *        <p>
     *        To avoid excess charges, we recommend that you include the <code>ClientConfigurationVersion</code> value
     *        with every call to <code>GetConfiguration</code>. This value must be saved on your client. Subsequent
     *        calls to <code>GetConfiguration</code> must pass this value by using the
     *        <code>ClientConfigurationVersion</code> parameter.
     *        </p>
     *        </important>
     *        <p>
     *        For more information about working with configurations, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *        >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationRequest withClientConfigurationVersion(String clientConfigurationVersion) {
        setClientConfigurationVersion(clientConfigurationVersion);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientConfigurationVersion() != null)
            sb.append("ClientConfigurationVersion: ").append(getClientConfigurationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationRequest == false)
            return false;
        GetConfigurationRequest other = (GetConfigurationRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientConfigurationVersion() == null ^ this.getClientConfigurationVersion() == null)
            return false;
        if (other.getClientConfigurationVersion() != null && other.getClientConfigurationVersion().equals(this.getClientConfigurationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientConfigurationVersion() == null) ? 0 : getClientConfigurationVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationRequest clone() {
        return (GetConfigurationRequest) super.clone();
    }

}
