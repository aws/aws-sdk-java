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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Captures the status of a Gremlin query (see the <a
 * href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-api-status.html">Gremlin query status API</a>
 * page).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GremlinQueryStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GremlinQueryStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Gremlin query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The query string of the Gremlin query.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The query statistics of the Gremlin query.
     * </p>
     */
    private QueryEvalStats queryEvalStats;

    /**
     * <p>
     * The ID of the Gremlin query.
     * </p>
     * 
     * @param queryId
     *        The ID of the Gremlin query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the Gremlin query.
     * </p>
     * 
     * @return The ID of the Gremlin query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the Gremlin query.
     * </p>
     * 
     * @param queryId
     *        The ID of the Gremlin query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GremlinQueryStatus withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The query string of the Gremlin query.
     * </p>
     * 
     * @param queryString
     *        The query string of the Gremlin query.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string of the Gremlin query.
     * </p>
     * 
     * @return The query string of the Gremlin query.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string of the Gremlin query.
     * </p>
     * 
     * @param queryString
     *        The query string of the Gremlin query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GremlinQueryStatus withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The query statistics of the Gremlin query.
     * </p>
     * 
     * @param queryEvalStats
     *        The query statistics of the Gremlin query.
     */

    public void setQueryEvalStats(QueryEvalStats queryEvalStats) {
        this.queryEvalStats = queryEvalStats;
    }

    /**
     * <p>
     * The query statistics of the Gremlin query.
     * </p>
     * 
     * @return The query statistics of the Gremlin query.
     */

    public QueryEvalStats getQueryEvalStats() {
        return this.queryEvalStats;
    }

    /**
     * <p>
     * The query statistics of the Gremlin query.
     * </p>
     * 
     * @param queryEvalStats
     *        The query statistics of the Gremlin query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GremlinQueryStatus withQueryEvalStats(QueryEvalStats queryEvalStats) {
        setQueryEvalStats(queryEvalStats);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getQueryEvalStats() != null)
            sb.append("QueryEvalStats: ").append(getQueryEvalStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GremlinQueryStatus == false)
            return false;
        GremlinQueryStatus other = (GremlinQueryStatus) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryEvalStats() == null ^ this.getQueryEvalStats() == null)
            return false;
        if (other.getQueryEvalStats() != null && other.getQueryEvalStats().equals(this.getQueryEvalStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryEvalStats() == null) ? 0 : getQueryEvalStats().hashCode());
        return hashCode;
    }

    @Override
    public GremlinQueryStatus clone() {
        try {
            return (GremlinQueryStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.GremlinQueryStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
