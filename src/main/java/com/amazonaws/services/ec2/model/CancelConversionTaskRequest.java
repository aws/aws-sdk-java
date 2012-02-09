/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelConversionTask(CancelConversionTaskRequest) CancelConversionTask operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelConversionTask(CancelConversionTaskRequest)
 */
public class CancelConversionTaskRequest extends AmazonWebServiceRequest {

    private String conversionTaskId;

    private String reasonMessage;

    /**
     * Returns the value of the ConversionTaskId property for this object.
     *
     * @return The value of the ConversionTaskId property for this object.
     */
    public String getConversionTaskId() {
        return conversionTaskId;
    }
    
    /**
     * Sets the value of the ConversionTaskId property for this object.
     *
     * @param conversionTaskId The new value for the ConversionTaskId property for this object.
     */
    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }
    
    /**
     * Sets the value of the ConversionTaskId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTaskId The new value for the ConversionTaskId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelConversionTaskRequest withConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
        return this;
    }
    
    
    /**
     * Returns the value of the ReasonMessage property for this object.
     *
     * @return The value of the ReasonMessage property for this object.
     */
    public String getReasonMessage() {
        return reasonMessage;
    }
    
    /**
     * Sets the value of the ReasonMessage property for this object.
     *
     * @param reasonMessage The new value for the ReasonMessage property for this object.
     */
    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }
    
    /**
     * Sets the value of the ReasonMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonMessage The new value for the ReasonMessage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelConversionTaskRequest withReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
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
        if (conversionTaskId != null) sb.append("ConversionTaskId: " + conversionTaskId + ", ");
        if (reasonMessage != null) sb.append("ReasonMessage: " + reasonMessage + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getReasonMessage() == null) ? 0 : getReasonMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CancelConversionTaskRequest == false) return false;
        CancelConversionTaskRequest other = (CancelConversionTaskRequest)obj;
        
        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null) return false;
        if (other.getConversionTaskId() != null && other.getConversionTaskId().equals(this.getConversionTaskId()) == false) return false; 
        if (other.getReasonMessage() == null ^ this.getReasonMessage() == null) return false;
        if (other.getReasonMessage() != null && other.getReasonMessage().equals(this.getReasonMessage()) == false) return false; 
        return true;
    }
    
}
    