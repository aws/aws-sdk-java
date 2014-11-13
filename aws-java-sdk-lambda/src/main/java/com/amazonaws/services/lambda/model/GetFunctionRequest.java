/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#getFunction(GetFunctionRequest) GetFunction operation}.
 * <p>
 * Returns the configuration information of the Lambda function and a
 * presigned URL link to the .zip file you uploaded with UploadFunction
 * so you can download the .zip file. Note that the URL is valid for up
 * to 10 minutes. The configuration information is the same information
 * you provided as parameters when uploading the function.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:GetFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#getFunction(GetFunctionRequest)
 */
public class GetFunctionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String functionName;

    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return The Lambda function name.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The Lambda function name.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The Lambda function name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetFunctionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
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
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetFunctionRequest == false) return false;
        GetFunctionRequest other = (GetFunctionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        return true;
    }
    
}
    