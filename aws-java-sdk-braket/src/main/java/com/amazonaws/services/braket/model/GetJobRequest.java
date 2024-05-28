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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     */
    private java.util.List<String> additionalAttributeNames;
    /**
     * <p>
     * The ARN of the job to retrieve.
     * </p>
     */
    private String jobArn;

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @return A list of attributes to return information for.
     * @see HybridJobAdditionalAttributeName
     */

    public java.util.List<String> getAdditionalAttributeNames() {
        return additionalAttributeNames;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @see HybridJobAdditionalAttributeName
     */

    public void setAdditionalAttributeNames(java.util.Collection<String> additionalAttributeNames) {
        if (additionalAttributeNames == null) {
            this.additionalAttributeNames = null;
            return;
        }

        this.additionalAttributeNames = new java.util.ArrayList<String>(additionalAttributeNames);
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributeNames(java.util.Collection)} or
     * {@link #withAdditionalAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HybridJobAdditionalAttributeName
     */

    public GetJobRequest withAdditionalAttributeNames(String... additionalAttributeNames) {
        if (this.additionalAttributeNames == null) {
            setAdditionalAttributeNames(new java.util.ArrayList<String>(additionalAttributeNames.length));
        }
        for (String ele : additionalAttributeNames) {
            this.additionalAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HybridJobAdditionalAttributeName
     */

    public GetJobRequest withAdditionalAttributeNames(java.util.Collection<String> additionalAttributeNames) {
        setAdditionalAttributeNames(additionalAttributeNames);
        return this;
    }

    /**
     * <p>
     * A list of attributes to return information for.
     * </p>
     * 
     * @param additionalAttributeNames
     *        A list of attributes to return information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HybridJobAdditionalAttributeName
     */

    public GetJobRequest withAdditionalAttributeNames(HybridJobAdditionalAttributeName... additionalAttributeNames) {
        java.util.ArrayList<String> additionalAttributeNamesCopy = new java.util.ArrayList<String>(additionalAttributeNames.length);
        for (HybridJobAdditionalAttributeName value : additionalAttributeNames) {
            additionalAttributeNamesCopy.add(value.toString());
        }
        if (getAdditionalAttributeNames() == null) {
            setAdditionalAttributeNames(additionalAttributeNamesCopy);
        } else {
            getAdditionalAttributeNames().addAll(additionalAttributeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the job to retrieve.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the job to retrieve.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the job to retrieve.
     * </p>
     * 
     * @return The ARN of the job to retrieve.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of the job to retrieve.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the job to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobRequest withJobArn(String jobArn) {
        setJobArn(jobArn);
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
        if (getAdditionalAttributeNames() != null)
            sb.append("AdditionalAttributeNames: ").append(getAdditionalAttributeNames()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobRequest == false)
            return false;
        GetJobRequest other = (GetJobRequest) obj;
        if (other.getAdditionalAttributeNames() == null ^ this.getAdditionalAttributeNames() == null)
            return false;
        if (other.getAdditionalAttributeNames() != null && other.getAdditionalAttributeNames().equals(this.getAdditionalAttributeNames()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAttributeNames() == null) ? 0 : getAdditionalAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        return hashCode;
    }

    @Override
    public GetJobRequest clone() {
        return (GetJobRequest) super.clone();
    }

}
