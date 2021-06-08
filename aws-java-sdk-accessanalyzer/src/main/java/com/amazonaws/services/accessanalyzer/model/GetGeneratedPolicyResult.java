/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetGeneratedPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeneratedPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     * </p>
     */
    private GeneratedPolicyResult generatedPolicyResult;
    /**
     * <p>
     * A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     * </p>
     */
    private JobDetails jobDetails;

    /**
     * <p>
     * A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     * </p>
     * 
     * @param generatedPolicyResult
     *        A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     */

    public void setGeneratedPolicyResult(GeneratedPolicyResult generatedPolicyResult) {
        this.generatedPolicyResult = generatedPolicyResult;
    }

    /**
     * <p>
     * A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     * </p>
     * 
     * @return A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     */

    public GeneratedPolicyResult getGeneratedPolicyResult() {
        return this.generatedPolicyResult;
    }

    /**
     * <p>
     * A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     * </p>
     * 
     * @param generatedPolicyResult
     *        A <code>GeneratedPolicyResult</code> object that contains the generated policies and associated details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedPolicyResult withGeneratedPolicyResult(GeneratedPolicyResult generatedPolicyResult) {
        setGeneratedPolicyResult(generatedPolicyResult);
        return this;
    }

    /**
     * <p>
     * A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     * </p>
     * 
     * @param jobDetails
     *        A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     */

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     * </p>
     * 
     * @return A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     */

    public JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     * </p>
     * 
     * @param jobDetails
     *        A <code>GeneratedPolicyDetails</code> object that contains details about the generated policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedPolicyResult withJobDetails(JobDetails jobDetails) {
        setJobDetails(jobDetails);
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
        if (getGeneratedPolicyResult() != null)
            sb.append("GeneratedPolicyResult: ").append(getGeneratedPolicyResult()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeneratedPolicyResult == false)
            return false;
        GetGeneratedPolicyResult other = (GetGeneratedPolicyResult) obj;
        if (other.getGeneratedPolicyResult() == null ^ this.getGeneratedPolicyResult() == null)
            return false;
        if (other.getGeneratedPolicyResult() != null && other.getGeneratedPolicyResult().equals(this.getGeneratedPolicyResult()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedPolicyResult() == null) ? 0 : getGeneratedPolicyResult().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetGeneratedPolicyResult clone() {
        try {
            return (GetGeneratedPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
