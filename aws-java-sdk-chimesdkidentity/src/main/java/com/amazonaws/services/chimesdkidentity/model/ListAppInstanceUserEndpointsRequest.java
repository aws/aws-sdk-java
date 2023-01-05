/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceUserEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The maximum number of endpoints that you want to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceUser</code>.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsRequest withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of endpoints that you want to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints that you want to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints that you want to return.
     * </p>
     * 
     * @return The maximum number of endpoints that you want to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of endpoints that you want to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of endpoints that you want to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested endpoints are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested endpoints are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested endpoints are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsRequest withNextToken(String nextToken) {
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstanceUserEndpointsRequest == false)
            return false;
        ListAppInstanceUserEndpointsRequest other = (ListAppInstanceUserEndpointsRequest) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceUserEndpointsRequest clone() {
        return (ListAppInstanceUserEndpointsRequest) super.clone();
    }

}
