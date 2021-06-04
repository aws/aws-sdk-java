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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/StreamJournalToKinesis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamJournalToKinesisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String ledgerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data. This parameter must be in
     * <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>, QLDB
     * effectively defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     */
    private java.util.Date inclusiveStartTime;
    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream
     * runs indefinitely until you cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     * </p>
     */
    private java.util.Date exclusiveEndTime;
    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     * </p>
     */
    private KinesisConfiguration kinesisConfiguration;
    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate
     * the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have the same
     * naming constraints as ledger names, as defined in <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon QLDB</a>
     * in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *        data records to a Kinesis Data Streams resource.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *         data records to a Kinesis Data Streams resource.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data
     * records to a Kinesis Data Streams resource.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write
     *        data records to a Kinesis Data Streams resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @return The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive.
     *         Tag values are case sensitive and can be null.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag
     *        values are case sensitive and can be null.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag
     *        values are case sensitive and can be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamJournalToKinesisRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data. This parameter must be in
     * <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>, QLDB
     * effectively defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time from which to start streaming journal data. This parameter must be in
     *        <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     *        <code>2019-06-13T21:36:34Z</code>.</p>
     *        <p>
     *        The <code>InclusiveStartTime</code> cannot be in the future and must be before
     *        <code>ExclusiveEndTime</code>.
     *        </p>
     *        <p>
     *        If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *        <code>CreationDateTime</code>, QLDB effectively defaults it to the ledger's <code>CreationDateTime</code>.
     */

    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data. This parameter must be in
     * <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>, QLDB
     * effectively defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @return The inclusive start date and time from which to start streaming journal data. This parameter must be in
     *         <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     *         <code>2019-06-13T21:36:34Z</code>.</p>
     *         <p>
     *         The <code>InclusiveStartTime</code> cannot be in the future and must be before
     *         <code>ExclusiveEndTime</code>.
     *         </p>
     *         <p>
     *         If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *         <code>CreationDateTime</code>, QLDB effectively defaults it to the ledger's <code>CreationDateTime</code>.
     */

    public java.util.Date getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal data. This parameter must be in
     * <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>, QLDB
     * effectively defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time from which to start streaming journal data. This parameter must be in
     *        <code>ISO 8601</code> date and time format and in Universal Coordinated Time (UTC). For example:
     *        <code>2019-06-13T21:36:34Z</code>.</p>
     *        <p>
     *        The <code>InclusiveStartTime</code> cannot be in the future and must be before
     *        <code>ExclusiveEndTime</code>.
     *        </p>
     *        <p>
     *        If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *        <code>CreationDateTime</code>, QLDB effectively defaults it to the ledger's <code>CreationDateTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        setInclusiveStartTime(inclusiveStartTime);
        return this;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream
     * runs indefinitely until you cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the
     *        stream runs indefinitely until you cancel it.</p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     */

    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream
     * runs indefinitely until you cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * 
     * @return The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the
     *         stream runs indefinitely until you cancel it.</p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *         Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     */

    public java.util.Date getExclusiveEndTime() {
        return this.exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream
     * runs indefinitely until you cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the
     *        stream runs indefinitely until you cancel it.</p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        setExclusiveEndTime(exclusiveEndTime);
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     * </p>
     * 
     * @param kinesisConfiguration
     *        The configuration settings of the Kinesis Data Streams destination for your stream request.
     */

    public void setKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     * </p>
     * 
     * @return The configuration settings of the Kinesis Data Streams destination for your stream request.
     */

    public KinesisConfiguration getKinesisConfiguration() {
        return this.kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for your stream request.
     * </p>
     * 
     * @param kinesisConfiguration
     *        The configuration settings of the Kinesis Data Streams destination for your stream request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        setKinesisConfiguration(kinesisConfiguration);
        return this;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate
     * the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have the same
     * naming constraints as ledger names, as defined in <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon QLDB</a>
     * in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param streamName
     *        The name that you want to assign to the QLDB journal stream. User-defined names can help identify and
     *        indicate the purpose of a stream.</p>
     *        <p>
     *        Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have
     *        the same naming constraints as ledger names, as defined in <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon
     *        QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate
     * the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have the same
     * naming constraints as ledger names, as defined in <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon QLDB</a>
     * in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @return The name that you want to assign to the QLDB journal stream. User-defined names can help identify and
     *         indicate the purpose of a stream.</p>
     *         <p>
     *         Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have
     *         the same naming constraints as ledger names, as defined in <a
     *         href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon
     *         QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate
     * the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have the same
     * naming constraints as ledger names, as defined in <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon QLDB</a>
     * in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param streamName
     *        The name that you want to assign to the QLDB journal stream. User-defined names can help identify and
     *        indicate the purpose of a stream.</p>
     *        <p>
     *        Your stream name must be unique among other <i>active</i> streams for a given ledger. Stream names have
     *        the same naming constraints as ledger names, as defined in <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming">Quotas in Amazon
     *        QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamJournalToKinesisRequest withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: ").append(getInclusiveStartTime()).append(",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: ").append(getExclusiveEndTime()).append(",");
        if (getKinesisConfiguration() != null)
            sb.append("KinesisConfiguration: ").append(getKinesisConfiguration()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamJournalToKinesisRequest == false)
            return false;
        StreamJournalToKinesisRequest other = (StreamJournalToKinesisRequest) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getKinesisConfiguration() == null ^ this.getKinesisConfiguration() == null)
            return false;
        if (other.getKinesisConfiguration() != null && other.getKinesisConfiguration().equals(this.getKinesisConfiguration()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode + ((getKinesisConfiguration() == null) ? 0 : getKinesisConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public StreamJournalToKinesisRequest clone() {
        return (StreamJournalToKinesisRequest) super.clone();
    }

}
