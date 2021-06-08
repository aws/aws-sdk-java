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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each component.
     * </p>
     */
    private java.util.List<Component> components;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each component.
     * </p>
     * 
     * @return A list that summarizes each component.
     */

    public java.util.List<Component> getComponents() {
        return components;
    }

    /**
     * <p>
     * A list that summarizes each component.
     * </p>
     * 
     * @param components
     *        A list that summarizes each component.
     */

    public void setComponents(java.util.Collection<Component> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<Component>(components);
    }

    /**
     * <p>
     * A list that summarizes each component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     *        A list that summarizes each component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponents(Component... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<Component>(components.length));
        }
        for (Component ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each component.
     * </p>
     * 
     * @param components
     *        A list that summarizes each component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponents(java.util.Collection<Component> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withNextToken(String nextToken) {
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
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
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

        if (obj instanceof ListComponentsResult == false)
            return false;
        ListComponentsResult other = (ListComponentsResult) obj;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
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

        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentsResult clone() {
        try {
            return (ListComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
