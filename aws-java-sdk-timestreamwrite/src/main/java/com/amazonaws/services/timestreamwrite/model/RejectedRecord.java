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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Records that were not successfully inserted into Timestream due to data validation issues that must be resolved prior
 * to reinserting time series data into the system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/RejectedRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectedRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The index of the record in the input request for WriteRecords. Indexes begin with 0.
     * </p>
     */
    private Integer recordIndex;
    /**
     * <p>
     * The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records with duplicate data where there are multiple records with the same dimensions, timestamps, and measure
     * names but different measure values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Records with timestamps that lie outside the retention duration of the memory store
     * </p>
     * <note>
     * <p>
     * When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     * immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception, wait
     * until the duration of the new window to ingest new data. For further information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration"> Best
     * Practices for Configuring Timestream</a> and <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how storage
     * works in Timestream</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Records with dimensions or measures that exceed the Timestream defined limits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The existing version of the record. This value is populated in scenarios where an identical record exists with a
     * higher version than the version in the write request.
     * </p>
     */
    private Long existingVersion;

    /**
     * <p>
     * The index of the record in the input request for WriteRecords. Indexes begin with 0.
     * </p>
     * 
     * @param recordIndex
     *        The index of the record in the input request for WriteRecords. Indexes begin with 0.
     */

    public void setRecordIndex(Integer recordIndex) {
        this.recordIndex = recordIndex;
    }

    /**
     * <p>
     * The index of the record in the input request for WriteRecords. Indexes begin with 0.
     * </p>
     * 
     * @return The index of the record in the input request for WriteRecords. Indexes begin with 0.
     */

    public Integer getRecordIndex() {
        return this.recordIndex;
    }

    /**
     * <p>
     * The index of the record in the input request for WriteRecords. Indexes begin with 0.
     * </p>
     * 
     * @param recordIndex
     *        The index of the record in the input request for WriteRecords. Indexes begin with 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedRecord withRecordIndex(Integer recordIndex) {
        setRecordIndex(recordIndex);
        return this;
    }

    /**
     * <p>
     * The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records with duplicate data where there are multiple records with the same dimensions, timestamps, and measure
     * names but different measure values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Records with timestamps that lie outside the retention duration of the memory store
     * </p>
     * <note>
     * <p>
     * When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     * immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception, wait
     * until the duration of the new window to ingest new data. For further information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration"> Best
     * Practices for Configuring Timestream</a> and <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how storage
     * works in Timestream</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Records with dimensions or measures that exceed the Timestream defined limits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param reason
     *        The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Records with duplicate data where there are multiple records with the same dimensions, timestamps, and
     *        measure names but different measure values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Records with timestamps that lie outside the retention duration of the memory store
     *        </p>
     *        <note>
     *        <p>
     *        When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     *        immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception,
     *        wait until the duration of the new window to ingest new data. For further information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration">
     *        Best Practices for Configuring Timestream</a> and <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how
     *        storage works in Timestream</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Records with dimensions or measures that exceed the Timestream defined limits.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a>
     *        in the Timestream Developer Guide.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records with duplicate data where there are multiple records with the same dimensions, timestamps, and measure
     * names but different measure values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Records with timestamps that lie outside the retention duration of the memory store
     * </p>
     * <note>
     * <p>
     * When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     * immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception, wait
     * until the duration of the new window to ingest new data. For further information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration"> Best
     * Practices for Configuring Timestream</a> and <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how storage
     * works in Timestream</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Records with dimensions or measures that exceed the Timestream defined limits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @return The reason why a record was not successfully inserted into Timestream. Possible causes of failure
     *         include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Records with duplicate data where there are multiple records with the same dimensions, timestamps, and
     *         measure names but different measure values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records with timestamps that lie outside the retention duration of the memory store
     *         </p>
     *         <note>
     *         <p>
     *         When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     *         immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception,
     *         wait until the duration of the new window to ingest new data. For further information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration">
     *         Best Practices for Configuring Timestream</a> and <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how
     *         storage works in Timestream</a>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         Records with dimensions or measures that exceed the Timestream defined limits.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a>
     *         in the Timestream Developer Guide.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records with duplicate data where there are multiple records with the same dimensions, timestamps, and measure
     * names but different measure values.
     * </p>
     * </li>
     * <li>
     * <p>
     * Records with timestamps that lie outside the retention duration of the memory store
     * </p>
     * <note>
     * <p>
     * When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     * immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception, wait
     * until the duration of the new window to ingest new data. For further information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration"> Best
     * Practices for Configuring Timestream</a> and <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how storage
     * works in Timestream</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Records with dimensions or measures that exceed the Timestream defined limits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param reason
     *        The reason why a record was not successfully inserted into Timestream. Possible causes of failure include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Records with duplicate data where there are multiple records with the same dimensions, timestamps, and
     *        measure names but different measure values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Records with timestamps that lie outside the retention duration of the memory store
     *        </p>
     *        <note>
     *        <p>
     *        When the retention window is updated, you will receive a <code>RejectedRecords</code> exception if you
     *        immediately try to ingest data within the new window. To avoid a <code>RejectedRecords</code> exception,
     *        wait until the duration of the new window to ingest new data. For further information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/best-practices.html#configuration">
     *        Best Practices for Configuring Timestream</a> and <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">the explanation of how
     *        storage works in Timestream</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Records with dimensions or measures that exceed the Timestream defined limits.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a>
     *        in the Timestream Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedRecord withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The existing version of the record. This value is populated in scenarios where an identical record exists with a
     * higher version than the version in the write request.
     * </p>
     * 
     * @param existingVersion
     *        The existing version of the record. This value is populated in scenarios where an identical record exists
     *        with a higher version than the version in the write request.
     */

    public void setExistingVersion(Long existingVersion) {
        this.existingVersion = existingVersion;
    }

    /**
     * <p>
     * The existing version of the record. This value is populated in scenarios where an identical record exists with a
     * higher version than the version in the write request.
     * </p>
     * 
     * @return The existing version of the record. This value is populated in scenarios where an identical record exists
     *         with a higher version than the version in the write request.
     */

    public Long getExistingVersion() {
        return this.existingVersion;
    }

    /**
     * <p>
     * The existing version of the record. This value is populated in scenarios where an identical record exists with a
     * higher version than the version in the write request.
     * </p>
     * 
     * @param existingVersion
     *        The existing version of the record. This value is populated in scenarios where an identical record exists
     *        with a higher version than the version in the write request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedRecord withExistingVersion(Long existingVersion) {
        setExistingVersion(existingVersion);
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
        if (getRecordIndex() != null)
            sb.append("RecordIndex: ").append(getRecordIndex()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getExistingVersion() != null)
            sb.append("ExistingVersion: ").append(getExistingVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectedRecord == false)
            return false;
        RejectedRecord other = (RejectedRecord) obj;
        if (other.getRecordIndex() == null ^ this.getRecordIndex() == null)
            return false;
        if (other.getRecordIndex() != null && other.getRecordIndex().equals(this.getRecordIndex()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getExistingVersion() == null ^ this.getExistingVersion() == null)
            return false;
        if (other.getExistingVersion() != null && other.getExistingVersion().equals(this.getExistingVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordIndex() == null) ? 0 : getRecordIndex().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getExistingVersion() == null) ? 0 : getExistingVersion().hashCode());
        return hashCode;
    }

    @Override
    public RejectedRecord clone() {
        try {
            return (RejectedRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.RejectedRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
