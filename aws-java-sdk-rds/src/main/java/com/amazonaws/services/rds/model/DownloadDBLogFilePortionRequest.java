/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Downloads all or a portion of the specified log file, up to 1 MB in
 * size.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#downloadDBLogFilePortion(DownloadDBLogFilePortionRequest)
 */
public class DownloadDBLogFilePortionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records
     * beyond the marker until the end of the file or up to NumberOfLines.
     */
    private String marker;

    /**
     * The number of lines to download. If the number of lines specified
     * results in a file over 1 MB in size, the file will be truncated at 1
     * MB in size. <p>If the NumberOfLines parameter is specified, then the
     * block of lines returned can be from the beginning or the end of the
     * log file, depending on the value of the Marker parameter.
     * <ul><li><p>If neither Marker or NumberOfLines are specified, the
     * entire log file is returned up to a maximum of 10000 lines, starting
     * with the most recent log entries first.</li><li><p>If NumberOfLines is
     * specified and Marker is not specified, then the most recent lines from
     * the end of the log file are returned.</li><li><p>If Marker is
     * specified as "0", then the specified number of lines from the
     * beginning of the log file are returned.</li><li><p>You can download
     * the log file in blocks of lines by specifying the size of the block
     * using the NumberOfLines parameter, and by specifying a value of "0"
     * for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next
     * request, continuing until the AdditionalDataPending response element
     * returns false.</li></ul>
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
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records
     * beyond the marker until the end of the file or up to NumberOfLines.
     *
     * @return The pagination token provided in the previous request or "0". If the
     *         Marker parameter is specified the response includes only records
     *         beyond the marker until the end of the file or up to NumberOfLines.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records
     * beyond the marker until the end of the file or up to NumberOfLines.
     *
     * @param marker The pagination token provided in the previous request or "0". If the
     *         Marker parameter is specified the response includes only records
     *         beyond the marker until the end of the file or up to NumberOfLines.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token provided in the previous request or "0". If the
     * Marker parameter is specified the response includes only records
     * beyond the marker until the end of the file or up to NumberOfLines.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The pagination token provided in the previous request or "0". If the
     *         Marker parameter is specified the response includes only records
     *         beyond the marker until the end of the file or up to NumberOfLines.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DownloadDBLogFilePortionRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The number of lines to download. If the number of lines specified
     * results in a file over 1 MB in size, the file will be truncated at 1
     * MB in size. <p>If the NumberOfLines parameter is specified, then the
     * block of lines returned can be from the beginning or the end of the
     * log file, depending on the value of the Marker parameter.
     * <ul><li><p>If neither Marker or NumberOfLines are specified, the
     * entire log file is returned up to a maximum of 10000 lines, starting
     * with the most recent log entries first.</li><li><p>If NumberOfLines is
     * specified and Marker is not specified, then the most recent lines from
     * the end of the log file are returned.</li><li><p>If Marker is
     * specified as "0", then the specified number of lines from the
     * beginning of the log file are returned.</li><li><p>You can download
     * the log file in blocks of lines by specifying the size of the block
     * using the NumberOfLines parameter, and by specifying a value of "0"
     * for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next
     * request, continuing until the AdditionalDataPending response element
     * returns false.</li></ul>
     *
     * @return The number of lines to download. If the number of lines specified
     *         results in a file over 1 MB in size, the file will be truncated at 1
     *         MB in size. <p>If the NumberOfLines parameter is specified, then the
     *         block of lines returned can be from the beginning or the end of the
     *         log file, depending on the value of the Marker parameter.
     *         <ul><li><p>If neither Marker or NumberOfLines are specified, the
     *         entire log file is returned up to a maximum of 10000 lines, starting
     *         with the most recent log entries first.</li><li><p>If NumberOfLines is
     *         specified and Marker is not specified, then the most recent lines from
     *         the end of the log file are returned.</li><li><p>If Marker is
     *         specified as "0", then the specified number of lines from the
     *         beginning of the log file are returned.</li><li><p>You can download
     *         the log file in blocks of lines by specifying the size of the block
     *         using the NumberOfLines parameter, and by specifying a value of "0"
     *         for the Marker parameter in your first request. Include the Marker
     *         value returned in the response as the Marker value for the next
     *         request, continuing until the AdditionalDataPending response element
     *         returns false.</li></ul>
     */
    public Integer getNumberOfLines() {
        return numberOfLines;
    }
    
    /**
     * The number of lines to download. If the number of lines specified
     * results in a file over 1 MB in size, the file will be truncated at 1
     * MB in size. <p>If the NumberOfLines parameter is specified, then the
     * block of lines returned can be from the beginning or the end of the
     * log file, depending on the value of the Marker parameter.
     * <ul><li><p>If neither Marker or NumberOfLines are specified, the
     * entire log file is returned up to a maximum of 10000 lines, starting
     * with the most recent log entries first.</li><li><p>If NumberOfLines is
     * specified and Marker is not specified, then the most recent lines from
     * the end of the log file are returned.</li><li><p>If Marker is
     * specified as "0", then the specified number of lines from the
     * beginning of the log file are returned.</li><li><p>You can download
     * the log file in blocks of lines by specifying the size of the block
     * using the NumberOfLines parameter, and by specifying a value of "0"
     * for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next
     * request, continuing until the AdditionalDataPending response element
     * returns false.</li></ul>
     *
     * @param numberOfLines The number of lines to download. If the number of lines specified
     *         results in a file over 1 MB in size, the file will be truncated at 1
     *         MB in size. <p>If the NumberOfLines parameter is specified, then the
     *         block of lines returned can be from the beginning or the end of the
     *         log file, depending on the value of the Marker parameter.
     *         <ul><li><p>If neither Marker or NumberOfLines are specified, the
     *         entire log file is returned up to a maximum of 10000 lines, starting
     *         with the most recent log entries first.</li><li><p>If NumberOfLines is
     *         specified and Marker is not specified, then the most recent lines from
     *         the end of the log file are returned.</li><li><p>If Marker is
     *         specified as "0", then the specified number of lines from the
     *         beginning of the log file are returned.</li><li><p>You can download
     *         the log file in blocks of lines by specifying the size of the block
     *         using the NumberOfLines parameter, and by specifying a value of "0"
     *         for the Marker parameter in your first request. Include the Marker
     *         value returned in the response as the Marker value for the next
     *         request, continuing until the AdditionalDataPending response element
     *         returns false.</li></ul>
     */
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }
    
    /**
     * The number of lines to download. If the number of lines specified
     * results in a file over 1 MB in size, the file will be truncated at 1
     * MB in size. <p>If the NumberOfLines parameter is specified, then the
     * block of lines returned can be from the beginning or the end of the
     * log file, depending on the value of the Marker parameter.
     * <ul><li><p>If neither Marker or NumberOfLines are specified, the
     * entire log file is returned up to a maximum of 10000 lines, starting
     * with the most recent log entries first.</li><li><p>If NumberOfLines is
     * specified and Marker is not specified, then the most recent lines from
     * the end of the log file are returned.</li><li><p>If Marker is
     * specified as "0", then the specified number of lines from the
     * beginning of the log file are returned.</li><li><p>You can download
     * the log file in blocks of lines by specifying the size of the block
     * using the NumberOfLines parameter, and by specifying a value of "0"
     * for the Marker parameter in your first request. Include the Marker
     * value returned in the response as the Marker value for the next
     * request, continuing until the AdditionalDataPending response element
     * returns false.</li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfLines The number of lines to download. If the number of lines specified
     *         results in a file over 1 MB in size, the file will be truncated at 1
     *         MB in size. <p>If the NumberOfLines parameter is specified, then the
     *         block of lines returned can be from the beginning or the end of the
     *         log file, depending on the value of the Marker parameter.
     *         <ul><li><p>If neither Marker or NumberOfLines are specified, the
     *         entire log file is returned up to a maximum of 10000 lines, starting
     *         with the most recent log entries first.</li><li><p>If NumberOfLines is
     *         specified and Marker is not specified, then the most recent lines from
     *         the end of the log file are returned.</li><li><p>If Marker is
     *         specified as "0", then the specified number of lines from the
     *         beginning of the log file are returned.</li><li><p>You can download
     *         the log file in blocks of lines by specifying the size of the block
     *         using the NumberOfLines parameter, and by specifying a value of "0"
     *         for the Marker parameter in your first request. Include the Marker
     *         value returned in the response as the Marker value for the next
     *         request, continuing until the AdditionalDataPending response element
     *         returns false.</li></ul>
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
    
    @Override
    public DownloadDBLogFilePortionRequest clone() {
        
            return (DownloadDBLogFilePortionRequest) super.clone();
    }

}
    