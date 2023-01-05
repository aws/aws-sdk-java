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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes configuration settings related to outbound network traffic of an App Runner service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/EgressConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EgressConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of egress configuration.
     * </p>
     * <p>
     * Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     * </p>
     * <p>
     * Set to <code>VPC</code> to associate your service to a custom VPC specified by <code>VpcConnectorArn</code>.
     * </p>
     */
    private String egressType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner
     * service. Only valid when <code>EgressType = VPC</code>.
     * </p>
     */
    private String vpcConnectorArn;

    /**
     * <p>
     * The type of egress configuration.
     * </p>
     * <p>
     * Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     * </p>
     * <p>
     * Set to <code>VPC</code> to associate your service to a custom VPC specified by <code>VpcConnectorArn</code>.
     * </p>
     * 
     * @param egressType
     *        The type of egress configuration.</p>
     *        <p>
     *        Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     *        </p>
     *        <p>
     *        Set to <code>VPC</code> to associate your service to a custom VPC specified by
     *        <code>VpcConnectorArn</code>.
     * @see EgressType
     */

    public void setEgressType(String egressType) {
        this.egressType = egressType;
    }

    /**
     * <p>
     * The type of egress configuration.
     * </p>
     * <p>
     * Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     * </p>
     * <p>
     * Set to <code>VPC</code> to associate your service to a custom VPC specified by <code>VpcConnectorArn</code>.
     * </p>
     * 
     * @return The type of egress configuration.</p>
     *         <p>
     *         Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     *         </p>
     *         <p>
     *         Set to <code>VPC</code> to associate your service to a custom VPC specified by
     *         <code>VpcConnectorArn</code>.
     * @see EgressType
     */

    public String getEgressType() {
        return this.egressType;
    }

    /**
     * <p>
     * The type of egress configuration.
     * </p>
     * <p>
     * Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     * </p>
     * <p>
     * Set to <code>VPC</code> to associate your service to a custom VPC specified by <code>VpcConnectorArn</code>.
     * </p>
     * 
     * @param egressType
     *        The type of egress configuration.</p>
     *        <p>
     *        Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     *        </p>
     *        <p>
     *        Set to <code>VPC</code> to associate your service to a custom VPC specified by
     *        <code>VpcConnectorArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EgressType
     */

    public EgressConfiguration withEgressType(String egressType) {
        setEgressType(egressType);
        return this;
    }

    /**
     * <p>
     * The type of egress configuration.
     * </p>
     * <p>
     * Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     * </p>
     * <p>
     * Set to <code>VPC</code> to associate your service to a custom VPC specified by <code>VpcConnectorArn</code>.
     * </p>
     * 
     * @param egressType
     *        The type of egress configuration.</p>
     *        <p>
     *        Set to <code>DEFAULT</code> for access to resources hosted on public networks.
     *        </p>
     *        <p>
     *        Set to <code>VPC</code> to associate your service to a custom VPC specified by
     *        <code>VpcConnectorArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EgressType
     */

    public EgressConfiguration withEgressType(EgressType egressType) {
        this.egressType = egressType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner
     * service. Only valid when <code>EgressType = VPC</code>.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App
     *        Runner service. Only valid when <code>EgressType = VPC</code>.
     */

    public void setVpcConnectorArn(String vpcConnectorArn) {
        this.vpcConnectorArn = vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner
     * service. Only valid when <code>EgressType = VPC</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App
     *         Runner service. Only valid when <code>EgressType = VPC</code>.
     */

    public String getVpcConnectorArn() {
        return this.vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner
     * service. Only valid when <code>EgressType = VPC</code>.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App
     *        Runner service. Only valid when <code>EgressType = VPC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressConfiguration withVpcConnectorArn(String vpcConnectorArn) {
        setVpcConnectorArn(vpcConnectorArn);
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
        if (getEgressType() != null)
            sb.append("EgressType: ").append(getEgressType()).append(",");
        if (getVpcConnectorArn() != null)
            sb.append("VpcConnectorArn: ").append(getVpcConnectorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EgressConfiguration == false)
            return false;
        EgressConfiguration other = (EgressConfiguration) obj;
        if (other.getEgressType() == null ^ this.getEgressType() == null)
            return false;
        if (other.getEgressType() != null && other.getEgressType().equals(this.getEgressType()) == false)
            return false;
        if (other.getVpcConnectorArn() == null ^ this.getVpcConnectorArn() == null)
            return false;
        if (other.getVpcConnectorArn() != null && other.getVpcConnectorArn().equals(this.getVpcConnectorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressType() == null) ? 0 : getEgressType().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectorArn() == null) ? 0 : getVpcConnectorArn().hashCode());
        return hashCode;
    }

    @Override
    public EgressConfiguration clone() {
        try {
            return (EgressConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.EgressConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
