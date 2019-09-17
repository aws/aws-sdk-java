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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determine whether your data volume persists on the host container instance and where it is stored. If this parameter
 * is empty, then the Docker daemon assigns a host path for your data volume, but the data is not guaranteed to persist
 * after the containers associated with it stop running.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/Host" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Host implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path on the host container instance that is presented to the container. If this parameter is empty, then the
     * Docker daemon has assigned a host path for you. If this parameter contains a file location, then the data volume
     * persists at the specified location on the host container instance until you delete it manually. If the source
     * path location does not exist on the host container instance, the Docker daemon creates it. If the location does
     * exist, the contents of the source path folder are exported.
     * </p>
     */
    private String sourcePath;

    /**
     * <p>
     * The path on the host container instance that is presented to the container. If this parameter is empty, then the
     * Docker daemon has assigned a host path for you. If this parameter contains a file location, then the data volume
     * persists at the specified location on the host container instance until you delete it manually. If the source
     * path location does not exist on the host container instance, the Docker daemon creates it. If the location does
     * exist, the contents of the source path folder are exported.
     * </p>
     * 
     * @param sourcePath
     *        The path on the host container instance that is presented to the container. If this parameter is empty,
     *        then the Docker daemon has assigned a host path for you. If this parameter contains a file location, then
     *        the data volume persists at the specified location on the host container instance until you delete it
     *        manually. If the source path location does not exist on the host container instance, the Docker daemon
     *        creates it. If the location does exist, the contents of the source path folder are exported.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * The path on the host container instance that is presented to the container. If this parameter is empty, then the
     * Docker daemon has assigned a host path for you. If this parameter contains a file location, then the data volume
     * persists at the specified location on the host container instance until you delete it manually. If the source
     * path location does not exist on the host container instance, the Docker daemon creates it. If the location does
     * exist, the contents of the source path folder are exported.
     * </p>
     * 
     * @return The path on the host container instance that is presented to the container. If this parameter is empty,
     *         then the Docker daemon has assigned a host path for you. If this parameter contains a file location, then
     *         the data volume persists at the specified location on the host container instance until you delete it
     *         manually. If the source path location does not exist on the host container instance, the Docker daemon
     *         creates it. If the location does exist, the contents of the source path folder are exported.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * <p>
     * The path on the host container instance that is presented to the container. If this parameter is empty, then the
     * Docker daemon has assigned a host path for you. If this parameter contains a file location, then the data volume
     * persists at the specified location on the host container instance until you delete it manually. If the source
     * path location does not exist on the host container instance, the Docker daemon creates it. If the location does
     * exist, the contents of the source path folder are exported.
     * </p>
     * 
     * @param sourcePath
     *        The path on the host container instance that is presented to the container. If this parameter is empty,
     *        then the Docker daemon has assigned a host path for you. If this parameter contains a file location, then
     *        the data volume persists at the specified location on the host container instance until you delete it
     *        manually. If the source path location does not exist on the host container instance, the Docker daemon
     *        creates it. If the location does exist, the contents of the source path folder are exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
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
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Host == false)
            return false;
        Host other = (Host) obj;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public Host clone() {
        try {
            return (Host) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.HostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
