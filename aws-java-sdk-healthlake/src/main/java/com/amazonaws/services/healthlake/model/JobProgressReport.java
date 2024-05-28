/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The progress report of an import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/JobProgressReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobProgressReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of files scanned from input S3 bucket.
     * </p>
     */
    private Long totalNumberOfScannedFiles;
    /**
     * <p>
     * The size (in MB) of the files scanned from the input S3 bucket.
     * </p>
     */
    private Double totalSizeOfScannedFilesInMB;
    /**
     * <p>
     * The number of files imported so far.
     * </p>
     */
    private Long totalNumberOfImportedFiles;
    /**
     * <p>
     * The number of resources scanned from the input S3 bucket.
     * </p>
     */
    private Long totalNumberOfResourcesScanned;
    /**
     * <p>
     * The number of resources imported so far.
     * </p>
     */
    private Long totalNumberOfResourcesImported;
    /**
     * <p>
     * The number of resources that failed due to customer error.
     * </p>
     */
    private Long totalNumberOfResourcesWithCustomerError;
    /**
     * <p>
     * The number of files that failed to be read from the input S3 bucket due to customer error.
     * </p>
     */
    private Long totalNumberOfFilesReadWithCustomerError;
    /**
     * <p>
     * The throughput (in MB/sec) of the import job.
     * </p>
     */
    private Double throughput;

    /**
     * <p>
     * The number of files scanned from input S3 bucket.
     * </p>
     * 
     * @param totalNumberOfScannedFiles
     *        The number of files scanned from input S3 bucket.
     */

    public void setTotalNumberOfScannedFiles(Long totalNumberOfScannedFiles) {
        this.totalNumberOfScannedFiles = totalNumberOfScannedFiles;
    }

    /**
     * <p>
     * The number of files scanned from input S3 bucket.
     * </p>
     * 
     * @return The number of files scanned from input S3 bucket.
     */

    public Long getTotalNumberOfScannedFiles() {
        return this.totalNumberOfScannedFiles;
    }

    /**
     * <p>
     * The number of files scanned from input S3 bucket.
     * </p>
     * 
     * @param totalNumberOfScannedFiles
     *        The number of files scanned from input S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfScannedFiles(Long totalNumberOfScannedFiles) {
        setTotalNumberOfScannedFiles(totalNumberOfScannedFiles);
        return this;
    }

    /**
     * <p>
     * The size (in MB) of the files scanned from the input S3 bucket.
     * </p>
     * 
     * @param totalSizeOfScannedFilesInMB
     *        The size (in MB) of the files scanned from the input S3 bucket.
     */

    public void setTotalSizeOfScannedFilesInMB(Double totalSizeOfScannedFilesInMB) {
        this.totalSizeOfScannedFilesInMB = totalSizeOfScannedFilesInMB;
    }

    /**
     * <p>
     * The size (in MB) of the files scanned from the input S3 bucket.
     * </p>
     * 
     * @return The size (in MB) of the files scanned from the input S3 bucket.
     */

    public Double getTotalSizeOfScannedFilesInMB() {
        return this.totalSizeOfScannedFilesInMB;
    }

    /**
     * <p>
     * The size (in MB) of the files scanned from the input S3 bucket.
     * </p>
     * 
     * @param totalSizeOfScannedFilesInMB
     *        The size (in MB) of the files scanned from the input S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalSizeOfScannedFilesInMB(Double totalSizeOfScannedFilesInMB) {
        setTotalSizeOfScannedFilesInMB(totalSizeOfScannedFilesInMB);
        return this;
    }

    /**
     * <p>
     * The number of files imported so far.
     * </p>
     * 
     * @param totalNumberOfImportedFiles
     *        The number of files imported so far.
     */

    public void setTotalNumberOfImportedFiles(Long totalNumberOfImportedFiles) {
        this.totalNumberOfImportedFiles = totalNumberOfImportedFiles;
    }

    /**
     * <p>
     * The number of files imported so far.
     * </p>
     * 
     * @return The number of files imported so far.
     */

    public Long getTotalNumberOfImportedFiles() {
        return this.totalNumberOfImportedFiles;
    }

    /**
     * <p>
     * The number of files imported so far.
     * </p>
     * 
     * @param totalNumberOfImportedFiles
     *        The number of files imported so far.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfImportedFiles(Long totalNumberOfImportedFiles) {
        setTotalNumberOfImportedFiles(totalNumberOfImportedFiles);
        return this;
    }

    /**
     * <p>
     * The number of resources scanned from the input S3 bucket.
     * </p>
     * 
     * @param totalNumberOfResourcesScanned
     *        The number of resources scanned from the input S3 bucket.
     */

    public void setTotalNumberOfResourcesScanned(Long totalNumberOfResourcesScanned) {
        this.totalNumberOfResourcesScanned = totalNumberOfResourcesScanned;
    }

    /**
     * <p>
     * The number of resources scanned from the input S3 bucket.
     * </p>
     * 
     * @return The number of resources scanned from the input S3 bucket.
     */

    public Long getTotalNumberOfResourcesScanned() {
        return this.totalNumberOfResourcesScanned;
    }

    /**
     * <p>
     * The number of resources scanned from the input S3 bucket.
     * </p>
     * 
     * @param totalNumberOfResourcesScanned
     *        The number of resources scanned from the input S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfResourcesScanned(Long totalNumberOfResourcesScanned) {
        setTotalNumberOfResourcesScanned(totalNumberOfResourcesScanned);
        return this;
    }

    /**
     * <p>
     * The number of resources imported so far.
     * </p>
     * 
     * @param totalNumberOfResourcesImported
     *        The number of resources imported so far.
     */

    public void setTotalNumberOfResourcesImported(Long totalNumberOfResourcesImported) {
        this.totalNumberOfResourcesImported = totalNumberOfResourcesImported;
    }

    /**
     * <p>
     * The number of resources imported so far.
     * </p>
     * 
     * @return The number of resources imported so far.
     */

    public Long getTotalNumberOfResourcesImported() {
        return this.totalNumberOfResourcesImported;
    }

    /**
     * <p>
     * The number of resources imported so far.
     * </p>
     * 
     * @param totalNumberOfResourcesImported
     *        The number of resources imported so far.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfResourcesImported(Long totalNumberOfResourcesImported) {
        setTotalNumberOfResourcesImported(totalNumberOfResourcesImported);
        return this;
    }

    /**
     * <p>
     * The number of resources that failed due to customer error.
     * </p>
     * 
     * @param totalNumberOfResourcesWithCustomerError
     *        The number of resources that failed due to customer error.
     */

    public void setTotalNumberOfResourcesWithCustomerError(Long totalNumberOfResourcesWithCustomerError) {
        this.totalNumberOfResourcesWithCustomerError = totalNumberOfResourcesWithCustomerError;
    }

    /**
     * <p>
     * The number of resources that failed due to customer error.
     * </p>
     * 
     * @return The number of resources that failed due to customer error.
     */

    public Long getTotalNumberOfResourcesWithCustomerError() {
        return this.totalNumberOfResourcesWithCustomerError;
    }

    /**
     * <p>
     * The number of resources that failed due to customer error.
     * </p>
     * 
     * @param totalNumberOfResourcesWithCustomerError
     *        The number of resources that failed due to customer error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfResourcesWithCustomerError(Long totalNumberOfResourcesWithCustomerError) {
        setTotalNumberOfResourcesWithCustomerError(totalNumberOfResourcesWithCustomerError);
        return this;
    }

    /**
     * <p>
     * The number of files that failed to be read from the input S3 bucket due to customer error.
     * </p>
     * 
     * @param totalNumberOfFilesReadWithCustomerError
     *        The number of files that failed to be read from the input S3 bucket due to customer error.
     */

    public void setTotalNumberOfFilesReadWithCustomerError(Long totalNumberOfFilesReadWithCustomerError) {
        this.totalNumberOfFilesReadWithCustomerError = totalNumberOfFilesReadWithCustomerError;
    }

    /**
     * <p>
     * The number of files that failed to be read from the input S3 bucket due to customer error.
     * </p>
     * 
     * @return The number of files that failed to be read from the input S3 bucket due to customer error.
     */

    public Long getTotalNumberOfFilesReadWithCustomerError() {
        return this.totalNumberOfFilesReadWithCustomerError;
    }

    /**
     * <p>
     * The number of files that failed to be read from the input S3 bucket due to customer error.
     * </p>
     * 
     * @param totalNumberOfFilesReadWithCustomerError
     *        The number of files that failed to be read from the input S3 bucket due to customer error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withTotalNumberOfFilesReadWithCustomerError(Long totalNumberOfFilesReadWithCustomerError) {
        setTotalNumberOfFilesReadWithCustomerError(totalNumberOfFilesReadWithCustomerError);
        return this;
    }

    /**
     * <p>
     * The throughput (in MB/sec) of the import job.
     * </p>
     * 
     * @param throughput
     *        The throughput (in MB/sec) of the import job.
     */

    public void setThroughput(Double throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The throughput (in MB/sec) of the import job.
     * </p>
     * 
     * @return The throughput (in MB/sec) of the import job.
     */

    public Double getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The throughput (in MB/sec) of the import job.
     * </p>
     * 
     * @param throughput
     *        The throughput (in MB/sec) of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressReport withThroughput(Double throughput) {
        setThroughput(throughput);
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
        if (getTotalNumberOfScannedFiles() != null)
            sb.append("TotalNumberOfScannedFiles: ").append(getTotalNumberOfScannedFiles()).append(",");
        if (getTotalSizeOfScannedFilesInMB() != null)
            sb.append("TotalSizeOfScannedFilesInMB: ").append(getTotalSizeOfScannedFilesInMB()).append(",");
        if (getTotalNumberOfImportedFiles() != null)
            sb.append("TotalNumberOfImportedFiles: ").append(getTotalNumberOfImportedFiles()).append(",");
        if (getTotalNumberOfResourcesScanned() != null)
            sb.append("TotalNumberOfResourcesScanned: ").append(getTotalNumberOfResourcesScanned()).append(",");
        if (getTotalNumberOfResourcesImported() != null)
            sb.append("TotalNumberOfResourcesImported: ").append(getTotalNumberOfResourcesImported()).append(",");
        if (getTotalNumberOfResourcesWithCustomerError() != null)
            sb.append("TotalNumberOfResourcesWithCustomerError: ").append(getTotalNumberOfResourcesWithCustomerError()).append(",");
        if (getTotalNumberOfFilesReadWithCustomerError() != null)
            sb.append("TotalNumberOfFilesReadWithCustomerError: ").append(getTotalNumberOfFilesReadWithCustomerError()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobProgressReport == false)
            return false;
        JobProgressReport other = (JobProgressReport) obj;
        if (other.getTotalNumberOfScannedFiles() == null ^ this.getTotalNumberOfScannedFiles() == null)
            return false;
        if (other.getTotalNumberOfScannedFiles() != null && other.getTotalNumberOfScannedFiles().equals(this.getTotalNumberOfScannedFiles()) == false)
            return false;
        if (other.getTotalSizeOfScannedFilesInMB() == null ^ this.getTotalSizeOfScannedFilesInMB() == null)
            return false;
        if (other.getTotalSizeOfScannedFilesInMB() != null && other.getTotalSizeOfScannedFilesInMB().equals(this.getTotalSizeOfScannedFilesInMB()) == false)
            return false;
        if (other.getTotalNumberOfImportedFiles() == null ^ this.getTotalNumberOfImportedFiles() == null)
            return false;
        if (other.getTotalNumberOfImportedFiles() != null && other.getTotalNumberOfImportedFiles().equals(this.getTotalNumberOfImportedFiles()) == false)
            return false;
        if (other.getTotalNumberOfResourcesScanned() == null ^ this.getTotalNumberOfResourcesScanned() == null)
            return false;
        if (other.getTotalNumberOfResourcesScanned() != null
                && other.getTotalNumberOfResourcesScanned().equals(this.getTotalNumberOfResourcesScanned()) == false)
            return false;
        if (other.getTotalNumberOfResourcesImported() == null ^ this.getTotalNumberOfResourcesImported() == null)
            return false;
        if (other.getTotalNumberOfResourcesImported() != null
                && other.getTotalNumberOfResourcesImported().equals(this.getTotalNumberOfResourcesImported()) == false)
            return false;
        if (other.getTotalNumberOfResourcesWithCustomerError() == null ^ this.getTotalNumberOfResourcesWithCustomerError() == null)
            return false;
        if (other.getTotalNumberOfResourcesWithCustomerError() != null
                && other.getTotalNumberOfResourcesWithCustomerError().equals(this.getTotalNumberOfResourcesWithCustomerError()) == false)
            return false;
        if (other.getTotalNumberOfFilesReadWithCustomerError() == null ^ this.getTotalNumberOfFilesReadWithCustomerError() == null)
            return false;
        if (other.getTotalNumberOfFilesReadWithCustomerError() != null
                && other.getTotalNumberOfFilesReadWithCustomerError().equals(this.getTotalNumberOfFilesReadWithCustomerError()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfScannedFiles() == null) ? 0 : getTotalNumberOfScannedFiles().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeOfScannedFilesInMB() == null) ? 0 : getTotalSizeOfScannedFilesInMB().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfImportedFiles() == null) ? 0 : getTotalNumberOfImportedFiles().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfResourcesScanned() == null) ? 0 : getTotalNumberOfResourcesScanned().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfResourcesImported() == null) ? 0 : getTotalNumberOfResourcesImported().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfResourcesWithCustomerError() == null) ? 0 : getTotalNumberOfResourcesWithCustomerError().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfFilesReadWithCustomerError() == null) ? 0 : getTotalNumberOfFilesReadWithCustomerError().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        return hashCode;
    }

    @Override
    public JobProgressReport clone() {
        try {
            return (JobProgressReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.JobProgressReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
