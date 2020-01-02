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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListMultiplexesResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultiplexesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of multiplexes. */
    private java.util.List<MultiplexSummary> multiplexes;
    /** Token for the next ListMultiplexes request. */
    private String nextToken;

    /**
     * List of multiplexes.
     * 
     * @return List of multiplexes.
     */

    public java.util.List<MultiplexSummary> getMultiplexes() {
        return multiplexes;
    }

    /**
     * List of multiplexes.
     * 
     * @param multiplexes
     *        List of multiplexes.
     */

    public void setMultiplexes(java.util.Collection<MultiplexSummary> multiplexes) {
        if (multiplexes == null) {
            this.multiplexes = null;
            return;
        }

        this.multiplexes = new java.util.ArrayList<MultiplexSummary>(multiplexes);
    }

    /**
     * List of multiplexes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMultiplexes(java.util.Collection)} or {@link #withMultiplexes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param multiplexes
     *        List of multiplexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexesResult withMultiplexes(MultiplexSummary... multiplexes) {
        if (this.multiplexes == null) {
            setMultiplexes(new java.util.ArrayList<MultiplexSummary>(multiplexes.length));
        }
        for (MultiplexSummary ele : multiplexes) {
            this.multiplexes.add(ele);
        }
        return this;
    }

    /**
     * List of multiplexes.
     * 
     * @param multiplexes
     *        List of multiplexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexesResult withMultiplexes(java.util.Collection<MultiplexSummary> multiplexes) {
        setMultiplexes(multiplexes);
        return this;
    }

    /**
     * Token for the next ListMultiplexes request.
     * 
     * @param nextToken
     *        Token for the next ListMultiplexes request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token for the next ListMultiplexes request.
     * 
     * @return Token for the next ListMultiplexes request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Token for the next ListMultiplexes request.
     * 
     * @param nextToken
     *        Token for the next ListMultiplexes request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexesResult withNextToken(String nextToken) {
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
        if (getMultiplexes() != null)
            sb.append("Multiplexes: ").append(getMultiplexes()).append(",");
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

        if (obj instanceof ListMultiplexesResult == false)
            return false;
        ListMultiplexesResult other = (ListMultiplexesResult) obj;
        if (other.getMultiplexes() == null ^ this.getMultiplexes() == null)
            return false;
        if (other.getMultiplexes() != null && other.getMultiplexes().equals(this.getMultiplexes()) == false)
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

        hashCode = prime * hashCode + ((getMultiplexes() == null) ? 0 : getMultiplexes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMultiplexesResult clone() {
        try {
            return (ListMultiplexesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
