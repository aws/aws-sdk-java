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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLambdaFunctionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     */
    private java.util.List<String> lambdaFunctions;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * 
     * @return The Lambdafunction ARNs associated with the specified instance.
     */

    public java.util.List<String> getLambdaFunctions() {
        return lambdaFunctions;
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * 
     * @param lambdaFunctions
     *        The Lambdafunction ARNs associated with the specified instance.
     */

    public void setLambdaFunctions(java.util.Collection<String> lambdaFunctions) {
        if (lambdaFunctions == null) {
            this.lambdaFunctions = null;
            return;
        }

        this.lambdaFunctions = new java.util.ArrayList<String>(lambdaFunctions);
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctions(java.util.Collection)} or {@link #withLambdaFunctions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctions
     *        The Lambdafunction ARNs associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLambdaFunctionsResult withLambdaFunctions(String... lambdaFunctions) {
        if (this.lambdaFunctions == null) {
            setLambdaFunctions(new java.util.ArrayList<String>(lambdaFunctions.length));
        }
        for (String ele : lambdaFunctions) {
            this.lambdaFunctions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * 
     * @param lambdaFunctions
     *        The Lambdafunction ARNs associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLambdaFunctionsResult withLambdaFunctions(java.util.Collection<String> lambdaFunctions) {
        setLambdaFunctions(lambdaFunctions);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLambdaFunctionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLambdaFunctions() != null)
            sb.append("LambdaFunctions: ").append(getLambdaFunctions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLambdaFunctionsResult == false)
            return false;
        ListLambdaFunctionsResult other = (ListLambdaFunctionsResult) obj;
        if (other.getLambdaFunctions() == null ^ this.getLambdaFunctions() == null)
            return false;
        if (other.getLambdaFunctions() != null && other.getLambdaFunctions().equals(this.getLambdaFunctions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaFunctions() == null) ? 0 : getLambdaFunctions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLambdaFunctionsResult clone() {
        try {
            return (ListLambdaFunctionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
