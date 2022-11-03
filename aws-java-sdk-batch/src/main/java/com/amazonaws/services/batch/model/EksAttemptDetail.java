/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the details of a job attempt for a job attempt by an Amazon EKS container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksAttemptDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksAttemptDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details for the final status of the containers for this job attempt.
     * </p>
     */
    private java.util.List<EksAttemptContainerDetail> containers;
    /**
     * <p>
     * The name of the pod for this job attempt.
     * </p>
     */
    private String podName;
    /**
     * <p>
     * The name of the node for this job attempt.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     */
    private Long startedAt;
    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     */
    private Long stoppedAt;
    /**
     * <p>
     * A short, human-readable string to provide additional details for the current status of the job attempt.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The details for the final status of the containers for this job attempt.
     * </p>
     * 
     * @return The details for the final status of the containers for this job attempt.
     */

    public java.util.List<EksAttemptContainerDetail> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The details for the final status of the containers for this job attempt.
     * </p>
     * 
     * @param containers
     *        The details for the final status of the containers for this job attempt.
     */

    public void setContainers(java.util.Collection<EksAttemptContainerDetail> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<EksAttemptContainerDetail>(containers);
    }

    /**
     * <p>
     * The details for the final status of the containers for this job attempt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The details for the final status of the containers for this job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withContainers(EksAttemptContainerDetail... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<EksAttemptContainerDetail>(containers.length));
        }
        for (EksAttemptContainerDetail ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details for the final status of the containers for this job attempt.
     * </p>
     * 
     * @param containers
     *        The details for the final status of the containers for this job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withContainers(java.util.Collection<EksAttemptContainerDetail> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The name of the pod for this job attempt.
     * </p>
     * 
     * @param podName
     *        The name of the pod for this job attempt.
     */

    public void setPodName(String podName) {
        this.podName = podName;
    }

    /**
     * <p>
     * The name of the pod for this job attempt.
     * </p>
     * 
     * @return The name of the pod for this job attempt.
     */

    public String getPodName() {
        return this.podName;
    }

    /**
     * <p>
     * The name of the pod for this job attempt.
     * </p>
     * 
     * @param podName
     *        The name of the pod for this job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withPodName(String podName) {
        setPodName(podName);
        return this;
    }

    /**
     * <p>
     * The name of the node for this job attempt.
     * </p>
     * 
     * @param nodeName
     *        The name of the node for this job attempt.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The name of the node for this job attempt.
     * </p>
     * 
     * @return The name of the node for this job attempt.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The name of the node for this job attempt.
     * </p>
     * 
     * @param nodeName
     *        The name of the node for this job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from
     *        the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from
     *         the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in milliseconds) for when the attempt was started (when the attempt transitioned from
     *        the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withStartedAt(Long startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt
     *        transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>.
     */

    public void setStoppedAt(Long stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @return The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt
     *         transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *         <code>FAILED</code>.
     */

    public Long getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt transitioned
     * from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in milliseconds) for when the attempt was stopped. This happens when the attempt
     *        transitioned from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withStoppedAt(Long stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details for the current status of the job attempt.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details for the current status of the job attempt.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details for the current status of the job attempt.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details for the current status of the job attempt.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details for the current status of the job attempt.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details for the current status of the job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAttemptDetail withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getPodName() != null)
            sb.append("PodName: ").append(getPodName()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksAttemptDetail == false)
            return false;
        EksAttemptDetail other = (EksAttemptDetail) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getPodName() == null ^ this.getPodName() == null)
            return false;
        if (other.getPodName() != null && other.getPodName().equals(this.getPodName()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getPodName() == null) ? 0 : getPodName().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public EksAttemptDetail clone() {
        try {
            return (EksAttemptDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksAttemptDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
