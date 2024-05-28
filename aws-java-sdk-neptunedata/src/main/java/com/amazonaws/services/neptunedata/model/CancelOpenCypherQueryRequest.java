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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CancelOpenCypherQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelOpenCypherQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the openCypher query to cancel.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * </p>
     */
    private Boolean silent;

    /**
     * <p>
     * The unique ID of the openCypher query to cancel.
     * </p>
     * 
     * @param queryId
     *        The unique ID of the openCypher query to cancel.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The unique ID of the openCypher query to cancel.
     * </p>
     * 
     * @return The unique ID of the openCypher query to cancel.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The unique ID of the openCypher query to cancel.
     * </p>
     * 
     * @param queryId
     *        The unique ID of the openCypher query to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelOpenCypherQueryRequest withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * </p>
     * 
     * @param silent
     *        If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     */

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * </p>
     * 
     * @return If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     */

    public Boolean getSilent() {
        return this.silent;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * </p>
     * 
     * @param silent
     *        If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelOpenCypherQueryRequest withSilent(Boolean silent) {
        setSilent(silent);
        return this;
    }

    /**
     * <p>
     * If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     * </p>
     * 
     * @return If set to <code>TRUE</code>, causes the cancelation of the openCypher query to happen silently.
     */

    public Boolean isSilent() {
        return this.silent;
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
        if (getSilent() != null)
            sb.append("Silent: ").append(getSilent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelOpenCypherQueryRequest == false)
            return false;
        CancelOpenCypherQueryRequest other = (CancelOpenCypherQueryRequest) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getSilent() == null ^ this.getSilent() == null)
            return false;
        if (other.getSilent() != null && other.getSilent().equals(this.getSilent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getSilent() == null) ? 0 : getSilent().hashCode());
        return hashCode;
    }

    @Override
    public CancelOpenCypherQueryRequest clone() {
        return (CancelOpenCypherQueryRequest) super.clone();
    }

}
