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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
 * atomically.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactWriteItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactWriteItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     */
    private ConditionCheck conditionCheck;
    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     */
    private Put put;
    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     */
    private Delete delete;
    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     */
    private Update update;

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     * 
     * @param conditionCheck
     *        A request to perform a check item operation.
     */

    public void setConditionCheck(ConditionCheck conditionCheck) {
        this.conditionCheck = conditionCheck;
    }

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     * 
     * @return A request to perform a check item operation.
     */

    public ConditionCheck getConditionCheck() {
        return this.conditionCheck;
    }

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     * 
     * @param conditionCheck
     *        A request to perform a check item operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItem withConditionCheck(ConditionCheck conditionCheck) {
        setConditionCheck(conditionCheck);
        return this;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @param put
     *        A request to perform a <code>PutItem</code> operation.
     */

    public void setPut(Put put) {
        this.put = put;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @return A request to perform a <code>PutItem</code> operation.
     */

    public Put getPut() {
        return this.put;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * 
     * @param put
     *        A request to perform a <code>PutItem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItem withPut(Put put) {
        setPut(put);
        return this;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @param delete
     *        A request to perform a <code>DeleteItem</code> operation.
     */

    public void setDelete(Delete delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @return A request to perform a <code>DeleteItem</code> operation.
     */

    public Delete getDelete() {
        return this.delete;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * 
     * @param delete
     *        A request to perform a <code>DeleteItem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItem withDelete(Delete delete) {
        setDelete(delete);
        return this;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     * 
     * @param update
     *        A request to perform an <code>UpdateItem</code> operation.
     */

    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     * 
     * @return A request to perform an <code>UpdateItem</code> operation.
     */

    public Update getUpdate() {
        return this.update;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     * 
     * @param update
     *        A request to perform an <code>UpdateItem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactWriteItem withUpdate(Update update) {
        setUpdate(update);
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
        if (getConditionCheck() != null)
            sb.append("ConditionCheck: ").append(getConditionCheck()).append(",");
        if (getPut() != null)
            sb.append("Put: ").append(getPut()).append(",");
        if (getDelete() != null)
            sb.append("Delete: ").append(getDelete()).append(",");
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactWriteItem == false)
            return false;
        TransactWriteItem other = (TransactWriteItem) obj;
        if (other.getConditionCheck() == null ^ this.getConditionCheck() == null)
            return false;
        if (other.getConditionCheck() != null && other.getConditionCheck().equals(this.getConditionCheck()) == false)
            return false;
        if (other.getPut() == null ^ this.getPut() == null)
            return false;
        if (other.getPut() != null && other.getPut().equals(this.getPut()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionCheck() == null) ? 0 : getConditionCheck().hashCode());
        hashCode = prime * hashCode + ((getPut() == null) ? 0 : getPut().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        return hashCode;
    }

    @Override
    public TransactWriteItem clone() {
        try {
            return (TransactWriteItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TransactWriteItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
