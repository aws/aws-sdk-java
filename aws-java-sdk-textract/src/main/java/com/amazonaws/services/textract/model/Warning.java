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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A warning about an issue that occurred during asynchronous text analysis (<a>StartDocumentAnalysis</a>) or
 * asynchronous document-text detection (<a>StartDocumentTextDetection</a>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Warning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Warning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for the warning.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     */
    private java.util.List<Integer> pages;

    /**
     * <p>
     * The error code for the warning.
     * </p>
     * 
     * @param errorCode
     *        The error code for the warning.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the warning.
     * </p>
     * 
     * @return The error code for the warning.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the warning.
     * </p>
     * 
     * @param errorCode
     *        The error code for the warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * 
     * @return A list of the pages that the warning applies to.
     */

    public java.util.List<Integer> getPages() {
        return pages;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * 
     * @param pages
     *        A list of the pages that the warning applies to.
     */

    public void setPages(java.util.Collection<Integer> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Integer>(pages);
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     *        A list of the pages that the warning applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withPages(Integer... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<Integer>(pages.length));
        }
        for (Integer ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * 
     * @param pages
     *        A list of the pages that the warning applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warning withPages(java.util.Collection<Integer> pages) {
        setPages(pages);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Warning == false)
            return false;
        Warning other = (Warning) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        return hashCode;
    }

    @Override
    public Warning clone() {
        try {
            return (Warning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.WarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
