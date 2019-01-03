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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTagsOfResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsOfResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource.
     * When provided in this manner, this API fetches the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsOfResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource.
     * When provided in this manner, this API fetches the next page of results.
     * </p>
     * 
     * @param nextToken
     *        An optional string that, if supplied, must be copied from the output of a previous call to
     *        ListTagOfResource. When provided in this manner, this API fetches the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource.
     * When provided in this manner, this API fetches the next page of results.
     * </p>
     * 
     * @return An optional string that, if supplied, must be copied from the output of a previous call to
     *         ListTagOfResource. When provided in this manner, this API fetches the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource.
     * When provided in this manner, this API fetches the next page of results.
     * </p>
     * 
     * @param nextToken
     *        An optional string that, if supplied, must be copied from the output of a previous call to
     *        ListTagOfResource. When provided in this manner, this API fetches the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsOfResourceRequest withNextToken(String nextToken) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof ListTagsOfResourceRequest == false)
            return false;
        ListTagsOfResourceRequest other = (ListTagsOfResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsOfResourceRequest clone() {
        return (ListTagsOfResourceRequest) super.clone();
    }

}
