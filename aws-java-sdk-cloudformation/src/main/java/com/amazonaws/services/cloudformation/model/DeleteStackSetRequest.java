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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStackSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     * <a>ListStackSets</a>.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     * <a>ListStackSets</a>.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     *        <a>ListStackSets</a>.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     * <a>ListStackSets</a>.
     * </p>
     * 
     * @return The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     *         <a>ListStackSets</a>.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     * <a>ListStackSets</a>.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you're deleting. You can obtain this value by running
     *        <a>ListStackSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStackSetRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStackSetRequest == false)
            return false;
        DeleteStackSetRequest other = (DeleteStackSetRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStackSetRequest clone() {
        return (DeleteStackSetRequest) super.clone();
    }

}
