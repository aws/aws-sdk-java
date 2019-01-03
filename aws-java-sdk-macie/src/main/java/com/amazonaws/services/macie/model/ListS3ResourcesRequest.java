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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListS3ResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Macie member account ID whose associated S3 resources you want to list.
     * </p>
     */
    private String memberAccountId;
    /**
     * <p>
     * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources
     * action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the
     * previous response to continue listing data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want in the response. The default value is
     * 250.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Macie member account ID whose associated S3 resources you want to list.
     * </p>
     * 
     * @param memberAccountId
     *        The Amazon Macie member account ID whose associated S3 resources you want to list.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The Amazon Macie member account ID whose associated S3 resources you want to list.
     * </p>
     * 
     * @return The Amazon Macie member account ID whose associated S3 resources you want to list.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The Amazon Macie member account ID whose associated S3 resources you want to list.
     * </p>
     * 
     * @param memberAccountId
     *        The Amazon Macie member account ID whose associated S3 resources you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources
     * action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the
     * previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results. Set its value to null on your first call to the
     *        ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of
     *        nextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources
     * action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the
     * previous response to continue listing data.
     * </p>
     * 
     * @return Use this parameter when paginating results. Set its value to null on your first call to the
     *         ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of
     *         nextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources
     * action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the
     * previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results. Set its value to null on your first call to the
     *        ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of
     *        nextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want in the response. The default value is
     * 250.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter to indicate the maximum number of items that you want in the response. The default
     *        value is 250.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want in the response. The default value is
     * 250.
     * </p>
     * 
     * @return Use this parameter to indicate the maximum number of items that you want in the response. The default
     *         value is 250.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want in the response. The default value is
     * 250.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter to indicate the maximum number of items that you want in the response. The default
     *        value is 250.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListS3ResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getMemberAccountId() != null)
            sb.append("MemberAccountId: ").append(getMemberAccountId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListS3ResourcesRequest == false)
            return false;
        ListS3ResourcesRequest other = (ListS3ResourcesRequest) obj;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListS3ResourcesRequest clone() {
        return (ListS3ResourcesRequest) super.clone();
    }

}
