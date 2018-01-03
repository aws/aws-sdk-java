/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Array of application summaries. */
    private java.util.List<ApplicationSummary> applications;
    /** The token to request the next page of results. */
    private String nextToken;

    /**
     * Array of application summaries.
     * 
     * @return Array of application summaries.
     */

    public java.util.List<ApplicationSummary> getApplications() {
        return applications;
    }

    /**
     * Array of application summaries.
     * 
     * @param applications
     *        Array of application summaries.
     */

    public void setApplications(java.util.Collection<ApplicationSummary> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<ApplicationSummary>(applications);
    }

    /**
     * Array of application summaries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        Array of application summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplications(ApplicationSummary... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<ApplicationSummary>(applications.length));
        }
        for (ApplicationSummary ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * Array of application summaries.
     * 
     * @param applications
     *        Array of application summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplications(java.util.Collection<ApplicationSummary> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * The token to request the next page of results.
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token to request the next page of results.
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token to request the next page of results.
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
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

        if (obj instanceof ListApplicationsResult == false)
            return false;
        ListApplicationsResult other = (ListApplicationsResult) obj;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
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

        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsResult clone() {
        try {
            return (ListApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
