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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the timing of a job.
 * </p>
 */
public class Timing implements Serializable, Cloneable {

    /**
     * The time the job was submitted to Elastic Transcoder, in epoch
     * milliseconds.
     */
    private Long submitTimeMillis;

    /**
     * The time the job began transcoding, in epoch milliseconds.
     */
    private Long startTimeMillis;

    /**
     * The time the job finished transcoding, in epoch milliseconds.
     */
    private Long finishTimeMillis;

    /**
     * The time the job was submitted to Elastic Transcoder, in epoch
     * milliseconds.
     *
     * @return The time the job was submitted to Elastic Transcoder, in epoch
     *         milliseconds.
     */
    public Long getSubmitTimeMillis() {
        return submitTimeMillis;
    }
    
    /**
     * The time the job was submitted to Elastic Transcoder, in epoch
     * milliseconds.
     *
     * @param submitTimeMillis The time the job was submitted to Elastic Transcoder, in epoch
     *         milliseconds.
     */
    public void setSubmitTimeMillis(Long submitTimeMillis) {
        this.submitTimeMillis = submitTimeMillis;
    }
    
    /**
     * The time the job was submitted to Elastic Transcoder, in epoch
     * milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submitTimeMillis The time the job was submitted to Elastic Transcoder, in epoch
     *         milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Timing withSubmitTimeMillis(Long submitTimeMillis) {
        this.submitTimeMillis = submitTimeMillis;
        return this;
    }

    /**
     * The time the job began transcoding, in epoch milliseconds.
     *
     * @return The time the job began transcoding, in epoch milliseconds.
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }
    
    /**
     * The time the job began transcoding, in epoch milliseconds.
     *
     * @param startTimeMillis The time the job began transcoding, in epoch milliseconds.
     */
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }
    
    /**
     * The time the job began transcoding, in epoch milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimeMillis The time the job began transcoding, in epoch milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Timing withStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
        return this;
    }

    /**
     * The time the job finished transcoding, in epoch milliseconds.
     *
     * @return The time the job finished transcoding, in epoch milliseconds.
     */
    public Long getFinishTimeMillis() {
        return finishTimeMillis;
    }
    
    /**
     * The time the job finished transcoding, in epoch milliseconds.
     *
     * @param finishTimeMillis The time the job finished transcoding, in epoch milliseconds.
     */
    public void setFinishTimeMillis(Long finishTimeMillis) {
        this.finishTimeMillis = finishTimeMillis;
    }
    
    /**
     * The time the job finished transcoding, in epoch milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finishTimeMillis The time the job finished transcoding, in epoch milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Timing withFinishTimeMillis(Long finishTimeMillis) {
        this.finishTimeMillis = finishTimeMillis;
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
        if (getSubmitTimeMillis() != null) sb.append("SubmitTimeMillis: " + getSubmitTimeMillis() + ",");
        if (getStartTimeMillis() != null) sb.append("StartTimeMillis: " + getStartTimeMillis() + ",");
        if (getFinishTimeMillis() != null) sb.append("FinishTimeMillis: " + getFinishTimeMillis() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubmitTimeMillis() == null) ? 0 : getSubmitTimeMillis().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimeMillis() == null) ? 0 : getStartTimeMillis().hashCode()); 
        hashCode = prime * hashCode + ((getFinishTimeMillis() == null) ? 0 : getFinishTimeMillis().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Timing == false) return false;
        Timing other = (Timing)obj;
        
        if (other.getSubmitTimeMillis() == null ^ this.getSubmitTimeMillis() == null) return false;
        if (other.getSubmitTimeMillis() != null && other.getSubmitTimeMillis().equals(this.getSubmitTimeMillis()) == false) return false; 
        if (other.getStartTimeMillis() == null ^ this.getStartTimeMillis() == null) return false;
        if (other.getStartTimeMillis() != null && other.getStartTimeMillis().equals(this.getStartTimeMillis()) == false) return false; 
        if (other.getFinishTimeMillis() == null ^ this.getFinishTimeMillis() == null) return false;
        if (other.getFinishTimeMillis() != null && other.getFinishTimeMillis().equals(this.getFinishTimeMillis()) == false) return false; 
        return true;
    }
    
    @Override
    public Timing clone() {
        try {
            return (Timing) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    