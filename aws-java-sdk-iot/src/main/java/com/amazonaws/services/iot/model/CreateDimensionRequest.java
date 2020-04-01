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
public class CreateDimensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     */
    private java.util.List<String> stringValues;
    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to create a new dimension with the same token
     * as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *        to remember what it does.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @return A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *         to remember what it does.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes the type and value to make it easy to
     * remember what it does.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension. Choose something that describes the type and value to make it easy
     *        to remember what it does.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * </p>
     * 
     * @param type
     *        Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * @see DimensionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * </p>
     * 
     * @return Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * @see DimensionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * </p>
     * 
     * @param type
     *        Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public CreateDimensionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * </p>
     * 
     * @param type
     *        Specifies the type of dimension. Supported types: <code>TOPIC_FILTER.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public CreateDimensionRequest withType(DimensionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @return Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this
     *         is a pattern used to match the MQTT topic (for example, "admin/#").
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is a
     * pattern used to match the MQTT topic (for example, "admin/#").
     * </p>
     * 
     * @param stringValues
     *        Specifies the value or list of values for the dimension. For <code>TOPIC_FILTER</code> dimensions, this is
     *        a pattern used to match the MQTT topic (for example, "admin/#").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     * 
     * @return Metadata that can be used to manage the dimension.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the dimension.
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
     * Metadata that can be used to manage the dimension.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the dimension.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to create a new dimension with the same token
     * as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each dimension must have a unique client request token. If you try to create a new dimension with the same
     *        token as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to create a new dimension with the same token
     * as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request.
     * </p>
     * 
     * @return Each dimension must have a unique client request token. If you try to create a new dimension with the
     *         same token as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to create a new dimension with the same token
     * as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each dimension must have a unique client request token. If you try to create a new dimension with the same
     *        token as a dimension that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDimensionRequest withClientRequestToken(String clientRequestToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStringValues() != null)
            sb.append("StringValues: ").append(getStringValues()).append(",");
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

        if (obj instanceof CreateDimensionRequest == false)
            return false;
        CreateDimensionRequest other = (CreateDimensionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDimensionRequest clone() {
        return (CreateDimensionRequest) super.clone();
    }

}
