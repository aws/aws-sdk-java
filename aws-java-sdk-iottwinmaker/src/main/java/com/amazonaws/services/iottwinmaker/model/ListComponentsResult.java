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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the components.
     * </p>
     */
    private java.util.List<ComponentSummary> componentSummaries;
    /**
     * <p>
     * The string that specifies the next page of component results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the components.
     * </p>
     * 
     * @return A list of objects that contain information about the components.
     */

    public java.util.List<ComponentSummary> getComponentSummaries() {
        return componentSummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the components.
     * </p>
     * 
     * @param componentSummaries
     *        A list of objects that contain information about the components.
     */

    public void setComponentSummaries(java.util.Collection<ComponentSummary> componentSummaries) {
        if (componentSummaries == null) {
            this.componentSummaries = null;
            return;
        }

        this.componentSummaries = new java.util.ArrayList<ComponentSummary>(componentSummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentSummaries(java.util.Collection)} or {@link #withComponentSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param componentSummaries
     *        A list of objects that contain information about the components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponentSummaries(ComponentSummary... componentSummaries) {
        if (this.componentSummaries == null) {
            setComponentSummaries(new java.util.ArrayList<ComponentSummary>(componentSummaries.length));
        }
        for (ComponentSummary ele : componentSummaries) {
            this.componentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the components.
     * </p>
     * 
     * @param componentSummaries
     *        A list of objects that contain information about the components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponentSummaries(java.util.Collection<ComponentSummary> componentSummaries) {
        setComponentSummaries(componentSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of component results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of component results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of component results.
     * </p>
     * 
     * @return The string that specifies the next page of component results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of component results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of component results.
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
        if (getComponentSummaries() != null)
            sb.append("ComponentSummaries: ").append(getComponentSummaries()).append(",");
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
        if (other.getComponentSummaries() == null ^ this.getComponentSummaries() == null)
            return false;
        if (other.getComponentSummaries() != null && other.getComponentSummaries().equals(this.getComponentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getComponentSummaries() == null) ? 0 : getComponentSummaries().hashCode());
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
