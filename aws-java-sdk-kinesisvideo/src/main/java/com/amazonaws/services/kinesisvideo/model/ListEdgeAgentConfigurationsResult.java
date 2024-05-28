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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListEdgeAgentConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeAgentConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     */
    private java.util.List<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs;
    /**
     * <p>
     * If the response is truncated, the call returns this element with a given token. To get the next batch of edge
     * configurations, use this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * 
     * @return A description of a single stream's edge configuration.
     */

    public java.util.List<ListEdgeAgentConfigurationsEdgeConfig> getEdgeConfigs() {
        return edgeConfigs;
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * 
     * @param edgeConfigs
     *        A description of a single stream's edge configuration.
     */

    public void setEdgeConfigs(java.util.Collection<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs) {
        if (edgeConfigs == null) {
            this.edgeConfigs = null;
            return;
        }

        this.edgeConfigs = new java.util.ArrayList<ListEdgeAgentConfigurationsEdgeConfig>(edgeConfigs);
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdgeConfigs(java.util.Collection)} or {@link #withEdgeConfigs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param edgeConfigs
     *        A description of a single stream's edge configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsResult withEdgeConfigs(ListEdgeAgentConfigurationsEdgeConfig... edgeConfigs) {
        if (this.edgeConfigs == null) {
            setEdgeConfigs(new java.util.ArrayList<ListEdgeAgentConfigurationsEdgeConfig>(edgeConfigs.length));
        }
        for (ListEdgeAgentConfigurationsEdgeConfig ele : edgeConfigs) {
            this.edgeConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of a single stream's edge configuration.
     * </p>
     * 
     * @param edgeConfigs
     *        A description of a single stream's edge configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsResult withEdgeConfigs(java.util.Collection<ListEdgeAgentConfigurationsEdgeConfig> edgeConfigs) {
        setEdgeConfigs(edgeConfigs);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given token. To get the next batch of edge
     * configurations, use this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the call returns this element with a given token. To get the next batch of
     *        edge configurations, use this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given token. To get the next batch of edge
     * configurations, use this token in your next request.
     * </p>
     * 
     * @return If the response is truncated, the call returns this element with a given token. To get the next batch of
     *         edge configurations, use this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a given token. To get the next batch of edge
     * configurations, use this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the call returns this element with a given token. To get the next batch of
     *        edge configurations, use this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgeAgentConfigurationsResult withNextToken(String nextToken) {
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
        if (getEdgeConfigs() != null)
            sb.append("EdgeConfigs: ").append(getEdgeConfigs()).append(",");
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

        if (obj instanceof ListEdgeAgentConfigurationsResult == false)
            return false;
        ListEdgeAgentConfigurationsResult other = (ListEdgeAgentConfigurationsResult) obj;
        if (other.getEdgeConfigs() == null ^ this.getEdgeConfigs() == null)
            return false;
        if (other.getEdgeConfigs() != null && other.getEdgeConfigs().equals(this.getEdgeConfigs()) == false)
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

        hashCode = prime * hashCode + ((getEdgeConfigs() == null) ? 0 : getEdgeConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgeAgentConfigurationsResult clone() {
        try {
            return (ListEdgeAgentConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
