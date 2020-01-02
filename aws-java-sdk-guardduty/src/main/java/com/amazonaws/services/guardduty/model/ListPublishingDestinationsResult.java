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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPublishingDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * </p>
     */
    private java.util.List<Destination> destinations;
    /**
     * <p>
     * A token to use for paginating results returned in the repsonse. Set the value of this parameter to null for the
     * first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from the
     * previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * </p>
     * 
     * @return A <code>Destinations</code> obect that includes information about each publishing destination returned.
     */

    public java.util.List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * </p>
     * 
     * @param destinations
     *        A <code>Destinations</code> obect that includes information about each publishing destination returned.
     */

    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<Destination>(destinations);
    }

    /**
     * <p>
     * A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublishingDestinationsResult withDestinations(Destination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<Destination>(destinations.length));
        }
        for (Destination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * </p>
     * 
     * @param destinations
     *        A <code>Destinations</code> obect that includes information about each publishing destination returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublishingDestinationsResult withDestinations(java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results returned in the repsonse. Set the value of this parameter to null for the
     * first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from the
     * previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results returned in the repsonse. Set the value of this parameter to null
     *        for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results returned in the repsonse. Set the value of this parameter to null for the
     * first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from the
     * previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results returned in the repsonse. Set the value of this parameter to null
     *         for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *         returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results returned in the repsonse. Set the value of this parameter to null for the
     * first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from the
     * previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results returned in the repsonse. Set the value of this parameter to null
     *        for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublishingDestinationsResult withNextToken(String nextToken) {
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
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

        if (obj instanceof ListPublishingDestinationsResult == false)
            return false;
        ListPublishingDestinationsResult other = (ListPublishingDestinationsResult) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
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

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPublishingDestinationsResult clone() {
        try {
            return (ListPublishingDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
