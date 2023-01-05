/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CancelQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the canceled query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are either
     * <code>RUNNING</code> or <code>CANCELLED</code>.
     * </p>
     */
    private String queryStatus;

    /**
     * <p>
     * The ID of the canceled query.
     * </p>
     * 
     * @param queryId
     *        The ID of the canceled query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the canceled query.
     * </p>
     * 
     * @return The ID of the canceled query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the canceled query.
     * </p>
     * 
     * @param queryId
     *        The ID of the canceled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelQueryResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are either
     * <code>RUNNING</code> or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are
     *        either <code>RUNNING</code> or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are either
     * <code>RUNNING</code> or <code>CANCELLED</code>.
     * </p>
     * 
     * @return Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are
     *         either <code>RUNNING</code> or <code>CANCELLED</code>.
     * @see QueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are either
     * <code>RUNNING</code> or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are
     *        either <code>RUNNING</code> or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public CancelQueryResult withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are either
     * <code>RUNNING</code> or <code>CANCELLED</code>.
     * </p>
     * 
     * @param queryStatus
     *        Shows the status of a query after a <code>CancelQuery</code> request. Typically, the values shown are
     *        either <code>RUNNING</code> or <code>CANCELLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryStatus
     */

    public CancelQueryResult withQueryStatus(QueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
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
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelQueryResult == false)
            return false;
        CancelQueryResult other = (CancelQueryResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        return hashCode;
    }

    @Override
    public CancelQueryResult clone() {
        try {
            return (CancelQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
