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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>BatchGetItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along
     * with a map of attribute data consisting of the data type and attribute value.
     * </p>
     */
    private java.util.Map<String, java.util.List<java.util.Map<String, AttributeValue>>> responses;
    /**
     * <p>
     * A map of tables and their respective keys that were not processed with the current response. The
     * <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided
     * directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code>
     * in the Request Parameters section.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default,
     * all attributes are returned. If a requested attribute is not found, it does not appear in the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.
     * </p>
     */
    private java.util.Map<String, KeysAndAttributes> unprocessedKeys;
    /**
     * <p>
     * The read capacity units consumed by the entire <code>BatchGetItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * <p>
     * A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along
     * with a map of attribute data consisting of the data type and attribute value.
     * </p>
     * 
     * @return A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name,
     *         along with a map of attribute data consisting of the data type and attribute value.
     */

    public java.util.Map<String, java.util.List<java.util.Map<String, AttributeValue>>> getResponses() {
        return responses;
    }

    /**
     * <p>
     * A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along
     * with a map of attribute data consisting of the data type and attribute value.
     * </p>
     * 
     * @param responses
     *        A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name,
     *        along with a map of attribute data consisting of the data type and attribute value.
     */

    public void setResponses(java.util.Map<String, java.util.List<java.util.Map<String, AttributeValue>>> responses) {
        this.responses = responses;
    }

    /**
     * <p>
     * A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along
     * with a map of attribute data consisting of the data type and attribute value.
     * </p>
     * 
     * @param responses
     *        A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name,
     *        along with a map of attribute data consisting of the data type and attribute value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult withResponses(java.util.Map<String, java.util.List<java.util.Map<String, AttributeValue>>> responses) {
        setResponses(responses);
        return this;
    }

    public BatchGetItemResult addResponsesEntry(String key, java.util.List<java.util.Map<String, AttributeValue>> value) {
        if (null == this.responses) {
            this.responses = new java.util.HashMap<String, java.util.List<java.util.Map<String, AttributeValue>>>();
        }
        if (this.responses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Responses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult clearResponsesEntries() {
        this.responses = null;
        return this;
    }

    /**
     * <p>
     * A map of tables and their respective keys that were not processed with the current response. The
     * <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided
     * directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code>
     * in the Request Parameters section.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default,
     * all attributes are returned. If a requested attribute is not found, it does not appear in the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.
     * </p>
     * 
     * @return A map of tables and their respective keys that were not processed with the current response. The
     *         <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be
     *         provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *         <code>RequestItems</code> in the Request Parameters section.</p>
     *         <p>
     *         Each element consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By
     *         default, all attributes are returned. If a requested attribute is not found, it does not appear in the
     *         result.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a
     *         strongly consistent read is used; otherwise, an eventually consistent read is used.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code>
     *         map.
     */

    public java.util.Map<String, KeysAndAttributes> getUnprocessedKeys() {
        return unprocessedKeys;
    }

    /**
     * <p>
     * A map of tables and their respective keys that were not processed with the current response. The
     * <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided
     * directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code>
     * in the Request Parameters section.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default,
     * all attributes are returned. If a requested attribute is not found, it does not appear in the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.
     * </p>
     * 
     * @param unprocessedKeys
     *        A map of tables and their respective keys that were not processed with the current response. The
     *        <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be
     *        provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *        <code>RequestItems</code> in the Request Parameters section.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By
     *        default, all attributes are returned. If a requested attribute is not found, it does not appear in the
     *        result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a
     *        strongly consistent read is used; otherwise, an eventually consistent read is used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code>
     *        map.
     */

    public void setUnprocessedKeys(java.util.Map<String, KeysAndAttributes> unprocessedKeys) {
        this.unprocessedKeys = unprocessedKeys;
    }

    /**
     * <p>
     * A map of tables and their respective keys that were not processed with the current response. The
     * <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided
     * directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code>
     * in the Request Parameters section.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default,
     * all attributes are returned. If a requested attribute is not found, it does not appear in the result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly
     * consistent read is used; otherwise, an eventually consistent read is used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.
     * </p>
     * 
     * @param unprocessedKeys
     *        A map of tables and their respective keys that were not processed with the current response. The
     *        <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be
     *        provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *        <code>RequestItems</code> in the Request Parameters section.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Keys</code> - An array of primary key attribute values that define specific items in the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By
     *        default, all attributes are returned. If a requested attribute is not found, it does not appear in the
     *        result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a
     *        strongly consistent read is used; otherwise, an eventually consistent read is used.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code>
     *        map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult withUnprocessedKeys(java.util.Map<String, KeysAndAttributes> unprocessedKeys) {
        setUnprocessedKeys(unprocessedKeys);
        return this;
    }

    public BatchGetItemResult addUnprocessedKeysEntry(String key, KeysAndAttributes value) {
        if (null == this.unprocessedKeys) {
            this.unprocessedKeys = new java.util.HashMap<String, KeysAndAttributes>();
        }
        if (this.unprocessedKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.unprocessedKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UnprocessedKeys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult clearUnprocessedKeysEntries() {
        this.unprocessedKeys = null;
        return this;
    }

    /**
     * <p>
     * The read capacity units consumed by the entire <code>BatchGetItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p>
     *         <p>
     *         Each element consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TableName</code> - The table that consumed the provisioned throughput.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CapacityUnits</code> - The total number of capacity units consumed.
     *         </p>
     *         </li>
     */

    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * The read capacity units consumed by the entire <code>BatchGetItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumedCapacity
     *        The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     */

    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity);
    }

    /**
     * <p>
     * The read capacity units consumed by the entire <code>BatchGetItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedCapacity(java.util.Collection)} or {@link #withConsumedCapacity(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param consumedCapacity
     *        The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (this.consumedCapacity == null) {
            setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        }
        for (ConsumedCapacity ele : consumedCapacity) {
            this.consumedCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The read capacity units consumed by the entire <code>BatchGetItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumedCapacity
     *        The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
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
        if (getResponses() != null)
            sb.append("Responses: ").append(getResponses()).append(",");
        if (getUnprocessedKeys() != null)
            sb.append("UnprocessedKeys: ").append(getUnprocessedKeys()).append(",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetItemResult == false)
            return false;
        BatchGetItemResult other = (BatchGetItemResult) obj;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false)
            return false;
        if (other.getUnprocessedKeys() == null ^ this.getUnprocessedKeys() == null)
            return false;
        if (other.getUnprocessedKeys() != null && other.getUnprocessedKeys().equals(this.getUnprocessedKeys()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedKeys() == null) ? 0 : getUnprocessedKeys().hashCode());
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetItemResult clone() {
        try {
            return (BatchGetItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
