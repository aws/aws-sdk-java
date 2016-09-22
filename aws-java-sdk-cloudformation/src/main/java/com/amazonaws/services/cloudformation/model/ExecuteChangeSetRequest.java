/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>ExecuteChangeSet</a> action.
 * </p>
 */
public class ExecuteChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the specified stack.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change
     * set you want to execute.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the specified stack.
     * </p>
     * 
     * @param changeSetName
     *        The name or ARN of the change set that you want use to update the specified stack.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the specified stack.
     * </p>
     * 
     * @return The name or ARN of the change set that you want use to update the specified stack.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name or ARN of the change set that you want use to update the specified stack.
     * </p>
     * 
     * @param changeSetName
     *        The name or ARN of the change set that you want use to update the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteChangeSetRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change
     * set you want to execute.
     * </p>
     * 
     * @param stackName
     *        If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the
     *        change set you want to execute.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change
     * set you want to execute.
     * </p>
     * 
     * @return If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the
     *         change set you want to execute.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change
     * set you want to execute.
     * </p>
     * 
     * @param stackName
     *        If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the
     *        change set you want to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteChangeSetRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteChangeSetRequest == false)
            return false;
        ExecuteChangeSetRequest other = (ExecuteChangeSetRequest) obj;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteChangeSetRequest clone() {
        return (ExecuteChangeSetRequest) super.clone();
    }
}
