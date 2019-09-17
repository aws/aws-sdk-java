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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * </p>
     */
    private Boolean recursiveDeleteOption;

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * 
     * @param workGroup
     *        The unique name of the workgroup to delete.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * 
     * @return The unique name of the workgroup to delete.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * 
     * @param workGroup
     *        The unique name of the workgroup to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkGroupRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * </p>
     * 
     * @param recursiveDeleteOption
     *        The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     */

    public void setRecursiveDeleteOption(Boolean recursiveDeleteOption) {
        this.recursiveDeleteOption = recursiveDeleteOption;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * </p>
     * 
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     */

    public Boolean getRecursiveDeleteOption() {
        return this.recursiveDeleteOption;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * </p>
     * 
     * @param recursiveDeleteOption
     *        The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkGroupRequest withRecursiveDeleteOption(Boolean recursiveDeleteOption) {
        setRecursiveDeleteOption(recursiveDeleteOption);
        return this;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * </p>
     * 
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     */

    public Boolean isRecursiveDeleteOption() {
        return this.recursiveDeleteOption;
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getRecursiveDeleteOption() != null)
            sb.append("RecursiveDeleteOption: ").append(getRecursiveDeleteOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkGroupRequest == false)
            return false;
        DeleteWorkGroupRequest other = (DeleteWorkGroupRequest) obj;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getRecursiveDeleteOption() == null ^ this.getRecursiveDeleteOption() == null)
            return false;
        if (other.getRecursiveDeleteOption() != null && other.getRecursiveDeleteOption().equals(this.getRecursiveDeleteOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getRecursiveDeleteOption() == null) ? 0 : getRecursiveDeleteOption().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkGroupRequest clone() {
        return (DeleteWorkGroupRequest) super.clone();
    }

}
