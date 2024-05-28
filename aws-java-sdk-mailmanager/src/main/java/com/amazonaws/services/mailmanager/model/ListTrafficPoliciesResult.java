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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTrafficPolicies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of traffic policies.
     * </p>
     */
    private java.util.List<TrafficPolicy> trafficPolicies;

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of traffic policies.
     * </p>
     * 
     * @return The list of traffic policies.
     */

    public java.util.List<TrafficPolicy> getTrafficPolicies() {
        return trafficPolicies;
    }

    /**
     * <p>
     * The list of traffic policies.
     * </p>
     * 
     * @param trafficPolicies
     *        The list of traffic policies.
     */

    public void setTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        if (trafficPolicies == null) {
            this.trafficPolicies = null;
            return;
        }

        this.trafficPolicies = new java.util.ArrayList<TrafficPolicy>(trafficPolicies);
    }

    /**
     * <p>
     * The list of traffic policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficPolicies(java.util.Collection)} or {@link #withTrafficPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param trafficPolicies
     *        The list of traffic policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withTrafficPolicies(TrafficPolicy... trafficPolicies) {
        if (this.trafficPolicies == null) {
            setTrafficPolicies(new java.util.ArrayList<TrafficPolicy>(trafficPolicies.length));
        }
        for (TrafficPolicy ele : trafficPolicies) {
            this.trafficPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of traffic policies.
     * </p>
     * 
     * @param trafficPolicies
     *        The list of traffic policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        setTrafficPolicies(trafficPolicies);
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
        if (getTrafficPolicies() != null)
            sb.append("TrafficPolicies: ").append(getTrafficPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPoliciesResult == false)
            return false;
        ListTrafficPoliciesResult other = (ListTrafficPoliciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrafficPolicies() == null ^ this.getTrafficPolicies() == null)
            return false;
        if (other.getTrafficPolicies() != null && other.getTrafficPolicies().equals(this.getTrafficPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicies() == null) ? 0 : getTrafficPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPoliciesResult clone() {
        try {
            return (ListTrafficPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
