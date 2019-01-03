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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNamedQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the query.
     * </p>
     */
    private NamedQuery namedQuery;

    /**
     * <p>
     * Information about the query.
     * </p>
     * 
     * @param namedQuery
     *        Information about the query.
     */

    public void setNamedQuery(NamedQuery namedQuery) {
        this.namedQuery = namedQuery;
    }

    /**
     * <p>
     * Information about the query.
     * </p>
     * 
     * @return Information about the query.
     */

    public NamedQuery getNamedQuery() {
        return this.namedQuery;
    }

    /**
     * <p>
     * Information about the query.
     * </p>
     * 
     * @param namedQuery
     *        Information about the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNamedQueryResult withNamedQuery(NamedQuery namedQuery) {
        setNamedQuery(namedQuery);
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
        if (getNamedQuery() != null)
            sb.append("NamedQuery: ").append(getNamedQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNamedQueryResult == false)
            return false;
        GetNamedQueryResult other = (GetNamedQueryResult) obj;
        if (other.getNamedQuery() == null ^ this.getNamedQuery() == null)
            return false;
        if (other.getNamedQuery() != null && other.getNamedQuery().equals(this.getNamedQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedQuery() == null) ? 0 : getNamedQuery().hashCode());
        return hashCode;
    }

    @Override
    public GetNamedQueryResult clone() {
        try {
            return (GetNamedQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
