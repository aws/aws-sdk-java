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
import com.amazonaws.services.ec2.model.transform.CreateIpamRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateIpamRequest> {

    /**
     * <p>
     * A description for the IPAM.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
     * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you
     * select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> operatingRegions;
    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A description for the IPAM.
     * </p>
     * 
     * @param description
     *        A description for the IPAM.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the IPAM.
     * </p>
     * 
     * @return A description for the IPAM.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the IPAM.
     * </p>
     * 
     * @param description
     *        A description for the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
     * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you
     * select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @return The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *         allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *         Regions you select as operating Regions.</p>
     *         <p>
     *         For more information about operating Regions, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *         VPC IPAM User Guide</i>.
     */

    public java.util.List<AddIpamOperatingRegion> getOperatingRegions() {
        if (operatingRegions == null) {
            operatingRegions = new com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>();
        }
        return operatingRegions;
    }

    /**
     * <p>
     * The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
     * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you
     * select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
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
     * The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
     * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you
     * select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingRegions(java.util.Collection)} or {@link #withOperatingRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withOperatingRegions(AddIpamOperatingRegion... operatingRegions) {
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
     * The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed
     * to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you
     * select as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withOperatingRegions(java.util.Collection<AddIpamOperatingRegion> operatingRegions) {
        setOperatingRegions(operatingRegions);
        return this;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @return The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *         tag value as the filter value. For example, to find all resources that have a tag with the key
     *         <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *         and <code>TeamA</code> for the filter value.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateIpamRequest> getDryRunRequest() {
        Request<CreateIpamRequest> request = new CreateIpamRequestMarshaller().marshall(this);
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

        if (obj instanceof CreateIpamRequest == false)
            return false;
        CreateIpamRequest other = (CreateIpamRequest) obj;
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
    public CreateIpamRequest clone() {
        return (CreateIpamRequest) super.clone();
    }
}
