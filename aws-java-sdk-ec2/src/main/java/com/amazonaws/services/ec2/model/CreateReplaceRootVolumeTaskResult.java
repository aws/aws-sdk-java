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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplaceRootVolumeTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     */
    private ReplaceRootVolumeTask replaceRootVolumeTask;

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTask
     *        Information about the root volume replacement task.
     */

    public void setReplaceRootVolumeTask(ReplaceRootVolumeTask replaceRootVolumeTask) {
        this.replaceRootVolumeTask = replaceRootVolumeTask;
    }

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @return Information about the root volume replacement task.
     */

    public ReplaceRootVolumeTask getReplaceRootVolumeTask() {
        return this.replaceRootVolumeTask;
    }

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTask
     *        Information about the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplaceRootVolumeTaskResult withReplaceRootVolumeTask(ReplaceRootVolumeTask replaceRootVolumeTask) {
        setReplaceRootVolumeTask(replaceRootVolumeTask);
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
        if (getReplaceRootVolumeTask() != null)
            sb.append("ReplaceRootVolumeTask: ").append(getReplaceRootVolumeTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplaceRootVolumeTaskResult == false)
            return false;
        CreateReplaceRootVolumeTaskResult other = (CreateReplaceRootVolumeTaskResult) obj;
        if (other.getReplaceRootVolumeTask() == null ^ this.getReplaceRootVolumeTask() == null)
            return false;
        if (other.getReplaceRootVolumeTask() != null && other.getReplaceRootVolumeTask().equals(this.getReplaceRootVolumeTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplaceRootVolumeTask() == null) ? 0 : getReplaceRootVolumeTask().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplaceRootVolumeTaskResult clone() {
        try {
            return (CreateReplaceRootVolumeTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
