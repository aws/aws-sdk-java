/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the context. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     */
    private String contextName;
    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     */
    private ContextSource source;
    /**
     * <p>
     * The context type.
     * </p>
     */
    private String contextType;
    /**
     * <p>
     * The description of the context.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of properties to add to the context.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * A list of tags to apply to the context.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the context. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param contextName
     *        The name of the context. Must be unique to your account in an Amazon Web Services Region.
     */

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    /**
     * <p>
     * The name of the context. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the context. Must be unique to your account in an Amazon Web Services Region.
     */

    public String getContextName() {
        return this.contextName;
    }

    /**
     * <p>
     * The name of the context. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param contextName
     *        The name of the context. Must be unique to your account in an Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withContextName(String contextName) {
        setContextName(contextName);
        return this;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @param source
     *        The source type, ID, and URI.
     */

    public void setSource(ContextSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @return The source type, ID, and URI.
     */

    public ContextSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @param source
     *        The source type, ID, and URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withSource(ContextSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The context type.
     * </p>
     * 
     * @param contextType
     *        The context type.
     */

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    /**
     * <p>
     * The context type.
     * </p>
     * 
     * @return The context type.
     */

    public String getContextType() {
        return this.contextType;
    }

    /**
     * <p>
     * The context type.
     * </p>
     * 
     * @param contextType
     *        The context type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withContextType(String contextType) {
        setContextType(contextType);
        return this;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @param description
     *        The description of the context.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @return The description of the context.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @param description
     *        The description of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of properties to add to the context.
     * </p>
     * 
     * @return A list of properties to add to the context.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of properties to add to the context.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the context.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of properties to add to the context.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see CreateContextRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the context.
     * </p>
     * 
     * @return A list of tags to apply to the context.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the context.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the context.
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
     * A list of tags to apply to the context.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withTags(Tag... tags) {
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
     * A list of tags to apply to the context.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContextRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getContextName() != null)
            sb.append("ContextName: ").append(getContextName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getContextType() != null)
            sb.append("ContextType: ").append(getContextType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
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

        if (obj instanceof CreateContextRequest == false)
            return false;
        CreateContextRequest other = (CreateContextRequest) obj;
        if (other.getContextName() == null ^ this.getContextName() == null)
            return false;
        if (other.getContextName() != null && other.getContextName().equals(this.getContextName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getContextType() == null ^ this.getContextType() == null)
            return false;
        if (other.getContextType() != null && other.getContextType().equals(this.getContextType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
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

        hashCode = prime * hashCode + ((getContextName() == null) ? 0 : getContextName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getContextType() == null) ? 0 : getContextType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateContextRequest clone() {
        return (CreateContextRequest) super.clone();
    }

}
