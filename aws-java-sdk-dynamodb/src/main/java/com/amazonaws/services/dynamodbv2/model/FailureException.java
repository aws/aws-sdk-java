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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a failure a contributor insights operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/FailureException" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureException implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Exception name.
     * </p>
     */
    private String exceptionName;
    /**
     * <p>
     * Description of the failure.
     * </p>
     */
    private String exceptionDescription;

    /**
     * <p>
     * Exception name.
     * </p>
     * 
     * @param exceptionName
     *        Exception name.
     */

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    /**
     * <p>
     * Exception name.
     * </p>
     * 
     * @return Exception name.
     */

    public String getExceptionName() {
        return this.exceptionName;
    }

    /**
     * <p>
     * Exception name.
     * </p>
     * 
     * @param exceptionName
     *        Exception name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureException withExceptionName(String exceptionName) {
        setExceptionName(exceptionName);
        return this;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     * 
     * @param exceptionDescription
     *        Description of the failure.
     */

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     * 
     * @return Description of the failure.
     */

    public String getExceptionDescription() {
        return this.exceptionDescription;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     * 
     * @param exceptionDescription
     *        Description of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureException withExceptionDescription(String exceptionDescription) {
        setExceptionDescription(exceptionDescription);
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
        if (getExceptionName() != null)
            sb.append("ExceptionName: ").append(getExceptionName()).append(",");
        if (getExceptionDescription() != null)
            sb.append("ExceptionDescription: ").append(getExceptionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureException == false)
            return false;
        FailureException other = (FailureException) obj;
        if (other.getExceptionName() == null ^ this.getExceptionName() == null)
            return false;
        if (other.getExceptionName() != null && other.getExceptionName().equals(this.getExceptionName()) == false)
            return false;
        if (other.getExceptionDescription() == null ^ this.getExceptionDescription() == null)
            return false;
        if (other.getExceptionDescription() != null && other.getExceptionDescription().equals(this.getExceptionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExceptionName() == null) ? 0 : getExceptionName().hashCode());
        hashCode = prime * hashCode + ((getExceptionDescription() == null) ? 0 : getExceptionDescription().hashCode());
        return hashCode;
    }

    @Override
    public FailureException clone() {
        try {
            return (FailureException) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.FailureExceptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
