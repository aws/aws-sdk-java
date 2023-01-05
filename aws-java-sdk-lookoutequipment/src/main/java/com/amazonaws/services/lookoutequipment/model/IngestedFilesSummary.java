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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gives statistics about how many files have been ingested, and which files have not been ingested, for a particular
 * ingestion job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/IngestedFilesSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestedFilesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the total number of files that were submitted for ingestion.
     * </p>
     */
    private Integer totalNumberOfFiles;
    /**
     * <p>
     * Indicates the number of files that were successfully ingested.
     * </p>
     */
    private Integer ingestedNumberOfFiles;
    /**
     * <p>
     * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for
     * example, a jpg or pdf) or not readable.
     * </p>
     */
    private java.util.List<S3Object> discardedFiles;

    /**
     * <p>
     * Indicates the total number of files that were submitted for ingestion.
     * </p>
     * 
     * @param totalNumberOfFiles
     *        Indicates the total number of files that were submitted for ingestion.
     */

    public void setTotalNumberOfFiles(Integer totalNumberOfFiles) {
        this.totalNumberOfFiles = totalNumberOfFiles;
    }

    /**
     * <p>
     * Indicates the total number of files that were submitted for ingestion.
     * </p>
     * 
     * @return Indicates the total number of files that were submitted for ingestion.
     */

    public Integer getTotalNumberOfFiles() {
        return this.totalNumberOfFiles;
    }

    /**
     * <p>
     * Indicates the total number of files that were submitted for ingestion.
     * </p>
     * 
     * @param totalNumberOfFiles
     *        Indicates the total number of files that were submitted for ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedFilesSummary withTotalNumberOfFiles(Integer totalNumberOfFiles) {
        setTotalNumberOfFiles(totalNumberOfFiles);
        return this;
    }

    /**
     * <p>
     * Indicates the number of files that were successfully ingested.
     * </p>
     * 
     * @param ingestedNumberOfFiles
     *        Indicates the number of files that were successfully ingested.
     */

    public void setIngestedNumberOfFiles(Integer ingestedNumberOfFiles) {
        this.ingestedNumberOfFiles = ingestedNumberOfFiles;
    }

    /**
     * <p>
     * Indicates the number of files that were successfully ingested.
     * </p>
     * 
     * @return Indicates the number of files that were successfully ingested.
     */

    public Integer getIngestedNumberOfFiles() {
        return this.ingestedNumberOfFiles;
    }

    /**
     * <p>
     * Indicates the number of files that were successfully ingested.
     * </p>
     * 
     * @param ingestedNumberOfFiles
     *        Indicates the number of files that were successfully ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedFilesSummary withIngestedNumberOfFiles(Integer ingestedNumberOfFiles) {
        setIngestedNumberOfFiles(ingestedNumberOfFiles);
        return this;
    }

    /**
     * <p>
     * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for
     * example, a jpg or pdf) or not readable.
     * </p>
     * 
     * @return Indicates the number of files that were discarded. A file could be discarded because its format is
     *         invalid (for example, a jpg or pdf) or not readable.
     */

    public java.util.List<S3Object> getDiscardedFiles() {
        return discardedFiles;
    }

    /**
     * <p>
     * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for
     * example, a jpg or pdf) or not readable.
     * </p>
     * 
     * @param discardedFiles
     *        Indicates the number of files that were discarded. A file could be discarded because its format is invalid
     *        (for example, a jpg or pdf) or not readable.
     */

    public void setDiscardedFiles(java.util.Collection<S3Object> discardedFiles) {
        if (discardedFiles == null) {
            this.discardedFiles = null;
            return;
        }

        this.discardedFiles = new java.util.ArrayList<S3Object>(discardedFiles);
    }

    /**
     * <p>
     * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for
     * example, a jpg or pdf) or not readable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiscardedFiles(java.util.Collection)} or {@link #withDiscardedFiles(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param discardedFiles
     *        Indicates the number of files that were discarded. A file could be discarded because its format is invalid
     *        (for example, a jpg or pdf) or not readable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedFilesSummary withDiscardedFiles(S3Object... discardedFiles) {
        if (this.discardedFiles == null) {
            setDiscardedFiles(new java.util.ArrayList<S3Object>(discardedFiles.length));
        }
        for (S3Object ele : discardedFiles) {
            this.discardedFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the number of files that were discarded. A file could be discarded because its format is invalid (for
     * example, a jpg or pdf) or not readable.
     * </p>
     * 
     * @param discardedFiles
     *        Indicates the number of files that were discarded. A file could be discarded because its format is invalid
     *        (for example, a jpg or pdf) or not readable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedFilesSummary withDiscardedFiles(java.util.Collection<S3Object> discardedFiles) {
        setDiscardedFiles(discardedFiles);
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
        if (getTotalNumberOfFiles() != null)
            sb.append("TotalNumberOfFiles: ").append(getTotalNumberOfFiles()).append(",");
        if (getIngestedNumberOfFiles() != null)
            sb.append("IngestedNumberOfFiles: ").append(getIngestedNumberOfFiles()).append(",");
        if (getDiscardedFiles() != null)
            sb.append("DiscardedFiles: ").append(getDiscardedFiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestedFilesSummary == false)
            return false;
        IngestedFilesSummary other = (IngestedFilesSummary) obj;
        if (other.getTotalNumberOfFiles() == null ^ this.getTotalNumberOfFiles() == null)
            return false;
        if (other.getTotalNumberOfFiles() != null && other.getTotalNumberOfFiles().equals(this.getTotalNumberOfFiles()) == false)
            return false;
        if (other.getIngestedNumberOfFiles() == null ^ this.getIngestedNumberOfFiles() == null)
            return false;
        if (other.getIngestedNumberOfFiles() != null && other.getIngestedNumberOfFiles().equals(this.getIngestedNumberOfFiles()) == false)
            return false;
        if (other.getDiscardedFiles() == null ^ this.getDiscardedFiles() == null)
            return false;
        if (other.getDiscardedFiles() != null && other.getDiscardedFiles().equals(this.getDiscardedFiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfFiles() == null) ? 0 : getTotalNumberOfFiles().hashCode());
        hashCode = prime * hashCode + ((getIngestedNumberOfFiles() == null) ? 0 : getIngestedNumberOfFiles().hashCode());
        hashCode = prime * hashCode + ((getDiscardedFiles() == null) ? 0 : getDiscardedFiles().hashCode());
        return hashCode;
    }

    @Override
    public IngestedFilesSummary clone() {
        try {
            return (IngestedFilesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.IngestedFilesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
