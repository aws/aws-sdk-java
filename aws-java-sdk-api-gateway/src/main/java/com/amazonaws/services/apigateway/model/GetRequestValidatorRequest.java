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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRequestValidatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     * </p>
     */
    private String requestValidatorId;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     * </p>
     * 
     * @param requestValidatorId
     *        [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     */

    public void setRequestValidatorId(String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     * </p>
     * 
     * @return [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     */

    public String getRequestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     * </p>
     * 
     * @param requestValidatorId
     *        [Required] The identifier of the <a>RequestValidator</a> to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorRequest withRequestValidatorId(String requestValidatorId) {
        setRequestValidatorId(requestValidatorId);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getRequestValidatorId() != null)
            sb.append("RequestValidatorId: ").append(getRequestValidatorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRequestValidatorRequest == false)
            return false;
        GetRequestValidatorRequest other = (GetRequestValidatorRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getRequestValidatorId() == null ^ this.getRequestValidatorId() == null)
            return false;
        if (other.getRequestValidatorId() != null && other.getRequestValidatorId().equals(this.getRequestValidatorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getRequestValidatorId() == null) ? 0 : getRequestValidatorId().hashCode());
        return hashCode;
    }

    @Override
    public GetRequestValidatorRequest clone() {
        return (GetRequestValidatorRequest) super.clone();
    }

}
