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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelCommandRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the command you want to cancel.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     * canceled on every instance on which it was requested.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;

    /**
     * <p>
     * The ID of the command you want to cancel.
     * </p>
     * 
     * @param commandId
     *        The ID of the command you want to cancel.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * The ID of the command you want to cancel.
     * </p>
     * 
     * @return The ID of the command you want to cancel.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * The ID of the command you want to cancel.
     * </p>
     * 
     * @param commandId
     *        The ID of the command you want to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCommandRequest withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     * canceled on every instance on which it was requested.
     * </p>
     * 
     * @return (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command
     *         is canceled on every instance on which it was requested.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     * canceled on every instance on which it was requested.
     * </p>
     * 
     * @param instanceIds
     *        (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     *        canceled on every instance on which it was requested.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     * canceled on every instance on which it was requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     *        canceled on every instance on which it was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCommandRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     * canceled on every instance on which it was requested.
     * </p>
     * 
     * @param instanceIds
     *        (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is
     *        canceled on every instance on which it was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelCommandRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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
        if (getCommandId() != null)
            sb.append("CommandId: ").append(getCommandId()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelCommandRequest == false)
            return false;
        CancelCommandRequest other = (CancelCommandRequest) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        return hashCode;
    }

    @Override
    public CancelCommandRequest clone() {
        return (CancelCommandRequest) super.clone();
    }

}
