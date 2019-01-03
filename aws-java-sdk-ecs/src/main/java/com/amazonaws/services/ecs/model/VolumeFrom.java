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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on a data volume from another container in the same task definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/VolumeFrom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeFrom implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     */
    private String sourceContainer;
    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @param sourceContainer
     *        The name of another container within the same task definition from which to mount volumes.
     */

    public void setSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @return The name of another container within the same task definition from which to mount volumes.
     */

    public String getSourceContainer() {
        return this.sourceContainer;
    }

    /**
     * <p>
     * The name of another container within the same task definition from which to mount volumes.
     * </p>
     * 
     * @param sourceContainer
     *        The name of another container within the same task definition from which to mount volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeFrom withSourceContainer(String sourceContainer) {
        setSourceContainer(sourceContainer);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *        <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *         <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *        <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeFrom withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *         <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
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
        if (getSourceContainer() != null)
            sb.append("SourceContainer: ").append(getSourceContainer()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeFrom == false)
            return false;
        VolumeFrom other = (VolumeFrom) obj;
        if (other.getSourceContainer() == null ^ this.getSourceContainer() == null)
            return false;
        if (other.getSourceContainer() != null && other.getSourceContainer().equals(this.getSourceContainer()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceContainer() == null) ? 0 : getSourceContainer().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public VolumeFrom clone() {
        try {
            return (VolumeFrom) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.VolumeFromMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
