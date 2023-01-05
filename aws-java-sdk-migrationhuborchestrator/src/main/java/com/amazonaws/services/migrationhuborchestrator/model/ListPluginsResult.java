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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListPlugins"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPluginsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Migration Hub Orchestrator plugins.
     * </p>
     */
    private java.util.List<PluginSummary> plugins;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPluginsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @return Migration Hub Orchestrator plugins.
     */

    public java.util.List<PluginSummary> getPlugins() {
        return plugins;
    }

    /**
     * <p>
     * Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param plugins
     *        Migration Hub Orchestrator plugins.
     */

    public void setPlugins(java.util.Collection<PluginSummary> plugins) {
        if (plugins == null) {
            this.plugins = null;
            return;
        }

        this.plugins = new java.util.ArrayList<PluginSummary>(plugins);
    }

    /**
     * <p>
     * Migration Hub Orchestrator plugins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlugins(java.util.Collection)} or {@link #withPlugins(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param plugins
     *        Migration Hub Orchestrator plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPluginsResult withPlugins(PluginSummary... plugins) {
        if (this.plugins == null) {
            setPlugins(new java.util.ArrayList<PluginSummary>(plugins.length));
        }
        for (PluginSummary ele : plugins) {
            this.plugins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param plugins
     *        Migration Hub Orchestrator plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPluginsResult withPlugins(java.util.Collection<PluginSummary> plugins) {
        setPlugins(plugins);
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
        if (getPlugins() != null)
            sb.append("Plugins: ").append(getPlugins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPluginsResult == false)
            return false;
        ListPluginsResult other = (ListPluginsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPlugins() == null ^ this.getPlugins() == null)
            return false;
        if (other.getPlugins() != null && other.getPlugins().equals(this.getPlugins()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPlugins() == null) ? 0 : getPlugins().hashCode());
        return hashCode;
    }

    @Override
    public ListPluginsResult clone() {
        try {
            return (ListPluginsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
