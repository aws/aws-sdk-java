/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest) IncreaseStreamRetentionPeriod operation}.
 * <p>
 * Increases the stream's retention period, which is the length of time
 * data records are accessible after they are added to the stream. The
 * maximum value of a stream???s retention period is 168 hours (7 days).
 * </p>
 * <p>
 * Upon choosing a longer stream retention period, this operation will
 * increase the time period records are accessible that have not yet
 * expired. However, it will not make previous data that has expired
 * (older than the stream???s previous retention period) accessible after
 * the operation has been called. For example, if a stream???s retention
 * period is set to 24 hours and is increased to 168 hours, any data that
 * is older than 24 hours will remain inaccessible to consumer
 * applications.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest)
 */
public class IncreaseStreamRetentionPeriodRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the stream to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The new retention period of the stream, in hours. Must be more than
     * the current retention period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     */
    private Integer retentionPeriodHours;

    /**
     * The name of the stream to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream to modify.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to modify.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IncreaseStreamRetentionPeriodRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The new retention period of the stream, in hours. Must be more than
     * the current retention period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @return The new retention period of the stream, in hours. Must be more than
     *         the current retention period.
     */
    public Integer getRetentionPeriodHours() {
        return retentionPeriodHours;
    }
    
    /**
     * The new retention period of the stream, in hours. Must be more than
     * the current retention period.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @param retentionPeriodHours The new retention period of the stream, in hours. Must be more than
     *         the current retention period.
     */
    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }
    
    /**
     * The new retention period of the stream, in hours. Must be more than
     * the current retention period.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     *
     * @param retentionPeriodHours The new retention period of the stream, in hours. Must be more than
     *         the current retention period.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IncreaseStreamRetentionPeriodRequest withRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
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
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() + ",");
        if (getRetentionPeriodHours() != null) sb.append("RetentionPeriodHours: " + getRetentionPeriodHours() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IncreaseStreamRetentionPeriodRequest == false) return false;
        IncreaseStreamRetentionPeriodRequest other = (IncreaseStreamRetentionPeriodRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null) return false;
        if (other.getRetentionPeriodHours() != null && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false) return false; 
        return true;
    }
    
    @Override
    public IncreaseStreamRetentionPeriodRequest clone() {
        
            return (IncreaseStreamRetentionPeriodRequest) super.clone();
    }

}
    