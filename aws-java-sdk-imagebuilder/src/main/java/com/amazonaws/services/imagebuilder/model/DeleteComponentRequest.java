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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version to delete.
     * </p>
     */
    private String componentBuildVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version to delete.
     * </p>
     * 
     * @param componentBuildVersionArn
     *        The Amazon Resource Name (ARN) of the component build version to delete.
     */

    public void setComponentBuildVersionArn(String componentBuildVersionArn) {
        this.componentBuildVersionArn = componentBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component build version to delete.
     */

    public String getComponentBuildVersionArn() {
        return this.componentBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version to delete.
     * </p>
     * 
     * @param componentBuildVersionArn
     *        The Amazon Resource Name (ARN) of the component build version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteComponentRequest withComponentBuildVersionArn(String componentBuildVersionArn) {
        setComponentBuildVersionArn(componentBuildVersionArn);
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
        if (getComponentBuildVersionArn() != null)
            sb.append("ComponentBuildVersionArn: ").append(getComponentBuildVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteComponentRequest == false)
            return false;
        DeleteComponentRequest other = (DeleteComponentRequest) obj;
        if (other.getComponentBuildVersionArn() == null ^ this.getComponentBuildVersionArn() == null)
            return false;
        if (other.getComponentBuildVersionArn() != null && other.getComponentBuildVersionArn().equals(this.getComponentBuildVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentBuildVersionArn() == null) ? 0 : getComponentBuildVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteComponentRequest clone() {
        return (DeleteComponentRequest) super.clone();
    }

}
