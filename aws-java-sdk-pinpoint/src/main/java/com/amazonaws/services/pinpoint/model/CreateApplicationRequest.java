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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the display name of an application and the tags to associate with the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApplicationRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon Pinpoint
     * console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the application. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon Pinpoint
     * console.
     * </p>
     * 
     * @param name
     *        The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon
     *        Pinpoint console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon Pinpoint
     * console.
     * </p>
     * 
     * @return The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon
     *         Pinpoint console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon Pinpoint
     * console.
     * </p>
     * 
     * @param name
     *        The display name of the application. This name is displayed as the <b>Project name</b> on the Amazon
     *        Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the application. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags to associate with the application. Each
     *         tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the application. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the application. Each
     *        tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the application. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the application. Each
     *        tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
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

    public CreateApplicationRequest clearTagsEntries() {
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

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        try {
            return (CreateApplicationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CreateApplicationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
