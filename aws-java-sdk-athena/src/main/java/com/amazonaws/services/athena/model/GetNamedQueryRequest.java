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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNamedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     */
    private String namedQueryId;

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     * 
     * @param namedQueryId
     *        The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     */

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     * 
     * @return The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     */

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    /**
     * <p>
     * The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * </p>
     * 
     * @param namedQueryId
     *        The unique ID of the query. Use <a>ListNamedQueries</a> to get query IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNamedQueryRequest withNamedQueryId(String namedQueryId) {
        setNamedQueryId(namedQueryId);
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
        if (getNamedQueryId() != null)
            sb.append("NamedQueryId: ").append(getNamedQueryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNamedQueryRequest == false)
            return false;
        GetNamedQueryRequest other = (GetNamedQueryRequest) obj;
        if (other.getNamedQueryId() == null ^ this.getNamedQueryId() == null)
            return false;
        if (other.getNamedQueryId() != null && other.getNamedQueryId().equals(this.getNamedQueryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedQueryId() == null) ? 0 : getNamedQueryId().hashCode());
        return hashCode;
    }

    @Override
    public GetNamedQueryRequest clone() {
        return (GetNamedQueryRequest) super.clone();
    }

}
