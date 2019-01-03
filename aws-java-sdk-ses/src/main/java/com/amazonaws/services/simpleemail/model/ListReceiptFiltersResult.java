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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of IP address filters that exist under your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReceiptFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to
     * allow or block mail from it.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReceiptFilter> filters;

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to
     * allow or block mail from it.
     * </p>
     * 
     * @return A list of IP address filter data structures, which each consist of a name, an IP address range, and
     *         whether to allow or block mail from it.
     */

    public java.util.List<ReceiptFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<ReceiptFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to
     * allow or block mail from it.
     * </p>
     * 
     * @param filters
     *        A list of IP address filter data structures, which each consist of a name, an IP address range, and
     *        whether to allow or block mail from it.
     */

    public void setFilters(java.util.Collection<ReceiptFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<ReceiptFilter>(filters);
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to
     * allow or block mail from it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of IP address filter data structures, which each consist of a name, an IP address range, and
     *        whether to allow or block mail from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptFiltersResult withFilters(ReceiptFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<ReceiptFilter>(filters.length));
        }
        for (ReceiptFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to
     * allow or block mail from it.
     * </p>
     * 
     * @param filters
     *        A list of IP address filter data structures, which each consist of a name, an IP address range, and
     *        whether to allow or block mail from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptFiltersResult withFilters(java.util.Collection<ReceiptFilter> filters) {
        setFilters(filters);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReceiptFiltersResult == false)
            return false;
        ListReceiptFiltersResult other = (ListReceiptFiltersResult) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListReceiptFiltersResult clone() {
        try {
            return (ListReceiptFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
