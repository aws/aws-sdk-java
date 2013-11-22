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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#downloadDBLogFilePortion(DownloadDBLogFilePortionRequest) DownloadDBLogFilePortion operation}.
 * <p>
 * Downloads the last line of the specified log file.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#downloadDBLogFilePortion(DownloadDBLogFilePortionRequest)
 */
public class DownloadDBLogFilePortionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The customer-assigned name of the DB instance that contains the log
     * files you want to list. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * The name of the log file to be downloaded.
     */
    private String logFileName;

    /**
     * The pagination token provided in the previous request. If this
     * parameter is specified the response includes only records beyond the
     * marker, up to MaxRecords.
     */
    private String marker;

    /**
     * The number of lines remaining to be downloaded.
     */
    private Integer numberOfLines;

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
    public DownloadDBLogFilePortionRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The name of the log file to be downloaded.
     *
     * @return The name of the log file to be downloaded.
     */
    public String getLogFileName() {
        return logFileName;
    }
    
    /**
     * The name of the log file to be downloaded.
     *
     * @param logFileName The name of the log file to be downloaded.
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }
    
    /**
     * The name of the log file to be downloaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logFileName The name of the log file to be downloaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DownloadDBLogFilePortionRequest withLogFileName(String logFileName) {
        this.logFileName = logFileName;
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
    public DownloadDBLogFilePortionRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The number of lines remaining to be downloaded.
     *
     * @return The number of lines remaining to be downloaded.
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }
    
    /**
     * The number of lines remaining to be downloaded.
     *
     * @param numberOfLines The number of lines remaining to be downloaded.
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }
    
    /**
     * The number of lines remaining to be downloaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfLines The number of lines remaining to be downloaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DownloadDBLogFilePortionRequest withNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
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
        if (getLogFileName() != null) sb.append("LogFileName: " + getLogFileName() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getNumberOfLines() != null) sb.append("NumberOfLines: " + getNumberOfLines() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getLogFileName() == null) ? 0 : getLogFileName().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfLines() == null) ? 0 : getNumberOfLines().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DownloadDBLogFilePortionRequest == false) return false;
        DownloadDBLogFilePortionRequest other = (DownloadDBLogFilePortionRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getLogFileName() == null ^ this.getLogFileName() == null) return false;
        if (other.getLogFileName() != null && other.getLogFileName().equals(this.getLogFileName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getNumberOfLines() == null ^ this.getNumberOfLines() == null) return false;
        if (other.getNumberOfLines() != null && other.getNumberOfLines().equals(this.getNumberOfLines()) == false) return false; 
        return true;
    }
    
}
    