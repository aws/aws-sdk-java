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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.PurchaseCapacityBlockRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseCapacityBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<PurchaseCapacityBlockRequest> {

    /**
     * <p>
     * The tags to apply to the Capacity Block during launch.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     */
    private String capacityBlockOfferingId;
    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     */
    private String instancePlatform;

    /**
     * <p>
     * The tags to apply to the Capacity Block during launch.
     * </p>
     * 
     * @return The tags to apply to the Capacity Block during launch.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Block during launch.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Block during launch.
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
     * The tags to apply to the Capacity Block during launch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Block during launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseCapacityBlockRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the Capacity Block during launch.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Block during launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseCapacityBlockRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @param capacityBlockOfferingId
     *        The ID of the Capacity Block offering.
     */

    public void setCapacityBlockOfferingId(String capacityBlockOfferingId) {
        this.capacityBlockOfferingId = capacityBlockOfferingId;
    }

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @return The ID of the Capacity Block offering.
     */

    public String getCapacityBlockOfferingId() {
        return this.capacityBlockOfferingId;
    }

    /**
     * <p>
     * The ID of the Capacity Block offering.
     * </p>
     * 
     * @param capacityBlockOfferingId
     *        The ID of the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseCapacityBlockRequest withCapacityBlockOfferingId(String capacityBlockOfferingId) {
        setCapacityBlockOfferingId(capacityBlockOfferingId);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @see CapacityReservationInstancePlatform
     */

    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @return The type of operating system for which to reserve capacity.
     * @see CapacityReservationInstancePlatform
     */

    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public PurchaseCapacityBlockRequest withInstancePlatform(String instancePlatform) {
        setInstancePlatform(instancePlatform);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public PurchaseCapacityBlockRequest withInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<PurchaseCapacityBlockRequest> getDryRunRequest() {
        Request<PurchaseCapacityBlockRequest> request = new PurchaseCapacityBlockRequestMarshaller().marshall(this);
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
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getCapacityBlockOfferingId() != null)
            sb.append("CapacityBlockOfferingId: ").append(getCapacityBlockOfferingId()).append(",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: ").append(getInstancePlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseCapacityBlockRequest == false)
            return false;
        PurchaseCapacityBlockRequest other = (PurchaseCapacityBlockRequest) obj;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getCapacityBlockOfferingId() == null ^ this.getCapacityBlockOfferingId() == null)
            return false;
        if (other.getCapacityBlockOfferingId() != null && other.getCapacityBlockOfferingId().equals(this.getCapacityBlockOfferingId()) == false)
            return false;
        if (other.getInstancePlatform() == null ^ this.getInstancePlatform() == null)
            return false;
        if (other.getInstancePlatform() != null && other.getInstancePlatform().equals(this.getInstancePlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getCapacityBlockOfferingId() == null) ? 0 : getCapacityBlockOfferingId().hashCode());
        hashCode = prime * hashCode + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseCapacityBlockRequest clone() {
        return (PurchaseCapacityBlockRequest) super.clone();
    }
}
