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
package com.amazonaws.services.iot1clickdevices.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devices-2018-05-14/FinalizeDeviceClaim" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FinalizeDeviceClaimRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1", "key2":
     * "value2"} }. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * 
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @return The unique identifier of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceId
     *        The unique identifier of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinalizeDeviceClaimRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1", "key2":
     * "value2"} }. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * 
     * </p>
     * 
     * @return A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1",
     *         "key2": "value2"} }. For more information, see <a
     *         href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging
     *         Strategies</a>.</p>
     *         <p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1", "key2":
     * "value2"} }. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * 
     * </p>
     * 
     * @param tags
     *        A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1",
     *        "key2": "value2"} }. For more information, see <a
     *        href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging
     *        Strategies</a>.</p>
     *        <p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1", "key2":
     * "value2"} }. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <p>
     * 
     * </p>
     * 
     * @param tags
     *        A collection of key/value pairs defining the resource tags. For example, { "tags": {"key1": "value1",
     *        "key2": "value2"} }. For more information, see <a
     *        href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging
     *        Strategies</a>.</p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinalizeDeviceClaimRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public FinalizeDeviceClaimRequest addTagsEntry(String key, String value) {
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

    public FinalizeDeviceClaimRequest clearTagsEntries() {
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
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

        if (obj instanceof FinalizeDeviceClaimRequest == false)
            return false;
        FinalizeDeviceClaimRequest other = (FinalizeDeviceClaimRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
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

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public FinalizeDeviceClaimRequest clone() {
        return (FinalizeDeviceClaimRequest) super.clone();
    }

}
