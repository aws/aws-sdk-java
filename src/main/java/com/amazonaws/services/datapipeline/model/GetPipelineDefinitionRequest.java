/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#getPipelineDefinition(GetPipelineDefinitionRequest) GetPipelineDefinition operation}.
 * <p>
 * Returns the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition you provided using
 * PutPipelineDefinition.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#getPipelineDefinition(GetPipelineDefinitionRequest)
 */
public class GetPipelineDefinitionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The version of the pipeline definition to retrieve. This parameter
     * accepts the values <code>latest</code> (default) and
     * <code>active</code>. Where <code>latest</code> indicates the last
     * definition saved to the pipeline and <code>active</code> indicates the
     * last definition of the pipeline that was activated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String version;

    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The identifier of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The identifier of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The identifier of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetPipelineDefinitionRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The version of the pipeline definition to retrieve. This parameter
     * accepts the values <code>latest</code> (default) and
     * <code>active</code>. Where <code>latest</code> indicates the last
     * definition saved to the pipeline and <code>active</code> indicates the
     * last definition of the pipeline that was activated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The version of the pipeline definition to retrieve. This parameter
     *         accepts the values <code>latest</code> (default) and
     *         <code>active</code>. Where <code>latest</code> indicates the last
     *         definition saved to the pipeline and <code>active</code> indicates the
     *         last definition of the pipeline that was activated.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the pipeline definition to retrieve. This parameter
     * accepts the values <code>latest</code> (default) and
     * <code>active</code>. Where <code>latest</code> indicates the last
     * definition saved to the pipeline and <code>active</code> indicates the
     * last definition of the pipeline that was activated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param version The version of the pipeline definition to retrieve. This parameter
     *         accepts the values <code>latest</code> (default) and
     *         <code>active</code>. Where <code>latest</code> indicates the last
     *         definition saved to the pipeline and <code>active</code> indicates the
     *         last definition of the pipeline that was activated.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the pipeline definition to retrieve. This parameter
     * accepts the values <code>latest</code> (default) and
     * <code>active</code>. Where <code>latest</code> indicates the last
     * definition saved to the pipeline and <code>active</code> indicates the
     * last definition of the pipeline that was activated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param version The version of the pipeline definition to retrieve. This parameter
     *         accepts the values <code>latest</code> (default) and
     *         <code>active</code>. Where <code>latest</code> indicates the last
     *         definition saved to the pipeline and <code>active</code> indicates the
     *         last definition of the pipeline that was activated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetPipelineDefinitionRequest withVersion(String version) {
        this.version = version;
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
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPipelineDefinitionRequest == false) return false;
        GetPipelineDefinitionRequest other = (GetPipelineDefinitionRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    