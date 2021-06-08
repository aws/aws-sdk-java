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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes a container service.
     * </p>
     */
    private ContainerService containerService;

    /**
     * <p>
     * An object that describes a container service.
     * </p>
     * 
     * @param containerService
     *        An object that describes a container service.
     */

    public void setContainerService(ContainerService containerService) {
        this.containerService = containerService;
    }

    /**
     * <p>
     * An object that describes a container service.
     * </p>
     * 
     * @return An object that describes a container service.
     */

    public ContainerService getContainerService() {
        return this.containerService;
    }

    /**
     * <p>
     * An object that describes a container service.
     * </p>
     * 
     * @param containerService
     *        An object that describes a container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceResult withContainerService(ContainerService containerService) {
        setContainerService(containerService);
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
        if (getContainerService() != null)
            sb.append("ContainerService: ").append(getContainerService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerServiceResult == false)
            return false;
        CreateContainerServiceResult other = (CreateContainerServiceResult) obj;
        if (other.getContainerService() == null ^ this.getContainerService() == null)
            return false;
        if (other.getContainerService() != null && other.getContainerService().equals(this.getContainerService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerService() == null) ? 0 : getContainerService().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerServiceResult clone() {
        try {
            return (CreateContainerServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
