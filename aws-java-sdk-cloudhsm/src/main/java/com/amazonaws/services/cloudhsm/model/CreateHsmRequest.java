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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <code>CreateHsm</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the subnet in your VPC in which to place the HSM.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The SSH public key to install on the HSM.
     * </p>
     */
    private String sshKey;
    /**
     * <p>
     * The IP address to assign to the HSM's ENI.
     * </p>
     * <p>
     * If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
     * </p>
     */
    private String eniIp;
    /**
     * <p>
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The external ID from <code>IamRoleArn</code>, if present.
     * </p>
     */
    private String externalId;

    private String subscriptionType;
    /**
     * <p>
     * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     * ignored.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     */
    private String syslogIp;

    /**
     * <p>
     * The identifier of the subnet in your VPC in which to place the HSM.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet in your VPC in which to place the HSM.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet in your VPC in which to place the HSM.
     * </p>
     * 
     * @return The identifier of the subnet in your VPC in which to place the HSM.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet in your VPC in which to place the HSM.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet in your VPC in which to place the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The SSH public key to install on the HSM.
     * </p>
     * 
     * @param sshKey
     *        The SSH public key to install on the HSM.
     */

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    /**
     * <p>
     * The SSH public key to install on the HSM.
     * </p>
     * 
     * @return The SSH public key to install on the HSM.
     */

    public String getSshKey() {
        return this.sshKey;
    }

    /**
     * <p>
     * The SSH public key to install on the HSM.
     * </p>
     * 
     * @param sshKey
     *        The SSH public key to install on the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withSshKey(String sshKey) {
        setSshKey(sshKey);
        return this;
    }

    /**
     * <p>
     * The IP address to assign to the HSM's ENI.
     * </p>
     * <p>
     * If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
     * </p>
     * 
     * @param eniIp
     *        The IP address to assign to the HSM's ENI.</p>
     *        <p>
     *        If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the
     *        subnet.
     */

    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }

    /**
     * <p>
     * The IP address to assign to the HSM's ENI.
     * </p>
     * <p>
     * If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
     * </p>
     * 
     * @return The IP address to assign to the HSM's ENI.</p>
     *         <p>
     *         If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the
     *         subnet.
     */

    public String getEniIp() {
        return this.eniIp;
    }

    /**
     * <p>
     * The IP address to assign to the HSM's ENI.
     * </p>
     * <p>
     * If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
     * </p>
     * 
     * @param eniIp
     *        The IP address to assign to the HSM's ENI.</p>
     *        <p>
     *        If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the
     *        subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withEniIp(String eniIp) {
        setEniIp(eniIp);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     * </p>
     * 
     * @return The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The external ID from <code>IamRoleArn</code>, if present.
     * </p>
     * 
     * @param externalId
     *        The external ID from <code>IamRoleArn</code>, if present.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID from <code>IamRoleArn</code>, if present.
     * </p>
     * 
     * @return The external ID from <code>IamRoleArn</code>, if present.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID from <code>IamRoleArn</code>, if present.
     * </p>
     * 
     * @param externalId
     *        The external ID from <code>IamRoleArn</code>, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * @return
     * @see SubscriptionType
     */

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public CreateHsmRequest withSubscriptionType(String subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        withSubscriptionType(subscriptionType);
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public CreateHsmRequest withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
        return this;
    }

    /**
     * <p>
     * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     * ignored.
     * </p>
     * 
     * @param clientToken
     *        A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     *        ignored.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     * ignored.
     * </p>
     * 
     * @return A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will
     *         be ignored.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     * ignored.
     * </p>
     * 
     * @param clientToken
     *        A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be
     *        ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @param syslogIp
     *        The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *        monitoring server.
     */

    public void setSyslogIp(String syslogIp) {
        this.syslogIp = syslogIp;
    }

    /**
     * <p>
     * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @return The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *         monitoring server.
     */

    public String getSyslogIp() {
        return this.syslogIp;
    }

    /**
     * <p>
     * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @param syslogIp
     *        The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *        monitoring server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmRequest withSyslogIp(String syslogIp) {
        setSyslogIp(syslogIp);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSshKey() != null)
            sb.append("SshKey: ").append(getSshKey()).append(",");
        if (getEniIp() != null)
            sb.append("EniIp: ").append(getEniIp()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getSubscriptionType() != null)
            sb.append("SubscriptionType: ").append(getSubscriptionType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSyslogIp() != null)
            sb.append("SyslogIp: ").append(getSyslogIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmRequest == false)
            return false;
        CreateHsmRequest other = (CreateHsmRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSshKey() == null ^ this.getSshKey() == null)
            return false;
        if (other.getSshKey() != null && other.getSshKey().equals(this.getSshKey()) == false)
            return false;
        if (other.getEniIp() == null ^ this.getEniIp() == null)
            return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null)
            return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSyslogIp() == null ^ this.getSyslogIp() == null)
            return false;
        if (other.getSyslogIp() != null && other.getSyslogIp().equals(this.getSyslogIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSshKey() == null) ? 0 : getSshKey().hashCode());
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionType() == null) ? 0 : getSubscriptionType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSyslogIp() == null) ? 0 : getSyslogIp().hashCode());
        return hashCode;
    }

    @Override
    public CreateHsmRequest clone() {
        return (CreateHsmRequest) super.clone();
    }

}
