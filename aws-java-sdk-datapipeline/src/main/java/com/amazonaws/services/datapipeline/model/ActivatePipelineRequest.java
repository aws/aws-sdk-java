/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for ActivatePipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ActivatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * A list of parameter values to pass to the pipeline at activation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterValue> parameterValues;
    /**
     * <p>
     * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
     * </p>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @return The ID of the pipeline.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatePipelineRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * A list of parameter values to pass to the pipeline at activation.
     * </p>
     * 
     * @return A list of parameter values to pass to the pipeline at activation.
     */

    public java.util.List<ParameterValue> getParameterValues() {
        if (parameterValues == null) {
            parameterValues = new com.amazonaws.internal.SdkInternalList<ParameterValue>();
        }
        return parameterValues;
    }

    /**
     * <p>
     * A list of parameter values to pass to the pipeline at activation.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values to pass to the pipeline at activation.
     */

    public void setParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }

        this.parameterValues = new com.amazonaws.internal.SdkInternalList<ParameterValue>(parameterValues);
    }

    /**
     * <p>
     * A list of parameter values to pass to the pipeline at activation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterValues(java.util.Collection)} or {@link #withParameterValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values to pass to the pipeline at activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatePipelineRequest withParameterValues(ParameterValue... parameterValues) {
        if (this.parameterValues == null) {
            setParameterValues(new com.amazonaws.internal.SdkInternalList<ParameterValue>(parameterValues.length));
        }
        for (ParameterValue ele : parameterValues) {
            this.parameterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter values to pass to the pipeline at activation.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values to pass to the pipeline at activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatePipelineRequest withParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        setParameterValues(parameterValues);
        return this;
    }

    /**
     * <p>
     * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
     * </p>
     * 
     * @param startTimestamp
     *        The date and time to resume the pipeline. By default, the pipeline resumes from the last completed
     *        execution.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
     * </p>
     * 
     * @return The date and time to resume the pipeline. By default, the pipeline resumes from the last completed
     *         execution.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
     * </p>
     * 
     * @param startTimestamp
     *        The date and time to resume the pipeline. By default, the pipeline resumes from the last completed
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatePipelineRequest withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getParameterValues() != null)
            sb.append("ParameterValues: ").append(getParameterValues()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivatePipelineRequest == false)
            return false;
        ActivatePipelineRequest other = (ActivatePipelineRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getParameterValues() == null ^ this.getParameterValues() == null)
            return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        return true;
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
    public ActivatePipelineRequest clone() {
        return (ActivatePipelineRequest) super.clone();
    }

}
