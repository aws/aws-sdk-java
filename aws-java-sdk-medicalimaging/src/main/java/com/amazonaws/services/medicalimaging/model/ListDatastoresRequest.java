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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDatastores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatastoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data store status.
     * </p>
     */
    private String datastoreStatus;
    /**
     * <p>
     * The pagination token used to request the list of data stores on the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 50.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @return The data store status.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public ListDatastoresRequest withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public ListDatastoresRequest withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token used to request the list of data stores on the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to request the list of data stores on the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to request the list of data stores on the next page.
     * </p>
     * 
     * @return The pagination token used to request the list of data stores on the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to request the list of data stores on the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to request the list of data stores on the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatastoresRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 50.
     * </p>
     * 
     * @param maxResults
     *        Valid Range: Minimum value of 1. Maximum value of 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 50.
     * </p>
     * 
     * @return Valid Range: Minimum value of 1. Maximum value of 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 50.
     * </p>
     * 
     * @param maxResults
     *        Valid Range: Minimum value of 1. Maximum value of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatastoresRequest withMaxResults(Integer maxResults) {
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
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus()).append(",");
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

        if (obj instanceof ListDatastoresRequest == false)
            return false;
        ListDatastoresRequest other = (ListDatastoresRequest) obj;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
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

        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDatastoresRequest clone() {
        return (ListDatastoresRequest) super.clone();
    }

}
