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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportPlans" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @param maxResults
     *        The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *        data.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @return The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *         data.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
     * </p>
     * 
     * @param maxResults
     *        The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportPlansRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListReportPlansRequest == false)
            return false;
        ListReportPlansRequest other = (ListReportPlansRequest) obj;
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
    public ListReportPlansRequest clone() {
        return (ListReportPlansRequest) super.clone();
    }

}
