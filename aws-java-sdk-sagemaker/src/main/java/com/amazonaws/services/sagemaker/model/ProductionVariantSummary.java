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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes weight and capacities for a production variant associated with an endpoint. If you sent a request to the
 * <code>UpdateEndpointWeightsAndCapacities</code> API and the endpoint status is <code>Updating</code>, you get
 * different desired and current values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variant.
     * </p>
     */
    private String variantName;
    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     */
    private java.util.List<DeployedImage> deployedImages;
    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     */
    private Float currentWeight;
    /**
     * <p>
     * The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     */
    private Float desiredWeight;
    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     */
    private Integer currentInstanceCount;
    /**
     * <p>
     * The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     */
    private Integer desiredInstanceCount;

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     */

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @return The name of the variant.
     */

    public String getVariantName() {
        return this.variantName;
    }

    /**
     * <p>
     * The name of the variant.
     * </p>
     * 
     * @param variantName
     *        The name of the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withVariantName(String variantName) {
        setVariantName(variantName);
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @return An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of
     *         the inference images deployed on instances of this <code>ProductionVariant</code>.
     */

    public java.util.List<DeployedImage> getDeployedImages() {
        return deployedImages;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     */

    public void setDeployedImages(java.util.Collection<DeployedImage> deployedImages) {
        if (deployedImages == null) {
            this.deployedImages = null;
            return;
        }

        this.deployedImages = new java.util.ArrayList<DeployedImage>(deployedImages);
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployedImages(java.util.Collection)} or {@link #withDeployedImages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withDeployedImages(DeployedImage... deployedImages) {
        if (this.deployedImages == null) {
            setDeployedImages(new java.util.ArrayList<DeployedImage>(deployedImages.length));
        }
        for (DeployedImage ele : deployedImages) {
            this.deployedImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     * inference images deployed on instances of this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param deployedImages
     *        An array of <code>DeployedImage</code> objects that specify the Amazon EC2 Container Registry paths of the
     *        inference images deployed on instances of this <code>ProductionVariant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withDeployedImages(java.util.Collection<DeployedImage> deployedImages) {
        setDeployedImages(deployedImages);
        return this;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @param currentWeight
     *        The weight associated with the variant.
     */

    public void setCurrentWeight(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @return The weight associated with the variant.
     */

    public Float getCurrentWeight() {
        return this.currentWeight;
    }

    /**
     * <p>
     * The weight associated with the variant.
     * </p>
     * 
     * @param currentWeight
     *        The weight associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withCurrentWeight(Float currentWeight) {
        setCurrentWeight(currentWeight);
        return this;
    }

    /**
     * <p>
     * The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @param desiredWeight
     *        The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     */

    public void setDesiredWeight(Float desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    /**
     * <p>
     * The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @return The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     */

    public Float getDesiredWeight() {
        return this.desiredWeight;
    }

    /**
     * <p>
     * The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @param desiredWeight
     *        The requested weight, as specified in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withDesiredWeight(Float desiredWeight) {
        setDesiredWeight(desiredWeight);
        return this;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @param currentInstanceCount
     *        The number of instances associated with the variant.
     */

    public void setCurrentInstanceCount(Integer currentInstanceCount) {
        this.currentInstanceCount = currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @return The number of instances associated with the variant.
     */

    public Integer getCurrentInstanceCount() {
        return this.currentInstanceCount;
    }

    /**
     * <p>
     * The number of instances associated with the variant.
     * </p>
     * 
     * @param currentInstanceCount
     *        The number of instances associated with the variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withCurrentInstanceCount(Integer currentInstanceCount) {
        setCurrentInstanceCount(currentInstanceCount);
        return this;
    }

    /**
     * <p>
     * The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     */

    public void setDesiredInstanceCount(Integer desiredInstanceCount) {
        this.desiredInstanceCount = desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @return The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     */

    public Integer getDesiredInstanceCount() {
        return this.desiredInstanceCount;
    }

    /**
     * <p>
     * The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * </p>
     * 
     * @param desiredInstanceCount
     *        The number of instances requested in the <code>UpdateEndpointWeightsAndCapacities</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantSummary withDesiredInstanceCount(Integer desiredInstanceCount) {
        setDesiredInstanceCount(desiredInstanceCount);
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
        if (getVariantName() != null)
            sb.append("VariantName: ").append(getVariantName()).append(",");
        if (getDeployedImages() != null)
            sb.append("DeployedImages: ").append(getDeployedImages()).append(",");
        if (getCurrentWeight() != null)
            sb.append("CurrentWeight: ").append(getCurrentWeight()).append(",");
        if (getDesiredWeight() != null)
            sb.append("DesiredWeight: ").append(getDesiredWeight()).append(",");
        if (getCurrentInstanceCount() != null)
            sb.append("CurrentInstanceCount: ").append(getCurrentInstanceCount()).append(",");
        if (getDesiredInstanceCount() != null)
            sb.append("DesiredInstanceCount: ").append(getDesiredInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantSummary == false)
            return false;
        ProductionVariantSummary other = (ProductionVariantSummary) obj;
        if (other.getVariantName() == null ^ this.getVariantName() == null)
            return false;
        if (other.getVariantName() != null && other.getVariantName().equals(this.getVariantName()) == false)
            return false;
        if (other.getDeployedImages() == null ^ this.getDeployedImages() == null)
            return false;
        if (other.getDeployedImages() != null && other.getDeployedImages().equals(this.getDeployedImages()) == false)
            return false;
        if (other.getCurrentWeight() == null ^ this.getCurrentWeight() == null)
            return false;
        if (other.getCurrentWeight() != null && other.getCurrentWeight().equals(this.getCurrentWeight()) == false)
            return false;
        if (other.getDesiredWeight() == null ^ this.getDesiredWeight() == null)
            return false;
        if (other.getDesiredWeight() != null && other.getDesiredWeight().equals(this.getDesiredWeight()) == false)
            return false;
        if (other.getCurrentInstanceCount() == null ^ this.getCurrentInstanceCount() == null)
            return false;
        if (other.getCurrentInstanceCount() != null && other.getCurrentInstanceCount().equals(this.getCurrentInstanceCount()) == false)
            return false;
        if (other.getDesiredInstanceCount() == null ^ this.getDesiredInstanceCount() == null)
            return false;
        if (other.getDesiredInstanceCount() != null && other.getDesiredInstanceCount().equals(this.getDesiredInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariantName() == null) ? 0 : getVariantName().hashCode());
        hashCode = prime * hashCode + ((getDeployedImages() == null) ? 0 : getDeployedImages().hashCode());
        hashCode = prime * hashCode + ((getCurrentWeight() == null) ? 0 : getCurrentWeight().hashCode());
        hashCode = prime * hashCode + ((getDesiredWeight() == null) ? 0 : getDesiredWeight().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstanceCount() == null) ? 0 : getCurrentInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDesiredInstanceCount() == null) ? 0 : getDesiredInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantSummary clone() {
        try {
            return (ProductionVariantSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
