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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about an undetected signature on a page where it was expected but not found.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/UndetectedSignature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UndetectedSignature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The page where a signature was expected but not found.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * The page where a signature was expected but not found.
     * </p>
     * 
     * @param page
     *        The page where a signature was expected but not found.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * The page where a signature was expected but not found.
     * </p>
     * 
     * @return The page where a signature was expected but not found.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * The page where a signature was expected but not found.
     * </p>
     * 
     * @param page
     *        The page where a signature was expected but not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UndetectedSignature withPage(Integer page) {
        setPage(page);
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
        if (getPage() != null)
            sb.append("Page: ").append(getPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UndetectedSignature == false)
            return false;
        UndetectedSignature other = (UndetectedSignature) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        return hashCode;
    }

    @Override
    public UndetectedSignature clone() {
        try {
            return (UndetectedSignature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.UndetectedSignatureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
