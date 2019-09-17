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
import com.amazonaws.services.ec2.model.transform.CreateTrafficMirrorTargetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorTargetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTrafficMirrorTargetRequest> {

    /**
     * <p>
     * The network interface ID that is associated with the target.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * </p>
     */
    private String networkLoadBalancerArn;
    /**
     * <p>
     * The description of the Traffic Mirror target.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to assign to the Traffic Mirror target.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The network interface ID that is associated with the target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that is associated with the target.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is associated with the target.
     * </p>
     * 
     * @return The network interface ID that is associated with the target.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID that is associated with the target.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID that is associated with the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * </p>
     * 
     * @param networkLoadBalancerArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */

    public void setNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        this.networkLoadBalancerArn = networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */

    public String getNetworkLoadBalancerArn() {
        return this.networkLoadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * </p>
     * 
     * @param networkLoadBalancerArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withNetworkLoadBalancerArn(String networkLoadBalancerArn) {
        setNetworkLoadBalancerArn(networkLoadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror target.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror target.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror target.
     * </p>
     * 
     * @return The description of the Traffic Mirror target.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror target.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Traffic Mirror target.
     * </p>
     * 
     * @return The tags to assign to the Traffic Mirror target.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the Traffic Mirror target.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Traffic Mirror target.
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
     * The tags to assign to the Traffic Mirror target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to assign to the Traffic Mirror target.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Traffic Mirror target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorTargetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTrafficMirrorTargetRequest> getDryRunRequest() {
        Request<CreateTrafficMirrorTargetRequest> request = new CreateTrafficMirrorTargetRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkLoadBalancerArn() != null)
            sb.append("NetworkLoadBalancerArn: ").append(getNetworkLoadBalancerArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateTrafficMirrorTargetRequest == false)
            return false;
        CreateTrafficMirrorTargetRequest other = (CreateTrafficMirrorTargetRequest) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkLoadBalancerArn() == null ^ this.getNetworkLoadBalancerArn() == null)
            return false;
        if (other.getNetworkLoadBalancerArn() != null && other.getNetworkLoadBalancerArn().equals(this.getNetworkLoadBalancerArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArn() == null) ? 0 : getNetworkLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficMirrorTargetRequest clone() {
        return (CreateTrafficMirrorTargetRequest) super.clone();
    }
}
