/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#updateFunctionCode(UpdateFunctionCodeRequest) UpdateFunctionCode operation}.
 * <p>
 * Updates the code for the specified Lambda function. This operation
 * must only be used on an existing Lambda function and cannot be used to
 * update the function configuration.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:UpdateFunctionCode</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#updateFunctionCode(UpdateFunctionCodeRequest)
 */
public class UpdateFunctionCodeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The existing Lambda function name whose code you want to replace. <p>
     * You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     */
    private String functionName;

    /**
     * Based64-encoded .zip file containing your packaged source code.
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * The existing Lambda function name whose code you want to replace. <p>
     * You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @return The existing Lambda function name whose code you want to replace. <p>
     *         You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The existing Lambda function name whose code you want to replace. <p>
     * You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The existing Lambda function name whose code you want to replace. <p>
     *         You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The existing Lambda function name whose code you want to replace. <p>
     * You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The existing Lambda function name whose code you want to replace. <p>
     *         You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Based64-encoded .zip file containing your packaged source code.
     *
     * @return Based64-encoded .zip file containing your packaged source code.
     */
    public java.nio.ByteBuffer getZipFile() {
        return zipFile;
    }
    
    /**
     * Based64-encoded .zip file containing your packaged source code.
     *
     * @param zipFile Based64-encoded .zip file containing your packaged source code.
     */
    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }
    
    /**
     * Based64-encoded .zip file containing your packaged source code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zipFile Based64-encoded .zip file containing your packaged source code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeRequest withZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
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
        if (getZipFile() != null) sb.append("ZipFile: " + getZipFile() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateFunctionCodeRequest == false) return false;
        UpdateFunctionCodeRequest other = (UpdateFunctionCodeRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getZipFile() == null ^ this.getZipFile() == null) return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateFunctionCodeRequest clone() {
        
            return (UpdateFunctionCodeRequest) super.clone();
    }

}
    