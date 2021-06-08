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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackerConsumers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrackerConsumersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the list of geofence collection ARNs associated to the tracker resource.
     * </p>
     */
    private java.util.List<String> consumerArns;
    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the list of geofence collection ARNs associated to the tracker resource.
     * </p>
     * 
     * @return Contains the list of geofence collection ARNs associated to the tracker resource.
     */

    public java.util.List<String> getConsumerArns() {
        return consumerArns;
    }

    /**
     * <p>
     * Contains the list of geofence collection ARNs associated to the tracker resource.
     * </p>
     * 
     * @param consumerArns
     *        Contains the list of geofence collection ARNs associated to the tracker resource.
     */

    public void setConsumerArns(java.util.Collection<String> consumerArns) {
        if (consumerArns == null) {
            this.consumerArns = null;
            return;
        }

        this.consumerArns = new java.util.ArrayList<String>(consumerArns);
    }

    /**
     * <p>
     * Contains the list of geofence collection ARNs associated to the tracker resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumerArns(java.util.Collection)} or {@link #withConsumerArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param consumerArns
     *        Contains the list of geofence collection ARNs associated to the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackerConsumersResult withConsumerArns(String... consumerArns) {
        if (this.consumerArns == null) {
            setConsumerArns(new java.util.ArrayList<String>(consumerArns.length));
        }
        for (String ele : consumerArns) {
            this.consumerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the list of geofence collection ARNs associated to the tracker resource.
     * </p>
     * 
     * @param consumerArns
     *        Contains the list of geofence collection ARNs associated to the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackerConsumersResult withConsumerArns(java.util.Collection<String> consumerArns) {
        setConsumerArns(consumerArns);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @return A pagination token indicating there are additional pages available. You can use the token in a following
     *         request to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackerConsumersResult withNextToken(String nextToken) {
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
        if (getConsumerArns() != null)
            sb.append("ConsumerArns: ").append(getConsumerArns()).append(",");
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

        if (obj instanceof ListTrackerConsumersResult == false)
            return false;
        ListTrackerConsumersResult other = (ListTrackerConsumersResult) obj;
        if (other.getConsumerArns() == null ^ this.getConsumerArns() == null)
            return false;
        if (other.getConsumerArns() != null && other.getConsumerArns().equals(this.getConsumerArns()) == false)
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

        hashCode = prime * hashCode + ((getConsumerArns() == null) ? 0 : getConsumerArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrackerConsumersResult clone() {
        try {
            return (ListTrackerConsumersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
