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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListOfferingsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListOfferings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Token to retrieve the next page of results */
    private String nextToken;
    /** List of offerings */
    private java.util.List<Offering> offerings;

    /**
     * Token to retrieve the next page of results
     * 
     * @param nextToken
     *        Token to retrieve the next page of results
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token to retrieve the next page of results
     * 
     * @return Token to retrieve the next page of results
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Token to retrieve the next page of results
     * 
     * @param nextToken
     *        Token to retrieve the next page of results
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * List of offerings
     * 
     * @return List of offerings
     */

    public java.util.List<Offering> getOfferings() {
        return offerings;
    }

    /**
     * List of offerings
     * 
     * @param offerings
     *        List of offerings
     */

    public void setOfferings(java.util.Collection<Offering> offerings) {
        if (offerings == null) {
            this.offerings = null;
            return;
        }

        this.offerings = new java.util.ArrayList<Offering>(offerings);
    }

    /**
     * List of offerings
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOfferings(java.util.Collection)} or {@link #withOfferings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param offerings
     *        List of offerings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingsResult withOfferings(Offering... offerings) {
        if (this.offerings == null) {
            setOfferings(new java.util.ArrayList<Offering>(offerings.length));
        }
        for (Offering ele : offerings) {
            this.offerings.add(ele);
        }
        return this;
    }

    /**
     * List of offerings
     * 
     * @param offerings
     *        List of offerings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOfferingsResult withOfferings(java.util.Collection<Offering> offerings) {
        setOfferings(offerings);
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
        if (getOfferings() != null)
            sb.append("Offerings: ").append(getOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOfferingsResult == false)
            return false;
        ListOfferingsResult other = (ListOfferingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferings() == null ^ this.getOfferings() == null)
            return false;
        if (other.getOfferings() != null && other.getOfferings().equals(this.getOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferings() == null) ? 0 : getOfferings().hashCode());
        return hashCode;
    }

    @Override
    public ListOfferingsResult clone() {
        try {
            return (ListOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
