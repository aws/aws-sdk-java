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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a security control for which a response couldn't be returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UnprocessedSecurityControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedSecurityControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both
     * parameters) for which a response couldn't be returned.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The error code for the unprocessed security control.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The reason why the security control was unprocessed.
     * </p>
     */
    private String errorReason;

    /**
     * <p>
     * The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both
     * parameters) for which a response couldn't be returned.
     * </p>
     * 
     * @param securityControlId
     *        The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     *        both parameters) for which a response couldn't be returned.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both
     * parameters) for which a response couldn't be returned.
     * </p>
     * 
     * @return The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     *         both parameters) for which a response couldn't be returned.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both
     * parameters) for which a response couldn't be returned.
     * </p>
     * 
     * @param securityControlId
     *        The control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     *        both parameters) for which a response couldn't be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedSecurityControl withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed security control.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed security control.
     * @see UnprocessedErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed security control.
     * </p>
     * 
     * @return The error code for the unprocessed security control.
     * @see UnprocessedErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed security control.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed security control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedSecurityControl withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed security control.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed security control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedSecurityControl withErrorCode(UnprocessedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the security control was unprocessed.
     * </p>
     * 
     * @param errorReason
     *        The reason why the security control was unprocessed.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * The reason why the security control was unprocessed.
     * </p>
     * 
     * @return The reason why the security control was unprocessed.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * The reason why the security control was unprocessed.
     * </p>
     * 
     * @param errorReason
     *        The reason why the security control was unprocessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedSecurityControl withErrorReason(String errorReason) {
        setErrorReason(errorReason);
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedSecurityControl == false)
            return false;
        UnprocessedSecurityControl other = (UnprocessedSecurityControl) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedSecurityControl clone() {
        try {
            return (UnprocessedSecurityControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.UnprocessedSecurityControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
