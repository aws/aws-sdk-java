/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomPluginRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the plugin file.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the location of a custom plugin.
     * </p>
     */
    private CustomPluginLocation location;
    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The type of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The type of the plugin file.
     * @see CustomPluginContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the plugin file.
     * </p>
     * 
     * @return The type of the plugin file.
     * @see CustomPluginContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The type of the plugin file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginContentType
     */

    public CreateCustomPluginRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The type of the plugin file.
     * </p>
     * 
     * @param contentType
     *        The type of the plugin file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginContentType
     */

    public CreateCustomPluginRequest withContentType(CustomPluginContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param description
     *        A summary description of the custom plugin.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @return A summary description of the custom plugin.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param description
     *        A summary description of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the location of a custom plugin.
     * </p>
     * 
     * @param location
     *        Information about the location of a custom plugin.
     */

    public void setLocation(CustomPluginLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of a custom plugin.
     * </p>
     * 
     * @return Information about the location of a custom plugin.
     */

    public CustomPluginLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of a custom plugin.
     * </p>
     * 
     * @param location
     *        Information about the location of a custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginRequest withLocation(CustomPluginLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @return The name of the custom plugin.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomPluginRequest withName(String name) {
        setName(name);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomPluginRequest == false)
            return false;
        CreateCustomPluginRequest other = (CreateCustomPluginRequest) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomPluginRequest clone() {
        return (CreateCustomPluginRequest) super.clone();
    }

}
