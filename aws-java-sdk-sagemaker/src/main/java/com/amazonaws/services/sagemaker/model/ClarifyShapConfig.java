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
 * The configuration for SHAP analysis using SageMaker Clarify Explainer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyShapConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyShapConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     * </p>
     */
    private ClarifyShapBaselineConfig shapBaselineConfig;
    /**
     * <p>
     * The number of samples to be used for analysis by the Kernal SHAP algorithm.
     * </p>
     * <note>
     * <p>
     * The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     * explainability requests. For more information, see the <b>Synthetic data</b> of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     * >Configure and create an endpoint</a>.
     * </p>
     * </note>
     */
    private Integer numberOfSamples;
    /**
     * <p>
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model
     * predictions. Defaults to false.
     * </p>
     */
    private Boolean useLogit;
    /**
     * <p>
     * The starting value used to initialize the random number generator in the explainer. Provide a value for this
     * parameter to obtain a deterministic SHAP result.
     * </p>
     */
    private Integer seed;
    /**
     * <p>
     * A parameter that indicates if text features are treated as text and explanations are provided for individual
     * units of text. Required for natural language processing (NLP) explainability only.
     * </p>
     */
    private ClarifyTextConfig textConfig;

    /**
     * <p>
     * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     * </p>
     * 
     * @param shapBaselineConfig
     *        The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     */

    public void setShapBaselineConfig(ClarifyShapBaselineConfig shapBaselineConfig) {
        this.shapBaselineConfig = shapBaselineConfig;
    }

    /**
     * <p>
     * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     * </p>
     * 
     * @return The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     */

    public ClarifyShapBaselineConfig getShapBaselineConfig() {
        return this.shapBaselineConfig;
    }

    /**
     * <p>
     * The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     * </p>
     * 
     * @param shapBaselineConfig
     *        The configuration for the SHAP baseline of the Kernal SHAP algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapConfig withShapBaselineConfig(ClarifyShapBaselineConfig shapBaselineConfig) {
        setShapBaselineConfig(shapBaselineConfig);
        return this;
    }

    /**
     * <p>
     * The number of samples to be used for analysis by the Kernal SHAP algorithm.
     * </p>
     * <note>
     * <p>
     * The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     * explainability requests. For more information, see the <b>Synthetic data</b> of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     * >Configure and create an endpoint</a>.
     * </p>
     * </note>
     * 
     * @param numberOfSamples
     *        The number of samples to be used for analysis by the Kernal SHAP algorithm. </p> <note>
     *        <p>
     *        The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     *        explainability requests. For more information, see the <b>Synthetic data</b> of <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     *        >Configure and create an endpoint</a>.
     *        </p>
     */

    public void setNumberOfSamples(Integer numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
    }

    /**
     * <p>
     * The number of samples to be used for analysis by the Kernal SHAP algorithm.
     * </p>
     * <note>
     * <p>
     * The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     * explainability requests. For more information, see the <b>Synthetic data</b> of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     * >Configure and create an endpoint</a>.
     * </p>
     * </note>
     * 
     * @return The number of samples to be used for analysis by the Kernal SHAP algorithm. </p> <note>
     *         <p>
     *         The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     *         explainability requests. For more information, see the <b>Synthetic data</b> of <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     *         >Configure and create an endpoint</a>.
     *         </p>
     */

    public Integer getNumberOfSamples() {
        return this.numberOfSamples;
    }

    /**
     * <p>
     * The number of samples to be used for analysis by the Kernal SHAP algorithm.
     * </p>
     * <note>
     * <p>
     * The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     * explainability requests. For more information, see the <b>Synthetic data</b> of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     * >Configure and create an endpoint</a>.
     * </p>
     * </note>
     * 
     * @param numberOfSamples
     *        The number of samples to be used for analysis by the Kernal SHAP algorithm. </p> <note>
     *        <p>
     *        The number of samples determines the size of the synthetic dataset, which has an impact on latency of
     *        explainability requests. For more information, see the <b>Synthetic data</b> of <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html"
     *        >Configure and create an endpoint</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapConfig withNumberOfSamples(Integer numberOfSamples) {
        setNumberOfSamples(numberOfSamples);
        return this;
    }

    /**
     * <p>
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model
     * predictions. Defaults to false.
     * </p>
     * 
     * @param useLogit
     *        A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for
     *        model predictions. Defaults to false.
     */

    public void setUseLogit(Boolean useLogit) {
        this.useLogit = useLogit;
    }

    /**
     * <p>
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model
     * predictions. Defaults to false.
     * </p>
     * 
     * @return A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for
     *         model predictions. Defaults to false.
     */

    public Boolean getUseLogit() {
        return this.useLogit;
    }

    /**
     * <p>
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model
     * predictions. Defaults to false.
     * </p>
     * 
     * @param useLogit
     *        A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for
     *        model predictions. Defaults to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapConfig withUseLogit(Boolean useLogit) {
        setUseLogit(useLogit);
        return this;
    }

    /**
     * <p>
     * A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for model
     * predictions. Defaults to false.
     * </p>
     * 
     * @return A Boolean toggle to indicate if you want to use the logit function (true) or log-odds units (false) for
     *         model predictions. Defaults to false.
     */

    public Boolean isUseLogit() {
        return this.useLogit;
    }

    /**
     * <p>
     * The starting value used to initialize the random number generator in the explainer. Provide a value for this
     * parameter to obtain a deterministic SHAP result.
     * </p>
     * 
     * @param seed
     *        The starting value used to initialize the random number generator in the explainer. Provide a value for
     *        this parameter to obtain a deterministic SHAP result.
     */

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    /**
     * <p>
     * The starting value used to initialize the random number generator in the explainer. Provide a value for this
     * parameter to obtain a deterministic SHAP result.
     * </p>
     * 
     * @return The starting value used to initialize the random number generator in the explainer. Provide a value for
     *         this parameter to obtain a deterministic SHAP result.
     */

    public Integer getSeed() {
        return this.seed;
    }

    /**
     * <p>
     * The starting value used to initialize the random number generator in the explainer. Provide a value for this
     * parameter to obtain a deterministic SHAP result.
     * </p>
     * 
     * @param seed
     *        The starting value used to initialize the random number generator in the explainer. Provide a value for
     *        this parameter to obtain a deterministic SHAP result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapConfig withSeed(Integer seed) {
        setSeed(seed);
        return this;
    }

    /**
     * <p>
     * A parameter that indicates if text features are treated as text and explanations are provided for individual
     * units of text. Required for natural language processing (NLP) explainability only.
     * </p>
     * 
     * @param textConfig
     *        A parameter that indicates if text features are treated as text and explanations are provided for
     *        individual units of text. Required for natural language processing (NLP) explainability only.
     */

    public void setTextConfig(ClarifyTextConfig textConfig) {
        this.textConfig = textConfig;
    }

    /**
     * <p>
     * A parameter that indicates if text features are treated as text and explanations are provided for individual
     * units of text. Required for natural language processing (NLP) explainability only.
     * </p>
     * 
     * @return A parameter that indicates if text features are treated as text and explanations are provided for
     *         individual units of text. Required for natural language processing (NLP) explainability only.
     */

    public ClarifyTextConfig getTextConfig() {
        return this.textConfig;
    }

    /**
     * <p>
     * A parameter that indicates if text features are treated as text and explanations are provided for individual
     * units of text. Required for natural language processing (NLP) explainability only.
     * </p>
     * 
     * @param textConfig
     *        A parameter that indicates if text features are treated as text and explanations are provided for
     *        individual units of text. Required for natural language processing (NLP) explainability only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClarifyShapConfig withTextConfig(ClarifyTextConfig textConfig) {
        setTextConfig(textConfig);
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
        if (getShapBaselineConfig() != null)
            sb.append("ShapBaselineConfig: ").append(getShapBaselineConfig()).append(",");
        if (getNumberOfSamples() != null)
            sb.append("NumberOfSamples: ").append(getNumberOfSamples()).append(",");
        if (getUseLogit() != null)
            sb.append("UseLogit: ").append(getUseLogit()).append(",");
        if (getSeed() != null)
            sb.append("Seed: ").append(getSeed()).append(",");
        if (getTextConfig() != null)
            sb.append("TextConfig: ").append(getTextConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyShapConfig == false)
            return false;
        ClarifyShapConfig other = (ClarifyShapConfig) obj;
        if (other.getShapBaselineConfig() == null ^ this.getShapBaselineConfig() == null)
            return false;
        if (other.getShapBaselineConfig() != null && other.getShapBaselineConfig().equals(this.getShapBaselineConfig()) == false)
            return false;
        if (other.getNumberOfSamples() == null ^ this.getNumberOfSamples() == null)
            return false;
        if (other.getNumberOfSamples() != null && other.getNumberOfSamples().equals(this.getNumberOfSamples()) == false)
            return false;
        if (other.getUseLogit() == null ^ this.getUseLogit() == null)
            return false;
        if (other.getUseLogit() != null && other.getUseLogit().equals(this.getUseLogit()) == false)
            return false;
        if (other.getSeed() == null ^ this.getSeed() == null)
            return false;
        if (other.getSeed() != null && other.getSeed().equals(this.getSeed()) == false)
            return false;
        if (other.getTextConfig() == null ^ this.getTextConfig() == null)
            return false;
        if (other.getTextConfig() != null && other.getTextConfig().equals(this.getTextConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShapBaselineConfig() == null) ? 0 : getShapBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getNumberOfSamples() == null) ? 0 : getNumberOfSamples().hashCode());
        hashCode = prime * hashCode + ((getUseLogit() == null) ? 0 : getUseLogit().hashCode());
        hashCode = prime * hashCode + ((getSeed() == null) ? 0 : getSeed().hashCode());
        hashCode = prime * hashCode + ((getTextConfig() == null) ? 0 : getTextConfig().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyShapConfig clone() {
        try {
            return (ClarifyShapConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyShapConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
