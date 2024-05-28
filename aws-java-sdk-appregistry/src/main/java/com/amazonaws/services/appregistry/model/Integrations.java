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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the service integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/Integrations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Integrations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information about the resource group integration.
     * </p>
     */
    private ResourceGroup resourceGroup;

    private ResourceGroup applicationTagResourceGroup;

    /**
     * <p>
     * The information about the resource group integration.
     * </p>
     * 
     * @param resourceGroup
     *        The information about the resource group integration.
     */

    public void setResourceGroup(ResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * <p>
     * The information about the resource group integration.
     * </p>
     * 
     * @return The information about the resource group integration.
     */

    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * <p>
     * The information about the resource group integration.
     * </p>
     * 
     * @param resourceGroup
     *        The information about the resource group integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integrations withResourceGroup(ResourceGroup resourceGroup) {
        setResourceGroup(resourceGroup);
        return this;
    }

    /**
     * @param applicationTagResourceGroup
     */

    public void setApplicationTagResourceGroup(ResourceGroup applicationTagResourceGroup) {
        this.applicationTagResourceGroup = applicationTagResourceGroup;
    }

    /**
     * @return
     */

    public ResourceGroup getApplicationTagResourceGroup() {
        return this.applicationTagResourceGroup;
    }

    /**
     * @param applicationTagResourceGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integrations withApplicationTagResourceGroup(ResourceGroup applicationTagResourceGroup) {
        setApplicationTagResourceGroup(applicationTagResourceGroup);
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
            sb.append("ResourceGroup: ").append(getResourceGroup()).append(",");
        if (getApplicationTagResourceGroup() != null)
            sb.append("ApplicationTagResourceGroup: ").append(getApplicationTagResourceGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Integrations == false)
            return false;
        Integrations other = (Integrations) obj;
        if (other.getResourceGroup() == null ^ this.getResourceGroup() == null)
            return false;
        if (other.getResourceGroup() != null && other.getResourceGroup().equals(this.getResourceGroup()) == false)
            return false;
        if (other.getApplicationTagResourceGroup() == null ^ this.getApplicationTagResourceGroup() == null)
            return false;
        if (other.getApplicationTagResourceGroup() != null && other.getApplicationTagResourceGroup().equals(this.getApplicationTagResourceGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroup() == null) ? 0 : getResourceGroup().hashCode());
        hashCode = prime * hashCode + ((getApplicationTagResourceGroup() == null) ? 0 : getApplicationTagResourceGroup().hashCode());
        return hashCode;
    }

    @Override
    public Integrations clone() {
        try {
            return (Integrations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.IntegrationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
