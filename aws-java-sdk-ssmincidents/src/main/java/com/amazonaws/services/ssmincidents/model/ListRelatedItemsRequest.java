/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListRelatedItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRelatedItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     * </p>
     */
    private String incidentRecordArn;
    /**
     * <p>
     * The maximum number of related items per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     */

    public void setIncidentRecordArn(String incidentRecordArn) {
        this.incidentRecordArn = incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     */

    public String getIncidentRecordArn() {
        return this.incidentRecordArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     * </p>
     * 
     * @param incidentRecordArn
     *        The Amazon Resource Name (ARN) of the incident record that you are listing related items for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsRequest withIncidentRecordArn(String incidentRecordArn) {
        setIncidentRecordArn(incidentRecordArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of related items per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of related items per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of related items per page.
     * </p>
     * 
     * @return The maximum number of related items per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of related items per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of related items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedItemsRequest withNextToken(String nextToken) {
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
        if (getIncidentRecordArn() != null)
            sb.append("IncidentRecordArn: ").append(getIncidentRecordArn()).append(",");
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

        if (obj instanceof ListRelatedItemsRequest == false)
            return false;
        ListRelatedItemsRequest other = (ListRelatedItemsRequest) obj;
        if (other.getIncidentRecordArn() == null ^ this.getIncidentRecordArn() == null)
            return false;
        if (other.getIncidentRecordArn() != null && other.getIncidentRecordArn().equals(this.getIncidentRecordArn()) == false)
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

        hashCode = prime * hashCode + ((getIncidentRecordArn() == null) ? 0 : getIncidentRecordArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRelatedItemsRequest clone() {
        return (ListRelatedItemsRequest) super.clone();
    }

}
