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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A name for the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     */
    private java.util.List<Monitor> monitors;
    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * 
     * @param name
     *        A name for the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * 
     * @return A name for the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * 
     * @param name
     *        A name for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @param description
     *        A description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @return A description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @param description
     *        A description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * 
     * @return Amazon CloudWatch alarms to monitor during the deployment process.
     */

    public java.util.List<Monitor> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms to monitor during the deployment process.
     */

    public void setMonitors(java.util.Collection<Monitor> monitors) {
        if (monitors == null) {
            this.monitors = null;
            return;
        }

        this.monitors = new java.util.ArrayList<Monitor>(monitors);
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitors(java.util.Collection)} or {@link #withMonitors(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms to monitor during the deployment process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withMonitors(Monitor... monitors) {
        if (this.monitors == null) {
            setMonitors(new java.util.ArrayList<Monitor>(monitors.length));
        }
        for (Monitor ele : monitors) {
            this.monitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms to monitor during the deployment process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withMonitors(java.util.Collection<Monitor> monitors) {
        setMonitors(monitors);
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @return Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each
     *         tag consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each
     *        tag consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each
     *        tag consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearTagsEntries() {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMonitors() != null)
            sb.append("Monitors: ").append(getMonitors()).append(",");
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

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMonitors() == null ^ this.getMonitors() == null)
            return false;
        if (other.getMonitors() != null && other.getMonitors().equals(this.getMonitors()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMonitors() == null) ? 0 : getMonitors().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
