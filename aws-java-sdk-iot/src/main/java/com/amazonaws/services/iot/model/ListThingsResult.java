/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output from the ListThings operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The things.
     * </p>
     */
    private java.util.List<ThingAttribute> things;
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @return The things.
     */

    public java.util.List<ThingAttribute> getThings() {
        return things;
    }

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @param things
     *        The things.
     */

    public void setThings(java.util.Collection<ThingAttribute> things) {
        if (things == null) {
            this.things = null;
            return;
        }

        this.things = new java.util.ArrayList<ThingAttribute>(things);
    }

    /**
     * <p>
     * The things.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThings(java.util.Collection)} or {@link #withThings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param things
     *        The things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsResult withThings(ThingAttribute... things) {
        if (this.things == null) {
            setThings(new java.util.ArrayList<ThingAttribute>(things.length));
        }
        for (ThingAttribute ele : things) {
            this.things.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @param things
     *        The things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsResult withThings(java.util.Collection<ThingAttribute> things) {
        setThings(things);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListThingsResult == false)
            return false;
        ListThingsResult other = (ListThingsResult) obj;
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
    public ListThingsResult clone() {
        try {
            return (ListThingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
