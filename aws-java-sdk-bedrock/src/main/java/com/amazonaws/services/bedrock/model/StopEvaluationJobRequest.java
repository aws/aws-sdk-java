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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopEvaluationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopEvaluationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the model evaluation job you want to stop.
     * </p>
     */
    private String jobIdentifier;

    /**
     * <p>
     * The ARN of the model evaluation job you want to stop.
     * </p>
     * 
     * @param jobIdentifier
     *        The ARN of the model evaluation job you want to stop.
     */

    public void setJobIdentifier(String jobIdentifier) {
        this.jobIdentifier = jobIdentifier;
    }

    /**
     * <p>
     * The ARN of the model evaluation job you want to stop.
     * </p>
     * 
     * @return The ARN of the model evaluation job you want to stop.
     */

    public String getJobIdentifier() {
        return this.jobIdentifier;
    }

    /**
     * <p>
     * The ARN of the model evaluation job you want to stop.
     * </p>
     * 
     * @param jobIdentifier
     *        The ARN of the model evaluation job you want to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopEvaluationJobRequest withJobIdentifier(String jobIdentifier) {
        setJobIdentifier(jobIdentifier);
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
        if (getJobIdentifier() != null)
            sb.append("JobIdentifier: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopEvaluationJobRequest == false)
            return false;
        StopEvaluationJobRequest other = (StopEvaluationJobRequest) obj;
        if (other.getJobIdentifier() == null ^ this.getJobIdentifier() == null)
            return false;
        if (other.getJobIdentifier() != null && other.getJobIdentifier().equals(this.getJobIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobIdentifier() == null) ? 0 : getJobIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StopEvaluationJobRequest clone() {
        return (StopEvaluationJobRequest) super.clone();
    }

}
