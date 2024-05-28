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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinExplainQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteGremlinExplainQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Gremlin explain query string.
     * </p>
     */
    private String gremlinQuery;

    /**
     * <p>
     * The Gremlin explain query string.
     * </p>
     * 
     * @param gremlinQuery
     *        The Gremlin explain query string.
     */

    public void setGremlinQuery(String gremlinQuery) {
        this.gremlinQuery = gremlinQuery;
    }

    /**
     * <p>
     * The Gremlin explain query string.
     * </p>
     * 
     * @return The Gremlin explain query string.
     */

    public String getGremlinQuery() {
        return this.gremlinQuery;
    }

    /**
     * <p>
     * The Gremlin explain query string.
     * </p>
     * 
     * @param gremlinQuery
     *        The Gremlin explain query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinExplainQueryRequest withGremlinQuery(String gremlinQuery) {
        setGremlinQuery(gremlinQuery);
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
        if (getGremlinQuery() != null)
            sb.append("GremlinQuery: ").append(getGremlinQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteGremlinExplainQueryRequest == false)
            return false;
        ExecuteGremlinExplainQueryRequest other = (ExecuteGremlinExplainQueryRequest) obj;
        if (other.getGremlinQuery() == null ^ this.getGremlinQuery() == null)
            return false;
        if (other.getGremlinQuery() != null && other.getGremlinQuery().equals(this.getGremlinQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGremlinQuery() == null) ? 0 : getGremlinQuery().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteGremlinExplainQueryRequest clone() {
        return (ExecuteGremlinExplainQueryRequest) super.clone();
    }

}
