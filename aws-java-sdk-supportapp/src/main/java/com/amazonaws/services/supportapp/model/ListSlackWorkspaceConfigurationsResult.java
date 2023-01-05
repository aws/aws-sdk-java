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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackWorkspaceConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSlackWorkspaceConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The point where pagination should resume when the response returns only partial results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The configurations for a Slack workspace.
     * </p>
     */
    private java.util.List<SlackWorkspaceConfiguration> slackWorkspaceConfigurations;

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

    public ListSlackWorkspaceConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The configurations for a Slack workspace.
     * </p>
     * 
     * @return The configurations for a Slack workspace.
     */

    public java.util.List<SlackWorkspaceConfiguration> getSlackWorkspaceConfigurations() {
        return slackWorkspaceConfigurations;
    }

    /**
     * <p>
     * The configurations for a Slack workspace.
     * </p>
     * 
     * @param slackWorkspaceConfigurations
     *        The configurations for a Slack workspace.
     */

    public void setSlackWorkspaceConfigurations(java.util.Collection<SlackWorkspaceConfiguration> slackWorkspaceConfigurations) {
        if (slackWorkspaceConfigurations == null) {
            this.slackWorkspaceConfigurations = null;
            return;
        }

        this.slackWorkspaceConfigurations = new java.util.ArrayList<SlackWorkspaceConfiguration>(slackWorkspaceConfigurations);
    }

    /**
     * <p>
     * The configurations for a Slack workspace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlackWorkspaceConfigurations(java.util.Collection)} or
     * {@link #withSlackWorkspaceConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param slackWorkspaceConfigurations
     *        The configurations for a Slack workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlackWorkspaceConfigurationsResult withSlackWorkspaceConfigurations(SlackWorkspaceConfiguration... slackWorkspaceConfigurations) {
        if (this.slackWorkspaceConfigurations == null) {
            setSlackWorkspaceConfigurations(new java.util.ArrayList<SlackWorkspaceConfiguration>(slackWorkspaceConfigurations.length));
        }
        for (SlackWorkspaceConfiguration ele : slackWorkspaceConfigurations) {
            this.slackWorkspaceConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurations for a Slack workspace.
     * </p>
     * 
     * @param slackWorkspaceConfigurations
     *        The configurations for a Slack workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlackWorkspaceConfigurationsResult withSlackWorkspaceConfigurations(
            java.util.Collection<SlackWorkspaceConfiguration> slackWorkspaceConfigurations) {
        setSlackWorkspaceConfigurations(slackWorkspaceConfigurations);
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
        if (getSlackWorkspaceConfigurations() != null)
            sb.append("SlackWorkspaceConfigurations: ").append(getSlackWorkspaceConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSlackWorkspaceConfigurationsResult == false)
            return false;
        ListSlackWorkspaceConfigurationsResult other = (ListSlackWorkspaceConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSlackWorkspaceConfigurations() == null ^ this.getSlackWorkspaceConfigurations() == null)
            return false;
        if (other.getSlackWorkspaceConfigurations() != null && other.getSlackWorkspaceConfigurations().equals(this.getSlackWorkspaceConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSlackWorkspaceConfigurations() == null) ? 0 : getSlackWorkspaceConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListSlackWorkspaceConfigurationsResult clone() {
        try {
            return (ListSlackWorkspaceConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
