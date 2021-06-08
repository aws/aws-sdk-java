/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Error info for scram secret associate/disassociate failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UnprocessedScramSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedScramSecret implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Error code for associate/disassociate failure.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Error message for associate/disassociate failure.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * AWS Secrets Manager secret ARN.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * Error code for associate/disassociate failure.
     * </p>
     * 
     * @param errorCode
     *        <p>
     *        Error code for associate/disassociate failure.
     *        </p>
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Error code for associate/disassociate failure.
     * </p>
     * 
     * @return <p>
     *         Error code for associate/disassociate failure.
     *         </p>
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Error code for associate/disassociate failure.
     * </p>
     * 
     * @param errorCode
     *        <p>
     *        Error code for associate/disassociate failure.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedScramSecret withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Error message for associate/disassociate failure.
     * </p>
     * 
     * @param errorMessage
     *        <p>
     *        Error message for associate/disassociate failure.
     *        </p>
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Error message for associate/disassociate failure.
     * </p>
     * 
     * @return <p>
     *         Error message for associate/disassociate failure.
     *         </p>
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Error message for associate/disassociate failure.
     * </p>
     * 
     * @param errorMessage
     *        <p>
     *        Error message for associate/disassociate failure.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedScramSecret withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * AWS Secrets Manager secret ARN.
     * </p>
     * 
     * @param secretArn
     *        <p>
     *        AWS Secrets Manager secret ARN.
     *        </p>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * AWS Secrets Manager secret ARN.
     * </p>
     * 
     * @return <p>
     *         AWS Secrets Manager secret ARN.
     *         </p>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * AWS Secrets Manager secret ARN.
     * </p>
     * 
     * @param secretArn
     *        <p>
     *        AWS Secrets Manager secret ARN.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedScramSecret withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedScramSecret == false)
            return false;
        UnprocessedScramSecret other = (UnprocessedScramSecret) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedScramSecret clone() {
        try {
            return (UnprocessedScramSecret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.UnprocessedScramSecretMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
