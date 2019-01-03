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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQualificationTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A text query against all of the searchable attributes of Qualification types.
     * </p>
     */
    private String query;
    /**
     * <p>
     * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such
     * as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those
     * assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types,
     * including those managed by the system, are considered. Valid values are True | False.
     * </p>
     */
    private Boolean mustBeRequestable;
    /**
     * <p>
     * Specifies that only Qualification types that the Requester created are returned. If false, the operation returns
     * all Qualification types.
     * </p>
     */
    private Boolean mustBeOwnedByCaller;

    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A text query against all of the searchable attributes of Qualification types.
     * </p>
     * 
     * @param query
     *        A text query against all of the searchable attributes of Qualification types.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * A text query against all of the searchable attributes of Qualification types.
     * </p>
     * 
     * @return A text query against all of the searchable attributes of Qualification types.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * A text query against all of the searchable attributes of Qualification types.
     * </p>
     * 
     * @param query
     *        A text query against all of the searchable attributes of Qualification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesRequest withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such
     * as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those
     * assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types,
     * including those managed by the system, are considered. Valid values are True | False.
     * </p>
     * 
     * @param mustBeRequestable
     *        Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web
     *        site, such as by taking a Qualification test, are returned as results of the search. Some Qualification
     *        types, such as those assigned automatically by the system, cannot be requested directly by users. If
     *        false, all Qualification types, including those managed by the system, are considered. Valid values are
     *        True | False.
     */

    public void setMustBeRequestable(Boolean mustBeRequestable) {
        this.mustBeRequestable = mustBeRequestable;
    }

    /**
     * <p>
     * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such
     * as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those
     * assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types,
     * including those managed by the system, are considered. Valid values are True | False.
     * </p>
     * 
     * @return Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web
     *         site, such as by taking a Qualification test, are returned as results of the search. Some Qualification
     *         types, such as those assigned automatically by the system, cannot be requested directly by users. If
     *         false, all Qualification types, including those managed by the system, are considered. Valid values are
     *         True | False.
     */

    public Boolean getMustBeRequestable() {
        return this.mustBeRequestable;
    }

    /**
     * <p>
     * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such
     * as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those
     * assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types,
     * including those managed by the system, are considered. Valid values are True | False.
     * </p>
     * 
     * @param mustBeRequestable
     *        Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web
     *        site, such as by taking a Qualification test, are returned as results of the search. Some Qualification
     *        types, such as those assigned automatically by the system, cannot be requested directly by users. If
     *        false, all Qualification types, including those managed by the system, are considered. Valid values are
     *        True | False.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesRequest withMustBeRequestable(Boolean mustBeRequestable) {
        setMustBeRequestable(mustBeRequestable);
        return this;
    }

    /**
     * <p>
     * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such
     * as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those
     * assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types,
     * including those managed by the system, are considered. Valid values are True | False.
     * </p>
     * 
     * @return Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web
     *         site, such as by taking a Qualification test, are returned as results of the search. Some Qualification
     *         types, such as those assigned automatically by the system, cannot be requested directly by users. If
     *         false, all Qualification types, including those managed by the system, are considered. Valid values are
     *         True | False.
     */

    public Boolean isMustBeRequestable() {
        return this.mustBeRequestable;
    }

    /**
     * <p>
     * Specifies that only Qualification types that the Requester created are returned. If false, the operation returns
     * all Qualification types.
     * </p>
     * 
     * @param mustBeOwnedByCaller
     *        Specifies that only Qualification types that the Requester created are returned. If false, the operation
     *        returns all Qualification types.
     */

    public void setMustBeOwnedByCaller(Boolean mustBeOwnedByCaller) {
        this.mustBeOwnedByCaller = mustBeOwnedByCaller;
    }

    /**
     * <p>
     * Specifies that only Qualification types that the Requester created are returned. If false, the operation returns
     * all Qualification types.
     * </p>
     * 
     * @return Specifies that only Qualification types that the Requester created are returned. If false, the operation
     *         returns all Qualification types.
     */

    public Boolean getMustBeOwnedByCaller() {
        return this.mustBeOwnedByCaller;
    }

    /**
     * <p>
     * Specifies that only Qualification types that the Requester created are returned. If false, the operation returns
     * all Qualification types.
     * </p>
     * 
     * @param mustBeOwnedByCaller
     *        Specifies that only Qualification types that the Requester created are returned. If false, the operation
     *        returns all Qualification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesRequest withMustBeOwnedByCaller(Boolean mustBeOwnedByCaller) {
        setMustBeOwnedByCaller(mustBeOwnedByCaller);
        return this;
    }

    /**
     * <p>
     * Specifies that only Qualification types that the Requester created are returned. If false, the operation returns
     * all Qualification types.
     * </p>
     * 
     * @return Specifies that only Qualification types that the Requester created are returned. If false, the operation
     *         returns all Qualification types.
     */

    public Boolean isMustBeOwnedByCaller() {
        return this.mustBeOwnedByCaller;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQualificationTypesRequest withMaxResults(Integer maxResults) {
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
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getMustBeRequestable() != null)
            sb.append("MustBeRequestable: ").append(getMustBeRequestable()).append(",");
        if (getMustBeOwnedByCaller() != null)
            sb.append("MustBeOwnedByCaller: ").append(getMustBeOwnedByCaller()).append(",");
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

        if (obj instanceof ListQualificationTypesRequest == false)
            return false;
        ListQualificationTypesRequest other = (ListQualificationTypesRequest) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getMustBeRequestable() == null ^ this.getMustBeRequestable() == null)
            return false;
        if (other.getMustBeRequestable() != null && other.getMustBeRequestable().equals(this.getMustBeRequestable()) == false)
            return false;
        if (other.getMustBeOwnedByCaller() == null ^ this.getMustBeOwnedByCaller() == null)
            return false;
        if (other.getMustBeOwnedByCaller() != null && other.getMustBeOwnedByCaller().equals(this.getMustBeOwnedByCaller()) == false)
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

        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getMustBeRequestable() == null) ? 0 : getMustBeRequestable().hashCode());
        hashCode = prime * hashCode + ((getMustBeOwnedByCaller() == null) ? 0 : getMustBeOwnedByCaller().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListQualificationTypesRequest clone() {
        return (ListQualificationTypesRequest) super.clone();
    }

}
