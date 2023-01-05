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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteReportPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReportPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     */
    private String reportPlanName;

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of a report plan.
     */

    public void setReportPlanName(String reportPlanName) {
        this.reportPlanName = reportPlanName;
    }

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @return The unique name of a report plan.
     */

    public String getReportPlanName() {
        return this.reportPlanName;
    }

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of a report plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReportPlanRequest withReportPlanName(String reportPlanName) {
        setReportPlanName(reportPlanName);
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
        if (getReportPlanName() != null)
            sb.append("ReportPlanName: ").append(getReportPlanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReportPlanRequest == false)
            return false;
        DeleteReportPlanRequest other = (DeleteReportPlanRequest) obj;
        if (other.getReportPlanName() == null ^ this.getReportPlanName() == null)
            return false;
        if (other.getReportPlanName() != null && other.getReportPlanName().equals(this.getReportPlanName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportPlanName() == null) ? 0 : getReportPlanName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReportPlanRequest clone() {
        return (DeleteReportPlanRequest) super.clone();
    }

}
