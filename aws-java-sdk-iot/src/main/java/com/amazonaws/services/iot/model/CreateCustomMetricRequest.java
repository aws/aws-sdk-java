/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomMetricRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't
     * begin with <code>aws:</code>. Cannot be updated once defined.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated once defined.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to create a new custom metric that already
     * exists with a different token, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't
     * begin with <code>aws:</code>. Cannot be updated once defined.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric. This will be used in the metric report submitted from the device/thing.
     *        Shouldn't begin with <code>aws:</code>. Cannot be updated once defined.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't
     * begin with <code>aws:</code>. Cannot be updated once defined.
     * </p>
     * 
     * @return The name of the custom metric. This will be used in the metric report submitted from the device/thing.
     *         Shouldn't begin with <code>aws:</code>. Cannot be updated once defined.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't
     * begin with <code>aws:</code>. Cannot be updated once defined.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric. This will be used in the metric report submitted from the device/thing.
     *        Shouldn't begin with <code>aws:</code>. Cannot be updated once defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated once defined.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated once defined.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated once defined.
     * </p>
     * 
     * @return Field represents a friendly name in the console for the custom metric; it doesn't have to be unique.
     *         Don't use this name as the metric identifier in the device metric report. Can be updated once defined.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated once defined.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated once defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @see CustomMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @return The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *         <code>number-list</code>, and <code>number</code>.
     * @see CustomMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomMetricType
     */

    public CreateCustomMetricRequest withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomMetricType
     */

    public CreateCustomMetricRequest withMetricType(CustomMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * 
     * @return Metadata that can be used to manage the custom metric.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the custom metric.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the custom metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the custom metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to create a new custom metric that already
     * exists with a different token, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each custom metric must have a unique client request token. If you try to create a new custom metric that
     *        already exists with a different token, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to create a new custom metric that already
     * exists with a different token, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @return Each custom metric must have a unique client request token. If you try to create a new custom metric that
     *         already exists with a different token, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to create a new custom metric that already
     * exists with a different token, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each custom metric must have a unique client request token. If you try to create a new custom metric that
     *        already exists with a different token, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomMetricRequest == false)
            return false;
        CreateCustomMetricRequest other = (CreateCustomMetricRequest) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomMetricRequest clone() {
        return (CreateCustomMetricRequest) super.clone();
    }

}
