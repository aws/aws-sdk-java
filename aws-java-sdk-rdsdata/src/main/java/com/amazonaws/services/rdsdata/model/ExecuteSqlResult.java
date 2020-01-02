/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response elements represent the output of a request to run one or more SQL statements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteSqlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The results of the SQL statement or statements.
     * </p>
     */
    private java.util.List<SqlStatementResult> sqlStatementResults;

    /**
     * <p>
     * The results of the SQL statement or statements.
     * </p>
     * 
     * @return The results of the SQL statement or statements.
     */

    public java.util.List<SqlStatementResult> getSqlStatementResults() {
        return sqlStatementResults;
    }

    /**
     * <p>
     * The results of the SQL statement or statements.
     * </p>
     * 
     * @param sqlStatementResults
     *        The results of the SQL statement or statements.
     */

    public void setSqlStatementResults(java.util.Collection<SqlStatementResult> sqlStatementResults) {
        if (sqlStatementResults == null) {
            this.sqlStatementResults = null;
            return;
        }

        this.sqlStatementResults = new java.util.ArrayList<SqlStatementResult>(sqlStatementResults);
    }

    /**
     * <p>
     * The results of the SQL statement or statements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqlStatementResults(java.util.Collection)} or {@link #withSqlStatementResults(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sqlStatementResults
     *        The results of the SQL statement or statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlResult withSqlStatementResults(SqlStatementResult... sqlStatementResults) {
        if (this.sqlStatementResults == null) {
            setSqlStatementResults(new java.util.ArrayList<SqlStatementResult>(sqlStatementResults.length));
        }
        for (SqlStatementResult ele : sqlStatementResults) {
            this.sqlStatementResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the SQL statement or statements.
     * </p>
     * 
     * @param sqlStatementResults
     *        The results of the SQL statement or statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteSqlResult withSqlStatementResults(java.util.Collection<SqlStatementResult> sqlStatementResults) {
        setSqlStatementResults(sqlStatementResults);
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
        if (getSqlStatementResults() != null)
            sb.append("SqlStatementResults: ").append(getSqlStatementResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteSqlResult == false)
            return false;
        ExecuteSqlResult other = (ExecuteSqlResult) obj;
        if (other.getSqlStatementResults() == null ^ this.getSqlStatementResults() == null)
            return false;
        if (other.getSqlStatementResults() != null && other.getSqlStatementResults().equals(this.getSqlStatementResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlStatementResults() == null) ? 0 : getSqlStatementResults().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteSqlResult clone() {
        try {
            return (ExecuteSqlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
