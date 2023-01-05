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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEvaluateFeatureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     */
    private String project;
    /**
     * <p>
     * An array of structures, where each structure assigns a feature variation to one user session.
     * </p>
     */
    private java.util.List<EvaluationRequest> requests;

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature being evaluated.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @return The name or ARN of the project that contains the feature being evaluated.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateFeatureRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure assigns a feature variation to one user session.
     * </p>
     * 
     * @return An array of structures, where each structure assigns a feature variation to one user session.
     */

    public java.util.List<EvaluationRequest> getRequests() {
        return requests;
    }

    /**
     * <p>
     * An array of structures, where each structure assigns a feature variation to one user session.
     * </p>
     * 
     * @param requests
     *        An array of structures, where each structure assigns a feature variation to one user session.
     */

    public void setRequests(java.util.Collection<EvaluationRequest> requests) {
        if (requests == null) {
            this.requests = null;
            return;
        }

        this.requests = new java.util.ArrayList<EvaluationRequest>(requests);
    }

    /**
     * <p>
     * An array of structures, where each structure assigns a feature variation to one user session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequests(java.util.Collection)} or {@link #withRequests(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param requests
     *        An array of structures, where each structure assigns a feature variation to one user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateFeatureRequest withRequests(EvaluationRequest... requests) {
        if (this.requests == null) {
            setRequests(new java.util.ArrayList<EvaluationRequest>(requests.length));
        }
        for (EvaluationRequest ele : requests) {
            this.requests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure assigns a feature variation to one user session.
     * </p>
     * 
     * @param requests
     *        An array of structures, where each structure assigns a feature variation to one user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateFeatureRequest withRequests(java.util.Collection<EvaluationRequest> requests) {
        setRequests(requests);
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
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getRequests() != null)
            sb.append("Requests: ").append(getRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEvaluateFeatureRequest == false)
            return false;
        BatchEvaluateFeatureRequest other = (BatchEvaluateFeatureRequest) obj;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getRequests() == null ^ this.getRequests() == null)
            return false;
        if (other.getRequests() != null && other.getRequests().equals(this.getRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getRequests() == null) ? 0 : getRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchEvaluateFeatureRequest clone() {
        return (BatchEvaluateFeatureRequest) super.clone();
    }

}
