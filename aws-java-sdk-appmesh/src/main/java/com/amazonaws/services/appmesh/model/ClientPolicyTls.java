/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a Transport Layer Security (TLS) client policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ClientPolicyTls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientPolicyTls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * </p>
     */
    private Boolean enforce;
    /**
     * <p>
     * The range of ports that the policy is enforced for.
     * </p>
     */
    private java.util.List<Integer> ports;
    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     */
    private TlsValidationContext validation;

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * </p>
     * 
     * @param enforce
     *        Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     */

    public void setEnforce(Boolean enforce) {
        this.enforce = enforce;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * </p>
     * 
     * @return Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     */

    public Boolean getEnforce() {
        return this.enforce;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * </p>
     * 
     * @param enforce
     *        Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientPolicyTls withEnforce(Boolean enforce) {
        setEnforce(enforce);
        return this;
    }

    /**
     * <p>
     * Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     * </p>
     * 
     * @return Whether the policy is enforced. The default is <code>True</code>, if a value isn't specified.
     */

    public Boolean isEnforce() {
        return this.enforce;
    }

    /**
     * <p>
     * The range of ports that the policy is enforced for.
     * </p>
     * 
     * @return The range of ports that the policy is enforced for.
     */

    public java.util.List<Integer> getPorts() {
        return ports;
    }

    /**
     * <p>
     * The range of ports that the policy is enforced for.
     * </p>
     * 
     * @param ports
     *        The range of ports that the policy is enforced for.
     */

    public void setPorts(java.util.Collection<Integer> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<Integer>(ports);
    }

    /**
     * <p>
     * The range of ports that the policy is enforced for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPorts(java.util.Collection)} or {@link #withPorts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ports
     *        The range of ports that the policy is enforced for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientPolicyTls withPorts(Integer... ports) {
        if (this.ports == null) {
            setPorts(new java.util.ArrayList<Integer>(ports.length));
        }
        for (Integer ele : ports) {
            this.ports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The range of ports that the policy is enforced for.
     * </p>
     * 
     * @param ports
     *        The range of ports that the policy is enforced for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientPolicyTls withPorts(java.util.Collection<Integer> ports) {
        setPorts(ports);
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     * 
     * @param validation
     *        A reference to an object that represents a TLS validation context.
     */

    public void setValidation(TlsValidationContext validation) {
        this.validation = validation;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     * 
     * @return A reference to an object that represents a TLS validation context.
     */

    public TlsValidationContext getValidation() {
        return this.validation;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context.
     * </p>
     * 
     * @param validation
     *        A reference to an object that represents a TLS validation context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientPolicyTls withValidation(TlsValidationContext validation) {
        setValidation(validation);
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
        if (getEnforce() != null)
            sb.append("Enforce: ").append(getEnforce()).append(",");
        if (getPorts() != null)
            sb.append("Ports: ").append(getPorts()).append(",");
        if (getValidation() != null)
            sb.append("Validation: ").append(getValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientPolicyTls == false)
            return false;
        ClientPolicyTls other = (ClientPolicyTls) obj;
        if (other.getEnforce() == null ^ this.getEnforce() == null)
            return false;
        if (other.getEnforce() != null && other.getEnforce().equals(this.getEnforce()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        if (other.getValidation() == null ^ this.getValidation() == null)
            return false;
        if (other.getValidation() != null && other.getValidation().equals(this.getValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforce() == null) ? 0 : getEnforce().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        hashCode = prime * hashCode + ((getValidation() == null) ? 0 : getValidation().hashCode());
        return hashCode;
    }

    @Override
    public ClientPolicyTls clone() {
        try {
            return (ClientPolicyTls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ClientPolicyTlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
