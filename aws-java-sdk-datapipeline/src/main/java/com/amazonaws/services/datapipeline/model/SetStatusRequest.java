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
 * Contains the parameters for SetStatus.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline that contains the objects.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both
     * types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> objectIds;
    /**
     * <p>
     * The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the pipeline that contains the objects.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that contains the objects.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that contains the objects.
     * </p>
     * 
     * @return The ID of the pipeline that contains the objects.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline that contains the objects.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline that contains the objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStatusRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both
     * types.
     * </p>
     * 
     * @return The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of
     *         both types.
     */

    public java.util.List<String> getObjectIds() {
        if (objectIds == null) {
            objectIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return objectIds;
    }

    /**
     * <p>
     * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both
     * types.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of
     *        both types.
     */

    public void setObjectIds(java.util.Collection<String> objectIds) {
        if (objectIds == null) {
            this.objectIds = null;
            return;
        }

        this.objectIds = new com.amazonaws.internal.SdkInternalList<String>(objectIds);
    }

    /**
     * <p>
     * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both
     * types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectIds(java.util.Collection)} or {@link #withObjectIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of
     *        both types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStatusRequest withObjectIds(String... objectIds) {
        if (this.objectIds == null) {
            setObjectIds(new com.amazonaws.internal.SdkInternalList<String>(objectIds.length));
        }
        for (String ele : objectIds) {
            this.objectIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both
     * types.
     * </p>
     * 
     * @param objectIds
     *        The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of
     *        both types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStatusRequest withObjectIds(java.util.Collection<String> objectIds) {
        setObjectIds(objectIds);
        return this;
    }

    /**
     * <p>
     * The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * </p>
     * 
     * @param status
     *        The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     *        <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>,
     *        or <code>MARK_FINISHED</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * </p>
     * 
     * @return The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     *         <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>
     *         , or <code>MARK_FINISHED</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     * <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>, or
     * <code>MARK_FINISHED</code>.
     * </p>
     * 
     * @param status
     *        The status to be set on all the objects specified in <code>objectIds</code>. For components, use
     *        <code>PAUSE</code> or <code>RESUME</code>. For instances, use <code>TRY_CANCEL</code>, <code>RERUN</code>,
     *        or <code>MARK_FINISHED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStatusRequest withStatus(String status) {
        setStatus(status);
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
        if (getObjectIds() != null)
            sb.append("ObjectIds: ").append(getObjectIds()).append(",");
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

        if (obj instanceof SetStatusRequest == false)
            return false;
        SetStatusRequest other = (SetStatusRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getObjectIds() == null ^ this.getObjectIds() == null)
            return false;
        if (other.getObjectIds() != null && other.getObjectIds().equals(this.getObjectIds()) == false)
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

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getObjectIds() == null) ? 0 : getObjectIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SetStatusRequest clone() {
        return (SetStatusRequest) super.clone();
    }

}
