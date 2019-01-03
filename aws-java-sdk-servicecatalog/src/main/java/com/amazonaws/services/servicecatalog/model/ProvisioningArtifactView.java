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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains summary information about a product view and a provisioning artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningArtifactView"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactView implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;
    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     * </p>
     */
    private ProvisioningArtifact provisioningArtifact;

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     * 
     * @param productViewSummary
     *        Summary information about a product view.
     */

    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     * 
     * @return Summary information about a product view.
     */

    public ProductViewSummary getProductViewSummary() {
        return this.productViewSummary;
    }

    /**
     * <p>
     * Summary information about a product view.
     * </p>
     * 
     * @param productViewSummary
     *        Summary information about a product view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactView withProductViewSummary(ProductViewSummary productViewSummary) {
        setProductViewSummary(productViewSummary);
        return this;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     * </p>
     * 
     * @param provisioningArtifact
     *        Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     */

    public void setProvisioningArtifact(ProvisioningArtifact provisioningArtifact) {
        this.provisioningArtifact = provisioningArtifact;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     * </p>
     * 
     * @return Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     */

    public ProvisioningArtifact getProvisioningArtifact() {
        return this.provisioningArtifact;
    }

    /**
     * <p>
     * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     * </p>
     * 
     * @param provisioningArtifact
     *        Information about a provisioning artifact. A provisioning artifact is also known as a product version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactView withProvisioningArtifact(ProvisioningArtifact provisioningArtifact) {
        setProvisioningArtifact(provisioningArtifact);
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
        if (getProductViewSummary() != null)
            sb.append("ProductViewSummary: ").append(getProductViewSummary()).append(",");
        if (getProvisioningArtifact() != null)
            sb.append("ProvisioningArtifact: ").append(getProvisioningArtifact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactView == false)
            return false;
        ProvisioningArtifactView other = (ProvisioningArtifactView) obj;
        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getProvisioningArtifact() == null ^ this.getProvisioningArtifact() == null)
            return false;
        if (other.getProvisioningArtifact() != null && other.getProvisioningArtifact().equals(this.getProvisioningArtifact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifact() == null) ? 0 : getProvisioningArtifact().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactView clone() {
        try {
            return (ProvisioningArtifactView) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningArtifactViewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
