/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyIpamRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyIpamRequest> {

    /**
     * <p>
     * The ID of the IPAM you want to modify.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * The description of the IPAM you want to modify.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     * allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions
     * you select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> addOperatingRegions;
    /**
     * <p>
     * The operating Regions to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion> removeOperatingRegions;

    /**
     * <p>
     * The ID of the IPAM you want to modify.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM you want to modify.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM you want to modify.
     * </p>
     * 
     * @return The ID of the IPAM you want to modify.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM you want to modify.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * The description of the IPAM you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the IPAM you want to modify.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IPAM you want to modify.
     * </p>
     * 
     * @return The description of the IPAM you want to modify.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IPAM you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the IPAM you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     * allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions
     * you select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @return Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the
     *         IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web
     *         Services Regions you select as operating Regions.</p>
     *         <p>
     *         For more information about operating Regions, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *         VPC IPAM User Guide</i>.
     */

    public java.util.List<AddIpamOperatingRegion> getAddOperatingRegions() {
        if (addOperatingRegions == null) {
            addOperatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>();
        }
        return addOperatingRegions;
    }

    /**
     * <p>
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     * allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions
     * you select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param addOperatingRegions
     *        Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the
     *        IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web
     *        Services Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
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
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     * allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions
     * you select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddOperatingRegions(java.util.Collection)} or {@link #withAddOperatingRegions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addOperatingRegions
     *        Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the
     *        IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web
     *        Services Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withAddOperatingRegions(AddIpamOperatingRegion... addOperatingRegions) {
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
     * Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     * allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions
     * you select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param addOperatingRegions
     *        Choose the operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the
     *        IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web
     *        Services Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withAddOperatingRegions(java.util.Collection<AddIpamOperatingRegion> addOperatingRegions) {
        setAddOperatingRegions(addOperatingRegions);
        return this;
    }

    /**
     * <p>
     * The operating Regions to remove.
     * </p>
     * 
     * @return The operating Regions to remove.
     */

    public java.util.List<RemoveIpamOperatingRegion> getRemoveOperatingRegions() {
        if (removeOperatingRegions == null) {
            removeOperatingRegions = new com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>();
        }
        return removeOperatingRegions;
    }

    /**
     * <p>
     * The operating Regions to remove.
     * </p>
     * 
     * @param removeOperatingRegions
     *        The operating Regions to remove.
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
     * The operating Regions to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveOperatingRegions(java.util.Collection)} or
     * {@link #withRemoveOperatingRegions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeOperatingRegions
     *        The operating Regions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withRemoveOperatingRegions(RemoveIpamOperatingRegion... removeOperatingRegions) {
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
     * The operating Regions to remove.
     * </p>
     * 
     * @param removeOperatingRegions
     *        The operating Regions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamRequest withRemoveOperatingRegions(java.util.Collection<RemoveIpamOperatingRegion> removeOperatingRegions) {
        setRemoveOperatingRegions(removeOperatingRegions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIpamRequest> getDryRunRequest() {
        Request<ModifyIpamRequest> request = new ModifyIpamRequestMarshaller().marshall(this);
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
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
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

        if (obj instanceof ModifyIpamRequest == false)
            return false;
        ModifyIpamRequest other = (ModifyIpamRequest) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
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

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddOperatingRegions() == null) ? 0 : getAddOperatingRegions().hashCode());
        hashCode = prime * hashCode + ((getRemoveOperatingRegions() == null) ? 0 : getRemoveOperatingRegions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIpamRequest clone() {
        return (ModifyIpamRequest) super.clone();
    }
}
