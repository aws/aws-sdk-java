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
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#modifyHsm(ModifyHsmRequest) ModifyHsm operation}.
 * <p>
 * Modifies an HSM.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#modifyHsm(ModifyHsmRequest)
 */
public class ModifyHsmRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the HSM to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     */
    private String hsmArn;

    /**
     * The new identifier of the subnet that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     */
    private String subnetId;

    /**
     * The new IP address for the elastic network interface attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     */
    private String eniIp;

    /**
     * The new IAM role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     */
    private String iamRoleArn;

    /**
     * The new external ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     */
    private String externalId;

    /**
     * The new IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     */
    private String syslogIp;

    /**
     * The ARN of the HSM to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the HSM to modify.
     */
    public String getHsmArn() {
        return hsmArn;
    }
    
    /**
     * The ARN of the HSM to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM to modify.
     */
    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }
    
    /**
     * The ARN of the HSM to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
        return this;
    }

    /**
     * The new identifier of the subnet that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @return The new identifier of the subnet that the HSM is in.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The new identifier of the subnet that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The new identifier of the subnet that the HSM is in.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The new identifier of the subnet that the HSM is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The new identifier of the subnet that the HSM is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The new IP address for the elastic network interface attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @return The new IP address for the elastic network interface attached to the
     *         HSM.
     */
    public String getEniIp() {
        return eniIp;
    }
    
    /**
     * The new IP address for the elastic network interface attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The new IP address for the elastic network interface attached to the
     *         HSM.
     */
    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }
    
    /**
     * The new IP address for the elastic network interface attached to the
     * HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The new IP address for the elastic network interface attached to the
     *         HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withEniIp(String eniIp) {
        this.eniIp = eniIp;
        return this;
    }

    /**
     * The new IAM role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @return The new IAM role ARN.
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }
    
    /**
     * The new IAM role ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The new IAM role ARN.
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }
    
    /**
     * The new IAM role ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The new IAM role ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * The new external ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @return The new external ID.
     */
    public String getExternalId() {
        return externalId;
    }
    
    /**
     * The new external ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @param externalId The new external ID.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    
    /**
     * The new external ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./-]*<br/>
     *
     * @param externalId The new external ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The new IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @return The new IP address for the syslog monitoring server.
     */
    public String getSyslogIp() {
        return syslogIp;
    }
    
    /**
     * The new IP address for the syslog monitoring server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param syslogIp The new IP address for the syslog monitoring server.
     */
    public void setSyslogIp(String syslogIp) {
        this.syslogIp = syslogIp;
    }
    
    /**
     * The new IP address for the syslog monitoring server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param syslogIp The new IP address for the syslog monitoring server.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmRequest withSyslogIp(String syslogIp) {
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
        if (getHsmArn() != null) sb.append("HsmArn: " + getHsmArn() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getEniIp() != null) sb.append("EniIp: " + getEniIp() + ",");
        if (getIamRoleArn() != null) sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getExternalId() != null) sb.append("ExternalId: " + getExternalId() + ",");
        if (getSyslogIp() != null) sb.append("SyslogIp: " + getSyslogIp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode()); 
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode()); 
        hashCode = prime * hashCode + ((getSyslogIp() == null) ? 0 : getSyslogIp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyHsmRequest == false) return false;
        ModifyHsmRequest other = (ModifyHsmRequest)obj;
        
        if (other.getHsmArn() == null ^ this.getHsmArn() == null) return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getEniIp() == null ^ this.getEniIp() == null) return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false) return false; 
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null) return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false) return false; 
        if (other.getExternalId() == null ^ this.getExternalId() == null) return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false) return false; 
        if (other.getSyslogIp() == null ^ this.getSyslogIp() == null) return false;
        if (other.getSyslogIp() != null && other.getSyslogIp().equals(this.getSyslogIp()) == false) return false; 
        return true;
    }
    
}
    