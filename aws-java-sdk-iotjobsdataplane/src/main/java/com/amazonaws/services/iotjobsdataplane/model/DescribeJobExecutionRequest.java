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
package com.amazonaws.services.iotjobsdataplane.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/DescribeJobExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The thing name associated with the device the job execution is running on.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     */
    private Boolean includeJobDocument;
    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device. If not specified, the
     * latest job execution is returned.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobExecutionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The thing name associated with the device the job execution is running on.
     * </p>
     * 
     * @param thingName
     *        The thing name associated with the device the job execution is running on.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name associated with the device the job execution is running on.
     * </p>
     * 
     * @return The thing name associated with the device the job execution is running on.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The thing name associated with the device the job execution is running on.
     * </p>
     * 
     * @param thingName
     *        The thing name associated with the device the job execution is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobExecutionRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @param includeJobDocument
     *        Optional. When set to true, the response contains the job document. The default is false.
     */

    public void setIncludeJobDocument(Boolean includeJobDocument) {
        this.includeJobDocument = includeJobDocument;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @return Optional. When set to true, the response contains the job document. The default is false.
     */

    public Boolean getIncludeJobDocument() {
        return this.includeJobDocument;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @param includeJobDocument
     *        Optional. When set to true, the response contains the job document. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobExecutionRequest withIncludeJobDocument(Boolean includeJobDocument) {
        setIncludeJobDocument(includeJobDocument);
        return this;
    }

    /**
     * <p>
     * Optional. When set to true, the response contains the job document. The default is false.
     * </p>
     * 
     * @return Optional. When set to true, the response contains the job document. The default is false.
     */

    public Boolean isIncludeJobDocument() {
        return this.includeJobDocument;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device. If not specified, the
     * latest job execution is returned.
     * </p>
     * 
     * @param executionNumber
     *        Optional. A number that identifies a particular job execution on a particular device. If not specified,
     *        the latest job execution is returned.
     */

    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device. If not specified, the
     * latest job execution is returned.
     * </p>
     * 
     * @return Optional. A number that identifies a particular job execution on a particular device. If not specified,
     *         the latest job execution is returned.
     */

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    /**
     * <p>
     * Optional. A number that identifies a particular job execution on a particular device. If not specified, the
     * latest job execution is returned.
     * </p>
     * 
     * @param executionNumber
     *        Optional. A number that identifies a particular job execution on a particular device. If not specified,
     *        the latest job execution is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobExecutionRequest withExecutionNumber(Long executionNumber) {
        setExecutionNumber(executionNumber);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getIncludeJobDocument() != null)
            sb.append("IncludeJobDocument: ").append(getIncludeJobDocument()).append(",");
        if (getExecutionNumber() != null)
            sb.append("ExecutionNumber: ").append(getExecutionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobExecutionRequest == false)
            return false;
        DescribeJobExecutionRequest other = (DescribeJobExecutionRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getIncludeJobDocument() == null ^ this.getIncludeJobDocument() == null)
            return false;
        if (other.getIncludeJobDocument() != null && other.getIncludeJobDocument().equals(this.getIncludeJobDocument()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getIncludeJobDocument() == null) ? 0 : getIncludeJobDocument().hashCode());
        hashCode = prime * hashCode + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobExecutionRequest clone() {
        return (DescribeJobExecutionRequest) super.clone();
    }

}
