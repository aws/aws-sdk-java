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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Suite definition Id of the suite definition.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * The ARN of the suite definition.
     * </p>
     */
    private String suiteDefinitionArn;
    /**
     * <p>
     * Suite definition version of the suite definition.
     * </p>
     */
    private String suiteDefinitionVersion;
    /**
     * <p>
     * Latest suite definition version of the suite definition.
     * </p>
     */
    private String latestVersion;
    /**
     * <p>
     * Suite configuration of the suite definition.
     * </p>
     */
    private SuiteDefinitionConfiguration suiteDefinitionConfiguration;
    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * Tags attached to the suite definition.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Suite definition Id of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the suite definition.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the suite definition.
     * </p>
     * 
     * @return Suite definition Id of the suite definition.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Suite definition Id of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Suite definition Id of the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        The ARN of the suite definition.
     */

    public void setSuiteDefinitionArn(String suiteDefinitionArn) {
        this.suiteDefinitionArn = suiteDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the suite definition.
     * </p>
     * 
     * @return The ARN of the suite definition.
     */

    public String getSuiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionArn
     *        The ARN of the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withSuiteDefinitionArn(String suiteDefinitionArn) {
        setSuiteDefinitionArn(suiteDefinitionArn);
        return this;
    }

    /**
     * <p>
     * Suite definition version of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the suite definition.
     */

    public void setSuiteDefinitionVersion(String suiteDefinitionVersion) {
        this.suiteDefinitionVersion = suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the suite definition.
     * </p>
     * 
     * @return Suite definition version of the suite definition.
     */

    public String getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }

    /**
     * <p>
     * Suite definition version of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionVersion
     *        Suite definition version of the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withSuiteDefinitionVersion(String suiteDefinitionVersion) {
        setSuiteDefinitionVersion(suiteDefinitionVersion);
        return this;
    }

    /**
     * <p>
     * Latest suite definition version of the suite definition.
     * </p>
     * 
     * @param latestVersion
     *        Latest suite definition version of the suite definition.
     */

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * Latest suite definition version of the suite definition.
     * </p>
     * 
     * @return Latest suite definition version of the suite definition.
     */

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * Latest suite definition version of the suite definition.
     * </p>
     * 
     * @param latestVersion
     *        Latest suite definition version of the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withLatestVersion(String latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * Suite configuration of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Suite configuration of the suite definition.
     */

    public void setSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        this.suiteDefinitionConfiguration = suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Suite configuration of the suite definition.
     * </p>
     * 
     * @return Suite configuration of the suite definition.
     */

    public SuiteDefinitionConfiguration getSuiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }

    /**
     * <p>
     * Suite configuration of the suite definition.
     * </p>
     * 
     * @param suiteDefinitionConfiguration
     *        Suite configuration of the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withSuiteDefinitionConfiguration(SuiteDefinitionConfiguration suiteDefinitionConfiguration) {
        setSuiteDefinitionConfiguration(suiteDefinitionConfiguration);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was created.
     * </p>
     * 
     * @param createdAt
     *        Date (in Unix epoch time) when the suite definition was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was created.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the suite definition was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was created.
     * </p>
     * 
     * @param createdAt
     *        Date (in Unix epoch time) when the suite definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        Date (in Unix epoch time) when the suite definition was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was last modified.
     * </p>
     * 
     * @return Date (in Unix epoch time) when the suite definition was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * Date (in Unix epoch time) when the suite definition was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        Date (in Unix epoch time) when the suite definition was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * Tags attached to the suite definition.
     * </p>
     * 
     * @return Tags attached to the suite definition.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the suite definition.
     * </p>
     * 
     * @param tags
     *        Tags attached to the suite definition.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the suite definition.
     * </p>
     * 
     * @param tags
     *        Tags attached to the suite definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSuiteDefinitionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteDefinitionResult addTagsEntry(String key, String value) {
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

    public GetSuiteDefinitionResult clearTagsEntries() {
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteDefinitionArn() != null)
            sb.append("SuiteDefinitionArn: ").append(getSuiteDefinitionArn()).append(",");
        if (getSuiteDefinitionVersion() != null)
            sb.append("SuiteDefinitionVersion: ").append(getSuiteDefinitionVersion()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getSuiteDefinitionConfiguration() != null)
            sb.append("SuiteDefinitionConfiguration: ").append(getSuiteDefinitionConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
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

        if (obj instanceof GetSuiteDefinitionResult == false)
            return false;
        GetSuiteDefinitionResult other = (GetSuiteDefinitionResult) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteDefinitionArn() == null ^ this.getSuiteDefinitionArn() == null)
            return false;
        if (other.getSuiteDefinitionArn() != null && other.getSuiteDefinitionArn().equals(this.getSuiteDefinitionArn()) == false)
            return false;
        if (other.getSuiteDefinitionVersion() == null ^ this.getSuiteDefinitionVersion() == null)
            return false;
        if (other.getSuiteDefinitionVersion() != null && other.getSuiteDefinitionVersion().equals(this.getSuiteDefinitionVersion()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getSuiteDefinitionConfiguration() == null ^ this.getSuiteDefinitionConfiguration() == null)
            return false;
        if (other.getSuiteDefinitionConfiguration() != null && other.getSuiteDefinitionConfiguration().equals(this.getSuiteDefinitionConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
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

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionArn() == null) ? 0 : getSuiteDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionVersion() == null) ? 0 : getSuiteDefinitionVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getSuiteDefinitionConfiguration() == null) ? 0 : getSuiteDefinitionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetSuiteDefinitionResult clone() {
        try {
            return (GetSuiteDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
