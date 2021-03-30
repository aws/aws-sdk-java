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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateReplaceRootVolumeTaskRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplaceRootVolumeTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateReplaceRootVolumeTaskRequest> {

    /**
     * <p>
     * The ID of the instance for which to replace the root volume.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the snapshot from which to restore the replacement root volume. If you want to restore the volume to
     * the initial launch state, omit this parameter.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, a randomly generated token is used for the request to ensure idempotency. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to apply to the root volume replacement task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the instance for which to replace the root volume.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which to replace the root volume.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which to replace the root volume.
     * </p>
     * 
     * @return The ID of the instance for which to replace the root volume.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which to replace the root volume.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which to replace the root volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot from which to restore the replacement root volume. If you want to restore the volume to
     * the initial launch state, omit this parameter.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot from which to restore the replacement root volume. If you want to restore the
     *        volume to the initial launch state, omit this parameter.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot from which to restore the replacement root volume. If you want to restore the volume to
     * the initial launch state, omit this parameter.
     * </p>
     * 
     * @return The ID of the snapshot from which to restore the replacement root volume. If you want to restore the
     *         volume to the initial launch state, omit this parameter.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot from which to restore the replacement root volume. If you want to restore the volume to
     * the initial launch state, omit this parameter.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot from which to restore the replacement root volume. If you want to restore the
     *        volume to the initial launch state, omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, a randomly generated token is used for the request to ensure idempotency. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, a randomly generated token is used for the request to ensure idempotency. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *         specify a client token, a randomly generated token is used for the request to ensure idempotency. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, a randomly generated token is used for the request to ensure idempotency. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the root volume replacement task.
     * </p>
     * 
     * @return The tags to apply to the root volume replacement task.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the root volume replacement task.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the root volume replacement task.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the root volume replacement task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the root volume replacement task.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateReplaceRootVolumeTaskRequest> getDryRunRequest() {
        Request<CreateReplaceRootVolumeTaskRequest> request = new CreateReplaceRootVolumeTaskRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplaceRootVolumeTaskRequest == false)
            return false;
        CreateReplaceRootVolumeTaskRequest other = (CreateReplaceRootVolumeTaskRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplaceRootVolumeTaskRequest clone() {
        return (CreateReplaceRootVolumeTaskRequest) super.clone();
    }
}
