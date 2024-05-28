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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliverySource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeliverySourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for this delivery source. This name must be unique for all delivery sources in your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     * <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Defines the type of log that the source is sending.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>, <code>AUTHENTICATION_LOGS</code>,
     * <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String logType;
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
     * A name for this delivery source. This name must be unique for all delivery sources in your account.
     * </p>
     * 
     * @param name
     *        A name for this delivery source. This name must be unique for all delivery sources in your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for this delivery source. This name must be unique for all delivery sources in your account.
     * </p>
     * 
     * @return A name for this delivery source. This name must be unique for all delivery sources in your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for this delivery source. This name must be unique for all delivery sources in your account.
     * </p>
     * 
     * @param name
     *        A name for this delivery source. This name must be unique for all delivery sources in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverySourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     * <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     *        <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     * <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     * </p>
     * 
     * @return The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     *         <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     * <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Amazon Web Services resource that is generating and sending logs. For example,
     *        <code>arn:aws:workmail:us-east-1:123456789012:organization/m-1234EXAMPLEabcd1234abcd1234abcd1234</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverySourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Defines the type of log that the source is sending.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>, <code>AUTHENTICATION_LOGS</code>,
     * <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logType
     *        Defines the type of log that the source is sending.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>,
     *        <code>AUTHENTICATION_LOGS</code>, <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and
     *        <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     *        </p>
     *        </li>
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * Defines the type of log that the source is sending.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>, <code>AUTHENTICATION_LOGS</code>,
     * <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the type of log that the source is sending.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>,
     *         <code>AUTHENTICATION_LOGS</code>, <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and
     *         <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     *         </p>
     *         </li>
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * Defines the type of log that the source is sending.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>, <code>AUTHENTICATION_LOGS</code>,
     * <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param logType
     *        Defines the type of log that the source is sending.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Amazon CodeWhisperer, the valid value is <code>EVENT_LOGS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For IAM Identity Centerr, the valid value is <code>ERROR_LOGS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon WorkMail, the valid values are <code>ACCESS_CONTROL_LOGS</code>,
     *        <code>AUTHENTICATION_LOGS</code>, <code>WORKMAIL_AVAILABILITY_PROVIDER_LOGS</code>, and
     *        <code>WORKMAIL_MAILBOX_ACCESS_LOGS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverySourceRequest withLogType(String logType) {
        setLogType(logType);
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

    public PutDeliverySourceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutDeliverySourceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverySourceRequest addTagsEntry(String key, String value) {
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

    public PutDeliverySourceRequest clearTagsEntries() {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof PutDeliverySourceRequest == false)
            return false;
        PutDeliverySourceRequest other = (PutDeliverySourceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDeliverySourceRequest clone() {
        return (PutDeliverySourceRequest) super.clone();
    }

}
