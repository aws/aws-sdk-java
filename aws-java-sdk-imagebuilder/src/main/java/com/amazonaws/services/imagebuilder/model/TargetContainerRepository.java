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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container repository where the output container image is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TargetContainerRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetContainerRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the service in which this image was registered.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The name of the container repository where the output container image is stored. This name is prefixed by the
     * repository location.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * Specifies the service in which this image was registered.
     * </p>
     * 
     * @param service
     *        Specifies the service in which this image was registered.
     * @see ContainerRepositoryService
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * Specifies the service in which this image was registered.
     * </p>
     * 
     * @return Specifies the service in which this image was registered.
     * @see ContainerRepositoryService
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * Specifies the service in which this image was registered.
     * </p>
     * 
     * @param service
     *        Specifies the service in which this image was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerRepositoryService
     */

    public TargetContainerRepository withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * Specifies the service in which this image was registered.
     * </p>
     * 
     * @param service
     *        Specifies the service in which this image was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerRepositoryService
     */

    public TargetContainerRepository withService(ContainerRepositoryService service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * The name of the container repository where the output container image is stored. This name is prefixed by the
     * repository location.
     * </p>
     * 
     * @param repositoryName
     *        The name of the container repository where the output container image is stored. This name is prefixed by
     *        the repository location.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the container repository where the output container image is stored. This name is prefixed by the
     * repository location.
     * </p>
     * 
     * @return The name of the container repository where the output container image is stored. This name is prefixed by
     *         the repository location.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the container repository where the output container image is stored. This name is prefixed by the
     * repository location.
     * </p>
     * 
     * @param repositoryName
     *        The name of the container repository where the output container image is stored. This name is prefixed by
     *        the repository location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetContainerRepository withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetContainerRepository == false)
            return false;
        TargetContainerRepository other = (TargetContainerRepository) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public TargetContainerRepository clone() {
        try {
            return (TargetContainerRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.TargetContainerRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
