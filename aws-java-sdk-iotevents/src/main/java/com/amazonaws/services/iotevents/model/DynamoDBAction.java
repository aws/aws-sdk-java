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
 * Defines an action to write to the Amazon DynamoDB table that you created. The standard action payload contains all
 * the information about the detector model instance and the event that triggered the action. You can customize the <a
 * href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html">payload</a>. One column of the
 * DynamoDB table receives all attribute-value pairs in the payload that you specify.
 * </p>
 * <p>
 * You must use expressions for all parameters in <code>DynamoDBAction</code>. The expressions accept literals,
 * operators, functions, references, and substitution templates.
 * </p>
 * <p class="title">
 * <b>Examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For literal values, the expressions must contain single quotes. For example, the value for the
 * <code>hashKeyType</code> parameter can be <code>'STRING'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For references, you must specify either variables or input values. For example, the value for the
 * <code>hashKeyField</code> parameter can be <code>$input.GreenhouseInput.name</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a substitution template, you must use <code>${}</code>, and the template must be in single quotes. A substitution
 * template can also contain a combination of literals, operators, functions, references, and substitution templates.
 * </p>
 * <p>
 * In the following example, the value for the <code>hashKeyValue</code> parameter uses a substitution template.
 * </p>
 * <p>
 * <code>'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'</code>
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
 * If the defined payload type is a string, <code>DynamoDBAction</code> writes non-JSON data to the DynamoDB table as
 * binary data. The DynamoDB console displays the data as Base64-encoded text. The value for the
 * <code>payloadField</code> parameter is <code>&lt;payload-field&gt;_raw</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DynamoDBAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     * </p>
     */
    private String hashKeyType;
    /**
     * <p>
     * The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match the
     * partition key of the target DynamoDB table.
     * </p>
     */
    private String hashKeyField;
    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     */
    private String hashKeyValue;
    /**
     * <p>
     * The data type for the range key (also called the sort key), You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     * </p>
     */
    private String rangeKeyType;
    /**
     * <p>
     * The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the sort
     * key of the target DynamoDB table.
     * </p>
     */
    private String rangeKeyField;
    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     */
    private String rangeKeyValue;
    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified hash key
     * as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition key
     * must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must match the
     * specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     * </p>
     */
    private String payloadField;
    /**
     * <p>
     * The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target DynamoDB
     * table.
     * </p>
     */
    private String tableName;

    private Payload payload;

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @param hashKeyType
     *        The data type for the hash key (also called the partition key). You can specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'STRING'</code> - The hash key is a string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'NUMBER'</code> - The hash key is a number.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     */

    public void setHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @return The data type for the hash key (also called the partition key). You can specify the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>'STRING'</code> - The hash key is a string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'NUMBER'</code> - The hash key is a number.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     */

    public String getHashKeyType() {
        return this.hashKeyType;
    }

    /**
     * <p>
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The hash key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The hash key is a number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @param hashKeyType
     *        The data type for the hash key (also called the partition key). You can specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'STRING'</code> - The hash key is a string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'NUMBER'</code> - The hash key is a number.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>hashKeyType</code>, the default value is <code>'STRING'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withHashKeyType(String hashKeyType) {
        setHashKeyType(hashKeyType);
        return this;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match the
     * partition key of the target DynamoDB table.
     * </p>
     * 
     * @param hashKeyField
     *        The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match
     *        the partition key of the target DynamoDB table.
     */

    public void setHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match the
     * partition key of the target DynamoDB table.
     * </p>
     * 
     * @return The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match
     *         the partition key of the target DynamoDB table.
     */

    public String getHashKeyField() {
        return this.hashKeyField;
    }

    /**
     * <p>
     * The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match the
     * partition key of the target DynamoDB table.
     * </p>
     * 
     * @param hashKeyField
     *        The name of the hash key (also called the partition key). The <code>hashKeyField</code> value must match
     *        the partition key of the target DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withHashKeyField(String hashKeyField) {
        setHashKeyField(hashKeyField);
        return this;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     * 
     * @param hashKeyValue
     *        The value of the hash key (also called the partition key).
     */

    public void setHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     * 
     * @return The value of the hash key (also called the partition key).
     */

    public String getHashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * <p>
     * The value of the hash key (also called the partition key).
     * </p>
     * 
     * @param hashKeyValue
     *        The value of the hash key (also called the partition key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        setHashKeyValue(hashKeyValue);
        return this;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @param rangeKeyType
     *        The data type for the range key (also called the sort key), You can specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'STRING'</code> - The range key is a string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'NUMBER'</code> - The range key is number.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     */

    public void setRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @return The data type for the range key (also called the sort key), You can specify the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>'STRING'</code> - The range key is a string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'NUMBER'</code> - The range key is number.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     */

    public String getRangeKeyType() {
        return this.rangeKeyType;
    }

    /**
     * <p>
     * The data type for the range key (also called the sort key), You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'STRING'</code> - The range key is a string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'NUMBER'</code> - The range key is number.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     * </p>
     * 
     * @param rangeKeyType
     *        The data type for the range key (also called the sort key), You can specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'STRING'</code> - The range key is a string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'NUMBER'</code> - The range key is number.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>rangeKeyField</code>, the default value is <code>'STRING'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withRangeKeyType(String rangeKeyType) {
        setRangeKeyType(rangeKeyType);
        return this;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the sort
     * key of the target DynamoDB table.
     * </p>
     * 
     * @param rangeKeyField
     *        The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the
     *        sort key of the target DynamoDB table.
     */

    public void setRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the sort
     * key of the target DynamoDB table.
     * </p>
     * 
     * @return The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the
     *         sort key of the target DynamoDB table.
     */

    public String getRangeKeyField() {
        return this.rangeKeyField;
    }

    /**
     * <p>
     * The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the sort
     * key of the target DynamoDB table.
     * </p>
     * 
     * @param rangeKeyField
     *        The name of the range key (also called the sort key). The <code>rangeKeyField</code> value must match the
     *        sort key of the target DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withRangeKeyField(String rangeKeyField) {
        setRangeKeyField(rangeKeyField);
        return this;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     * 
     * @param rangeKeyValue
     *        The value of the range key (also called the sort key).
     */

    public void setRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     * 
     * @return The value of the range key (also called the sort key).
     */

    public String getRangeKeyValue() {
        return this.rangeKeyValue;
    }

    /**
     * <p>
     * The value of the range key (also called the sort key).
     * </p>
     * 
     * @param rangeKeyValue
     *        The value of the range key (also called the sort key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        setRangeKeyValue(rangeKeyValue);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified hash key
     * as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition key
     * must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must match the
     * specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     * </p>
     * 
     * @param operation
     *        The type of operation to perform. You can specify the following values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified
     *        hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition
     *        key must match the specified hash key. If you specified a range key, the range key must match the item's
     *        sort key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must
     *        match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified hash key
     * as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition key
     * must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must match the
     * specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     * </p>
     * 
     * @return The type of operation to perform. You can specify the following values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified
     *         hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's
     *         partition key must match the specified hash key. If you specified a range key, the range key must match
     *         the item's sort key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must
     *         match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The type of operation to perform. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified hash key
     * as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition key
     * must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must match the
     * specified hash key. If you specified a range key, the range key must match the item's sort key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     * </p>
     * 
     * @param operation
     *        The type of operation to perform. You can specify the following values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>'INSERT'</code> - Insert data as a new item into the DynamoDB table. This item uses the specified
     *        hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'UPDATE'</code> - Update an existing item of the DynamoDB table with new data. This item's partition
     *        key must match the specified hash key. If you specified a range key, the range key must match the item's
     *        sort key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>'DELETE'</code> - Delete an existing item of the DynamoDB table. This item's partition key must
     *        match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify this parameter, AWS IoT Events triggers the <code>'INSERT'</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     * </p>
     * 
     * @param payloadField
     *        The name of the DynamoDB column that receives the action payload.</p>
     *        <p>
     *        If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     */

    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     * </p>
     * 
     * @return The name of the DynamoDB column that receives the action payload.</p>
     *         <p>
     *         If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     */

    public String getPayloadField() {
        return this.payloadField;
    }

    /**
     * <p>
     * The name of the DynamoDB column that receives the action payload.
     * </p>
     * <p>
     * If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     * </p>
     * 
     * @param payloadField
     *        The name of the DynamoDB column that receives the action payload.</p>
     *        <p>
     *        If you don't specify this parameter, the name of the DynamoDB column is <code>payload</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withPayloadField(String payloadField) {
        setPayloadField(payloadField);
        return this;
    }

    /**
     * <p>
     * The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target DynamoDB
     * table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target
     *        DynamoDB table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target DynamoDB
     * table.
     * </p>
     * 
     * @return The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target
     *         DynamoDB table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target DynamoDB
     * table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table. The <code>tableName</code> value must match the table name of the target
     *        DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withTableName(String tableName) {
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

    public DynamoDBAction withPayload(Payload payload) {
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
        if (getHashKeyType() != null)
            sb.append("HashKeyType: ").append(getHashKeyType()).append(",");
        if (getHashKeyField() != null)
            sb.append("HashKeyField: ").append(getHashKeyField()).append(",");
        if (getHashKeyValue() != null)
            sb.append("HashKeyValue: ").append(getHashKeyValue()).append(",");
        if (getRangeKeyType() != null)
            sb.append("RangeKeyType: ").append(getRangeKeyType()).append(",");
        if (getRangeKeyField() != null)
            sb.append("RangeKeyField: ").append(getRangeKeyField()).append(",");
        if (getRangeKeyValue() != null)
            sb.append("RangeKeyValue: ").append(getRangeKeyValue()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getPayloadField() != null)
            sb.append("PayloadField: ").append(getPayloadField()).append(",");
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

        if (obj instanceof DynamoDBAction == false)
            return false;
        DynamoDBAction other = (DynamoDBAction) obj;
        if (other.getHashKeyType() == null ^ this.getHashKeyType() == null)
            return false;
        if (other.getHashKeyType() != null && other.getHashKeyType().equals(this.getHashKeyType()) == false)
            return false;
        if (other.getHashKeyField() == null ^ this.getHashKeyField() == null)
            return false;
        if (other.getHashKeyField() != null && other.getHashKeyField().equals(this.getHashKeyField()) == false)
            return false;
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null)
            return false;
        if (other.getHashKeyValue() != null && other.getHashKeyValue().equals(this.getHashKeyValue()) == false)
            return false;
        if (other.getRangeKeyType() == null ^ this.getRangeKeyType() == null)
            return false;
        if (other.getRangeKeyType() != null && other.getRangeKeyType().equals(this.getRangeKeyType()) == false)
            return false;
        if (other.getRangeKeyField() == null ^ this.getRangeKeyField() == null)
            return false;
        if (other.getRangeKeyField() != null && other.getRangeKeyField().equals(this.getRangeKeyField()) == false)
            return false;
        if (other.getRangeKeyValue() == null ^ this.getRangeKeyValue() == null)
            return false;
        if (other.getRangeKeyValue() != null && other.getRangeKeyValue().equals(this.getRangeKeyValue()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getPayloadField() == null ^ this.getPayloadField() == null)
            return false;
        if (other.getPayloadField() != null && other.getPayloadField().equals(this.getPayloadField()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getHashKeyType() == null) ? 0 : getHashKeyType().hashCode());
        hashCode = prime * hashCode + ((getHashKeyField() == null) ? 0 : getHashKeyField().hashCode());
        hashCode = prime * hashCode + ((getHashKeyValue() == null) ? 0 : getHashKeyValue().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyType() == null) ? 0 : getRangeKeyType().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyField() == null) ? 0 : getRangeKeyField().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyValue() == null) ? 0 : getRangeKeyValue().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPayloadField() == null) ? 0 : getPayloadField().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public DynamoDBAction clone() {
        try {
            return (DynamoDBAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.DynamoDBActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
