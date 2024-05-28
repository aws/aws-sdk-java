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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDbParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB parameter group. The name must be unique per customer and per region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the DB parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     */
    private Parameters parameters;
    /**
     * <p>
     * A list of key-value pairs to associate with the DB parameter group.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the DB parameter group. The name must be unique per customer and per region.
     * </p>
     * 
     * @param name
     *        The name of the DB parameter group. The name must be unique per customer and per region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DB parameter group. The name must be unique per customer and per region.
     * </p>
     * 
     * @return The name of the DB parameter group. The name must be unique per customer and per region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DB parameter group. The name must be unique per customer and per region.
     * </p>
     * 
     * @param name
     *        The name of the DB parameter group. The name must be unique per customer and per region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the DB parameter group.
     * </p>
     * 
     * @param description
     *        A description of the DB parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the DB parameter group.
     * </p>
     * 
     * @return A description of the DB parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the DB parameter group.
     * </p>
     * 
     * @param description
     *        A description of the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @param parameters
     *        A list of the parameters that comprise the DB parameter group.
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @return A list of the parameters that comprise the DB parameter group.
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @param parameters
     *        A list of the parameters that comprise the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupRequest withParameters(Parameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB parameter group.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the DB parameter group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB parameter group.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the DB parameter group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the DB parameter group.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDbParameterGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupRequest addTagsEntry(String key, String value) {
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

    public CreateDbParameterGroupRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
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

        if (obj instanceof CreateDbParameterGroupRequest == false)
            return false;
        CreateDbParameterGroupRequest other = (CreateDbParameterGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDbParameterGroupRequest clone() {
        return (CreateDbParameterGroupRequest) super.clone();
    }

}
