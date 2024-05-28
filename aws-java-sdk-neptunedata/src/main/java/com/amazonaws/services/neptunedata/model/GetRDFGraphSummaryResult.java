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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetRDFGraphSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRDFGraphSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * Payload for an RDF graph summary response
     * </p>
     */
    private RDFGraphSummaryValueMap payload;

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200.
     * </p>
     * 
     * @param statusCode
     *        The HTTP return code of the request. If the request succeeded, the code is 200.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200.
     * </p>
     * 
     * @return The HTTP return code of the request. If the request succeeded, the code is 200.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200.
     * </p>
     * 
     * @param statusCode
     *        The HTTP return code of the request. If the request succeeded, the code is 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDFGraphSummaryResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Payload for an RDF graph summary response
     * </p>
     * 
     * @param payload
     *        Payload for an RDF graph summary response
     */

    public void setPayload(RDFGraphSummaryValueMap payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Payload for an RDF graph summary response
     * </p>
     * 
     * @return Payload for an RDF graph summary response
     */

    public RDFGraphSummaryValueMap getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * Payload for an RDF graph summary response
     * </p>
     * 
     * @param payload
     *        Payload for an RDF graph summary response
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDFGraphSummaryResult withPayload(RDFGraphSummaryValueMap payload) {
        setPayload(payload);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRDFGraphSummaryResult == false)
            return false;
        GetRDFGraphSummaryResult other = (GetRDFGraphSummaryResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public GetRDFGraphSummaryResult clone() {
        try {
            return (GetRDFGraphSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
