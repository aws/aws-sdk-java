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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFHIRExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * </p>
     */
    private java.util.List<ExportJobProperties> exportJobPropertiesList;
    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @return The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     */

    public java.util.List<ExportJobProperties> getExportJobPropertiesList() {
        return exportJobPropertiesList;
    }

    /**
     * <p>
     * The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param exportJobPropertiesList
     *        The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     */

    public void setExportJobPropertiesList(java.util.Collection<ExportJobProperties> exportJobPropertiesList) {
        if (exportJobPropertiesList == null) {
            this.exportJobPropertiesList = null;
            return;
        }

        this.exportJobPropertiesList = new java.util.ArrayList<ExportJobProperties>(exportJobPropertiesList);
    }

    /**
     * <p>
     * The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportJobPropertiesList(java.util.Collection)} or
     * {@link #withExportJobPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param exportJobPropertiesList
     *        The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsResult withExportJobPropertiesList(ExportJobProperties... exportJobPropertiesList) {
        if (this.exportJobPropertiesList == null) {
            setExportJobPropertiesList(new java.util.ArrayList<ExportJobProperties>(exportJobPropertiesList.length));
        }
        for (ExportJobProperties ele : exportJobPropertiesList) {
            this.exportJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param exportJobPropertiesList
     *        The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsResult withExportJobPropertiesList(java.util.Collection<ExportJobProperties> exportJobPropertiesList) {
        setExportJobPropertiesList(exportJobPropertiesList);
        return this;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @param nextToken
     *        A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @return A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * </p>
     * 
     * @param nextToken
     *        A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFHIRExportJobsResult withNextToken(String nextToken) {
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
        if (getExportJobPropertiesList() != null)
            sb.append("ExportJobPropertiesList: ").append(getExportJobPropertiesList()).append(",");
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

        if (obj instanceof ListFHIRExportJobsResult == false)
            return false;
        ListFHIRExportJobsResult other = (ListFHIRExportJobsResult) obj;
        if (other.getExportJobPropertiesList() == null ^ this.getExportJobPropertiesList() == null)
            return false;
        if (other.getExportJobPropertiesList() != null && other.getExportJobPropertiesList().equals(this.getExportJobPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getExportJobPropertiesList() == null) ? 0 : getExportJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFHIRExportJobsResult clone() {
        try {
            return (ListFHIRExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
