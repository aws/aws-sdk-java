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


/**
 * <p>
 * This data type is used as a response element to DownloadDBLogFilePortion.
 * </p>
 */
public class DownloadDBLogFilePortionResult implements Serializable {

    /**
     * Entries from the specified log file.
     */
    private String logFileData;

    /**
     * An optional pagination token provided by a previous
     * DownloadDBLogFilePortion request.
     */
    private String marker;

    /**
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     */
    private Boolean additionalDataPending;

    /**
     * Entries from the specified log file.
     *
     * @return Entries from the specified log file.
     */
    public String getLogFileData() {
        return logFileData;
    }
    
    /**
     * Entries from the specified log file.
     *
     * @param logFileData Entries from the specified log file.
     */
    public void setLogFileData(String logFileData) {
        this.logFileData = logFileData;
    }
    
    /**
     * Entries from the specified log file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logFileData Entries from the specified log file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DownloadDBLogFilePortionResult withLogFileData(String logFileData) {
        this.logFileData = logFileData;
        return this;
    }

    /**
     * An optional pagination token provided by a previous
     * DownloadDBLogFilePortion request.
     *
     * @return An optional pagination token provided by a previous
     *         DownloadDBLogFilePortion request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DownloadDBLogFilePortion request.
     *
     * @param marker An optional pagination token provided by a previous
     *         DownloadDBLogFilePortion request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DownloadDBLogFilePortion request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         DownloadDBLogFilePortion request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DownloadDBLogFilePortionResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     *
     * @return Boolean value that if true, indicates there is more data to be
     *         downloaded.
     */
    public Boolean isAdditionalDataPending() {
        return additionalDataPending;
    }
    
    /**
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     *
     * @param additionalDataPending Boolean value that if true, indicates there is more data to be
     *         downloaded.
     */
    public void setAdditionalDataPending(Boolean additionalDataPending) {
        this.additionalDataPending = additionalDataPending;
    }
    
    /**
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalDataPending Boolean value that if true, indicates there is more data to be
     *         downloaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DownloadDBLogFilePortionResult withAdditionalDataPending(Boolean additionalDataPending) {
        this.additionalDataPending = additionalDataPending;
        return this;
    }

    /**
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     *
     * @return Boolean value that if true, indicates there is more data to be
     *         downloaded.
     */
    public Boolean getAdditionalDataPending() {
        return additionalDataPending;
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
        if (getLogFileData() != null) sb.append("LogFileData: " + getLogFileData() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isAdditionalDataPending() != null) sb.append("AdditionalDataPending: " + isAdditionalDataPending() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogFileData() == null) ? 0 : getLogFileData().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isAdditionalDataPending() == null) ? 0 : isAdditionalDataPending().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DownloadDBLogFilePortionResult == false) return false;
        DownloadDBLogFilePortionResult other = (DownloadDBLogFilePortionResult)obj;
        
        if (other.getLogFileData() == null ^ this.getLogFileData() == null) return false;
        if (other.getLogFileData() != null && other.getLogFileData().equals(this.getLogFileData()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isAdditionalDataPending() == null ^ this.isAdditionalDataPending() == null) return false;
        if (other.isAdditionalDataPending() != null && other.isAdditionalDataPending().equals(this.isAdditionalDataPending()) == false) return false; 
        return true;
    }
    
}
    