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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A prepared SQL statement for use with Athena.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/PreparedStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreparedStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the prepared statement.
     * </p>
     */
    private String statementName;
    /**
     * <p>
     * The query string for the prepared statement.
     * </p>
     */
    private String queryStatement;
    /**
     * <p>
     * The name of the workgroup to which the prepared statement belongs.
     * </p>
     */
    private String workGroupName;
    /**
     * <p>
     * The description of the prepared statement.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The last modified time of the prepared statement.
     * </p>
     */
    private java.util.Date lastModifiedTime;

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

    public PreparedStatement withStatementName(String statementName) {
        setStatementName(statementName);
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

    public PreparedStatement withQueryStatement(String queryStatement) {
        setQueryStatement(queryStatement);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statement belongs.
     * </p>
     * 
     * @param workGroupName
     *        The name of the workgroup to which the prepared statement belongs.
     */

    public void setWorkGroupName(String workGroupName) {
        this.workGroupName = workGroupName;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statement belongs.
     * </p>
     * 
     * @return The name of the workgroup to which the prepared statement belongs.
     */

    public String getWorkGroupName() {
        return this.workGroupName;
    }

    /**
     * <p>
     * The name of the workgroup to which the prepared statement belongs.
     * </p>
     * 
     * @param workGroupName
     *        The name of the workgroup to which the prepared statement belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreparedStatement withWorkGroupName(String workGroupName) {
        setWorkGroupName(workGroupName);
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

    public PreparedStatement withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The last modified time of the prepared statement.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the prepared statement.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the prepared statement.
     * </p>
     * 
     * @return The last modified time of the prepared statement.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time of the prepared statement.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time of the prepared statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreparedStatement withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getQueryStatement() != null)
            sb.append("QueryStatement: ").append(getQueryStatement()).append(",");
        if (getWorkGroupName() != null)
            sb.append("WorkGroupName: ").append(getWorkGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreparedStatement == false)
            return false;
        PreparedStatement other = (PreparedStatement) obj;
        if (other.getStatementName() == null ^ this.getStatementName() == null)
            return false;
        if (other.getStatementName() != null && other.getStatementName().equals(this.getStatementName()) == false)
            return false;
        if (other.getQueryStatement() == null ^ this.getQueryStatement() == null)
            return false;
        if (other.getQueryStatement() != null && other.getQueryStatement().equals(this.getQueryStatement()) == false)
            return false;
        if (other.getWorkGroupName() == null ^ this.getWorkGroupName() == null)
            return false;
        if (other.getWorkGroupName() != null && other.getWorkGroupName().equals(this.getWorkGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        hashCode = prime * hashCode + ((getQueryStatement() == null) ? 0 : getQueryStatement().hashCode());
        hashCode = prime * hashCode + ((getWorkGroupName() == null) ? 0 : getWorkGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public PreparedStatement clone() {
        try {
            return (PreparedStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.PreparedStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
