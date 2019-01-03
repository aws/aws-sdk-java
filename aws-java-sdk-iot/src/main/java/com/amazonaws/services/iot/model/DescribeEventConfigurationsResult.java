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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The event configurations.
     * </p>
     */
    private java.util.Map<String, Configuration> eventConfigurations;
    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The event configurations.
     * </p>
     * 
     * @return The event configurations.
     */

    public java.util.Map<String, Configuration> getEventConfigurations() {
        return eventConfigurations;
    }

    /**
     * <p>
     * The event configurations.
     * </p>
     * 
     * @param eventConfigurations
     *        The event configurations.
     */

    public void setEventConfigurations(java.util.Map<String, Configuration> eventConfigurations) {
        this.eventConfigurations = eventConfigurations;
    }

    /**
     * <p>
     * The event configurations.
     * </p>
     * 
     * @param eventConfigurations
     *        The event configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventConfigurationsResult withEventConfigurations(java.util.Map<String, Configuration> eventConfigurations) {
        setEventConfigurations(eventConfigurations);
        return this;
    }

    public DescribeEventConfigurationsResult addEventConfigurationsEntry(String key, Configuration value) {
        if (null == this.eventConfigurations) {
            this.eventConfigurations = new java.util.HashMap<String, Configuration>();
        }
        if (this.eventConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventConfigurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventConfigurationsResult clearEventConfigurationsEntries() {
        this.eventConfigurations = null;
        return this;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the event configuration.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     * 
     * @return The creation date of the event configuration.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the event configuration.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the event configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventConfigurationsResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the event configurations were last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     * 
     * @return The date the event configurations were last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the event configurations were last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the event configurations were last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventConfigurationsResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getEventConfigurations() != null)
            sb.append("EventConfigurations: ").append(getEventConfigurations()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventConfigurationsResult == false)
            return false;
        DescribeEventConfigurationsResult other = (DescribeEventConfigurationsResult) obj;
        if (other.getEventConfigurations() == null ^ this.getEventConfigurations() == null)
            return false;
        if (other.getEventConfigurations() != null && other.getEventConfigurations().equals(this.getEventConfigurations()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventConfigurations() == null) ? 0 : getEventConfigurations().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventConfigurationsResult clone() {
        try {
            return (DescribeEventConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
