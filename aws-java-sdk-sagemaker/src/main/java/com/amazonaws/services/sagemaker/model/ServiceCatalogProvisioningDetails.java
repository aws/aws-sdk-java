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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details that you specify to provision a service catalog product. For information about service catalog, see .<a
 * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
 * Catalog</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ServiceCatalogProvisioningDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceCatalogProvisioningDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the product to provision.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The ID of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * A list of key value pairs that you specify when you provision a product.
     * </p>
     */
    private java.util.List<ProvisioningParameter> provisioningParameters;

    /**
     * <p>
     * The ID of the product to provision.
     * </p>
     * 
     * @param productId
     *        The ID of the product to provision.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The ID of the product to provision.
     * </p>
     * 
     * @return The ID of the product to provision.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The ID of the product to provision.
     * </p>
     * 
     * @param productId
     *        The ID of the product to provision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisioningDetails withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The ID of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The ID of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The ID of the provisioning artifact.
     * </p>
     * 
     * @return The ID of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The ID of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The ID of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisioningDetails withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path.
     * </p>
     * 
     * @return The path identifier of the product. This value is optional if the product has a default path, and
     *         required if the product has more than one path.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product has a default path, and required if the
     * product has more than one path.
     * </p>
     * 
     * @param pathId
     *        The path identifier of the product. This value is optional if the product has a default path, and required
     *        if the product has more than one path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisioningDetails withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * A list of key value pairs that you specify when you provision a product.
     * </p>
     * 
     * @return A list of key value pairs that you specify when you provision a product.
     */

    public java.util.List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * A list of key value pairs that you specify when you provision a product.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of key value pairs that you specify when you provision a product.
     */

    public void setProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<ProvisioningParameter>(provisioningParameters);
    }

    /**
     * <p>
     * A list of key value pairs that you specify when you provision a product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of key value pairs that you specify when you provision a product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisioningDetails withProvisioningParameters(ProvisioningParameter... provisioningParameters) {
        if (this.provisioningParameters == null) {
            setProvisioningParameters(new java.util.ArrayList<ProvisioningParameter>(provisioningParameters.length));
        }
        for (ProvisioningParameter ele : provisioningParameters) {
            this.provisioningParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key value pairs that you specify when you provision a product.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of key value pairs that you specify when you provision a product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceCatalogProvisioningDetails withProvisioningParameters(java.util.Collection<ProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
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
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: ").append(getProvisioningParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceCatalogProvisioningDetails == false)
            return false;
        ServiceCatalogProvisioningDetails other = (ServiceCatalogProvisioningDetails) obj;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        return hashCode;
    }

    @Override
    public ServiceCatalogProvisioningDetails clone() {
        try {
            return (ServiceCatalogProvisioningDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ServiceCatalogProvisioningDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
