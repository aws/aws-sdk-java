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
 * Output Log Event
 */
public class OutputLogEvent implements Serializable {

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long timestamp;

    private String message;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long ingestionTime;

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
    public Long getTimestamp() {
        return timestamp;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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
     * @param timestamp A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OutputLogEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns the value of the Message property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @return The value of the Message property for this object.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @param message The new value for the Message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     *
     * @param message The new value for the Message property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OutputLogEvent withMessage(String message) {
        this.message = message;
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
    public Long getIngestionTime() {
        return ingestionTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param ingestionTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
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
     * @param ingestionTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OutputLogEvent withIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
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
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getIngestionTime() != null) sb.append("IngestionTime: " + getIngestionTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getIngestionTime() == null) ? 0 : getIngestionTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OutputLogEvent == false) return false;
        OutputLogEvent other = (OutputLogEvent)obj;
        
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getIngestionTime() == null ^ this.getIngestionTime() == null) return false;
        if (other.getIngestionTime() != null && other.getIngestionTime().equals(this.getIngestionTime()) == false) return false; 
        return true;
    }
    
}
    