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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the input to delete.
     * </p>
     */
    private String inputName;

    /**
     * <p>
     * The name of the input to delete.
     * </p>
     * 
     * @param inputName
     *        The name of the input to delete.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the input to delete.
     * </p>
     * 
     * @return The name of the input to delete.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the input to delete.
     * </p>
     * 
     * @param inputName
     *        The name of the input to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInputRequest withInputName(String inputName) {
        setInputName(inputName);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInputRequest == false)
            return false;
        DeleteInputRequest other = (DeleteInputRequest) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInputRequest clone() {
        return (DeleteInputRequest) super.clone();
    }

}
