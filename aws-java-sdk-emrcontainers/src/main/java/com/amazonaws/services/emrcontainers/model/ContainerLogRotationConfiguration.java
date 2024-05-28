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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for container log rotation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ContainerLogRotationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerLogRotationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     * </p>
     */
    private String rotationSize;
    /**
     * <p>
     * The number of files to keep in container after rotation.
     * </p>
     */
    private Integer maxFilesToKeep;

    /**
     * <p>
     * The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     * </p>
     * 
     * @param rotationSize
     *        The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     */

    public void setRotationSize(String rotationSize) {
        this.rotationSize = rotationSize;
    }

    /**
     * <p>
     * The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     * </p>
     * 
     * @return The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     */

    public String getRotationSize() {
        return this.rotationSize;
    }

    /**
     * <p>
     * The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     * </p>
     * 
     * @param rotationSize
     *        The file size at which to rotate logs. Minimum of 2KB, Maximum of 2GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerLogRotationConfiguration withRotationSize(String rotationSize) {
        setRotationSize(rotationSize);
        return this;
    }

    /**
     * <p>
     * The number of files to keep in container after rotation.
     * </p>
     * 
     * @param maxFilesToKeep
     *        The number of files to keep in container after rotation.
     */

    public void setMaxFilesToKeep(Integer maxFilesToKeep) {
        this.maxFilesToKeep = maxFilesToKeep;
    }

    /**
     * <p>
     * The number of files to keep in container after rotation.
     * </p>
     * 
     * @return The number of files to keep in container after rotation.
     */

    public Integer getMaxFilesToKeep() {
        return this.maxFilesToKeep;
    }

    /**
     * <p>
     * The number of files to keep in container after rotation.
     * </p>
     * 
     * @param maxFilesToKeep
     *        The number of files to keep in container after rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerLogRotationConfiguration withMaxFilesToKeep(Integer maxFilesToKeep) {
        setMaxFilesToKeep(maxFilesToKeep);
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
        if (getRotationSize() != null)
            sb.append("RotationSize: ").append(getRotationSize()).append(",");
        if (getMaxFilesToKeep() != null)
            sb.append("MaxFilesToKeep: ").append(getMaxFilesToKeep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerLogRotationConfiguration == false)
            return false;
        ContainerLogRotationConfiguration other = (ContainerLogRotationConfiguration) obj;
        if (other.getRotationSize() == null ^ this.getRotationSize() == null)
            return false;
        if (other.getRotationSize() != null && other.getRotationSize().equals(this.getRotationSize()) == false)
            return false;
        if (other.getMaxFilesToKeep() == null ^ this.getMaxFilesToKeep() == null)
            return false;
        if (other.getMaxFilesToKeep() != null && other.getMaxFilesToKeep().equals(this.getMaxFilesToKeep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationSize() == null) ? 0 : getRotationSize().hashCode());
        hashCode = prime * hashCode + ((getMaxFilesToKeep() == null) ? 0 : getMaxFilesToKeep().hashCode());
        return hashCode;
    }

    @Override
    public ContainerLogRotationConfiguration clone() {
        try {
            return (ContainerLogRotationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.ContainerLogRotationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
