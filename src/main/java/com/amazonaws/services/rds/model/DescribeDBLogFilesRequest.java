/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBLogFiles(DescribeDBLogFilesRequest) DescribeDBLogFiles operation}.
 * <p>
 * Returns a list of DB log files for the DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBLogFiles(DescribeDBLogFilesRequest)
 */
public class DescribeDBLogFilesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The customer-assigned name of the DB instance that contains the log
     * files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * Filters the available log files for log file names that contain the
     * specified string.
     */
    private String filenameContains;

    /**
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format.
     */
    private Long fileLastWritten;

    /**
     * Filters the available log files for files larger than the specified
     * size.
     */
    private Long fileSize;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved.
     */
    private Integer maxRecords;

    /**
     * The pagination token provided in the previous request. If this
     * parameter is specified the response includes only records beyond the
     * marker, up to MaxRecords.
     */
    private String marker;

    /**
     * The customer-assigned name of the DB instance that contains the log
     * files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @return The customer-assigned name of the DB instance that contains the log
     *         files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     *         to 63 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The customer-assigned name of the DB instance that contains the log
     * files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The customer-assigned name of the DB instance that contains the log
     *         files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     *         to 63 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The customer-assigned name of the DB instance that contains the log
     * files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The customer-assigned name of the DB instance that contains the log
     *         files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     *         to 63 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * Filters the available log files for log file names that contain the
     * specified string.
     *
     * @return Filters the available log files for log file names that contain the
     *         specified string.
     */
    public String getFilenameContains() {
        return filenameContains;
    }
    
    /**
     * Filters the available log files for log file names that contain the
     * specified string.
     *
     * @param filenameContains Filters the available log files for log file names that contain the
     *         specified string.
     */
    public void setFilenameContains(String filenameContains) {
        this.filenameContains = filenameContains;
    }
    
    /**
     * Filters the available log files for log file names that contain the
     * specified string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filenameContains Filters the available log files for log file names that contain the
     *         specified string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withFilenameContains(String filenameContains) {
        this.filenameContains = filenameContains;
        return this;
    }

    /**
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format.
     *
     * @return Filters the available log files for files written since the specified
     *         date, in POSIX timestamp format.
     */
    public Long getFileLastWritten() {
        return fileLastWritten;
    }
    
    /**
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format.
     *
     * @param fileLastWritten Filters the available log files for files written since the specified
     *         date, in POSIX timestamp format.
     */
    public void setFileLastWritten(Long fileLastWritten) {
        this.fileLastWritten = fileLastWritten;
    }
    
    /**
     * Filters the available log files for files written since the specified
     * date, in POSIX timestamp format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fileLastWritten Filters the available log files for files written since the specified
     *         date, in POSIX timestamp format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withFileLastWritten(Long fileLastWritten) {
        this.fileLastWritten = fileLastWritten;
        return this;
    }

    /**
     * Filters the available log files for files larger than the specified
     * size.
     *
     * @return Filters the available log files for files larger than the specified
     *         size.
     */
    public Long getFileSize() {
        return fileSize;
    }
    
    /**
     * Filters the available log files for files larger than the specified
     * size.
     *
     * @param fileSize Filters the available log files for files larger than the specified
     *         size.
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
    
    /**
     * Filters the available log files for files larger than the specified
     * size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fileSize Filters the available log files for files larger than the specified
     *         size.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified MaxRecords value, a pagination token
     * called a marker is included in the response so that the remaining
     * results can be retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified MaxRecords value, a pagination token
     *         called a marker is included in the response so that the remaining
     *         results can be retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * The pagination token provided in the previous request. If this
     * parameter is specified the response includes only records beyond the
     * marker, up to MaxRecords.
     *
     * @return The pagination token provided in the previous request. If this
     *         parameter is specified the response includes only records beyond the
     *         marker, up to MaxRecords.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token provided in the previous request. If this
     * parameter is specified the response includes only records beyond the
     * marker, up to MaxRecords.
     *
     * @param marker The pagination token provided in the previous request. If this
     *         parameter is specified the response includes only records beyond the
     *         marker, up to MaxRecords.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token provided in the previous request. If this
     * parameter is specified the response includes only records beyond the
     * marker, up to MaxRecords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The pagination token provided in the previous request. If this
     *         parameter is specified the response includes only records beyond the
     *         marker, up to MaxRecords.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getFilenameContains() != null) sb.append("FilenameContains: " + getFilenameContains() + ",");
        if (getFileLastWritten() != null) sb.append("FileLastWritten: " + getFileLastWritten() + ",");
        if (getFileSize() != null) sb.append("FileSize: " + getFileSize() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getFilenameContains() == null) ? 0 : getFilenameContains().hashCode()); 
        hashCode = prime * hashCode + ((getFileLastWritten() == null) ? 0 : getFileLastWritten().hashCode()); 
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBLogFilesRequest == false) return false;
        DescribeDBLogFilesRequest other = (DescribeDBLogFilesRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getFilenameContains() == null ^ this.getFilenameContains() == null) return false;
        if (other.getFilenameContains() != null && other.getFilenameContains().equals(this.getFilenameContains()) == false) return false; 
        if (other.getFileLastWritten() == null ^ this.getFileLastWritten() == null) return false;
        if (other.getFileLastWritten() != null && other.getFileLastWritten().equals(this.getFileLastWritten()) == false) return false; 
        if (other.getFileSize() == null ^ this.getFileSize() == null) return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    