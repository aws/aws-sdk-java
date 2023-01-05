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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetControlOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private ControlOperation controlOperation;

    /**
     * <p/>
     * 
     * @param controlOperation
     */

    public void setControlOperation(ControlOperation controlOperation) {
        this.controlOperation = controlOperation;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ControlOperation getControlOperation() {
        return this.controlOperation;
    }

    /**
     * <p/>
     * 
     * @param controlOperation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetControlOperationResult withControlOperation(ControlOperation controlOperation) {
        setControlOperation(controlOperation);
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
        if (getControlOperation() != null)
            sb.append("ControlOperation: ").append(getControlOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetControlOperationResult == false)
            return false;
        GetControlOperationResult other = (GetControlOperationResult) obj;
        if (other.getControlOperation() == null ^ this.getControlOperation() == null)
            return false;
        if (other.getControlOperation() != null && other.getControlOperation().equals(this.getControlOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlOperation() == null) ? 0 : getControlOperation().hashCode());
        return hashCode;
    }

    @Override
    public GetControlOperationResult clone() {
        try {
            return (GetControlOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
