/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaselineOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBaselineOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>baselineOperation</code> object that shows information about the specified operation ID.
     * </p>
     */
    private BaselineOperation baselineOperation;

    /**
     * <p>
     * A <code>baselineOperation</code> object that shows information about the specified operation ID.
     * </p>
     * 
     * @param baselineOperation
     *        A <code>baselineOperation</code> object that shows information about the specified operation ID.
     */

    public void setBaselineOperation(BaselineOperation baselineOperation) {
        this.baselineOperation = baselineOperation;
    }

    /**
     * <p>
     * A <code>baselineOperation</code> object that shows information about the specified operation ID.
     * </p>
     * 
     * @return A <code>baselineOperation</code> object that shows information about the specified operation ID.
     */

    public BaselineOperation getBaselineOperation() {
        return this.baselineOperation;
    }

    /**
     * <p>
     * A <code>baselineOperation</code> object that shows information about the specified operation ID.
     * </p>
     * 
     * @param baselineOperation
     *        A <code>baselineOperation</code> object that shows information about the specified operation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaselineOperationResult withBaselineOperation(BaselineOperation baselineOperation) {
        setBaselineOperation(baselineOperation);
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
        if (getBaselineOperation() != null)
            sb.append("BaselineOperation: ").append(getBaselineOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBaselineOperationResult == false)
            return false;
        GetBaselineOperationResult other = (GetBaselineOperationResult) obj;
        if (other.getBaselineOperation() == null ^ this.getBaselineOperation() == null)
            return false;
        if (other.getBaselineOperation() != null && other.getBaselineOperation().equals(this.getBaselineOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineOperation() == null) ? 0 : getBaselineOperation().hashCode());
        return hashCode;
    }

    @Override
    public GetBaselineOperationResult clone() {
        try {
            return (GetBaselineOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
