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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Required. The ARN of the configuration. */
    private String arn;
    /** Required. The date and time of the configuration revision. */
    private java.util.Date created;
    /** Required. The description of the configuration. */
    private String description;
    /** Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ. */
    private String engineType;
    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String engineVersion;
    /** Required. The unique ID that Amazon MQ generates for the configuration. */
    private String id;
    /** Required. The latest revision of the configuration. */
    private ConfigurationRevision latestRevision;
    /**
     * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
     */
    private String name;
    /** The list of all tags associated with this configuration. */
    private java.util.Map<String, String> tags;

    /**
     * Required. The ARN of the configuration.
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Required. The ARN of the configuration.
     * 
     * @return Required. The ARN of the configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Required. The ARN of the configuration.
     * 
     * @param arn
     *        Required. The ARN of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @return Required. The date and time of the configuration revision.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @param description
     *        Required. The description of the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @return Required. The description of the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Required. The description of the configuration.
     * 
     * @param description
     *        Required. The description of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

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

    public DescribeConfigurationResult withEngineType(String engineType) {
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

    public DescribeConfigurationResult withEngineType(EngineType engineType) {
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

    public DescribeConfigurationResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param id
     *        Required. The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @return Required. The latest revision of the configuration.
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * Required. The latest revision of the configuration.
     * 
     * @param latestRevision
     *        Required. The latest revision of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
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

    public DescribeConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The list of all tags associated with this configuration.
     * 
     * @return The list of all tags associated with this configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The list of all tags associated with this configuration.
     * 
     * @param tags
     *        The list of all tags associated with this configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The list of all tags associated with this configuration.
     * 
     * @param tags
     *        The list of all tags associated with this configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public DescribeConfigurationResult addTagsEntry(String key, String value) {
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

    public DescribeConfigurationResult clearTagsEntries() {
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

        if (obj instanceof DescribeConfigurationResult == false)
            return false;
        DescribeConfigurationResult other = (DescribeConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
    public DescribeConfigurationResult clone() {
        try {
            return (DescribeConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
