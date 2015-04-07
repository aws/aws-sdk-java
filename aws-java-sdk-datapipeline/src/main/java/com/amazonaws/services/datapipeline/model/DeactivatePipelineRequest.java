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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#deactivatePipeline(DeactivatePipelineRequest) DeactivatePipeline operation}.
 * <p>
 * Deactivates the specified running pipeline. The pipeline is set to the
 * <code>DEACTIVATING</code> state until the deactivation process
 * completes.
 * </p>
 * <p>
 * To resume a deactivated pipeline, use ActivatePipeline. By default,
 * the pipeline resumes from the last completed execution. Optionally,
 * you can specify the date and time to resume the pipeline.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#deactivatePipeline(DeactivatePipelineRequest)
 */
public class DeactivatePipelineRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * Indicates whether to cancel any running objects. The default is true,
     * which sets the state of any running objects to <code>CANCELED</code>.
     * If this value is false, the pipeline is deactivated after all running
     * objects finish.
     */
    private Boolean cancelActive;

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeactivatePipelineRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Indicates whether to cancel any running objects. The default is true,
     * which sets the state of any running objects to <code>CANCELED</code>.
     * If this value is false, the pipeline is deactivated after all running
     * objects finish.
     *
     * @return Indicates whether to cancel any running objects. The default is true,
     *         which sets the state of any running objects to <code>CANCELED</code>.
     *         If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     */
    public Boolean isCancelActive() {
        return cancelActive;
    }
    
    /**
     * Indicates whether to cancel any running objects. The default is true,
     * which sets the state of any running objects to <code>CANCELED</code>.
     * If this value is false, the pipeline is deactivated after all running
     * objects finish.
     *
     * @param cancelActive Indicates whether to cancel any running objects. The default is true,
     *         which sets the state of any running objects to <code>CANCELED</code>.
     *         If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     */
    public void setCancelActive(Boolean cancelActive) {
        this.cancelActive = cancelActive;
    }
    
    /**
     * Indicates whether to cancel any running objects. The default is true,
     * which sets the state of any running objects to <code>CANCELED</code>.
     * If this value is false, the pipeline is deactivated after all running
     * objects finish.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelActive Indicates whether to cancel any running objects. The default is true,
     *         which sets the state of any running objects to <code>CANCELED</code>.
     *         If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeactivatePipelineRequest withCancelActive(Boolean cancelActive) {
        this.cancelActive = cancelActive;
        return this;
    }

    /**
     * Indicates whether to cancel any running objects. The default is true,
     * which sets the state of any running objects to <code>CANCELED</code>.
     * If this value is false, the pipeline is deactivated after all running
     * objects finish.
     *
     * @return Indicates whether to cancel any running objects. The default is true,
     *         which sets the state of any running objects to <code>CANCELED</code>.
     *         If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     */
    public Boolean getCancelActive() {
        return cancelActive;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (isCancelActive() != null) sb.append("CancelActive: " + isCancelActive() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((isCancelActive() == null) ? 0 : isCancelActive().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeactivatePipelineRequest == false) return false;
        DeactivatePipelineRequest other = (DeactivatePipelineRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.isCancelActive() == null ^ this.isCancelActive() == null) return false;
        if (other.isCancelActive() != null && other.isCancelActive().equals(this.isCancelActive()) == false) return false; 
        return true;
    }
    
    @Override
    public DeactivatePipelineRequest clone() {
        
            return (DeactivatePipelineRequest) super.clone();
    }

}
    