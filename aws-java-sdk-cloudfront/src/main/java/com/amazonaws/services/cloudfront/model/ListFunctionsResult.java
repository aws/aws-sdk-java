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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of CloudFront functions.
     * </p>
     */
    private FunctionList functionList;

    /**
     * <p>
     * A list of CloudFront functions.
     * </p>
     * 
     * @param functionList
     *        A list of CloudFront functions.
     */

    public void setFunctionList(FunctionList functionList) {
        this.functionList = functionList;
    }

    /**
     * <p>
     * A list of CloudFront functions.
     * </p>
     * 
     * @return A list of CloudFront functions.
     */

    public FunctionList getFunctionList() {
        return this.functionList;
    }

    /**
     * <p>
     * A list of CloudFront functions.
     * </p>
     * 
     * @param functionList
     *        A list of CloudFront functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionsResult withFunctionList(FunctionList functionList) {
        setFunctionList(functionList);
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
        if (getFunctionList() != null)
            sb.append("FunctionList: ").append(getFunctionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionsResult == false)
            return false;
        ListFunctionsResult other = (ListFunctionsResult) obj;
        if (other.getFunctionList() == null ^ this.getFunctionList() == null)
            return false;
        if (other.getFunctionList() != null && other.getFunctionList().equals(this.getFunctionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionList() == null) ? 0 : getFunctionList().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionsResult clone() {
        try {
            return (ListFunctionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
