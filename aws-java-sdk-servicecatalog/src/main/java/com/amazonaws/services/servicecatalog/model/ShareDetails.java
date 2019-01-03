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
 * Information about the portfolio share operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ShareDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     */
    private java.util.List<String> successfulShares;
    /**
     * <p>
     * List of errors.
     * </p>
     */
    private java.util.List<ShareError> shareErrors;

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * 
     * @return List of accounts for whom the operation succeeded.
     */

    public java.util.List<String> getSuccessfulShares() {
        return successfulShares;
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * 
     * @param successfulShares
     *        List of accounts for whom the operation succeeded.
     */

    public void setSuccessfulShares(java.util.Collection<String> successfulShares) {
        if (successfulShares == null) {
            this.successfulShares = null;
            return;
        }

        this.successfulShares = new java.util.ArrayList<String>(successfulShares);
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulShares(java.util.Collection)} or {@link #withSuccessfulShares(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param successfulShares
     *        List of accounts for whom the operation succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withSuccessfulShares(String... successfulShares) {
        if (this.successfulShares == null) {
            setSuccessfulShares(new java.util.ArrayList<String>(successfulShares.length));
        }
        for (String ele : successfulShares) {
            this.successfulShares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of accounts for whom the operation succeeded.
     * </p>
     * 
     * @param successfulShares
     *        List of accounts for whom the operation succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withSuccessfulShares(java.util.Collection<String> successfulShares) {
        setSuccessfulShares(successfulShares);
        return this;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * 
     * @return List of errors.
     */

    public java.util.List<ShareError> getShareErrors() {
        return shareErrors;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * 
     * @param shareErrors
     *        List of errors.
     */

    public void setShareErrors(java.util.Collection<ShareError> shareErrors) {
        if (shareErrors == null) {
            this.shareErrors = null;
            return;
        }

        this.shareErrors = new java.util.ArrayList<ShareError>(shareErrors);
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareErrors(java.util.Collection)} or {@link #withShareErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param shareErrors
     *        List of errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareErrors(ShareError... shareErrors) {
        if (this.shareErrors == null) {
            setShareErrors(new java.util.ArrayList<ShareError>(shareErrors.length));
        }
        for (ShareError ele : shareErrors) {
            this.shareErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of errors.
     * </p>
     * 
     * @param shareErrors
     *        List of errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareErrors(java.util.Collection<ShareError> shareErrors) {
        setShareErrors(shareErrors);
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
        if (getSuccessfulShares() != null)
            sb.append("SuccessfulShares: ").append(getSuccessfulShares()).append(",");
        if (getShareErrors() != null)
            sb.append("ShareErrors: ").append(getShareErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareDetails == false)
            return false;
        ShareDetails other = (ShareDetails) obj;
        if (other.getSuccessfulShares() == null ^ this.getSuccessfulShares() == null)
            return false;
        if (other.getSuccessfulShares() != null && other.getSuccessfulShares().equals(this.getSuccessfulShares()) == false)
            return false;
        if (other.getShareErrors() == null ^ this.getShareErrors() == null)
            return false;
        if (other.getShareErrors() != null && other.getShareErrors().equals(this.getShareErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulShares() == null) ? 0 : getSuccessfulShares().hashCode());
        hashCode = prime * hashCode + ((getShareErrors() == null) ? 0 : getShareErrors().hashCode());
        return hashCode;
    }

    @Override
    public ShareDetails clone() {
        try {
            return (ShareDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ShareDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
