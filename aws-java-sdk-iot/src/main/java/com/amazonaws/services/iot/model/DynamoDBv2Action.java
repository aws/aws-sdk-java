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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to write to a DynamoDB table.
 * </p>
 * <p>
 * This DynamoDB action writes each attribute in the message payload into it's own column in the DynamoDB table.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBv2Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written. For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     * </p>
     */
    private PutItemInput putItem;

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the DynamoDB table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBv2Action withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written. For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     * </p>
     * 
     * @param putItem
     *        Specifies the DynamoDB table to which the message data will be written. For example:</p>
     *        <p>
     *        <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *        </p>
     *        <p>
     *        Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     */

    public void setPutItem(PutItemInput putItem) {
        this.putItem = putItem;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written. For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     * </p>
     * 
     * @return Specifies the DynamoDB table to which the message data will be written. For example:</p>
     *         <p>
     *         <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *         </p>
     *         <p>
     *         Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     */

    public PutItemInput getPutItem() {
        return this.putItem;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written. For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     * </p>
     * 
     * @param putItem
     *        Specifies the DynamoDB table to which the message data will be written. For example:</p>
     *        <p>
     *        <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *        </p>
     *        <p>
     *        Each attribute in the message payload will be written to a separate column in the DynamoDB database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBv2Action withPutItem(PutItemInput putItem) {
        setPutItem(putItem);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPutItem() != null)
            sb.append("PutItem: ").append(getPutItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBv2Action == false)
            return false;
        DynamoDBv2Action other = (DynamoDBv2Action) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPutItem() == null ^ this.getPutItem() == null)
            return false;
        if (other.getPutItem() != null && other.getPutItem().equals(this.getPutItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPutItem() == null) ? 0 : getPutItem().hashCode());
        return hashCode;
    }

    @Override
    public DynamoDBv2Action clone() {
        try {
            return (DynamoDBv2Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DynamoDBv2ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
