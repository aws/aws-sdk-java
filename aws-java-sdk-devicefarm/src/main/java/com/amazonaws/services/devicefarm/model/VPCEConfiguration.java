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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an Amazon Virtual Private Cloud (VPC) endpoint configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/VPCEConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCEConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     * </p>
     */
    private String vpceConfigurationName;
    /**
     * <p>
     * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     * </p>
     */
    private String vpceServiceName;
    /**
     * <p>
     * The DNS name that maps to the private IP address of the service you want to access.
     * </p>
     */
    private String serviceDnsName;
    /**
     * <p>
     * An optional description, providing more details about your VPC endpoint configuration.
     * </p>
     */
    private String vpceConfigurationDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCEConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     * </p>
     * 
     * @param vpceConfigurationName
     *        The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     */

    public void setVpceConfigurationName(String vpceConfigurationName) {
        this.vpceConfigurationName = vpceConfigurationName;
    }

    /**
     * <p>
     * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     * </p>
     * 
     * @return The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     */

    public String getVpceConfigurationName() {
        return this.vpceConfigurationName;
    }

    /**
     * <p>
     * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     * </p>
     * 
     * @param vpceConfigurationName
     *        The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCEConfiguration withVpceConfigurationName(String vpceConfigurationName) {
        setVpceConfigurationName(vpceConfigurationName);
        return this;
    }

    /**
     * <p>
     * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     * </p>
     * 
     * @param vpceServiceName
     *        The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     */

    public void setVpceServiceName(String vpceServiceName) {
        this.vpceServiceName = vpceServiceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     * </p>
     * 
     * @return The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     */

    public String getVpceServiceName() {
        return this.vpceServiceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     * </p>
     * 
     * @param vpceServiceName
     *        The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCEConfiguration withVpceServiceName(String vpceServiceName) {
        setVpceServiceName(vpceServiceName);
        return this;
    }

    /**
     * <p>
     * The DNS name that maps to the private IP address of the service you want to access.
     * </p>
     * 
     * @param serviceDnsName
     *        The DNS name that maps to the private IP address of the service you want to access.
     */

    public void setServiceDnsName(String serviceDnsName) {
        this.serviceDnsName = serviceDnsName;
    }

    /**
     * <p>
     * The DNS name that maps to the private IP address of the service you want to access.
     * </p>
     * 
     * @return The DNS name that maps to the private IP address of the service you want to access.
     */

    public String getServiceDnsName() {
        return this.serviceDnsName;
    }

    /**
     * <p>
     * The DNS name that maps to the private IP address of the service you want to access.
     * </p>
     * 
     * @param serviceDnsName
     *        The DNS name that maps to the private IP address of the service you want to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCEConfiguration withServiceDnsName(String serviceDnsName) {
        setServiceDnsName(serviceDnsName);
        return this;
    }

    /**
     * <p>
     * An optional description, providing more details about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurationDescription
     *        An optional description, providing more details about your VPC endpoint configuration.
     */

    public void setVpceConfigurationDescription(String vpceConfigurationDescription) {
        this.vpceConfigurationDescription = vpceConfigurationDescription;
    }

    /**
     * <p>
     * An optional description, providing more details about your VPC endpoint configuration.
     * </p>
     * 
     * @return An optional description, providing more details about your VPC endpoint configuration.
     */

    public String getVpceConfigurationDescription() {
        return this.vpceConfigurationDescription;
    }

    /**
     * <p>
     * An optional description, providing more details about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurationDescription
     *        An optional description, providing more details about your VPC endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VPCEConfiguration withVpceConfigurationDescription(String vpceConfigurationDescription) {
        setVpceConfigurationDescription(vpceConfigurationDescription);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVpceConfigurationName() != null)
            sb.append("VpceConfigurationName: ").append(getVpceConfigurationName()).append(",");
        if (getVpceServiceName() != null)
            sb.append("VpceServiceName: ").append(getVpceServiceName()).append(",");
        if (getServiceDnsName() != null)
            sb.append("ServiceDnsName: ").append(getServiceDnsName()).append(",");
        if (getVpceConfigurationDescription() != null)
            sb.append("VpceConfigurationDescription: ").append(getVpceConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPCEConfiguration == false)
            return false;
        VPCEConfiguration other = (VPCEConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVpceConfigurationName() == null ^ this.getVpceConfigurationName() == null)
            return false;
        if (other.getVpceConfigurationName() != null && other.getVpceConfigurationName().equals(this.getVpceConfigurationName()) == false)
            return false;
        if (other.getVpceServiceName() == null ^ this.getVpceServiceName() == null)
            return false;
        if (other.getVpceServiceName() != null && other.getVpceServiceName().equals(this.getVpceServiceName()) == false)
            return false;
        if (other.getServiceDnsName() == null ^ this.getServiceDnsName() == null)
            return false;
        if (other.getServiceDnsName() != null && other.getServiceDnsName().equals(this.getServiceDnsName()) == false)
            return false;
        if (other.getVpceConfigurationDescription() == null ^ this.getVpceConfigurationDescription() == null)
            return false;
        if (other.getVpceConfigurationDescription() != null && other.getVpceConfigurationDescription().equals(this.getVpceConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVpceConfigurationName() == null) ? 0 : getVpceConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getVpceServiceName() == null) ? 0 : getVpceServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceDnsName() == null) ? 0 : getServiceDnsName().hashCode());
        hashCode = prime * hashCode + ((getVpceConfigurationDescription() == null) ? 0 : getVpceConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public VPCEConfiguration clone() {
        try {
            return (VPCEConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.VPCEConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
