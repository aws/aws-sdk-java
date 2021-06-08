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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVodSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of HTTP package configuration parameters for this VOD source.
     * </p>
     */
    private java.util.List<HttpPackageConfiguration> httpPackageConfigurations;
    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The tags to assign to the VOD source.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier for the VOD source you are working on.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * An array of HTTP package configuration parameters for this VOD source.
     * </p>
     * 
     * @return An array of HTTP package configuration parameters for this VOD source.
     */

    public java.util.List<HttpPackageConfiguration> getHttpPackageConfigurations() {
        return httpPackageConfigurations;
    }

    /**
     * <p>
     * An array of HTTP package configuration parameters for this VOD source.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configuration parameters for this VOD source.
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
     * An array of HTTP package configuration parameters for this VOD source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHttpPackageConfigurations(java.util.Collection)} or
     * {@link #withHttpPackageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configuration parameters for this VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest withHttpPackageConfigurations(HttpPackageConfiguration... httpPackageConfigurations) {
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
     * An array of HTTP package configuration parameters for this VOD source.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configuration parameters for this VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest withHttpPackageConfigurations(java.util.Collection<HttpPackageConfiguration> httpPackageConfigurations) {
        setHttpPackageConfigurations(httpPackageConfigurations);
        return this;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @param sourceLocationName
     *        The identifier for the source location you are working on.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @return The identifier for the source location you are working on.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @param sourceLocationName
     *        The identifier for the source location you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the VOD source.
     * </p>
     * 
     * @return The tags to assign to the VOD source.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the VOD source.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the VOD source.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the VOD source.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateVodSourceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest addTagsEntry(String key, String value) {
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

    public CreateVodSourceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for the VOD source you are working on.
     * </p>
     * 
     * @param vodSourceName
     *        The identifier for the VOD source you are working on.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The identifier for the VOD source you are working on.
     * </p>
     * 
     * @return The identifier for the VOD source you are working on.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The identifier for the VOD source you are working on.
     * </p>
     * 
     * @param vodSourceName
     *        The identifier for the VOD source you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVodSourceRequest withVodSourceName(String vodSourceName) {
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
        if (getHttpPackageConfigurations() != null)
            sb.append("HttpPackageConfigurations: ").append(getHttpPackageConfigurations()).append(",");
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

        if (obj instanceof CreateVodSourceRequest == false)
            return false;
        CreateVodSourceRequest other = (CreateVodSourceRequest) obj;
        if (other.getHttpPackageConfigurations() == null ^ this.getHttpPackageConfigurations() == null)
            return false;
        if (other.getHttpPackageConfigurations() != null && other.getHttpPackageConfigurations().equals(this.getHttpPackageConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getHttpPackageConfigurations() == null) ? 0 : getHttpPackageConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateVodSourceRequest clone() {
        return (CreateVodSourceRequest) super.clone();
    }

}
