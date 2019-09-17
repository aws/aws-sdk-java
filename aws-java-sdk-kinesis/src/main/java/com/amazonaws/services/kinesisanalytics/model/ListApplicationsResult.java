/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ListApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>ApplicationSummary</code> objects.
     * </p>
     */
    private java.util.List<ApplicationSummary> applicationSummaries;
    /**
     * <p>
     * Returns true if there are more applications to retrieve.
     * </p>
     */
    private Boolean hasMoreApplications;

    /**
     * <p>
     * List of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @return List of <code>ApplicationSummary</code> objects.
     */

    public java.util.List<ApplicationSummary> getApplicationSummaries() {
        return applicationSummaries;
    }

    /**
     * <p>
     * List of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @param applicationSummaries
     *        List of <code>ApplicationSummary</code> objects.
     */

    public void setApplicationSummaries(java.util.Collection<ApplicationSummary> applicationSummaries) {
        if (applicationSummaries == null) {
            this.applicationSummaries = null;
            return;
        }

        this.applicationSummaries = new java.util.ArrayList<ApplicationSummary>(applicationSummaries);
    }

    /**
     * <p>
     * List of <code>ApplicationSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationSummaries(java.util.Collection)} or {@link #withApplicationSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicationSummaries
     *        List of <code>ApplicationSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationSummaries(ApplicationSummary... applicationSummaries) {
        if (this.applicationSummaries == null) {
            setApplicationSummaries(new java.util.ArrayList<ApplicationSummary>(applicationSummaries.length));
        }
        for (ApplicationSummary ele : applicationSummaries) {
            this.applicationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>ApplicationSummary</code> objects.
     * </p>
     * 
     * @param applicationSummaries
     *        List of <code>ApplicationSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplicationSummaries(java.util.Collection<ApplicationSummary> applicationSummaries) {
        setApplicationSummaries(applicationSummaries);
        return this;
    }

    /**
     * <p>
     * Returns true if there are more applications to retrieve.
     * </p>
     * 
     * @param hasMoreApplications
     *        Returns true if there are more applications to retrieve.
     */

    public void setHasMoreApplications(Boolean hasMoreApplications) {
        this.hasMoreApplications = hasMoreApplications;
    }

    /**
     * <p>
     * Returns true if there are more applications to retrieve.
     * </p>
     * 
     * @return Returns true if there are more applications to retrieve.
     */

    public Boolean getHasMoreApplications() {
        return this.hasMoreApplications;
    }

    /**
     * <p>
     * Returns true if there are more applications to retrieve.
     * </p>
     * 
     * @param hasMoreApplications
     *        Returns true if there are more applications to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withHasMoreApplications(Boolean hasMoreApplications) {
        setHasMoreApplications(hasMoreApplications);
        return this;
    }

    /**
     * <p>
     * Returns true if there are more applications to retrieve.
     * </p>
     * 
     * @return Returns true if there are more applications to retrieve.
     */

    public Boolean isHasMoreApplications() {
        return this.hasMoreApplications;
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
        if (getApplicationSummaries() != null)
            sb.append("ApplicationSummaries: ").append(getApplicationSummaries()).append(",");
        if (getHasMoreApplications() != null)
            sb.append("HasMoreApplications: ").append(getHasMoreApplications());
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
        if (other.getApplicationSummaries() == null ^ this.getApplicationSummaries() == null)
            return false;
        if (other.getApplicationSummaries() != null && other.getApplicationSummaries().equals(this.getApplicationSummaries()) == false)
            return false;
        if (other.getHasMoreApplications() == null ^ this.getHasMoreApplications() == null)
            return false;
        if (other.getHasMoreApplications() != null && other.getHasMoreApplications().equals(this.getHasMoreApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationSummaries() == null) ? 0 : getApplicationSummaries().hashCode());
        hashCode = prime * hashCode + ((getHasMoreApplications() == null) ? 0 : getHasMoreApplications().hashCode());
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
