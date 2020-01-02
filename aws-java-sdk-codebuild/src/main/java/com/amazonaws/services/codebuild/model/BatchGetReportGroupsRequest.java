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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReportGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetReportGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of report group ARNs that identify the report groups to return.
     * </p>
     */
    private java.util.List<String> reportGroupArns;

    /**
     * <p>
     * An array of report group ARNs that identify the report groups to return.
     * </p>
     * 
     * @return An array of report group ARNs that identify the report groups to return.
     */

    public java.util.List<String> getReportGroupArns() {
        return reportGroupArns;
    }

    /**
     * <p>
     * An array of report group ARNs that identify the report groups to return.
     * </p>
     * 
     * @param reportGroupArns
     *        An array of report group ARNs that identify the report groups to return.
     */

    public void setReportGroupArns(java.util.Collection<String> reportGroupArns) {
        if (reportGroupArns == null) {
            this.reportGroupArns = null;
            return;
        }

        this.reportGroupArns = new java.util.ArrayList<String>(reportGroupArns);
    }

    /**
     * <p>
     * An array of report group ARNs that identify the report groups to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportGroupArns(java.util.Collection)} or {@link #withReportGroupArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reportGroupArns
     *        An array of report group ARNs that identify the report groups to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsRequest withReportGroupArns(String... reportGroupArns) {
        if (this.reportGroupArns == null) {
            setReportGroupArns(new java.util.ArrayList<String>(reportGroupArns.length));
        }
        for (String ele : reportGroupArns) {
            this.reportGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of report group ARNs that identify the report groups to return.
     * </p>
     * 
     * @param reportGroupArns
     *        An array of report group ARNs that identify the report groups to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsRequest withReportGroupArns(java.util.Collection<String> reportGroupArns) {
        setReportGroupArns(reportGroupArns);
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
        if (getReportGroupArns() != null)
            sb.append("ReportGroupArns: ").append(getReportGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportGroupsRequest == false)
            return false;
        BatchGetReportGroupsRequest other = (BatchGetReportGroupsRequest) obj;
        if (other.getReportGroupArns() == null ^ this.getReportGroupArns() == null)
            return false;
        if (other.getReportGroupArns() != null && other.getReportGroupArns().equals(this.getReportGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportGroupArns() == null) ? 0 : getReportGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetReportGroupsRequest clone() {
        return (BatchGetReportGroupsRequest) super.clone();
    }

}
