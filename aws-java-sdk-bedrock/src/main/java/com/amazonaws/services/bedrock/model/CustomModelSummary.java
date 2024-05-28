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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a custom model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CustomModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the custom model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Creation time of the model.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The base model Amazon Resource Name (ARN).
     * </p>
     */
    private String baseModelArn;
    /**
     * <p>
     * The base model name.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     */
    private String customizationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the custom model.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom model.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the custom model.
     * </p>
     * 
     * @param modelName
     *        The name of the custom model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the custom model.
     * </p>
     * 
     * @return The name of the custom model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the custom model.
     * </p>
     * 
     * @param modelName
     *        The name of the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the model.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @return Creation time of the model.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The base model Amazon Resource Name (ARN).
     * </p>
     * 
     * @param baseModelArn
     *        The base model Amazon Resource Name (ARN).
     */

    public void setBaseModelArn(String baseModelArn) {
        this.baseModelArn = baseModelArn;
    }

    /**
     * <p>
     * The base model Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The base model Amazon Resource Name (ARN).
     */

    public String getBaseModelArn() {
        return this.baseModelArn;
    }

    /**
     * <p>
     * The base model Amazon Resource Name (ARN).
     * </p>
     * 
     * @param baseModelArn
     *        The base model Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelSummary withBaseModelArn(String baseModelArn) {
        setBaseModelArn(baseModelArn);
        return this;
    }

    /**
     * <p>
     * The base model name.
     * </p>
     * 
     * @param baseModelName
     *        The base model name.
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The base model name.
     * </p>
     * 
     * @return The base model name.
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The base model name.
     * </p>
     * 
     * @param baseModelName
     *        The base model name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelSummary withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @see CustomizationType
     */

    public void setCustomizationType(String customizationType) {
        this.customizationType = customizationType;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @return Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *         information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *         models</a>.
     * @see CustomizationType
     */

    public String getCustomizationType() {
        return this.customizationType;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public CustomModelSummary withCustomizationType(String customizationType) {
        setCustomizationType(customizationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public CustomModelSummary withCustomizationType(CustomizationType customizationType) {
        this.customizationType = customizationType.toString();
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getBaseModelArn() != null)
            sb.append("BaseModelArn: ").append(getBaseModelArn()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getCustomizationType() != null)
            sb.append("CustomizationType: ").append(getCustomizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomModelSummary == false)
            return false;
        CustomModelSummary other = (CustomModelSummary) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getBaseModelArn() == null ^ this.getBaseModelArn() == null)
            return false;
        if (other.getBaseModelArn() != null && other.getBaseModelArn().equals(this.getBaseModelArn()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getCustomizationType() == null ^ this.getCustomizationType() == null)
            return false;
        if (other.getCustomizationType() != null && other.getCustomizationType().equals(this.getCustomizationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getBaseModelArn() == null) ? 0 : getBaseModelArn().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getCustomizationType() == null) ? 0 : getCustomizationType().hashCode());
        return hashCode;
    }

    @Override
    public CustomModelSummary clone() {
        try {
            return (CustomModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.CustomModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
