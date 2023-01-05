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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateDataCellsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataCellsFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     * </p>
     */
    private DataCellsFilter tableData;

    /**
     * <p>
     * A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     * </p>
     * 
     * @param tableData
     *        A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     */

    public void setTableData(DataCellsFilter tableData) {
        this.tableData = tableData;
    }

    /**
     * <p>
     * A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     * </p>
     * 
     * @return A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     */

    public DataCellsFilter getTableData() {
        return this.tableData;
    }

    /**
     * <p>
     * A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     * </p>
     * 
     * @param tableData
     *        A <code>DataCellsFilter</code> structure containing information about the data cells filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataCellsFilterRequest withTableData(DataCellsFilter tableData) {
        setTableData(tableData);
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
        if (getTableData() != null)
            sb.append("TableData: ").append(getTableData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataCellsFilterRequest == false)
            return false;
        CreateDataCellsFilterRequest other = (CreateDataCellsFilterRequest) obj;
        if (other.getTableData() == null ^ this.getTableData() == null)
            return false;
        if (other.getTableData() != null && other.getTableData().equals(this.getTableData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableData() == null) ? 0 : getTableData().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataCellsFilterRequest clone() {
        return (CreateDataCellsFilterRequest) super.clone();
    }

}
