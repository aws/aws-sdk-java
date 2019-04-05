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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<String> filterNames;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<String> getFilterNames() {
        return filterNames;
    }

    /**
     * @param filterNames
     */

    public void setFilterNames(java.util.Collection<String> filterNames) {
        if (filterNames == null) {
            this.filterNames = null;
            return;
        }

        this.filterNames = new java.util.ArrayList<String>(filterNames);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterNames(java.util.Collection)} or {@link #withFilterNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersResult withFilterNames(String... filterNames) {
        if (this.filterNames == null) {
            setFilterNames(new java.util.ArrayList<String>(filterNames.length));
        }
        for (String ele : filterNames) {
            this.filterNames.add(ele);
        }
        return this;
    }

    /**
     * @param filterNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersResult withFilterNames(java.util.Collection<String> filterNames) {
        setFilterNames(filterNames);
        return this;
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

    public ListFiltersResult withNextToken(String nextToken) {
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
        if (getFilterNames() != null)
            sb.append("FilterNames: ").append(getFilterNames()).append(",");
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

        if (obj instanceof ListFiltersResult == false)
            return false;
        ListFiltersResult other = (ListFiltersResult) obj;
        if (other.getFilterNames() == null ^ this.getFilterNames() == null)
            return false;
        if (other.getFilterNames() != null && other.getFilterNames().equals(this.getFilterNames()) == false)
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

        hashCode = prime * hashCode + ((getFilterNames() == null) ? 0 : getFilterNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFiltersResult clone() {
        try {
            return (ListFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
