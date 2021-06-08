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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon Lookout for Vision model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ModelMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The description for the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the model.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Performance metrics for the model. Not available until training has successfully completed.
     * </p>
     */
    private ModelPerformance performance;

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the model was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @return The unix timestamp for the date and time that the model was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the model was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @param description
     *        The description for the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @return The description for the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the model.
     * </p>
     * 
     * @param description
     *        The description for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @return The status of the model.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the model.
     * </p>
     * 
     * @param status
     *        The status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ModelMetadata withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @return The status message for the model.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the model.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Performance metrics for the model. Not available until training has successfully completed.
     * </p>
     * 
     * @param performance
     *        Performance metrics for the model. Not available until training has successfully completed.
     */

    public void setPerformance(ModelPerformance performance) {
        this.performance = performance;
    }

    /**
     * <p>
     * Performance metrics for the model. Not available until training has successfully completed.
     * </p>
     * 
     * @return Performance metrics for the model. Not available until training has successfully completed.
     */

    public ModelPerformance getPerformance() {
        return this.performance;
    }

    /**
     * <p>
     * Performance metrics for the model. Not available until training has successfully completed.
     * </p>
     * 
     * @param performance
     *        Performance metrics for the model. Not available until training has successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelMetadata withPerformance(ModelPerformance performance) {
        setPerformance(performance);
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
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getPerformance() != null)
            sb.append("Performance: ").append(getPerformance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelMetadata == false)
            return false;
        ModelMetadata other = (ModelMetadata) obj;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getPerformance() == null ^ this.getPerformance() == null)
            return false;
        if (other.getPerformance() != null && other.getPerformance().equals(this.getPerformance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getPerformance() == null) ? 0 : getPerformance().hashCode());
        return hashCode;
    }

    @Override
    public ModelMetadata clone() {
        try {
            return (ModelMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ModelMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
