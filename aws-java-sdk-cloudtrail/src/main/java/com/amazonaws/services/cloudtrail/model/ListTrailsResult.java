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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTrails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the name, ARN, and home region of trails in the current account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrailInfo> trails;
    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the name, ARN, and home region of trails in the current account.
     * </p>
     * 
     * @return Returns the name, ARN, and home region of trails in the current account.
     */

    public java.util.List<TrailInfo> getTrails() {
        if (trails == null) {
            trails = new com.amazonaws.internal.SdkInternalList<TrailInfo>();
        }
        return trails;
    }

    /**
     * <p>
     * Returns the name, ARN, and home region of trails in the current account.
     * </p>
     * 
     * @param trails
     *        Returns the name, ARN, and home region of trails in the current account.
     */

    public void setTrails(java.util.Collection<TrailInfo> trails) {
        if (trails == null) {
            this.trails = null;
            return;
        }

        this.trails = new com.amazonaws.internal.SdkInternalList<TrailInfo>(trails);
    }

    /**
     * <p>
     * Returns the name, ARN, and home region of trails in the current account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrails(java.util.Collection)} or {@link #withTrails(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param trails
     *        Returns the name, ARN, and home region of trails in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrailsResult withTrails(TrailInfo... trails) {
        if (this.trails == null) {
            setTrails(new com.amazonaws.internal.SdkInternalList<TrailInfo>(trails.length));
        }
        for (TrailInfo ele : trails) {
            this.trails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the name, ARN, and home region of trails in the current account.
     * </p>
     * 
     * @param trails
     *        Returns the name, ARN, and home region of trails in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrailsResult withTrails(java.util.Collection<TrailInfo> trails) {
        setTrails(trails);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. If the token does not appear,
     *        there are no more results to return. The token must be passed in with the same parameters as the previous
     *        call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *        the call with NextToken should include those same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call. If the token does not appear,
     *         there are no more results to return. The token must be passed in with the same parameters as the previous
     *         call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *         the call with NextToken should include those same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. If the token does not appear,
     *        there are no more results to return. The token must be passed in with the same parameters as the previous
     *        call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *        the call with NextToken should include those same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrailsResult withNextToken(String nextToken) {
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
        if (getTrails() != null)
            sb.append("Trails: ").append(getTrails()).append(",");
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

        if (obj instanceof ListTrailsResult == false)
            return false;
        ListTrailsResult other = (ListTrailsResult) obj;
        if (other.getTrails() == null ^ this.getTrails() == null)
            return false;
        if (other.getTrails() != null && other.getTrails().equals(this.getTrails()) == false)
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

        hashCode = prime * hashCode + ((getTrails() == null) ? 0 : getTrails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrailsResult clone() {
        try {
            return (ListTrailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
