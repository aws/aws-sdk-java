/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#createHsm(CreateHsmRequest) CreateHsm operation}.
 * <p>
 * Creates an uninitialized HSM instance. Running this command provisions
 * an HSM appliance and will result in charges to your AWS account for
 * the HSM.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#createHsm(CreateHsmRequest)
 */
public class CreateHsmRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the subnet in your VPC in which to place the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     */
    private String subnetId;

    /**
     * The SSH public key to install on the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     */
    private String sshKey;

    /**
     * The IP address to assign to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     */
    private String eniIp;

    /**
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     * an ENI on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     */
    private String iamRoleArn;

    /**
     * The external ID from <b>IamRoleArn</b>, if present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     */
    private String externalId;

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     */
    private String subscriptionType;

    /**
     * A user-defined token to ensure idempotence. Subsequent calls to this
     * action with the same token will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,64}<br/>
     */
    private String clientToken;

    /**
     * The IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     */
    private String syslogIp;

    /**
     * The identifier of the subnet in your VPC in which to place the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @return The identifier of the subnet in your VPC in which to place the HSM.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The identifier of the subnet in your VPC in which to place the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The identifier of the subnet in your VPC in which to place the HSM.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The identifier of the subnet in your VPC in which to place the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The identifier of the subnet in your VPC in which to place the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The SSH public key to install on the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @return The SSH public key to install on the HSM.
     */
    public String getSshKey() {
        return sshKey;
    }
    
    /**
     * The SSH public key to install on the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @param sshKey The SSH public key to install on the HSM.
     */
    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }
    
    /**
     * The SSH public key to install on the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @param sshKey The SSH public key to install on the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * The IP address to assign to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @return The IP address to assign to the HSM's ENI.
     */
    public String getEniIp() {
        return eniIp;
    }
    
    /**
     * The IP address to assign to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The IP address to assign to the HSM's ENI.
     */
    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }
    
    /**
     * The IP address to assign to the HSM's ENI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The IP address to assign to the HSM's ENI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withEniIp(String eniIp) {
        this.eniIp = eniIp;
        return this;
    }

    /**
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     * an ENI on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @return The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     *         an ENI on your behalf.
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }
    
    /**
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     * an ENI on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     *         an ENI on your behalf.
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }
    
    /**
     * The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     * an ENI on your behalf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The ARN of an IAM role to enable the AWS CloudHSM service to allocate
     *         an ENI on your behalf.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * The external ID from <b>IamRoleArn</b>, if present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @return The external ID from <b>IamRoleArn</b>, if present.
     */
    public String getExternalId() {
        return externalId;
    }
    
    /**
     * The external ID from <b>IamRoleArn</b>, if present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @param externalId The external ID from <b>IamRoleArn</b>, if present.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    
    /**
     * The external ID from <b>IamRoleArn</b>, if present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @param externalId The external ID from <b>IamRoleArn</b>, if present.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @return The subscription type.
     *
     * @see SubscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }
    
    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @see SubscriptionType
     */
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    
    /**
     * The subscription type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SubscriptionType
     */
    public CreateHsmRequest withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @see SubscriptionType
     */
    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
    }
    
    /**
     * The subscription type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SubscriptionType
     */
    public CreateHsmRequest withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
        return this;
    }

    /**
     * A user-defined token to ensure idempotence. Subsequent calls to this
     * action with the same token will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,64}<br/>
     *
     * @return A user-defined token to ensure idempotence. Subsequent calls to this
     *         action with the same token will be ignored.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * A user-defined token to ensure idempotence. Subsequent calls to this
     * action with the same token will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,64}<br/>
     *
     * @param clientToken A user-defined token to ensure idempotence. Subsequent calls to this
     *         action with the same token will be ignored.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * A user-defined token to ensure idempotence. Subsequent calls to this
     * action with the same token will be ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9]{1,64}<br/>
     *
     * @param clientToken A user-defined token to ensure idempotence. Subsequent calls to this
     *         action with the same token will be ignored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @return The IP address for the syslog monitoring server.
     */
    public String getSyslogIp() {
        return syslogIp;
    }
    
    /**
     * The IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param syslogIp The IP address for the syslog monitoring server.
     */
    public void setSyslogIp(String syslogIp) {
        this.syslogIp = syslogIp;
    }
    
    /**
     * The IP address for the syslog monitoring server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param syslogIp The IP address for the syslog monitoring server.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHsmRequest withSyslogIp(String syslogIp) {
        this.syslogIp = syslogIp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getSshKey() != null) sb.append("SshKey: " + getSshKey() + ",");
        if (getEniIp() != null) sb.append("EniIp: " + getEniIp() + ",");
        if (getIamRoleArn() != null) sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getExternalId() != null) sb.append("ExternalId: " + getExternalId() + ",");
        if (getSubscriptionType() != null) sb.append("SubscriptionType: " + getSubscriptionType() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getSyslogIp() != null) sb.append("SyslogIp: " + getSyslogIp() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHsmRequest == false) return false;
        CreateHsmRequest other = (CreateHsmRequest)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getSshKey() == null ^ this.getSshKey() == null) return false;
        if (other.getSshKey() != null && other.getSshKey().equals(this.getSshKey()) == false) return false; 
        if (other.getEniIp() == null ^ this.getEniIp() == null) return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false) return false; 
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null) return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false) return false; 
        if (other.getExternalId() == null ^ this.getExternalId() == null) return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false) return false; 
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null) return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getSyslogIp() == null ^ this.getSyslogIp() == null) return false;
        if (other.getSyslogIp() != null && other.getSyslogIp().equals(this.getSyslogIp()) == false) return false; 
        return true;
    }
    
}
    