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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHyperParameterTuningJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job
     * when you create it.
     * </p>
     */
    private String hyperParameterTuningJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job
     * when you create it.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter
     *        tuning job when you create it.
     */

    public void setHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job
     * when you create it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter
     *         tuning job when you create it.
     */

    public String getHyperParameterTuningJobArn() {
        return this.hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job
     * when you create it.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter
     *        tuning job when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHyperParameterTuningJobResult withHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        setHyperParameterTuningJobArn(hyperParameterTuningJobArn);
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
        if (getHyperParameterTuningJobArn() != null)
            sb.append("HyperParameterTuningJobArn: ").append(getHyperParameterTuningJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHyperParameterTuningJobResult == false)
            return false;
        CreateHyperParameterTuningJobResult other = (CreateHyperParameterTuningJobResult) obj;
        if (other.getHyperParameterTuningJobArn() == null ^ this.getHyperParameterTuningJobArn() == null)
            return false;
        if (other.getHyperParameterTuningJobArn() != null && other.getHyperParameterTuningJobArn().equals(this.getHyperParameterTuningJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateHyperParameterTuningJobResult clone() {
        try {
            return (CreateHyperParameterTuningJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
