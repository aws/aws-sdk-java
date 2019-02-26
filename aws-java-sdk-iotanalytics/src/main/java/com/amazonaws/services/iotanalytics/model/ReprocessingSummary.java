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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about pipeline reprocessing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ReprocessingSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReprocessingSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 'reprocessingId' returned by "StartPipelineReprocessing".
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the pipeline reprocessing.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the pipeline reprocessing was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The 'reprocessingId' returned by "StartPipelineReprocessing".
     * </p>
     * 
     * @param id
     *        The 'reprocessingId' returned by "StartPipelineReprocessing".
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The 'reprocessingId' returned by "StartPipelineReprocessing".
     * </p>
     * 
     * @return The 'reprocessingId' returned by "StartPipelineReprocessing".
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The 'reprocessingId' returned by "StartPipelineReprocessing".
     * </p>
     * 
     * @param id
     *        The 'reprocessingId' returned by "StartPipelineReprocessing".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReprocessingSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline reprocessing.
     * </p>
     * 
     * @param status
     *        The status of the pipeline reprocessing.
     * @see ReprocessingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the pipeline reprocessing.
     * </p>
     * 
     * @return The status of the pipeline reprocessing.
     * @see ReprocessingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the pipeline reprocessing.
     * </p>
     * 
     * @param status
     *        The status of the pipeline reprocessing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReprocessingStatus
     */

    public ReprocessingSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline reprocessing.
     * </p>
     * 
     * @param status
     *        The status of the pipeline reprocessing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReprocessingStatus
     */

    public ReprocessingSummary withStatus(ReprocessingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the pipeline reprocessing was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipeline reprocessing was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the pipeline reprocessing was created.
     * </p>
     * 
     * @return The time the pipeline reprocessing was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the pipeline reprocessing was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipeline reprocessing was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReprocessingSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReprocessingSummary == false)
            return false;
        ReprocessingSummary other = (ReprocessingSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ReprocessingSummary clone() {
        try {
            return (ReprocessingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ReprocessingSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
