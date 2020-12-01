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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomaliesForInsightResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextToken;

    private java.util.List<ProactiveAnomalySummary> proactiveAnomalies;

    private java.util.List<ReactiveAnomalySummary> reactiveAnomalies;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ProactiveAnomalySummary> getProactiveAnomalies() {
        return proactiveAnomalies;
    }

    /**
     * @param proactiveAnomalies
     */

    public void setProactiveAnomalies(java.util.Collection<ProactiveAnomalySummary> proactiveAnomalies) {
        if (proactiveAnomalies == null) {
            this.proactiveAnomalies = null;
            return;
        }

        this.proactiveAnomalies = new java.util.ArrayList<ProactiveAnomalySummary>(proactiveAnomalies);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProactiveAnomalies(java.util.Collection)} or {@link #withProactiveAnomalies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param proactiveAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightResult withProactiveAnomalies(ProactiveAnomalySummary... proactiveAnomalies) {
        if (this.proactiveAnomalies == null) {
            setProactiveAnomalies(new java.util.ArrayList<ProactiveAnomalySummary>(proactiveAnomalies.length));
        }
        for (ProactiveAnomalySummary ele : proactiveAnomalies) {
            this.proactiveAnomalies.add(ele);
        }
        return this;
    }

    /**
     * @param proactiveAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightResult withProactiveAnomalies(java.util.Collection<ProactiveAnomalySummary> proactiveAnomalies) {
        setProactiveAnomalies(proactiveAnomalies);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ReactiveAnomalySummary> getReactiveAnomalies() {
        return reactiveAnomalies;
    }

    /**
     * @param reactiveAnomalies
     */

    public void setReactiveAnomalies(java.util.Collection<ReactiveAnomalySummary> reactiveAnomalies) {
        if (reactiveAnomalies == null) {
            this.reactiveAnomalies = null;
            return;
        }

        this.reactiveAnomalies = new java.util.ArrayList<ReactiveAnomalySummary>(reactiveAnomalies);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReactiveAnomalies(java.util.Collection)} or {@link #withReactiveAnomalies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reactiveAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightResult withReactiveAnomalies(ReactiveAnomalySummary... reactiveAnomalies) {
        if (this.reactiveAnomalies == null) {
            setReactiveAnomalies(new java.util.ArrayList<ReactiveAnomalySummary>(reactiveAnomalies.length));
        }
        for (ReactiveAnomalySummary ele : reactiveAnomalies) {
            this.reactiveAnomalies.add(ele);
        }
        return this;
    }

    /**
     * @param reactiveAnomalies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomaliesForInsightResult withReactiveAnomalies(java.util.Collection<ReactiveAnomalySummary> reactiveAnomalies) {
        setReactiveAnomalies(reactiveAnomalies);
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
        if (getProactiveAnomalies() != null)
            sb.append("ProactiveAnomalies: ").append(getProactiveAnomalies()).append(",");
        if (getReactiveAnomalies() != null)
            sb.append("ReactiveAnomalies: ").append(getReactiveAnomalies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnomaliesForInsightResult == false)
            return false;
        ListAnomaliesForInsightResult other = (ListAnomaliesForInsightResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProactiveAnomalies() == null ^ this.getProactiveAnomalies() == null)
            return false;
        if (other.getProactiveAnomalies() != null && other.getProactiveAnomalies().equals(this.getProactiveAnomalies()) == false)
            return false;
        if (other.getReactiveAnomalies() == null ^ this.getReactiveAnomalies() == null)
            return false;
        if (other.getReactiveAnomalies() != null && other.getReactiveAnomalies().equals(this.getReactiveAnomalies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProactiveAnomalies() == null) ? 0 : getProactiveAnomalies().hashCode());
        hashCode = prime * hashCode + ((getReactiveAnomalies() == null) ? 0 : getReactiveAnomalies().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomaliesForInsightResult clone() {
        try {
            return (ListAnomaliesForInsightResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
