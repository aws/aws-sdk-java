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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#deleteFunction(DeleteFunctionRequest) DeleteFunction operation}.
 * <p>
 * Deletes the specified Lambda function code and configuration.
 * </p>
 * <p>
 * If you don't specify a function version, AWS Lambda will delete the
 * function, including all its versions, and any aliases pointing to the
 * function versions.
 * </p>
 * <p>
 * When you delete a function the associated resource policy is also
 * deleted. You will need to delete the event source mappings explicitly.
 * </p>
 * <p>
 * For information about function versioning, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:DeleteFunction</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#deleteFunction(DeleteFunctionRequest)
 */
public class DeleteFunctionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Lambda function to delete. <p> You can specify an unqualified
     * function name (for example, "Thumbnail") or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * Using this optional parameter you can specify a function version (but
     * not the $LATEST version) to direct AWS Lambda to delete a specific
     * function version. If the function version has one or more aliases
     * pointing to it, you will get an error because you cannot have aliases
     * pointing to it. You can delete any function version but not the
     * $LATEST, that is, you cannot specify $LATEST as the value of this
     * parameter. The $LATEST version can be deleted only when you want to
     * delete all the function versions and aliases. <p>You can only specify
     * a function version and not alias name using this parameter. You cannot
     * delete a function version using its alias. <p>If you don't specify
     * this parameter, AWS Lambda will delete the function, including all its
     * versions and aliases.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_]+)<br/>
     */
    private String qualifier;

    /**
     * The Lambda function to delete. <p> You can specify an unqualified
     * function name (for example, "Thumbnail") or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function to delete. <p> You can specify an unqualified
     *         function name (for example, "Thumbnail") or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
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
     * The Lambda function to delete. <p> You can specify an unqualified
     * function name (for example, "Thumbnail") or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function to delete. <p> You can specify an unqualified
     *         function name (for example, "Thumbnail") or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
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
     * The Lambda function to delete. <p> You can specify an unqualified
     * function name (for example, "Thumbnail") or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function to delete. <p> You can specify an unqualified
     *         function name (for example, "Thumbnail") or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteFunctionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Using this optional parameter you can specify a function version (but
     * not the $LATEST version) to direct AWS Lambda to delete a specific
     * function version. If the function version has one or more aliases
     * pointing to it, you will get an error because you cannot have aliases
     * pointing to it. You can delete any function version but not the
     * $LATEST, that is, you cannot specify $LATEST as the value of this
     * parameter. The $LATEST version can be deleted only when you want to
     * delete all the function versions and aliases. <p>You can only specify
     * a function version and not alias name using this parameter. You cannot
     * delete a function version using its alias. <p>If you don't specify
     * this parameter, AWS Lambda will delete the function, including all its
     * versions and aliases.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_]+)<br/>
     *
     * @return Using this optional parameter you can specify a function version (but
     *         not the $LATEST version) to direct AWS Lambda to delete a specific
     *         function version. If the function version has one or more aliases
     *         pointing to it, you will get an error because you cannot have aliases
     *         pointing to it. You can delete any function version but not the
     *         $LATEST, that is, you cannot specify $LATEST as the value of this
     *         parameter. The $LATEST version can be deleted only when you want to
     *         delete all the function versions and aliases. <p>You can only specify
     *         a function version and not alias name using this parameter. You cannot
     *         delete a function version using its alias. <p>If you don't specify
     *         this parameter, AWS Lambda will delete the function, including all its
     *         versions and aliases.
     */
    public String getQualifier() {
        return qualifier;
    }
    
    /**
     * Using this optional parameter you can specify a function version (but
     * not the $LATEST version) to direct AWS Lambda to delete a specific
     * function version. If the function version has one or more aliases
     * pointing to it, you will get an error because you cannot have aliases
     * pointing to it. You can delete any function version but not the
     * $LATEST, that is, you cannot specify $LATEST as the value of this
     * parameter. The $LATEST version can be deleted only when you want to
     * delete all the function versions and aliases. <p>You can only specify
     * a function version and not alias name using this parameter. You cannot
     * delete a function version using its alias. <p>If you don't specify
     * this parameter, AWS Lambda will delete the function, including all its
     * versions and aliases.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_]+)<br/>
     *
     * @param qualifier Using this optional parameter you can specify a function version (but
     *         not the $LATEST version) to direct AWS Lambda to delete a specific
     *         function version. If the function version has one or more aliases
     *         pointing to it, you will get an error because you cannot have aliases
     *         pointing to it. You can delete any function version but not the
     *         $LATEST, that is, you cannot specify $LATEST as the value of this
     *         parameter. The $LATEST version can be deleted only when you want to
     *         delete all the function versions and aliases. <p>You can only specify
     *         a function version and not alias name using this parameter. You cannot
     *         delete a function version using its alias. <p>If you don't specify
     *         this parameter, AWS Lambda will delete the function, including all its
     *         versions and aliases.
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
    /**
     * Using this optional parameter you can specify a function version (but
     * not the $LATEST version) to direct AWS Lambda to delete a specific
     * function version. If the function version has one or more aliases
     * pointing to it, you will get an error because you cannot have aliases
     * pointing to it. You can delete any function version but not the
     * $LATEST, that is, you cannot specify $LATEST as the value of this
     * parameter. The $LATEST version can be deleted only when you want to
     * delete all the function versions and aliases. <p>You can only specify
     * a function version and not alias name using this parameter. You cannot
     * delete a function version using its alias. <p>If you don't specify
     * this parameter, AWS Lambda will delete the function, including all its
     * versions and aliases.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_]+)<br/>
     *
     * @param qualifier Using this optional parameter you can specify a function version (but
     *         not the $LATEST version) to direct AWS Lambda to delete a specific
     *         function version. If the function version has one or more aliases
     *         pointing to it, you will get an error because you cannot have aliases
     *         pointing to it. You can delete any function version but not the
     *         $LATEST, that is, you cannot specify $LATEST as the value of this
     *         parameter. The $LATEST version can be deleted only when you want to
     *         delete all the function versions and aliases. <p>You can only specify
     *         a function version and not alias name using this parameter. You cannot
     *         delete a function version using its alias. <p>If you don't specify
     *         this parameter, AWS Lambda will delete the function, including all its
     *         versions and aliases.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteFunctionRequest withQualifier(String qualifier) {
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

        if (obj instanceof DeleteFunctionRequest == false) return false;
        DeleteFunctionRequest other = (DeleteFunctionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getQualifier() == null ^ this.getQualifier() == null) return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteFunctionRequest clone() {
        
            return (DeleteFunctionRequest) super.clone();
    }

}
    