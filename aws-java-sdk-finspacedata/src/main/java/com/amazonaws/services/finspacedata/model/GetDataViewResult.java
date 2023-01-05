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

/**
 * Response from retrieving a dataview, which includes details on the target database and table name
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Flag to indicate Dataview should be updated automatically.
     * </p>
     */
    private Boolean autoUpdate;
    /**
     * <p>
     * Ordered set of column names used to partition data.
     * </p>
     */
    private java.util.List<String> partitionColumns;
    /**
     * <p>
     * The unique identifier for the Dataset used in the Dataview.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value
     * for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long asOfTimestamp;
    /**
     * <p>
     * Information about an error that occurred for the Dataview.
     * </p>
     */
    private DataViewErrorInfo errorInfo;
    /**
     * <p>
     * The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * Columns to be used for sorting the data.
     * </p>
     */
    private java.util.List<String> sortColumns;
    /**
     * <p>
     * The unique identifier for the Dataview.
     * </p>
     */
    private String dataViewId;
    /**
     * <p>
     * The ARN identifier of the Dataview.
     * </p>
     */
    private String dataViewArn;
    /**
     * <p>
     * Options that define the destination type for the Dataview.
     * </p>
     */
    private DataViewDestinationTypeParams destinationTypeParams;
    /**
     * <p>
     * The status of a Dataview creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – Dataview creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> – Dataview creation is starting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Dataview creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – Dataview creation has been cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code> – Dataview creation has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Dataview creation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> – Dataview creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

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

    public GetDataViewResult withAutoUpdate(Boolean autoUpdate) {
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

    public GetDataViewResult withPartitionColumns(String... partitionColumns) {
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

    public GetDataViewResult withPartitionColumns(java.util.Collection<String> partitionColumns) {
        setPartitionColumns(partitionColumns);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Dataset used in the Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the Dataset used in the Dataview.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the Dataset used in the Dataview.
     * </p>
     * 
     * @return The unique identifier for the Dataset used in the Dataview.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the Dataset used in the Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the Dataset used in the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value
     * for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param asOfTimestamp
     *        Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example,
     *        the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setAsOfTimestamp(Long asOfTimestamp) {
        this.asOfTimestamp = asOfTimestamp;
    }

    /**
     * <p>
     * Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value
     * for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example,
     *         the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getAsOfTimestamp() {
        return this.asOfTimestamp;
    }

    /**
     * <p>
     * Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value
     * for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param asOfTimestamp
     *        Time range to use for the Dataview. The value is determined as epoch time in milliseconds. For example,
     *        the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withAsOfTimestamp(Long asOfTimestamp) {
        setAsOfTimestamp(asOfTimestamp);
        return this;
    }

    /**
     * <p>
     * Information about an error that occurred for the Dataview.
     * </p>
     * 
     * @param errorInfo
     *        Information about an error that occurred for the Dataview.
     */

    public void setErrorInfo(DataViewErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Information about an error that occurred for the Dataview.
     * </p>
     * 
     * @return Information about an error that occurred for the Dataview.
     */

    public DataViewErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Information about an error that occurred for the Dataview.
     * </p>
     * 
     * @param errorInfo
     *        Information about an error that occurred for the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withErrorInfo(DataViewErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that a Dataview was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Dataview was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
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

    public GetDataViewResult withSortColumns(String... sortColumns) {
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

    public GetDataViewResult withSortColumns(java.util.Collection<String> sortColumns) {
        setSortColumns(sortColumns);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Dataview.
     * </p>
     * 
     * @param dataViewId
     *        The unique identifier for the Dataview.
     */

    public void setDataViewId(String dataViewId) {
        this.dataViewId = dataViewId;
    }

    /**
     * <p>
     * The unique identifier for the Dataview.
     * </p>
     * 
     * @return The unique identifier for the Dataview.
     */

    public String getDataViewId() {
        return this.dataViewId;
    }

    /**
     * <p>
     * The unique identifier for the Dataview.
     * </p>
     * 
     * @param dataViewId
     *        The unique identifier for the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withDataViewId(String dataViewId) {
        setDataViewId(dataViewId);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the Dataview.
     * </p>
     * 
     * @param dataViewArn
     *        The ARN identifier of the Dataview.
     */

    public void setDataViewArn(String dataViewArn) {
        this.dataViewArn = dataViewArn;
    }

    /**
     * <p>
     * The ARN identifier of the Dataview.
     * </p>
     * 
     * @return The ARN identifier of the Dataview.
     */

    public String getDataViewArn() {
        return this.dataViewArn;
    }

    /**
     * <p>
     * The ARN identifier of the Dataview.
     * </p>
     * 
     * @param dataViewArn
     *        The ARN identifier of the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataViewResult withDataViewArn(String dataViewArn) {
        setDataViewArn(dataViewArn);
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

    public GetDataViewResult withDestinationTypeParams(DataViewDestinationTypeParams destinationTypeParams) {
        setDestinationTypeParams(destinationTypeParams);
        return this;
    }

    /**
     * <p>
     * The status of a Dataview creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – Dataview creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> – Dataview creation is starting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Dataview creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – Dataview creation has been cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code> – Dataview creation has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Dataview creation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> – Dataview creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a Dataview creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – Dataview creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> – Dataview creation is starting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Dataview creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – Dataview creation has been cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMEOUT</code> – Dataview creation has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Dataview creation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Dataview creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     *        </p>
     *        </li>
     * @see DataViewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a Dataview creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – Dataview creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> – Dataview creation is starting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Dataview creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – Dataview creation has been cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code> – Dataview creation has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Dataview creation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> – Dataview creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a Dataview creation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> – Dataview creation is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STARTING</code> – Dataview creation is starting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – Dataview creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> – Dataview creation has been cancelled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMEOUT</code> – Dataview creation has timed out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> – Dataview creation has succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – Dataview creation is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     *         </p>
     *         </li>
     * @see DataViewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a Dataview creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – Dataview creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> – Dataview creation is starting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Dataview creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – Dataview creation has been cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code> – Dataview creation has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Dataview creation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> – Dataview creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a Dataview creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – Dataview creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> – Dataview creation is starting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Dataview creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – Dataview creation has been cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMEOUT</code> – Dataview creation has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Dataview creation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Dataview creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataViewStatus
     */

    public GetDataViewResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a Dataview creation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – Dataview creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> – Dataview creation is starting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Dataview creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – Dataview creation has been cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code> – Dataview creation has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Dataview creation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> – Dataview creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a Dataview creation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – Dataview creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> – Dataview creation is starting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Dataview creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – Dataview creation has been cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMEOUT</code> – Dataview creation has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Dataview creation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Dataview creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_CLEANUP_FAILED</code> – Dataview creation failed and resource cleanup failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataViewStatus
     */

    public GetDataViewResult withStatus(DataViewStatus status) {
        this.status = status.toString();
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
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
        if (getPartitionColumns() != null)
            sb.append("PartitionColumns: ").append(getPartitionColumns()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getAsOfTimestamp() != null)
            sb.append("AsOfTimestamp: ").append(getAsOfTimestamp()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getSortColumns() != null)
            sb.append("SortColumns: ").append(getSortColumns()).append(",");
        if (getDataViewId() != null)
            sb.append("DataViewId: ").append(getDataViewId()).append(",");
        if (getDataViewArn() != null)
            sb.append("DataViewArn: ").append(getDataViewArn()).append(",");
        if (getDestinationTypeParams() != null)
            sb.append("DestinationTypeParams: ").append(getDestinationTypeParams()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataViewResult == false)
            return false;
        GetDataViewResult other = (GetDataViewResult) obj;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getPartitionColumns() == null ^ this.getPartitionColumns() == null)
            return false;
        if (other.getPartitionColumns() != null && other.getPartitionColumns().equals(this.getPartitionColumns()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getAsOfTimestamp() == null ^ this.getAsOfTimestamp() == null)
            return false;
        if (other.getAsOfTimestamp() != null && other.getAsOfTimestamp().equals(this.getAsOfTimestamp()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getSortColumns() == null ^ this.getSortColumns() == null)
            return false;
        if (other.getSortColumns() != null && other.getSortColumns().equals(this.getSortColumns()) == false)
            return false;
        if (other.getDataViewId() == null ^ this.getDataViewId() == null)
            return false;
        if (other.getDataViewId() != null && other.getDataViewId().equals(this.getDataViewId()) == false)
            return false;
        if (other.getDataViewArn() == null ^ this.getDataViewArn() == null)
            return false;
        if (other.getDataViewArn() != null && other.getDataViewArn().equals(this.getDataViewArn()) == false)
            return false;
        if (other.getDestinationTypeParams() == null ^ this.getDestinationTypeParams() == null)
            return false;
        if (other.getDestinationTypeParams() != null && other.getDestinationTypeParams().equals(this.getDestinationTypeParams()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getPartitionColumns() == null) ? 0 : getPartitionColumns().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getAsOfTimestamp() == null) ? 0 : getAsOfTimestamp().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getSortColumns() == null) ? 0 : getSortColumns().hashCode());
        hashCode = prime * hashCode + ((getDataViewId() == null) ? 0 : getDataViewId().hashCode());
        hashCode = prime * hashCode + ((getDataViewArn() == null) ? 0 : getDataViewArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationTypeParams() == null) ? 0 : getDestinationTypeParams().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetDataViewResult clone() {
        try {
            return (GetDataViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
