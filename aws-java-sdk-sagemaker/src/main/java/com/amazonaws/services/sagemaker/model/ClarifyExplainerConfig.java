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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration parameters for the SageMaker Clarify explainer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyExplainerConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyExplainerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JMESPath boolean expression used to filter which records to explain. Explanations are activated by default. See
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     * > <code>EnableExplanations</code> </a>for additional information.
     * </p>
     */
    private String enableExplanations;
    /**
     * <p>
     * The inference configuration parameter for the model container.
     * </p>
     */
    private ClarifyInferenceConfig inferenceConfig;
    /**
     * <p>
     * The configuration for SHAP analysis.
     * </p>
     */
    private ClarifyShapConfig shapConfig;

    /**
     * <p>
     * A JMESPath boolean expression used to filter which records to explain. Explanations are activated by default. See
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     * > <code>EnableExplanations</code> </a>for additional information.
     * </p>
     * 
     * @param enableExplanations
     *        A JMESPath boolean expression used to filter which records to explain. Explanations are activated by
     *        default. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     *        > <code>EnableExplanations</code> </a>for additional information.
     */

    public void setEnableExplanations(String enableExplanations) {
        this.enableExplanations = enableExplanations;
    }

    /**
     * <p>
     * A JMESPath boolean expression used to filter which records to explain. Explanations are activated by default. See
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     * > <code>EnableExplanations</code> </a>for additional information.
     * </p>
     * 
     * @return A JMESPath boolean expression used to filter which records to explain. Explanations are activated by
     *         default. See <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     *         > <code>EnableExplanations</code> </a>for additional information.
     */

    public String getEnableExplanations() {
        return this.enableExplanations;
    }

    /**
     * <p>
     * A JMESPath boolean expression used to filter which records to explain. Explanations are activated by default. See
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     * > <code>EnableExplanations</code> </a>for additional information.
     * </p>
     * 
     * @param enableExplanations
     *        A JMESPath boolean expression used to filter which records to explain. Explanations are activated by
     *        default. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-enable"
     *        > <code>EnableExplanations</code> </a>for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyExplainerConfig withEnableExplanations(String enableExplanations) {
        setEnableExplanations(enableExplanations);
        return this;
    }

    /**
     * <p>
     * The inference configuration parameter for the model container.
     * </p>
     * 
     * @param inferenceConfig
     *        The inference configuration parameter for the model container.
     */

    public void setInferenceConfig(ClarifyInferenceConfig inferenceConfig) {
        this.inferenceConfig = inferenceConfig;
    }

    /**
     * <p>
     * The inference configuration parameter for the model container.
     * </p>
     * 
     * @return The inference configuration parameter for the model container.
     */

    public ClarifyInferenceConfig getInferenceConfig() {
        return this.inferenceConfig;
    }

    /**
     * <p>
     * The inference configuration parameter for the model container.
     * </p>
     * 
     * @param inferenceConfig
     *        The inference configuration parameter for the model container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyExplainerConfig withInferenceConfig(ClarifyInferenceConfig inferenceConfig) {
        setInferenceConfig(inferenceConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for SHAP analysis.
     * </p>
     * 
     * @param shapConfig
     *        The configuration for SHAP analysis.
     */

    public void setShapConfig(ClarifyShapConfig shapConfig) {
        this.shapConfig = shapConfig;
    }

    /**
     * <p>
     * The configuration for SHAP analysis.
     * </p>
     * 
     * @return The configuration for SHAP analysis.
     */

    public ClarifyShapConfig getShapConfig() {
        return this.shapConfig;
    }

    /**
     * <p>
     * The configuration for SHAP analysis.
     * </p>
     * 
     * @param shapConfig
     *        The configuration for SHAP analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyExplainerConfig withShapConfig(ClarifyShapConfig shapConfig) {
        setShapConfig(shapConfig);
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
        if (getEnableExplanations() != null)
            sb.append("EnableExplanations: ").append(getEnableExplanations()).append(",");
        if (getInferenceConfig() != null)
            sb.append("InferenceConfig: ").append(getInferenceConfig()).append(",");
        if (getShapConfig() != null)
            sb.append("ShapConfig: ").append(getShapConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyExplainerConfig == false)
            return false;
        ClarifyExplainerConfig other = (ClarifyExplainerConfig) obj;
        if (other.getEnableExplanations() == null ^ this.getEnableExplanations() == null)
            return false;
        if (other.getEnableExplanations() != null && other.getEnableExplanations().equals(this.getEnableExplanations()) == false)
            return false;
        if (other.getInferenceConfig() == null ^ this.getInferenceConfig() == null)
            return false;
        if (other.getInferenceConfig() != null && other.getInferenceConfig().equals(this.getInferenceConfig()) == false)
            return false;
        if (other.getShapConfig() == null ^ this.getShapConfig() == null)
            return false;
        if (other.getShapConfig() != null && other.getShapConfig().equals(this.getShapConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableExplanations() == null) ? 0 : getEnableExplanations().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfig() == null) ? 0 : getInferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getShapConfig() == null) ? 0 : getShapConfig().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyExplainerConfig clone() {
        try {
            return (ClarifyExplainerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyExplainerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
