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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListImportFileTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportFileTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists information about the files you import.
     * </p>
     */
    private java.util.List<ImportFileTaskInformation> taskInfos;

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFileTaskResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists information about the files you import.
     * </p>
     * 
     * @return Lists information about the files you import.
     */

    public java.util.List<ImportFileTaskInformation> getTaskInfos() {
        return taskInfos;
    }

    /**
     * <p>
     * Lists information about the files you import.
     * </p>
     * 
     * @param taskInfos
     *        Lists information about the files you import.
     */

    public void setTaskInfos(java.util.Collection<ImportFileTaskInformation> taskInfos) {
        if (taskInfos == null) {
            this.taskInfos = null;
            return;
        }

        this.taskInfos = new java.util.ArrayList<ImportFileTaskInformation>(taskInfos);
    }

    /**
     * <p>
     * Lists information about the files you import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskInfos(java.util.Collection)} or {@link #withTaskInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param taskInfos
     *        Lists information about the files you import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFileTaskResult withTaskInfos(ImportFileTaskInformation... taskInfos) {
        if (this.taskInfos == null) {
            setTaskInfos(new java.util.ArrayList<ImportFileTaskInformation>(taskInfos.length));
        }
        for (ImportFileTaskInformation ele : taskInfos) {
            this.taskInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists information about the files you import.
     * </p>
     * 
     * @param taskInfos
     *        Lists information about the files you import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFileTaskResult withTaskInfos(java.util.Collection<ImportFileTaskInformation> taskInfos) {
        setTaskInfos(taskInfos);
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
        if (getTaskInfos() != null)
            sb.append("TaskInfos: ").append(getTaskInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImportFileTaskResult == false)
            return false;
        ListImportFileTaskResult other = (ListImportFileTaskResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTaskInfos() == null ^ this.getTaskInfos() == null)
            return false;
        if (other.getTaskInfos() != null && other.getTaskInfos().equals(this.getTaskInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTaskInfos() == null) ? 0 : getTaskInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListImportFileTaskResult clone() {
        try {
            return (ListImportFileTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
