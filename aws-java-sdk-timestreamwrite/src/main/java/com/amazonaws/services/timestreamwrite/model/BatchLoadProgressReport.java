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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the progress of a batch load task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/BatchLoadProgressReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchLoadProgressReport implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private Long recordsProcessed;
    /** <p/> */
    private Long recordsIngested;
    /** <p/> */
    private Long parseFailures;
    /** <p/> */
    private Long recordIngestionFailures;
    /** <p/> */
    private Long fileFailures;
    /** <p/> */
    private Long bytesMetered;

    /**
     * <p/>
     * 
     * @param recordsProcessed
     */

    public void setRecordsProcessed(Long recordsProcessed) {
        this.recordsProcessed = recordsProcessed;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getRecordsProcessed() {
        return this.recordsProcessed;
    }

    /**
     * <p/>
     * 
     * @param recordsProcessed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withRecordsProcessed(Long recordsProcessed) {
        setRecordsProcessed(recordsProcessed);
        return this;
    }

    /**
     * <p/>
     * 
     * @param recordsIngested
     */

    public void setRecordsIngested(Long recordsIngested) {
        this.recordsIngested = recordsIngested;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getRecordsIngested() {
        return this.recordsIngested;
    }

    /**
     * <p/>
     * 
     * @param recordsIngested
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withRecordsIngested(Long recordsIngested) {
        setRecordsIngested(recordsIngested);
        return this;
    }

    /**
     * <p/>
     * 
     * @param parseFailures
     */

    public void setParseFailures(Long parseFailures) {
        this.parseFailures = parseFailures;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getParseFailures() {
        return this.parseFailures;
    }

    /**
     * <p/>
     * 
     * @param parseFailures
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withParseFailures(Long parseFailures) {
        setParseFailures(parseFailures);
        return this;
    }

    /**
     * <p/>
     * 
     * @param recordIngestionFailures
     */

    public void setRecordIngestionFailures(Long recordIngestionFailures) {
        this.recordIngestionFailures = recordIngestionFailures;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getRecordIngestionFailures() {
        return this.recordIngestionFailures;
    }

    /**
     * <p/>
     * 
     * @param recordIngestionFailures
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withRecordIngestionFailures(Long recordIngestionFailures) {
        setRecordIngestionFailures(recordIngestionFailures);
        return this;
    }

    /**
     * <p/>
     * 
     * @param fileFailures
     */

    public void setFileFailures(Long fileFailures) {
        this.fileFailures = fileFailures;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getFileFailures() {
        return this.fileFailures;
    }

    /**
     * <p/>
     * 
     * @param fileFailures
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withFileFailures(Long fileFailures) {
        setFileFailures(fileFailures);
        return this;
    }

    /**
     * <p/>
     * 
     * @param bytesMetered
     */

    public void setBytesMetered(Long bytesMetered) {
        this.bytesMetered = bytesMetered;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getBytesMetered() {
        return this.bytesMetered;
    }

    /**
     * <p/>
     * 
     * @param bytesMetered
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadProgressReport withBytesMetered(Long bytesMetered) {
        setBytesMetered(bytesMetered);
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
        if (getRecordsProcessed() != null)
            sb.append("RecordsProcessed: ").append(getRecordsProcessed()).append(",");
        if (getRecordsIngested() != null)
            sb.append("RecordsIngested: ").append(getRecordsIngested()).append(",");
        if (getParseFailures() != null)
            sb.append("ParseFailures: ").append(getParseFailures()).append(",");
        if (getRecordIngestionFailures() != null)
            sb.append("RecordIngestionFailures: ").append(getRecordIngestionFailures()).append(",");
        if (getFileFailures() != null)
            sb.append("FileFailures: ").append(getFileFailures()).append(",");
        if (getBytesMetered() != null)
            sb.append("BytesMetered: ").append(getBytesMetered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchLoadProgressReport == false)
            return false;
        BatchLoadProgressReport other = (BatchLoadProgressReport) obj;
        if (other.getRecordsProcessed() == null ^ this.getRecordsProcessed() == null)
            return false;
        if (other.getRecordsProcessed() != null && other.getRecordsProcessed().equals(this.getRecordsProcessed()) == false)
            return false;
        if (other.getRecordsIngested() == null ^ this.getRecordsIngested() == null)
            return false;
        if (other.getRecordsIngested() != null && other.getRecordsIngested().equals(this.getRecordsIngested()) == false)
            return false;
        if (other.getParseFailures() == null ^ this.getParseFailures() == null)
            return false;
        if (other.getParseFailures() != null && other.getParseFailures().equals(this.getParseFailures()) == false)
            return false;
        if (other.getRecordIngestionFailures() == null ^ this.getRecordIngestionFailures() == null)
            return false;
        if (other.getRecordIngestionFailures() != null && other.getRecordIngestionFailures().equals(this.getRecordIngestionFailures()) == false)
            return false;
        if (other.getFileFailures() == null ^ this.getFileFailures() == null)
            return false;
        if (other.getFileFailures() != null && other.getFileFailures().equals(this.getFileFailures()) == false)
            return false;
        if (other.getBytesMetered() == null ^ this.getBytesMetered() == null)
            return false;
        if (other.getBytesMetered() != null && other.getBytesMetered().equals(this.getBytesMetered()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordsProcessed() == null) ? 0 : getRecordsProcessed().hashCode());
        hashCode = prime * hashCode + ((getRecordsIngested() == null) ? 0 : getRecordsIngested().hashCode());
        hashCode = prime * hashCode + ((getParseFailures() == null) ? 0 : getParseFailures().hashCode());
        hashCode = prime * hashCode + ((getRecordIngestionFailures() == null) ? 0 : getRecordIngestionFailures().hashCode());
        hashCode = prime * hashCode + ((getFileFailures() == null) ? 0 : getFileFailures().hashCode());
        hashCode = prime * hashCode + ((getBytesMetered() == null) ? 0 : getBytesMetered().hashCode());
        return hashCode;
    }

    @Override
    public BatchLoadProgressReport clone() {
        try {
            return (BatchLoadProgressReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.BatchLoadProgressReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
