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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A search filter defines which resources can be part of a search query result set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/SearchFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string that contains the search keywords, prefixes, and operators to control the results that can be returned
     * by a <a>Search</a> operation. For more details, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax</a>.
     * </p>
     */
    private String filterString;

    /**
     * <p>
     * The string that contains the search keywords, prefixes, and operators to control the results that can be returned
     * by a <a>Search</a> operation. For more details, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax</a>.
     * </p>
     * 
     * @param filterString
     *        The string that contains the search keywords, prefixes, and operators to control the results that can be
     *        returned by a <a>Search</a> operation. For more details, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search
     *        query syntax</a>.
     */

    public void setFilterString(String filterString) {
        this.filterString = filterString;
    }

    /**
     * <p>
     * The string that contains the search keywords, prefixes, and operators to control the results that can be returned
     * by a <a>Search</a> operation. For more details, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax</a>.
     * </p>
     * 
     * @return The string that contains the search keywords, prefixes, and operators to control the results that can be
     *         returned by a <a>Search</a> operation. For more details, see <a
     *         href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search
     *         query syntax</a>.
     */

    public String getFilterString() {
        return this.filterString;
    }

    /**
     * <p>
     * The string that contains the search keywords, prefixes, and operators to control the results that can be returned
     * by a <a>Search</a> operation. For more details, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax</a>.
     * </p>
     * 
     * @param filterString
     *        The string that contains the search keywords, prefixes, and operators to control the results that can be
     *        returned by a <a>Search</a> operation. For more details, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search
     *        query syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilter withFilterString(String filterString) {
        setFilterString(filterString);
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
        if (getFilterString() != null)
            sb.append("FilterString: ").append(getFilterString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFilter == false)
            return false;
        SearchFilter other = (SearchFilter) obj;
        if (other.getFilterString() == null ^ this.getFilterString() == null)
            return false;
        if (other.getFilterString() != null && other.getFilterString().equals(this.getFilterString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterString() == null) ? 0 : getFilterString().hashCode());
        return hashCode;
    }

    @Override
    public SearchFilter clone() {
        try {
            return (SearchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.SearchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
