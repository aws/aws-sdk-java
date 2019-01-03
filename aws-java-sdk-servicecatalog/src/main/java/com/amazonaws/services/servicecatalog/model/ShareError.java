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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Errors that occurred during the portfolio share operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ShareError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * Information about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     */
    private String error;

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * 
     * @return List of accounts impacted by the error.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * 
     * @param accounts
     *        List of accounts impacted by the error.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        List of accounts impacted by the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareError withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of accounts impacted by the error.
     * </p>
     * 
     * @param accounts
     *        List of accounts impacted by the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareError withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @param message
     *        Information about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @return Information about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @param message
     *        Information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     * 
     * @param error
     *        Error type that happened when processing the operation.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     * 
     * @return Error type that happened when processing the operation.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * Error type that happened when processing the operation.
     * </p>
     * 
     * @param error
     *        Error type that happened when processing the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareError withError(String error) {
        setError(error);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareError == false)
            return false;
        ShareError other = (ShareError) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public ShareError clone() {
        try {
            return (ShareError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ShareErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
