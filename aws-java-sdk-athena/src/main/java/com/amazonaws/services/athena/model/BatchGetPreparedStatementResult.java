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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetPreparedStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of prepared statements returned.
     * </p>
     */
    private java.util.List<PreparedStatement> preparedStatements;
    /**
     * <p>
     * A list of one or more prepared statements that were requested but could not be returned.
     * </p>
     */
    private java.util.List<UnprocessedPreparedStatementName> unprocessedPreparedStatementNames;

    /**
     * <p>
     * The list of prepared statements returned.
     * </p>
     * 
     * @return The list of prepared statements returned.
     */

    public java.util.List<PreparedStatement> getPreparedStatements() {
        return preparedStatements;
    }

    /**
     * <p>
     * The list of prepared statements returned.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements returned.
     */

    public void setPreparedStatements(java.util.Collection<PreparedStatement> preparedStatements) {
        if (preparedStatements == null) {
            this.preparedStatements = null;
            return;
        }

        this.preparedStatements = new java.util.ArrayList<PreparedStatement>(preparedStatements);
    }

    /**
     * <p>
     * The list of prepared statements returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreparedStatements(java.util.Collection)} or {@link #withPreparedStatements(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementResult withPreparedStatements(PreparedStatement... preparedStatements) {
        if (this.preparedStatements == null) {
            setPreparedStatements(new java.util.ArrayList<PreparedStatement>(preparedStatements.length));
        }
        for (PreparedStatement ele : preparedStatements) {
            this.preparedStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of prepared statements returned.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementResult withPreparedStatements(java.util.Collection<PreparedStatement> preparedStatements) {
        setPreparedStatements(preparedStatements);
        return this;
    }

    /**
     * <p>
     * A list of one or more prepared statements that were requested but could not be returned.
     * </p>
     * 
     * @return A list of one or more prepared statements that were requested but could not be returned.
     */

    public java.util.List<UnprocessedPreparedStatementName> getUnprocessedPreparedStatementNames() {
        return unprocessedPreparedStatementNames;
    }

    /**
     * <p>
     * A list of one or more prepared statements that were requested but could not be returned.
     * </p>
     * 
     * @param unprocessedPreparedStatementNames
     *        A list of one or more prepared statements that were requested but could not be returned.
     */

    public void setUnprocessedPreparedStatementNames(java.util.Collection<UnprocessedPreparedStatementName> unprocessedPreparedStatementNames) {
        if (unprocessedPreparedStatementNames == null) {
            this.unprocessedPreparedStatementNames = null;
            return;
        }

        this.unprocessedPreparedStatementNames = new java.util.ArrayList<UnprocessedPreparedStatementName>(unprocessedPreparedStatementNames);
    }

    /**
     * <p>
     * A list of one or more prepared statements that were requested but could not be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedPreparedStatementNames(java.util.Collection)} or
     * {@link #withUnprocessedPreparedStatementNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedPreparedStatementNames
     *        A list of one or more prepared statements that were requested but could not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementResult withUnprocessedPreparedStatementNames(UnprocessedPreparedStatementName... unprocessedPreparedStatementNames) {
        if (this.unprocessedPreparedStatementNames == null) {
            setUnprocessedPreparedStatementNames(new java.util.ArrayList<UnprocessedPreparedStatementName>(unprocessedPreparedStatementNames.length));
        }
        for (UnprocessedPreparedStatementName ele : unprocessedPreparedStatementNames) {
            this.unprocessedPreparedStatementNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more prepared statements that were requested but could not be returned.
     * </p>
     * 
     * @param unprocessedPreparedStatementNames
     *        A list of one or more prepared statements that were requested but could not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetPreparedStatementResult withUnprocessedPreparedStatementNames(
            java.util.Collection<UnprocessedPreparedStatementName> unprocessedPreparedStatementNames) {
        setUnprocessedPreparedStatementNames(unprocessedPreparedStatementNames);
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
        if (getPreparedStatements() != null)
            sb.append("PreparedStatements: ").append(getPreparedStatements()).append(",");
        if (getUnprocessedPreparedStatementNames() != null)
            sb.append("UnprocessedPreparedStatementNames: ").append(getUnprocessedPreparedStatementNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetPreparedStatementResult == false)
            return false;
        BatchGetPreparedStatementResult other = (BatchGetPreparedStatementResult) obj;
        if (other.getPreparedStatements() == null ^ this.getPreparedStatements() == null)
            return false;
        if (other.getPreparedStatements() != null && other.getPreparedStatements().equals(this.getPreparedStatements()) == false)
            return false;
        if (other.getUnprocessedPreparedStatementNames() == null ^ this.getUnprocessedPreparedStatementNames() == null)
            return false;
        if (other.getUnprocessedPreparedStatementNames() != null
                && other.getUnprocessedPreparedStatementNames().equals(this.getUnprocessedPreparedStatementNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreparedStatements() == null) ? 0 : getPreparedStatements().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedPreparedStatementNames() == null) ? 0 : getUnprocessedPreparedStatementNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetPreparedStatementResult clone() {
        try {
            return (BatchGetPreparedStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
