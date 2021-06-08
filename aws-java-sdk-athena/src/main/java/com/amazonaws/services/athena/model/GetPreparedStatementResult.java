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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPreparedStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the prepared statement that was retrieved.
     * </p>
     */
    private PreparedStatement preparedStatement;

    /**
     * <p>
     * The name of the prepared statement that was retrieved.
     * </p>
     * 
     * @param preparedStatement
     *        The name of the prepared statement that was retrieved.
     */

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    /**
     * <p>
     * The name of the prepared statement that was retrieved.
     * </p>
     * 
     * @return The name of the prepared statement that was retrieved.
     */

    public PreparedStatement getPreparedStatement() {
        return this.preparedStatement;
    }

    /**
     * <p>
     * The name of the prepared statement that was retrieved.
     * </p>
     * 
     * @param preparedStatement
     *        The name of the prepared statement that was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPreparedStatementResult withPreparedStatement(PreparedStatement preparedStatement) {
        setPreparedStatement(preparedStatement);
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
        if (getPreparedStatement() != null)
            sb.append("PreparedStatement: ").append(getPreparedStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPreparedStatementResult == false)
            return false;
        GetPreparedStatementResult other = (GetPreparedStatementResult) obj;
        if (other.getPreparedStatement() == null ^ this.getPreparedStatement() == null)
            return false;
        if (other.getPreparedStatement() != null && other.getPreparedStatement().equals(this.getPreparedStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreparedStatement() == null) ? 0 : getPreparedStatement().hashCode());
        return hashCode;
    }

    @Override
    public GetPreparedStatementResult clone() {
        try {
            return (GetPreparedStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
