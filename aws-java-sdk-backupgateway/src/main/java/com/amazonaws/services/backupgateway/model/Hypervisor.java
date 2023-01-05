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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the hypervisor's permissions to which the gateway will connect.
 * </p>
 * <p>
 * A hypervisor is hardware, software, or firmware that creates and manages virtual machines, and allocates resources to
 * them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/Hypervisor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hypervisor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     */
    private String host;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     */
    private String hypervisorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the hypervisor.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @return The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *         (FQDN).
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
     * </p>
     * 
     * @param host
     *        The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name
     *        (FQDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hypervisor withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     */

    public void setHypervisorArn(String hypervisorArn) {
        this.hypervisorArn = hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hypervisor.
     */

    public String getHypervisorArn() {
        return this.hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hypervisor withHypervisorArn(String hypervisorArn) {
        setHypervisorArn(hypervisorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service used to encrypt the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hypervisor withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @param name
     *        The name of the hypervisor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @return The name of the hypervisor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hypervisor.
     * </p>
     * 
     * @param name
     *        The name of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hypervisor withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the hypervisor.
     * </p>
     * 
     * @param state
     *        The state of the hypervisor.
     * @see HypervisorState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the hypervisor.
     * </p>
     * 
     * @return The state of the hypervisor.
     * @see HypervisorState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the hypervisor.
     * </p>
     * 
     * @param state
     *        The state of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorState
     */

    public Hypervisor withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the hypervisor.
     * </p>
     * 
     * @param state
     *        The state of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorState
     */

    public Hypervisor withState(HypervisorState state) {
        this.state = state.toString();
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getHypervisorArn() != null)
            sb.append("HypervisorArn: ").append(getHypervisorArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hypervisor == false)
            return false;
        Hypervisor other = (Hypervisor) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getHypervisorArn() == null ^ this.getHypervisorArn() == null)
            return false;
        if (other.getHypervisorArn() != null && other.getHypervisorArn().equals(this.getHypervisorArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getHypervisorArn() == null) ? 0 : getHypervisorArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Hypervisor clone() {
        try {
            return (Hypervisor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.HypervisorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
