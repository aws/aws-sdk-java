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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateVodSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVodSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of HTTP package configurations for the VOD source on this account.
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
     * The identifier for the VOD source you are working on.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * An array of HTTP package configurations for the VOD source on this account.
     * </p>
     * 
     * @return An array of HTTP package configurations for the VOD source on this account.
     */

    public java.util.List<HttpPackageConfiguration> getHttpPackageConfigurations() {
        return httpPackageConfigurations;
    }

    /**
     * <p>
     * An array of HTTP package configurations for the VOD source on this account.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configurations for the VOD source on this account.
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
     * An array of HTTP package configurations for the VOD source on this account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHttpPackageConfigurations(java.util.Collection)} or
     * {@link #withHttpPackageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configurations for the VOD source on this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVodSourceRequest withHttpPackageConfigurations(HttpPackageConfiguration... httpPackageConfigurations) {
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
     * An array of HTTP package configurations for the VOD source on this account.
     * </p>
     * 
     * @param httpPackageConfigurations
     *        An array of HTTP package configurations for the VOD source on this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVodSourceRequest withHttpPackageConfigurations(java.util.Collection<HttpPackageConfiguration> httpPackageConfigurations) {
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

    public UpdateVodSourceRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
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

    public UpdateVodSourceRequest withVodSourceName(String vodSourceName) {
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

        if (obj instanceof UpdateVodSourceRequest == false)
            return false;
        UpdateVodSourceRequest other = (UpdateVodSourceRequest) obj;
        if (other.getHttpPackageConfigurations() == null ^ this.getHttpPackageConfigurations() == null)
            return false;
        if (other.getHttpPackageConfigurations() != null && other.getHttpPackageConfigurations().equals(this.getHttpPackageConfigurations()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
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
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVodSourceRequest clone() {
        return (UpdateVodSourceRequest) super.clone();
    }

}
