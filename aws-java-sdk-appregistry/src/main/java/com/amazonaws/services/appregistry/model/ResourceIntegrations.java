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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service integration information about the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ResourceIntegrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceIntegrations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information about the integration of Resource Groups.
     * </p>
     */
    private ResourceGroup resourceGroup;

    /**
     * <p>
     * The information about the integration of Resource Groups.
     * </p>
     * 
     * @param resourceGroup
     *        The information about the integration of Resource Groups.
     */

    public void setResourceGroup(ResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * <p>
     * The information about the integration of Resource Groups.
     * </p>
     * 
     * @return The information about the integration of Resource Groups.
     */

    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * <p>
     * The information about the integration of Resource Groups.
     * </p>
     * 
     * @param resourceGroup
     *        The information about the integration of Resource Groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIntegrations withResourceGroup(ResourceGroup resourceGroup) {
        setResourceGroup(resourceGroup);
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
        if (getResourceGroup() != null)
            sb.append("ResourceGroup: ").append(getResourceGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIntegrations == false)
            return false;
        ResourceIntegrations other = (ResourceIntegrations) obj;
        if (other.getResourceGroup() == null ^ this.getResourceGroup() == null)
            return false;
        if (other.getResourceGroup() != null && other.getResourceGroup().equals(this.getResourceGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroup() == null) ? 0 : getResourceGroup().hashCode());
        return hashCode;
    }

    @Override
    public ResourceIntegrations clone() {
        try {
            return (ResourceIntegrations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ResourceIntegrationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
