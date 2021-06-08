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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVodSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the VOD source.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp that indicates when the VOD source was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The HTTP package configurations.
     * </p>
     */
    private java.util.List<HttpPackageConfiguration> httpPackageConfigurations;
    /**
     * <p>
     * The ARN for the VOD source.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the source location associated with the VOD source.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The tags assigned to the VOD source.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name of the VOD source.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The ARN of the VOD source.
     * </p>
     * 
     * @param arn
     *        The ARN of the VOD source.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the VOD source.
     * </p>
     * 
     * @return The ARN of the VOD source.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the VOD source.
     * </p>
     * 
     * @param arn
     *        The ARN of the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates when the VOD source was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp that indicates when the VOD source was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the VOD source was created.
     * </p>
     * 
     * @return The timestamp that indicates when the VOD source was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the VOD source was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp that indicates when the VOD source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The HTTP package configurations.
     * </p>
     * 
     * @return The HTTP package configurations.
     */

    public java.util.List<HttpPackageConfiguration> getHttpPackageConfigurations() {
        return httpPackageConfigurations;
    }

    /**
     * <p>
     * The HTTP package configurations.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        The HTTP package configurations.
     */

    public void setHttpPackageConfigurations(java.util.Collection<HttpPackageConfiguration> httpPackageConfigurations) {
        if (httpPackageConfigurations == null) {
            this.httpPackageConfigurations = null;
            return;
        }

        this.httpPackageConfigurations = new java.util.ArrayList<HttpPackageConfiguration>(httpPackageConfigurations);
    }

    /**
     * <p>
     * The HTTP package configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHttpPackageConfigurations(java.util.Collection)} or
     * {@link #withHttpPackageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        The HTTP package configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withHttpPackageConfigurations(HttpPackageConfiguration... httpPackageConfigurations) {
        if (this.httpPackageConfigurations == null) {
            setHttpPackageConfigurations(new java.util.ArrayList<HttpPackageConfiguration>(httpPackageConfigurations.length));
        }
        for (HttpPackageConfiguration ele : httpPackageConfigurations) {
            this.httpPackageConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP package configurations.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        The HTTP package configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withHttpPackageConfigurations(java.util.Collection<HttpPackageConfiguration> httpPackageConfigurations) {
        setHttpPackageConfigurations(httpPackageConfigurations);
        return this;
    }

    /**
     * <p>
     * The ARN for the VOD source.
     * </p>
     * 
     * @param lastModifiedTime
     *        The ARN for the VOD source.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The ARN for the VOD source.
     * </p>
     * 
     * @return The ARN for the VOD source.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The ARN for the VOD source.
     * </p>
     * 
     * @param lastModifiedTime
     *        The ARN for the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The name of the source location associated with the VOD source.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location associated with the VOD source.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location associated with the VOD source.
     * </p>
     * 
     * @return The name of the source location associated with the VOD source.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location associated with the VOD source.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location associated with the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the VOD source.
     * </p>
     * 
     * @return The tags assigned to the VOD source.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the VOD source.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the VOD source.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the VOD source.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateVodSourceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult addTagsEntry(String key, String value) {
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

    public CreateVodSourceResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @return The name of the VOD source.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceResult withVodSourceName(String vodSourceName) {
        setVodSourceName(vodSourceName);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getHttpPackageConfigurations() != null)
            sb.append("HttpPackageConfigurations: ").append(getHttpPackageConfigurations()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVodSourceName() != null)
            sb.append("VodSourceName: ").append(getVodSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVodSourceResult == false)
            return false;
        CreateVodSourceResult other = (CreateVodSourceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getHttpPackageConfigurations() == null ^ this.getHttpPackageConfigurations() == null)
            return false;
        if (other.getHttpPackageConfigurations() != null && other.getHttpPackageConfigurations().equals(this.getHttpPackageConfigurations()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVodSourceName() == null ^ this.getVodSourceName() == null)
            return false;
        if (other.getVodSourceName() != null && other.getVodSourceName().equals(this.getVodSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getHttpPackageConfigurations() == null) ? 0 : getHttpPackageConfigurations().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateVodSourceResult clone() {
        try {
            return (CreateVodSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
