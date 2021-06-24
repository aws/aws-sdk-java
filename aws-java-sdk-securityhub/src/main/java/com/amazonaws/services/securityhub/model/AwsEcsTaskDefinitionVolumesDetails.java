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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A data volume to mount from another container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionVolumesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionVolumesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a Docker volume.
     * </p>
     */
    private AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails dockerVolumeConfiguration;
    /**
     * <p>
     * Information about the Amazon Elastic File System file system that is used for task storage.
     * </p>
     */
    private AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails efsVolumeConfiguration;
    /**
     * <p>
     * Information about a bind mount host volume.
     * </p>
     */
    private AwsEcsTaskDefinitionVolumesHostDetails host;
    /**
     * <p>
     * The name of the data volume.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Information about a Docker volume.
     * </p>
     * 
     * @param dockerVolumeConfiguration
     *        Information about a Docker volume.
     */

    public void setDockerVolumeConfiguration(AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
    }

    /**
     * <p>
     * Information about a Docker volume.
     * </p>
     * 
     * @return Information about a Docker volume.
     */

    public AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails getDockerVolumeConfiguration() {
        return this.dockerVolumeConfiguration;
    }

    /**
     * <p>
     * Information about a Docker volume.
     * </p>
     * 
     * @param dockerVolumeConfiguration
     *        Information about a Docker volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDetails withDockerVolumeConfiguration(
            AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails dockerVolumeConfiguration) {
        setDockerVolumeConfiguration(dockerVolumeConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon Elastic File System file system that is used for task storage.
     * </p>
     * 
     * @param efsVolumeConfiguration
     *        Information about the Amazon Elastic File System file system that is used for task storage.
     */

    public void setEfsVolumeConfiguration(AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails efsVolumeConfiguration) {
        this.efsVolumeConfiguration = efsVolumeConfiguration;
    }

    /**
     * <p>
     * Information about the Amazon Elastic File System file system that is used for task storage.
     * </p>
     * 
     * @return Information about the Amazon Elastic File System file system that is used for task storage.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails getEfsVolumeConfiguration() {
        return this.efsVolumeConfiguration;
    }

    /**
     * <p>
     * Information about the Amazon Elastic File System file system that is used for task storage.
     * </p>
     * 
     * @param efsVolumeConfiguration
     *        Information about the Amazon Elastic File System file system that is used for task storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDetails withEfsVolumeConfiguration(AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails efsVolumeConfiguration) {
        setEfsVolumeConfiguration(efsVolumeConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about a bind mount host volume.
     * </p>
     * 
     * @param host
     *        Information about a bind mount host volume.
     */

    public void setHost(AwsEcsTaskDefinitionVolumesHostDetails host) {
        this.host = host;
    }

    /**
     * <p>
     * Information about a bind mount host volume.
     * </p>
     * 
     * @return Information about a bind mount host volume.
     */

    public AwsEcsTaskDefinitionVolumesHostDetails getHost() {
        return this.host;
    }

    /**
     * <p>
     * Information about a bind mount host volume.
     * </p>
     * 
     * @param host
     *        Information about a bind mount host volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDetails withHost(AwsEcsTaskDefinitionVolumesHostDetails host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The name of the data volume.
     * </p>
     * 
     * @param name
     *        The name of the data volume.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data volume.
     * </p>
     * 
     * @return The name of the data volume.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data volume.
     * </p>
     * 
     * @param name
     *        The name of the data volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesDetails withName(String name) {
        setName(name);
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
        if (getDockerVolumeConfiguration() != null)
            sb.append("DockerVolumeConfiguration: ").append(getDockerVolumeConfiguration()).append(",");
        if (getEfsVolumeConfiguration() != null)
            sb.append("EfsVolumeConfiguration: ").append(getEfsVolumeConfiguration()).append(",");
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionVolumesDetails == false)
            return false;
        AwsEcsTaskDefinitionVolumesDetails other = (AwsEcsTaskDefinitionVolumesDetails) obj;
        if (other.getDockerVolumeConfiguration() == null ^ this.getDockerVolumeConfiguration() == null)
            return false;
        if (other.getDockerVolumeConfiguration() != null && other.getDockerVolumeConfiguration().equals(this.getDockerVolumeConfiguration()) == false)
            return false;
        if (other.getEfsVolumeConfiguration() == null ^ this.getEfsVolumeConfiguration() == null)
            return false;
        if (other.getEfsVolumeConfiguration() != null && other.getEfsVolumeConfiguration().equals(this.getEfsVolumeConfiguration()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDockerVolumeConfiguration() == null) ? 0 : getDockerVolumeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEfsVolumeConfiguration() == null) ? 0 : getEfsVolumeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionVolumesDetails clone() {
        try {
            return (AwsEcsTaskDefinitionVolumesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionVolumesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
