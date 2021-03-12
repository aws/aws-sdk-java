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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSourceLocationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The access configuration for the source location.
     * </p>
     */
    private AccessConfiguration accessConfiguration;
    /**
     * <p>
     * The ARN of the source location.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp that indicates when the source location was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The default segment delivery configuration settings.
     * </p>
     */
    private DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration;
    /**
     * <p>
     * The HTTP package configuration settings for the source location.
     * </p>
     */
    private HttpConfiguration httpConfiguration;
    /**
     * <p>
     * The timestamp that indicates when the source location was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the source location.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The tags assigned to the source location.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The access configuration for the source location.
     * </p>
     * 
     * @param accessConfiguration
     *        The access configuration for the source location.
     */

    public void setAccessConfiguration(AccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
    }

    /**
     * <p>
     * The access configuration for the source location.
     * </p>
     * 
     * @return The access configuration for the source location.
     */

    public AccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    /**
     * <p>
     * The access configuration for the source location.
     * </p>
     * 
     * @param accessConfiguration
     *        The access configuration for the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withAccessConfiguration(AccessConfiguration accessConfiguration) {
        setAccessConfiguration(accessConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of the source location.
     * </p>
     * 
     * @param arn
     *        The ARN of the source location.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the source location.
     * </p>
     * 
     * @return The ARN of the source location.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the source location.
     * </p>
     * 
     * @param arn
     *        The ARN of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp that indicates when the source location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was created.
     * </p>
     * 
     * @return The timestamp that indicates when the source location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp that indicates when the source location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The default segment delivery configuration settings.
     * </p>
     * 
     * @param defaultSegmentDeliveryConfiguration
     *        The default segment delivery configuration settings.
     */

    public void setDefaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration) {
        this.defaultSegmentDeliveryConfiguration = defaultSegmentDeliveryConfiguration;
    }

    /**
     * <p>
     * The default segment delivery configuration settings.
     * </p>
     * 
     * @return The default segment delivery configuration settings.
     */

    public DefaultSegmentDeliveryConfiguration getDefaultSegmentDeliveryConfiguration() {
        return this.defaultSegmentDeliveryConfiguration;
    }

    /**
     * <p>
     * The default segment delivery configuration settings.
     * </p>
     * 
     * @param defaultSegmentDeliveryConfiguration
     *        The default segment delivery configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withDefaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfiguration defaultSegmentDeliveryConfiguration) {
        setDefaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * The HTTP package configuration settings for the source location.
     * </p>
     * 
     * @param httpConfiguration
     *        The HTTP package configuration settings for the source location.
     */

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    /**
     * <p>
     * The HTTP package configuration settings for the source location.
     * </p>
     * 
     * @return The HTTP package configuration settings for the source location.
     */

    public HttpConfiguration getHttpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * <p>
     * The HTTP package configuration settings for the source location.
     * </p>
     * 
     * @param httpConfiguration
     *        The HTTP package configuration settings for the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withHttpConfiguration(HttpConfiguration httpConfiguration) {
        setHttpConfiguration(httpConfiguration);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp that indicates when the source location was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was last modified.
     * </p>
     * 
     * @return The timestamp that indicates when the source location was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the source location was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp that indicates when the source location was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @return The name of the source location.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the source location.
     * </p>
     * 
     * @return The tags assigned to the source location.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the source location.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the source location.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the source location.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateSourceLocationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSourceLocationResult addTagsEntry(String key, String value) {
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

    public UpdateSourceLocationResult clearTagsEntries() {
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
        if (getAccessConfiguration() != null)
            sb.append("AccessConfiguration: ").append(getAccessConfiguration()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDefaultSegmentDeliveryConfiguration() != null)
            sb.append("DefaultSegmentDeliveryConfiguration: ").append(getDefaultSegmentDeliveryConfiguration()).append(",");
        if (getHttpConfiguration() != null)
            sb.append("HttpConfiguration: ").append(getHttpConfiguration()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
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

        if (obj instanceof UpdateSourceLocationResult == false)
            return false;
        UpdateSourceLocationResult other = (UpdateSourceLocationResult) obj;
        if (other.getAccessConfiguration() == null ^ this.getAccessConfiguration() == null)
            return false;
        if (other.getAccessConfiguration() != null && other.getAccessConfiguration().equals(this.getAccessConfiguration()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDefaultSegmentDeliveryConfiguration() == null ^ this.getDefaultSegmentDeliveryConfiguration() == null)
            return false;
        if (other.getDefaultSegmentDeliveryConfiguration() != null
                && other.getDefaultSegmentDeliveryConfiguration().equals(this.getDefaultSegmentDeliveryConfiguration()) == false)
            return false;
        if (other.getHttpConfiguration() == null ^ this.getHttpConfiguration() == null)
            return false;
        if (other.getHttpConfiguration() != null && other.getHttpConfiguration().equals(this.getHttpConfiguration()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessConfiguration() == null) ? 0 : getAccessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDefaultSegmentDeliveryConfiguration() == null) ? 0 : getDefaultSegmentDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHttpConfiguration() == null) ? 0 : getHttpConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSourceLocationResult clone() {
        try {
            return (UpdateSourceLocationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
