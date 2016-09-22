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
 * <p/>
 */
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lambda function whose resource policy you want to remove a permission from.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Statement ID of the permission to remove.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * You can specify this optional parameter to remove permission associated with a specific function version or
     * function alias. If you don't specify this parameter, the API removes permission associated with the unqualified
     * function ARN.
     * </p>
     */
    private String qualifier;

    /**
     * <p>
     * Lambda function whose resource policy you want to remove a permission from.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        Lambda function whose resource policy you want to remove a permission from.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Lambda function whose resource policy you want to remove a permission from.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @return Lambda function whose resource policy you want to remove a permission from.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Lambda function whose resource policy you want to remove a permission from.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        Lambda function whose resource policy you want to remove a permission from.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Statement ID of the permission to remove.
     * </p>
     * 
     * @param statementId
     *        Statement ID of the permission to remove.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * Statement ID of the permission to remove.
     * </p>
     * 
     * @return Statement ID of the permission to remove.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * Statement ID of the permission to remove.
     * </p>
     * 
     * @param statementId
     *        Statement ID of the permission to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * You can specify this optional parameter to remove permission associated with a specific function version or
     * function alias. If you don't specify this parameter, the API removes permission associated with the unqualified
     * function ARN.
     * </p>
     * 
     * @param qualifier
     *        You can specify this optional parameter to remove permission associated with a specific function version
     *        or function alias. If you don't specify this parameter, the API removes permission associated with the
     *        unqualified function ARN.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * You can specify this optional parameter to remove permission associated with a specific function version or
     * function alias. If you don't specify this parameter, the API removes permission associated with the unqualified
     * function ARN.
     * </p>
     * 
     * @return You can specify this optional parameter to remove permission associated with a specific function version
     *         or function alias. If you don't specify this parameter, the API removes permission associated with the
     *         unqualified function ARN.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * You can specify this optional parameter to remove permission associated with a specific function version or
     * function alias. If you don't specify this parameter, the API removes permission associated with the unqualified
     * function ARN.
     * </p>
     * 
     * @param qualifier
     *        You can specify this optional parameter to remove permission associated with a specific function version
     *        or function alias. If you don't specify this parameter, the API removes permission associated with the
     *        unqualified function ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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
        if (getStatementId() != null)
            sb.append("StatementId: " + getStatementId() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemovePermissionRequest == false)
            return false;
        RemovePermissionRequest other = (RemovePermissionRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }
}
