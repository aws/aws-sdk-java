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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Text extraction encountered one or more page-level errors in the input document.
 * </p>
 * <p>
 * The <code>ErrorCode</code> contains one of the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * TEXTRACT_BAD_PAGE - Amazon Textract cannot read the page. For more information about page limits in Amazon Textract,
 * see <a href="https://docs.aws.amazon.com/textract/latest/dg/limits-document.html"> Page Quotas in Amazon
 * Textract</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED - The number of requests exceeded your throughput limit. For more
 * information about throughput quotas in Amazon Textract, see <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/limits-quotas-explained.html"> Default quotas in Amazon
 * Textract</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * PAGE_CHARACTERS_EXCEEDED - Too many text characters on the page (10,000 characters maximum).
 * </p>
 * </li>
 * <li>
 * <p>
 * PAGE_SIZE_EXCEEDED - The maximum page size is 10 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * INTERNAL_SERVER_ERROR - The request encountered a service issue. Try the API request again.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ErrorsListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     */
    private Integer page;
    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     * 
     * @param page
     *        Page number where the error occurred.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     * 
     * @return Page number where the error occurred.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * Page number where the error occurred.
     * </p>
     * 
     * @param page
     *        Page number where the error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorsListItem withPage(Integer page) {
        setPage(page);
        return this;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * 
     * @param errorCode
     *        Error code for the cause of the error.
     * @see PageBasedErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * 
     * @return Error code for the cause of the error.
     * @see PageBasedErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * 
     * @param errorCode
     *        Error code for the cause of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PageBasedErrorCode
     */

    public ErrorsListItem withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Error code for the cause of the error.
     * </p>
     * 
     * @param errorCode
     *        Error code for the cause of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PageBasedErrorCode
     */

    public ErrorsListItem withErrorCode(PageBasedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * 
     * @param errorMessage
     *        Text message explaining the reason for the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * 
     * @return Text message explaining the reason for the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Text message explaining the reason for the error.
     * </p>
     * 
     * @param errorMessage
     *        Text message explaining the reason for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorsListItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
            sb.append("Page: ").append(getPage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorsListItem == false)
            return false;
        ErrorsListItem other = (ErrorsListItem) obj;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ErrorsListItem clone() {
        try {
            return (ErrorsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ErrorsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
