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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingRegistrationTaskReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Links to the task resources.
     * </p>
     */
    private java.util.List<String> resourceLinks;
    /**
     * <p>
     * The type of task report.
     * </p>
     */
    private String reportType;
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * 
     * @return Links to the task resources.
     */

    public java.util.List<String> getResourceLinks() {
        return resourceLinks;
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * 
     * @param resourceLinks
     *        Links to the task resources.
     */

    public void setResourceLinks(java.util.Collection<String> resourceLinks) {
        if (resourceLinks == null) {
            this.resourceLinks = null;
            return;
        }

        this.resourceLinks = new java.util.ArrayList<String>(resourceLinks);
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceLinks(java.util.Collection)} or {@link #withResourceLinks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceLinks
     *        Links to the task resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsResult withResourceLinks(String... resourceLinks) {
        if (this.resourceLinks == null) {
            setResourceLinks(new java.util.ArrayList<String>(resourceLinks.length));
        }
        for (String ele : resourceLinks) {
            this.resourceLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Links to the task resources.
     * </p>
     * 
     * @param resourceLinks
     *        Links to the task resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsResult withResourceLinks(java.util.Collection<String> resourceLinks) {
        setResourceLinks(resourceLinks);
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @see ReportType
     */

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @return The type of task report.
     * @see ReportType
     */

    public String getReportType() {
        return this.reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ListThingRegistrationTaskReportsResult withReportType(String reportType) {
        setReportType(reportType);
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * 
     * @param reportType
     *        The type of task report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public ListThingRegistrationTaskReportsResult withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTaskReportsResult withNextToken(String nextToken) {
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
        if (getResourceLinks() != null)
            sb.append("ResourceLinks: ").append(getResourceLinks()).append(",");
        if (getReportType() != null)
            sb.append("ReportType: ").append(getReportType()).append(",");
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

        if (obj instanceof ListThingRegistrationTaskReportsResult == false)
            return false;
        ListThingRegistrationTaskReportsResult other = (ListThingRegistrationTaskReportsResult) obj;
        if (other.getResourceLinks() == null ^ this.getResourceLinks() == null)
            return false;
        if (other.getResourceLinks() != null && other.getResourceLinks().equals(this.getResourceLinks()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null && other.getReportType().equals(this.getReportType()) == false)
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

        hashCode = prime * hashCode + ((getResourceLinks() == null) ? 0 : getResourceLinks().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThingRegistrationTaskReportsResult clone() {
        try {
            return (ListThingRegistrationTaskReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
