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

/**
 * <p>
 * An Amazon Web Services Verified Access endpoint specifies the application that Amazon Web Services Verified Access
 * provides access to. It must be attached to an Amazon Web Services Verified Access group. An Amazon Web Services
 * Verified Access endpoint must also have an attached access policy before you attached it to a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String verifiedAccessInstanceId;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     */
    private String verifiedAccessGroupId;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String verifiedAccessEndpointId;
    /**
     * <p>
     * The DNS name for users to reach your application.
     * </p>
     */
    private String applicationDomain;
    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP
     * address, load balancer or a network interface depending on the endpoint type specified.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and
     * the application.
     * </p>
     */
    private String attachmentType;
    /**
     * <p>
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     * </p>
     */
    private String domainCertificateArn;
    /**
     * <p>
     * A DNS name that is generated for the endpoint.
     * </p>
     */
    private String endpointDomain;
    /**
     * <p>
     * Returned if endpoint has a device trust provider attached.
     * </p>
     */
    private String deviceValidationDomain;
    /**
     * <p>
     * The IDs of the security groups for the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     */
    private VerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions;
    /**
     * <p>
     * The options for network-interface type endpoint.
     * </p>
     */
    private VerifiedAccessEndpointEniOptions networkInterfaceOptions;
    /**
     * <p>
     * The endpoint status.
     * </p>
     */
    private VerifiedAccessEndpointStatus status;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The last updated time.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The deletion time.
     * </p>
     */
    private String deletionTime;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        this.verifiedAccessInstanceId = verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public String getVerifiedAccessInstanceId() {
        return this.verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        setVerifiedAccessInstanceId(verifiedAccessInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     */

    public void setVerifiedAccessGroupId(String verifiedAccessGroupId) {
        this.verifiedAccessGroupId = verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access group.
     */

    public String getVerifiedAccessGroupId() {
        return this.verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withVerifiedAccessGroupId(String verifiedAccessGroupId) {
        setVerifiedAccessGroupId(verifiedAccessGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     */

    public void setVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        this.verifiedAccessEndpointId = verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access endpoint.
     */

    public String getVerifiedAccessEndpointId() {
        return this.verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        setVerifiedAccessEndpointId(verifiedAccessEndpointId);
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

    public VerifiedAccessEndpoint withApplicationDomain(String applicationDomain) {
        setApplicationDomain(applicationDomain);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP
     * address, load balancer or a network interface depending on the endpoint type specified.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an
     *        IP address, load balancer or a network interface depending on the endpoint type specified.
     * @see VerifiedAccessEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP
     * address, load balancer or a network interface depending on the endpoint type specified.
     * </p>
     * 
     * @return The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to
     *         an IP address, load balancer or a network interface depending on the endpoint type specified.
     * @see VerifiedAccessEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP
     * address, load balancer or a network interface depending on the endpoint type specified.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an
     *        IP address, load balancer or a network interface depending on the endpoint type specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointType
     */

    public VerifiedAccessEndpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP
     * address, load balancer or a network interface depending on the endpoint type specified.
     * </p>
     * 
     * @param endpointType
     *        The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an
     *        IP address, load balancer or a network interface depending on the endpoint type specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointType
     */

    public VerifiedAccessEndpoint withEndpointType(VerifiedAccessEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and
     * the application.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment used to provide connectivity between the Amazon Web Services Verified Access
     *        endpoint and the application.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * <p>
     * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and
     * the application.
     * </p>
     * 
     * @return The type of attachment used to provide connectivity between the Amazon Web Services Verified Access
     *         endpoint and the application.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * <p>
     * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and
     * the application.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment used to provide connectivity between the Amazon Web Services Verified Access
     *        endpoint and the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public VerifiedAccessEndpoint withAttachmentType(String attachmentType) {
        setAttachmentType(attachmentType);
        return this;
    }

    /**
     * <p>
     * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and
     * the application.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment used to provide connectivity between the Amazon Web Services Verified Access
     *        endpoint and the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointAttachmentType
     */

    public VerifiedAccessEndpoint withAttachmentType(VerifiedAccessEndpointAttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     * </p>
     * 
     * @param domainCertificateArn
     *        The ARN of a public TLS/SSL certificate imported into or created with ACM.
     */

    public void setDomainCertificateArn(String domainCertificateArn) {
        this.domainCertificateArn = domainCertificateArn;
    }

    /**
     * <p>
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     * </p>
     * 
     * @return The ARN of a public TLS/SSL certificate imported into or created with ACM.
     */

    public String getDomainCertificateArn() {
        return this.domainCertificateArn;
    }

    /**
     * <p>
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     * </p>
     * 
     * @param domainCertificateArn
     *        The ARN of a public TLS/SSL certificate imported into or created with ACM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withDomainCertificateArn(String domainCertificateArn) {
        setDomainCertificateArn(domainCertificateArn);
        return this;
    }

    /**
     * <p>
     * A DNS name that is generated for the endpoint.
     * </p>
     * 
     * @param endpointDomain
     *        A DNS name that is generated for the endpoint.
     */

    public void setEndpointDomain(String endpointDomain) {
        this.endpointDomain = endpointDomain;
    }

    /**
     * <p>
     * A DNS name that is generated for the endpoint.
     * </p>
     * 
     * @return A DNS name that is generated for the endpoint.
     */

    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    /**
     * <p>
     * A DNS name that is generated for the endpoint.
     * </p>
     * 
     * @param endpointDomain
     *        A DNS name that is generated for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withEndpointDomain(String endpointDomain) {
        setEndpointDomain(endpointDomain);
        return this;
    }

    /**
     * <p>
     * Returned if endpoint has a device trust provider attached.
     * </p>
     * 
     * @param deviceValidationDomain
     *        Returned if endpoint has a device trust provider attached.
     */

    public void setDeviceValidationDomain(String deviceValidationDomain) {
        this.deviceValidationDomain = deviceValidationDomain;
    }

    /**
     * <p>
     * Returned if endpoint has a device trust provider attached.
     * </p>
     * 
     * @return Returned if endpoint has a device trust provider attached.
     */

    public String getDeviceValidationDomain() {
        return this.deviceValidationDomain;
    }

    /**
     * <p>
     * Returned if endpoint has a device trust provider attached.
     * </p>
     * 
     * @param deviceValidationDomain
     *        Returned if endpoint has a device trust provider attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withDeviceValidationDomain(String deviceValidationDomain) {
        setDeviceValidationDomain(deviceValidationDomain);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the endpoint.
     * </p>
     * 
     * @return The IDs of the security groups for the endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups for the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups for the endpoint.
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
     * The IDs of the security groups for the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withSecurityGroupIds(String... securityGroupIds) {
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
     * The IDs of the security groups for the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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

    public void setLoadBalancerOptions(VerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
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

    public VerifiedAccessEndpointLoadBalancerOptions getLoadBalancerOptions() {
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

    public VerifiedAccessEndpoint withLoadBalancerOptions(VerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
        setLoadBalancerOptions(loadBalancerOptions);
        return this;
    }

    /**
     * <p>
     * The options for network-interface type endpoint.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The options for network-interface type endpoint.
     */

    public void setNetworkInterfaceOptions(VerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        this.networkInterfaceOptions = networkInterfaceOptions;
    }

    /**
     * <p>
     * The options for network-interface type endpoint.
     * </p>
     * 
     * @return The options for network-interface type endpoint.
     */

    public VerifiedAccessEndpointEniOptions getNetworkInterfaceOptions() {
        return this.networkInterfaceOptions;
    }

    /**
     * <p>
     * The options for network-interface type endpoint.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The options for network-interface type endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withNetworkInterfaceOptions(VerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        setNetworkInterfaceOptions(networkInterfaceOptions);
        return this;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @param status
     *        The endpoint status.
     */

    public void setStatus(VerifiedAccessEndpointStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @return The endpoint status.
     */

    public VerifiedAccessEndpointStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @param status
     *        The endpoint status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withStatus(VerifiedAccessEndpointStatus status) {
        setStatus(status);
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

    public VerifiedAccessEndpoint withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @return The last updated time.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @param deletionTime
     *        The deletion time.
     */

    public void setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @return The deletion time.
     */

    public String getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The deletion time.
     * </p>
     * 
     * @param deletionTime
     *        The deletion time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withDeletionTime(String deletionTime) {
        setDeletionTime(deletionTime);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessEndpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVerifiedAccessInstanceId() != null)
            sb.append("VerifiedAccessInstanceId: ").append(getVerifiedAccessInstanceId()).append(",");
        if (getVerifiedAccessGroupId() != null)
            sb.append("VerifiedAccessGroupId: ").append(getVerifiedAccessGroupId()).append(",");
        if (getVerifiedAccessEndpointId() != null)
            sb.append("VerifiedAccessEndpointId: ").append(getVerifiedAccessEndpointId()).append(",");
        if (getApplicationDomain() != null)
            sb.append("ApplicationDomain: ").append(getApplicationDomain()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getAttachmentType() != null)
            sb.append("AttachmentType: ").append(getAttachmentType()).append(",");
        if (getDomainCertificateArn() != null)
            sb.append("DomainCertificateArn: ").append(getDomainCertificateArn()).append(",");
        if (getEndpointDomain() != null)
            sb.append("EndpointDomain: ").append(getEndpointDomain()).append(",");
        if (getDeviceValidationDomain() != null)
            sb.append("DeviceValidationDomain: ").append(getDeviceValidationDomain()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getLoadBalancerOptions() != null)
            sb.append("LoadBalancerOptions: ").append(getLoadBalancerOptions()).append(",");
        if (getNetworkInterfaceOptions() != null)
            sb.append("NetworkInterfaceOptions: ").append(getNetworkInterfaceOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: ").append(getDeletionTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessEndpoint == false)
            return false;
        VerifiedAccessEndpoint other = (VerifiedAccessEndpoint) obj;
        if (other.getVerifiedAccessInstanceId() == null ^ this.getVerifiedAccessInstanceId() == null)
            return false;
        if (other.getVerifiedAccessInstanceId() != null && other.getVerifiedAccessInstanceId().equals(this.getVerifiedAccessInstanceId()) == false)
            return false;
        if (other.getVerifiedAccessGroupId() == null ^ this.getVerifiedAccessGroupId() == null)
            return false;
        if (other.getVerifiedAccessGroupId() != null && other.getVerifiedAccessGroupId().equals(this.getVerifiedAccessGroupId()) == false)
            return false;
        if (other.getVerifiedAccessEndpointId() == null ^ this.getVerifiedAccessEndpointId() == null)
            return false;
        if (other.getVerifiedAccessEndpointId() != null && other.getVerifiedAccessEndpointId().equals(this.getVerifiedAccessEndpointId()) == false)
            return false;
        if (other.getApplicationDomain() == null ^ this.getApplicationDomain() == null)
            return false;
        if (other.getApplicationDomain() != null && other.getApplicationDomain().equals(this.getApplicationDomain()) == false)
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
        if (other.getEndpointDomain() == null ^ this.getEndpointDomain() == null)
            return false;
        if (other.getEndpointDomain() != null && other.getEndpointDomain().equals(this.getEndpointDomain()) == false)
            return false;
        if (other.getDeviceValidationDomain() == null ^ this.getDeviceValidationDomain() == null)
            return false;
        if (other.getDeviceValidationDomain() != null && other.getDeviceValidationDomain().equals(this.getDeviceValidationDomain()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessInstanceId() == null) ? 0 : getVerifiedAccessInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessGroupId() == null) ? 0 : getVerifiedAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessEndpointId() == null) ? 0 : getVerifiedAccessEndpointId().hashCode());
        hashCode = prime * hashCode + ((getApplicationDomain() == null) ? 0 : getApplicationDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        hashCode = prime * hashCode + ((getDomainCertificateArn() == null) ? 0 : getDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointDomain() == null) ? 0 : getEndpointDomain().hashCode());
        hashCode = prime * hashCode + ((getDeviceValidationDomain() == null) ? 0 : getDeviceValidationDomain().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerOptions() == null) ? 0 : getLoadBalancerOptions().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOptions() == null) ? 0 : getNetworkInterfaceOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessEndpoint clone() {
        try {
            return (VerifiedAccessEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
