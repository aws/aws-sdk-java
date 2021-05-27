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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputRoutings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputRoutingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the routed resources.
     * </p>
     */
    private java.util.List<RoutedResource> routedResources;
    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the routed resources.
     * </p>
     * 
     * @return Summary information about the routed resources.
     */

    public java.util.List<RoutedResource> getRoutedResources() {
        return routedResources;
    }

    /**
     * <p>
     * Summary information about the routed resources.
     * </p>
     * 
     * @param routedResources
     *        Summary information about the routed resources.
     */

    public void setRoutedResources(java.util.Collection<RoutedResource> routedResources) {
        if (routedResources == null) {
            this.routedResources = null;
            return;
        }

        this.routedResources = new java.util.ArrayList<RoutedResource>(routedResources);
    }

    /**
     * <p>
     * Summary information about the routed resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutedResources(java.util.Collection)} or {@link #withRoutedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param routedResources
     *        Summary information about the routed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsResult withRoutedResources(RoutedResource... routedResources) {
        if (this.routedResources == null) {
            setRoutedResources(new java.util.ArrayList<RoutedResource>(routedResources.length));
        }
        for (RoutedResource ele : routedResources) {
            this.routedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the routed resources.
     * </p>
     * 
     * @param routedResources
     *        Summary information about the routed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsResult withRoutedResources(java.util.Collection<RoutedResource> routedResources) {
        setRoutedResources(routedResources);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputRoutingsResult withNextToken(String nextToken) {
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
        if (getRoutedResources() != null)
            sb.append("RoutedResources: ").append(getRoutedResources()).append(",");
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

        if (obj instanceof ListInputRoutingsResult == false)
            return false;
        ListInputRoutingsResult other = (ListInputRoutingsResult) obj;
        if (other.getRoutedResources() == null ^ this.getRoutedResources() == null)
            return false;
        if (other.getRoutedResources() != null && other.getRoutedResources().equals(this.getRoutedResources()) == false)
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

        hashCode = prime * hashCode + ((getRoutedResources() == null) ? 0 : getRoutedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputRoutingsResult clone() {
        try {
            return (ListInputRoutingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
