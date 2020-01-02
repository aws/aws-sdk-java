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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sorting criteria that are used to sort the list of task runs for the machine learning transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TaskRunSortCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskRunSortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column to be used to sort the list of task runs for the machine learning transform.
     * </p>
     */
    private String column;
    /**
     * <p>
     * The sort direction to be used to sort the list of task runs for the machine learning transform.
     * </p>
     */
    private String sortDirection;

    /**
     * <p>
     * The column to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param column
     *        The column to be used to sort the list of task runs for the machine learning transform.
     * @see TaskRunSortColumnType
     */

    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * <p>
     * The column to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @return The column to be used to sort the list of task runs for the machine learning transform.
     * @see TaskRunSortColumnType
     */

    public String getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param column
     *        The column to be used to sort the list of task runs for the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunSortColumnType
     */

    public TaskRunSortCriteria withColumn(String column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The column to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param column
     *        The column to be used to sort the list of task runs for the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunSortColumnType
     */

    public TaskRunSortCriteria withColumn(TaskRunSortColumnType column) {
        this.column = column.toString();
        return this;
    }

    /**
     * <p>
     * The sort direction to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param sortDirection
     *        The sort direction to be used to sort the list of task runs for the machine learning transform.
     * @see SortDirectionType
     */

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    /**
     * <p>
     * The sort direction to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @return The sort direction to be used to sort the list of task runs for the machine learning transform.
     * @see SortDirectionType
     */

    public String getSortDirection() {
        return this.sortDirection;
    }

    /**
     * <p>
     * The sort direction to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param sortDirection
     *        The sort direction to be used to sort the list of task runs for the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirectionType
     */

    public TaskRunSortCriteria withSortDirection(String sortDirection) {
        setSortDirection(sortDirection);
        return this;
    }

    /**
     * <p>
     * The sort direction to be used to sort the list of task runs for the machine learning transform.
     * </p>
     * 
     * @param sortDirection
     *        The sort direction to be used to sort the list of task runs for the machine learning transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirectionType
     */

    public TaskRunSortCriteria withSortDirection(SortDirectionType sortDirection) {
        this.sortDirection = sortDirection.toString();
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getSortDirection() != null)
            sb.append("SortDirection: ").append(getSortDirection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRunSortCriteria == false)
            return false;
        TaskRunSortCriteria other = (TaskRunSortCriteria) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getSortDirection() == null ^ this.getSortDirection() == null)
            return false;
        if (other.getSortDirection() != null && other.getSortDirection().equals(this.getSortDirection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getSortDirection() == null) ? 0 : getSortDirection().hashCode());
        return hashCode;
    }

    @Override
    public TaskRunSortCriteria clone() {
        try {
            return (TaskRunSortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TaskRunSortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
