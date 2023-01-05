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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary of the migration workflow.
     * </p>
     */
    private java.util.List<MigrationWorkflowSummary> migrationWorkflowSummary;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary of the migration workflow.
     * </p>
     * 
     * @return The summary of the migration workflow.
     */

    public java.util.List<MigrationWorkflowSummary> getMigrationWorkflowSummary() {
        return migrationWorkflowSummary;
    }

    /**
     * <p>
     * The summary of the migration workflow.
     * </p>
     * 
     * @param migrationWorkflowSummary
     *        The summary of the migration workflow.
     */

    public void setMigrationWorkflowSummary(java.util.Collection<MigrationWorkflowSummary> migrationWorkflowSummary) {
        if (migrationWorkflowSummary == null) {
            this.migrationWorkflowSummary = null;
            return;
        }

        this.migrationWorkflowSummary = new java.util.ArrayList<MigrationWorkflowSummary>(migrationWorkflowSummary);
    }

    /**
     * <p>
     * The summary of the migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMigrationWorkflowSummary(java.util.Collection)} or
     * {@link #withMigrationWorkflowSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param migrationWorkflowSummary
     *        The summary of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withMigrationWorkflowSummary(MigrationWorkflowSummary... migrationWorkflowSummary) {
        if (this.migrationWorkflowSummary == null) {
            setMigrationWorkflowSummary(new java.util.ArrayList<MigrationWorkflowSummary>(migrationWorkflowSummary.length));
        }
        for (MigrationWorkflowSummary ele : migrationWorkflowSummary) {
            this.migrationWorkflowSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of the migration workflow.
     * </p>
     * 
     * @param migrationWorkflowSummary
     *        The summary of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withMigrationWorkflowSummary(java.util.Collection<MigrationWorkflowSummary> migrationWorkflowSummary) {
        setMigrationWorkflowSummary(migrationWorkflowSummary);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMigrationWorkflowSummary() != null)
            sb.append("MigrationWorkflowSummary: ").append(getMigrationWorkflowSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsResult == false)
            return false;
        ListWorkflowsResult other = (ListWorkflowsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMigrationWorkflowSummary() == null ^ this.getMigrationWorkflowSummary() == null)
            return false;
        if (other.getMigrationWorkflowSummary() != null && other.getMigrationWorkflowSummary().equals(this.getMigrationWorkflowSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMigrationWorkflowSummary() == null) ? 0 : getMigrationWorkflowSummary().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsResult clone() {
        try {
            return (ListWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
