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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTrails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. This token must be passed in
     *        with the same parameters that were specified in the the original call. For example, if the original call
     *        specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *        those same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call. This token must be passed in
     *         with the same parameters that were specified in the the original call. For example, if the original call
     *         specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *         those same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. This token must be passed in
     *        with the same parameters that were specified in the the original call. For example, if the original call
     *        specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *        those same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrailsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListTrailsRequest == false)
            return false;
        ListTrailsRequest other = (ListTrailsRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrailsRequest clone() {
        return (ListTrailsRequest) super.clone();
    }

}
