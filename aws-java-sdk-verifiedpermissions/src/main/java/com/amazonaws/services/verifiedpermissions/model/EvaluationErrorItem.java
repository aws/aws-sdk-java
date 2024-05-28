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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a description of an evaluation error.
 * </p>
 * <p>
 * This data type is a response parameter of the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>, <a
 * href
 * ="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_BatchIsAuthorized.html">BatchIsAuthorized
 * </a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
 * >IsAuthorizedWithToken</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/EvaluationErrorItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationErrorItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error description.
     * </p>
     */
    private String errorDescription;

    /**
     * <p>
     * The error description.
     * </p>
     * 
     * @param errorDescription
     *        The error description.
     */

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * <p>
     * The error description.
     * </p>
     * 
     * @return The error description.
     */

    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * <p>
     * The error description.
     * </p>
     * 
     * @param errorDescription
     *        The error description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationErrorItem withErrorDescription(String errorDescription) {
        setErrorDescription(errorDescription);
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
        if (getErrorDescription() != null)
            sb.append("ErrorDescription: ").append(getErrorDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationErrorItem == false)
            return false;
        EvaluationErrorItem other = (EvaluationErrorItem) obj;
        if (other.getErrorDescription() == null ^ this.getErrorDescription() == null)
            return false;
        if (other.getErrorDescription() != null && other.getErrorDescription().equals(this.getErrorDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorDescription() == null) ? 0 : getErrorDescription().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationErrorItem clone() {
        try {
            return (EvaluationErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.EvaluationErrorItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
