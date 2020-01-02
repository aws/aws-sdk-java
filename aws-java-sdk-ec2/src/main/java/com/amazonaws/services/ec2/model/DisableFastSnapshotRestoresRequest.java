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
import com.amazonaws.services.ec2.model.transform.DisableFastSnapshotRestoresRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFastSnapshotRestoresRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisableFastSnapshotRestoresRequest> {

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceSnapshotIds;

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * 
     * @return One or more Availability Zones. For example, <code>us-east-2a</code>.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones. For example, <code>us-east-2a</code>.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones. For example, <code>us-east-2a</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones. For example, <code>us-east-2a</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * </p>
     * 
     * @return The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     */

    public java.util.List<String> getSourceSnapshotIds() {
        if (sourceSnapshotIds == null) {
            sourceSnapshotIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceSnapshotIds;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * </p>
     * 
     * @param sourceSnapshotIds
     *        The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     */

    public void setSourceSnapshotIds(java.util.Collection<String> sourceSnapshotIds) {
        if (sourceSnapshotIds == null) {
            this.sourceSnapshotIds = null;
            return;
        }

        this.sourceSnapshotIds = new com.amazonaws.internal.SdkInternalList<String>(sourceSnapshotIds);
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceSnapshotIds(java.util.Collection)} or {@link #withSourceSnapshotIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param sourceSnapshotIds
     *        The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresRequest withSourceSnapshotIds(String... sourceSnapshotIds) {
        if (this.sourceSnapshotIds == null) {
            setSourceSnapshotIds(new com.amazonaws.internal.SdkInternalList<String>(sourceSnapshotIds.length));
        }
        for (String ele : sourceSnapshotIds) {
            this.sourceSnapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * </p>
     * 
     * @param sourceSnapshotIds
     *        The IDs of one or more snapshots. For example, <code>snap-1234567890abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresRequest withSourceSnapshotIds(java.util.Collection<String> sourceSnapshotIds) {
        setSourceSnapshotIds(sourceSnapshotIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisableFastSnapshotRestoresRequest> getDryRunRequest() {
        Request<DisableFastSnapshotRestoresRequest> request = new DisableFastSnapshotRestoresRequestMarshaller().marshall(this);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSourceSnapshotIds() != null)
            sb.append("SourceSnapshotIds: ").append(getSourceSnapshotIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoresRequest == false)
            return false;
        DisableFastSnapshotRestoresRequest other = (DisableFastSnapshotRestoresRequest) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSourceSnapshotIds() == null ^ this.getSourceSnapshotIds() == null)
            return false;
        if (other.getSourceSnapshotIds() != null && other.getSourceSnapshotIds().equals(this.getSourceSnapshotIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSourceSnapshotIds() == null) ? 0 : getSourceSnapshotIds().hashCode());
        return hashCode;
    }

    @Override
    public DisableFastSnapshotRestoresRequest clone() {
        return (DisableFastSnapshotRestoresRequest) super.clone();
    }
}
