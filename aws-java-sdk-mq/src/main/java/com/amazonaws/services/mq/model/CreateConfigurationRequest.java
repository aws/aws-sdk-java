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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
 * engine type and version).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ. */
    private String engineType;
    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String engineVersion;
    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */
    private String name;
    /** Create tags when creating the configuration. */
    private java.util.Map<String, String> tags;

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @return Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateConfigurationRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateConfigurationRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        Required. The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @return Required. The version of the broker engine. For a list of supported engine versions, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        Required. The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @param name
     *        Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     * 
     * @return Required. The name of the configuration. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
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
     * Create tags when creating the configuration.
     * 
     * @return Create tags when creating the configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * Create tags when creating the configuration.
     * 
     * @param tags
     *        Create tags when creating the configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Create tags when creating the configuration.
     * 
     * @param tags
     *        Create tags when creating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

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
