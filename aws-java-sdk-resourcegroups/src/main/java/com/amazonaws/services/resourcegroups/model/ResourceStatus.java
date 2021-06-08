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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that identifies the current group membership status for a resource. Adding a resource to a resource group
 * is performed asynchronously as a background task. A <code>PENDING</code> status indicates, for this resource, that
 * the process isn't completed yet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ResourceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param name
     *        The current status.
     * @see ResourceStatusValue
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @return The current status.
     * @see ResourceStatusValue
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param name
     *        The current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatusValue
     */

    public ResourceStatus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status.
     * </p>
     * 
     * @param name
     *        The current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatusValue
     */

    public ResourceStatus withName(ResourceStatusValue name) {
        this.name = name.toString();
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

        if (obj instanceof ResourceStatus == false)
            return false;
        ResourceStatus other = (ResourceStatus) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ResourceStatus clone() {
        try {
            return (ResourceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.ResourceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
