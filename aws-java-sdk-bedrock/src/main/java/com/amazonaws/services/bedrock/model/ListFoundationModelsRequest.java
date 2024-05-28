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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFoundationModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Return models belonging to the model provider that you specify.
     * </p>
     */
    private String byProvider;
    /**
     * <p>
     * Return models that support the customization type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     */
    private String byCustomizationType;
    /**
     * <p>
     * Return models that support the output modality that you specify.
     * </p>
     */
    private String byOutputModality;
    /**
     * <p>
     * Return models that support the inference type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     */
    private String byInferenceType;

    /**
     * <p>
     * Return models belonging to the model provider that you specify.
     * </p>
     * 
     * @param byProvider
     *        Return models belonging to the model provider that you specify.
     */

    public void setByProvider(String byProvider) {
        this.byProvider = byProvider;
    }

    /**
     * <p>
     * Return models belonging to the model provider that you specify.
     * </p>
     * 
     * @return Return models belonging to the model provider that you specify.
     */

    public String getByProvider() {
        return this.byProvider;
    }

    /**
     * <p>
     * Return models belonging to the model provider that you specify.
     * </p>
     * 
     * @param byProvider
     *        Return models belonging to the model provider that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFoundationModelsRequest withByProvider(String byProvider) {
        setByProvider(byProvider);
        return this;
    }

    /**
     * <p>
     * Return models that support the customization type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param byCustomizationType
     *        Return models that support the customization type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the
     *        Amazon Bedrock User Guide.
     * @see ModelCustomization
     */

    public void setByCustomizationType(String byCustomizationType) {
        this.byCustomizationType = byCustomizationType;
    }

    /**
     * <p>
     * Return models that support the customization type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @return Return models that support the customization type that you specify. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the
     *         Amazon Bedrock User Guide.
     * @see ModelCustomization
     */

    public String getByCustomizationType() {
        return this.byCustomizationType;
    }

    /**
     * <p>
     * Return models that support the customization type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param byCustomizationType
     *        Return models that support the customization type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the
     *        Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public ListFoundationModelsRequest withByCustomizationType(String byCustomizationType) {
        setByCustomizationType(byCustomizationType);
        return this;
    }

    /**
     * <p>
     * Return models that support the customization type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param byCustomizationType
     *        Return models that support the customization type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the
     *        Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public ListFoundationModelsRequest withByCustomizationType(ModelCustomization byCustomizationType) {
        this.byCustomizationType = byCustomizationType.toString();
        return this;
    }

    /**
     * <p>
     * Return models that support the output modality that you specify.
     * </p>
     * 
     * @param byOutputModality
     *        Return models that support the output modality that you specify.
     * @see ModelModality
     */

    public void setByOutputModality(String byOutputModality) {
        this.byOutputModality = byOutputModality;
    }

    /**
     * <p>
     * Return models that support the output modality that you specify.
     * </p>
     * 
     * @return Return models that support the output modality that you specify.
     * @see ModelModality
     */

    public String getByOutputModality() {
        return this.byOutputModality;
    }

    /**
     * <p>
     * Return models that support the output modality that you specify.
     * </p>
     * 
     * @param byOutputModality
     *        Return models that support the output modality that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public ListFoundationModelsRequest withByOutputModality(String byOutputModality) {
        setByOutputModality(byOutputModality);
        return this;
    }

    /**
     * <p>
     * Return models that support the output modality that you specify.
     * </p>
     * 
     * @param byOutputModality
     *        Return models that support the output modality that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public ListFoundationModelsRequest withByOutputModality(ModelModality byOutputModality) {
        this.byOutputModality = byOutputModality.toString();
        return this;
    }

    /**
     * <p>
     * Return models that support the inference type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param byInferenceType
     *        Return models that support the inference type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned
     *        Throughput</a> in the Amazon Bedrock User Guide.
     * @see InferenceType
     */

    public void setByInferenceType(String byInferenceType) {
        this.byInferenceType = byInferenceType;
    }

    /**
     * <p>
     * Return models that support the inference type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @return Return models that support the inference type that you specify. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned
     *         Throughput</a> in the Amazon Bedrock User Guide.
     * @see InferenceType
     */

    public String getByInferenceType() {
        return this.byInferenceType;
    }

    /**
     * <p>
     * Return models that support the inference type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param byInferenceType
     *        Return models that support the inference type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned
     *        Throughput</a> in the Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public ListFoundationModelsRequest withByInferenceType(String byInferenceType) {
        setByInferenceType(byInferenceType);
        return this;
    }

    /**
     * <p>
     * Return models that support the inference type that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned Throughput</a> in
     * the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param byInferenceType
     *        Return models that support the inference type that you specify. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html">Provisioned
     *        Throughput</a> in the Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public ListFoundationModelsRequest withByInferenceType(InferenceType byInferenceType) {
        this.byInferenceType = byInferenceType.toString();
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
        if (getByProvider() != null)
            sb.append("ByProvider: ").append(getByProvider()).append(",");
        if (getByCustomizationType() != null)
            sb.append("ByCustomizationType: ").append(getByCustomizationType()).append(",");
        if (getByOutputModality() != null)
            sb.append("ByOutputModality: ").append(getByOutputModality()).append(",");
        if (getByInferenceType() != null)
            sb.append("ByInferenceType: ").append(getByInferenceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFoundationModelsRequest == false)
            return false;
        ListFoundationModelsRequest other = (ListFoundationModelsRequest) obj;
        if (other.getByProvider() == null ^ this.getByProvider() == null)
            return false;
        if (other.getByProvider() != null && other.getByProvider().equals(this.getByProvider()) == false)
            return false;
        if (other.getByCustomizationType() == null ^ this.getByCustomizationType() == null)
            return false;
        if (other.getByCustomizationType() != null && other.getByCustomizationType().equals(this.getByCustomizationType()) == false)
            return false;
        if (other.getByOutputModality() == null ^ this.getByOutputModality() == null)
            return false;
        if (other.getByOutputModality() != null && other.getByOutputModality().equals(this.getByOutputModality()) == false)
            return false;
        if (other.getByInferenceType() == null ^ this.getByInferenceType() == null)
            return false;
        if (other.getByInferenceType() != null && other.getByInferenceType().equals(this.getByInferenceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByProvider() == null) ? 0 : getByProvider().hashCode());
        hashCode = prime * hashCode + ((getByCustomizationType() == null) ? 0 : getByCustomizationType().hashCode());
        hashCode = prime * hashCode + ((getByOutputModality() == null) ? 0 : getByOutputModality().hashCode());
        hashCode = prime * hashCode + ((getByInferenceType() == null) ? 0 : getByInferenceType().hashCode());
        return hashCode;
    }

    @Override
    public ListFoundationModelsRequest clone() {
        return (ListFoundationModelsRequest) super.clone();
    }

}
