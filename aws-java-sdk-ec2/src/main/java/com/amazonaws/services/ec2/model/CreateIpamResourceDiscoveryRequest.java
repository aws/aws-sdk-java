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
import com.amazonaws.services.ec2.model.transform.CreateIpamResourceDiscoveryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamResourceDiscoveryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateIpamResourceDiscoveryRequest> {

    /**
     * <p>
     * A description for the IPAM resource discovery.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> operatingRegions;
    /**
     * <p>
     * Tag specifications for the IPAM resource discovery.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A client token for the IPAM resource discovery.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A description for the IPAM resource discovery.
     * </p>
     * 
     * @param description
     *        A description for the IPAM resource discovery.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the IPAM resource discovery.
     * </p>
     * 
     * @return A description for the IPAM resource discovery.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the IPAM resource discovery.
     * </p>
     * 
     * @param description
     *        A description for the IPAM resource discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @return Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions
     *         where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the
     *         Amazon Web Services Regions you select as operating Regions.
     */

    public java.util.List<AddIpamOperatingRegion> getOperatingRegions() {
        if (operatingRegions == null) {
            operatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>();
        }
        return operatingRegions;
    }

    /**
     * <p>
     * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param operatingRegions
     *        Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     */

    public void setOperatingRegions(java.util.Collection<AddIpamOperatingRegion> operatingRegions) {
        if (operatingRegions == null) {
            this.operatingRegions = null;
            return;
        }

        this.operatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>(operatingRegions);
    }

    /**
     * <p>
     * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingRegions(java.util.Collection)} or {@link #withOperatingRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingRegions
     *        Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withOperatingRegions(AddIpamOperatingRegion... operatingRegions) {
        if (this.operatingRegions == null) {
            setOperatingRegions(new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>(operatingRegions.length));
        }
        for (AddIpamOperatingRegion ele : operatingRegions) {
            this.operatingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param operatingRegions
     *        Operating Regions for the IPAM resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withOperatingRegions(java.util.Collection<AddIpamOperatingRegion> operatingRegions) {
        setOperatingRegions(operatingRegions);
        return this;
    }

    /**
     * <p>
     * Tag specifications for the IPAM resource discovery.
     * </p>
     * 
     * @return Tag specifications for the IPAM resource discovery.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * Tag specifications for the IPAM resource discovery.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications for the IPAM resource discovery.
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
     * Tag specifications for the IPAM resource discovery.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications for the IPAM resource discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * Tag specifications for the IPAM resource discovery.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications for the IPAM resource discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A client token for the IPAM resource discovery.
     * </p>
     * 
     * @param clientToken
     *        A client token for the IPAM resource discovery.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token for the IPAM resource discovery.
     * </p>
     * 
     * @return A client token for the IPAM resource discovery.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token for the IPAM resource discovery.
     * </p>
     * 
     * @param clientToken
     *        A client token for the IPAM resource discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamResourceDiscoveryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateIpamResourceDiscoveryRequest> getDryRunRequest() {
        Request<CreateIpamResourceDiscoveryRequest> request = new CreateIpamResourceDiscoveryRequestMarshaller().marshall(this);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperatingRegions() != null)
            sb.append("OperatingRegions: ").append(getOperatingRegions()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpamResourceDiscoveryRequest == false)
            return false;
        CreateIpamResourceDiscoveryRequest other = (CreateIpamResourceDiscoveryRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperatingRegions() == null ^ this.getOperatingRegions() == null)
            return false;
        if (other.getOperatingRegions() != null && other.getOperatingRegions().equals(this.getOperatingRegions()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperatingRegions() == null) ? 0 : getOperatingRegions().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpamResourceDiscoveryRequest clone() {
        return (CreateIpamResourceDiscoveryRequest) super.clone();
    }
}
