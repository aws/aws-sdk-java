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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     */
    private java.util.List<ProjectPolicy> projectPolicies;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of project policies.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * 
     * @return A list of project policies attached to the project.
     */

    public java.util.List<ProjectPolicy> getProjectPolicies() {
        return projectPolicies;
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * 
     * @param projectPolicies
     *        A list of project policies attached to the project.
     */

    public void setProjectPolicies(java.util.Collection<ProjectPolicy> projectPolicies) {
        if (projectPolicies == null) {
            this.projectPolicies = null;
            return;
        }

        this.projectPolicies = new java.util.ArrayList<ProjectPolicy>(projectPolicies);
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectPolicies(java.util.Collection)} or {@link #withProjectPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectPolicies
     *        A list of project policies attached to the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesResult withProjectPolicies(ProjectPolicy... projectPolicies) {
        if (this.projectPolicies == null) {
            setProjectPolicies(new java.util.ArrayList<ProjectPolicy>(projectPolicies.length));
        }
        for (ProjectPolicy ele : projectPolicies) {
            this.projectPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of project policies attached to the project.
     * </p>
     * 
     * @param projectPolicies
     *        A list of project policies attached to the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesResult withProjectPolicies(java.util.Collection<ProjectPolicy> projectPolicies) {
        setProjectPolicies(projectPolicies);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of project policies.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *        request to retrieve the next set of project policies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of project policies.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *         request to retrieve the next set of project policies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of project policies.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *        request to retrieve the next set of project policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getProjectPolicies() != null)
            sb.append("ProjectPolicies: ").append(getProjectPolicies()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectPoliciesResult == false)
            return false;
        ListProjectPoliciesResult other = (ListProjectPoliciesResult) obj;
        if (other.getProjectPolicies() == null ^ this.getProjectPolicies() == null)
            return false;
        if (other.getProjectPolicies() != null && other.getProjectPolicies().equals(this.getProjectPolicies()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectPolicies() == null) ? 0 : getProjectPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectPoliciesResult clone() {
        try {
            return (ListProjectPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
