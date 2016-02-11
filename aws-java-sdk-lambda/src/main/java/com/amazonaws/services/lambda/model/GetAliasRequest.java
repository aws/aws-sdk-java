/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#getAlias(GetAliasRequest) GetAlias operation}.
 * <p>
 * Returns the specified alias information such as the alias ARN,
 * description, and function version it is pointing to. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
 * .
 * </p>
 * <p>
 * This requires permission for the <code>lambda:GetAlias</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#getAlias(GetAliasRequest)
 */
public class GetAliasRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Function name for which the alias is created. An alias is a
     * subresource that exists only in the context of an existing Lambda
     * function so you must specify the function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * Name of the alias for which you want to retrieve information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     */
    private String name;

    /**
     * Function name for which the alias is created. An alias is a
     * subresource that exists only in the context of an existing Lambda
     * function so you must specify the function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return Function name for which the alias is created. An alias is a
     *         subresource that exists only in the context of an existing Lambda
     *         function so you must specify the function name.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Function name for which the alias is created. An alias is a
     * subresource that exists only in the context of an existing Lambda
     * function so you must specify the function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Function name for which the alias is created. An alias is a
     *         subresource that exists only in the context of an existing Lambda
     *         function so you must specify the function name.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Function name for which the alias is created. An alias is a
     * subresource that exists only in the context of an existing Lambda
     * function so you must specify the function name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Function name for which the alias is created. An alias is a
     *         subresource that exists only in the context of an existing Lambda
     *         function so you must specify the function name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Name of the alias for which you want to retrieve information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @return Name of the alias for which you want to retrieve information.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the alias for which you want to retrieve information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name Name of the alias for which you want to retrieve information.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the alias for which you want to retrieve information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name Name of the alias for which you want to retrieve information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAliasRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAliasRequest == false) return false;
        GetAliasRequest other = (GetAliasRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
    @Override
    public GetAliasRequest clone() {
        
            return (GetAliasRequest) super.clone();
    }

}
    