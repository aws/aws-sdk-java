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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about of the hours of operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HoursOfOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     */
    private String hoursOfOperationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     */
    private String hoursOfOperationArn;
    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     */
    private String timeZone;
    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     */
    private java.util.List<HoursOfOperationConfig> config;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationId
     *        The identifier for the hours of operation.
     */

    public void setHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @return The identifier for the hours of operation.
     */

    public String getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationId
     *        The identifier for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withHoursOfOperationId(String hoursOfOperationId) {
        setHoursOfOperationId(hoursOfOperationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationArn
     *        The Amazon Resource Name (ARN) for the hours of operation.
     */

    public void setHoursOfOperationArn(String hoursOfOperationArn) {
        this.hoursOfOperationArn = hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the hours of operation.
     */

    public String getHoursOfOperationArn() {
        return this.hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     * 
     * @param hoursOfOperationArn
     *        The Amazon Resource Name (ARN) for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withHoursOfOperationArn(String hoursOfOperationArn) {
        setHoursOfOperationArn(hoursOfOperationArn);
        return this;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * 
     * @param name
     *        The name for the hours of operation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * 
     * @return The name for the hours of operation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the hours of operation.
     * </p>
     * 
     * @param name
     *        The name for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * 
     * @param description
     *        The description for the hours of operation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * 
     * @return The description for the hours of operation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the hours of operation.
     * </p>
     * 
     * @param description
     *        The description for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     * 
     * @param timeZone
     *        The time zone for the hours of operation.
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     * 
     * @return The time zone for the hours of operation.
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * The time zone for the hours of operation.
     * </p>
     * 
     * @param timeZone
     *        The time zone for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withTimeZone(String timeZone) {
        setTimeZone(timeZone);
        return this;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * 
     * @return Configuration information for the hours of operation.
     */

    public java.util.List<HoursOfOperationConfig> getConfig() {
        return config;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * 
     * @param config
     *        Configuration information for the hours of operation.
     */

    public void setConfig(java.util.Collection<HoursOfOperationConfig> config) {
        if (config == null) {
            this.config = null;
            return;
        }

        this.config = new java.util.ArrayList<HoursOfOperationConfig>(config);
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfig(java.util.Collection)} or {@link #withConfig(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param config
     *        Configuration information for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withConfig(HoursOfOperationConfig... config) {
        if (this.config == null) {
            setConfig(new java.util.ArrayList<HoursOfOperationConfig>(config.length));
        }
        for (HoursOfOperationConfig ele : config) {
            this.config.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for the hours of operation.
     * </p>
     * 
     * @param config
     *        Configuration information for the hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withConfig(java.util.Collection<HoursOfOperationConfig> config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see HoursOfOperation#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperation addTagsEntry(String key, String value) {
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

    public HoursOfOperation clearTagsEntries() {
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
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: ").append(getHoursOfOperationId()).append(",");
        if (getHoursOfOperationArn() != null)
            sb.append("HoursOfOperationArn: ").append(getHoursOfOperationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimeZone() != null)
            sb.append("TimeZone: ").append(getTimeZone()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
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

        if (obj instanceof HoursOfOperation == false)
            return false;
        HoursOfOperation other = (HoursOfOperation) obj;
        if (other.getHoursOfOperationId() == null ^ this.getHoursOfOperationId() == null)
            return false;
        if (other.getHoursOfOperationId() != null && other.getHoursOfOperationId().equals(this.getHoursOfOperationId()) == false)
            return false;
        if (other.getHoursOfOperationArn() == null ^ this.getHoursOfOperationArn() == null)
            return false;
        if (other.getHoursOfOperationArn() != null && other.getHoursOfOperationArn().equals(this.getHoursOfOperationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
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

        hashCode = prime * hashCode + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode + ((getHoursOfOperationArn() == null) ? 0 : getHoursOfOperationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public HoursOfOperation clone() {
        try {
            return (HoursOfOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HoursOfOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
