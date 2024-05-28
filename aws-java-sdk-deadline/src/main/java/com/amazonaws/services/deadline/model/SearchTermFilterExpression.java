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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Searches for a particular search term.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTermFilterExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTermFilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The term to search for.
     * </p>
     */
    private String searchTerm;

    /**
     * <p>
     * The term to search for.
     * </p>
     * 
     * @param searchTerm
     *        The term to search for.
     */

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * <p>
     * The term to search for.
     * </p>
     * 
     * @return The term to search for.
     */

    public String getSearchTerm() {
        return this.searchTerm;
    }

    /**
     * <p>
     * The term to search for.
     * </p>
     * 
     * @param searchTerm
     *        The term to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTermFilterExpression withSearchTerm(String searchTerm) {
        setSearchTerm(searchTerm);
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
        if (getSearchTerm() != null)
            sb.append("SearchTerm: ").append(getSearchTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTermFilterExpression == false)
            return false;
        SearchTermFilterExpression other = (SearchTermFilterExpression) obj;
        if (other.getSearchTerm() == null ^ this.getSearchTerm() == null)
            return false;
        if (other.getSearchTerm() != null && other.getSearchTerm().equals(this.getSearchTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchTerm() == null) ? 0 : getSearchTerm().hashCode());
        return hashCode;
    }

    @Override
    public SearchTermFilterExpression clone() {
        try {
            return (SearchTermFilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SearchTermFilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
