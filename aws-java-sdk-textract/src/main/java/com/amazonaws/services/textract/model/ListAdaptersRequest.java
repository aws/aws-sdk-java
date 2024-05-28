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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/ListAdapters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAdaptersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * after the specified creation time.
     * </p>
     */
    private java.util.Date afterCreationTime;
    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * before the specified creation time.
     * </p>
     */
    private java.util.Date beforeCreationTime;
    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * after the specified creation time.
     * </p>
     * 
     * @param afterCreationTime
     *        Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *        created after the specified creation time.
     */

    public void setAfterCreationTime(java.util.Date afterCreationTime) {
        this.afterCreationTime = afterCreationTime;
    }

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * after the specified creation time.
     * </p>
     * 
     * @return Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *         created after the specified creation time.
     */

    public java.util.Date getAfterCreationTime() {
        return this.afterCreationTime;
    }

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * after the specified creation time.
     * </p>
     * 
     * @param afterCreationTime
     *        Specifies the lower bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *        created after the specified creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersRequest withAfterCreationTime(java.util.Date afterCreationTime) {
        setAfterCreationTime(afterCreationTime);
        return this;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * before the specified creation time.
     * </p>
     * 
     * @param beforeCreationTime
     *        Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *        created before the specified creation time.
     */

    public void setBeforeCreationTime(java.util.Date beforeCreationTime) {
        this.beforeCreationTime = beforeCreationTime;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * before the specified creation time.
     * </p>
     * 
     * @return Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *         created before the specified creation time.
     */

    public java.util.Date getBeforeCreationTime() {
        return this.beforeCreationTime;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters created
     * before the specified creation time.
     * </p>
     * 
     * @param beforeCreationTime
     *        Specifies the upper bound for the ListAdapters operation. Ensures ListAdapters returns only adapters
     *        created before the specified creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersRequest withBeforeCreationTime(java.util.Date beforeCreationTime) {
        setBeforeCreationTime(beforeCreationTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return when listing adapters.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * 
     * @return The maximum number of results to return when listing adapters.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return when listing adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return when listing adapters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @return Identifies the next page of results to return when listing adapters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return when listing adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAdaptersRequest withNextToken(String nextToken) {
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
        if (getAfterCreationTime() != null)
            sb.append("AfterCreationTime: ").append(getAfterCreationTime()).append(",");
        if (getBeforeCreationTime() != null)
            sb.append("BeforeCreationTime: ").append(getBeforeCreationTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAdaptersRequest == false)
            return false;
        ListAdaptersRequest other = (ListAdaptersRequest) obj;
        if (other.getAfterCreationTime() == null ^ this.getAfterCreationTime() == null)
            return false;
        if (other.getAfterCreationTime() != null && other.getAfterCreationTime().equals(this.getAfterCreationTime()) == false)
            return false;
        if (other.getBeforeCreationTime() == null ^ this.getBeforeCreationTime() == null)
            return false;
        if (other.getBeforeCreationTime() != null && other.getBeforeCreationTime().equals(this.getBeforeCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getAfterCreationTime() == null) ? 0 : getAfterCreationTime().hashCode());
        hashCode = prime * hashCode + ((getBeforeCreationTime() == null) ? 0 : getBeforeCreationTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAdaptersRequest clone() {
        return (ListAdaptersRequest) super.clone();
    }

}
