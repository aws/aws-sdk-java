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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about one <i>delivery destination</i> in your account. A delivery destination is
 * an Amazon Web Services resource that represents an Amazon Web Services service that logs can be sent to. CloudWatch
 * Logs, Amazon S3, are supported as Firehose delivery destinations.
 * </p>
 * <p>
 * To configure logs delivery between a supported Amazon Web Services service and a destination, you must do the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create a delivery source, which is a logical object that represents the resource that is actually sending the logs.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html"
 * >PutDeliverySource</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a <i>delivery destination</i>, which is a logical object that represents the actual delivery destination.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are delivering logs cross-account, you must use <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
 * >PutDeliveryDestinationPolicy</a> in the destination account to assign an IAM policy to the destination. This policy
 * allows delivery to that destination.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a <i>delivery</i> by pairing exactly one delivery source and one delivery destination. For more information,
 * see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html">CreateDelivery
 * </a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can configure a single delivery source to send logs to multiple destinations by creating multiple deliveries. You
 * can also create multiple deliveries to configure multiple delivery sources to send logs to the same delivery
 * destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeliveryDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this delivery destination.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     */
    private String deliveryDestinationType;
    /**
     * <p>
     * The format of the logs that are sent to this delivery destination.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     * </p>
     */
    private DeliveryDestinationConfiguration deliveryDestinationConfiguration;
    /**
     * <p>
     * The tags that have been assigned to this delivery destination.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The name of this delivery destination.
     * </p>
     * 
     * @param name
     *        The name of this delivery destination.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this delivery destination.
     * </p>
     * 
     * @return The name of this delivery destination.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this delivery destination.
     * </p>
     * 
     * @param name
     *        The name of this delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestination withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * @see DeliveryDestinationType
     */

    public void setDeliveryDestinationType(String deliveryDestinationType) {
        this.deliveryDestinationType = deliveryDestinationType;
    }

    /**
     * <p>
     * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     * 
     * @return Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * @see DeliveryDestinationType
     */

    public String getDeliveryDestinationType() {
        return this.deliveryDestinationType;
    }

    /**
     * <p>
     * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryDestinationType
     */

    public DeliveryDestination withDeliveryDestinationType(String deliveryDestinationType) {
        setDeliveryDestinationType(deliveryDestinationType);
        return this;
    }

    /**
     * <p>
     * Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether this delivery destination is CloudWatch Logs, Amazon S3, or Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryDestinationType
     */

    public DeliveryDestination withDeliveryDestinationType(DeliveryDestinationType deliveryDestinationType) {
        this.deliveryDestinationType = deliveryDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * The format of the logs that are sent to this delivery destination.
     * </p>
     * 
     * @param outputFormat
     *        The format of the logs that are sent to this delivery destination.
     * @see OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format of the logs that are sent to this delivery destination.
     * </p>
     * 
     * @return The format of the logs that are sent to this delivery destination.
     * @see OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The format of the logs that are sent to this delivery destination.
     * </p>
     * 
     * @param outputFormat
     *        The format of the logs that are sent to this delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public DeliveryDestination withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the logs that are sent to this delivery destination.
     * </p>
     * 
     * @param outputFormat
     *        The format of the logs that are sent to this delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public DeliveryDestination withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     * </p>
     * 
     * @param deliveryDestinationConfiguration
     *        A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     */

    public void setDeliveryDestinationConfiguration(DeliveryDestinationConfiguration deliveryDestinationConfiguration) {
        this.deliveryDestinationConfiguration = deliveryDestinationConfiguration;
    }

    /**
     * <p>
     * A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     * </p>
     * 
     * @return A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     */

    public DeliveryDestinationConfiguration getDeliveryDestinationConfiguration() {
        return this.deliveryDestinationConfiguration;
    }

    /**
     * <p>
     * A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     * </p>
     * 
     * @param deliveryDestinationConfiguration
     *        A structure that contains the ARN of the Amazon Web Services resource that will receive the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestination withDeliveryDestinationConfiguration(DeliveryDestinationConfiguration deliveryDestinationConfiguration) {
        setDeliveryDestinationConfiguration(deliveryDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery destination.
     * </p>
     * 
     * @return The tags that have been assigned to this delivery destination.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery destination.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery destination.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery destination.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestination withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DeliveryDestination#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestination addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public DeliveryDestination clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeliveryDestinationType() != null)
            sb.append("DeliveryDestinationType: ").append(getDeliveryDestinationType()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getDeliveryDestinationConfiguration() != null)
            sb.append("DeliveryDestinationConfiguration: ").append(getDeliveryDestinationConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryDestination == false)
            return false;
        DeliveryDestination other = (DeliveryDestination) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeliveryDestinationType() == null ^ this.getDeliveryDestinationType() == null)
            return false;
        if (other.getDeliveryDestinationType() != null && other.getDeliveryDestinationType().equals(this.getDeliveryDestinationType()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getDeliveryDestinationConfiguration() == null ^ this.getDeliveryDestinationConfiguration() == null)
            return false;
        if (other.getDeliveryDestinationConfiguration() != null
                && other.getDeliveryDestinationConfiguration().equals(this.getDeliveryDestinationConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationType() == null) ? 0 : getDeliveryDestinationType().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationConfiguration() == null) ? 0 : getDeliveryDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryDestination clone() {
        try {
            return (DeliveryDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.DeliveryDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
