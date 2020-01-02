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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchThingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of things in the result set.
     * </p>
     */
    private java.util.List<Thing> things;
    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of things in the result set.
     * </p>
     * 
     * @return An array of things in the result set.
     */

    public java.util.List<Thing> getThings() {
        return things;
    }

    /**
     * <p>
     * An array of things in the result set.
     * </p>
     * 
     * @param things
     *        An array of things in the result set.
     */

    public void setThings(java.util.Collection<Thing> things) {
        if (things == null) {
            this.things = null;
            return;
        }

        this.things = new java.util.ArrayList<Thing>(things);
    }

    /**
     * <p>
     * An array of things in the result set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThings(java.util.Collection)} or {@link #withThings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param things
     *        An array of things in the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsResult withThings(Thing... things) {
        if (this.things == null) {
            setThings(new java.util.ArrayList<Thing>(things.length));
        }
        for (Thing ele : things) {
            this.things.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of things in the result set.
     * </p>
     * 
     * @param things
     *        An array of things in the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsResult withThings(java.util.Collection<Thing> things) {
        setThings(things);
        return this;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @return The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsResult withNextToken(String nextToken) {
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
        if (getThings() != null)
            sb.append("Things: ").append(getThings()).append(",");
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

        if (obj instanceof SearchThingsResult == false)
            return false;
        SearchThingsResult other = (SearchThingsResult) obj;
        if (other.getThings() == null ^ this.getThings() == null)
            return false;
        if (other.getThings() != null && other.getThings().equals(this.getThings()) == false)
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

        hashCode = prime * hashCode + ((getThings() == null) ? 0 : getThings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchThingsResult clone() {
        try {
            return (SearchThingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
