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
 * Contains the inputs for the <a>ModifyHsm</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HSM to modify.
     * </p>
     */
    private String hsmArn;
    /**
     * <p>
     * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the
     * current subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The new IP address for the elastic network interface (ENI) attached to the HSM.
     * </p>
     * <p>
     * If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly
     * chosen from the CIDR range of the new subnet.
     * </p>
     */
    private String eniIp;
    /**
     * <p>
     * The new IAM role ARN.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The new external ID.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     */
    private String syslogIp;

    /**
     * <p>
     * The ARN of the HSM to modify.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to modify.
     */

    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to modify.
     * </p>
     * 
     * @return The ARN of the HSM to modify.
     */

    public String getHsmArn() {
        return this.hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to modify.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withHsmArn(String hsmArn) {
        setHsmArn(hsmArn);
        return this;
    }

    /**
     * <p>
     * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the
     * current subnet.
     * </p>
     * 
     * @param subnetId
     *        The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone
     *        as the current subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the
     * current subnet.
     * </p>
     * 
     * @return The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone
     *         as the current subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the
     * current subnet.
     * </p>
     * 
     * @param subnetId
     *        The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone
     *        as the current subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The new IP address for the elastic network interface (ENI) attached to the HSM.
     * </p>
     * <p>
     * If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly
     * chosen from the CIDR range of the new subnet.
     * </p>
     * 
     * @param eniIp
     *        The new IP address for the elastic network interface (ENI) attached to the HSM.</p>
     *        <p>
     *        If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be
     *        randomly chosen from the CIDR range of the new subnet.
     */

    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }

    /**
     * <p>
     * The new IP address for the elastic network interface (ENI) attached to the HSM.
     * </p>
     * <p>
     * If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly
     * chosen from the CIDR range of the new subnet.
     * </p>
     * 
     * @return The new IP address for the elastic network interface (ENI) attached to the HSM.</p>
     *         <p>
     *         If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be
     *         randomly chosen from the CIDR range of the new subnet.
     */

    public String getEniIp() {
        return this.eniIp;
    }

    /**
     * <p>
     * The new IP address for the elastic network interface (ENI) attached to the HSM.
     * </p>
     * <p>
     * If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly
     * chosen from the CIDR range of the new subnet.
     * </p>
     * 
     * @param eniIp
     *        The new IP address for the elastic network interface (ENI) attached to the HSM.</p>
     *        <p>
     *        If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be
     *        randomly chosen from the CIDR range of the new subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withEniIp(String eniIp) {
        setEniIp(eniIp);
        return this;
    }

    /**
     * <p>
     * The new IAM role ARN.
     * </p>
     * 
     * @param iamRoleArn
     *        The new IAM role ARN.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The new IAM role ARN.
     * </p>
     * 
     * @return The new IAM role ARN.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The new IAM role ARN.
     * </p>
     * 
     * @param iamRoleArn
     *        The new IAM role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The new external ID.
     * </p>
     * 
     * @param externalId
     *        The new external ID.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The new external ID.
     * </p>
     * 
     * @return The new external ID.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The new external ID.
     * </p>
     * 
     * @param externalId
     *        The new external ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @param syslogIp
     *        The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *        monitoring server.
     */

    public void setSyslogIp(String syslogIp) {
        this.syslogIp = syslogIp;
    }

    /**
     * <p>
     * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @return The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *         monitoring server.
     */

    public String getSyslogIp() {
        return this.syslogIp;
    }

    /**
     * <p>
     * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring
     * server.
     * </p>
     * 
     * @param syslogIp
     *        The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog
     *        monitoring server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHsmRequest withSyslogIp(String syslogIp) {
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
        if (getHsmArn() != null)
            sb.append("HsmArn: ").append(getHsmArn()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getEniIp() != null)
            sb.append("EniIp: ").append(getEniIp()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
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

        if (obj instanceof ModifyHsmRequest == false)
            return false;
        ModifyHsmRequest other = (ModifyHsmRequest) obj;
        if (other.getHsmArn() == null ^ this.getHsmArn() == null)
            return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
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

        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getSyslogIp() == null) ? 0 : getSyslogIp().hashCode());
        return hashCode;
    }

    @Override
    public ModifyHsmRequest clone() {
        return (ModifyHsmRequest) super.clone();
    }

}
