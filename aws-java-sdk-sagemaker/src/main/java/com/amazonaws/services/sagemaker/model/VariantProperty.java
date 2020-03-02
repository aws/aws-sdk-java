/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a production variant property type for an Endpoint.
 * </p>
 * <p>
 * If you are updating an endpoint with the <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-RetainAllVariantProperties"
 * >RetainAllVariantProperties</a> option set to <code>true</code>, the <code>VariantProperty</code> objects listed in
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_UpdateEndpoint.html#SageMaker-UpdateEndpoint-request-ExcludeRetainedVariantProperties"
 * >ExcludeRetainedVariantProperties</a> override the existing variant properties of the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/VariantProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariantProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     * >InitialInstanceCount</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     * >InitialVariantWeight</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     */
    private String variantPropertyType;

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     * >InitialInstanceCount</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     * >InitialVariantWeight</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param variantPropertyType
     *        The type of variant property. The supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     *        >InitialInstanceCount</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     *        >InitialVariantWeight</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataCaptureConfig</code>: (Not currently supported.)
     *        </p>
     *        </li>
     * @see VariantPropertyType
     */

    public void setVariantPropertyType(String variantPropertyType) {
        this.variantPropertyType = variantPropertyType;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     * >InitialInstanceCount</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     * >InitialVariantWeight</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of variant property. The supported values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     *         >InitialInstanceCount</a> values in the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *         >ProductionVariants</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     *         >InitialVariantWeight</a> values in the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *         >ProductionVariants</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DataCaptureConfig</code>: (Not currently supported.)
     *         </p>
     *         </li>
     * @see VariantPropertyType
     */

    public String getVariantPropertyType() {
        return this.variantPropertyType;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     * >InitialInstanceCount</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     * >InitialVariantWeight</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param variantPropertyType
     *        The type of variant property. The supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     *        >InitialInstanceCount</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     *        >InitialVariantWeight</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataCaptureConfig</code>: (Not currently supported.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariantPropertyType
     */

    public VariantProperty withVariantPropertyType(String variantPropertyType) {
        setVariantPropertyType(variantPropertyType);
        return this;
    }

    /**
     * <p>
     * The type of variant property. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     * >InitialInstanceCount</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     * >InitialVariantWeight</a> values in the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     * >ProductionVariants</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCaptureConfig</code>: (Not currently supported.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param variantPropertyType
     *        The type of variant property. The supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DesiredInstanceCount</code>: Overrides the existing variant instance counts using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount"
     *        >InitialInstanceCount</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DesiredWeight</code>: Overrides the existing variant weights using the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight"
     *        >InitialVariantWeight</a> values in the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants"
     *        >ProductionVariants</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataCaptureConfig</code>: (Not currently supported.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariantPropertyType
     */

    public VariantProperty withVariantPropertyType(VariantPropertyType variantPropertyType) {
        this.variantPropertyType = variantPropertyType.toString();
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
        if (getVariantPropertyType() != null)
            sb.append("VariantPropertyType: ").append(getVariantPropertyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariantProperty == false)
            return false;
        VariantProperty other = (VariantProperty) obj;
        if (other.getVariantPropertyType() == null ^ this.getVariantPropertyType() == null)
            return false;
        if (other.getVariantPropertyType() != null && other.getVariantPropertyType().equals(this.getVariantPropertyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariantPropertyType() == null) ? 0 : getVariantPropertyType().hashCode());
        return hashCode;
    }

    @Override
    public VariantProperty clone() {
        try {
            return (VariantProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.VariantPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
