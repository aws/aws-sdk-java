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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Athena query error. The <code>AthenaError</code> feature provides standardized error
 * information to help you understand failed queries and take steps after a query failure occurs.
 * <code>AthenaError</code> includes an <code>ErrorCategory</code> field that specifies whether the cause of the failed
 * query is due to system error, user error, or other error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/AthenaError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An integer value that specifies the category of a query failure error. The following list shows the category for
     * each integer value.
     * </p>
     * <p>
     * <b>1</b> - System
     * </p>
     * <p>
     * <b>2</b> - User
     * </p>
     * <p>
     * <b>3</b> - Other
     * </p>
     */
    private Integer errorCategory;
    /**
     * <p>
     * An integer value that provides specific information about an Athena query error. For the meaning of specific
     * values, see the <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     * >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     */
    private Integer errorType;
    /**
     * <p>
     * True if the query might succeed if resubmitted.
     * </p>
     */
    private Boolean retryable;
    /**
     * <p>
     * Contains a short description of the error that occurred.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * An integer value that specifies the category of a query failure error. The following list shows the category for
     * each integer value.
     * </p>
     * <p>
     * <b>1</b> - System
     * </p>
     * <p>
     * <b>2</b> - User
     * </p>
     * <p>
     * <b>3</b> - Other
     * </p>
     * 
     * @param errorCategory
     *        An integer value that specifies the category of a query failure error. The following list shows the
     *        category for each integer value.</p>
     *        <p>
     *        <b>1</b> - System
     *        </p>
     *        <p>
     *        <b>2</b> - User
     *        </p>
     *        <p>
     *        <b>3</b> - Other
     */

    public void setErrorCategory(Integer errorCategory) {
        this.errorCategory = errorCategory;
    }

    /**
     * <p>
     * An integer value that specifies the category of a query failure error. The following list shows the category for
     * each integer value.
     * </p>
     * <p>
     * <b>1</b> - System
     * </p>
     * <p>
     * <b>2</b> - User
     * </p>
     * <p>
     * <b>3</b> - Other
     * </p>
     * 
     * @return An integer value that specifies the category of a query failure error. The following list shows the
     *         category for each integer value.</p>
     *         <p>
     *         <b>1</b> - System
     *         </p>
     *         <p>
     *         <b>2</b> - User
     *         </p>
     *         <p>
     *         <b>3</b> - Other
     */

    public Integer getErrorCategory() {
        return this.errorCategory;
    }

    /**
     * <p>
     * An integer value that specifies the category of a query failure error. The following list shows the category for
     * each integer value.
     * </p>
     * <p>
     * <b>1</b> - System
     * </p>
     * <p>
     * <b>2</b> - User
     * </p>
     * <p>
     * <b>3</b> - Other
     * </p>
     * 
     * @param errorCategory
     *        An integer value that specifies the category of a query failure error. The following list shows the
     *        category for each integer value.</p>
     *        <p>
     *        <b>1</b> - System
     *        </p>
     *        <p>
     *        <b>2</b> - User
     *        </p>
     *        <p>
     *        <b>3</b> - Other
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaError withErrorCategory(Integer errorCategory) {
        setErrorCategory(errorCategory);
        return this;
    }

    /**
     * <p>
     * An integer value that provides specific information about an Athena query error. For the meaning of specific
     * values, see the <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     * >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param errorType
     *        An integer value that provides specific information about an Athena query error. For the meaning of
     *        specific values, see the <a href=
     *        "https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     *        >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     */

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * An integer value that provides specific information about an Athena query error. For the meaning of specific
     * values, see the <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     * >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @return An integer value that provides specific information about an Athena query error. For the meaning of
     *         specific values, see the <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     *         >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     */

    public Integer getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * An integer value that provides specific information about an Athena query error. For the meaning of specific
     * values, see the <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     * >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param errorType
     *        An integer value that provides specific information about an Athena query error. For the meaning of
     *        specific values, see the <a href=
     *        "https://docs.aws.amazon.com/athena/latest/ug/error-reference.html#error-reference-error-type-reference"
     *        >Error Type Reference</a> in the <i>Amazon Athena User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaError withErrorType(Integer errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * True if the query might succeed if resubmitted.
     * </p>
     * 
     * @param retryable
     *        True if the query might succeed if resubmitted.
     */

    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    /**
     * <p>
     * True if the query might succeed if resubmitted.
     * </p>
     * 
     * @return True if the query might succeed if resubmitted.
     */

    public Boolean getRetryable() {
        return this.retryable;
    }

    /**
     * <p>
     * True if the query might succeed if resubmitted.
     * </p>
     * 
     * @param retryable
     *        True if the query might succeed if resubmitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaError withRetryable(Boolean retryable) {
        setRetryable(retryable);
        return this;
    }

    /**
     * <p>
     * True if the query might succeed if resubmitted.
     * </p>
     * 
     * @return True if the query might succeed if resubmitted.
     */

    public Boolean isRetryable() {
        return this.retryable;
    }

    /**
     * <p>
     * Contains a short description of the error that occurred.
     * </p>
     * 
     * @param errorMessage
     *        Contains a short description of the error that occurred.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Contains a short description of the error that occurred.
     * </p>
     * 
     * @return Contains a short description of the error that occurred.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Contains a short description of the error that occurred.
     * </p>
     * 
     * @param errorMessage
     *        Contains a short description of the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaError withErrorMessage(String errorMessage) {
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
        if (getErrorCategory() != null)
            sb.append("ErrorCategory: ").append(getErrorCategory()).append(",");
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType()).append(",");
        if (getRetryable() != null)
            sb.append("Retryable: ").append(getRetryable()).append(",");
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

        if (obj instanceof AthenaError == false)
            return false;
        AthenaError other = (AthenaError) obj;
        if (other.getErrorCategory() == null ^ this.getErrorCategory() == null)
            return false;
        if (other.getErrorCategory() != null && other.getErrorCategory().equals(this.getErrorCategory()) == false)
            return false;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getRetryable() == null ^ this.getRetryable() == null)
            return false;
        if (other.getRetryable() != null && other.getRetryable().equals(this.getRetryable()) == false)
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

        hashCode = prime * hashCode + ((getErrorCategory() == null) ? 0 : getErrorCategory().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode + ((getRetryable() == null) ? 0 : getRetryable().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public AthenaError clone() {
        try {
            return (AthenaError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.AthenaErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
