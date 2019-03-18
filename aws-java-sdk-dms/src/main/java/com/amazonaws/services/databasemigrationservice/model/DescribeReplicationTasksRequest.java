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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     * replication-instance-arn
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large.
     * Choose TRUE to use this flag, otherwise choose FALSE (default).
     * </p>
     */
    private Boolean withoutSettings;

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     * replication-instance-arn
     * </p>
     * 
     * @return Filters applied to the describe action.</p>
     *         <p>
     *         Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     *         replication-instance-arn
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     * replication-instance-arn
     * </p>
     * 
     * @param filters
     *        Filters applied to the describe action.</p>
     *        <p>
     *        Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     *        replication-instance-arn
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     * replication-instance-arn
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters applied to the describe action.</p>
     *        <p>
     *        Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     *        replication-instance-arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters applied to the describe action.
     * </p>
     * <p>
     * Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     * replication-instance-arn
     * </p>
     * 
     * @param filters
     *        Filters applied to the describe action.</p>
     *        <p>
     *        Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn |
     *        replication-instance-arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *         remaining results can be retrieved. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large.
     * Choose TRUE to use this flag, otherwise choose FALSE (default).
     * </p>
     * 
     * @param withoutSettings
     *        Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too
     *        large. Choose TRUE to use this flag, otherwise choose FALSE (default).
     */

    public void setWithoutSettings(Boolean withoutSettings) {
        this.withoutSettings = withoutSettings;
    }

    /**
     * <p>
     * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large.
     * Choose TRUE to use this flag, otherwise choose FALSE (default).
     * </p>
     * 
     * @return Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too
     *         large. Choose TRUE to use this flag, otherwise choose FALSE (default).
     */

    public Boolean getWithoutSettings() {
        return this.withoutSettings;
    }

    /**
     * <p>
     * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large.
     * Choose TRUE to use this flag, otherwise choose FALSE (default).
     * </p>
     * 
     * @param withoutSettings
     *        Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too
     *        large. Choose TRUE to use this flag, otherwise choose FALSE (default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksRequest withWithoutSettings(Boolean withoutSettings) {
        setWithoutSettings(withoutSettings);
        return this;
    }

    /**
     * <p>
     * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large.
     * Choose TRUE to use this flag, otherwise choose FALSE (default).
     * </p>
     * 
     * @return Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too
     *         large. Choose TRUE to use this flag, otherwise choose FALSE (default).
     */

    public Boolean isWithoutSettings() {
        return this.withoutSettings;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getWithoutSettings() != null)
            sb.append("WithoutSettings: ").append(getWithoutSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTasksRequest == false)
            return false;
        DescribeReplicationTasksRequest other = (DescribeReplicationTasksRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getWithoutSettings() == null ^ this.getWithoutSettings() == null)
            return false;
        if (other.getWithoutSettings() != null && other.getWithoutSettings().equals(this.getWithoutSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getWithoutSettings() == null) ? 0 : getWithoutSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTasksRequest clone() {
        return (DescribeReplicationTasksRequest) super.clone();
    }

}
