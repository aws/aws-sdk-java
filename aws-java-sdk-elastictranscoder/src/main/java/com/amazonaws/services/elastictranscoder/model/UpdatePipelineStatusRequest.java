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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>UpdatePipelineStatusRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the pipeline to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The desired status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The identifier of the pipeline to update.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the pipeline to update.
     * </p>
     * 
     * @return The identifier of the pipeline to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the pipeline to update.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineStatusRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The desired status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The desired status of the pipeline:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The pipeline is processing jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Paused</code>: The pipeline is not currently processing jobs.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The desired status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The desired status of the pipeline:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code>: The pipeline is processing jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Paused</code>: The pipeline is not currently processing jobs.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The desired status of the pipeline:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code>: The pipeline is processing jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Paused</code>: The pipeline is not currently processing jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The desired status of the pipeline:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code>: The pipeline is processing jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Paused</code>: The pipeline is not currently processing jobs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineStatusRequest withStatus(String status) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof UpdatePipelineStatusRequest == false)
            return false;
        UpdatePipelineStatusRequest other = (UpdatePipelineStatusRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineStatusRequest clone() {
        return (UpdatePipelineStatusRequest) super.clone();
    }

}
