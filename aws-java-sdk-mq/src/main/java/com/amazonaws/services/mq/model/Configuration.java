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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about all configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Required. The ARN of the configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Optional. The authentication strategy associated with the configuration. The default is SIMPLE.
     * </p>
     */
    private String authenticationStrategy;
    /**
     * <p>
     * Required. The date and time of the configuration revision.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * Required. The description of the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see, <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Required. The latest revision of the configuration.
     * </p>
     */
    private ConfigurationRevision latestRevision;
    /**
     * <p>
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of all tags associated with this configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Required. The ARN of the configuration.
     * </p>
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Required. The ARN of the configuration.
     * </p>
     * 
     * @return Required. The ARN of the configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Required. The ARN of the configuration.
     * </p>
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public Configuration withAuthenticationStrategy(String authenticationStrategy) {
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

    public Configuration withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Required. The date and time of the configuration revision.
     * </p>
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * Required. The date and time of the configuration revision.
     * </p>
     * 
     * @return Required. The date and time of the configuration revision.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * Required. The date and time of the configuration revision.
     * </p>
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * Required. The description of the configuration.
     * </p>
     * 
     * @param description
     *        Required. The description of the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Required. The description of the configuration.
     * </p>
     * 
     * @return Required. The description of the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Required. The description of the configuration.
     * </p>
     * 
     * @param description
     *        Required. The description of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withDescription(String description) {
        setDescription(description);
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

    public Configuration withEngineType(String engineType) {
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

    public Configuration withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see, <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see, <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see, <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @return Required. The broker engine's version. For a list of supported engine versions, see, <a
     *         href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *         engines</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see, <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see, <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * </p>
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * </p>
     * 
     * @return Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * </p>
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Required. The latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * <p>
     * Required. The latest revision of the configuration.
     * </p>
     * 
     * @return Required. The latest revision of the configuration.
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * <p>
     * Required. The latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
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

    public Configuration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of all tags associated with this configuration.
     * </p>
     * 
     * @return The list of all tags associated with this configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of all tags associated with this configuration.
     * </p>
     * 
     * @param tags
     *        The list of all tags associated with this configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of all tags associated with this configuration.
     * </p>
     * 
     * @param tags
     *        The list of all tags associated with this configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Configuration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Configuration addTagsEntry(String key, String value) {
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

    public Configuration clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAuthenticationStrategy() != null)
            sb.append("AuthenticationStrategy: ").append(getAuthenticationStrategy()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
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

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
