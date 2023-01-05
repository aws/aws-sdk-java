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
import com.amazonaws.services.ec2.model.transform.ModifyPrivateDnsNameOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyPrivateDnsNameOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyPrivateDnsNameOptionsRequest> {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance
     * IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * </p>
     */
    private String privateDnsHostnameType;
    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     */
    private Boolean enableResourceNameDnsARecord;
    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     */
    private Boolean enableResourceNameDnsAAAARecord;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyPrivateDnsNameOptionsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance
     * IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * </p>
     * 
     * @param privateDnsHostnameType
     *        The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the
     *        instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For
     *        dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * @see HostnameType
     */

    public void setPrivateDnsHostnameType(String privateDnsHostnameType) {
        this.privateDnsHostnameType = privateDnsHostnameType;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance
     * IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * </p>
     * 
     * @return The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the
     *         instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For
     *         dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * @see HostnameType
     */

    public String getPrivateDnsHostnameType() {
        return this.privateDnsHostnameType;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance
     * IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * </p>
     * 
     * @param privateDnsHostnameType
     *        The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the
     *        instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For
     *        dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostnameType
     */

    public ModifyPrivateDnsNameOptionsRequest withPrivateDnsHostnameType(String privateDnsHostnameType) {
        setPrivateDnsHostnameType(privateDnsHostnameType);
        return this;
    }

    /**
     * <p>
     * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance
     * IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * </p>
     * 
     * @param privateDnsHostnameType
     *        The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the
     *        instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For
     *        dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostnameType
     */

    public ModifyPrivateDnsNameOptionsRequest withPrivateDnsHostnameType(HostnameType privateDnsHostnameType) {
        this.privateDnsHostnameType = privateDnsHostnameType.toString();
        return this;
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

    public ModifyPrivateDnsNameOptionsRequest withEnableResourceNameDnsARecord(Boolean enableResourceNameDnsARecord) {
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

    public ModifyPrivateDnsNameOptionsRequest withEnableResourceNameDnsAAAARecord(Boolean enableResourceNameDnsAAAARecord) {
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
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyPrivateDnsNameOptionsRequest> getDryRunRequest() {
        Request<ModifyPrivateDnsNameOptionsRequest> request = new ModifyPrivateDnsNameOptionsRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPrivateDnsHostnameType() != null)
            sb.append("PrivateDnsHostnameType: ").append(getPrivateDnsHostnameType()).append(",");
        if (getEnableResourceNameDnsARecord() != null)
            sb.append("EnableResourceNameDnsARecord: ").append(getEnableResourceNameDnsARecord()).append(",");
        if (getEnableResourceNameDnsAAAARecord() != null)
            sb.append("EnableResourceNameDnsAAAARecord: ").append(getEnableResourceNameDnsAAAARecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyPrivateDnsNameOptionsRequest == false)
            return false;
        ModifyPrivateDnsNameOptionsRequest other = (ModifyPrivateDnsNameOptionsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPrivateDnsHostnameType() == null ^ this.getPrivateDnsHostnameType() == null)
            return false;
        if (other.getPrivateDnsHostnameType() != null && other.getPrivateDnsHostnameType().equals(this.getPrivateDnsHostnameType()) == false)
            return false;
        if (other.getEnableResourceNameDnsARecord() == null ^ this.getEnableResourceNameDnsARecord() == null)
            return false;
        if (other.getEnableResourceNameDnsARecord() != null && other.getEnableResourceNameDnsARecord().equals(this.getEnableResourceNameDnsARecord()) == false)
            return false;
        if (other.getEnableResourceNameDnsAAAARecord() == null ^ this.getEnableResourceNameDnsAAAARecord() == null)
            return false;
        if (other.getEnableResourceNameDnsAAAARecord() != null
                && other.getEnableResourceNameDnsAAAARecord().equals(this.getEnableResourceNameDnsAAAARecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsHostnameType() == null) ? 0 : getPrivateDnsHostnameType().hashCode());
        hashCode = prime * hashCode + ((getEnableResourceNameDnsARecord() == null) ? 0 : getEnableResourceNameDnsARecord().hashCode());
        hashCode = prime * hashCode + ((getEnableResourceNameDnsAAAARecord() == null) ? 0 : getEnableResourceNameDnsAAAARecord().hashCode());
        return hashCode;
    }

    @Override
    public ModifyPrivateDnsNameOptionsRequest clone() {
        return (ModifyPrivateDnsNameOptionsRequest) super.clone();
    }
}
