/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
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
     * Specify a version or alias to remove permissions from a published version of the function.
     * </p>
     */
    private String qualifier;
    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The name of the Lambda function, version, or alias.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can append a version number or alias to any of the formats. The length constraint applies only to the
     *         full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
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
     * Specify a version or alias to remove permissions from a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to remove permissions from a published version of the function.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to remove permissions from a published version of the function.
     * </p>
     * 
     * @return Specify a version or alias to remove permissions from a published version of the function.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to remove permissions from a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to remove permissions from a published version of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *        modifying a policy that has changed since you last read it.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @return Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *         modifying a policy that has changed since you last read it.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *        modifying a policy that has changed since you last read it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
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
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
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
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }

}
