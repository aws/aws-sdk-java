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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the operations that are allowed on a maintenance track.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SupportedOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedOperation implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     */
    private String operationName;

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     * 
     * @param operationName
     *        A list of the supported operations.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     * 
     * @return A list of the supported operations.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     * 
     * @param operationName
     *        A list of the supported operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedOperation withOperationName(String operationName) {
        setOperationName(operationName);
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
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedOperation == false)
            return false;
        SupportedOperation other = (SupportedOperation) obj;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        return hashCode;
    }

    @Override
    public SupportedOperation clone() {
        try {
            return (SupportedOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
