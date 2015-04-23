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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CancelImportTaskRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelImportTask(CancelImportTaskRequest) CancelImportTask operation}.
 * <p>
 * Cancels an in-process import virtual machine or import snapshot task.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelImportTask(CancelImportTaskRequest)
 */
public class CancelImportTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CancelImportTaskRequest> {

    /**
     * The ID of the ImportImage or ImportSnapshot task to be cancelled.
     */
    private String importTaskId;

    /**
     * The reason for canceling the task.
     */
    private String cancelReason;

    /**
     * The ID of the ImportImage or ImportSnapshot task to be cancelled.
     *
     * @return The ID of the ImportImage or ImportSnapshot task to be cancelled.
     */
    public String getImportTaskId() {
        return importTaskId;
    }
    
    /**
     * The ID of the ImportImage or ImportSnapshot task to be cancelled.
     *
     * @param importTaskId The ID of the ImportImage or ImportSnapshot task to be cancelled.
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }
    
    /**
     * The ID of the ImportImage or ImportSnapshot task to be cancelled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskId The ID of the ImportImage or ImportSnapshot task to be cancelled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelImportTaskRequest withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * The reason for canceling the task.
     *
     * @return The reason for canceling the task.
     */
    public String getCancelReason() {
        return cancelReason;
    }
    
    /**
     * The reason for canceling the task.
     *
     * @param cancelReason The reason for canceling the task.
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    
    /**
     * The reason for canceling the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelReason The reason for canceling the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelImportTaskRequest withCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CancelImportTaskRequest> getDryRunRequest() {
        Request<CancelImportTaskRequest> request = new CancelImportTaskRequestMarshaller().marshall(this);
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
        if (getImportTaskId() != null) sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getCancelReason() != null) sb.append("CancelReason: " + getCancelReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelImportTaskRequest == false) return false;
        CancelImportTaskRequest other = (CancelImportTaskRequest)obj;
        
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null) return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false) return false; 
        if (other.getCancelReason() == null ^ this.getCancelReason() == null) return false;
        if (other.getCancelReason() != null && other.getCancelReason().equals(this.getCancelReason()) == false) return false; 
        return true;
    }
    
    @Override
    public CancelImportTaskRequest clone() {
        
            return (CancelImportTaskRequest) super.clone();
    }

}
    