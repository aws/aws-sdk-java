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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBLogFilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Filters the available log files for log file names that contain the specified string.
     * </p>
     */
    private String filenameContains;
    /**
     * <p>
     * Filters the available log files for files written since the specified date, in POSIX timestamp format with
     * milliseconds.
     * </p>
     */
    private Long fileLastWritten;
    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     */
    private Long fileSize;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a pagination token called a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to MaxRecords.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The customer-assigned name of the DB instance that contains the log files you want to list.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The customer-assigned name of the DB instance that contains the log files you want to list.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBInstance.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the DB instance that contains the log files you want to list.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The customer-assigned name of the DB instance that contains the log files you want to list.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBInstance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the specified string.
     * </p>
     * 
     * @param filenameContains
     *        Filters the available log files for log file names that contain the specified string.
     */

    public void setFilenameContains(String filenameContains) {
        this.filenameContains = filenameContains;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the specified string.
     * </p>
     * 
     * @return Filters the available log files for log file names that contain the specified string.
     */

    public String getFilenameContains() {
        return this.filenameContains;
    }

    /**
     * <p>
     * Filters the available log files for log file names that contain the specified string.
     * </p>
     * 
     * @param filenameContains
     *        Filters the available log files for log file names that contain the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withFilenameContains(String filenameContains) {
        setFilenameContains(filenameContains);
        return this;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified date, in POSIX timestamp format with
     * milliseconds.
     * </p>
     * 
     * @param fileLastWritten
     *        Filters the available log files for files written since the specified date, in POSIX timestamp format with
     *        milliseconds.
     */

    public void setFileLastWritten(Long fileLastWritten) {
        this.fileLastWritten = fileLastWritten;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified date, in POSIX timestamp format with
     * milliseconds.
     * </p>
     * 
     * @return Filters the available log files for files written since the specified date, in POSIX timestamp format
     *         with milliseconds.
     */

    public Long getFileLastWritten() {
        return this.fileLastWritten;
    }

    /**
     * <p>
     * Filters the available log files for files written since the specified date, in POSIX timestamp format with
     * milliseconds.
     * </p>
     * 
     * @param fileLastWritten
     *        Filters the available log files for files written since the specified date, in POSIX timestamp format with
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withFileLastWritten(Long fileLastWritten) {
        setFileLastWritten(fileLastWritten);
        return this;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     * 
     * @param fileSize
     *        Filters the available log files for files larger than the specified size.
     */

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     * 
     * @return Filters the available log files for files larger than the specified size.
     */

    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * <p>
     * Filters the available log files for files larger than the specified size.
     * </p>
     * 
     * @param fileSize
     *        Filters the available log files for files larger than the specified size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withFileSize(Long fileSize) {
        setFileSize(fileSize);
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withFilters(Filter... filters) {
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
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a pagination token called a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a pagination token called a marker is included in the response so that the remaining
     *        results can be retrieved.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a pagination token called a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxRecords value, a pagination token called a marker is included in the response so that the remaining
     *         results can be retrieved.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a pagination token called a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a pagination token called a marker is included in the response so that the remaining
     *        results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to MaxRecords.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to MaxRecords.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to MaxRecords.
     * </p>
     * 
     * @return The pagination token provided in the previous request. If this parameter is specified the response
     *         includes only records beyond the marker, up to MaxRecords.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to MaxRecords.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to MaxRecords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getFilenameContains() != null)
            sb.append("FilenameContains: ").append(getFilenameContains()).append(",");
        if (getFileLastWritten() != null)
            sb.append("FileLastWritten: ").append(getFileLastWritten()).append(",");
        if (getFileSize() != null)
            sb.append("FileSize: ").append(getFileSize()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBLogFilesRequest == false)
            return false;
        DescribeDBLogFilesRequest other = (DescribeDBLogFilesRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getFilenameContains() == null ^ this.getFilenameContains() == null)
            return false;
        if (other.getFilenameContains() != null && other.getFilenameContains().equals(this.getFilenameContains()) == false)
            return false;
        if (other.getFileLastWritten() == null ^ this.getFileLastWritten() == null)
            return false;
        if (other.getFileLastWritten() != null && other.getFileLastWritten().equals(this.getFileLastWritten()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilenameContains() == null) ? 0 : getFilenameContains().hashCode());
        hashCode = prime * hashCode + ((getFileLastWritten() == null) ? 0 : getFileLastWritten().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBLogFilesRequest clone() {
        return (DescribeDBLogFilesRequest) super.clone();
    }

}
