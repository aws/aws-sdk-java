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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteStoredQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStoredQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the query that you want to delete.
     * </p>
     */
    private String queryName;

    /**
     * <p>
     * The name of the query that you want to delete.
     * </p>
     * 
     * @param queryName
     *        The name of the query that you want to delete.
     */

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    /**
     * <p>
     * The name of the query that you want to delete.
     * </p>
     * 
     * @return The name of the query that you want to delete.
     */

    public String getQueryName() {
        return this.queryName;
    }

    /**
     * <p>
     * The name of the query that you want to delete.
     * </p>
     * 
     * @param queryName
     *        The name of the query that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStoredQueryRequest withQueryName(String queryName) {
        setQueryName(queryName);
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
        if (getQueryName() != null)
            sb.append("QueryName: ").append(getQueryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStoredQueryRequest == false)
            return false;
        DeleteStoredQueryRequest other = (DeleteStoredQueryRequest) obj;
        if (other.getQueryName() == null ^ this.getQueryName() == null)
            return false;
        if (other.getQueryName() != null && other.getQueryName().equals(this.getQueryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryName() == null) ? 0 : getQueryName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStoredQueryRequest clone() {
        return (DeleteStoredQueryRequest) super.clone();
    }

}
