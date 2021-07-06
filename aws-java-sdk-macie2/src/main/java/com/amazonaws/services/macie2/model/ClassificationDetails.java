/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a sensitive data finding, including the classification job that produced the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ClassificationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for
     * the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder.
     * Otherwise, this value is the path to a file.
     * </p>
     */
    private String detailedResultsLocation;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced the finding.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The unique identifier for the classification job that produced the finding.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status and other details of the finding.
     * </p>
     */
    private ClassificationResult result;

    /**
     * <p>
     * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for
     * the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder.
     * Otherwise, this value is the path to a file.
     * </p>
     * 
     * @param detailedResultsLocation
     *        The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery
     *        result for the finding. If a finding applies to a large archive or compressed file, this value is the path
     *        to a folder. Otherwise, this value is the path to a file.
     */

    public void setDetailedResultsLocation(String detailedResultsLocation) {
        this.detailedResultsLocation = detailedResultsLocation;
    }

    /**
     * <p>
     * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for
     * the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder.
     * Otherwise, this value is the path to a file.
     * </p>
     * 
     * @return The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery
     *         result for the finding. If a finding applies to a large archive or compressed file, this value is the
     *         path to a folder. Otherwise, this value is the path to a file.
     */

    public String getDetailedResultsLocation() {
        return this.detailedResultsLocation;
    }

    /**
     * <p>
     * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for
     * the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder.
     * Otherwise, this value is the path to a file.
     * </p>
     * 
     * @param detailedResultsLocation
     *        The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery
     *        result for the finding. If a finding applies to a large archive or compressed file, this value is the path
     *        to a folder. Otherwise, this value is the path to a file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationDetails withDetailedResultsLocation(String detailedResultsLocation) {
        setDetailedResultsLocation(detailedResultsLocation);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced the finding.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the classification job that produced the finding.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced the finding.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the classification job that produced the finding.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the classification job that produced the finding.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the classification job that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationDetails withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the finding.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job that produced the finding.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the finding.
     * </p>
     * 
     * @return The unique identifier for the classification job that produced the finding.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier for the classification job that produced the finding.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the classification job that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationDetails withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status and other details of the finding.
     * </p>
     * 
     * @param result
     *        The status and other details of the finding.
     */

    public void setResult(ClassificationResult result) {
        this.result = result;
    }

    /**
     * <p>
     * The status and other details of the finding.
     * </p>
     * 
     * @return The status and other details of the finding.
     */

    public ClassificationResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * The status and other details of the finding.
     * </p>
     * 
     * @param result
     *        The status and other details of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationDetails withResult(ClassificationResult result) {
        setResult(result);
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
        if (getDetailedResultsLocation() != null)
            sb.append("DetailedResultsLocation: ").append(getDetailedResultsLocation()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationDetails == false)
            return false;
        ClassificationDetails other = (ClassificationDetails) obj;
        if (other.getDetailedResultsLocation() == null ^ this.getDetailedResultsLocation() == null)
            return false;
        if (other.getDetailedResultsLocation() != null && other.getDetailedResultsLocation().equals(this.getDetailedResultsLocation()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedResultsLocation() == null) ? 0 : getDetailedResultsLocation().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationDetails clone() {
        try {
            return (ClassificationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ClassificationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
