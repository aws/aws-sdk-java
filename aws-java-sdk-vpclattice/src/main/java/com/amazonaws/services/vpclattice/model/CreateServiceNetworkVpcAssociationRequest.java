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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetworkVpcAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceNetworkVpcAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply
     * network level controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to resources
     * using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources specified in
     * the operation are in different accounts.
     * </p>
     */
    private String serviceNetworkIdentifier;
    /**
     * <p>
     * The tags for the association.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcIdentifier;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply
     * network level controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to resources
     * using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     * 
     * @return The IDs of the security groups. Security groups aren't added by default. You can add a security group to
     *         apply network level controls to control which resources in a VPC are allowed to access the service
     *         network and its services. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to
     *         resources using security groups</a> in the <i>Amazon VPC User Guide</i>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply
     * network level controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to resources
     * using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. Security groups aren't added by default. You can add a security group to
     *        apply network level controls to control which resources in a VPC are allowed to access the service network
     *        and its services. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to
     *        resources using security groups</a> in the <i>Amazon VPC User Guide</i>.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply
     * network level controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to resources
     * using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. Security groups aren't added by default. You can add a security group to
     *        apply network level controls to control which resources in a VPC are allowed to access the service network
     *        and its services. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to
     *        resources using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups. Security groups aren't added by default. You can add a security group to apply
     * network level controls to control which resources in a VPC are allowed to access the service network and its
     * services. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to resources
     * using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups. Security groups aren't added by default. You can add a security group to
     *        apply network level controls to control which resources in a VPC are allowed to access the service network
     *        and its services. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Control traffic to
     *        resources using security groups</a> in the <i>Amazon VPC User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources specified in
     * the operation are in different accounts.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources
     *        specified in the operation are in different accounts.
     */

    public void setServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        this.serviceNetworkIdentifier = serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources specified in
     * the operation are in different accounts.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources
     *         specified in the operation are in different accounts.
     */

    public String getServiceNetworkIdentifier() {
        return this.serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources specified in
     * the operation are in different accounts.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN when the resources
     *        specified in the operation are in different accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        setServiceNetworkIdentifier(serviceNetworkIdentifier);
        return this;
    }

    /**
     * <p>
     * The tags for the association.
     * </p>
     * 
     * @return The tags for the association.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the association.
     * </p>
     * 
     * @param tags
     *        The tags for the association.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the association.
     * </p>
     * 
     * @param tags
     *        The tags for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateServiceNetworkVpcAssociationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC.
     */

    public void setVpcIdentifier(String vpcIdentifier) {
        this.vpcIdentifier = vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcIdentifier() {
        return this.vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkVpcAssociationRequest withVpcIdentifier(String vpcIdentifier) {
        setVpcIdentifier(vpcIdentifier);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getServiceNetworkIdentifier() != null)
            sb.append("ServiceNetworkIdentifier: ").append(getServiceNetworkIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcIdentifier() != null)
            sb.append("VpcIdentifier: ").append(getVpcIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceNetworkVpcAssociationRequest == false)
            return false;
        CreateServiceNetworkVpcAssociationRequest other = (CreateServiceNetworkVpcAssociationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServiceNetworkIdentifier() == null ^ this.getServiceNetworkIdentifier() == null)
            return false;
        if (other.getServiceNetworkIdentifier() != null && other.getServiceNetworkIdentifier().equals(this.getServiceNetworkIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcIdentifier() == null ^ this.getVpcIdentifier() == null)
            return false;
        if (other.getVpcIdentifier() != null && other.getVpcIdentifier().equals(this.getVpcIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkIdentifier() == null) ? 0 : getServiceNetworkIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceNetworkVpcAssociationRequest clone() {
        return (CreateServiceNetworkVpcAssociationRequest) super.clone();
    }

}
