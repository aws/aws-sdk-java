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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
 * engine type and version).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     */
    private String authenticationStrategy;
    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Create tags when creating the configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * @see AuthenticationStrategy
     */

    public void setAuthenticationStrategy(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     * 
     * @return Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * @see AuthenticationStrategy
     */

    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }

    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateConfigurationRequest withAuthenticationStrategy(String authenticationStrategy) {
        setAuthenticationStrategy(authenticationStrategy);
        return this;
    }

    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateConfigurationRequest withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @return Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateConfigurationRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateConfigurationRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @return Required. The broker engine's version. For a list of supported engine versions, see <a
     *         href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *         engines</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * </p>
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * </p>
     * 
     * @return Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * </p>
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Create tags when creating the configuration.
     * </p>
     * 
     * @return Create tags when creating the configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags when creating the configuration.
     * </p>
     * 
     * @param tags
     *        Create tags when creating the configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Create tags when creating the configuration.
     * </p>
     * 
     * @param tags
     *        Create tags when creating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest addTagsEntry(String key, String value) {
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

    public CreateConfigurationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAuthenticationStrategy() != null)
            sb.append("AuthenticationStrategy: ").append(getAuthenticationStrategy()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationRequest == false)
            return false;
        CreateConfigurationRequest other = (CreateConfigurationRequest) obj;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationRequest clone() {
        return (CreateConfigurationRequest) super.clone();
    }

}
