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
 * The response elements represent the output of a SQL statement over an array of data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchExecuteStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The execution results of each batch entry.
     * </p>
     */
    private java.util.List<UpdateResult> updateResults;

    /**
     * <p>
     * The execution results of each batch entry.
     * </p>
     * 
     * @return The execution results of each batch entry.
     */

    public java.util.List<UpdateResult> getUpdateResults() {
        return updateResults;
    }

    /**
     * <p>
     * The execution results of each batch entry.
     * </p>
     * 
     * @param updateResults
     *        The execution results of each batch entry.
     */

    public void setUpdateResults(java.util.Collection<UpdateResult> updateResults) {
        if (updateResults == null) {
            this.updateResults = null;
            return;
        }

        this.updateResults = new java.util.ArrayList<UpdateResult>(updateResults);
    }

    /**
     * <p>
     * The execution results of each batch entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateResults(java.util.Collection)} or {@link #withUpdateResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param updateResults
     *        The execution results of each batch entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementResult withUpdateResults(UpdateResult... updateResults) {
        if (this.updateResults == null) {
            setUpdateResults(new java.util.ArrayList<UpdateResult>(updateResults.length));
        }
        for (UpdateResult ele : updateResults) {
            this.updateResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The execution results of each batch entry.
     * </p>
     * 
     * @param updateResults
     *        The execution results of each batch entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchExecuteStatementResult withUpdateResults(java.util.Collection<UpdateResult> updateResults) {
        setUpdateResults(updateResults);
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
        if (getUpdateResults() != null)
            sb.append("UpdateResults: ").append(getUpdateResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchExecuteStatementResult == false)
            return false;
        BatchExecuteStatementResult other = (BatchExecuteStatementResult) obj;
        if (other.getUpdateResults() == null ^ this.getUpdateResults() == null)
            return false;
        if (other.getUpdateResults() != null && other.getUpdateResults().equals(this.getUpdateResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateResults() == null) ? 0 : getUpdateResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchExecuteStatementResult clone() {
        try {
            return (BatchExecuteStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
