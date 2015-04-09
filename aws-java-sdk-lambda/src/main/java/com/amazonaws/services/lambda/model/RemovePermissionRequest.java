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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#removePermission(RemovePermissionRequest) RemovePermission operation}.
 * <p>
 * You can remove individual permissions from an access policy associated
 * with a Lambda function by providing a Statement ID.
 * </p>
 * <p>
 * Note that removal of a permission will cause an active event source to
 * lose permission to the function.
 * </p>
 * <p>
 * You need permission for the <code>lambda:RemovePermission</code>
 * action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#removePermission(RemovePermissionRequest)
 */
public class RemovePermissionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Lambda function whose access policy you want to remove a permission
     * from. <p> You can specify an unqualified function name (for example,
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
     * Statement ID of the permission to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     */
    private String statementId;

    /**
     * Lambda function whose access policy you want to remove a permission
     * from. <p> You can specify an unqualified function name (for example,
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
     * @return Lambda function whose access policy you want to remove a permission
     *         from. <p> You can specify an unqualified function name (for example,
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
     * Lambda function whose access policy you want to remove a permission
     * from. <p> You can specify an unqualified function name (for example,
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
     * @param functionName Lambda function whose access policy you want to remove a permission
     *         from. <p> You can specify an unqualified function name (for example,
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
     * Lambda function whose access policy you want to remove a permission
     * from. <p> You can specify an unqualified function name (for example,
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
     * @param functionName Lambda function whose access policy you want to remove a permission
     *         from. <p> You can specify an unqualified function name (for example,
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
    public RemovePermissionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Statement ID of the permission to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @return Statement ID of the permission to remove.
     */
    public String getStatementId() {
        return statementId;
    }
    
    /**
     * Statement ID of the permission to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @param statementId Statement ID of the permission to remove.
     */
    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }
    
    /**
     * Statement ID of the permission to remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @param statementId Statement ID of the permission to remove.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemovePermissionRequest withStatementId(String statementId) {
        this.statementId = statementId;
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
        if (getStatementId() != null) sb.append("StatementId: " + getStatementId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemovePermissionRequest == false) return false;
        RemovePermissionRequest other = (RemovePermissionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getStatementId() == null ^ this.getStatementId() == null) return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false) return false; 
        return true;
    }
    
    @Override
    public RemovePermissionRequest clone() {
        
            return (RemovePermissionRequest) super.clone();
    }

}
    