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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTestGridProjects" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestGridProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * </p>
     */
    private java.util.List<TestGridProject> testGridProjects;
    /**
     * <p>
     * Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * </p>
     * 
     * @return The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     */

    public java.util.List<TestGridProject> getTestGridProjects() {
        return testGridProjects;
    }

    /**
     * <p>
     * The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * </p>
     * 
     * @param testGridProjects
     *        The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     */

    public void setTestGridProjects(java.util.Collection<TestGridProject> testGridProjects) {
        if (testGridProjects == null) {
            this.testGridProjects = null;
            return;
        }

        this.testGridProjects = new java.util.ArrayList<TestGridProject>(testGridProjects);
    }

    /**
     * <p>
     * The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestGridProjects(java.util.Collection)} or {@link #withTestGridProjects(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param testGridProjects
     *        The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridProjectsResult withTestGridProjects(TestGridProject... testGridProjects) {
        if (this.testGridProjects == null) {
            setTestGridProjects(new java.util.ArrayList<TestGridProject>(testGridProjects.length));
        }
        for (TestGridProject ele : testGridProjects) {
            this.testGridProjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * </p>
     * 
     * @param testGridProjects
     *        The list of TestGridProjects, based on a <a>ListTestGridProjectsRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridProjectsResult withTestGridProjects(java.util.Collection<TestGridProject> testGridProjects) {
        setTestGridProjects(testGridProjects);
        return this;
    }

    /**
     * <p>
     * Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     * </p>
     * 
     * @return Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Pass into <a>ListTestGridProjects</a> to get more results in a paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestGridProjectsResult withNextToken(String nextToken) {
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
        if (getTestGridProjects() != null)
            sb.append("TestGridProjects: ").append(getTestGridProjects()).append(",");
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

        if (obj instanceof ListTestGridProjectsResult == false)
            return false;
        ListTestGridProjectsResult other = (ListTestGridProjectsResult) obj;
        if (other.getTestGridProjects() == null ^ this.getTestGridProjects() == null)
            return false;
        if (other.getTestGridProjects() != null && other.getTestGridProjects().equals(this.getTestGridProjects()) == false)
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

        hashCode = prime * hashCode + ((getTestGridProjects() == null) ? 0 : getTestGridProjects().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestGridProjectsResult clone() {
        try {
            return (ListTestGridProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
