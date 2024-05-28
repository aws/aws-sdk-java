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
 * The resolved attributes specific to the tabular problem type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TabularResolvedAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TabularResolvedAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     * Classification, Multiclass Classification, Regression). For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     */
    private String problemType;

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     * Classification, Multiclass Classification, Regression). For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     *        Classification, Multiclass Classification, Regression). For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.
     * @see ProblemType
     */

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     * Classification, Multiclass Classification, Regression). For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * 
     * @return The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     *         Classification, Multiclass Classification, Regression). For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *         > SageMaker Autopilot problem types</a>.
     * @see ProblemType
     */

    public String getProblemType() {
        return this.problemType;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     * Classification, Multiclass Classification, Regression). For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     *        Classification, Multiclass Classification, Regression). For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public TabularResolvedAttributes withProblemType(String problemType) {
        setProblemType(problemType);
        return this;
    }

    /**
     * <p>
     * The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     * Classification, Multiclass Classification, Regression). For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types">
     * SageMaker Autopilot problem types</a>.
     * </p>
     * 
     * @param problemType
     *        The type of supervised learning problem available for the model candidates of the AutoML job V2 (Binary
     *        Classification, Multiclass Classification, Regression). For more information, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-datasets-problem-types.html#autopilot-problem-types"
     *        > SageMaker Autopilot problem types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public TabularResolvedAttributes withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
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
        if (getProblemType() != null)
            sb.append("ProblemType: ").append(getProblemType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TabularResolvedAttributes == false)
            return false;
        TabularResolvedAttributes other = (TabularResolvedAttributes) obj;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        return hashCode;
    }

    @Override
    public TabularResolvedAttributes clone() {
        try {
            return (TabularResolvedAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TabularResolvedAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
