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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores the configuration information for how model candidates are generated using an AutoML job V2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CandidateGenerationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CandidateGenerationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train model candidates on tabular
     * data.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     * <code>TabularJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full set of
     * algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per problem type and training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     */
    private java.util.List<AutoMLAlgorithmConfig> algorithmsConfig;

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train model candidates on tabular
     * data.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     * <code>TabularJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full set of
     * algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per problem type and training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @return Stores the configuration information for the selection of algorithms used to train model candidates on
     *         tabular data.</p>
     *         <p>
     *         The list of available algorithms to choose from depends on the training mode set in <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     *         <code>TabularJobConfig.Mode</code> </a>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *         and one only.
     *         </p>
     *         <p>
     *         If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *         <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full
     *         set of algorithms for the given training mode.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the list of all algorithms per problem type and training mode, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *         AutoMLAlgorithmConfig</a>.
     *         </p>
     *         <p>
     *         For more information on each algorithm, see the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *         >Algorithm support</a> section in Autopilot developer guide.
     */

    public java.util.List<AutoMLAlgorithmConfig> getAlgorithmsConfig() {
        return algorithmsConfig;
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train model candidates on tabular
     * data.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     * <code>TabularJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full set of
     * algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per problem type and training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train model candidates on
     *        tabular data.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     *        <code>TabularJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full
     *        set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per problem type and training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     */

    public void setAlgorithmsConfig(java.util.Collection<AutoMLAlgorithmConfig> algorithmsConfig) {
        if (algorithmsConfig == null) {
            this.algorithmsConfig = null;
            return;
        }

        this.algorithmsConfig = new java.util.ArrayList<AutoMLAlgorithmConfig>(algorithmsConfig);
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train model candidates on tabular
     * data.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     * <code>TabularJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full set of
     * algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per problem type and training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlgorithmsConfig(java.util.Collection)} or {@link #withAlgorithmsConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train model candidates on
     *        tabular data.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     *        <code>TabularJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full
     *        set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per problem type and training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateGenerationConfig withAlgorithmsConfig(AutoMLAlgorithmConfig... algorithmsConfig) {
        if (this.algorithmsConfig == null) {
            setAlgorithmsConfig(new java.util.ArrayList<AutoMLAlgorithmConfig>(algorithmsConfig.length));
        }
        for (AutoMLAlgorithmConfig ele : algorithmsConfig) {
            this.algorithmsConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stores the configuration information for the selection of algorithms used to train model candidates on tabular
     * data.
     * </p>
     * <p>
     * The list of available algorithms to choose from depends on the training mode set in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     * <code>TabularJobConfig.Mode</code> </a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set and one
     * only.
     * </p>
     * <p>
     * If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     * <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full set of
     * algorithms for the given training mode.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of all algorithms per problem type and training mode, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     * AutoMLAlgorithmConfig</a>.
     * </p>
     * <p>
     * For more information on each algorithm, see the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     * >Algorithm support</a> section in Autopilot developer guide.
     * </p>
     * 
     * @param algorithmsConfig
     *        Stores the configuration information for the selection of algorithms used to train model candidates on
     *        tabular data.</p>
     *        <p>
     *        The list of available algorithms to choose from depends on the training mode set in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_TabularJobConfig.html">
     *        <code>TabularJobConfig.Mode</code> </a>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AlgorithmsConfig</code> should not be set in <code>AUTO</code> training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is provided, one <code>AutoMLAlgorithms</code> attribute must be set
     *        and one only.
     *        </p>
     *        <p>
     *        If the list of algorithms provided as values for <code>AutoMLAlgorithms</code> is empty,
     *        <code>CandidateGenerationConfig</code> uses the full set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>AlgorithmsConfig</code> is not provided, <code>CandidateGenerationConfig</code> uses the full
     *        set of algorithms for the given training mode.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of all algorithms per problem type and training mode, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLAlgorithmConfig.html">
     *        AutoMLAlgorithmConfig</a>.
     *        </p>
     *        <p>
     *        For more information on each algorithm, see the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-support"
     *        >Algorithm support</a> section in Autopilot developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateGenerationConfig withAlgorithmsConfig(java.util.Collection<AutoMLAlgorithmConfig> algorithmsConfig) {
        setAlgorithmsConfig(algorithmsConfig);
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
        if (getAlgorithmsConfig() != null)
            sb.append("AlgorithmsConfig: ").append(getAlgorithmsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CandidateGenerationConfig == false)
            return false;
        CandidateGenerationConfig other = (CandidateGenerationConfig) obj;
        if (other.getAlgorithmsConfig() == null ^ this.getAlgorithmsConfig() == null)
            return false;
        if (other.getAlgorithmsConfig() != null && other.getAlgorithmsConfig().equals(this.getAlgorithmsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmsConfig() == null) ? 0 : getAlgorithmsConfig().hashCode());
        return hashCode;
    }

    @Override
    public CandidateGenerationConfig clone() {
        try {
            return (CandidateGenerationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CandidateGenerationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
