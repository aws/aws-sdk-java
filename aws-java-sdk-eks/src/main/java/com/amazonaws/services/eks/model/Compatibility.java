/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Compatibility information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Compatibility" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compatibility implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported Kubernetes version of the cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The supported compute platform.
     * </p>
     */
    private java.util.List<String> platformVersions;
    /**
     * <p>
     * The supported default version.
     * </p>
     */
    private Boolean defaultVersion;

    /**
     * <p>
     * The supported Kubernetes version of the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The supported Kubernetes version of the cluster.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The supported Kubernetes version of the cluster.
     * </p>
     * 
     * @return The supported Kubernetes version of the cluster.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The supported Kubernetes version of the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The supported Kubernetes version of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compatibility withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The supported compute platform.
     * </p>
     * 
     * @return The supported compute platform.
     */

    public java.util.List<String> getPlatformVersions() {
        return platformVersions;
    }

    /**
     * <p>
     * The supported compute platform.
     * </p>
     * 
     * @param platformVersions
     *        The supported compute platform.
     */

    public void setPlatformVersions(java.util.Collection<String> platformVersions) {
        if (platformVersions == null) {
            this.platformVersions = null;
            return;
        }

        this.platformVersions = new java.util.ArrayList<String>(platformVersions);
    }

    /**
     * <p>
     * The supported compute platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformVersions(java.util.Collection)} or {@link #withPlatformVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param platformVersions
     *        The supported compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compatibility withPlatformVersions(String... platformVersions) {
        if (this.platformVersions == null) {
            setPlatformVersions(new java.util.ArrayList<String>(platformVersions.length));
        }
        for (String ele : platformVersions) {
            this.platformVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported compute platform.
     * </p>
     * 
     * @param platformVersions
     *        The supported compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compatibility withPlatformVersions(java.util.Collection<String> platformVersions) {
        setPlatformVersions(platformVersions);
        return this;
    }

    /**
     * <p>
     * The supported default version.
     * </p>
     * 
     * @param defaultVersion
     *        The supported default version.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The supported default version.
     * </p>
     * 
     * @return The supported default version.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The supported default version.
     * </p>
     * 
     * @param defaultVersion
     *        The supported default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compatibility withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * The supported default version.
     * </p>
     * 
     * @return The supported default version.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
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
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getPlatformVersions() != null)
            sb.append("PlatformVersions: ").append(getPlatformVersions()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compatibility == false)
            return false;
        Compatibility other = (Compatibility) obj;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getPlatformVersions() == null ^ this.getPlatformVersions() == null)
            return false;
        if (other.getPlatformVersions() != null && other.getPlatformVersions().equals(this.getPlatformVersions()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersions() == null) ? 0 : getPlatformVersions().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public Compatibility clone() {
        try {
            return (Compatibility) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.CompatibilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
