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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata transfer job AWS IoT TwinMaker source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/IotTwinMakerSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotTwinMakerSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IoT TwinMaker workspace.
     * </p>
     */
    private String workspace;
    /**
     * <p>
     * The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * </p>
     */
    private java.util.List<IotTwinMakerSourceConfigurationFilter> filters;

    /**
     * <p>
     * The IoT TwinMaker workspace.
     * </p>
     * 
     * @param workspace
     *        The IoT TwinMaker workspace.
     */

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    /**
     * <p>
     * The IoT TwinMaker workspace.
     * </p>
     * 
     * @return The IoT TwinMaker workspace.
     */

    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * <p>
     * The IoT TwinMaker workspace.
     * </p>
     * 
     * @param workspace
     *        The IoT TwinMaker workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTwinMakerSourceConfiguration withWorkspace(String workspace) {
        setWorkspace(workspace);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * </p>
     * 
     * @return The metadata transfer job AWS IoT TwinMaker source configuration filters.
     */

    public java.util.List<IotTwinMakerSourceConfigurationFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * </p>
     * 
     * @param filters
     *        The metadata transfer job AWS IoT TwinMaker source configuration filters.
     */

    public void setFilters(java.util.Collection<IotTwinMakerSourceConfigurationFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<IotTwinMakerSourceConfigurationFilter>(filters);
    }

    /**
     * <p>
     * The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTwinMakerSourceConfiguration withFilters(IotTwinMakerSourceConfigurationFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<IotTwinMakerSourceConfigurationFilter>(filters.length));
        }
        for (IotTwinMakerSourceConfigurationFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * </p>
     * 
     * @param filters
     *        The metadata transfer job AWS IoT TwinMaker source configuration filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTwinMakerSourceConfiguration withFilters(java.util.Collection<IotTwinMakerSourceConfigurationFilter> filters) {
        setFilters(filters);
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
        if (getWorkspace() != null)
            sb.append("Workspace: ").append(getWorkspace()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotTwinMakerSourceConfiguration == false)
            return false;
        IotTwinMakerSourceConfiguration other = (IotTwinMakerSourceConfiguration) obj;
        if (other.getWorkspace() == null ^ this.getWorkspace() == null)
            return false;
        if (other.getWorkspace() != null && other.getWorkspace().equals(this.getWorkspace()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspace() == null) ? 0 : getWorkspace().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public IotTwinMakerSourceConfiguration clone() {
        try {
            return (IotTwinMakerSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.IotTwinMakerSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
