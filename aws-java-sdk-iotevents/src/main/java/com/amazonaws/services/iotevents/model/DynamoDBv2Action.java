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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all the
 * information about the detector model instance and the event that triggered the action. You can customize the <a
 * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html">payload</a>. A separate column of
 * the DynamoDB table receives one attribute-value pair in the payload that you specify.
 * </p>
 * <p>
 * You must use expressions for all parameters in <code>DynamoDBv2Action</code>. The expressions accept literals,
 * operators, functions, references, and substitution templates.
 * </p>
 * <p class="title">
 * <b>Examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For literal values, the expressions must contain single quotes. For example, the value for the <code>tableName</code>
 * parameter can be <code>'GreenhouseTemperatureTable'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For references, you must specify either variables or input values. For example, the value for the
 * <code>tableName</code> parameter can be <code>$variable.ddbtableName</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a substitution template, you must use <code>${}</code>, and the template must be in single quotes. A substitution
 * template can also contain a combination of literals, operators, functions, references, and substitution templates.
 * </p>
 * <p>
 * In the following example, the value for the <code>contentExpression</code> parameter in <code>Payload</code> uses a
 * substitution template.
 * </p>
 * <p>
 * <code>'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\": \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * For a string concatenation, you must use <code>+</code>. A string concatenation can also contain a combination of
 * literals, operators, functions, references, and substitution templates.
 * </p>
 * <p>
 * In the following example, the value for the <code>tableName</code> parameter uses a string concatenation.
 * </p>
 * <p>
 * <code>'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html">Expressions</a> in the
 * <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * <p>
 * The value for the <code>type</code> parameter in <code>Payload</code> must be <code>JSON</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DynamoDBv2Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBv2Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     */
    private String tableName;

    private Payload payload;

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @return The name of the DynamoDB table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBv2Action withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param payload
     */

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * @return
     */

    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @param payload
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBv2Action withPayload(Payload payload) {
        setPayload(payload);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
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
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
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
        com.amazonaws.services.iotevents.model.transform.DynamoDBv2ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
