/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex returns
     * an exception
     * </p>
     * <p>
     * If you don't specify a revision ID, Amazon Lex will delete the current policy.
     * </p>
     */
    private String expectedRevisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex returns
     * an exception
     * </p>
     * <p>
     * If you don't specify a revision ID, Amazon Lex will delete the current policy.
     * </p>
     * 
     * @param expectedRevisionId
     *        The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex
     *        returns an exception</p>
     *        <p>
     *        If you don't specify a revision ID, Amazon Lex will delete the current policy.
     */

    public void setExpectedRevisionId(String expectedRevisionId) {
        this.expectedRevisionId = expectedRevisionId;
    }

    /**
     * <p>
     * The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex returns
     * an exception
     * </p>
     * <p>
     * If you don't specify a revision ID, Amazon Lex will delete the current policy.
     * </p>
     * 
     * @return The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex
     *         returns an exception</p>
     *         <p>
     *         If you don't specify a revision ID, Amazon Lex will delete the current policy.
     */

    public String getExpectedRevisionId() {
        return this.expectedRevisionId;
    }

    /**
     * <p>
     * The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex returns
     * an exception
     * </p>
     * <p>
     * If you don't specify a revision ID, Amazon Lex will delete the current policy.
     * </p>
     * 
     * @param expectedRevisionId
     *        The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex
     *        returns an exception</p>
     *        <p>
     *        If you don't specify a revision ID, Amazon Lex will delete the current policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withExpectedRevisionId(String expectedRevisionId) {
        setExpectedRevisionId(expectedRevisionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getExpectedRevisionId() != null)
            sb.append("ExpectedRevisionId: ").append(getExpectedRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getExpectedRevisionId() == null ^ this.getExpectedRevisionId() == null)
            return false;
        if (other.getExpectedRevisionId() != null && other.getExpectedRevisionId().equals(this.getExpectedRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getExpectedRevisionId() == null) ? 0 : getExpectedRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyRequest clone() {
        return (DeleteResourcePolicyRequest) super.clone();
    }

}
