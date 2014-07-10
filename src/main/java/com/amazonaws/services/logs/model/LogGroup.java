/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Log Group
 */
public class LogGroup implements Serializable {

    private String logGroupName;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     */
    private Integer retentionInDays;

    /**
     * The number of metric filters associated with the log group.
     */
    private Integer metricFilterCount;

    private String arn;

    private Long storedBytes;

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getCreationTime() {
        return creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     *
     * @return Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }
    
    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     *
     * @param retentionInDays Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }
    
    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retentionInDays Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * The number of metric filters associated with the log group.
     *
     * @return The number of metric filters associated with the log group.
     */
    public Integer getMetricFilterCount() {
        return metricFilterCount;
    }
    
    /**
     * The number of metric filters associated with the log group.
     *
     * @param metricFilterCount The number of metric filters associated with the log group.
     */
    public void setMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
    }
    
    /**
     * The number of metric filters associated with the log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricFilterCount The number of metric filters associated with the log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
        return this;
    }

    /**
     * Returns the value of the Arn property for this object.
     *
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     *
     * @param arn The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The new value for the Arn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Returns the value of the StoredBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the StoredBytes property for this object.
     */
    public Long getStoredBytes() {
        return storedBytes;
    }
    
    /**
     * Sets the value of the StoredBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes The new value for the StoredBytes property for this object.
     */
    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }
    
    /**
     * Sets the value of the StoredBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes The new value for the StoredBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogGroup withStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getRetentionInDays() != null) sb.append("RetentionInDays: " + getRetentionInDays() + ",");
        if (getMetricFilterCount() != null) sb.append("MetricFilterCount: " + getMetricFilterCount() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getStoredBytes() != null) sb.append("StoredBytes: " + getStoredBytes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionInDays() == null) ? 0 : getRetentionInDays().hashCode()); 
        hashCode = prime * hashCode + ((getMetricFilterCount() == null) ? 0 : getMetricFilterCount().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LogGroup == false) return false;
        LogGroup other = (LogGroup)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getRetentionInDays() == null ^ this.getRetentionInDays() == null) return false;
        if (other.getRetentionInDays() != null && other.getRetentionInDays().equals(this.getRetentionInDays()) == false) return false; 
        if (other.getMetricFilterCount() == null ^ this.getMetricFilterCount() == null) return false;
        if (other.getMetricFilterCount() != null && other.getMetricFilterCount().equals(this.getMetricFilterCount()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null) return false;
        if (other.getStoredBytes() != null && other.getStoredBytes().equals(this.getStoredBytes()) == false) return false; 
        return true;
    }
    
}
    