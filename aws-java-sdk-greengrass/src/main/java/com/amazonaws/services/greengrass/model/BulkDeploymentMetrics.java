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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Relevant metrics on input records processed during bulk deployment.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/BulkDeploymentMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkDeploymentMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * The total number of records that returned a non-retryable error. For example, this can occur if a group record
     * from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role
     * doesn't grant permission to deploy a group or group version.
     */
    private Integer invalidInputRecords;
    /** The total number of group records from the input file that have been processed so far, or attempted. */
    private Integer recordsProcessed;
    /**
     * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the
     * attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to
     * five times.
     */
    private Integer retryAttempts;

    /**
     * The total number of records that returned a non-retryable error. For example, this can occur if a group record
     * from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role
     * doesn't grant permission to deploy a group or group version.
     * 
     * @param invalidInputRecords
     *        The total number of records that returned a non-retryable error. For example, this can occur if a group
     *        record from the input file uses an invalid format or specifies a nonexistent group version, or if the
     *        execution role doesn't grant permission to deploy a group or group version.
     */

    public void setInvalidInputRecords(Integer invalidInputRecords) {
        this.invalidInputRecords = invalidInputRecords;
    }

    /**
     * The total number of records that returned a non-retryable error. For example, this can occur if a group record
     * from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role
     * doesn't grant permission to deploy a group or group version.
     * 
     * @return The total number of records that returned a non-retryable error. For example, this can occur if a group
     *         record from the input file uses an invalid format or specifies a nonexistent group version, or if the
     *         execution role doesn't grant permission to deploy a group or group version.
     */

    public Integer getInvalidInputRecords() {
        return this.invalidInputRecords;
    }

    /**
     * The total number of records that returned a non-retryable error. For example, this can occur if a group record
     * from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role
     * doesn't grant permission to deploy a group or group version.
     * 
     * @param invalidInputRecords
     *        The total number of records that returned a non-retryable error. For example, this can occur if a group
     *        record from the input file uses an invalid format or specifies a nonexistent group version, or if the
     *        execution role doesn't grant permission to deploy a group or group version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentMetrics withInvalidInputRecords(Integer invalidInputRecords) {
        setInvalidInputRecords(invalidInputRecords);
        return this;
    }

    /**
     * The total number of group records from the input file that have been processed so far, or attempted.
     * 
     * @param recordsProcessed
     *        The total number of group records from the input file that have been processed so far, or attempted.
     */

    public void setRecordsProcessed(Integer recordsProcessed) {
        this.recordsProcessed = recordsProcessed;
    }

    /**
     * The total number of group records from the input file that have been processed so far, or attempted.
     * 
     * @return The total number of group records from the input file that have been processed so far, or attempted.
     */

    public Integer getRecordsProcessed() {
        return this.recordsProcessed;
    }

    /**
     * The total number of group records from the input file that have been processed so far, or attempted.
     * 
     * @param recordsProcessed
     *        The total number of group records from the input file that have been processed so far, or attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentMetrics withRecordsProcessed(Integer recordsProcessed) {
        setRecordsProcessed(recordsProcessed);
        return this;
    }

    /**
     * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the
     * attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to
     * five times.
     * 
     * @param retryAttempts
     *        The total number of deployment attempts that returned a retryable error. For example, a retry is triggered
     *        if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group
     *        deployment up to five times.
     */

    public void setRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    /**
     * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the
     * attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to
     * five times.
     * 
     * @return The total number of deployment attempts that returned a retryable error. For example, a retry is
     *         triggered if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a
     *         group deployment up to five times.
     */

    public Integer getRetryAttempts() {
        return this.retryAttempts;
    }

    /**
     * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the
     * attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to
     * five times.
     * 
     * @param retryAttempts
     *        The total number of deployment attempts that returned a retryable error. For example, a retry is triggered
     *        if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group
     *        deployment up to five times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeploymentMetrics withRetryAttempts(Integer retryAttempts) {
        setRetryAttempts(retryAttempts);
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
        if (getInvalidInputRecords() != null)
            sb.append("InvalidInputRecords: ").append(getInvalidInputRecords()).append(",");
        if (getRecordsProcessed() != null)
            sb.append("RecordsProcessed: ").append(getRecordsProcessed()).append(",");
        if (getRetryAttempts() != null)
            sb.append("RetryAttempts: ").append(getRetryAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkDeploymentMetrics == false)
            return false;
        BulkDeploymentMetrics other = (BulkDeploymentMetrics) obj;
        if (other.getInvalidInputRecords() == null ^ this.getInvalidInputRecords() == null)
            return false;
        if (other.getInvalidInputRecords() != null && other.getInvalidInputRecords().equals(this.getInvalidInputRecords()) == false)
            return false;
        if (other.getRecordsProcessed() == null ^ this.getRecordsProcessed() == null)
            return false;
        if (other.getRecordsProcessed() != null && other.getRecordsProcessed().equals(this.getRecordsProcessed()) == false)
            return false;
        if (other.getRetryAttempts() == null ^ this.getRetryAttempts() == null)
            return false;
        if (other.getRetryAttempts() != null && other.getRetryAttempts().equals(this.getRetryAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidInputRecords() == null) ? 0 : getInvalidInputRecords().hashCode());
        hashCode = prime * hashCode + ((getRecordsProcessed() == null) ? 0 : getRecordsProcessed().hashCode());
        hashCode = prime * hashCode + ((getRetryAttempts() == null) ? 0 : getRetryAttempts().hashCode());
        return hashCode;
    }

    @Override
    public BulkDeploymentMetrics clone() {
        try {
            return (BulkDeploymentMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.BulkDeploymentMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
