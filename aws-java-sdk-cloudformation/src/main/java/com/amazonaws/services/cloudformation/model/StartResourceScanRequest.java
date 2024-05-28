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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StartResourceScan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartResourceScanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to retry
     * requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to retry
     * requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to
     *        retry requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to retry
     * requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     * </p>
     * 
     * @return A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to
     *         retry requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to retry
     * requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>StartResourceScan</code> request. Specify this token if you plan to
     *        retry requests so that CloudFormation knows that you're not attempting to start a new resource scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartResourceScanRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartResourceScanRequest == false)
            return false;
        StartResourceScanRequest other = (StartResourceScanRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartResourceScanRequest clone() {
        return (StartResourceScanRequest) super.clone();
    }

}
