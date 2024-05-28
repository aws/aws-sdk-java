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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListIndices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Q Business
     * indices.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of indices to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application connected to the index.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Q Business
     * indices.
     * </p>
     * 
     * @param nextToken
     *        If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        Amazon Q Business indices.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Q Business
     * indices.
     * </p>
     * 
     * @return If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business
     *         returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *         Amazon Q Business indices.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Q Business
     * indices.
     * </p>
     * 
     * @param nextToken
     *        If the maxResults response was incomplete because there is more data to retrieve, Amazon Q Business
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        Amazon Q Business indices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of indices to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of indices to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of indices to return.
     * </p>
     * 
     * @return The maximum number of indices to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of indices to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of indices to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndicesRequest withMaxResults(Integer maxResults) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
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

        if (obj instanceof ListIndicesRequest == false)
            return false;
        ListIndicesRequest other = (ListIndicesRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListIndicesRequest clone() {
        return (ListIndicesRequest) super.clone();
    }

}
