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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the query parameter to match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/QueryParameterMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryParameterMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The exact query parameter to match on.
     * </p>
     */
    private String exact;

    /**
     * <p>
     * The exact query parameter to match on.
     * </p>
     * 
     * @param exact
     *        The exact query parameter to match on.
     */

    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * The exact query parameter to match on.
     * </p>
     * 
     * @return The exact query parameter to match on.
     */

    public String getExact() {
        return this.exact;
    }

    /**
     * <p>
     * The exact query parameter to match on.
     * </p>
     * 
     * @param exact
     *        The exact query parameter to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryParameterMatch withExact(String exact) {
        setExact(exact);
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
        if (getExact() != null)
            sb.append("Exact: ").append(getExact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryParameterMatch == false)
            return false;
        QueryParameterMatch other = (QueryParameterMatch) obj;
        if (other.getExact() == null ^ this.getExact() == null)
            return false;
        if (other.getExact() != null && other.getExact().equals(this.getExact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        return hashCode;
    }

    @Override
    public QueryParameterMatch clone() {
        try {
            return (QueryParameterMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.QueryParameterMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
