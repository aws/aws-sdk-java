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
 * Provides information about a data volume that's used in a task definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskVolumeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskVolumeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code> parameter
     * determine whether your bind mount host volume persists on the host container instance and where it's stored.
     * </p>
     */
    private AwsEcsTaskVolumeHostDetails host;

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @return The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens
     *         are allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskVolumeDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code> parameter
     * determine whether your bind mount host volume persists on the host container instance and where it's stored.
     * </p>
     * 
     * @param host
     *        This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code>
     *        parameter determine whether your bind mount host volume persists on the host container instance and where
     *        it's stored.
     */

    public void setHost(AwsEcsTaskVolumeHostDetails host) {
        this.host = host;
    }

    /**
     * <p>
     * This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code> parameter
     * determine whether your bind mount host volume persists on the host container instance and where it's stored.
     * </p>
     * 
     * @return This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code>
     *         parameter determine whether your bind mount host volume persists on the host container instance and where
     *         it's stored.
     */

    public AwsEcsTaskVolumeHostDetails getHost() {
        return this.host;
    }

    /**
     * <p>
     * This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code> parameter
     * determine whether your bind mount host volume persists on the host container instance and where it's stored.
     * </p>
     * 
     * @param host
     *        This parameter is specified when you use bind mount host volumes. The contents of the <code>host</code>
     *        parameter determine whether your bind mount host volume persists on the host container instance and where
     *        it's stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskVolumeDetails withHost(AwsEcsTaskVolumeHostDetails host) {
        setHost(host);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHost() != null)
            sb.append("Host: ").append(getHost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskVolumeDetails == false)
            return false;
        AwsEcsTaskVolumeDetails other = (AwsEcsTaskVolumeDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskVolumeDetails clone() {
        try {
            return (AwsEcsTaskVolumeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskVolumeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
