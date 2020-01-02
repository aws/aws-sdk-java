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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DetachNetworkInterfaceRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DetachNetworkInterface.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DetachNetworkInterfaceRequest> {

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach a
     * different network interface to the same index on the instance without first stopping and starting the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata</a> might
     * not get updated. This means that the attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachNetworkInterfaceRequest withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach a
     * different network interface to the same index on the instance without first stopping and starting the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata</a> might
     * not get updated. This means that the attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param force
     *        Specifies whether to force a detachment.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach
     *        a different network interface to the same index on the instance without first stopping and starting the
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you force the detachment of a network interface, the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance
     *        metadata</a> might not get updated. This means that the attributes associated with the detached network
     *        interface might still be visible. The instance metadata will get updated when you stop and start the
     *        instance.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach a
     * different network interface to the same index on the instance without first stopping and starting the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata</a> might
     * not get updated. This means that the attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Specifies whether to force a detachment.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use the <code>Force</code> parameter to detach a network interface, you might not be able to
     *         attach a different network interface to the same index on the instance without first stopping and
     *         starting the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you force the detachment of a network interface, the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance
     *         metadata</a> might not get updated. This means that the attributes associated with the detached network
     *         interface might still be visible. The instance metadata will get updated when you stop and start the
     *         instance.
     *         </p>
     *         </li>
     *         </ul>
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach a
     * different network interface to the same index on the instance without first stopping and starting the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata</a> might
     * not get updated. This means that the attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param force
     *        Specifies whether to force a detachment.</p> <note>
     *        <ul>
     *        <li>
     *        <p>
     *        Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach
     *        a different network interface to the same index on the instance without first stopping and starting the
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you force the detachment of a network interface, the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance
     *        metadata</a> might not get updated. This means that the attributes associated with the detached network
     *        interface might still be visible. The instance metadata will get updated when you stop and start the
     *        instance.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachNetworkInterfaceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network interface, you might not be able to attach a
     * different network interface to the same index on the instance without first stopping and starting the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata</a> might
     * not get updated. This means that the attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Specifies whether to force a detachment.</p> <note>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <code>Force</code> parameter only as a last resort to detach a network interface from a failed
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use the <code>Force</code> parameter to detach a network interface, you might not be able to
     *         attach a different network interface to the same index on the instance without first stopping and
     *         starting the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you force the detachment of a network interface, the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance
     *         metadata</a> might not get updated. This means that the attributes associated with the detached network
     *         interface might still be visible. The instance metadata will get updated when you stop and start the
     *         instance.
     *         </p>
     *         </li>
     *         </ul>
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DetachNetworkInterfaceRequest> getDryRunRequest() {
        Request<DetachNetworkInterfaceRequest> request = new DetachNetworkInterfaceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachNetworkInterfaceRequest == false)
            return false;
        DetachNetworkInterfaceRequest other = (DetachNetworkInterfaceRequest) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DetachNetworkInterfaceRequest clone() {
        return (DetachNetworkInterfaceRequest) super.clone();
    }
}
