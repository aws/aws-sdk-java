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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateReportPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the report plan.
     * </p>
     */
    private String reportPlanName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String reportPlanArn;
    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The unique name of the report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan.
     */

    public void setReportPlanName(String reportPlanName) {
        this.reportPlanName = reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan.
     * </p>
     * 
     * @return The unique name of the report plan.
     */

    public String getReportPlanName() {
        return this.reportPlanName;
    }

    /**
     * <p>
     * The unique name of the report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of the report plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanResult withReportPlanName(String reportPlanName) {
        setReportPlanName(reportPlanName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param reportPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setReportPlanArn(String reportPlanArn) {
        this.reportPlanArn = reportPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getReportPlanArn() {
        return this.reportPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param reportPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanResult withReportPlanArn(String reportPlanArn) {
        setReportPlanArn(reportPlanArn);
        return this;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReportPlanResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
            sb.append("ReportPlanName: ").append(getReportPlanName()).append(",");
        if (getReportPlanArn() != null)
            sb.append("ReportPlanArn: ").append(getReportPlanArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportPlanResult == false)
            return false;
        UpdateReportPlanResult other = (UpdateReportPlanResult) obj;
        if (other.getReportPlanName() == null ^ this.getReportPlanName() == null)
            return false;
        if (other.getReportPlanName() != null && other.getReportPlanName().equals(this.getReportPlanName()) == false)
            return false;
        if (other.getReportPlanArn() == null ^ this.getReportPlanArn() == null)
            return false;
        if (other.getReportPlanArn() != null && other.getReportPlanArn().equals(this.getReportPlanArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportPlanName() == null) ? 0 : getReportPlanName().hashCode());
        hashCode = prime * hashCode + ((getReportPlanArn() == null) ? 0 : getReportPlanArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReportPlanResult clone() {
        try {
            return (UpdateReportPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
