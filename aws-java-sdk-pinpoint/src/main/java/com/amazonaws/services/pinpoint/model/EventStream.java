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
 * Model for an event publishing subscription export.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventStream implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the application from which events should be published. */
    private String applicationId;
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to
     * publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis ARN:
     * arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */
    private String destinationStreamArn;
    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     */
    private String externalId;
    /** The date the event stream was last updated in ISO 8601 format. */
    private String lastModifiedDate;
    /** The IAM user who last modified the event stream. */
    private String lastUpdatedBy;
    /** The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account. */
    private String roleArn;

    /**
     * The ID of the application from which events should be published.
     * 
     * @param applicationId
     *        The ID of the application from which events should be published.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application from which events should be published.
     * 
     * @return The ID of the application from which events should be published.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application from which events should be published.
     * 
     * @param applicationId
     *        The ID of the application from which events should be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to
     * publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis ARN:
     * arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want
     *        to publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     *        ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */

    public void setDestinationStreamArn(String destinationStreamArn) {
        this.destinationStreamArn = destinationStreamArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to
     * publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis ARN:
     * arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want
     *         to publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     *         ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     */

    public String getDestinationStreamArn() {
        return this.destinationStreamArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to
     * publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis ARN:
     * arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * 
     * @param destinationStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want
     *        to publish events. Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME Kinesis
     *        ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withDestinationStreamArn(String destinationStreamArn) {
        setDestinationStreamArn(destinationStreamArn);
        return this;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by
     *        Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended
     *        for IAM roles assumed by Amazon Pinpoint.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @return (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used
     *         by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not
     *         recommended for IAM roles assumed by Amazon Pinpoint.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon
     * Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles
     * assumed by Amazon Pinpoint.
     * 
     * @param externalId
     *        (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by
     *        Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended
     *        for IAM roles assumed by Amazon Pinpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * The date the event stream was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the event stream was last updated in ISO 8601 format.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date the event stream was last updated in ISO 8601 format.
     * 
     * @return The date the event stream was last updated in ISO 8601 format.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date the event stream was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the event stream was last updated in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStream withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The IAM user who last modified the event stream.
     * 
     * @param lastUpdatedBy
     *        The IAM user who last modified the event stream.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * The IAM user who last modified the event stream.
     * 
     * @return The IAM user who last modified the event stream.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * The IAM user who last modified the event stream.
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
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     * @param roleArn
     *        The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     * @return The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     * @param roleArn
     *        The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
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
