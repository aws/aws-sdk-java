/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMediaInsightsPipelineConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The requested list of media insights pipeline configurations.
     * </p>
     */
    private java.util.List<MediaInsightsPipelineConfigurationSummary> mediaInsightsPipelineConfigurations;
    /**
     * <p>
     * The token used to return the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested list of media insights pipeline configurations.
     * </p>
     * 
     * @return The requested list of media insights pipeline configurations.
     */

    public java.util.List<MediaInsightsPipelineConfigurationSummary> getMediaInsightsPipelineConfigurations() {
        return mediaInsightsPipelineConfigurations;
    }

    /**
     * <p>
     * The requested list of media insights pipeline configurations.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurations
     *        The requested list of media insights pipeline configurations.
     */

    public void setMediaInsightsPipelineConfigurations(java.util.Collection<MediaInsightsPipelineConfigurationSummary> mediaInsightsPipelineConfigurations) {
        if (mediaInsightsPipelineConfigurations == null) {
            this.mediaInsightsPipelineConfigurations = null;
            return;
        }

        this.mediaInsightsPipelineConfigurations = new java.util.ArrayList<MediaInsightsPipelineConfigurationSummary>(mediaInsightsPipelineConfigurations);
    }

    /**
     * <p>
     * The requested list of media insights pipeline configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaInsightsPipelineConfigurations(java.util.Collection)} or
     * {@link #withMediaInsightsPipelineConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurations
     *        The requested list of media insights pipeline configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaInsightsPipelineConfigurationsResult withMediaInsightsPipelineConfigurations(
            MediaInsightsPipelineConfigurationSummary... mediaInsightsPipelineConfigurations) {
        if (this.mediaInsightsPipelineConfigurations == null) {
            setMediaInsightsPipelineConfigurations(new java.util.ArrayList<MediaInsightsPipelineConfigurationSummary>(
                    mediaInsightsPipelineConfigurations.length));
        }
        for (MediaInsightsPipelineConfigurationSummary ele : mediaInsightsPipelineConfigurations) {
            this.mediaInsightsPipelineConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested list of media insights pipeline configurations.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurations
     *        The requested list of media insights pipeline configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaInsightsPipelineConfigurationsResult withMediaInsightsPipelineConfigurations(
            java.util.Collection<MediaInsightsPipelineConfigurationSummary> mediaInsightsPipelineConfigurations) {
        setMediaInsightsPipelineConfigurations(mediaInsightsPipelineConfigurations);
        return this;
    }

    /**
     * <p>
     * The token used to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to return the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to return the next page of results.
     * </p>
     * 
     * @return The token used to return the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to return the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to return the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaInsightsPipelineConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMediaInsightsPipelineConfigurations() != null)
            sb.append("MediaInsightsPipelineConfigurations: ").append(getMediaInsightsPipelineConfigurations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMediaInsightsPipelineConfigurationsResult == false)
            return false;
        ListMediaInsightsPipelineConfigurationsResult other = (ListMediaInsightsPipelineConfigurationsResult) obj;
        if (other.getMediaInsightsPipelineConfigurations() == null ^ this.getMediaInsightsPipelineConfigurations() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurations() != null
                && other.getMediaInsightsPipelineConfigurations().equals(this.getMediaInsightsPipelineConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurations() == null) ? 0 : getMediaInsightsPipelineConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMediaInsightsPipelineConfigurationsResult clone() {
        try {
            return (ListMediaInsightsPipelineConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
