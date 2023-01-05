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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileDetections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceProfileDetectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of a paginated response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @return The nextToken string that specifies which page of results to return in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the S3 bucket that the request applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceProfileDetectionsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceProfileDetectionsRequest == false)
            return false;
        ListResourceProfileDetectionsRequest other = (ListResourceProfileDetectionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceProfileDetectionsRequest clone() {
        return (ListResourceProfileDetectionsRequest) super.clone();
    }

}
