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
 * Configuration settings for a remote access session, including billing method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSessionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRemoteAccessSessionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     */
    private String billingMethod;
    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * </p>
     */
    private java.util.List<String> vpceConfigurationArns;

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     * 
     * @param billingMethod
     *        The billing method for the remote access session.
     * @see BillingMethod
     */

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     * 
     * @return The billing method for the remote access session.
     * @see BillingMethod
     */

    public String getBillingMethod() {
        return this.billingMethod;
    }

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     * 
     * @param billingMethod
     *        The billing method for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public CreateRemoteAccessSessionConfiguration withBillingMethod(String billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     * 
     * @param billingMethod
     *        The billing method for the remote access session.
     * @see BillingMethod
     */

    public void setBillingMethod(BillingMethod billingMethod) {
        withBillingMethod(billingMethod);
    }

    /**
     * <p>
     * The billing method for the remote access session.
     * </p>
     * 
     * @param billingMethod
     *        The billing method for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public CreateRemoteAccessSessionConfiguration withBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod.toString();
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     */

    public java.util.List<String> getVpceConfigurationArns() {
        return vpceConfigurationArns;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurationArns
     *        An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     */

    public void setVpceConfigurationArns(java.util.Collection<String> vpceConfigurationArns) {
        if (vpceConfigurationArns == null) {
            this.vpceConfigurationArns = null;
            return;
        }

        this.vpceConfigurationArns = new java.util.ArrayList<String>(vpceConfigurationArns);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpceConfigurationArns(java.util.Collection)} or
     * {@link #withVpceConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpceConfigurationArns
     *        An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionConfiguration withVpceConfigurationArns(String... vpceConfigurationArns) {
        if (this.vpceConfigurationArns == null) {
            setVpceConfigurationArns(new java.util.ArrayList<String>(vpceConfigurationArns.length));
        }
        for (String ele : vpceConfigurationArns) {
            this.vpceConfigurationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurationArns
     *        An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionConfiguration withVpceConfigurationArns(java.util.Collection<String> vpceConfigurationArns) {
        setVpceConfigurationArns(vpceConfigurationArns);
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
        if (getBillingMethod() != null)
            sb.append("BillingMethod: ").append(getBillingMethod()).append(",");
        if (getVpceConfigurationArns() != null)
            sb.append("VpceConfigurationArns: ").append(getVpceConfigurationArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRemoteAccessSessionConfiguration == false)
            return false;
        CreateRemoteAccessSessionConfiguration other = (CreateRemoteAccessSessionConfiguration) obj;
        if (other.getBillingMethod() == null ^ this.getBillingMethod() == null)
            return false;
        if (other.getBillingMethod() != null && other.getBillingMethod().equals(this.getBillingMethod()) == false)
            return false;
        if (other.getVpceConfigurationArns() == null ^ this.getVpceConfigurationArns() == null)
            return false;
        if (other.getVpceConfigurationArns() != null && other.getVpceConfigurationArns().equals(this.getVpceConfigurationArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingMethod() == null) ? 0 : getBillingMethod().hashCode());
        hashCode = prime * hashCode + ((getVpceConfigurationArns() == null) ? 0 : getVpceConfigurationArns().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionConfiguration clone() {
        try {
            return (CreateRemoteAccessSessionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.CreateRemoteAccessSessionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
