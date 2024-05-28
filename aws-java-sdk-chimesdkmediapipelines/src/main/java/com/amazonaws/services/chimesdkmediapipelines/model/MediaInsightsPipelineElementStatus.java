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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the pipeline element.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaInsightsPipelineElementStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipelineElementStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of status.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The element's status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The type of status.
     * </p>
     * 
     * @param type
     *        The type of status.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of status.
     * </p>
     * 
     * @return The type of status.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of status.
     * </p>
     * 
     * @param type
     *        The type of status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public MediaInsightsPipelineElementStatus withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of status.
     * </p>
     * 
     * @param type
     *        The type of status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public MediaInsightsPipelineElementStatus withType(MediaInsightsPipelineConfigurationElementType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The element's status.
     * </p>
     * 
     * @param status
     *        The element's status.
     * @see MediaPipelineElementStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The element's status.
     * </p>
     * 
     * @return The element's status.
     * @see MediaPipelineElementStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The element's status.
     * </p>
     * 
     * @param status
     *        The element's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineElementStatus
     */

    public MediaInsightsPipelineElementStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The element's status.
     * </p>
     * 
     * @param status
     *        The element's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineElementStatus
     */

    public MediaInsightsPipelineElementStatus withStatus(MediaPipelineElementStatus status) {
        this.status = status.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaInsightsPipelineElementStatus == false)
            return false;
        MediaInsightsPipelineElementStatus other = (MediaInsightsPipelineElementStatus) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MediaInsightsPipelineElementStatus clone() {
        try {
            return (MediaInsightsPipelineElementStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaInsightsPipelineElementStatusMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
