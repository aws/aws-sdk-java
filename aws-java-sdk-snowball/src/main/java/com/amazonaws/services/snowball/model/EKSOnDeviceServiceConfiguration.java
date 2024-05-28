/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the metadata and configuration settings of EKS Anywhere on the Snow Family device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/EKSOnDeviceServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EKSOnDeviceServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Kubernetes version for EKS Anywhere on the Snow Family device.
     * </p>
     */
    private String kubernetesVersion;
    /**
     * <p>
     * The optional version of EKS Anywhere on the Snow Family device.
     * </p>
     */
    private String eKSAnywhereVersion;

    /**
     * <p>
     * The Kubernetes version for EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes version for EKS Anywhere on the Snow Family device.
     */

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes version for EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @return The Kubernetes version for EKS Anywhere on the Snow Family device.
     */

    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes version for EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes version for EKS Anywhere on the Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EKSOnDeviceServiceConfiguration withKubernetesVersion(String kubernetesVersion) {
        setKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * <p>
     * The optional version of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param eKSAnywhereVersion
     *        The optional version of EKS Anywhere on the Snow Family device.
     */

    public void setEKSAnywhereVersion(String eKSAnywhereVersion) {
        this.eKSAnywhereVersion = eKSAnywhereVersion;
    }

    /**
     * <p>
     * The optional version of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @return The optional version of EKS Anywhere on the Snow Family device.
     */

    public String getEKSAnywhereVersion() {
        return this.eKSAnywhereVersion;
    }

    /**
     * <p>
     * The optional version of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param eKSAnywhereVersion
     *        The optional version of EKS Anywhere on the Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EKSOnDeviceServiceConfiguration withEKSAnywhereVersion(String eKSAnywhereVersion) {
        setEKSAnywhereVersion(eKSAnywhereVersion);
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
        if (getKubernetesVersion() != null)
            sb.append("KubernetesVersion: ").append(getKubernetesVersion()).append(",");
        if (getEKSAnywhereVersion() != null)
            sb.append("EKSAnywhereVersion: ").append(getEKSAnywhereVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EKSOnDeviceServiceConfiguration == false)
            return false;
        EKSOnDeviceServiceConfiguration other = (EKSOnDeviceServiceConfiguration) obj;
        if (other.getKubernetesVersion() == null ^ this.getKubernetesVersion() == null)
            return false;
        if (other.getKubernetesVersion() != null && other.getKubernetesVersion().equals(this.getKubernetesVersion()) == false)
            return false;
        if (other.getEKSAnywhereVersion() == null ^ this.getEKSAnywhereVersion() == null)
            return false;
        if (other.getEKSAnywhereVersion() != null && other.getEKSAnywhereVersion().equals(this.getEKSAnywhereVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKubernetesVersion() == null) ? 0 : getKubernetesVersion().hashCode());
        hashCode = prime * hashCode + ((getEKSAnywhereVersion() == null) ? 0 : getEKSAnywhereVersion().hashCode());
        return hashCode;
    }

    @Override
    public EKSOnDeviceServiceConfiguration clone() {
        try {
            return (EKSOnDeviceServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.EKSOnDeviceServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
