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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A finding from a <code>BatchUpdateFindings</code> request that Security Hub was unable to update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindingsUnprocessedFinding"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateFindingsUnprocessedFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the finding that was not updated.
     * </p>
     */
    private AwsSecurityFindingIdentifier findingIdentifier;
    /**
     * <p>
     * The code associated with the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message associated with the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the finding that was not updated.
     * </p>
     * 
     * @param findingIdentifier
     *        The identifier of the finding that was not updated.
     */

    public void setFindingIdentifier(AwsSecurityFindingIdentifier findingIdentifier) {
        this.findingIdentifier = findingIdentifier;
    }

    /**
     * <p>
     * The identifier of the finding that was not updated.
     * </p>
     * 
     * @return The identifier of the finding that was not updated.
     */

    public AwsSecurityFindingIdentifier getFindingIdentifier() {
        return this.findingIdentifier;
    }

    /**
     * <p>
     * The identifier of the finding that was not updated.
     * </p>
     * 
     * @param findingIdentifier
     *        The identifier of the finding that was not updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsUnprocessedFinding withFindingIdentifier(AwsSecurityFindingIdentifier findingIdentifier) {
        setFindingIdentifier(findingIdentifier);
        return this;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the error.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @return The code associated with the error.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsUnprocessedFinding withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param errorMessage
     *        The message associated with the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @return The message associated with the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param errorMessage
     *        The message associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsUnprocessedFinding withErrorMessage(String errorMessage) {
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
        if (getFindingIdentifier() != null)
            sb.append("FindingIdentifier: ").append(getFindingIdentifier()).append(",");
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

        if (obj instanceof BatchUpdateFindingsUnprocessedFinding == false)
            return false;
        BatchUpdateFindingsUnprocessedFinding other = (BatchUpdateFindingsUnprocessedFinding) obj;
        if (other.getFindingIdentifier() == null ^ this.getFindingIdentifier() == null)
            return false;
        if (other.getFindingIdentifier() != null && other.getFindingIdentifier().equals(this.getFindingIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getFindingIdentifier() == null) ? 0 : getFindingIdentifier().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateFindingsUnprocessedFinding clone() {
        try {
            return (BatchUpdateFindingsUnprocessedFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.BatchUpdateFindingsUnprocessedFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
