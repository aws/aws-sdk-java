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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeExportTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     */
    private String exportTaskIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that
     * define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you specify this
     * parameter, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified value, a
     * pagination token called a marker is included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private String maxRecords;

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        The identifier of the snapshot export task to be described.
     */

    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     * 
     * @return The identifier of the snapshot export task to be described.
     */

    public String getExportTaskIdentifier() {
        return this.exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to be described.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        The identifier of the snapshot export task to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withExportTaskIdentifier(String exportTaskIdentifier) {
        setExportTaskIdentifier(exportTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that
     * define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs
     *         that define what to include in the output.</p>
     *         <p>
     *         Supported filters include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>export-task-identifier</code> - An identifier for the snapshot export task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the export task.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that
     * define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs
     *        that define what to include in the output.</p>
     *        <p>
     *        Supported filters include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>export-task-identifier</code> - An identifier for the snapshot export task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the export task.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that
     * define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs
     *        that define what to include in the output.</p>
     *        <p>
     *        Supported filters include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>export-task-identifier</code> - An identifier for the snapshot export task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the export task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that
     * define what to include in the output.
     * </p>
     * <p>
     * Supported filters include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>export-task-identifier</code> - An identifier for the snapshot export task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the export task.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs
     *        that define what to include in the output.</p>
     *        <p>
     *        Supported filters include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>export-task-identifier</code> - An identifier for the snapshot export task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3-bucket</code> - The Amazon S3 bucket the snapshot is exported to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-arn</code> - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the export task.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you specify this
     * parameter, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you
     *        specify this parameter, the response includes only records beyond the marker, up to the value specified by
     *        the <code>MaxRecords</code> parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you specify this
     * parameter, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you
     *         specify this parameter, the response includes only records beyond the marker, up to the value specified
     *         by the <code>MaxRecords</code> parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you specify this
     * parameter, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeExportTasks</code> request. If you
     *        specify this parameter, the response includes only records beyond the marker, up to the value specified by
     *        the <code>MaxRecords</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified value, a
     * pagination token called a marker is included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified value,
     *        a pagination token called a marker is included in the response. You can use the marker in a later
     *        <code>DescribeExportTasks</code> request to retrieve the remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(String maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified value, a
     * pagination token called a marker is included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified value,
     *         a pagination token called a marker is included in the response. You can use the marker in a later
     *         <code>DescribeExportTasks</code> request to retrieve the remaining results. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public String getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified value, a
     * pagination token called a marker is included in the response. You can use the marker in a later
     * <code>DescribeExportTasks</code> request to retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified value,
     *        a pagination token called a marker is included in the response. You can use the marker in a later
     *        <code>DescribeExportTasks</code> request to retrieve the remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksRequest withMaxRecords(String maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: ").append(getExportTaskIdentifier()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksRequest == false)
            return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest) obj;
        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksRequest clone() {
        return (DescribeExportTasksRequest) super.clone();
    }

}
