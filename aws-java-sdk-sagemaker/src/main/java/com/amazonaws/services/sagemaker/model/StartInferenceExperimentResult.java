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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartInferenceExperiment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInferenceExperimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the started inference experiment to start.
     * </p>
     */
    private String inferenceExperimentArn;

    /**
     * <p>
     * The ARN of the started inference experiment to start.
     * </p>
     * 
     * @param inferenceExperimentArn
     *        The ARN of the started inference experiment to start.
     */

    public void setInferenceExperimentArn(String inferenceExperimentArn) {
        this.inferenceExperimentArn = inferenceExperimentArn;
    }

    /**
     * <p>
     * The ARN of the started inference experiment to start.
     * </p>
     * 
     * @return The ARN of the started inference experiment to start.
     */

    public String getInferenceExperimentArn() {
        return this.inferenceExperimentArn;
    }

    /**
     * <p>
     * The ARN of the started inference experiment to start.
     * </p>
     * 
     * @param inferenceExperimentArn
     *        The ARN of the started inference experiment to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInferenceExperimentResult withInferenceExperimentArn(String inferenceExperimentArn) {
        setInferenceExperimentArn(inferenceExperimentArn);
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
        if (getInferenceExperimentArn() != null)
            sb.append("InferenceExperimentArn: ").append(getInferenceExperimentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInferenceExperimentResult == false)
            return false;
        StartInferenceExperimentResult other = (StartInferenceExperimentResult) obj;
        if (other.getInferenceExperimentArn() == null ^ this.getInferenceExperimentArn() == null)
            return false;
        if (other.getInferenceExperimentArn() != null && other.getInferenceExperimentArn().equals(this.getInferenceExperimentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceExperimentArn() == null) ? 0 : getInferenceExperimentArn().hashCode());
        return hashCode;
    }

    @Override
    public StartInferenceExperimentResult clone() {
        try {
            return (StartInferenceExperimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
