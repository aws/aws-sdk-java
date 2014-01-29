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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CancelConversionTaskRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelConversionTask(CancelConversionTaskRequest) CancelConversionTask operation}.
 * <p>
 * Cancels an active conversion task. The task can be the import of an instance or volume. The action removes all artifacts of the conversion, including
 * a partially uploaded volume or instance. If the conversion is complete or is in the process of transferring the final disk image, the command fails
 * and returns an exception.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line
 * Tools to Import Your Virtual Machine to Amazon EC2 </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelConversionTask(CancelConversionTaskRequest)
 */
public class CancelConversionTaskRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CancelConversionTaskRequest> {

    /**
     * The ID of the conversion task.
     */
    private String conversionTaskId;

    /**
     * 
     */
    private String reasonMessage;

    /**
     * The ID of the conversion task.
     *
     * @return The ID of the conversion task.
     */
    public String getConversionTaskId() {
        return conversionTaskId;
    }
    
    /**
     * The ID of the conversion task.
     *
     * @param conversionTaskId The ID of the conversion task.
     */
    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }
    
    /**
     * The ID of the conversion task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTaskId The ID of the conversion task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CancelConversionTaskRequest withConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getReasonMessage() {
        return reasonMessage;
    }
    
    /**
     * 
     *
     * @param reasonMessage 
     */
    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonMessage 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CancelConversionTaskRequest withReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CancelConversionTaskRequest> getDryRunRequest() {
        Request<CancelConversionTaskRequest> request = new CancelConversionTaskRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getConversionTaskId() != null) sb.append("ConversionTaskId: " + getConversionTaskId() + ",");
        if (getReasonMessage() != null) sb.append("ReasonMessage: " + getReasonMessage() );
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
    