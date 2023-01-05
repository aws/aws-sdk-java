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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a job summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param id
     *        The ID of the job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @return The ID of the job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param id
     *        The ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @param name
     *        The unique name that helps identify the job request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @return The unique name that helps identify the job request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @param name
     *        The unique name that helps identify the job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the bulk import job can be one of following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> – The bulk import job has been canceled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *         use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *         with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *         issues.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(JobStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public JobSummary clone() {
        try {
            return (JobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
