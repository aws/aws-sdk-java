/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.supportapp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackChannelConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSlackChannelConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The point where pagination should resume when the response returns only partial results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The configurations for a Slack channel.
     * </p>
     */
    private java.util.List<SlackChannelConfiguration> slackChannelConfigurations;

    /**
     * <p>
     * The point where pagination should resume when the response returns only partial results.
     * </p>
     * 
     * @param nextToken
     *        The point where pagination should resume when the response returns only partial results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The point where pagination should resume when the response returns only partial results.
     * </p>
     * 
     * @return The point where pagination should resume when the response returns only partial results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The point where pagination should resume when the response returns only partial results.
     * </p>
     * 
     * @param nextToken
     *        The point where pagination should resume when the response returns only partial results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlackChannelConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The configurations for a Slack channel.
     * </p>
     * 
     * @return The configurations for a Slack channel.
     */

    public java.util.List<SlackChannelConfiguration> getSlackChannelConfigurations() {
        return slackChannelConfigurations;
    }

    /**
     * <p>
     * The configurations for a Slack channel.
     * </p>
     * 
     * @param slackChannelConfigurations
     *        The configurations for a Slack channel.
     */

    public void setSlackChannelConfigurations(java.util.Collection<SlackChannelConfiguration> slackChannelConfigurations) {
        if (slackChannelConfigurations == null) {
            this.slackChannelConfigurations = null;
            return;
        }

        this.slackChannelConfigurations = new java.util.ArrayList<SlackChannelConfiguration>(slackChannelConfigurations);
    }

    /**
     * <p>
     * The configurations for a Slack channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlackChannelConfigurations(java.util.Collection)} or
     * {@link #withSlackChannelConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param slackChannelConfigurations
     *        The configurations for a Slack channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlackChannelConfigurationsResult withSlackChannelConfigurations(SlackChannelConfiguration... slackChannelConfigurations) {
        if (this.slackChannelConfigurations == null) {
            setSlackChannelConfigurations(new java.util.ArrayList<SlackChannelConfiguration>(slackChannelConfigurations.length));
        }
        for (SlackChannelConfiguration ele : slackChannelConfigurations) {
            this.slackChannelConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurations for a Slack channel.
     * </p>
     * 
     * @param slackChannelConfigurations
     *        The configurations for a Slack channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlackChannelConfigurationsResult withSlackChannelConfigurations(java.util.Collection<SlackChannelConfiguration> slackChannelConfigurations) {
        setSlackChannelConfigurations(slackChannelConfigurations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSlackChannelConfigurations() != null)
            sb.append("SlackChannelConfigurations: ").append(getSlackChannelConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSlackChannelConfigurationsResult == false)
            return false;
        ListSlackChannelConfigurationsResult other = (ListSlackChannelConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSlackChannelConfigurations() == null ^ this.getSlackChannelConfigurations() == null)
            return false;
        if (other.getSlackChannelConfigurations() != null && other.getSlackChannelConfigurations().equals(this.getSlackChannelConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSlackChannelConfigurations() == null) ? 0 : getSlackChannelConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListSlackChannelConfigurationsResult clone() {
        try {
            return (ListSlackChannelConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
