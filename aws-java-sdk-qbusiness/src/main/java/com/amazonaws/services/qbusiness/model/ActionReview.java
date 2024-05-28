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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An output event that Amazon Q Business returns to an user who wants to perform a plugin action during a non-streaming
 * chat conversation. It contains information about the selected action with a list of possible user input fields, some
 * pre-populated by Amazon Q Business.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ActionReview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionReview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the plugin associated with the action review.
     * </p>
     */
    private String pluginId;
    /**
     * <p>
     * The type of plugin.
     * </p>
     */
    private String pluginType;
    /**
     * <p>
     * Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     * requested plugin action.
     * </p>
     */
    private java.util.Map<String, ActionReviewPayloadField> payload;
    /**
     * <p>
     * A string used to retain information about the hierarchical contexts within an action review payload.
     * </p>
     */
    private String payloadFieldNameSeparator;

    /**
     * <p>
     * The identifier of the plugin associated with the action review.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin associated with the action review.
     */

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin associated with the action review.
     * </p>
     * 
     * @return The identifier of the plugin associated with the action review.
     */

    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin associated with the action review.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin associated with the action review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReview withPluginId(String pluginId) {
        setPluginId(pluginId);
        return this;
    }

    /**
     * <p>
     * The type of plugin.
     * </p>
     * 
     * @param pluginType
     *        The type of plugin.
     * @see PluginType
     */

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    /**
     * <p>
     * The type of plugin.
     * </p>
     * 
     * @return The type of plugin.
     * @see PluginType
     */

    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * <p>
     * The type of plugin.
     * </p>
     * 
     * @param pluginType
     *        The type of plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public ActionReview withPluginType(String pluginType) {
        setPluginType(pluginType);
        return this;
    }

    /**
     * <p>
     * The type of plugin.
     * </p>
     * 
     * @param pluginType
     *        The type of plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public ActionReview withPluginType(PluginType pluginType) {
        this.pluginType = pluginType.toString();
        return this;
    }

    /**
     * <p>
     * Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     * requested plugin action.
     * </p>
     * 
     * @return Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     *         requested plugin action.
     */

    public java.util.Map<String, ActionReviewPayloadField> getPayload() {
        return payload;
    }

    /**
     * <p>
     * Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     * requested plugin action.
     * </p>
     * 
     * @param payload
     *        Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     *        requested plugin action.
     */

    public void setPayload(java.util.Map<String, ActionReviewPayloadField> payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     * requested plugin action.
     * </p>
     * 
     * @param payload
     *        Field values that an end user needs to provide to Amazon Q Business for Amazon Q Business to perform the
     *        requested plugin action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReview withPayload(java.util.Map<String, ActionReviewPayloadField> payload) {
        setPayload(payload);
        return this;
    }

    /**
     * Add a single Payload entry
     *
     * @see ActionReview#withPayload
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ActionReview addPayloadEntry(String key, ActionReviewPayloadField value) {
        if (null == this.payload) {
            this.payload = new java.util.HashMap<String, ActionReviewPayloadField>();
        }
        if (this.payload.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.payload.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Payload.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReview clearPayloadEntries() {
        this.payload = null;
        return this;
    }

    /**
     * <p>
     * A string used to retain information about the hierarchical contexts within an action review payload.
     * </p>
     * 
     * @param payloadFieldNameSeparator
     *        A string used to retain information about the hierarchical contexts within an action review payload.
     */

    public void setPayloadFieldNameSeparator(String payloadFieldNameSeparator) {
        this.payloadFieldNameSeparator = payloadFieldNameSeparator;
    }

    /**
     * <p>
     * A string used to retain information about the hierarchical contexts within an action review payload.
     * </p>
     * 
     * @return A string used to retain information about the hierarchical contexts within an action review payload.
     */

    public String getPayloadFieldNameSeparator() {
        return this.payloadFieldNameSeparator;
    }

    /**
     * <p>
     * A string used to retain information about the hierarchical contexts within an action review payload.
     * </p>
     * 
     * @param payloadFieldNameSeparator
     *        A string used to retain information about the hierarchical contexts within an action review payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReview withPayloadFieldNameSeparator(String payloadFieldNameSeparator) {
        setPayloadFieldNameSeparator(payloadFieldNameSeparator);
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
        if (getPluginId() != null)
            sb.append("PluginId: ").append(getPluginId()).append(",");
        if (getPluginType() != null)
            sb.append("PluginType: ").append(getPluginType()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getPayloadFieldNameSeparator() != null)
            sb.append("PayloadFieldNameSeparator: ").append(getPayloadFieldNameSeparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionReview == false)
            return false;
        ActionReview other = (ActionReview) obj;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        if (other.getPluginType() == null ^ this.getPluginType() == null)
            return false;
        if (other.getPluginType() != null && other.getPluginType().equals(this.getPluginType()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getPayloadFieldNameSeparator() == null ^ this.getPayloadFieldNameSeparator() == null)
            return false;
        if (other.getPayloadFieldNameSeparator() != null && other.getPayloadFieldNameSeparator().equals(this.getPayloadFieldNameSeparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        hashCode = prime * hashCode + ((getPluginType() == null) ? 0 : getPluginType().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getPayloadFieldNameSeparator() == null) ? 0 : getPayloadFieldNameSeparator().hashCode());
        return hashCode;
    }

    @Override
    public ActionReview clone() {
        try {
            return (ActionReview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.ActionReviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
