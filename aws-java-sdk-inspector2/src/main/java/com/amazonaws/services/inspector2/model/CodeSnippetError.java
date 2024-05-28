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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about any errors encountered while trying to retrieve a code snippet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CodeSnippetError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSnippetError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for the error that prevented a code snippet from being retrieved.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message received when Amazon Inspector failed to retrieve a code snippet.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The ARN of the finding that a code snippet couldn't be retrieved for.
     * </p>
     */
    private String findingArn;

    /**
     * <p>
     * The error code for the error that prevented a code snippet from being retrieved.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that prevented a code snippet from being retrieved.
     * @see CodeSnippetErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the error that prevented a code snippet from being retrieved.
     * </p>
     * 
     * @return The error code for the error that prevented a code snippet from being retrieved.
     * @see CodeSnippetErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the error that prevented a code snippet from being retrieved.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that prevented a code snippet from being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeSnippetErrorCode
     */

    public CodeSnippetError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the error that prevented a code snippet from being retrieved.
     * </p>
     * 
     * @param errorCode
     *        The error code for the error that prevented a code snippet from being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeSnippetErrorCode
     */

    public CodeSnippetError withErrorCode(CodeSnippetErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message received when Amazon Inspector failed to retrieve a code snippet.
     * </p>
     * 
     * @param errorMessage
     *        The error message received when Amazon Inspector failed to retrieve a code snippet.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message received when Amazon Inspector failed to retrieve a code snippet.
     * </p>
     * 
     * @return The error message received when Amazon Inspector failed to retrieve a code snippet.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message received when Amazon Inspector failed to retrieve a code snippet.
     * </p>
     * 
     * @param errorMessage
     *        The error message received when Amazon Inspector failed to retrieve a code snippet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The ARN of the finding that a code snippet couldn't be retrieved for.
     * </p>
     * 
     * @param findingArn
     *        The ARN of the finding that a code snippet couldn't be retrieved for.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The ARN of the finding that a code snippet couldn't be retrieved for.
     * </p>
     * 
     * @return The ARN of the finding that a code snippet couldn't be retrieved for.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The ARN of the finding that a code snippet couldn't be retrieved for.
     * </p>
     * 
     * @param findingArn
     *        The ARN of the finding that a code snippet couldn't be retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetError withFindingArn(String findingArn) {
        setFindingArn(findingArn);
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSnippetError == false)
            return false;
        CodeSnippetError other = (CodeSnippetError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        return hashCode;
    }

    @Override
    public CodeSnippetError clone() {
        try {
            return (CodeSnippetError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CodeSnippetErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
