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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the resource group integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ResourceGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the propagation process for the resource group. The states includes:
     * </p>
     * <p>
     * <code>CREATING </code>if the resource group is in the process of being created.
     * </p>
     * <p>
     * <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     * </p>
     * <p>
     * <code>CREATE_FAILED</code> if the resource group failed to be created.
     * </p>
     * <p>
     * <code>UPDATING</code> if the resource group is in the process of being updated.
     * </p>
     * <p>
     * <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     * </p>
     * <p>
     * <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The Amazon resource name (ARN) of the resource group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The error message that generates when the propagation process for the resource group fails.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The state of the propagation process for the resource group. The states includes:
     * </p>
     * <p>
     * <code>CREATING </code>if the resource group is in the process of being created.
     * </p>
     * <p>
     * <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     * </p>
     * <p>
     * <code>CREATE_FAILED</code> if the resource group failed to be created.
     * </p>
     * <p>
     * <code>UPDATING</code> if the resource group is in the process of being updated.
     * </p>
     * <p>
     * <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     * </p>
     * <p>
     * <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * </p>
     * 
     * @param state
     *        The state of the propagation process for the resource group. The states includes:</p>
     *        <p>
     *        <code>CREATING </code>if the resource group is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     *        </p>
     *        <p>
     *        <code>CREATE_FAILED</code> if the resource group failed to be created.
     *        </p>
     *        <p>
     *        <code>UPDATING</code> if the resource group is in the process of being updated.
     *        </p>
     *        <p>
     *        <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     *        </p>
     *        <p>
     *        <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * @see ResourceGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the propagation process for the resource group. The states includes:
     * </p>
     * <p>
     * <code>CREATING </code>if the resource group is in the process of being created.
     * </p>
     * <p>
     * <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     * </p>
     * <p>
     * <code>CREATE_FAILED</code> if the resource group failed to be created.
     * </p>
     * <p>
     * <code>UPDATING</code> if the resource group is in the process of being updated.
     * </p>
     * <p>
     * <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     * </p>
     * <p>
     * <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * </p>
     * 
     * @return The state of the propagation process for the resource group. The states includes:</p>
     *         <p>
     *         <code>CREATING </code>if the resource group is in the process of being created.
     *         </p>
     *         <p>
     *         <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     *         </p>
     *         <p>
     *         <code>CREATE_FAILED</code> if the resource group failed to be created.
     *         </p>
     *         <p>
     *         <code>UPDATING</code> if the resource group is in the process of being updated.
     *         </p>
     *         <p>
     *         <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     *         </p>
     *         <p>
     *         <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * @see ResourceGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the propagation process for the resource group. The states includes:
     * </p>
     * <p>
     * <code>CREATING </code>if the resource group is in the process of being created.
     * </p>
     * <p>
     * <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     * </p>
     * <p>
     * <code>CREATE_FAILED</code> if the resource group failed to be created.
     * </p>
     * <p>
     * <code>UPDATING</code> if the resource group is in the process of being updated.
     * </p>
     * <p>
     * <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     * </p>
     * <p>
     * <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * </p>
     * 
     * @param state
     *        The state of the propagation process for the resource group. The states includes:</p>
     *        <p>
     *        <code>CREATING </code>if the resource group is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     *        </p>
     *        <p>
     *        <code>CREATE_FAILED</code> if the resource group failed to be created.
     *        </p>
     *        <p>
     *        <code>UPDATING</code> if the resource group is in the process of being updated.
     *        </p>
     *        <p>
     *        <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     *        </p>
     *        <p>
     *        <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceGroupState
     */

    public ResourceGroup withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the propagation process for the resource group. The states includes:
     * </p>
     * <p>
     * <code>CREATING </code>if the resource group is in the process of being created.
     * </p>
     * <p>
     * <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     * </p>
     * <p>
     * <code>CREATE_FAILED</code> if the resource group failed to be created.
     * </p>
     * <p>
     * <code>UPDATING</code> if the resource group is in the process of being updated.
     * </p>
     * <p>
     * <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     * </p>
     * <p>
     * <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * </p>
     * 
     * @param state
     *        The state of the propagation process for the resource group. The states includes:</p>
     *        <p>
     *        <code>CREATING </code>if the resource group is in the process of being created.
     *        </p>
     *        <p>
     *        <code>CREATE_COMPLETE</code> if the resource group was created successfully.
     *        </p>
     *        <p>
     *        <code>CREATE_FAILED</code> if the resource group failed to be created.
     *        </p>
     *        <p>
     *        <code>UPDATING</code> if the resource group is in the process of being updated.
     *        </p>
     *        <p>
     *        <code>UPDATE_COMPLETE</code> if the resource group updated successfully.
     *        </p>
     *        <p>
     *        <code>UPDATE_FAILED</code> if the resource group could not update successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceGroupState
     */

    public ResourceGroup withState(ResourceGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource group.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) of the resource group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource group.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the resource group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource group.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The error message that generates when the propagation process for the resource group fails.
     * </p>
     * 
     * @param errorMessage
     *        The error message that generates when the propagation process for the resource group fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that generates when the propagation process for the resource group fails.
     * </p>
     * 
     * @return The error message that generates when the propagation process for the resource group fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that generates when the propagation process for the resource group fails.
     * </p>
     * 
     * @param errorMessage
     *        The error message that generates when the propagation process for the resource group fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceGroup == false)
            return false;
        ResourceGroup other = (ResourceGroup) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ResourceGroup clone() {
        try {
            return (ResourceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ResourceGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
