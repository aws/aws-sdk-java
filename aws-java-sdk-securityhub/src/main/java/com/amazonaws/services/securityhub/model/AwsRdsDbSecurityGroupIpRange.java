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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * IP range information for an RDS DB security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSecurityGroupIpRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSecurityGroupIpRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * Specifies the status of the IP range.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @param cidrIp
     *        Specifies the IP range.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @return Specifies the IP range.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * 
     * @param cidrIp
     *        Specifies the IP range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupIpRange withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the IP range.
     * </p>
     * 
     * @param status
     *        Specifies the status of the IP range.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the IP range.
     * </p>
     * 
     * @return Specifies the status of the IP range.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the IP range.
     * </p>
     * 
     * @param status
     *        Specifies the status of the IP range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSecurityGroupIpRange withStatus(String status) {
        setStatus(status);
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
        if (getCidrIp() != null)
            sb.append("CidrIp: ").append(getCidrIp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbSecurityGroupIpRange == false)
            return false;
        AwsRdsDbSecurityGroupIpRange other = (AwsRdsDbSecurityGroupIpRange) obj;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSecurityGroupIpRange clone() {
        try {
            return (AwsRdsDbSecurityGroupIpRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSecurityGroupIpRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
