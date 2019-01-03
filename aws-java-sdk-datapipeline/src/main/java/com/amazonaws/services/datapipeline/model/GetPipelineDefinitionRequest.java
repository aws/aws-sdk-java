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
 * Contains the parameters for GetPipelineDefinition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to use
     * the last definition saved to the pipeline or <code>active</code> to use the last definition that was activated.
     * </p>
     */
    private String version;

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

    public GetPipelineDefinitionRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to use
     * the last definition saved to the pipeline or <code>active</code> to use the last definition that was activated.
     * </p>
     * 
     * @param version
     *        The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to
     *        use the last definition saved to the pipeline or <code>active</code> to use the last definition that was
     *        activated.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to use
     * the last definition saved to the pipeline or <code>active</code> to use the last definition that was activated.
     * </p>
     * 
     * @return The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default)
     *         to use the last definition saved to the pipeline or <code>active</code> to use the last definition that
     *         was activated.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to use
     * the last definition saved to the pipeline or <code>active</code> to use the last definition that was activated.
     * </p>
     * 
     * @param version
     *        The version of the pipeline definition to retrieve. Set this parameter to <code>latest</code> (default) to
     *        use the last definition saved to the pipeline or <code>active</code> to use the last definition that was
     *        activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPipelineDefinitionRequest withVersion(String version) {
        setVersion(version);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPipelineDefinitionRequest == false)
            return false;
        GetPipelineDefinitionRequest other = (GetPipelineDefinitionRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetPipelineDefinitionRequest clone() {
        return (GetPipelineDefinitionRequest) super.clone();
    }

}
