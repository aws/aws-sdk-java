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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListCustomPlugins" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomPluginsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of custom plugin descriptions.
     * </p>
     */
    private java.util.List<CustomPluginSummary> customPlugins;
    /**
     * <p>
     * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken
     * in a subsequent request to continue listing from where the previous operation left off.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of custom plugin descriptions.
     * </p>
     * 
     * @return An array of custom plugin descriptions.
     */

    public java.util.List<CustomPluginSummary> getCustomPlugins() {
        return customPlugins;
    }

    /**
     * <p>
     * An array of custom plugin descriptions.
     * </p>
     * 
     * @param customPlugins
     *        An array of custom plugin descriptions.
     */

    public void setCustomPlugins(java.util.Collection<CustomPluginSummary> customPlugins) {
        if (customPlugins == null) {
            this.customPlugins = null;
            return;
        }

        this.customPlugins = new java.util.ArrayList<CustomPluginSummary>(customPlugins);
    }

    /**
     * <p>
     * An array of custom plugin descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomPlugins(java.util.Collection)} or {@link #withCustomPlugins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customPlugins
     *        An array of custom plugin descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomPluginsResult withCustomPlugins(CustomPluginSummary... customPlugins) {
        if (this.customPlugins == null) {
            setCustomPlugins(new java.util.ArrayList<CustomPluginSummary>(customPlugins.length));
        }
        for (CustomPluginSummary ele : customPlugins) {
            this.customPlugins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom plugin descriptions.
     * </p>
     * 
     * @param customPlugins
     *        An array of custom plugin descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomPluginsResult withCustomPlugins(java.util.Collection<CustomPluginSummary> customPlugins) {
        setCustomPlugins(customPlugins);
        return this;
    }

    /**
     * <p>
     * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken
     * in a subsequent request to continue listing from where the previous operation left off.
     * </p>
     * 
     * @param nextToken
     *        If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this
     *        NextToken in a subsequent request to continue listing from where the previous operation left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken
     * in a subsequent request to continue listing from where the previous operation left off.
     * </p>
     * 
     * @return If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this
     *         NextToken in a subsequent request to continue listing from where the previous operation left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken
     * in a subsequent request to continue listing from where the previous operation left off.
     * </p>
     * 
     * @param nextToken
     *        If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this
     *        NextToken in a subsequent request to continue listing from where the previous operation left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomPluginsResult withNextToken(String nextToken) {
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
        if (getCustomPlugins() != null)
            sb.append("CustomPlugins: ").append(getCustomPlugins()).append(",");
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

        if (obj instanceof ListCustomPluginsResult == false)
            return false;
        ListCustomPluginsResult other = (ListCustomPluginsResult) obj;
        if (other.getCustomPlugins() == null ^ this.getCustomPlugins() == null)
            return false;
        if (other.getCustomPlugins() != null && other.getCustomPlugins().equals(this.getCustomPlugins()) == false)
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

        hashCode = prime * hashCode + ((getCustomPlugins() == null) ? 0 : getCustomPlugins().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomPluginsResult clone() {
        try {
            return (ListCustomPluginsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
