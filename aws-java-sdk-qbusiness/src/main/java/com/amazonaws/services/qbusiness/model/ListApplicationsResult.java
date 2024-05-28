/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListApplications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     * request to retrieve the next set of applications.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of summary information on the configuration of one or more Amazon Q Business applications.
     * </p>
     */
    private java.util.List<Application> applications;

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     * request to retrieve the next set of applications.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     *        request to retrieve the next set of applications.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     * request to retrieve the next set of applications.
     * </p>
     * 
     * @return If the response is truncated, Amazon Q Business returns this token. You can use this token in a
     *         subsequent request to retrieve the next set of applications.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     * request to retrieve the next set of applications.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token. You can use this token in a subsequent
     *        request to retrieve the next set of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of summary information on the configuration of one or more Amazon Q Business applications.
     * </p>
     * 
     * @return An array of summary information on the configuration of one or more Amazon Q Business applications.
     */

    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * An array of summary information on the configuration of one or more Amazon Q Business applications.
     * </p>
     * 
     * @param applications
     *        An array of summary information on the configuration of one or more Amazon Q Business applications.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<Application>(applications);
    }

    /**
     * <p>
     * An array of summary information on the configuration of one or more Amazon Q Business applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        An array of summary information on the configuration of one or more Amazon Q Business applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information on the configuration of one or more Amazon Q Business applications.
     * </p>
     * 
     * @param applications
     *        An array of summary information on the configuration of one or more Amazon Q Business applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsResult withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
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
