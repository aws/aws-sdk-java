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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoggerDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the definition. */
    private String arn;
    /** The time, in milliseconds since the epoch, when the definition was created. */
    private String creationTimestamp;
    /** The ID of the definition. */
    private String id;
    /** The time, in milliseconds since the epoch, when the definition was last updated. */
    private String lastUpdatedTimestamp;
    /** The latest version of the definition. */
    private String latestVersion;
    /** The ARN of the latest version of the definition. */
    private String latestVersionArn;
    /** The name of the definition. */
    private String name;
    /** The tags for the definition. */
    private java.util.Map<String, String> tags;

    /**
     * The ARN of the definition.
     * 
     * @param arn
     *        The ARN of the definition.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the definition.
     * 
     * @return The ARN of the definition.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the definition.
     * 
     * @param arn
     *        The ARN of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was created.
     * 
     * @param creationTimestamp
     *        The time, in milliseconds since the epoch, when the definition was created.
     */

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was created.
     * 
     * @return The time, in milliseconds since the epoch, when the definition was created.
     */

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was created.
     * 
     * @param creationTimestamp
     *        The time, in milliseconds since the epoch, when the definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withCreationTimestamp(String creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * The ID of the definition.
     * 
     * @param id
     *        The ID of the definition.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the definition.
     * 
     * @return The ID of the definition.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the definition.
     * 
     * @param id
     *        The ID of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was last updated.
     * 
     * @param lastUpdatedTimestamp
     *        The time, in milliseconds since the epoch, when the definition was last updated.
     */

    public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was last updated.
     * 
     * @return The time, in milliseconds since the epoch, when the definition was last updated.
     */

    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the definition was last updated.
     * 
     * @param lastUpdatedTimestamp
     *        The time, in milliseconds since the epoch, when the definition was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * The latest version of the definition.
     * 
     * @param latestVersion
     *        The latest version of the definition.
     */

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * The latest version of the definition.
     * 
     * @return The latest version of the definition.
     */

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * The latest version of the definition.
     * 
     * @param latestVersion
     *        The latest version of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withLatestVersion(String latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * The ARN of the latest version of the definition.
     * 
     * @param latestVersionArn
     *        The ARN of the latest version of the definition.
     */

    public void setLatestVersionArn(String latestVersionArn) {
        this.latestVersionArn = latestVersionArn;
    }

    /**
     * The ARN of the latest version of the definition.
     * 
     * @return The ARN of the latest version of the definition.
     */

    public String getLatestVersionArn() {
        return this.latestVersionArn;
    }

    /**
     * The ARN of the latest version of the definition.
     * 
     * @param latestVersionArn
     *        The ARN of the latest version of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withLatestVersionArn(String latestVersionArn) {
        setLatestVersionArn(latestVersionArn);
        return this;
    }

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the definition.
     * 
     * @return The name of the definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The tags for the definition.
     * 
     * @return The tags for the definition.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags for the definition.
     * 
     * @param tags
     *        The tags for the definition.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags for the definition.
     * 
     * @param tags
     *        The tags for the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public GetLoggerDefinitionResult addTagsEntry(String key, String value) {
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

    public GetLoggerDefinitionResult clearTagsEntries() {
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
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getLatestVersionArn() != null)
            sb.append("LatestVersionArn: ").append(getLatestVersionArn()).append(",");
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

        if (obj instanceof GetLoggerDefinitionResult == false)
            return false;
        GetLoggerDefinitionResult other = (GetLoggerDefinitionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getLatestVersionArn() == null ^ this.getLatestVersionArn() == null)
            return false;
        if (other.getLatestVersionArn() != null && other.getLatestVersionArn().equals(this.getLatestVersionArn()) == false)
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
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionArn() == null) ? 0 : getLatestVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetLoggerDefinitionResult clone() {
        try {
            return (GetLoggerDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
