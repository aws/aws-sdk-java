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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliveryDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeliveryDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for this delivery destination. This name must be unique for all delivery destinations in your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format for the logs that this delivery destination will receive.
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
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * A name for this delivery destination. This name must be unique for all delivery destinations in your account.
     * </p>
     * 
     * @param name
     *        A name for this delivery destination. This name must be unique for all delivery destinations in your
     *        account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for this delivery destination. This name must be unique for all delivery destinations in your account.
     * </p>
     * 
     * @return A name for this delivery destination. This name must be unique for all delivery destinations in your
     *         account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for this delivery destination. This name must be unique for all delivery destinations in your account.
     * </p>
     * 
     * @param name
     *        A name for this delivery destination. This name must be unique for all delivery destinations in your
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliveryDestinationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format for the logs that this delivery destination will receive.
     * </p>
     * 
     * @param outputFormat
     *        The format for the logs that this delivery destination will receive.
     * @see OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format for the logs that this delivery destination will receive.
     * </p>
     * 
     * @return The format for the logs that this delivery destination will receive.
     * @see OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The format for the logs that this delivery destination will receive.
     * </p>
     * 
     * @param outputFormat
     *        The format for the logs that this delivery destination will receive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public PutDeliveryDestinationRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The format for the logs that this delivery destination will receive.
     * </p>
     * 
     * @param outputFormat
     *        The format for the logs that this delivery destination will receive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public PutDeliveryDestinationRequest withOutputFormat(OutputFormat outputFormat) {
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

    public PutDeliveryDestinationRequest withDeliveryDestinationConfiguration(DeliveryDestinationConfiguration deliveryDestinationConfiguration) {
        setDeliveryDestinationConfiguration(deliveryDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @return An optional list of key-value pairs to associate with the resource.</p>
     *         <p>
     *         For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliveryDestinationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutDeliveryDestinationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliveryDestinationRequest addTagsEntry(String key, String value) {
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

    public PutDeliveryDestinationRequest clearTagsEntries() {
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

        if (obj instanceof PutDeliveryDestinationRequest == false)
            return false;
        PutDeliveryDestinationRequest other = (PutDeliveryDestinationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationConfiguration() == null) ? 0 : getDeliveryDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDeliveryDestinationRequest clone() {
        return (PutDeliveryDestinationRequest) super.clone();
    }

}
