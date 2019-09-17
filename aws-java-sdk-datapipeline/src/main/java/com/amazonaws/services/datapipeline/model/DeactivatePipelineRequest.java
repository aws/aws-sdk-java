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
 * Contains the parameters for DeactivatePipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeactivatePipeline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeactivatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects
     * to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running objects finish.
     * </p>
     */
    private Boolean cancelActive;

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

    public DeactivatePipelineRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects
     * to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running objects finish.
     * </p>
     * 
     * @param cancelActive
     *        Indicates whether to cancel any running objects. The default is true, which sets the state of any running
     *        objects to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running
     *        objects finish.
     */

    public void setCancelActive(Boolean cancelActive) {
        this.cancelActive = cancelActive;
    }

    /**
     * <p>
     * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects
     * to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running objects finish.
     * </p>
     * 
     * @return Indicates whether to cancel any running objects. The default is true, which sets the state of any running
     *         objects to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     */

    public Boolean getCancelActive() {
        return this.cancelActive;
    }

    /**
     * <p>
     * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects
     * to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running objects finish.
     * </p>
     * 
     * @param cancelActive
     *        Indicates whether to cancel any running objects. The default is true, which sets the state of any running
     *        objects to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running
     *        objects finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivatePipelineRequest withCancelActive(Boolean cancelActive) {
        setCancelActive(cancelActive);
        return this;
    }

    /**
     * <p>
     * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects
     * to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running objects finish.
     * </p>
     * 
     * @return Indicates whether to cancel any running objects. The default is true, which sets the state of any running
     *         objects to <code>CANCELED</code>. If this value is false, the pipeline is deactivated after all running
     *         objects finish.
     */

    public Boolean isCancelActive() {
        return this.cancelActive;
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
        if (getCancelActive() != null)
            sb.append("CancelActive: ").append(getCancelActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeactivatePipelineRequest == false)
            return false;
        DeactivatePipelineRequest other = (DeactivatePipelineRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getCancelActive() == null ^ this.getCancelActive() == null)
            return false;
        if (other.getCancelActive() != null && other.getCancelActive().equals(this.getCancelActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getCancelActive() == null) ? 0 : getCancelActive().hashCode());
        return hashCode;
    }

    @Override
    public DeactivatePipelineRequest clone() {
        return (DeactivatePipelineRequest) super.clone();
    }

}
