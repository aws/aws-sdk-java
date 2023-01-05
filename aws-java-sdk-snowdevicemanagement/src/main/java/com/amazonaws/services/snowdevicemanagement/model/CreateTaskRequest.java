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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/CreateTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The task to be performed. Only one task is executed on a device at a time.
     * </p>
     */
    private Command command;
    /**
     * <p>
     * A description of the task and its targets.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of managed device IDs.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The task to be performed. Only one task is executed on a device at a time.
     * </p>
     * 
     * @param command
     *        The task to be performed. Only one task is executed on a device at a time.
     */

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * <p>
     * The task to be performed. Only one task is executed on a device at a time.
     * </p>
     * 
     * @return The task to be performed. Only one task is executed on a device at a time.
     */

    public Command getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The task to be performed. Only one task is executed on a device at a time.
     * </p>
     * 
     * @param command
     *        The task to be performed. Only one task is executed on a device at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withCommand(Command command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * A description of the task and its targets.
     * </p>
     * 
     * @param description
     *        A description of the task and its targets.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task and its targets.
     * </p>
     * 
     * @return A description of the task and its targets.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the task and its targets.
     * </p>
     * 
     * @param description
     *        A description of the task and its targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @return Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *         ways, such as by purpose, owner, or environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways,
     * such as by purpose, owner, or environment.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can use tags to categorize a resource in different
     *        ways, such as by purpose, owner, or environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTaskRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest addTagsEntry(String key, String value) {
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

    public CreateTaskRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of managed device IDs.
     * </p>
     * 
     * @return A list of managed device IDs.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of managed device IDs.
     * </p>
     * 
     * @param targets
     *        A list of managed device IDs.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of managed device IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of managed device IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of managed device IDs.
     * </p>
     * 
     * @param targets
     *        A list of managed device IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTaskRequest == false)
            return false;
        CreateTaskRequest other = (CreateTaskRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public CreateTaskRequest clone() {
        return (CreateTaskRequest) super.clone();
    }

}
