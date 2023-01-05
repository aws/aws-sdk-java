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
package com.amazonaws.services.appconfigdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartConfigurationSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID or the application name.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * The environment ID or the environment name.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The configuration profile ID or the configuration profile name.
     * </p>
     */
    private String configurationProfileIdentifier;
    /**
     * <p>
     * Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     * established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     * </p>
     */
    private Integer requiredMinimumPollIntervalInSeconds;

    /**
     * <p>
     * The application ID or the application name.
     * </p>
     * 
     * @param applicationIdentifier
     *        The application ID or the application name.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The application ID or the application name.
     * </p>
     * 
     * @return The application ID or the application name.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The application ID or the application name.
     * </p>
     * 
     * @param applicationIdentifier
     *        The application ID or the application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationSessionRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * The environment ID or the environment name.
     * </p>
     * 
     * @param environmentIdentifier
     *        The environment ID or the environment name.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The environment ID or the environment name.
     * </p>
     * 
     * @return The environment ID or the environment name.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The environment ID or the environment name.
     * </p>
     * 
     * @param environmentIdentifier
     *        The environment ID or the environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationSessionRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The configuration profile ID or the configuration profile name.
     * </p>
     * 
     * @param configurationProfileIdentifier
     *        The configuration profile ID or the configuration profile name.
     */

    public void setConfigurationProfileIdentifier(String configurationProfileIdentifier) {
        this.configurationProfileIdentifier = configurationProfileIdentifier;
    }

    /**
     * <p>
     * The configuration profile ID or the configuration profile name.
     * </p>
     * 
     * @return The configuration profile ID or the configuration profile name.
     */

    public String getConfigurationProfileIdentifier() {
        return this.configurationProfileIdentifier;
    }

    /**
     * <p>
     * The configuration profile ID or the configuration profile name.
     * </p>
     * 
     * @param configurationProfileIdentifier
     *        The configuration profile ID or the configuration profile name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationSessionRequest withConfigurationProfileIdentifier(String configurationProfileIdentifier) {
        setConfigurationProfileIdentifier(configurationProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     * established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     * </p>
     * 
     * @param requiredMinimumPollIntervalInSeconds
     *        Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     *        established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     */

    public void setRequiredMinimumPollIntervalInSeconds(Integer requiredMinimumPollIntervalInSeconds) {
        this.requiredMinimumPollIntervalInSeconds = requiredMinimumPollIntervalInSeconds;
    }

    /**
     * <p>
     * Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     * established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     * </p>
     * 
     * @return Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     *         established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     */

    public Integer getRequiredMinimumPollIntervalInSeconds() {
        return this.requiredMinimumPollIntervalInSeconds;
    }

    /**
     * <p>
     * Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     * established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     * </p>
     * 
     * @param requiredMinimumPollIntervalInSeconds
     *        Sets a constraint on a session. If you specify a value of, for example, 60 seconds, then the client that
     *        established the session can't call <a>GetLatestConfiguration</a> more frequently then every 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationSessionRequest withRequiredMinimumPollIntervalInSeconds(Integer requiredMinimumPollIntervalInSeconds) {
        setRequiredMinimumPollIntervalInSeconds(requiredMinimumPollIntervalInSeconds);
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
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getConfigurationProfileIdentifier() != null)
            sb.append("ConfigurationProfileIdentifier: ").append(getConfigurationProfileIdentifier()).append(",");
        if (getRequiredMinimumPollIntervalInSeconds() != null)
            sb.append("RequiredMinimumPollIntervalInSeconds: ").append(getRequiredMinimumPollIntervalInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartConfigurationSessionRequest == false)
            return false;
        StartConfigurationSessionRequest other = (StartConfigurationSessionRequest) obj;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getConfigurationProfileIdentifier() == null ^ this.getConfigurationProfileIdentifier() == null)
            return false;
        if (other.getConfigurationProfileIdentifier() != null
                && other.getConfigurationProfileIdentifier().equals(this.getConfigurationProfileIdentifier()) == false)
            return false;
        if (other.getRequiredMinimumPollIntervalInSeconds() == null ^ this.getRequiredMinimumPollIntervalInSeconds() == null)
            return false;
        if (other.getRequiredMinimumPollIntervalInSeconds() != null
                && other.getRequiredMinimumPollIntervalInSeconds().equals(this.getRequiredMinimumPollIntervalInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileIdentifier() == null) ? 0 : getConfigurationProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRequiredMinimumPollIntervalInSeconds() == null) ? 0 : getRequiredMinimumPollIntervalInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public StartConfigurationSessionRequest clone() {
        return (StartConfigurationSessionRequest) super.clone();
    }

}
