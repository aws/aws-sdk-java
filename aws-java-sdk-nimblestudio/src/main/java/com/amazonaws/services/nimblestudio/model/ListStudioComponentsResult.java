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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A collection of studio components.
     * </p>
     */
    private java.util.List<StudioComponent> studioComponents;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A collection of studio components.
     * </p>
     * 
     * @return A collection of studio components.
     */

    public java.util.List<StudioComponent> getStudioComponents() {
        return studioComponents;
    }

    /**
     * <p>
     * A collection of studio components.
     * </p>
     * 
     * @param studioComponents
     *        A collection of studio components.
     */

    public void setStudioComponents(java.util.Collection<StudioComponent> studioComponents) {
        if (studioComponents == null) {
            this.studioComponents = null;
            return;
        }

        this.studioComponents = new java.util.ArrayList<StudioComponent>(studioComponents);
    }

    /**
     * <p>
     * A collection of studio components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudioComponents(java.util.Collection)} or {@link #withStudioComponents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param studioComponents
     *        A collection of studio components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsResult withStudioComponents(StudioComponent... studioComponents) {
        if (this.studioComponents == null) {
            setStudioComponents(new java.util.ArrayList<StudioComponent>(studioComponents.length));
        }
        for (StudioComponent ele : studioComponents) {
            this.studioComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of studio components.
     * </p>
     * 
     * @param studioComponents
     *        A collection of studio components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioComponentsResult withStudioComponents(java.util.Collection<StudioComponent> studioComponents) {
        setStudioComponents(studioComponents);
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
        if (getStudioComponents() != null)
            sb.append("StudioComponents: ").append(getStudioComponents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudioComponentsResult == false)
            return false;
        ListStudioComponentsResult other = (ListStudioComponentsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStudioComponents() == null ^ this.getStudioComponents() == null)
            return false;
        if (other.getStudioComponents() != null && other.getStudioComponents().equals(this.getStudioComponents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStudioComponents() == null) ? 0 : getStudioComponents().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioComponentsResult clone() {
        try {
            return (ListStudioComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
