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
import com.amazonaws.services.ec2.model.transform.ModifyIpamResourceDiscoveryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamResourceDiscoveryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyIpamResourceDiscoveryRequest> {

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * A resource discovery description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM
     * is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> addOperatingRegions;
    /**
     * <p>
     * Remove operating Regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion> removeOperatingRegions;

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @return A resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * A resource discovery description.
     * </p>
     * 
     * @param description
     *        A resource discovery description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A resource discovery description.
     * </p>
     * 
     * @return A resource discovery description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A resource discovery description.
     * </p>
     * 
     * @param description
     *        A resource discovery description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM
     * is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @return Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where
     *         the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *         Web Services Regions you select as operating Regions.
     */

    public java.util.List<AddIpamOperatingRegion> getAddOperatingRegions() {
        if (addOperatingRegions == null) {
            addOperatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>();
        }
        return addOperatingRegions;
    }

    /**
     * <p>
     * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM
     * is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param addOperatingRegions
     *        Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     */

    public void setAddOperatingRegions(java.util.Collection<AddIpamOperatingRegion> addOperatingRegions) {
        if (addOperatingRegions == null) {
            this.addOperatingRegions = null;
            return;
        }

        this.addOperatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>(addOperatingRegions);
    }

    /**
     * <p>
     * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM
     * is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOperatingRegions(java.util.Collection)} or {@link #withAddOperatingRegions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addOperatingRegions
     *        Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withAddOperatingRegions(AddIpamOperatingRegion... addOperatingRegions) {
        if (this.addOperatingRegions == null) {
            setAddOperatingRegions(new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>(addOperatingRegions.length));
        }
        for (AddIpamOperatingRegion ele : addOperatingRegions) {
            this.addOperatingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM
     * is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param addOperatingRegions
     *        Add operating Regions to the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withAddOperatingRegions(java.util.Collection<AddIpamOperatingRegion> addOperatingRegions) {
        setAddOperatingRegions(addOperatingRegions);
        return this;
    }

    /**
     * <p>
     * Remove operating Regions.
     * </p>
     * 
     * @return Remove operating Regions.
     */

    public java.util.List<RemoveIpamOperatingRegion> getRemoveOperatingRegions() {
        if (removeOperatingRegions == null) {
            removeOperatingRegions = new com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>();
        }
        return removeOperatingRegions;
    }

    /**
     * <p>
     * Remove operating Regions.
     * </p>
     * 
     * @param removeOperatingRegions
     *        Remove operating Regions.
     */

    public void setRemoveOperatingRegions(java.util.Collection<RemoveIpamOperatingRegion> removeOperatingRegions) {
        if (removeOperatingRegions == null) {
            this.removeOperatingRegions = null;
            return;
        }

        this.removeOperatingRegions = new com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>(removeOperatingRegions);
    }

    /**
     * <p>
     * Remove operating Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveOperatingRegions(java.util.Collection)} or
     * {@link #withRemoveOperatingRegions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeOperatingRegions
     *        Remove operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withRemoveOperatingRegions(RemoveIpamOperatingRegion... removeOperatingRegions) {
        if (this.removeOperatingRegions == null) {
            setRemoveOperatingRegions(new com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>(removeOperatingRegions.length));
        }
        for (RemoveIpamOperatingRegion ele : removeOperatingRegions) {
            this.removeOperatingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Remove operating Regions.
     * </p>
     * 
     * @param removeOperatingRegions
     *        Remove operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamResourceDiscoveryRequest withRemoveOperatingRegions(java.util.Collection<RemoveIpamOperatingRegion> removeOperatingRegions) {
        setRemoveOperatingRegions(removeOperatingRegions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIpamResourceDiscoveryRequest> getDryRunRequest() {
        Request<ModifyIpamResourceDiscoveryRequest> request = new ModifyIpamResourceDiscoveryRequestMarshaller().marshall(this);
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
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAddOperatingRegions() != null)
            sb.append("AddOperatingRegions: ").append(getAddOperatingRegions()).append(",");
        if (getRemoveOperatingRegions() != null)
            sb.append("RemoveOperatingRegions: ").append(getRemoveOperatingRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIpamResourceDiscoveryRequest == false)
            return false;
        ModifyIpamResourceDiscoveryRequest other = (ModifyIpamResourceDiscoveryRequest) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAddOperatingRegions() == null ^ this.getAddOperatingRegions() == null)
            return false;
        if (other.getAddOperatingRegions() != null && other.getAddOperatingRegions().equals(this.getAddOperatingRegions()) == false)
            return false;
        if (other.getRemoveOperatingRegions() == null ^ this.getRemoveOperatingRegions() == null)
            return false;
        if (other.getRemoveOperatingRegions() != null && other.getRemoveOperatingRegions().equals(this.getRemoveOperatingRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddOperatingRegions() == null) ? 0 : getAddOperatingRegions().hashCode());
        hashCode = prime * hashCode + ((getRemoveOperatingRegions() == null) ? 0 : getRemoveOperatingRegions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIpamResourceDiscoveryRequest clone() {
        return (ModifyIpamResourceDiscoveryRequest) super.clone();
    }
}
