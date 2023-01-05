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
     * The code associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request was being
     * processed. This error may also occur if you call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a> and <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     * <code>FindingIdentifier</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     * existing finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> syntax.
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;
    /**
     * <p>
     * The message associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Concurrent finding updates detected</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Identifier is duplicated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Not Found</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding size exceeded 240 KB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Internal service failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid Input</code>
     * </p>
     * </li>
     * </ul>
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
     * The code associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request was being
     * processed. This error may also occur if you call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a> and <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     * <code>FindingIdentifier</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     * existing finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> syntax.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The code associated with the error. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request
     *        was being processed. This error may also occur if you call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *        <code>BatchUpdateFindings</code> </a> and <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *        <code>BatchImportFindings</code> </a> at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     *        <code>FindingIdentifier</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     *        existing finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *        Web Services Security Finding Format</a> syntax.
     *        </p>
     *        </li>
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request was being
     * processed. This error may also occur if you call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a> and <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     * <code>FindingIdentifier</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     * existing finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> syntax.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The code associated with the error. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request
     *         was being processed. This error may also occur if you call <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *         <code>BatchUpdateFindings</code> </a> and <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *         <code>BatchImportFindings</code> </a> at the same time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     *         <code>FindingIdentifier</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match
     *         an existing finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     *         href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *         Web Services Security Finding Format</a> syntax.
     *         </p>
     *         </li>
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request was being
     * processed. This error may also occur if you call <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     * <code>BatchUpdateFindings</code> </a> and <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     * <code>BatchImportFindings</code> </a> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     * <code>FindingIdentifier</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     * existing finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon Web
     * Services Security Finding Format</a> syntax.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The code associated with the error. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ConcurrentUpdateError</code> - Another request attempted to update the finding while this request
     *        was being processed. This error may also occur if you call <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateFindings.html">
     *        <code>BatchUpdateFindings</code> </a> and <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchImportFindings.html">
     *        <code>BatchImportFindings</code> </a> at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DuplicatedFindingIdentifier</code> - The request included two or more findings with the same
     *        <code>FindingIdentifier</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FindingNotFound</code> - The <code>FindingIdentifier</code> included in the request did not match an
     *        existing finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FindingSizeExceeded</code> - The finding size was greater than the permissible value of 240 KB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InternalFailure</code> - An internal service failure occurred when updating the finding.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidInput</code> - The finding update contained an invalid value that did not satisfy the <a
     *        href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html">Amazon
     *        Web Services Security Finding Format</a> syntax.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsUnprocessedFinding withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Concurrent finding updates detected</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Identifier is duplicated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Not Found</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding size exceeded 240 KB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Internal service failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid Input</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorMessage
     *        The message associated with the error. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Concurrent finding updates detected</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding Identifier is duplicated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding Not Found</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding size exceeded 240 KB</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Internal service failure</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid Input</code>
     *        </p>
     *        </li>
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Concurrent finding updates detected</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Identifier is duplicated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Not Found</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding size exceeded 240 KB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Internal service failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid Input</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message associated with the error. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Concurrent finding updates detected</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Finding Identifier is duplicated</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Finding Not Found</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Finding size exceeded 240 KB</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Internal service failure</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid Input</code>
     *         </p>
     *         </li>
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message associated with the error. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Concurrent finding updates detected</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Identifier is duplicated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding Not Found</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Finding size exceeded 240 KB</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Internal service failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid Input</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorMessage
     *        The message associated with the error. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Concurrent finding updates detected</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding Identifier is duplicated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding Not Found</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Finding size exceeded 240 KB</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Internal service failure</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid Input</code>
     *        </p>
     *        </li>
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
