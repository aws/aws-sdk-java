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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ImportPhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is from
     * Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     * </p>
     */
    private String sourcePhoneNumberArn;
    /**
     * <p>
     * The description of the phone number.
     * </p>
     */
    private String phoneNumberDescription;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is from
     * Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     * </p>
     * 
     * @param sourcePhoneNumberArn
     *        The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is
     *        from Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     */

    public void setSourcePhoneNumberArn(String sourcePhoneNumberArn) {
        this.sourcePhoneNumberArn = sourcePhoneNumberArn;
    }

    /**
     * <p>
     * The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is from
     * Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     * </p>
     * 
     * @return The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is
     *         from Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     */

    public String getSourcePhoneNumberArn() {
        return this.sourcePhoneNumberArn;
    }

    /**
     * <p>
     * The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is from
     * Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     * </p>
     * 
     * @param sourcePhoneNumberArn
     *        The claimed phone number ARN being imported from the external service, such as Amazon Pinpoint. If it is
     *        from Amazon Pinpoint, it looks like the ARN of the phone number to import from Amazon Pinpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest withSourcePhoneNumberArn(String sourcePhoneNumberArn) {
        setSourcePhoneNumberArn(sourcePhoneNumberArn);
        return this;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @param phoneNumberDescription
     *        The description of the phone number.
     */

    public void setPhoneNumberDescription(String phoneNumberDescription) {
        this.phoneNumberDescription = phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @return The description of the phone number.
     */

    public String getPhoneNumberDescription() {
        return this.phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @param phoneNumberDescription
     *        The description of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest withPhoneNumberDescription(String phoneNumberDescription) {
        setPhoneNumberDescription(phoneNumberDescription);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImportPhoneNumberRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest addTagsEntry(String key, String value) {
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

    public ImportPhoneNumberRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportPhoneNumberRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getSourcePhoneNumberArn() != null)
            sb.append("SourcePhoneNumberArn: ").append(getSourcePhoneNumberArn()).append(",");
        if (getPhoneNumberDescription() != null)
            sb.append("PhoneNumberDescription: ").append(getPhoneNumberDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportPhoneNumberRequest == false)
            return false;
        ImportPhoneNumberRequest other = (ImportPhoneNumberRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSourcePhoneNumberArn() == null ^ this.getSourcePhoneNumberArn() == null)
            return false;
        if (other.getSourcePhoneNumberArn() != null && other.getSourcePhoneNumberArn().equals(this.getSourcePhoneNumberArn()) == false)
            return false;
        if (other.getPhoneNumberDescription() == null ^ this.getPhoneNumberDescription() == null)
            return false;
        if (other.getPhoneNumberDescription() != null && other.getPhoneNumberDescription().equals(this.getPhoneNumberDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSourcePhoneNumberArn() == null) ? 0 : getSourcePhoneNumberArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberDescription() == null) ? 0 : getPhoneNumberDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ImportPhoneNumberRequest clone() {
        return (ImportPhoneNumberRequest) super.clone();
    }

}
