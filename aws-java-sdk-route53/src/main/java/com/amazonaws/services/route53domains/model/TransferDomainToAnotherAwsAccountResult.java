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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>TransferDomainToAnotherAwsAccount</code> response includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/TransferDomainToAnotherAwsAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferDomainToAnotherAwsAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the operation status, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that the domain is being transferred to must
     * submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     * <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     */
    private String password;

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the operation status, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To query the operation status, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *        >GetOperationDetail</a>.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the operation status, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * 
     * @return Identifier for tracking the progress of the request. To query the operation status, use <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *         >GetOperationDetail</a>.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the operation status, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * 
     * @param operationId
     *        Identifier for tracking the progress of the request. To query the operation status, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *        >GetOperationDetail</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainToAnotherAwsAccountResult withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that the domain is being transferred to must
     * submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     * <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     * 
     * @param password
     *        To finish transferring a domain to another AWS account, the account that the domain is being transferred
     *        to must submit an <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *        >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     *        <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code>
     *        response.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that the domain is being transferred to must
     * submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     * <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     * 
     * @return To finish transferring a domain to another AWS account, the account that the domain is being transferred
     *         to must submit an <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *         >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     *         <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code>
     *         response.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that the domain is being transferred to must
     * submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     * <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     * 
     * @param password
     *        To finish transferring a domain to another AWS account, the account that the domain is being transferred
     *        to must submit an <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *        >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must include the value of the
     *        <code>Password</code> element that was returned in the <code>TransferDomainToAnotherAwsAccount</code>
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainToAnotherAwsAccountResult withPassword(String password) {
        setPassword(password);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainToAnotherAwsAccountResult == false)
            return false;
        TransferDomainToAnotherAwsAccountResult other = (TransferDomainToAnotherAwsAccountResult) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public TransferDomainToAnotherAwsAccountResult clone() {
        try {
            return (TransferDomainToAnotherAwsAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
