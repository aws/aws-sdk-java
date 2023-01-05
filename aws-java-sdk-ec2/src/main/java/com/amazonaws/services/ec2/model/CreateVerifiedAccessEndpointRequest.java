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
import com.amazonaws.services.ec2.model.transform.CreateVerifiedAccessEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVerifiedAccessEndpointRequest> {

    /**
     * <p>
     * The ID of the Verified Access group to associate the endpoint with.
     * </p>
     */
    private String verifiedAccessGroupId;
    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint to create.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The Amazon Web Services network component Verified Access attaches to.
     * </p>
     */
    private String attachmentType;
    /**
     * <p>
     * The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     * endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
     * </p>
     */
    private String domainCertificateArn;
    /**
     * <p>
     * The DNS name for users to reach your application.
     * </p>
     */
    private String applicationDomain;
    /**
     * <p>
     * A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     * </p>
     */
    private String endpointDomainPrefix;
    /**
     * <p>
     * The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     */
    private CreateVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions;
    /**
     * <p>
     * The network interface details if creating the Amazon Web Services Verified Access endpoint as
     * <code>network-interface</code>type.
     * </p>
     */
    private CreateVerifiedAccessEndpointEniOptions networkInterfaceOptions;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Verified Access group to associate the endpoint with.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Verified Access group to associate the endpoint with.
     */

    public void setVerifiedAccessGroupId(String verifiedAccessGroupId) {
        this.verifiedAccessGroupId = verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Verified Access group to associate the endpoint with.
     * </p>
     * 
     * @return The ID of the Verified Access group to associate the endpoint with.
     */

    public String getVerifiedAccessGroupId() {
        return this.verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Verified Access group to associate the endpoint with.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Verified Access group to associate the endpoint with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withVerifiedAccessGroupId(String verifiedAccessGroupId) {
        setVerifiedAccessGroupId(verifiedAccessGroupId);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint to create.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint to create.
     * @see VerifiedAccessEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint to create.
     * </p>
     * 
     * @return The type of Amazon Web Services Verified Access endpoint to create.
     * @see VerifiedAccessEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint to create.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointType
     */

    public CreateVerifiedAccessEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint to create.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointType
     */

    public CreateVerifiedAccessEndpointRequest withEndpointType(VerifiedAccessEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services network component Verified Access attaches to.
     * </p>
     * 
     * @param attachmentType
     *        The Amazon Web Services network component Verified Access attaches to.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * <p>
     * The Amazon Web Services network component Verified Access attaches to.
     * </p>
     * 
     * @return The Amazon Web Services network component Verified Access attaches to.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * <p>
     * The Amazon Web Services network component Verified Access attaches to.
     * </p>
     * 
     * @param attachmentType
     *        The Amazon Web Services network component Verified Access attaches to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public CreateVerifiedAccessEndpointRequest withAttachmentType(String attachmentType) {
        setAttachmentType(attachmentType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services network component Verified Access attaches to.
     * </p>
     * 
     * @param attachmentType
     *        The Amazon Web Services network component Verified Access attaches to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public CreateVerifiedAccessEndpointRequest withAttachmentType(VerifiedAccessEndpointAttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     * endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
     * </p>
     * 
     * @param domainCertificateArn
     *        The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     *        endpoint. The CN in the certificate must match the DNS name your end users will use to reach your
     *        application.
     */

    public void setDomainCertificateArn(String domainCertificateArn) {
        this.domainCertificateArn = domainCertificateArn;
    }

    /**
     * <p>
     * The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     * endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
     * </p>
     * 
     * @return The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with
     *         the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your
     *         application.
     */

    public String getDomainCertificateArn() {
        return this.domainCertificateArn;
    }

    /**
     * <p>
     * The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     * endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
     * </p>
     * 
     * @param domainCertificateArn
     *        The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the
     *        endpoint. The CN in the certificate must match the DNS name your end users will use to reach your
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withDomainCertificateArn(String domainCertificateArn) {
        setDomainCertificateArn(domainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The DNS name for users to reach your application.
     * </p>
     * 
     * @param applicationDomain
     *        The DNS name for users to reach your application.
     */

    public void setApplicationDomain(String applicationDomain) {
        this.applicationDomain = applicationDomain;
    }

    /**
     * <p>
     * The DNS name for users to reach your application.
     * </p>
     * 
     * @return The DNS name for users to reach your application.
     */

    public String getApplicationDomain() {
        return this.applicationDomain;
    }

    /**
     * <p>
     * The DNS name for users to reach your application.
     * </p>
     * 
     * @param applicationDomain
     *        The DNS name for users to reach your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withApplicationDomain(String applicationDomain) {
        setApplicationDomain(applicationDomain);
        return this;
    }

    /**
     * <p>
     * A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     * </p>
     * 
     * @param endpointDomainPrefix
     *        A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     */

    public void setEndpointDomainPrefix(String endpointDomainPrefix) {
        this.endpointDomainPrefix = endpointDomainPrefix;
    }

    /**
     * <p>
     * A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     * </p>
     * 
     * @return A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     */

    public String getEndpointDomainPrefix() {
        return this.endpointDomainPrefix;
    }

    /**
     * <p>
     * A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     * </p>
     * 
     * @param endpointDomainPrefix
     *        A custom identifier that gets prepended to a DNS name that is generated for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withEndpointDomainPrefix(String endpointDomainPrefix) {
        setEndpointDomainPrefix(endpointDomainPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups to associate with the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @param loadBalancerOptions
     *        The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>load-balancer</code>type.
     */

    public void setLoadBalancerOptions(CreateVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
        this.loadBalancerOptions = loadBalancerOptions;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @return The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *         <code>load-balancer</code>type.
     */

    public CreateVerifiedAccessEndpointLoadBalancerOptions getLoadBalancerOptions() {
        return this.loadBalancerOptions;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @param loadBalancerOptions
     *        The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>load-balancer</code>type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withLoadBalancerOptions(CreateVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
        setLoadBalancerOptions(loadBalancerOptions);
        return this;
    }

    /**
     * <p>
     * The network interface details if creating the Amazon Web Services Verified Access endpoint as
     * <code>network-interface</code>type.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The network interface details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>network-interface</code>type.
     */

    public void setNetworkInterfaceOptions(CreateVerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        this.networkInterfaceOptions = networkInterfaceOptions;
    }

    /**
     * <p>
     * The network interface details if creating the Amazon Web Services Verified Access endpoint as
     * <code>network-interface</code>type.
     * </p>
     * 
     * @return The network interface details if creating the Amazon Web Services Verified Access endpoint as
     *         <code>network-interface</code>type.
     */

    public CreateVerifiedAccessEndpointEniOptions getNetworkInterfaceOptions() {
        return this.networkInterfaceOptions;
    }

    /**
     * <p>
     * The network interface details if creating the Amazon Web Services Verified Access endpoint as
     * <code>network-interface</code>type.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The network interface details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>network-interface</code>type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withNetworkInterfaceOptions(CreateVerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        setNetworkInterfaceOptions(networkInterfaceOptions);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @return The Amazon Web Services Verified Access policy document.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The tags to assign to the Amazon Web Services Verified Access endpoint.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access endpoint.
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
     * The tags to assign to the Amazon Web Services Verified Access endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to assign to the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVerifiedAccessEndpointRequest> getDryRunRequest() {
        Request<CreateVerifiedAccessEndpointRequest> request = new CreateVerifiedAccessEndpointRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessGroupId() != null)
            sb.append("VerifiedAccessGroupId: ").append(getVerifiedAccessGroupId()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getAttachmentType() != null)
            sb.append("AttachmentType: ").append(getAttachmentType()).append(",");
        if (getDomainCertificateArn() != null)
            sb.append("DomainCertificateArn: ").append(getDomainCertificateArn()).append(",");
        if (getApplicationDomain() != null)
            sb.append("ApplicationDomain: ").append(getApplicationDomain()).append(",");
        if (getEndpointDomainPrefix() != null)
            sb.append("EndpointDomainPrefix: ").append(getEndpointDomainPrefix()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getLoadBalancerOptions() != null)
            sb.append("LoadBalancerOptions: ").append(getLoadBalancerOptions()).append(",");
        if (getNetworkInterfaceOptions() != null)
            sb.append("NetworkInterfaceOptions: ").append(getNetworkInterfaceOptions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
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

        if (obj instanceof CreateVerifiedAccessEndpointRequest == false)
            return false;
        CreateVerifiedAccessEndpointRequest other = (CreateVerifiedAccessEndpointRequest) obj;
        if (other.getVerifiedAccessGroupId() == null ^ this.getVerifiedAccessGroupId() == null)
            return false;
        if (other.getVerifiedAccessGroupId() != null && other.getVerifiedAccessGroupId().equals(this.getVerifiedAccessGroupId()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getAttachmentType() == null ^ this.getAttachmentType() == null)
            return false;
        if (other.getAttachmentType() != null && other.getAttachmentType().equals(this.getAttachmentType()) == false)
            return false;
        if (other.getDomainCertificateArn() == null ^ this.getDomainCertificateArn() == null)
            return false;
        if (other.getDomainCertificateArn() != null && other.getDomainCertificateArn().equals(this.getDomainCertificateArn()) == false)
            return false;
        if (other.getApplicationDomain() == null ^ this.getApplicationDomain() == null)
            return false;
        if (other.getApplicationDomain() != null && other.getApplicationDomain().equals(this.getApplicationDomain()) == false)
            return false;
        if (other.getEndpointDomainPrefix() == null ^ this.getEndpointDomainPrefix() == null)
            return false;
        if (other.getEndpointDomainPrefix() != null && other.getEndpointDomainPrefix().equals(this.getEndpointDomainPrefix()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getLoadBalancerOptions() == null ^ this.getLoadBalancerOptions() == null)
            return false;
        if (other.getLoadBalancerOptions() != null && other.getLoadBalancerOptions().equals(this.getLoadBalancerOptions()) == false)
            return false;
        if (other.getNetworkInterfaceOptions() == null ^ this.getNetworkInterfaceOptions() == null)
            return false;
        if (other.getNetworkInterfaceOptions() != null && other.getNetworkInterfaceOptions().equals(this.getNetworkInterfaceOptions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessGroupId() == null) ? 0 : getVerifiedAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        hashCode = prime * hashCode + ((getDomainCertificateArn() == null) ? 0 : getDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationDomain() == null) ? 0 : getApplicationDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointDomainPrefix() == null) ? 0 : getEndpointDomainPrefix().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerOptions() == null) ? 0 : getLoadBalancerOptions().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOptions() == null) ? 0 : getNetworkInterfaceOptions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVerifiedAccessEndpointRequest clone() {
        return (CreateVerifiedAccessEndpointRequest) super.clone();
    }
}
