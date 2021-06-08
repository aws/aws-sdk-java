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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFHIRDatastoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all filters associated with a FHIR Data Store request.
     * </p>
     */
    private DatastoreFilter filter;
    /**
     * <p>
     * Fetches the next page of Data Stores when results are paginated.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Lists all filters associated with a FHIR Data Store request.
     * </p>
     * 
     * @param filter
     *        Lists all filters associated with a FHIR Data Store request.
     */

    public void setFilter(DatastoreFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Lists all filters associated with a FHIR Data Store request.
     * </p>
     * 
     * @return Lists all filters associated with a FHIR Data Store request.
     */

    public DatastoreFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Lists all filters associated with a FHIR Data Store request.
     * </p>
     * 
     * @param filter
     *        Lists all filters associated with a FHIR Data Store request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresRequest withFilter(DatastoreFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Fetches the next page of Data Stores when results are paginated.
     * </p>
     * 
     * @param nextToken
     *        Fetches the next page of Data Stores when results are paginated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Fetches the next page of Data Stores when results are paginated.
     * </p>
     * 
     * @return Fetches the next page of Data Stores when results are paginated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Fetches the next page of Data Stores when results are paginated.
     * </p>
     * 
     * @param nextToken
     *        Fetches the next page of Data Stores when results are paginated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     * </p>
     * 
     * @return The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresRequest withMaxResults(Integer maxResults) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListFHIRDatastoresRequest == false)
            return false;
        ListFHIRDatastoresRequest other = (ListFHIRDatastoresRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFHIRDatastoresRequest clone() {
        return (ListFHIRDatastoresRequest) super.clone();
    }

}
