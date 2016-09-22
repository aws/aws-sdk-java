/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Function name for which the alias is created. An alias is a subresource that exists only in the context of an
     * existing Lambda function so you must specify the function name.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Name of the alias for which you want to retrieve information.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Function name for which the alias is created. An alias is a subresource that exists only in the context of an
     * existing Lambda function so you must specify the function name.
     * </p>
     * 
     * @param functionName
     *        Function name for which the alias is created. An alias is a subresource that exists only in the context of
     *        an existing Lambda function so you must specify the function name.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Function name for which the alias is created. An alias is a subresource that exists only in the context of an
     * existing Lambda function so you must specify the function name.
     * </p>
     * 
     * @return Function name for which the alias is created. An alias is a subresource that exists only in the context
     *         of an existing Lambda function so you must specify the function name.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Function name for which the alias is created. An alias is a subresource that exists only in the context of an
     * existing Lambda function so you must specify the function name.
     * </p>
     * 
     * @param functionName
     *        Function name for which the alias is created. An alias is a subresource that exists only in the context of
     *        an existing Lambda function so you must specify the function name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Name of the alias for which you want to retrieve information.
     * </p>
     * 
     * @param name
     *        Name of the alias for which you want to retrieve information.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the alias for which you want to retrieve information.
     * </p>
     * 
     * @return Name of the alias for which you want to retrieve information.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the alias for which you want to retrieve information.
     * </p>
     * 
     * @param name
     *        Name of the alias for which you want to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAliasRequest == false)
            return false;
        GetAliasRequest other = (GetAliasRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetAliasRequest clone() {
        return (GetAliasRequest) super.clone();
    }
}
