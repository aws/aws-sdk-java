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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMigrationTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists the migration task's summary which includes: <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the <code>UpdateDateTime</code> for each task.
     * </p>
     */
    private java.util.List<MigrationTaskSummary> migrationTaskSummaryList;

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more migration tasks than the max result, return the next token to be passed to the next call
     *        as a bookmark of where to start from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @return If there are more migration tasks than the max result, return the next token to be passed to the next
     *         call as a bookmark of where to start from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more migration tasks than the max result, return the next token to be passed to the next call
     *        as a bookmark of where to start from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes: <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the <code>UpdateDateTime</code> for each task.
     * </p>
     * 
     * @return Lists the migration task's summary which includes: <code>MigrationTaskName</code>,
     *         <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     *         <code>UpdateDateTime</code> for each task.
     */

    public java.util.List<MigrationTaskSummary> getMigrationTaskSummaryList() {
        return migrationTaskSummaryList;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes: <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the <code>UpdateDateTime</code> for each task.
     * </p>
     * 
     * @param migrationTaskSummaryList
     *        Lists the migration task's summary which includes: <code>MigrationTaskName</code>,
     *        <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     *        <code>UpdateDateTime</code> for each task.
     */

    public void setMigrationTaskSummaryList(java.util.Collection<MigrationTaskSummary> migrationTaskSummaryList) {
        if (migrationTaskSummaryList == null) {
            this.migrationTaskSummaryList = null;
            return;
        }

        this.migrationTaskSummaryList = new java.util.ArrayList<MigrationTaskSummary>(migrationTaskSummaryList);
    }

    /**
     * <p>
     * Lists the migration task's summary which includes: <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the <code>UpdateDateTime</code> for each task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMigrationTaskSummaryList(java.util.Collection)} or
     * {@link #withMigrationTaskSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param migrationTaskSummaryList
     *        Lists the migration task's summary which includes: <code>MigrationTaskName</code>,
     *        <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     *        <code>UpdateDateTime</code> for each task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksResult withMigrationTaskSummaryList(MigrationTaskSummary... migrationTaskSummaryList) {
        if (this.migrationTaskSummaryList == null) {
            setMigrationTaskSummaryList(new java.util.ArrayList<MigrationTaskSummary>(migrationTaskSummaryList.length));
        }
        for (MigrationTaskSummary ele : migrationTaskSummaryList) {
            this.migrationTaskSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes: <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the <code>UpdateDateTime</code> for each task.
     * </p>
     * 
     * @param migrationTaskSummaryList
     *        Lists the migration task's summary which includes: <code>MigrationTaskName</code>,
     *        <code>ProgressPercent</code>, <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     *        <code>UpdateDateTime</code> for each task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksResult withMigrationTaskSummaryList(java.util.Collection<MigrationTaskSummary> migrationTaskSummaryList) {
        setMigrationTaskSummaryList(migrationTaskSummaryList);
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
        if (getMigrationTaskSummaryList() != null)
            sb.append("MigrationTaskSummaryList: ").append(getMigrationTaskSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMigrationTasksResult == false)
            return false;
        ListMigrationTasksResult other = (ListMigrationTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMigrationTaskSummaryList() == null ^ this.getMigrationTaskSummaryList() == null)
            return false;
        if (other.getMigrationTaskSummaryList() != null && other.getMigrationTaskSummaryList().equals(this.getMigrationTaskSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskSummaryList() == null) ? 0 : getMigrationTaskSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListMigrationTasksResult clone() {
        try {
            return (ListMigrationTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
