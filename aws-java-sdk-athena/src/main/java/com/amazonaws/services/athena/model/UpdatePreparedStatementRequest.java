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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePreparedStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the prepared statement.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * The workgroup for the prepared statement.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The query string for the prepared statement.
     * </p>
     */
    private String queryStatement;
    /**
     * <p>
     * The description of the prepared statement.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the prepared statement.
     * </p>
     * 
     * @param statementName
     *        The name of the prepared statement.
     */

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    /**
     * <p>
     * The name of the prepared statement.
     * </p>
     * 
     * @return The name of the prepared statement.
     */

    public String getStatementName() {
        return this.statementName;
    }

    /**
     * <p>
     * The name of the prepared statement.
     * </p>
     * 
     * @param statementName
     *        The name of the prepared statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePreparedStatementRequest withStatementName(String statementName) {
        setStatementName(statementName);
        return this;
    }

    /**
     * <p>
     * The workgroup for the prepared statement.
     * </p>
     * 
     * @param workGroup
     *        The workgroup for the prepared statement.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The workgroup for the prepared statement.
     * </p>
     * 
     * @return The workgroup for the prepared statement.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The workgroup for the prepared statement.
     * </p>
     * 
     * @param workGroup
     *        The workgroup for the prepared statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePreparedStatementRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The query string for the prepared statement.
     * </p>
     * 
     * @param queryStatement
     *        The query string for the prepared statement.
     */

    public void setQueryStatement(String queryStatement) {
        this.queryStatement = queryStatement;
    }

    /**
     * <p>
     * The query string for the prepared statement.
     * </p>
     * 
     * @return The query string for the prepared statement.
     */

    public String getQueryStatement() {
        return this.queryStatement;
    }

    /**
     * <p>
     * The query string for the prepared statement.
     * </p>
     * 
     * @param queryStatement
     *        The query string for the prepared statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePreparedStatementRequest withQueryStatement(String queryStatement) {
        setQueryStatement(queryStatement);
        return this;
    }

    /**
     * <p>
     * The description of the prepared statement.
     * </p>
     * 
     * @param description
     *        The description of the prepared statement.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the prepared statement.
     * </p>
     * 
     * @return The description of the prepared statement.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the prepared statement.
     * </p>
     * 
     * @param description
     *        The description of the prepared statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePreparedStatementRequest withDescription(String description) {
        setDescription(description);
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
        if (getStatementName() != null)
            sb.append("StatementName: ").append(getStatementName()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getQueryStatement() != null)
            sb.append("QueryStatement: ").append(getQueryStatement()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePreparedStatementRequest == false)
            return false;
        UpdatePreparedStatementRequest other = (UpdatePreparedStatementRequest) obj;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getQueryStatement() == null ^ this.getQueryStatement() == null)
            return false;
        if (other.getQueryStatement() != null && other.getQueryStatement().equals(this.getQueryStatement()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getQueryStatement() == null) ? 0 : getQueryStatement().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePreparedStatementRequest clone() {
        return (UpdatePreparedStatementRequest) super.clone();
    }

}
