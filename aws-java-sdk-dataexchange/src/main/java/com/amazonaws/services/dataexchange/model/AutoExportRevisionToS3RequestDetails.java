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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the operation to be performed by the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AutoExportRevisionToS3RequestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoExportRevisionToS3RequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Encryption configuration for the auto export job.
     * </p>
     */
    private ExportServerSideEncryption encryption;
    /**
     * <p>
     * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     * </p>
     */
    private AutoExportRevisionDestinationEntry revisionDestination;

    /**
     * <p>
     * Encryption configuration for the auto export job.
     * </p>
     * 
     * @param encryption
     *        Encryption configuration for the auto export job.
     */

    public void setEncryption(ExportServerSideEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Encryption configuration for the auto export job.
     * </p>
     * 
     * @return Encryption configuration for the auto export job.
     */

    public ExportServerSideEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * Encryption configuration for the auto export job.
     * </p>
     * 
     * @param encryption
     *        Encryption configuration for the auto export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoExportRevisionToS3RequestDetails withEncryption(ExportServerSideEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * <p>
     * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     * </p>
     * 
     * @param revisionDestination
     *        A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     */

    public void setRevisionDestination(AutoExportRevisionDestinationEntry revisionDestination) {
        this.revisionDestination = revisionDestination;
    }

    /**
     * <p>
     * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     * </p>
     * 
     * @return A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     */

    public AutoExportRevisionDestinationEntry getRevisionDestination() {
        return this.revisionDestination;
    }

    /**
     * <p>
     * A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     * </p>
     * 
     * @param revisionDestination
     *        A revision destination is the Amazon S3 bucket folder destination to where the export will be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoExportRevisionToS3RequestDetails withRevisionDestination(AutoExportRevisionDestinationEntry revisionDestination) {
        setRevisionDestination(revisionDestination);
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getRevisionDestination() != null)
            sb.append("RevisionDestination: ").append(getRevisionDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoExportRevisionToS3RequestDetails == false)
            return false;
        AutoExportRevisionToS3RequestDetails other = (AutoExportRevisionToS3RequestDetails) obj;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getRevisionDestination() == null ^ this.getRevisionDestination() == null)
            return false;
        if (other.getRevisionDestination() != null && other.getRevisionDestination().equals(this.getRevisionDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getRevisionDestination() == null) ? 0 : getRevisionDestination().hashCode());
        return hashCode;
    }

    @Override
    public AutoExportRevisionToS3RequestDetails clone() {
        try {
            return (AutoExportRevisionToS3RequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AutoExportRevisionToS3RequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
