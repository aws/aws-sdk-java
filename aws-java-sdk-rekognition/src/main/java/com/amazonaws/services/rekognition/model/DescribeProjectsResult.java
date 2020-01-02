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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time the projects are created.
     * </p>
     */
    private java.util.List<ProjectDescription> projectDescriptions;
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time the projects are created.
     * </p>
     * 
     * @return A list of project descriptions. The list is sorted by the date and time the projects are created.
     */

    public java.util.List<ProjectDescription> getProjectDescriptions() {
        return projectDescriptions;
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time the projects are created.
     * </p>
     * 
     * @param projectDescriptions
     *        A list of project descriptions. The list is sorted by the date and time the projects are created.
     */

    public void setProjectDescriptions(java.util.Collection<ProjectDescription> projectDescriptions) {
        if (projectDescriptions == null) {
            this.projectDescriptions = null;
            return;
        }

        this.projectDescriptions = new java.util.ArrayList<ProjectDescription>(projectDescriptions);
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time the projects are created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectDescriptions(java.util.Collection)} or {@link #withProjectDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param projectDescriptions
     *        A list of project descriptions. The list is sorted by the date and time the projects are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectsResult withProjectDescriptions(ProjectDescription... projectDescriptions) {
        if (this.projectDescriptions == null) {
            setProjectDescriptions(new java.util.ArrayList<ProjectDescription>(projectDescriptions.length));
        }
        for (ProjectDescription ele : projectDescriptions) {
            this.projectDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of project descriptions. The list is sorted by the date and time the projects are created.
     * </p>
     * 
     * @param projectDescriptions
     *        A list of project descriptions. The list is sorted by the date and time the projects are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectsResult withProjectDescriptions(java.util.Collection<ProjectDescription> projectDescriptions) {
        setProjectDescriptions(projectDescriptions);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *         Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectsResult withNextToken(String nextToken) {
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
        if (getProjectDescriptions() != null)
            sb.append("ProjectDescriptions: ").append(getProjectDescriptions()).append(",");
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

        if (obj instanceof DescribeProjectsResult == false)
            return false;
        DescribeProjectsResult other = (DescribeProjectsResult) obj;
        if (other.getProjectDescriptions() == null ^ this.getProjectDescriptions() == null)
            return false;
        if (other.getProjectDescriptions() != null && other.getProjectDescriptions().equals(this.getProjectDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getProjectDescriptions() == null) ? 0 : getProjectDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectsResult clone() {
        try {
            return (DescribeProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
