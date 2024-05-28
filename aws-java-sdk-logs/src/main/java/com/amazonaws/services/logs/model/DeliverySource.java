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
 * This structure contains information about one <i>delivery source</i> in your account. A delivery source is an Amazon
 * Web Services resource that sends logs to an Amazon Web Services destination. The destination can be CloudWatch Logs,
 * Amazon S3, or Firehose.
 * </p>
 * <p>
 * Only some Amazon Web Services services support being configured as a delivery source. These services are listed as
 * <b>Supported [V2 Permissions]</b> in the table at <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling logging
 * from Amazon Web Services services.</a>
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
 * Create a <i>delivery destination</i>, which is a logical object that represents the actual delivery destination. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html"
 * >PutDeliveryDestination</a>.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeliverySource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliverySource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the delivery source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     * delivery source. Currently, only one ARN can be in the array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceArns;
    /**
     * <p>
     * The Amazon Web Services service that is sending logs.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The type of log that the source is sending. For valid values for this parameter, see the documentation for the
     * source service.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * The tags that have been assigned to this delivery source.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The unique name of the delivery source.
     * </p>
     * 
     * @param name
     *        The unique name of the delivery source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the delivery source.
     * </p>
     * 
     * @return The unique name of the delivery source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the delivery source.
     * </p>
     * 
     * @param name
     *        The unique name of the delivery source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     * delivery source. Currently, only one ARN can be in the array.
     * </p>
     * 
     * @return This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by
     *         this delivery source. Currently, only one ARN can be in the array.
     */

    public java.util.List<String> getResourceArns() {
        if (resourceArns == null) {
            resourceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceArns;
    }

    /**
     * <p>
     * This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     * delivery source. Currently, only one ARN can be in the array.
     * </p>
     * 
     * @param resourceArns
     *        This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     *        delivery source. Currently, only one ARN can be in the array.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new com.amazonaws.internal.SdkInternalList<String>(resourceArns);
    }

    /**
     * <p>
     * This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     * delivery source. Currently, only one ARN can be in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     *        delivery source. Currently, only one ARN can be in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new com.amazonaws.internal.SdkInternalList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     * delivery source. Currently, only one ARN can be in the array.
     * </p>
     * 
     * @param resourceArns
     *        This array contains the ARN of the Amazon Web Services resource that sends logs and is represented by this
     *        delivery source. Currently, only one ARN can be in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service that is sending logs.
     * </p>
     * 
     * @param service
     *        The Amazon Web Services service that is sending logs.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The Amazon Web Services service that is sending logs.
     * </p>
     * 
     * @return The Amazon Web Services service that is sending logs.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The Amazon Web Services service that is sending logs.
     * </p>
     * 
     * @param service
     *        The Amazon Web Services service that is sending logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The type of log that the source is sending. For valid values for this parameter, see the documentation for the
     * source service.
     * </p>
     * 
     * @param logType
     *        The type of log that the source is sending. For valid values for this parameter, see the documentation for
     *        the source service.
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * The type of log that the source is sending. For valid values for this parameter, see the documentation for the
     * source service.
     * </p>
     * 
     * @return The type of log that the source is sending. For valid values for this parameter, see the documentation
     *         for the source service.
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * The type of log that the source is sending. For valid values for this parameter, see the documentation for the
     * source service.
     * </p>
     * 
     * @param logType
     *        The type of log that the source is sending. For valid values for this parameter, see the documentation for
     *        the source service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery source.
     * </p>
     * 
     * @return The tags that have been assigned to this delivery source.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery source.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery source.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery source.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DeliverySource#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeliverySource addTagsEntry(String key, String value) {
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

    public DeliverySource clearTagsEntries() {
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
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

        if (obj instanceof DeliverySource == false)
            return false;
        DeliverySource other = (DeliverySource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
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
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DeliverySource clone() {
        try {
            return (DeliverySource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.DeliverySourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
