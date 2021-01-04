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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFHIRDatastoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * All properties associated with the listed Data Stores.
     * </p>
     */
    private java.util.List<DatastoreProperties> datastorePropertiesList;
    /**
     * <p>
     * Pagination token that can be used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * All properties associated with the listed Data Stores.
     * </p>
     * 
     * @return All properties associated with the listed Data Stores.
     */

    public java.util.List<DatastoreProperties> getDatastorePropertiesList() {
        return datastorePropertiesList;
    }

    /**
     * <p>
     * All properties associated with the listed Data Stores.
     * </p>
     * 
     * @param datastorePropertiesList
     *        All properties associated with the listed Data Stores.
     */

    public void setDatastorePropertiesList(java.util.Collection<DatastoreProperties> datastorePropertiesList) {
        if (datastorePropertiesList == null) {
            this.datastorePropertiesList = null;
            return;
        }

        this.datastorePropertiesList = new java.util.ArrayList<DatastoreProperties>(datastorePropertiesList);
    }

    /**
     * <p>
     * All properties associated with the listed Data Stores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatastorePropertiesList(java.util.Collection)} or
     * {@link #withDatastorePropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param datastorePropertiesList
     *        All properties associated with the listed Data Stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresResult withDatastorePropertiesList(DatastoreProperties... datastorePropertiesList) {
        if (this.datastorePropertiesList == null) {
            setDatastorePropertiesList(new java.util.ArrayList<DatastoreProperties>(datastorePropertiesList.length));
        }
        for (DatastoreProperties ele : datastorePropertiesList) {
            this.datastorePropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All properties associated with the listed Data Stores.
     * </p>
     * 
     * @param datastorePropertiesList
     *        All properties associated with the listed Data Stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresResult withDatastorePropertiesList(java.util.Collection<DatastoreProperties> datastorePropertiesList) {
        setDatastorePropertiesList(datastorePropertiesList);
        return this;
    }

    /**
     * <p>
     * Pagination token that can be used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token that can be used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token that can be used to retrieve the next page of results.
     * </p>
     * 
     * @return Pagination token that can be used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token that can be used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token that can be used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRDatastoresResult withNextToken(String nextToken) {
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
        if (getDatastorePropertiesList() != null)
            sb.append("DatastorePropertiesList: ").append(getDatastorePropertiesList()).append(",");
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

        if (obj instanceof ListFHIRDatastoresResult == false)
            return false;
        ListFHIRDatastoresResult other = (ListFHIRDatastoresResult) obj;
        if (other.getDatastorePropertiesList() == null ^ this.getDatastorePropertiesList() == null)
            return false;
        if (other.getDatastorePropertiesList() != null && other.getDatastorePropertiesList().equals(this.getDatastorePropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getDatastorePropertiesList() == null) ? 0 : getDatastorePropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFHIRDatastoresResult clone() {
        try {
            return (ListFHIRDatastoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
