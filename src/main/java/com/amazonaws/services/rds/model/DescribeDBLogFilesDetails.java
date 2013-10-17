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
 * This data type is used as a response element to DescribeDBLogFiles.
 * </p>
 */
public class DescribeDBLogFilesDetails implements Serializable {

    /**
     * The name of the log file for the specified DB instance.
     */
    private String logFileName;

    /**
     * A POSIX timestamp when the last log entry was written.
     */
    private Long lastWritten;

    /**
     * The size, in bytes, of the log file for the specified DB instance.
     */
    private Long size;

    /**
     * The name of the log file for the specified DB instance.
     *
     * @return The name of the log file for the specified DB instance.
     */
    public String getLogFileName() {
        return logFileName;
    }
    
    /**
     * The name of the log file for the specified DB instance.
     *
     * @param logFileName The name of the log file for the specified DB instance.
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }
    
    /**
     * The name of the log file for the specified DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logFileName The name of the log file for the specified DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesDetails withLogFileName(String logFileName) {
        this.logFileName = logFileName;
        return this;
    }

    /**
     * A POSIX timestamp when the last log entry was written.
     *
     * @return A POSIX timestamp when the last log entry was written.
     */
    public Long getLastWritten() {
        return lastWritten;
    }
    
    /**
     * A POSIX timestamp when the last log entry was written.
     *
     * @param lastWritten A POSIX timestamp when the last log entry was written.
     */
    public void setLastWritten(Long lastWritten) {
        this.lastWritten = lastWritten;
    }
    
    /**
     * A POSIX timestamp when the last log entry was written.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastWritten A POSIX timestamp when the last log entry was written.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesDetails withLastWritten(Long lastWritten) {
        this.lastWritten = lastWritten;
        return this;
    }

    /**
     * The size, in bytes, of the log file for the specified DB instance.
     *
     * @return The size, in bytes, of the log file for the specified DB instance.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * The size, in bytes, of the log file for the specified DB instance.
     *
     * @param size The size, in bytes, of the log file for the specified DB instance.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * The size, in bytes, of the log file for the specified DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size, in bytes, of the log file for the specified DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBLogFilesDetails withSize(Long size) {
        this.size = size;
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
        if (getLogFileName() != null) sb.append("LogFileName: " + getLogFileName() + ",");
        if (getLastWritten() != null) sb.append("LastWritten: " + getLastWritten() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogFileName() == null) ? 0 : getLogFileName().hashCode()); 
        hashCode = prime * hashCode + ((getLastWritten() == null) ? 0 : getLastWritten().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBLogFilesDetails == false) return false;
        DescribeDBLogFilesDetails other = (DescribeDBLogFilesDetails)obj;
        
        if (other.getLogFileName() == null ^ this.getLogFileName() == null) return false;
        if (other.getLogFileName() != null && other.getLogFileName().equals(this.getLogFileName()) == false) return false; 
        if (other.getLastWritten() == null ^ this.getLastWritten() == null) return false;
        if (other.getLastWritten() != null && other.getLastWritten().equals(this.getLastWritten()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        return true;
    }
    
}
    