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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CancelPipelineReprocessing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelPipelineReprocessingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of pipeline for which data reprocessing is canceled.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     * </p>
     */
    private String reprocessingId;

    /**
     * <p>
     * The name of pipeline for which data reprocessing is canceled.
     * </p>
     * 
     * @param pipelineName
     *        The name of pipeline for which data reprocessing is canceled.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of pipeline for which data reprocessing is canceled.
     * </p>
     * 
     * @return The name of pipeline for which data reprocessing is canceled.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of pipeline for which data reprocessing is canceled.
     * </p>
     * 
     * @param pipelineName
     *        The name of pipeline for which data reprocessing is canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelPipelineReprocessingRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     * </p>
     * 
     * @param reprocessingId
     *        The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     */

    public void setReprocessingId(String reprocessingId) {
        this.reprocessingId = reprocessingId;
    }

    /**
     * <p>
     * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     * </p>
     * 
     * @return The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     */

    public String getReprocessingId() {
        return this.reprocessingId;
    }

    /**
     * <p>
     * The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     * </p>
     * 
     * @param reprocessingId
     *        The ID of the reprocessing task (returned by "StartPipelineReprocessing").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelPipelineReprocessingRequest withReprocessingId(String reprocessingId) {
        setReprocessingId(reprocessingId);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getReprocessingId() != null)
            sb.append("ReprocessingId: ").append(getReprocessingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelPipelineReprocessingRequest == false)
            return false;
        CancelPipelineReprocessingRequest other = (CancelPipelineReprocessingRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getReprocessingId() == null ^ this.getReprocessingId() == null)
            return false;
        if (other.getReprocessingId() != null && other.getReprocessingId().equals(this.getReprocessingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getReprocessingId() == null) ? 0 : getReprocessingId().hashCode());
        return hashCode;
    }

    @Override
    public CancelPipelineReprocessingRequest clone() {
        return (CancelPipelineReprocessingRequest) super.clone();
    }

}
