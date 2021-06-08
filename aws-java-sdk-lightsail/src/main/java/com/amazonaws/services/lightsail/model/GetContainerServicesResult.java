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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe one or more container services.
     * </p>
     */
    private java.util.List<ContainerService> containerServices;

    /**
     * <p>
     * An array of objects that describe one or more container services.
     * </p>
     * 
     * @return An array of objects that describe one or more container services.
     */

    public java.util.List<ContainerService> getContainerServices() {
        return containerServices;
    }

    /**
     * <p>
     * An array of objects that describe one or more container services.
     * </p>
     * 
     * @param containerServices
     *        An array of objects that describe one or more container services.
     */

    public void setContainerServices(java.util.Collection<ContainerService> containerServices) {
        if (containerServices == null) {
            this.containerServices = null;
            return;
        }

        this.containerServices = new java.util.ArrayList<ContainerService>(containerServices);
    }

    /**
     * <p>
     * An array of objects that describe one or more container services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerServices(java.util.Collection)} or {@link #withContainerServices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerServices
     *        An array of objects that describe one or more container services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServicesResult withContainerServices(ContainerService... containerServices) {
        if (this.containerServices == null) {
            setContainerServices(new java.util.ArrayList<ContainerService>(containerServices.length));
        }
        for (ContainerService ele : containerServices) {
            this.containerServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe one or more container services.
     * </p>
     * 
     * @param containerServices
     *        An array of objects that describe one or more container services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServicesResult withContainerServices(java.util.Collection<ContainerService> containerServices) {
        setContainerServices(containerServices);
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
        if (getContainerServices() != null)
            sb.append("ContainerServices: ").append(getContainerServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerServicesResult == false)
            return false;
        GetContainerServicesResult other = (GetContainerServicesResult) obj;
        if (other.getContainerServices() == null ^ this.getContainerServices() == null)
            return false;
        if (other.getContainerServices() != null && other.getContainerServices().equals(this.getContainerServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerServices() == null) ? 0 : getContainerServices().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerServicesResult clone() {
        try {
            return (GetContainerServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
