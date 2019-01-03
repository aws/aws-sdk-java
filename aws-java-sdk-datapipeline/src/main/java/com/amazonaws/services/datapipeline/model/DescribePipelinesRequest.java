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
 * Contains the parameters for DescribePipelines.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribePipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline
     * IDs, call <a>ListPipelines</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> pipelineIds;

    /**
     * <p>
     * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline
     * IDs, call <a>ListPipelines</a>.
     * </p>
     * 
     * @return The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain
     *         pipeline IDs, call <a>ListPipelines</a>.
     */

    public java.util.List<String> getPipelineIds() {
        if (pipelineIds == null) {
            pipelineIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return pipelineIds;
    }

    /**
     * <p>
     * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline
     * IDs, call <a>ListPipelines</a>.
     * </p>
     * 
     * @param pipelineIds
     *        The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain
     *        pipeline IDs, call <a>ListPipelines</a>.
     */

    public void setPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
            return;
        }

        this.pipelineIds = new com.amazonaws.internal.SdkInternalList<String>(pipelineIds);
    }

    /**
     * <p>
     * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline
     * IDs, call <a>ListPipelines</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineIds(java.util.Collection)} or {@link #withPipelineIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelineIds
     *        The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain
     *        pipeline IDs, call <a>ListPipelines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelinesRequest withPipelineIds(String... pipelineIds) {
        if (this.pipelineIds == null) {
            setPipelineIds(new com.amazonaws.internal.SdkInternalList<String>(pipelineIds.length));
        }
        for (String ele : pipelineIds) {
            this.pipelineIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline
     * IDs, call <a>ListPipelines</a>.
     * </p>
     * 
     * @param pipelineIds
     *        The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain
     *        pipeline IDs, call <a>ListPipelines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipelinesRequest withPipelineIds(java.util.Collection<String> pipelineIds) {
        setPipelineIds(pipelineIds);
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
        if (getPipelineIds() != null)
            sb.append("PipelineIds: ").append(getPipelineIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePipelinesRequest == false)
            return false;
        DescribePipelinesRequest other = (DescribePipelinesRequest) obj;
        if (other.getPipelineIds() == null ^ this.getPipelineIds() == null)
            return false;
        if (other.getPipelineIds() != null && other.getPipelineIds().equals(this.getPipelineIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineIds() == null) ? 0 : getPipelineIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipelinesRequest clone() {
        return (DescribePipelinesRequest) super.clone();
    }

}
