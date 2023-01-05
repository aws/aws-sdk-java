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
 * Metadata for a Lambda step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LambdaStepMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list of the output parameters of the Lambda step.
     * </p>
     */
    private java.util.List<OutputParameter> outputParameters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaStepMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list of the output parameters of the Lambda step.
     * </p>
     * 
     * @return A list of the output parameters of the Lambda step.
     */

    public java.util.List<OutputParameter> getOutputParameters() {
        return outputParameters;
    }

    /**
     * <p>
     * A list of the output parameters of the Lambda step.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the Lambda step.
     */

    public void setOutputParameters(java.util.Collection<OutputParameter> outputParameters) {
        if (outputParameters == null) {
            this.outputParameters = null;
            return;
        }

        this.outputParameters = new java.util.ArrayList<OutputParameter>(outputParameters);
    }

    /**
     * <p>
     * A list of the output parameters of the Lambda step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputParameters(java.util.Collection)} or {@link #withOutputParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the Lambda step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaStepMetadata withOutputParameters(OutputParameter... outputParameters) {
        if (this.outputParameters == null) {
            setOutputParameters(new java.util.ArrayList<OutputParameter>(outputParameters.length));
        }
        for (OutputParameter ele : outputParameters) {
            this.outputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the output parameters of the Lambda step.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the Lambda step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaStepMetadata withOutputParameters(java.util.Collection<OutputParameter> outputParameters) {
        setOutputParameters(outputParameters);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getOutputParameters() != null)
            sb.append("OutputParameters: ").append(getOutputParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaStepMetadata == false)
            return false;
        LambdaStepMetadata other = (LambdaStepMetadata) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getOutputParameters() == null ^ this.getOutputParameters() == null)
            return false;
        if (other.getOutputParameters() != null && other.getOutputParameters().equals(this.getOutputParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getOutputParameters() == null) ? 0 : getOutputParameters().hashCode());
        return hashCode;
    }

    @Override
    public LambdaStepMetadata clone() {
        try {
            return (LambdaStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LambdaStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
