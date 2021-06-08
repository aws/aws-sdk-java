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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the export revisions to Amazon S3 response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ExportRevisionsToS3ResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportRevisionsToS3ResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * Encryption configuration of the export job.
     * </p>
     */
    private ExportServerSideEncryption encryption;
    /**
     * <p>
     * The destination in Amazon S3 where the revision is exported.
     * </p>
     */
    private java.util.List<RevisionDestinationEntry> revisionDestinations;

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this export job.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this export job.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportRevisionsToS3ResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * Encryption configuration of the export job.
     * </p>
     * 
     * @param encryption
     *        Encryption configuration of the export job.
     */

    public void setEncryption(ExportServerSideEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Encryption configuration of the export job.
     * </p>
     * 
     * @return Encryption configuration of the export job.
     */

    public ExportServerSideEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * Encryption configuration of the export job.
     * </p>
     * 
     * @param encryption
     *        Encryption configuration of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportRevisionsToS3ResponseDetails withEncryption(ExportServerSideEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon S3 where the revision is exported.
     * </p>
     * 
     * @return The destination in Amazon S3 where the revision is exported.
     */

    public java.util.List<RevisionDestinationEntry> getRevisionDestinations() {
        return revisionDestinations;
    }

    /**
     * <p>
     * The destination in Amazon S3 where the revision is exported.
     * </p>
     * 
     * @param revisionDestinations
     *        The destination in Amazon S3 where the revision is exported.
     */

    public void setRevisionDestinations(java.util.Collection<RevisionDestinationEntry> revisionDestinations) {
        if (revisionDestinations == null) {
            this.revisionDestinations = null;
            return;
        }

        this.revisionDestinations = new java.util.ArrayList<RevisionDestinationEntry>(revisionDestinations);
    }

    /**
     * <p>
     * The destination in Amazon S3 where the revision is exported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisionDestinations(java.util.Collection)} or {@link #withRevisionDestinations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param revisionDestinations
     *        The destination in Amazon S3 where the revision is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportRevisionsToS3ResponseDetails withRevisionDestinations(RevisionDestinationEntry... revisionDestinations) {
        if (this.revisionDestinations == null) {
            setRevisionDestinations(new java.util.ArrayList<RevisionDestinationEntry>(revisionDestinations.length));
        }
        for (RevisionDestinationEntry ele : revisionDestinations) {
            this.revisionDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination in Amazon S3 where the revision is exported.
     * </p>
     * 
     * @param revisionDestinations
     *        The destination in Amazon S3 where the revision is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportRevisionsToS3ResponseDetails withRevisionDestinations(java.util.Collection<RevisionDestinationEntry> revisionDestinations) {
        setRevisionDestinations(revisionDestinations);
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
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getRevisionDestinations() != null)
            sb.append("RevisionDestinations: ").append(getRevisionDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportRevisionsToS3ResponseDetails == false)
            return false;
        ExportRevisionsToS3ResponseDetails other = (ExportRevisionsToS3ResponseDetails) obj;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getRevisionDestinations() == null ^ this.getRevisionDestinations() == null)
            return false;
        if (other.getRevisionDestinations() != null && other.getRevisionDestinations().equals(this.getRevisionDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getRevisionDestinations() == null) ? 0 : getRevisionDestinations().hashCode());
        return hashCode;
    }

    @Override
    public ExportRevisionsToS3ResponseDetails clone() {
        try {
            return (ExportRevisionsToS3ResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ExportRevisionsToS3ResponseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
