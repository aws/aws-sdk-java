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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvaluationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     */
    private String jobIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobIdentifier
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public void setJobIdentifier(String jobIdentifier) {
        this.jobIdentifier = jobIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public String getJobIdentifier() {
        return this.jobIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobIdentifier
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobRequest withJobIdentifier(String jobIdentifier) {
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

        if (obj instanceof GetEvaluationJobRequest == false)
            return false;
        GetEvaluationJobRequest other = (GetEvaluationJobRequest) obj;
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
    public GetEvaluationJobRequest clone() {
        return (GetEvaluationJobRequest) super.clone();
    }

}
