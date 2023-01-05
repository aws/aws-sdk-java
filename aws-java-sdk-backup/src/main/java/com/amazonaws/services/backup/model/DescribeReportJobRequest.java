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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeReportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. The report job ID cannot be edited.
     * </p>
     */
    private String reportJobId;

    /**
     * <p>
     * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. The report job ID cannot be edited.
     * </p>
     * 
     * @param reportJobId
     *        The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *        most 1,024 bytes long. The report job ID cannot be edited.
     */

    public void setReportJobId(String reportJobId) {
        this.reportJobId = reportJobId;
    }

    /**
     * <p>
     * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. The report job ID cannot be edited.
     * </p>
     * 
     * @return The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *         most 1,024 bytes long. The report job ID cannot be edited.
     */

    public String getReportJobId() {
        return this.reportJobId;
    }

    /**
     * <p>
     * The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most
     * 1,024 bytes long. The report job ID cannot be edited.
     * </p>
     * 
     * @param reportJobId
     *        The identifier of the report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at
     *        most 1,024 bytes long. The report job ID cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReportJobRequest withReportJobId(String reportJobId) {
        setReportJobId(reportJobId);
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
        if (getReportJobId() != null)
            sb.append("ReportJobId: ").append(getReportJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReportJobRequest == false)
            return false;
        DescribeReportJobRequest other = (DescribeReportJobRequest) obj;
        if (other.getReportJobId() == null ^ this.getReportJobId() == null)
            return false;
        if (other.getReportJobId() != null && other.getReportJobId().equals(this.getReportJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportJobId() == null) ? 0 : getReportJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReportJobRequest clone() {
        return (DescribeReportJobRequest) super.clone();
    }

}
