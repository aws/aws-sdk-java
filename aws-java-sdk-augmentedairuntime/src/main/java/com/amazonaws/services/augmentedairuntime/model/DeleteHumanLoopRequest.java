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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHumanLoopRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the human loop you want to delete.
     * </p>
     */
    private String humanLoopName;

    /**
     * <p>
     * The name of the human loop you want to delete.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop you want to delete.
     */

    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop you want to delete.
     * </p>
     * 
     * @return The name of the human loop you want to delete.
     */

    public String getHumanLoopName() {
        return this.humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop you want to delete.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHumanLoopRequest withHumanLoopName(String humanLoopName) {
        setHumanLoopName(humanLoopName);
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: ").append(getHumanLoopName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHumanLoopRequest == false)
            return false;
        DeleteHumanLoopRequest other = (DeleteHumanLoopRequest) obj;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHumanLoopRequest clone() {
        return (DeleteHumanLoopRequest) super.clone();
    }

}
