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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Parameters of a <code>Config</code>.
     * </p>
     */
    private ConfigTypeData configData;
    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Tags assigned to a <code>Config</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Parameters of a <code>Config</code>.
     * </p>
     * 
     * @param configData
     *        Parameters of a <code>Config</code>.
     */

    public void setConfigData(ConfigTypeData configData) {
        this.configData = configData;
    }

    /**
     * <p>
     * Parameters of a <code>Config</code>.
     * </p>
     * 
     * @return Parameters of a <code>Config</code>.
     */

    public ConfigTypeData getConfigData() {
        return this.configData;
    }

    /**
     * <p>
     * Parameters of a <code>Config</code>.
     * </p>
     * 
     * @param configData
     *        Parameters of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigRequest withConfigData(ConfigTypeData configData) {
        setConfigData(configData);
        return this;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @param name
     *        Name of a <code>Config</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @return Name of a <code>Config</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a <code>Config</code>.
     * </p>
     * 
     * @param name
     *        Name of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Tags assigned to a <code>Config</code>.
     * </p>
     * 
     * @return Tags assigned to a <code>Config</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to a <code>Config</code>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a <code>Config</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to a <code>Config</code>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfigRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigRequest addTagsEntry(String key, String value) {
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

    public CreateConfigRequest clearTagsEntries() {
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
        if (getConfigData() != null)
            sb.append("ConfigData: ").append(getConfigData()).append(",");
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

        if (obj instanceof CreateConfigRequest == false)
            return false;
        CreateConfigRequest other = (CreateConfigRequest) obj;
        if (other.getConfigData() == null ^ this.getConfigData() == null)
            return false;
        if (other.getConfigData() != null && other.getConfigData().equals(this.getConfigData()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getConfigData() == null) ? 0 : getConfigData().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigRequest clone() {
        return (CreateConfigRequest) super.clone();
    }

}
