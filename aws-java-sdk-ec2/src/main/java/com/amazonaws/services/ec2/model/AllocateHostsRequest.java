/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AllocateHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateHostsRequest> {

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     */
    private String autoPlacement;
    /**
     * <p>
     * The Availability Zone for the Dedicated Hosts.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that
     * is the only instance type that you can launch onto that host.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     * 
     * @param autoPlacement
     *        This is enabled by default. This property allows instances to be automatically placed onto available
     *        Dedicated Hosts, when you are launching instances without specifying a host ID.</p>
     *        <p>
     *        Default: Enabled
     * @see AutoPlacement
     */

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     * 
     * @return This is enabled by default. This property allows instances to be automatically placed onto available
     *         Dedicated Hosts, when you are launching instances without specifying a host ID.</p>
     *         <p>
     *         Default: Enabled
     * @see AutoPlacement
     */

    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     * 
     * @param autoPlacement
     *        This is enabled by default. This property allows instances to be automatically placed onto available
     *        Dedicated Hosts, when you are launching instances without specifying a host ID.</p>
     *        <p>
     *        Default: Enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public AllocateHostsRequest withAutoPlacement(String autoPlacement) {
        setAutoPlacement(autoPlacement);
        return this;
    }

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     * 
     * @param autoPlacement
     *        This is enabled by default. This property allows instances to be automatically placed onto available
     *        Dedicated Hosts, when you are launching instances without specifying a host ID.</p>
     *        <p>
     *        Default: Enabled
     * @see AutoPlacement
     */

    public void setAutoPlacement(AutoPlacement autoPlacement) {
        withAutoPlacement(autoPlacement);
    }

    /**
     * <p>
     * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated
     * Hosts, when you are launching instances without specifying a host ID.
     * </p>
     * <p>
     * Default: Enabled
     * </p>
     * 
     * @param autoPlacement
     *        This is enabled by default. This property allows instances to be automatically placed onto available
     *        Dedicated Hosts, when you are launching instances without specifying a host ID.</p>
     *        <p>
     *        Default: Enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public AllocateHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the Dedicated Hosts.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the Dedicated Hosts.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the Dedicated Hosts.
     * </p>
     * 
     * @return The Availability Zone for the Dedicated Hosts.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the Dedicated Hosts.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that
     * is the only instance type that you can launch onto that host.
     * </p>
     * 
     * @param instanceType
     *        Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type,
     *        that is the only instance type that you can launch onto that host.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that
     * is the only instance type that you can launch onto that host.
     * </p>
     * 
     * @return Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance
     *         type, that is the only instance type that you can launch onto that host.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that
     * is the only instance type that you can launch onto that host.
     * </p>
     * 
     * @param instanceType
     *        Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type,
     *        that is the only instance type that you can launch onto that host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @return The number of Dedicated Hosts to allocate to your account with these parameters.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @return The tags to apply to the Dedicated Host during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
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
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AllocateHostsRequest> getDryRunRequest() {
        Request<AllocateHostsRequest> request = new AllocateHostsRequestMarshaller().marshall(this);
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: ").append(getAutoPlacement()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
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

        if (obj instanceof AllocateHostsRequest == false)
            return false;
        AllocateHostsRequest other = (AllocateHostsRequest) obj;
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
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

        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public AllocateHostsRequest clone() {
        return (AllocateHostsRequest) super.clone();
    }
}
