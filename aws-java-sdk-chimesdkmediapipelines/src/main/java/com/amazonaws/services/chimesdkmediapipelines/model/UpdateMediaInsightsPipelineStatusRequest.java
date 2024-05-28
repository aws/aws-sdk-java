/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMediaInsightsPipelineStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The requested status of the media insights pipeline.
     * </p>
     */
    private String updateStatus;

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *        insights pipeline.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @return The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *         insights pipeline.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media insights
     * pipeline.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the resource to be updated. Valid values include the ID and ARN of the media
     *        insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineStatusRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The requested status of the media insights pipeline.
     * </p>
     * 
     * @param updateStatus
     *        The requested status of the media insights pipeline.
     * @see MediaPipelineStatusUpdate
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The requested status of the media insights pipeline.
     * </p>
     * 
     * @return The requested status of the media insights pipeline.
     * @see MediaPipelineStatusUpdate
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The requested status of the media insights pipeline.
     * </p>
     * 
     * @param updateStatus
     *        The requested status of the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatusUpdate
     */

    public UpdateMediaInsightsPipelineStatusRequest withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The requested status of the media insights pipeline.
     * </p>
     * 
     * @param updateStatus
     *        The requested status of the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatusUpdate
     */

    public UpdateMediaInsightsPipelineStatusRequest withUpdateStatus(MediaPipelineStatusUpdate updateStatus) {
        this.updateStatus = updateStatus.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMediaInsightsPipelineStatusRequest == false)
            return false;
        UpdateMediaInsightsPipelineStatusRequest other = (UpdateMediaInsightsPipelineStatusRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMediaInsightsPipelineStatusRequest clone() {
        return (UpdateMediaInsightsPipelineStatusRequest) super.clone();
    }

}
