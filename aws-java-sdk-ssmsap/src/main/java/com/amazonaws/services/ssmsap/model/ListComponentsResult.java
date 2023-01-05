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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private java.util.List<ComponentSummary> components;
    /** <p/> */
    private String nextToken;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ComponentSummary> getComponents() {
        return components;
    }

    /**
     * <p/>
     * 
     * @param components
     */

    public void setComponents(java.util.Collection<ComponentSummary> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<ComponentSummary>(components);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponents(ComponentSummary... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<ComponentSummary>(components.length));
        }
        for (ComponentSummary ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param components
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentsResult withComponents(java.util.Collection<ComponentSummary> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p/>
     * 
     * @param nextToken
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
