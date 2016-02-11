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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#getFunction(GetFunctionRequest) GetFunction operation}.
 * <p>
 * Returns the configuration information of the Lambda function and a
 * presigned URL link to the .zip file you uploaded with CreateFunction
 * so you can download the .zip file. Note that the URL is valid for up
 * to 10 minutes. The configuration information is the same information
 * you provided as parameters when uploading the function.
 * </p>
 * <p>
 * Using the optional <code>Qualifier</code> parameter, you can specify a
 * specific function version for which you want this information. If you
 * don't specify this parameter, the API uses unqualified function ARN
 * which return information about the <code>$LATEST</code> version of the
 * Lambda function. For more information, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:GetFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#getFunction(GetFunctionRequest)
 */
public class GetFunctionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * Using this optional parameter to specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN for the request and returns information about the
     * specific Lambda function version. If you specify an alias name, the
     * API uses the alias ARN and returns information about the function
     * version to which the alias points. If you don't provide this
     * parameter, the API uses unqualified function ARN and returns
     * information about the <code>$LATEST</code> version of the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     */
    private String qualifier;

    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function name. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetFunctionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Using this optional parameter to specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN for the request and returns information about the
     * specific Lambda function version. If you specify an alias name, the
     * API uses the alias ARN and returns information about the function
     * version to which the alias points. If you don't provide this
     * parameter, the API uses unqualified function ARN and returns
     * information about the <code>$LATEST</code> version of the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @return Using this optional parameter to specify a function version or an
     *         alias name. If you specify function version, the API uses qualified
     *         function ARN for the request and returns information about the
     *         specific Lambda function version. If you specify an alias name, the
     *         API uses the alias ARN and returns information about the function
     *         version to which the alias points. If you don't provide this
     *         parameter, the API uses unqualified function ARN and returns
     *         information about the <code>$LATEST</code> version of the Lambda
     *         function.
     */
    public String getQualifier() {
        return qualifier;
    }
    
    /**
     * Using this optional parameter to specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN for the request and returns information about the
     * specific Lambda function version. If you specify an alias name, the
     * API uses the alias ARN and returns information about the function
     * version to which the alias points. If you don't provide this
     * parameter, the API uses unqualified function ARN and returns
     * information about the <code>$LATEST</code> version of the Lambda
     * function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier Using this optional parameter to specify a function version or an
     *         alias name. If you specify function version, the API uses qualified
     *         function ARN for the request and returns information about the
     *         specific Lambda function version. If you specify an alias name, the
     *         API uses the alias ARN and returns information about the function
     *         version to which the alias points. If you don't provide this
     *         parameter, the API uses unqualified function ARN and returns
     *         information about the <code>$LATEST</code> version of the Lambda
     *         function.
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
    /**
     * Using this optional parameter to specify a function version or an
     * alias name. If you specify function version, the API uses qualified
     * function ARN for the request and returns information about the
     * specific Lambda function version. If you specify an alias name, the
     * API uses the alias ARN and returns information about the function
     * version to which the alias points. If you don't provide this
     * parameter, the API uses unqualified function ARN and returns
     * information about the <code>$LATEST</code> version of the Lambda
     * function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier Using this optional parameter to specify a function version or an
     *         alias name. If you specify function version, the API uses qualified
     *         function ARN for the request and returns information about the
     *         specific Lambda function version. If you specify an alias name, the
     *         API uses the alias ARN and returns information about the function
     *         version to which the alias points. If you don't provide this
     *         parameter, the API uses unqualified function ARN and returns
     *         information about the <code>$LATEST</code> version of the Lambda
     *         function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetFunctionRequest withQualifier(String qualifier) {
        this.qualifier = qualifier;
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
        if (getQualifier() != null) sb.append("Qualifier: " + getQualifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode()); 
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
        if (other.getQualifier() == null ^ this.getQualifier() == null) return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public GetFunctionRequest clone() {
        
            return (GetFunctionRequest) super.clone();
    }

}
    