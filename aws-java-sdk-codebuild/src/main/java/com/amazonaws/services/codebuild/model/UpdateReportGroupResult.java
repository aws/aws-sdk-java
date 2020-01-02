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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateReportGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     */
    private ReportGroup reportGroup;

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     * 
     * @param reportGroup
     *        Information about the updated report group.
     */

    public void setReportGroup(ReportGroup reportGroup) {
        this.reportGroup = reportGroup;
    }

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     * 
     * @return Information about the updated report group.
     */

    public ReportGroup getReportGroup() {
        return this.reportGroup;
    }

    /**
     * <p>
     * Information about the updated report group.
     * </p>
     * 
     * @param reportGroup
     *        Information about the updated report group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportGroupResult withReportGroup(ReportGroup reportGroup) {
        setReportGroup(reportGroup);
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
        if (getReportGroup() != null)
            sb.append("ReportGroup: ").append(getReportGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportGroupResult == false)
            return false;
        UpdateReportGroupResult other = (UpdateReportGroupResult) obj;
        if (other.getReportGroup() == null ^ this.getReportGroup() == null)
            return false;
        if (other.getReportGroup() != null && other.getReportGroup().equals(this.getReportGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportGroup() == null) ? 0 : getReportGroup().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReportGroupResult clone() {
        try {
            return (UpdateReportGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
