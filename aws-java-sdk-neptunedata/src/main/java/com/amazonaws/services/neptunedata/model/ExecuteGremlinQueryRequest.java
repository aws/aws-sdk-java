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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteGremlinQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     * interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     * >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     * </p>
     */
    private String gremlinQuery;
    /**
     * <p>
     * If non-null, the query results are returned in a serialized response message in the format specified by this
     * parameter. See the <a href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section
     * in the TinkerPop documentation for a list of the formats that are currently supported.
     * </p>
     */
    private String serializer;

    /**
     * <p>
     * Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     * interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     * >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     * </p>
     * 
     * @param gremlinQuery
     *        Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     *        interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     *        >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     */

    public void setGremlinQuery(String gremlinQuery) {
        this.gremlinQuery = gremlinQuery;
    }

    /**
     * <p>
     * Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     * interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     * >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     * </p>
     * 
     * @return Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     *         interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     *         "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     *         >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     */

    public String getGremlinQuery() {
        return this.gremlinQuery;
    }

    /**
     * <p>
     * Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     * interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     * >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     * </p>
     * 
     * @param gremlinQuery
     *        Using this API, you can run Gremlin queries in string format much as you can using the HTTP endpoint. The
     *        interface is compatible with whatever Gremlin version your DB cluster is using (see the <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/access-graph-gremlin-client.html#best-practices-gremlin-java-latest"
     *        >Tinkerpop client section</a> to determine which Gremlin releases your engine version supports).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinQueryRequest withGremlinQuery(String gremlinQuery) {
        setGremlinQuery(gremlinQuery);
        return this;
    }

    /**
     * <p>
     * If non-null, the query results are returned in a serialized response message in the format specified by this
     * parameter. See the <a href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section
     * in the TinkerPop documentation for a list of the formats that are currently supported.
     * </p>
     * 
     * @param serializer
     *        If non-null, the query results are returned in a serialized response message in the format specified by
     *        this parameter. See the <a
     *        href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section in the
     *        TinkerPop documentation for a list of the formats that are currently supported.
     */

    public void setSerializer(String serializer) {
        this.serializer = serializer;
    }

    /**
     * <p>
     * If non-null, the query results are returned in a serialized response message in the format specified by this
     * parameter. See the <a href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section
     * in the TinkerPop documentation for a list of the formats that are currently supported.
     * </p>
     * 
     * @return If non-null, the query results are returned in a serialized response message in the format specified by
     *         this parameter. See the <a
     *         href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section in the
     *         TinkerPop documentation for a list of the formats that are currently supported.
     */

    public String getSerializer() {
        return this.serializer;
    }

    /**
     * <p>
     * If non-null, the query results are returned in a serialized response message in the format specified by this
     * parameter. See the <a href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section
     * in the TinkerPop documentation for a list of the formats that are currently supported.
     * </p>
     * 
     * @param serializer
     *        If non-null, the query results are returned in a serialized response message in the format specified by
     *        this parameter. See the <a
     *        href="https://tinkerpop.apache.org/docs/current/reference/#_graphson">GraphSON</a> section in the
     *        TinkerPop documentation for a list of the formats that are currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinQueryRequest withSerializer(String serializer) {
        setSerializer(serializer);
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
            sb.append("GremlinQuery: ").append(getGremlinQuery()).append(",");
        if (getSerializer() != null)
            sb.append("Serializer: ").append(getSerializer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteGremlinQueryRequest == false)
            return false;
        ExecuteGremlinQueryRequest other = (ExecuteGremlinQueryRequest) obj;
        if (other.getGremlinQuery() == null ^ this.getGremlinQuery() == null)
            return false;
        if (other.getGremlinQuery() != null && other.getGremlinQuery().equals(this.getGremlinQuery()) == false)
            return false;
        if (other.getSerializer() == null ^ this.getSerializer() == null)
            return false;
        if (other.getSerializer() != null && other.getSerializer().equals(this.getSerializer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGremlinQuery() == null) ? 0 : getGremlinQuery().hashCode());
        hashCode = prime * hashCode + ((getSerializer() == null) ? 0 : getSerializer().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteGremlinQueryRequest clone() {
        return (ExecuteGremlinQueryRequest) super.clone();
    }

}
