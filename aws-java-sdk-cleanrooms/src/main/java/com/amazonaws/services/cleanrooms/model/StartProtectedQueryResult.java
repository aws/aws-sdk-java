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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartProtectedQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The protected query.
     * </p>
     */
    private ProtectedQuery protectedQuery;

    /**
     * <p>
     * The protected query.
     * </p>
     * 
     * @param protectedQuery
     *        The protected query.
     */

    public void setProtectedQuery(ProtectedQuery protectedQuery) {
        this.protectedQuery = protectedQuery;
    }

    /**
     * <p>
     * The protected query.
     * </p>
     * 
     * @return The protected query.
     */

    public ProtectedQuery getProtectedQuery() {
        return this.protectedQuery;
    }

    /**
     * <p>
     * The protected query.
     * </p>
     * 
     * @param protectedQuery
     *        The protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProtectedQueryResult withProtectedQuery(ProtectedQuery protectedQuery) {
        setProtectedQuery(protectedQuery);
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
        if (getProtectedQuery() != null)
            sb.append("ProtectedQuery: ").append(getProtectedQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProtectedQueryResult == false)
            return false;
        StartProtectedQueryResult other = (StartProtectedQueryResult) obj;
        if (other.getProtectedQuery() == null ^ this.getProtectedQuery() == null)
            return false;
        if (other.getProtectedQuery() != null && other.getProtectedQuery().equals(this.getProtectedQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectedQuery() == null) ? 0 : getProtectedQuery().hashCode());
        return hashCode;
    }

    @Override
    public StartProtectedQueryResult clone() {
        try {
            return (StartProtectedQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
