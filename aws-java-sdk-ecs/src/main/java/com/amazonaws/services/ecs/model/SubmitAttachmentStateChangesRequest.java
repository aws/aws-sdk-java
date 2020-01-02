/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitAttachmentStateChanges" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitAttachmentStateChangesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachmentStateChange> attachments;

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     * </p>
     * 
     * @param cluster
     *        The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     * </p>
     * 
     * @return The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     * </p>
     * 
     * @param cluster
     *        The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitAttachmentStateChangesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @return Any attachments associated with the state change request.
     */

    public java.util.List<AttachmentStateChange> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>();
        }
        return attachments;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     */

    public void setAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>(attachments);
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitAttachmentStateChangesRequest withAttachments(AttachmentStateChange... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>(attachments.length));
        }
        for (AttachmentStateChange ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitAttachmentStateChangesRequest withAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        setAttachments(attachments);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitAttachmentStateChangesRequest == false)
            return false;
        SubmitAttachmentStateChangesRequest other = (SubmitAttachmentStateChangesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public SubmitAttachmentStateChangesRequest clone() {
        return (SubmitAttachmentStateChangesRequest) super.clone();
    }

}
