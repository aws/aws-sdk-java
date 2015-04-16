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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#activatePipeline(ActivatePipelineRequest) ActivatePipeline operation}.
 * <p>
 * Validates the specified pipeline and starts processing pipeline tasks.
 * If the pipeline does not pass validation, activation fails.
 * </p>
 * <p>
 * If you need to pause the pipeline to investigate an issue with a
 * component, such as a data source or script, call DeactivatePipeline.
 * </p>
 * <p>
 * To activate a finished pipeline, modify the end date for the pipeline
 * and then activate it.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#activatePipeline(ActivatePipelineRequest)
 */
public class ActivatePipelineRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * A list of parameter values to pass to the pipeline at activation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValues;

    /**
     * The date and time to resume the pipeline. By default, the pipeline
     * resumes from the last completed execution.
     */
    private java.util.Date startTimestamp;

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
    public ActivatePipelineRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * A list of parameter values to pass to the pipeline at activation.
     *
     * @return A list of parameter values to pass to the pipeline at activation.
     */
    public java.util.List<ParameterValue> getParameterValues() {
        if (parameterValues == null) {
              parameterValues = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>();
              parameterValues.setAutoConstruct(true);
        }
        return parameterValues;
    }
    
    /**
     * A list of parameter values to pass to the pipeline at activation.
     *
     * @param parameterValues A list of parameter values to pass to the pipeline at activation.
     */
    public void setParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
        parameterValuesCopy.addAll(parameterValues);
        this.parameterValues = parameterValuesCopy;
    }
    
    /**
     * A list of parameter values to pass to the pipeline at activation.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameterValues(java.util.Collection)} or {@link
     * #withParameterValues(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues A list of parameter values to pass to the pipeline at activation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivatePipelineRequest withParameterValues(ParameterValue... parameterValues) {
        if (getParameterValues() == null) setParameterValues(new java.util.ArrayList<ParameterValue>(parameterValues.length));
        for (ParameterValue value : parameterValues) {
            getParameterValues().add(value);
        }
        return this;
    }
    
    /**
     * A list of parameter values to pass to the pipeline at activation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues A list of parameter values to pass to the pipeline at activation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivatePipelineRequest withParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
            parameterValuesCopy.addAll(parameterValues);
            this.parameterValues = parameterValuesCopy;
        }

        return this;
    }

    /**
     * The date and time to resume the pipeline. By default, the pipeline
     * resumes from the last completed execution.
     *
     * @return The date and time to resume the pipeline. By default, the pipeline
     *         resumes from the last completed execution.
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }
    
    /**
     * The date and time to resume the pipeline. By default, the pipeline
     * resumes from the last completed execution.
     *
     * @param startTimestamp The date and time to resume the pipeline. By default, the pipeline
     *         resumes from the last completed execution.
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }
    
    /**
     * The date and time to resume the pipeline. By default, the pipeline
     * resumes from the last completed execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimestamp The date and time to resume the pipeline. By default, the pipeline
     *         resumes from the last completed execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivatePipelineRequest withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getParameterValues() != null) sb.append("ParameterValues: " + getParameterValues() + ",");
        if (getStartTimestamp() != null) sb.append("StartTimestamp: " + getStartTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivatePipelineRequest == false) return false;
        ActivatePipelineRequest other = (ActivatePipelineRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getParameterValues() == null ^ this.getParameterValues() == null) return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false) return false; 
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null) return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false) return false; 
        return true;
    }
    
    @Override
    public ActivatePipelineRequest clone() {
        
            return (ActivatePipelineRequest) super.clone();
    }

}
    