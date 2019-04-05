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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the <code>certificate-authority-data</code> for your cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the
     * <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the
     * <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     * </p>
     * 
     * @param data
     *        The base64 encoded certificate data required to communicate with your cluster. Add this to the
     *        <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the
     * <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     * </p>
     * 
     * @return The base64 encoded certificate data required to communicate with your cluster. Add this to the
     *         <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the
     * <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     * </p>
     * 
     * @param data
     *        The base64 encoded certificate data required to communicate with your cluster. Add this to the
     *        <code>certificate-authority-data</code> section of the <code>kubeconfig</code> file for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withData(String data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.CertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
