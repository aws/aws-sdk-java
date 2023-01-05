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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnnotationImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of jobs.
     * </p>
     */
    private java.util.List<AnnotationImportJobItem> annotationImportJobs;
    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @return A list of jobs.
     */

    public java.util.List<AnnotationImportJobItem> getAnnotationImportJobs() {
        return annotationImportJobs;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param annotationImportJobs
     *        A list of jobs.
     */

    public void setAnnotationImportJobs(java.util.Collection<AnnotationImportJobItem> annotationImportJobs) {
        if (annotationImportJobs == null) {
            this.annotationImportJobs = null;
            return;
        }

        this.annotationImportJobs = new java.util.ArrayList<AnnotationImportJobItem>(annotationImportJobs);
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnnotationImportJobs(java.util.Collection)} or {@link #withAnnotationImportJobs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param annotationImportJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationImportJobsResult withAnnotationImportJobs(AnnotationImportJobItem... annotationImportJobs) {
        if (this.annotationImportJobs == null) {
            setAnnotationImportJobs(new java.util.ArrayList<AnnotationImportJobItem>(annotationImportJobs.length));
        }
        for (AnnotationImportJobItem ele : annotationImportJobs) {
            this.annotationImportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param annotationImportJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationImportJobsResult withAnnotationImportJobs(java.util.Collection<AnnotationImportJobItem> annotationImportJobs) {
        setAnnotationImportJobs(annotationImportJobs);
        return this;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationImportJobsResult withNextToken(String nextToken) {
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
        if (getAnnotationImportJobs() != null)
            sb.append("AnnotationImportJobs: ").append(getAnnotationImportJobs()).append(",");
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

        if (obj instanceof ListAnnotationImportJobsResult == false)
            return false;
        ListAnnotationImportJobsResult other = (ListAnnotationImportJobsResult) obj;
        if (other.getAnnotationImportJobs() == null ^ this.getAnnotationImportJobs() == null)
            return false;
        if (other.getAnnotationImportJobs() != null && other.getAnnotationImportJobs().equals(this.getAnnotationImportJobs()) == false)
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

        hashCode = prime * hashCode + ((getAnnotationImportJobs() == null) ? 0 : getAnnotationImportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnnotationImportJobsResult clone() {
        try {
            return (ListAnnotationImportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
