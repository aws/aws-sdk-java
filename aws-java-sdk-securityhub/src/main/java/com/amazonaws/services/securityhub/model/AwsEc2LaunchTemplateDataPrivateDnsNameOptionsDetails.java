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
 * Describes the options for Amazon EC2 instance hostnames.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     */
    private Boolean enableResourceNameDnsAAAARecord;
    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     */
    private Boolean enableResourceNameDnsARecord;
    /**
     * <p>
     * The type of hostname for EC2 instances.
     * </p>
     */
    private String hostnameType;

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @param enableResourceNameDnsAAAARecord
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public void setEnableResourceNameDnsAAAARecord(Boolean enableResourceNameDnsAAAARecord) {
        this.enableResourceNameDnsAAAARecord = enableResourceNameDnsAAAARecord;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public Boolean getEnableResourceNameDnsAAAARecord() {
        return this.enableResourceNameDnsAAAARecord;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @param enableResourceNameDnsAAAARecord
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails withEnableResourceNameDnsAAAARecord(Boolean enableResourceNameDnsAAAARecord) {
        setEnableResourceNameDnsAAAARecord(enableResourceNameDnsAAAARecord);
        return this;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public Boolean isEnableResourceNameDnsAAAARecord() {
        return this.enableResourceNameDnsAAAARecord;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @param enableResourceNameDnsARecord
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public void setEnableResourceNameDnsARecord(Boolean enableResourceNameDnsARecord) {
        this.enableResourceNameDnsARecord = enableResourceNameDnsARecord;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public Boolean getEnableResourceNameDnsARecord() {
        return this.enableResourceNameDnsARecord;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @param enableResourceNameDnsARecord
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails withEnableResourceNameDnsARecord(Boolean enableResourceNameDnsARecord) {
        setEnableResourceNameDnsARecord(enableResourceNameDnsARecord);
        return this;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public Boolean isEnableResourceNameDnsARecord() {
        return this.enableResourceNameDnsARecord;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances.
     * </p>
     * 
     * @param hostnameType
     *        The type of hostname for EC2 instances.
     */

    public void setHostnameType(String hostnameType) {
        this.hostnameType = hostnameType;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances.
     * </p>
     * 
     * @return The type of hostname for EC2 instances.
     */

    public String getHostnameType() {
        return this.hostnameType;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances.
     * </p>
     * 
     * @param hostnameType
     *        The type of hostname for EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails withHostnameType(String hostnameType) {
        setHostnameType(hostnameType);
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
        if (getEnableResourceNameDnsAAAARecord() != null)
            sb.append("EnableResourceNameDnsAAAARecord: ").append(getEnableResourceNameDnsAAAARecord()).append(",");
        if (getEnableResourceNameDnsARecord() != null)
            sb.append("EnableResourceNameDnsARecord: ").append(getEnableResourceNameDnsARecord()).append(",");
        if (getHostnameType() != null)
            sb.append("HostnameType: ").append(getHostnameType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails other = (AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails) obj;
        if (other.getEnableResourceNameDnsAAAARecord() == null ^ this.getEnableResourceNameDnsAAAARecord() == null)
            return false;
        if (other.getEnableResourceNameDnsAAAARecord() != null
                && other.getEnableResourceNameDnsAAAARecord().equals(this.getEnableResourceNameDnsAAAARecord()) == false)
            return false;
        if (other.getEnableResourceNameDnsARecord() == null ^ this.getEnableResourceNameDnsARecord() == null)
            return false;
        if (other.getEnableResourceNameDnsARecord() != null && other.getEnableResourceNameDnsARecord().equals(this.getEnableResourceNameDnsARecord()) == false)
            return false;
        if (other.getHostnameType() == null ^ this.getHostnameType() == null)
            return false;
        if (other.getHostnameType() != null && other.getHostnameType().equals(this.getHostnameType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableResourceNameDnsAAAARecord() == null) ? 0 : getEnableResourceNameDnsAAAARecord().hashCode());
        hashCode = prime * hashCode + ((getEnableResourceNameDnsARecord() == null) ? 0 : getEnableResourceNameDnsARecord().hashCode());
        hashCode = prime * hashCode + ((getHostnameType() == null) ? 0 : getHostnameType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
