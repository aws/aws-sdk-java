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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on the cache hit of a pipeline execution step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CacheHitResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheHitResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     */
    private String sourcePipelineExecutionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param sourcePipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public void setSourcePipelineExecutionArn(String sourcePipelineExecutionArn) {
        this.sourcePipelineExecutionArn = sourcePipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public String getSourcePipelineExecutionArn() {
        return this.sourcePipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param sourcePipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheHitResult withSourcePipelineExecutionArn(String sourcePipelineExecutionArn) {
        setSourcePipelineExecutionArn(sourcePipelineExecutionArn);
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
        if (getSourcePipelineExecutionArn() != null)
            sb.append("SourcePipelineExecutionArn: ").append(getSourcePipelineExecutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheHitResult == false)
            return false;
        CacheHitResult other = (CacheHitResult) obj;
        if (other.getSourcePipelineExecutionArn() == null ^ this.getSourcePipelineExecutionArn() == null)
            return false;
        if (other.getSourcePipelineExecutionArn() != null && other.getSourcePipelineExecutionArn().equals(this.getSourcePipelineExecutionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePipelineExecutionArn() == null) ? 0 : getSourcePipelineExecutionArn().hashCode());
        return hashCode;
    }

    @Override
    public CacheHitResult clone() {
        try {
            return (CacheHitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CacheHitResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
