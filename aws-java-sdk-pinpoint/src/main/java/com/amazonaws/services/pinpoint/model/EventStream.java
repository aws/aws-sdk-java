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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies settings for publishing event data to an Amazon Kinesis data stream or an Amazon Kinesis Data Firehose
 * delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventStream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application to publish event data for.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     */
    private String destinationStreamArn;
    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     * requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The date, in ISO 8601 format, when the event stream was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The IAM user who last modified the event stream.
     * </p>
     */
    private String lastUpdatedBy;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The unique identifier for the application to publish event data for.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application to publish event data for.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application to publish event data for.
     * </p>
     * 
     * @return The unique identifier for the application to publish event data for.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application to publish event data for.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application to publish event data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *        stream to publish event data to.</p>
     *        <p>
     *        For a Kinesis data stream, the ARN format is:
     *        arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *        >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *        </p>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, the ARN format is:
     *        arn:aws:firehose:<replaceable>region</replaceable
     *        >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     */

    public void setDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *         stream to publish event data to.</p>
     *         <p>
     *         For a Kinesis data stream, the ARN format is:
     *         arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *         >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *         </p>
     *         <p>
     *         For a Kinesis Data Firehose delivery stream, the ARN format is:
     *         arn:aws:firehose:<replaceable>region</replaceable
     *         >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     */

    public String getDestinationStreamArn() {
        return this.destinationStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream
     * to publish event data to.
     * </p>
     * <p>
     * For a Kinesis data stream, the ARN format is:
     * arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable>account
     * -id</replaceable>:stream/<replaceable>stream_name</replaceable>
     * </p>
     * <p>
     * For a Kinesis Data Firehose delivery stream, the ARN format is:
     * arn:aws:firehose:<replaceable>region</replaceable>
     * :<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * </p>
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery
     *        stream to publish event data to.</p>
     *        <p>
     *        For a Kinesis data stream, the ARN format is:
     *        arn:aws:kinesis:<replaceable>region</replaceable>:<replaceable
     *        >account-id</replaceable>:stream/<replaceable>stream_name</replaceable>
     *        </p>
     *        <p>
     *        For a Kinesis Data Firehose delivery stream, the ARN format is:
     *        arn:aws:firehose:<replaceable>region</replaceable
     *        >:<replaceable>account-id</replaceable>:deliverystream/<replaceable>stream_name</replaceable>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withDestinationStreamArn(String destinationStreamArn) {
        setDestinationStreamArn(destinationStreamArn);
        return this;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     * requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *        Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     *        requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     * requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @return (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *         Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     *         requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     * Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     * requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * </p>
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon
     *        Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this
     *        requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the event stream was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the event stream was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the event stream was last modified.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the event stream was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the event stream was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the event stream was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The IAM user who last modified the event stream.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user who last modified the event stream.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user who last modified the event stream.
     * </p>
     * 
     * @return The IAM user who last modified the event stream.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user who last modified the event stream.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user who last modified the event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to
     *        the stream in your AWS account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data
     *         to the stream in your AWS account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the
     * stream in your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to
     *        the stream in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getDestinationStreamArn() != null)
            sb.append("DestinationStreamArn: ").append(getDestinationStreamArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventStream == false)
            return false;
        EventStream other = (EventStream) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getDestinationStreamArn() == null ^ this.getDestinationStreamArn() == null)
            return false;
        if (other.getDestinationStreamArn() != null && other.getDestinationStreamArn().equals(this.getDestinationStreamArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getDestinationStreamArn() == null) ? 0 : getDestinationStreamArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public EventStream clone() {
        try {
            return (EventStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
