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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for a resource that the runtime instance of the lifecycle policy identified for action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecycleExecutionResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExecutionResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that owns the impacted resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Identifies the impacted resource. The resource ID depends on the type of resource, as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image Builder image resources: Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Distributed AMIs: AMI ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Container images distributed to an ECR repository: image URI or SHA Digest
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The runtime state for the lifecycle execution.
     * </p>
     */
    private LifecycleExecutionResourceState state;
    /**
     * <p>
     * The action to take for the identified resource.
     * </p>
     */
    private LifecycleExecutionResourceAction action;
    /**
     * <p>
     * The Amazon Web Services Region where the lifecycle execution resource is stored.
     * </p>
     */
    private String region;
    /**
     * <p>
     * A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * </p>
     */
    private java.util.List<LifecycleExecutionSnapshotResource> snapshots;
    /**
     * <p>
     * For an impacted container image, this identifies a list of URIs for associated container images distributed to
     * ECR repositories.
     * </p>
     */
    private java.util.List<String> imageUris;
    /**
     * <p>
     * The starting timestamp from the lifecycle action that was applied to the resource.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The ending timestamp from the lifecycle action that was applied to the resource.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The account that owns the impacted resource.
     * </p>
     * 
     * @param accountId
     *        The account that owns the impacted resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that owns the impacted resource.
     * </p>
     * 
     * @return The account that owns the impacted resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account that owns the impacted resource.
     * </p>
     * 
     * @param accountId
     *        The account that owns the impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Identifies the impacted resource. The resource ID depends on the type of resource, as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image Builder image resources: Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Distributed AMIs: AMI ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Container images distributed to an ECR repository: image URI or SHA Digest
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        Identifies the impacted resource. The resource ID depends on the type of resource, as follows.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image Builder image resources: Amazon Resource Name (ARN)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Distributed AMIs: AMI ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Container images distributed to an ECR repository: image URI or SHA Digest
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Identifies the impacted resource. The resource ID depends on the type of resource, as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image Builder image resources: Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Distributed AMIs: AMI ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Container images distributed to an ECR repository: image URI or SHA Digest
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the impacted resource. The resource ID depends on the type of resource, as follows.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Image Builder image resources: Amazon Resource Name (ARN)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Distributed AMIs: AMI ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Container images distributed to an ECR repository: image URI or SHA Digest
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Identifies the impacted resource. The resource ID depends on the type of resource, as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Image Builder image resources: Amazon Resource Name (ARN)
     * </p>
     * </li>
     * <li>
     * <p>
     * Distributed AMIs: AMI ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Container images distributed to an ECR repository: image URI or SHA Digest
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        Identifies the impacted resource. The resource ID depends on the type of resource, as follows.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Image Builder image resources: Amazon Resource Name (ARN)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Distributed AMIs: AMI ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Container images distributed to an ECR repository: image URI or SHA Digest
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The runtime state for the lifecycle execution.
     * </p>
     * 
     * @param state
     *        The runtime state for the lifecycle execution.
     */

    public void setState(LifecycleExecutionResourceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The runtime state for the lifecycle execution.
     * </p>
     * 
     * @return The runtime state for the lifecycle execution.
     */

    public LifecycleExecutionResourceState getState() {
        return this.state;
    }

    /**
     * <p>
     * The runtime state for the lifecycle execution.
     * </p>
     * 
     * @param state
     *        The runtime state for the lifecycle execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withState(LifecycleExecutionResourceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The action to take for the identified resource.
     * </p>
     * 
     * @param action
     *        The action to take for the identified resource.
     */

    public void setAction(LifecycleExecutionResourceAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take for the identified resource.
     * </p>
     * 
     * @return The action to take for the identified resource.
     */

    public LifecycleExecutionResourceAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take for the identified resource.
     * </p>
     * 
     * @param action
     *        The action to take for the identified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withAction(LifecycleExecutionResourceAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the lifecycle execution resource is stored.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region where the lifecycle execution resource is stored.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the lifecycle execution resource is stored.
     * </p>
     * 
     * @return The Amazon Web Services Region where the lifecycle execution resource is stored.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the lifecycle execution resource is stored.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region where the lifecycle execution resource is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * </p>
     * 
     * @return A list of associated resource snapshots for the impacted resource if it’s an AMI.
     */

    public java.util.List<LifecycleExecutionSnapshotResource> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * </p>
     * 
     * @param snapshots
     *        A list of associated resource snapshots for the impacted resource if it’s an AMI.
     */

    public void setSnapshots(java.util.Collection<LifecycleExecutionSnapshotResource> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<LifecycleExecutionSnapshotResource>(snapshots);
    }

    /**
     * <p>
     * A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshots(java.util.Collection)} or {@link #withSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshots
     *        A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withSnapshots(LifecycleExecutionSnapshotResource... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new java.util.ArrayList<LifecycleExecutionSnapshotResource>(snapshots.length));
        }
        for (LifecycleExecutionSnapshotResource ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * </p>
     * 
     * @param snapshots
     *        A list of associated resource snapshots for the impacted resource if it’s an AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withSnapshots(java.util.Collection<LifecycleExecutionSnapshotResource> snapshots) {
        setSnapshots(snapshots);
        return this;
    }

    /**
     * <p>
     * For an impacted container image, this identifies a list of URIs for associated container images distributed to
     * ECR repositories.
     * </p>
     * 
     * @return For an impacted container image, this identifies a list of URIs for associated container images
     *         distributed to ECR repositories.
     */

    public java.util.List<String> getImageUris() {
        return imageUris;
    }

    /**
     * <p>
     * For an impacted container image, this identifies a list of URIs for associated container images distributed to
     * ECR repositories.
     * </p>
     * 
     * @param imageUris
     *        For an impacted container image, this identifies a list of URIs for associated container images
     *        distributed to ECR repositories.
     */

    public void setImageUris(java.util.Collection<String> imageUris) {
        if (imageUris == null) {
            this.imageUris = null;
            return;
        }

        this.imageUris = new java.util.ArrayList<String>(imageUris);
    }

    /**
     * <p>
     * For an impacted container image, this identifies a list of URIs for associated container images distributed to
     * ECR repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageUris(java.util.Collection)} or {@link #withImageUris(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageUris
     *        For an impacted container image, this identifies a list of URIs for associated container images
     *        distributed to ECR repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withImageUris(String... imageUris) {
        if (this.imageUris == null) {
            setImageUris(new java.util.ArrayList<String>(imageUris.length));
        }
        for (String ele : imageUris) {
            this.imageUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For an impacted container image, this identifies a list of URIs for associated container images distributed to
     * ECR repositories.
     * </p>
     * 
     * @param imageUris
     *        For an impacted container image, this identifies a list of URIs for associated container images
     *        distributed to ECR repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withImageUris(java.util.Collection<String> imageUris) {
        setImageUris(imageUris);
        return this;
    }

    /**
     * <p>
     * The starting timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @param startTime
     *        The starting timestamp from the lifecycle action that was applied to the resource.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @return The starting timestamp from the lifecycle action that was applied to the resource.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The starting timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @param startTime
     *        The starting timestamp from the lifecycle action that was applied to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The ending timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @param endTime
     *        The ending timestamp from the lifecycle action that was applied to the resource.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The ending timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @return The ending timestamp from the lifecycle action that was applied to the resource.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The ending timestamp from the lifecycle action that was applied to the resource.
     * </p>
     * 
     * @param endTime
     *        The ending timestamp from the lifecycle action that was applied to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResource withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getSnapshots() != null)
            sb.append("Snapshots: ").append(getSnapshots()).append(",");
        if (getImageUris() != null)
            sb.append("ImageUris: ").append(getImageUris()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleExecutionResource == false)
            return false;
        LifecycleExecutionResource other = (LifecycleExecutionResource) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        if (other.getImageUris() == null ^ this.getImageUris() == null)
            return false;
        if (other.getImageUris() != null && other.getImageUris().equals(this.getImageUris()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        hashCode = prime * hashCode + ((getImageUris() == null) ? 0 : getImageUris().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleExecutionResource clone() {
        try {
            return (LifecycleExecutionResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecycleExecutionResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
