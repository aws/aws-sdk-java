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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitlementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The maximum number of results to return per API request. For example, you submit a ListEntitlements request with
     * MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items.
     * (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service
     * might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service
     * defaults to pagination with a maximum of 20 results per page.
     */
    private Integer maxResults;
    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     */
    private String nextToken;

    /**
     * The maximum number of results to return per API request. For example, you submit a ListEntitlements request with
     * MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items.
     * (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service
     * might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service
     * defaults to pagination with a maximum of 20 results per page.
     * 
     * @param maxResults
     *        The maximum number of results to return per API request. For example, you submit a ListEntitlements
     *        request with MaxResults set at 5. Although 20 items match your request, the service returns no more than
     *        the first 5 items. (The service also returns a NextToken value that you can use to fetch the next batch of
     *        results.) The service might return fewer results than the MaxResults value. If MaxResults is not included
     *        in the request, the service defaults to pagination with a maximum of 20 results per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to return per API request. For example, you submit a ListEntitlements request with
     * MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items.
     * (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service
     * might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service
     * defaults to pagination with a maximum of 20 results per page.
     * 
     * @return The maximum number of results to return per API request. For example, you submit a ListEntitlements
     *         request with MaxResults set at 5. Although 20 items match your request, the service returns no more than
     *         the first 5 items. (The service also returns a NextToken value that you can use to fetch the next batch
     *         of results.) The service might return fewer results than the MaxResults value. If MaxResults is not
     *         included in the request, the service defaults to pagination with a maximum of 20 results per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to return per API request. For example, you submit a ListEntitlements request with
     * MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items.
     * (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service
     * might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service
     * defaults to pagination with a maximum of 20 results per page.
     * 
     * @param maxResults
     *        The maximum number of results to return per API request. For example, you submit a ListEntitlements
     *        request with MaxResults set at 5. Although 20 items match your request, the service returns no more than
     *        the first 5 items. (The service also returns a NextToken value that you can use to fetch the next batch of
     *        results.) The service might return fewer results than the MaxResults value. If MaxResults is not included
     *        in the request, the service defaults to pagination with a maximum of 20 results per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitlementsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *        second time and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *         5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *         second time and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *        second time and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitlementsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListEntitlementsRequest == false)
            return false;
        ListEntitlementsRequest other = (ListEntitlementsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitlementsRequest clone() {
        return (ListEntitlementsRequest) super.clone();
    }

}
