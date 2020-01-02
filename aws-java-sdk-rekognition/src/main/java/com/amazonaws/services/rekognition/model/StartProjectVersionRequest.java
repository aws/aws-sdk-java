/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to start.
     * </p>
     */
    private String projectVersionArn;
    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     */
    private Integer minInferenceUnits;

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to start.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name(ARN) of the model version that you want to start.
     */

    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to start.
     * </p>
     * 
     * @return The Amazon Resource Name(ARN) of the model version that you want to start.
     */

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to start.
     * </p>
     * 
     * @param projectVersionArn
     *        The Amazon Resource Name(ARN) of the model version that you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectVersionRequest withProjectVersionArn(String projectVersionArn) {
        setProjectVersionArn(projectVersionArn);
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *        can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *        your model. You are charged for the number of inference units that you use.
     */

    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @return The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *         can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *         your model. You are charged for the number of inference units that you use.
     */

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can
     * support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model.
     * You are charged for the number of inference units that you use.
     * </p>
     * 
     * @param minInferenceUnits
     *        The minimum number of inference units to use. A single inference unit represents 1 hour of processing and
     *        can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of
     *        your model. You are charged for the number of inference units that you use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectVersionRequest withMinInferenceUnits(Integer minInferenceUnits) {
        setMinInferenceUnits(minInferenceUnits);
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: ").append(getProjectVersionArn()).append(",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: ").append(getMinInferenceUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProjectVersionRequest == false)
            return false;
        StartProjectVersionRequest other = (StartProjectVersionRequest) obj;
        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        return hashCode;
    }

    @Override
    public StartProjectVersionRequest clone() {
        return (StartProjectVersionRequest) super.clone();
    }

}
