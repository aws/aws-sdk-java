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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetColumnStatisticsForTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetColumnStatisticsForTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     */
    private java.util.List<ColumnStatistics> columnStatisticsList;
    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     */
    private java.util.List<ColumnError> errors;

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @return List of ColumnStatistics that failed to be retrieved.
     */

    public java.util.List<ColumnStatistics> getColumnStatisticsList() {
        return columnStatisticsList;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @param columnStatisticsList
     *        List of ColumnStatistics that failed to be retrieved.
     */

    public void setColumnStatisticsList(java.util.Collection<ColumnStatistics> columnStatisticsList) {
        if (columnStatisticsList == null) {
            this.columnStatisticsList = null;
            return;
        }

        this.columnStatisticsList = new java.util.ArrayList<ColumnStatistics>(columnStatisticsList);
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnStatisticsList(java.util.Collection)} or {@link #withColumnStatisticsList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param columnStatisticsList
     *        List of ColumnStatistics that failed to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsForTableResult withColumnStatisticsList(ColumnStatistics... columnStatisticsList) {
        if (this.columnStatisticsList == null) {
            setColumnStatisticsList(new java.util.ArrayList<ColumnStatistics>(columnStatisticsList.length));
        }
        for (ColumnStatistics ele : columnStatisticsList) {
            this.columnStatisticsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @param columnStatisticsList
     *        List of ColumnStatistics that failed to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsForTableResult withColumnStatisticsList(java.util.Collection<ColumnStatistics> columnStatisticsList) {
        setColumnStatisticsList(columnStatisticsList);
        return this;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @return List of ColumnStatistics that failed to be retrieved.
     */

    public java.util.List<ColumnError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatistics that failed to be retrieved.
     */

    public void setErrors(java.util.Collection<ColumnError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ColumnError>(errors);
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatistics that failed to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsForTableResult withErrors(ColumnError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ColumnError>(errors.length));
        }
        for (ColumnError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ColumnStatistics that failed to be retrieved.
     * </p>
     * 
     * @param errors
     *        List of ColumnStatistics that failed to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsForTableResult withErrors(java.util.Collection<ColumnError> errors) {
        setErrors(errors);
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
        if (getColumnStatisticsList() != null)
            sb.append("ColumnStatisticsList: ").append(getColumnStatisticsList()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetColumnStatisticsForTableResult == false)
            return false;
        GetColumnStatisticsForTableResult other = (GetColumnStatisticsForTableResult) obj;
        if (other.getColumnStatisticsList() == null ^ this.getColumnStatisticsList() == null)
            return false;
        if (other.getColumnStatisticsList() != null && other.getColumnStatisticsList().equals(this.getColumnStatisticsList()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnStatisticsList() == null) ? 0 : getColumnStatisticsList().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public GetColumnStatisticsForTableResult clone() {
        try {
            return (GetColumnStatisticsForTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
