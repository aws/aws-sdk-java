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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeCreateAccountStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCreateAccountStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the response
     * to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     */
    private String createAccountRequestId;

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the response
     * to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param createAccountRequestId
     *        Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the
     *        response to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     *        operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *        requires "car-" followed by from 8 to 32 lower-case letters or digits.
     */

    public void setCreateAccountRequestId(String createAccountRequestId) {
        this.createAccountRequestId = createAccountRequestId;
    }

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the response
     * to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the
     *         response to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     *         operation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *         requires "car-" followed by from 8 to 32 lower-case letters or digits.
     */

    public String getCreateAccountRequestId() {
        return this.createAccountRequestId;
    }

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the response
     * to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param createAccountRequestId
     *        Specifies the <code>operationId</code> that uniquely identifies the request. You can get the ID from the
     *        response to an earlier <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     *        operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *        requires "car-" followed by from 8 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCreateAccountStatusRequest withCreateAccountRequestId(String createAccountRequestId) {
        setCreateAccountRequestId(createAccountRequestId);
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
        if (getCreateAccountRequestId() != null)
            sb.append("CreateAccountRequestId: ").append(getCreateAccountRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCreateAccountStatusRequest == false)
            return false;
        DescribeCreateAccountStatusRequest other = (DescribeCreateAccountStatusRequest) obj;
        if (other.getCreateAccountRequestId() == null ^ this.getCreateAccountRequestId() == null)
            return false;
        if (other.getCreateAccountRequestId() != null && other.getCreateAccountRequestId().equals(this.getCreateAccountRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateAccountRequestId() == null) ? 0 : getCreateAccountRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCreateAccountStatusRequest clone() {
        return (DescribeCreateAccountStatusRequest) super.clone();
    }

}
