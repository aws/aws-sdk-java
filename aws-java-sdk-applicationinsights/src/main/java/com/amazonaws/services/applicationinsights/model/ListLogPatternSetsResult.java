/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatternSets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogPatternSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The list of log pattern sets.
     * </p>
     */
    private java.util.List<String> logPatternSets;
    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogPatternSetsResult withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The list of log pattern sets.
     * </p>
     * 
     * @return The list of log pattern sets.
     */

    public java.util.List<String> getLogPatternSets() {
        return logPatternSets;
    }

    /**
     * <p>
     * The list of log pattern sets.
     * </p>
     * 
     * @param logPatternSets
     *        The list of log pattern sets.
     */

    public void setLogPatternSets(java.util.Collection<String> logPatternSets) {
        if (logPatternSets == null) {
            this.logPatternSets = null;
            return;
        }

        this.logPatternSets = new java.util.ArrayList<String>(logPatternSets);
    }

    /**
     * <p>
     * The list of log pattern sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogPatternSets(java.util.Collection)} or {@link #withLogPatternSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logPatternSets
     *        The list of log pattern sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogPatternSetsResult withLogPatternSets(String... logPatternSets) {
        if (this.logPatternSets == null) {
            setLogPatternSets(new java.util.ArrayList<String>(logPatternSets.length));
        }
        for (String ele : logPatternSets) {
            this.logPatternSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log pattern sets.
     * </p>
     * 
     * @param logPatternSets
     *        The list of log pattern sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogPatternSetsResult withLogPatternSets(java.util.Collection<String> logPatternSets) {
        setLogPatternSets(logPatternSets);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogPatternSetsResult withNextToken(String nextToken) {
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getLogPatternSets() != null)
            sb.append("LogPatternSets: ").append(getLogPatternSets()).append(",");
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

        if (obj instanceof ListLogPatternSetsResult == false)
            return false;
        ListLogPatternSetsResult other = (ListLogPatternSetsResult) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getLogPatternSets() == null ^ this.getLogPatternSets() == null)
            return false;
        if (other.getLogPatternSets() != null && other.getLogPatternSets().equals(this.getLogPatternSets()) == false)
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

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogPatternSets() == null) ? 0 : getLogPatternSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLogPatternSetsResult clone() {
        try {
            return (ListLogPatternSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
