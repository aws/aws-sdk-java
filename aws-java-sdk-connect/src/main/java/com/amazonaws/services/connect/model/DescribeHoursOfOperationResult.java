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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeHoursOfOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHoursOfOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The hours of operation.
     * </p>
     */
    private HoursOfOperation hoursOfOperation;

    /**
     * <p>
     * The hours of operation.
     * </p>
     * 
     * @param hoursOfOperation
     *        The hours of operation.
     */

    public void setHoursOfOperation(HoursOfOperation hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    /**
     * <p>
     * The hours of operation.
     * </p>
     * 
     * @return The hours of operation.
     */

    public HoursOfOperation getHoursOfOperation() {
        return this.hoursOfOperation;
    }

    /**
     * <p>
     * The hours of operation.
     * </p>
     * 
     * @param hoursOfOperation
     *        The hours of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHoursOfOperationResult withHoursOfOperation(HoursOfOperation hoursOfOperation) {
        setHoursOfOperation(hoursOfOperation);
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
        if (getHoursOfOperation() != null)
            sb.append("HoursOfOperation: ").append(getHoursOfOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHoursOfOperationResult == false)
            return false;
        DescribeHoursOfOperationResult other = (DescribeHoursOfOperationResult) obj;
        if (other.getHoursOfOperation() == null ^ this.getHoursOfOperation() == null)
            return false;
        if (other.getHoursOfOperation() != null && other.getHoursOfOperation().equals(this.getHoursOfOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHoursOfOperation() == null) ? 0 : getHoursOfOperation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHoursOfOperationResult clone() {
        try {
            return (DescribeHoursOfOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
