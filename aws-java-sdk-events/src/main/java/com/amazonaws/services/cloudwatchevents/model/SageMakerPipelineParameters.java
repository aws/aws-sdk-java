/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * These are custom parameters to use when the target is a SageMaker Model Building Pipeline that starts based on
 * EventBridge events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/SageMakerPipelineParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SageMakerPipelineParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * </p>
     */
    private java.util.List<SageMakerPipelineParameter> pipelineParameterList;

    /**
     * <p>
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * </p>
     * 
     * @return List of Parameter names and values for SageMaker Model Building Pipeline execution.
     */

    public java.util.List<SageMakerPipelineParameter> getPipelineParameterList() {
        return pipelineParameterList;
    }

    /**
     * <p>
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * </p>
     * 
     * @param pipelineParameterList
     *        List of Parameter names and values for SageMaker Model Building Pipeline execution.
     */

    public void setPipelineParameterList(java.util.Collection<SageMakerPipelineParameter> pipelineParameterList) {
        if (pipelineParameterList == null) {
            this.pipelineParameterList = null;
            return;
        }

        this.pipelineParameterList = new java.util.ArrayList<SageMakerPipelineParameter>(pipelineParameterList);
    }

    /**
     * <p>
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineParameterList(java.util.Collection)} or
     * {@link #withPipelineParameterList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pipelineParameterList
     *        List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SageMakerPipelineParameters withPipelineParameterList(SageMakerPipelineParameter... pipelineParameterList) {
        if (this.pipelineParameterList == null) {
            setPipelineParameterList(new java.util.ArrayList<SageMakerPipelineParameter>(pipelineParameterList.length));
        }
        for (SageMakerPipelineParameter ele : pipelineParameterList) {
            this.pipelineParameterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * </p>
     * 
     * @param pipelineParameterList
     *        List of Parameter names and values for SageMaker Model Building Pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SageMakerPipelineParameters withPipelineParameterList(java.util.Collection<SageMakerPipelineParameter> pipelineParameterList) {
        setPipelineParameterList(pipelineParameterList);
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
        if (getPipelineParameterList() != null)
            sb.append("PipelineParameterList: ").append(getPipelineParameterList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SageMakerPipelineParameters == false)
            return false;
        SageMakerPipelineParameters other = (SageMakerPipelineParameters) obj;
        if (other.getPipelineParameterList() == null ^ this.getPipelineParameterList() == null)
            return false;
        if (other.getPipelineParameterList() != null && other.getPipelineParameterList().equals(this.getPipelineParameterList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineParameterList() == null) ? 0 : getPipelineParameterList().hashCode());
        return hashCode;
    }

    @Override
    public SageMakerPipelineParameters clone() {
        try {
            return (SageMakerPipelineParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.SageMakerPipelineParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
