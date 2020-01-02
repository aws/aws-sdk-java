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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This array is empty if the API operation was successful for all the rules specified in the request. If the operation
 * could not process one of the rules, the following data is returned for each of those rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PartialFailure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartialFailure implements Serializable, Cloneable {

    /**
     * <p>
     * The specified rule that could not be deleted.
     * </p>
     */
    private String failureResource;
    /**
     * <p>
     * The type of error.
     * </p>
     */
    private String exceptionType;
    /**
     * <p>
     * The code of the error.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * A description of the error.
     * </p>
     */
    private String failureDescription;

    /**
     * <p>
     * The specified rule that could not be deleted.
     * </p>
     * 
     * @param failureResource
     *        The specified rule that could not be deleted.
     */

    public void setFailureResource(String failureResource) {
        this.failureResource = failureResource;
    }

    /**
     * <p>
     * The specified rule that could not be deleted.
     * </p>
     * 
     * @return The specified rule that could not be deleted.
     */

    public String getFailureResource() {
        return this.failureResource;
    }

    /**
     * <p>
     * The specified rule that could not be deleted.
     * </p>
     * 
     * @param failureResource
     *        The specified rule that could not be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialFailure withFailureResource(String failureResource) {
        setFailureResource(failureResource);
        return this;
    }

    /**
     * <p>
     * The type of error.
     * </p>
     * 
     * @param exceptionType
     *        The type of error.
     */

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    /**
     * <p>
     * The type of error.
     * </p>
     * 
     * @return The type of error.
     */

    public String getExceptionType() {
        return this.exceptionType;
    }

    /**
     * <p>
     * The type of error.
     * </p>
     * 
     * @param exceptionType
     *        The type of error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialFailure withExceptionType(String exceptionType) {
        setExceptionType(exceptionType);
        return this;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @param failureCode
     *        The code of the error.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @return The code of the error.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The code of the error.
     * </p>
     * 
     * @param failureCode
     *        The code of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @param failureDescription
     *        A description of the error.
     */

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @return A description of the error.
     */

    public String getFailureDescription() {
        return this.failureDescription;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @param failureDescription
     *        A description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialFailure withFailureDescription(String failureDescription) {
        setFailureDescription(failureDescription);
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
        if (getFailureResource() != null)
            sb.append("FailureResource: ").append(getFailureResource()).append(",");
        if (getExceptionType() != null)
            sb.append("ExceptionType: ").append(getExceptionType()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureDescription() != null)
            sb.append("FailureDescription: ").append(getFailureDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartialFailure == false)
            return false;
        PartialFailure other = (PartialFailure) obj;
        if (other.getFailureResource() == null ^ this.getFailureResource() == null)
            return false;
        if (other.getFailureResource() != null && other.getFailureResource().equals(this.getFailureResource()) == false)
            return false;
        if (other.getExceptionType() == null ^ this.getExceptionType() == null)
            return false;
        if (other.getExceptionType() != null && other.getExceptionType().equals(this.getExceptionType()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null)
            return false;
        if (other.getFailureDescription() != null && other.getFailureDescription().equals(this.getFailureDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureResource() == null) ? 0 : getFailureResource().hashCode());
        hashCode = prime * hashCode + ((getExceptionType() == null) ? 0 : getExceptionType().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        return hashCode;
    }

    @Override
    public PartialFailure clone() {
        try {
            return (PartialFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
