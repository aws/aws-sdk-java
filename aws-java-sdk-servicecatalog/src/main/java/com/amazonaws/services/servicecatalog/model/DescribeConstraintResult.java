/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeConstraintResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed constraint information.
     * </p>
     */
    private ConstraintDetail constraintDetail;
    /**
     * <p>
     * The current parameters associated with the specified constraint.
     * </p>
     */
    private String constraintParameters;
    /**
     * <p>
     * The status of the current request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Detailed constraint information.
     * </p>
     * 
     * @param constraintDetail
     *        Detailed constraint information.
     */

    public void setConstraintDetail(ConstraintDetail constraintDetail) {
        this.constraintDetail = constraintDetail;
    }

    /**
     * <p>
     * Detailed constraint information.
     * </p>
     * 
     * @return Detailed constraint information.
     */

    public ConstraintDetail getConstraintDetail() {
        return this.constraintDetail;
    }

    /**
     * <p>
     * Detailed constraint information.
     * </p>
     * 
     * @param constraintDetail
     *        Detailed constraint information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConstraintResult withConstraintDetail(ConstraintDetail constraintDetail) {
        setConstraintDetail(constraintDetail);
        return this;
    }

    /**
     * <p>
     * The current parameters associated with the specified constraint.
     * </p>
     * 
     * @param constraintParameters
     *        The current parameters associated with the specified constraint.
     */

    public void setConstraintParameters(String constraintParameters) {
        this.constraintParameters = constraintParameters;
    }

    /**
     * <p>
     * The current parameters associated with the specified constraint.
     * </p>
     * 
     * @return The current parameters associated with the specified constraint.
     */

    public String getConstraintParameters() {
        return this.constraintParameters;
    }

    /**
     * <p>
     * The current parameters associated with the specified constraint.
     * </p>
     * 
     * @param constraintParameters
     *        The current parameters associated with the specified constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConstraintResult withConstraintParameters(String constraintParameters) {
        setConstraintParameters(constraintParameters);
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @return The status of the current request.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeConstraintResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeConstraintResult withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConstraintDetail() != null)
            sb.append("ConstraintDetail: " + getConstraintDetail() + ",");
        if (getConstraintParameters() != null)
            sb.append("ConstraintParameters: " + getConstraintParameters() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConstraintResult == false)
            return false;
        DescribeConstraintResult other = (DescribeConstraintResult) obj;
        if (other.getConstraintDetail() == null ^ this.getConstraintDetail() == null)
            return false;
        if (other.getConstraintDetail() != null && other.getConstraintDetail().equals(this.getConstraintDetail()) == false)
            return false;
        if (other.getConstraintParameters() == null ^ this.getConstraintParameters() == null)
            return false;
        if (other.getConstraintParameters() != null && other.getConstraintParameters().equals(this.getConstraintParameters()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraintDetail() == null) ? 0 : getConstraintDetail().hashCode());
        hashCode = prime * hashCode + ((getConstraintParameters() == null) ? 0 : getConstraintParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConstraintResult clone() {
        try {
            return (DescribeConstraintResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
