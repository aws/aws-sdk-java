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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request for creating a data view.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique Dataset identifier that is used to create a Dataview.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     */
    private Boolean autoUpdate;
    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     */
    private java.util.List<String> sortColumns;
    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     */
    private java.util.List<String> partitionColumns;
    /**
     * <p>
     * Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long asOfTimestamp;
    /**
     * <p>
     * Options that define the destination type for the Dataview.
     * </p>
     */
    private DataViewDestinationTypeParams destinationTypeParams;

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique Dataset identifier that is used to create a Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique Dataset identifier that is used to create a Dataview.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique Dataset identifier that is used to create a Dataview.
     * </p>
     * 
     * @return The unique Dataset identifier that is used to create a Dataview.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique Dataset identifier that is used to create a Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique Dataset identifier that is used to create a Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     * 
     * @param autoUpdate
     *        Flag to indicate Dataview should be updated automatically.
     */

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     * 
     * @return Flag to indicate Dataview should be updated automatically.
     */

    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     * 
     * @param autoUpdate
     *        Flag to indicate Dataview should be updated automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withAutoUpdate(Boolean autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     * 
     * @return Flag to indicate Dataview should be updated automatically.
     */

    public Boolean isAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     * 
     * @return Columns to be used for sorting the data.
     */

    public java.util.List<String> getSortColumns() {
        return sortColumns;
    }

    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     * 
     * @param sortColumns
     *        Columns to be used for sorting the data.
     */

    public void setSortColumns(java.util.Collection<String> sortColumns) {
        if (sortColumns == null) {
            this.sortColumns = null;
            return;
        }

        this.sortColumns = new java.util.ArrayList<String>(sortColumns);
    }

    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortColumns(java.util.Collection)} or {@link #withSortColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortColumns
     *        Columns to be used for sorting the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withSortColumns(String... sortColumns) {
        if (this.sortColumns == null) {
            setSortColumns(new java.util.ArrayList<String>(sortColumns.length));
        }
        for (String ele : sortColumns) {
            this.sortColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     * 
     * @param sortColumns
     *        Columns to be used for sorting the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withSortColumns(java.util.Collection<String> sortColumns) {
        setSortColumns(sortColumns);
        return this;
    }

    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     * 
     * @return Ordered set of column names used to partition data.
     */

    public java.util.List<String> getPartitionColumns() {
        return partitionColumns;
    }

    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     * 
     * @param partitionColumns
     *        Ordered set of column names used to partition data.
     */

    public void setPartitionColumns(java.util.Collection<String> partitionColumns) {
        if (partitionColumns == null) {
            this.partitionColumns = null;
            return;
        }

        this.partitionColumns = new java.util.ArrayList<String>(partitionColumns);
    }

    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionColumns(java.util.Collection)} or {@link #withPartitionColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionColumns
     *        Ordered set of column names used to partition data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withPartitionColumns(String... partitionColumns) {
        if (this.partitionColumns == null) {
            setPartitionColumns(new java.util.ArrayList<String>(partitionColumns.length));
        }
        for (String ele : partitionColumns) {
            this.partitionColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     * 
     * @param partitionColumns
     *        Ordered set of column names used to partition data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withPartitionColumns(java.util.Collection<String> partitionColumns) {
        setPartitionColumns(partitionColumns);
        return this;
    }

    /**
     * <p>
     * Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param asOfTimestamp
     *        Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setAsOfTimestamp(Long asOfTimestamp) {
        this.asOfTimestamp = asOfTimestamp;
    }

    /**
     * <p>
     * Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getAsOfTimestamp() {
        return this.asOfTimestamp;
    }

    /**
     * <p>
     * Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param asOfTimestamp
     *        Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withAsOfTimestamp(Long asOfTimestamp) {
        setAsOfTimestamp(asOfTimestamp);
        return this;
    }

    /**
     * <p>
     * Options that define the destination type for the Dataview.
     * </p>
     * 
     * @param destinationTypeParams
     *        Options that define the destination type for the Dataview.
     */

    public void setDestinationTypeParams(DataViewDestinationTypeParams destinationTypeParams) {
        this.destinationTypeParams = destinationTypeParams;
    }

    /**
     * <p>
     * Options that define the destination type for the Dataview.
     * </p>
     * 
     * @return Options that define the destination type for the Dataview.
     */

    public DataViewDestinationTypeParams getDestinationTypeParams() {
        return this.destinationTypeParams;
    }

    /**
     * <p>
     * Options that define the destination type for the Dataview.
     * </p>
     * 
     * @param destinationTypeParams
     *        Options that define the destination type for the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewRequest withDestinationTypeParams(DataViewDestinationTypeParams destinationTypeParams) {
        setDestinationTypeParams(destinationTypeParams);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
        if (getSortColumns() != null)
            sb.append("SortColumns: ").append(getSortColumns()).append(",");
        if (getPartitionColumns() != null)
            sb.append("PartitionColumns: ").append(getPartitionColumns()).append(",");
        if (getAsOfTimestamp() != null)
            sb.append("AsOfTimestamp: ").append(getAsOfTimestamp()).append(",");
        if (getDestinationTypeParams() != null)
            sb.append("DestinationTypeParams: ").append(getDestinationTypeParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataViewRequest == false)
            return false;
        CreateDataViewRequest other = (CreateDataViewRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getSortColumns() == null ^ this.getSortColumns() == null)
            return false;
        if (other.getSortColumns() != null && other.getSortColumns().equals(this.getSortColumns()) == false)
            return false;
        if (other.getPartitionColumns() == null ^ this.getPartitionColumns() == null)
            return false;
        if (other.getPartitionColumns() != null && other.getPartitionColumns().equals(this.getPartitionColumns()) == false)
            return false;
        if (other.getAsOfTimestamp() == null ^ this.getAsOfTimestamp() == null)
            return false;
        if (other.getAsOfTimestamp() != null && other.getAsOfTimestamp().equals(this.getAsOfTimestamp()) == false)
            return false;
        if (other.getDestinationTypeParams() == null ^ this.getDestinationTypeParams() == null)
            return false;
        if (other.getDestinationTypeParams() != null && other.getDestinationTypeParams().equals(this.getDestinationTypeParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getSortColumns() == null) ? 0 : getSortColumns().hashCode());
        hashCode = prime * hashCode + ((getPartitionColumns() == null) ? 0 : getPartitionColumns().hashCode());
        hashCode = prime * hashCode + ((getAsOfTimestamp() == null) ? 0 : getAsOfTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDestinationTypeParams() == null) ? 0 : getDestinationTypeParams().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataViewRequest clone() {
        return (CreateDataViewRequest) super.clone();
    }

}
