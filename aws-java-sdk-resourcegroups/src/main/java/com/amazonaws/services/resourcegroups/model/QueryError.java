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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A two-part error structure that can occur in <code>ListGroupResources</code> or <code>SearchResources</code>
 * operations on CloudFormation stack-based queries. The error occurs if the CloudFormation stack on which the query is
 * based either does not exist, or has a status that renders the stack inactive. A <code>QueryError</code> occurrence
 * does not necessarily mean that AWS Resource Groups could not complete the operation, but the resulting group might
 * have no member resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/QueryError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>
     * .
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A message that explains the <code>ErrorCode</code> value. Messages might state that the specified CloudFormation
     * stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>, the message typically
     * states that the CloudFormation stack has a status that is not (or no longer) active, such as
     * <code>CREATE_FAILED</code>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>
     * .
     * </p>
     * 
     * @param errorCode
     *        Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and
     *        <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @see QueryErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>
     * .
     * </p>
     * 
     * @return Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and
     *         <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @see QueryErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>
     * .
     * </p>
     * 
     * @param errorCode
     *        Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and
     *        <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryErrorCode
     */

    public QueryError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>
     * .
     * </p>
     * 
     * @param errorCode
     *        Possible values are <code>CLOUDFORMATION_STACK_INACTIVE</code> and
     *        <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryErrorCode
     */

    public QueryError withErrorCode(QueryErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A message that explains the <code>ErrorCode</code> value. Messages might state that the specified CloudFormation
     * stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>, the message typically
     * states that the CloudFormation stack has a status that is not (or no longer) active, such as
     * <code>CREATE_FAILED</code>.
     * </p>
     * 
     * @param message
     *        A message that explains the <code>ErrorCode</code> value. Messages might state that the specified
     *        CloudFormation stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>,
     *        the message typically states that the CloudFormation stack has a status that is not (or no longer) active,
     *        such as <code>CREATE_FAILED</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that explains the <code>ErrorCode</code> value. Messages might state that the specified CloudFormation
     * stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>, the message typically
     * states that the CloudFormation stack has a status that is not (or no longer) active, such as
     * <code>CREATE_FAILED</code>.
     * </p>
     * 
     * @return A message that explains the <code>ErrorCode</code> value. Messages might state that the specified
     *         CloudFormation stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>
     *         , the message typically states that the CloudFormation stack has a status that is not (or no longer)
     *         active, such as <code>CREATE_FAILED</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that explains the <code>ErrorCode</code> value. Messages might state that the specified CloudFormation
     * stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>, the message typically
     * states that the CloudFormation stack has a status that is not (or no longer) active, such as
     * <code>CREATE_FAILED</code>.
     * </p>
     * 
     * @param message
     *        A message that explains the <code>ErrorCode</code> value. Messages might state that the specified
     *        CloudFormation stack does not exist (or no longer exists). For <code>CLOUDFORMATION_STACK_INACTIVE</code>,
     *        the message typically states that the CloudFormation stack has a status that is not (or no longer) active,
     *        such as <code>CREATE_FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryError withMessage(String message) {
        setMessage(message);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryError == false)
            return false;
        QueryError other = (QueryError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public QueryError clone() {
        try {
            return (QueryError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.QueryErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
