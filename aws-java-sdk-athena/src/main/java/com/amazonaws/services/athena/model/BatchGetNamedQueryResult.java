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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetNamedQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     */
    private java.util.List<NamedQuery> namedQueries;
    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     */
    private java.util.List<UnprocessedNamedQueryId> unprocessedNamedQueryIds;

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * 
     * @return Information about the named query IDs submitted.
     */

    public java.util.List<NamedQuery> getNamedQueries() {
        return namedQueries;
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * 
     * @param namedQueries
     *        Information about the named query IDs submitted.
     */

    public void setNamedQueries(java.util.Collection<NamedQuery> namedQueries) {
        if (namedQueries == null) {
            this.namedQueries = null;
            return;
        }

        this.namedQueries = new java.util.ArrayList<NamedQuery>(namedQueries);
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamedQueries(java.util.Collection)} or {@link #withNamedQueries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param namedQueries
     *        Information about the named query IDs submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryResult withNamedQueries(NamedQuery... namedQueries) {
        if (this.namedQueries == null) {
            setNamedQueries(new java.util.ArrayList<NamedQuery>(namedQueries.length));
        }
        for (NamedQuery ele : namedQueries) {
            this.namedQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * 
     * @param namedQueries
     *        Information about the named query IDs submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryResult withNamedQueries(java.util.Collection<NamedQuery> namedQueries) {
        setNamedQueries(namedQueries);
        return this;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * 
     * @return Information about provided query IDs.
     */

    public java.util.List<UnprocessedNamedQueryId> getUnprocessedNamedQueryIds() {
        return unprocessedNamedQueryIds;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * 
     * @param unprocessedNamedQueryIds
     *        Information about provided query IDs.
     */

    public void setUnprocessedNamedQueryIds(java.util.Collection<UnprocessedNamedQueryId> unprocessedNamedQueryIds) {
        if (unprocessedNamedQueryIds == null) {
            this.unprocessedNamedQueryIds = null;
            return;
        }

        this.unprocessedNamedQueryIds = new java.util.ArrayList<UnprocessedNamedQueryId>(unprocessedNamedQueryIds);
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedNamedQueryIds(java.util.Collection)} or
     * {@link #withUnprocessedNamedQueryIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedNamedQueryIds
     *        Information about provided query IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryResult withUnprocessedNamedQueryIds(UnprocessedNamedQueryId... unprocessedNamedQueryIds) {
        if (this.unprocessedNamedQueryIds == null) {
            setUnprocessedNamedQueryIds(new java.util.ArrayList<UnprocessedNamedQueryId>(unprocessedNamedQueryIds.length));
        }
        for (UnprocessedNamedQueryId ele : unprocessedNamedQueryIds) {
            this.unprocessedNamedQueryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * 
     * @param unprocessedNamedQueryIds
     *        Information about provided query IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryResult withUnprocessedNamedQueryIds(java.util.Collection<UnprocessedNamedQueryId> unprocessedNamedQueryIds) {
        setUnprocessedNamedQueryIds(unprocessedNamedQueryIds);
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
        if (getNamedQueries() != null)
            sb.append("NamedQueries: ").append(getNamedQueries()).append(",");
        if (getUnprocessedNamedQueryIds() != null)
            sb.append("UnprocessedNamedQueryIds: ").append(getUnprocessedNamedQueryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetNamedQueryResult == false)
            return false;
        BatchGetNamedQueryResult other = (BatchGetNamedQueryResult) obj;
        if (other.getNamedQueries() == null ^ this.getNamedQueries() == null)
            return false;
        if (other.getNamedQueries() != null && other.getNamedQueries().equals(this.getNamedQueries()) == false)
            return false;
        if (other.getUnprocessedNamedQueryIds() == null ^ this.getUnprocessedNamedQueryIds() == null)
            return false;
        if (other.getUnprocessedNamedQueryIds() != null && other.getUnprocessedNamedQueryIds().equals(this.getUnprocessedNamedQueryIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedQueries() == null) ? 0 : getNamedQueries().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedNamedQueryIds() == null) ? 0 : getUnprocessedNamedQueryIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetNamedQueryResult clone() {
        try {
            return (BatchGetNamedQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
