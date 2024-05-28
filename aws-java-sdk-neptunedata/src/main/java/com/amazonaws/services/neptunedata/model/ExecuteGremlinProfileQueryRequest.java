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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteGremlinProfileQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteGremlinProfileQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Gremlin query string to profile.
     * </p>
     */
    private String gremlinQuery;
    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the profile
     * report. If <code>FALSE</code>, only the result count is displayed.
     * </p>
     */
    private Boolean results;
    /**
     * <p>
     * If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the string
     * contains all the results.
     * </p>
     */
    private Integer chop;
    /**
     * <p>
     * If non-null, the gathered results are returned in a serialized response message in the format specified by this
     * parameter. See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin
     * profile API in Neptune</a> for more information.
     * </p>
     */
    private String serializer;
    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations that took
     * place during query execution and serialization.
     * </p>
     */
    private Boolean indexOps;

    /**
     * <p>
     * The Gremlin query string to profile.
     * </p>
     * 
     * @param gremlinQuery
     *        The Gremlin query string to profile.
     */

    public void setGremlinQuery(String gremlinQuery) {
        this.gremlinQuery = gremlinQuery;
    }

    /**
     * <p>
     * The Gremlin query string to profile.
     * </p>
     * 
     * @return The Gremlin query string to profile.
     */

    public String getGremlinQuery() {
        return this.gremlinQuery;
    }

    /**
     * <p>
     * The Gremlin query string to profile.
     * </p>
     * 
     * @param gremlinQuery
     *        The Gremlin query string to profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinProfileQueryRequest withGremlinQuery(String gremlinQuery) {
        setGremlinQuery(gremlinQuery);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the profile
     * report. If <code>FALSE</code>, only the result count is displayed.
     * </p>
     * 
     * @param results
     *        If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the
     *        profile report. If <code>FALSE</code>, only the result count is displayed.
     */

    public void setResults(Boolean results) {
        this.results = results;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the profile
     * report. If <code>FALSE</code>, only the result count is displayed.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the
     *         profile report. If <code>FALSE</code>, only the result count is displayed.
     */

    public Boolean getResults() {
        return this.results;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the profile
     * report. If <code>FALSE</code>, only the result count is displayed.
     * </p>
     * 
     * @param results
     *        If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the
     *        profile report. If <code>FALSE</code>, only the result count is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinProfileQueryRequest withResults(Boolean results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the profile
     * report. If <code>FALSE</code>, only the result count is displayed.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, the query results are gathered and displayed as part of the
     *         profile report. If <code>FALSE</code>, only the result count is displayed.
     */

    public Boolean isResults() {
        return this.results;
    }

    /**
     * <p>
     * If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the string
     * contains all the results.
     * </p>
     * 
     * @param chop
     *        If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the
     *        string contains all the results.
     */

    public void setChop(Integer chop) {
        this.chop = chop;
    }

    /**
     * <p>
     * If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the string
     * contains all the results.
     * </p>
     * 
     * @return If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the
     *         string contains all the results.
     */

    public Integer getChop() {
        return this.chop;
    }

    /**
     * <p>
     * If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the string
     * contains all the results.
     * </p>
     * 
     * @param chop
     *        If non-zero, causes the results string to be truncated at that number of characters. If set to zero, the
     *        string contains all the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinProfileQueryRequest withChop(Integer chop) {
        setChop(chop);
        return this;
    }

    /**
     * <p>
     * If non-null, the gathered results are returned in a serialized response message in the format specified by this
     * parameter. See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin
     * profile API in Neptune</a> for more information.
     * </p>
     * 
     * @param serializer
     *        If non-null, the gathered results are returned in a serialized response message in the format specified by
     *        this parameter. See <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API
     *        in Neptune</a> for more information.
     */

    public void setSerializer(String serializer) {
        this.serializer = serializer;
    }

    /**
     * <p>
     * If non-null, the gathered results are returned in a serialized response message in the format specified by this
     * parameter. See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin
     * profile API in Neptune</a> for more information.
     * </p>
     * 
     * @return If non-null, the gathered results are returned in a serialized response message in the format specified
     *         by this parameter. See <a
     *         href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API
     *         in Neptune</a> for more information.
     */

    public String getSerializer() {
        return this.serializer;
    }

    /**
     * <p>
     * If non-null, the gathered results are returned in a serialized response message in the format specified by this
     * parameter. See <a href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin
     * profile API in Neptune</a> for more information.
     * </p>
     * 
     * @param serializer
     *        If non-null, the gathered results are returned in a serialized response message in the format specified by
     *        this parameter. See <a
     *        href="https://docs.aws.amazon.com/neptune/latest/userguide/gremlin-profile-api.html">Gremlin profile API
     *        in Neptune</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinProfileQueryRequest withSerializer(String serializer) {
        setSerializer(serializer);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations that took
     * place during query execution and serialization.
     * </p>
     * 
     * @param indexOps
     *        If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations
     *        that took place during query execution and serialization.
     */

    public void setIndexOps(Boolean indexOps) {
        this.indexOps = indexOps;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations that took
     * place during query execution and serialization.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations
     *         that took place during query execution and serialization.
     */

    public Boolean getIndexOps() {
        return this.indexOps;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations that took
     * place during query execution and serialization.
     * </p>
     * 
     * @param indexOps
     *        If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations
     *        that took place during query execution and serialization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteGremlinProfileQueryRequest withIndexOps(Boolean indexOps) {
        setIndexOps(indexOps);
        return this;
    }

    /**
     * <p>
     * If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations that took
     * place during query execution and serialization.
     * </p>
     * 
     * @return If this flag is set to <code>TRUE</code>, the results include a detailed report of all index operations
     *         that took place during query execution and serialization.
     */

    public Boolean isIndexOps() {
        return this.indexOps;
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getChop() != null)
            sb.append("Chop: ").append(getChop()).append(",");
        if (getSerializer() != null)
            sb.append("Serializer: ").append(getSerializer()).append(",");
        if (getIndexOps() != null)
            sb.append("IndexOps: ").append(getIndexOps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteGremlinProfileQueryRequest == false)
            return false;
        ExecuteGremlinProfileQueryRequest other = (ExecuteGremlinProfileQueryRequest) obj;
        if (other.getGremlinQuery() == null ^ this.getGremlinQuery() == null)
            return false;
        if (other.getGremlinQuery() != null && other.getGremlinQuery().equals(this.getGremlinQuery()) == false)
            return false;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getChop() == null ^ this.getChop() == null)
            return false;
        if (other.getChop() != null && other.getChop().equals(this.getChop()) == false)
            return false;
        if (other.getSerializer() == null ^ this.getSerializer() == null)
            return false;
        if (other.getSerializer() != null && other.getSerializer().equals(this.getSerializer()) == false)
            return false;
        if (other.getIndexOps() == null ^ this.getIndexOps() == null)
            return false;
        if (other.getIndexOps() != null && other.getIndexOps().equals(this.getIndexOps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGremlinQuery() == null) ? 0 : getGremlinQuery().hashCode());
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getChop() == null) ? 0 : getChop().hashCode());
        hashCode = prime * hashCode + ((getSerializer() == null) ? 0 : getSerializer().hashCode());
        hashCode = prime * hashCode + ((getIndexOps() == null) ? 0 : getIndexOps().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteGremlinProfileQueryRequest clone() {
        return (ExecuteGremlinProfileQueryRequest) super.clone();
    }

}
