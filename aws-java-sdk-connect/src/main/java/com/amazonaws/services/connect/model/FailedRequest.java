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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request for which contact failed to be generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/FailedRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to create a contact.
     * </p>
     */
    private String requestIdentifier;
    /**
     * <p>
     * Reason code for the failure.
     * </p>
     */
    private String failureReasonCode;
    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     */
    private String failureReasonMessage;

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to create a contact.
     * </p>
     * 
     * @param requestIdentifier
     *        Request identifier provided in the API call in the ContactDataRequest to create a contact.
     */

    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to create a contact.
     * </p>
     * 
     * @return Request identifier provided in the API call in the ContactDataRequest to create a contact.
     */

    public String getRequestIdentifier() {
        return this.requestIdentifier;
    }

    /**
     * <p>
     * Request identifier provided in the API call in the ContactDataRequest to create a contact.
     * </p>
     * 
     * @param requestIdentifier
     *        Request identifier provided in the API call in the ContactDataRequest to create a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedRequest withRequestIdentifier(String requestIdentifier) {
        setRequestIdentifier(requestIdentifier);
        return this;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * 
     * @param failureReasonCode
     *        Reason code for the failure.
     * @see FailureReasonCode
     */

    public void setFailureReasonCode(String failureReasonCode) {
        this.failureReasonCode = failureReasonCode;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * 
     * @return Reason code for the failure.
     * @see FailureReasonCode
     */

    public String getFailureReasonCode() {
        return this.failureReasonCode;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * 
     * @param failureReasonCode
     *        Reason code for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReasonCode
     */

    public FailedRequest withFailureReasonCode(String failureReasonCode) {
        setFailureReasonCode(failureReasonCode);
        return this;
    }

    /**
     * <p>
     * Reason code for the failure.
     * </p>
     * 
     * @param failureReasonCode
     *        Reason code for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReasonCode
     */

    public FailedRequest withFailureReasonCode(FailureReasonCode failureReasonCode) {
        this.failureReasonCode = failureReasonCode.toString();
        return this;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     * 
     * @param failureReasonMessage
     *        Why the request to create a contact failed.
     */

    public void setFailureReasonMessage(String failureReasonMessage) {
        this.failureReasonMessage = failureReasonMessage;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     * 
     * @return Why the request to create a contact failed.
     */

    public String getFailureReasonMessage() {
        return this.failureReasonMessage;
    }

    /**
     * <p>
     * Why the request to create a contact failed.
     * </p>
     * 
     * @param failureReasonMessage
     *        Why the request to create a contact failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedRequest withFailureReasonMessage(String failureReasonMessage) {
        setFailureReasonMessage(failureReasonMessage);
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
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: ").append(getRequestIdentifier()).append(",");
        if (getFailureReasonCode() != null)
            sb.append("FailureReasonCode: ").append(getFailureReasonCode()).append(",");
        if (getFailureReasonMessage() != null)
            sb.append("FailureReasonMessage: ").append(getFailureReasonMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedRequest == false)
            return false;
        FailedRequest other = (FailedRequest) obj;
        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getFailureReasonCode() == null ^ this.getFailureReasonCode() == null)
            return false;
        if (other.getFailureReasonCode() != null && other.getFailureReasonCode().equals(this.getFailureReasonCode()) == false)
            return false;
        if (other.getFailureReasonMessage() == null ^ this.getFailureReasonMessage() == null)
            return false;
        if (other.getFailureReasonMessage() != null && other.getFailureReasonMessage().equals(this.getFailureReasonMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFailureReasonCode() == null) ? 0 : getFailureReasonCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReasonMessage() == null) ? 0 : getFailureReasonMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedRequest clone() {
        try {
            return (FailedRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.FailedRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
