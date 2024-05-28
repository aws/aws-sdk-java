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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrainingDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     * </p>
     */
    private String trainingDatasetArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     */

    public void setTrainingDatasetArn(String trainingDatasetArn) {
        this.trainingDatasetArn = trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     */

    public String getTrainingDatasetArn() {
        return this.trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset that you are interested in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetRequest withTrainingDatasetArn(String trainingDatasetArn) {
        setTrainingDatasetArn(trainingDatasetArn);
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
        if (getTrainingDatasetArn() != null)
            sb.append("TrainingDatasetArn: ").append(getTrainingDatasetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrainingDatasetRequest == false)
            return false;
        GetTrainingDatasetRequest other = (GetTrainingDatasetRequest) obj;
        if (other.getTrainingDatasetArn() == null ^ this.getTrainingDatasetArn() == null)
            return false;
        if (other.getTrainingDatasetArn() != null && other.getTrainingDatasetArn().equals(this.getTrainingDatasetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingDatasetArn() == null) ? 0 : getTrainingDatasetArn().hashCode());
        return hashCode;
    }

    @Override
    public GetTrainingDatasetRequest clone() {
        return (GetTrainingDatasetRequest) super.clone();
    }

}
