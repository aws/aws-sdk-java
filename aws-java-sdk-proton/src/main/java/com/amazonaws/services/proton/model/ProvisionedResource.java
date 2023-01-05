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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detail data for a provisioned resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ProvisionedResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The provisioned resource identifier.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The provisioned resource name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     * Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private String provisioningEngine;

    /**
     * <p>
     * The provisioned resource identifier.
     * </p>
     * 
     * @param identifier
     *        The provisioned resource identifier.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The provisioned resource identifier.
     * </p>
     * 
     * @return The provisioned resource identifier.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The provisioned resource identifier.
     * </p>
     * 
     * @param identifier
     *        The provisioned resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedResource withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The provisioned resource name.
     * </p>
     * 
     * @param name
     *        The provisioned resource name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The provisioned resource name.
     * </p>
     * 
     * @return The provisioned resource name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The provisioned resource name.
     * </p>
     * 
     * @param name
     *        The provisioned resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     * Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param provisioningEngine
     *        The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     *        Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     *        >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * @see ProvisionedResourceEngine
     */

    public void setProvisioningEngine(String provisioningEngine) {
        this.provisioningEngine = provisioningEngine;
    }

    /**
     * <p>
     * The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     * Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     *         Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     *         >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * @see ProvisionedResourceEngine
     */

    public String getProvisioningEngine() {
        return this.provisioningEngine;
    }

    /**
     * <p>
     * The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     * Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param provisioningEngine
     *        The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     *        Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     *        >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedResourceEngine
     */

    public ProvisionedResource withProvisioningEngine(String provisioningEngine) {
        setProvisioningEngine(provisioningEngine);
        return this;
    }

    /**
     * <p>
     * The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     * Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param provisioningEngine
     *        The resource provisioning engine. At this time, <code>CLOUDFORMATION</code> can be used for Amazon Web
     *        Services-managed provisioning, and <code>TERRAFORM</code> can be used for self-managed provisioning.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     *        >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedResourceEngine
     */

    public ProvisionedResource withProvisioningEngine(ProvisionedResourceEngine provisioningEngine) {
        this.provisioningEngine = provisioningEngine.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvisioningEngine() != null)
            sb.append("ProvisioningEngine: ").append(getProvisioningEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedResource == false)
            return false;
        ProvisionedResource other = (ProvisionedResource) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvisioningEngine() == null ^ this.getProvisioningEngine() == null)
            return false;
        if (other.getProvisioningEngine() != null && other.getProvisioningEngine().equals(this.getProvisioningEngine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvisioningEngine() == null) ? 0 : getProvisioningEngine().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedResource clone() {
        try {
            return (ProvisionedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ProvisionedResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
