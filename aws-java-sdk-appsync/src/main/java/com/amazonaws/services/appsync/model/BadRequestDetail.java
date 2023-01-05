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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides further details for the reason behind the bad request. For reason type <code>CODE_ERROR</code>, the detail
 * will contain a list of code errors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/BadRequestDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the list of errors in the request.
     * </p>
     */
    private java.util.List<CodeError> codeErrors;

    /**
     * <p>
     * Contains the list of errors in the request.
     * </p>
     * 
     * @return Contains the list of errors in the request.
     */

    public java.util.List<CodeError> getCodeErrors() {
        return codeErrors;
    }

    /**
     * <p>
     * Contains the list of errors in the request.
     * </p>
     * 
     * @param codeErrors
     *        Contains the list of errors in the request.
     */

    public void setCodeErrors(java.util.Collection<CodeError> codeErrors) {
        if (codeErrors == null) {
            this.codeErrors = null;
            return;
        }

        this.codeErrors = new java.util.ArrayList<CodeError>(codeErrors);
    }

    /**
     * <p>
     * Contains the list of errors in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeErrors(java.util.Collection)} or {@link #withCodeErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param codeErrors
     *        Contains the list of errors in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetail withCodeErrors(CodeError... codeErrors) {
        if (this.codeErrors == null) {
            setCodeErrors(new java.util.ArrayList<CodeError>(codeErrors.length));
        }
        for (CodeError ele : codeErrors) {
            this.codeErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the list of errors in the request.
     * </p>
     * 
     * @param codeErrors
     *        Contains the list of errors in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestDetail withCodeErrors(java.util.Collection<CodeError> codeErrors) {
        setCodeErrors(codeErrors);
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
        if (getCodeErrors() != null)
            sb.append("CodeErrors: ").append(getCodeErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BadRequestDetail == false)
            return false;
        BadRequestDetail other = (BadRequestDetail) obj;
        if (other.getCodeErrors() == null ^ this.getCodeErrors() == null)
            return false;
        if (other.getCodeErrors() != null && other.getCodeErrors().equals(this.getCodeErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeErrors() == null) ? 0 : getCodeErrors().hashCode());
        return hashCode;
    }

    @Override
    public BadRequestDetail clone() {
        try {
            return (BadRequestDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.BadRequestDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
