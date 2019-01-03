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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a GetThirdPartyJobDetails action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GetThirdPartyJobDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetThirdPartyJobDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the job, including any protected values defined for the job.
     * </p>
     */
    private ThirdPartyJobDetails jobDetails;

    /**
     * <p>
     * The details of the job, including any protected values defined for the job.
     * </p>
     * 
     * @param jobDetails
     *        The details of the job, including any protected values defined for the job.
     */

    public void setJobDetails(ThirdPartyJobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The details of the job, including any protected values defined for the job.
     * </p>
     * 
     * @return The details of the job, including any protected values defined for the job.
     */

    public ThirdPartyJobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * The details of the job, including any protected values defined for the job.
     * </p>
     * 
     * @param jobDetails
     *        The details of the job, including any protected values defined for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThirdPartyJobDetailsResult withJobDetails(ThirdPartyJobDetails jobDetails) {
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

        if (obj instanceof GetThirdPartyJobDetailsResult == false)
            return false;
        GetThirdPartyJobDetailsResult other = (GetThirdPartyJobDetailsResult) obj;
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

        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetThirdPartyJobDetailsResult clone() {
        try {
            return (GetThirdPartyJobDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
