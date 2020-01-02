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
public class DescribeProjectVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to
     * earliest.
     * </p>
     */
    private java.util.List<ProjectVersionDescription> projectVersionDescriptions;
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
     * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to
     * earliest.
     * </p>
     * 
     * @return A list of model descriptions. The list is sorted by the creation date and time of the model versions,
     *         latest to earliest.
     */

    public java.util.List<ProjectVersionDescription> getProjectVersionDescriptions() {
        return projectVersionDescriptions;
    }

    /**
     * <p>
     * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to
     * earliest.
     * </p>
     * 
     * @param projectVersionDescriptions
     *        A list of model descriptions. The list is sorted by the creation date and time of the model versions,
     *        latest to earliest.
     */

    public void setProjectVersionDescriptions(java.util.Collection<ProjectVersionDescription> projectVersionDescriptions) {
        if (projectVersionDescriptions == null) {
            this.projectVersionDescriptions = null;
            return;
        }

        this.projectVersionDescriptions = new java.util.ArrayList<ProjectVersionDescription>(projectVersionDescriptions);
    }

    /**
     * <p>
     * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to
     * earliest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectVersionDescriptions(java.util.Collection)} or
     * {@link #withProjectVersionDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectVersionDescriptions
     *        A list of model descriptions. The list is sorted by the creation date and time of the model versions,
     *        latest to earliest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsResult withProjectVersionDescriptions(ProjectVersionDescription... projectVersionDescriptions) {
        if (this.projectVersionDescriptions == null) {
            setProjectVersionDescriptions(new java.util.ArrayList<ProjectVersionDescription>(projectVersionDescriptions.length));
        }
        for (ProjectVersionDescription ele : projectVersionDescriptions) {
            this.projectVersionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to
     * earliest.
     * </p>
     * 
     * @param projectVersionDescriptions
     *        A list of model descriptions. The list is sorted by the creation date and time of the model versions,
     *        latest to earliest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectVersionsResult withProjectVersionDescriptions(java.util.Collection<ProjectVersionDescription> projectVersionDescriptions) {
        setProjectVersionDescriptions(projectVersionDescriptions);
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

    public DescribeProjectVersionsResult withNextToken(String nextToken) {
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
        if (getProjectVersionDescriptions() != null)
            sb.append("ProjectVersionDescriptions: ").append(getProjectVersionDescriptions()).append(",");
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

        if (obj instanceof DescribeProjectVersionsResult == false)
            return false;
        DescribeProjectVersionsResult other = (DescribeProjectVersionsResult) obj;
        if (other.getProjectVersionDescriptions() == null ^ this.getProjectVersionDescriptions() == null)
            return false;
        if (other.getProjectVersionDescriptions() != null && other.getProjectVersionDescriptions().equals(this.getProjectVersionDescriptions()) == false)
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

        hashCode = prime * hashCode + ((getProjectVersionDescriptions() == null) ? 0 : getProjectVersionDescriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectVersionsResult clone() {
        try {
            return (DescribeProjectVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
