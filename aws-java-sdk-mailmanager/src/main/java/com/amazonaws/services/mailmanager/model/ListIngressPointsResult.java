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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListIngressPoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIngressPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     */
    private java.util.List<IngressPoint> ingressPoints;
    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @return The list of ingress endpoints.
     */

    public java.util.List<IngressPoint> getIngressPoints() {
        return ingressPoints;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param ingressPoints
     *        The list of ingress endpoints.
     */

    public void setIngressPoints(java.util.Collection<IngressPoint> ingressPoints) {
        if (ingressPoints == null) {
            this.ingressPoints = null;
            return;
        }

        this.ingressPoints = new java.util.ArrayList<IngressPoint>(ingressPoints);
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngressPoints(java.util.Collection)} or {@link #withIngressPoints(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ingressPoints
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngressPointsResult withIngressPoints(IngressPoint... ingressPoints) {
        if (this.ingressPoints == null) {
            setIngressPoints(new java.util.ArrayList<IngressPoint>(ingressPoints.length));
        }
        for (IngressPoint ele : ingressPoints) {
            this.ingressPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param ingressPoints
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngressPointsResult withIngressPoints(java.util.Collection<IngressPoint> ingressPoints) {
        setIngressPoints(ingressPoints);
        return this;
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

    public ListIngressPointsResult withNextToken(String nextToken) {
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
        if (getIngressPoints() != null)
            sb.append("IngressPoints: ").append(getIngressPoints()).append(",");
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

        if (obj instanceof ListIngressPointsResult == false)
            return false;
        ListIngressPointsResult other = (ListIngressPointsResult) obj;
        if (other.getIngressPoints() == null ^ this.getIngressPoints() == null)
            return false;
        if (other.getIngressPoints() != null && other.getIngressPoints().equals(this.getIngressPoints()) == false)
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

        hashCode = prime * hashCode + ((getIngressPoints() == null) ? 0 : getIngressPoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIngressPointsResult clone() {
        try {
            return (ListIngressPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
