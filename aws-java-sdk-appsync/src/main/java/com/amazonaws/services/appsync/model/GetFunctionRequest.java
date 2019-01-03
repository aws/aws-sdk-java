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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The <code>Function</code> ID.
     * </p>
     */
    private String functionId;

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @param apiId
     *        The GraphQL API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @return The GraphQL API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @param apiId
     *        The GraphQL API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> ID.
     * </p>
     * 
     * @param functionId
     *        The <code>Function</code> ID.
     */

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    /**
     * <p>
     * The <code>Function</code> ID.
     * </p>
     * 
     * @return The <code>Function</code> ID.
     */

    public String getFunctionId() {
        return this.functionId;
    }

    /**
     * <p>
     * The <code>Function</code> ID.
     * </p>
     * 
     * @param functionId
     *        The <code>Function</code> ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionRequest withFunctionId(String functionId) {
        setFunctionId(functionId);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getFunctionId() != null)
            sb.append("FunctionId: ").append(getFunctionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionRequest == false)
            return false;
        GetFunctionRequest other = (GetFunctionRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getFunctionId() == null ^ this.getFunctionId() == null)
            return false;
        if (other.getFunctionId() != null && other.getFunctionId().equals(this.getFunctionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionRequest clone() {
        return (GetFunctionRequest) super.clone();
    }

}
