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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentFrameworksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of metadata objects for the specified framework.
     * </p>
     */
    private java.util.List<AssessmentFrameworkMetadata> frameworkMetadataList;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of metadata objects for the specified framework.
     * </p>
     * 
     * @return The list of metadata objects for the specified framework.
     */

    public java.util.List<AssessmentFrameworkMetadata> getFrameworkMetadataList() {
        return frameworkMetadataList;
    }

    /**
     * <p>
     * The list of metadata objects for the specified framework.
     * </p>
     * 
     * @param frameworkMetadataList
     *        The list of metadata objects for the specified framework.
     */

    public void setFrameworkMetadataList(java.util.Collection<AssessmentFrameworkMetadata> frameworkMetadataList) {
        if (frameworkMetadataList == null) {
            this.frameworkMetadataList = null;
            return;
        }

        this.frameworkMetadataList = new java.util.ArrayList<AssessmentFrameworkMetadata>(frameworkMetadataList);
    }

    /**
     * <p>
     * The list of metadata objects for the specified framework.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworkMetadataList(java.util.Collection)} or
     * {@link #withFrameworkMetadataList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param frameworkMetadataList
     *        The list of metadata objects for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworksResult withFrameworkMetadataList(AssessmentFrameworkMetadata... frameworkMetadataList) {
        if (this.frameworkMetadataList == null) {
            setFrameworkMetadataList(new java.util.ArrayList<AssessmentFrameworkMetadata>(frameworkMetadataList.length));
        }
        for (AssessmentFrameworkMetadata ele : frameworkMetadataList) {
            this.frameworkMetadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of metadata objects for the specified framework.
     * </p>
     * 
     * @param frameworkMetadataList
     *        The list of metadata objects for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworksResult withFrameworkMetadataList(java.util.Collection<AssessmentFrameworkMetadata> frameworkMetadataList) {
        setFrameworkMetadataList(frameworkMetadataList);
        return this;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentFrameworksResult withNextToken(String nextToken) {
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
        if (getFrameworkMetadataList() != null)
            sb.append("FrameworkMetadataList: ").append(getFrameworkMetadataList()).append(",");
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

        if (obj instanceof ListAssessmentFrameworksResult == false)
            return false;
        ListAssessmentFrameworksResult other = (ListAssessmentFrameworksResult) obj;
        if (other.getFrameworkMetadataList() == null ^ this.getFrameworkMetadataList() == null)
            return false;
        if (other.getFrameworkMetadataList() != null && other.getFrameworkMetadataList().equals(this.getFrameworkMetadataList()) == false)
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

        hashCode = prime * hashCode + ((getFrameworkMetadataList() == null) ? 0 : getFrameworkMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentFrameworksResult clone() {
        try {
            return (ListAssessmentFrameworksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
