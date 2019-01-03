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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to match specific automation executions. This is used to limit the scope of Automation execution
 * information returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AutomationExecutionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecutionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The values used to limit the execution information associated with the filter's key.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     * 
     * @param key
     *        One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     *        ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * @see AutomationExecutionFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     * 
     * @return One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     *         ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * @see AutomationExecutionFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     * 
     * @param key
     *        One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     *        ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionFilterKey
     */

    public AutomationExecutionFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     * 
     * @param key
     *        One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     *        ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * @see AutomationExecutionFilterKey
     */

    public void setKey(AutomationExecutionFilterKey key) {
        withKey(key);
    }

    /**
     * <p>
     * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     * ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * </p>
     * 
     * @param key
     *        One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix,
     *        ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionFilterKey
     */

    public AutomationExecutionFilter withKey(AutomationExecutionFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The values used to limit the execution information associated with the filter's key.
     * </p>
     * 
     * @return The values used to limit the execution information associated with the filter's key.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The values used to limit the execution information associated with the filter's key.
     * </p>
     * 
     * @param values
     *        The values used to limit the execution information associated with the filter's key.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The values used to limit the execution information associated with the filter's key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values used to limit the execution information associated with the filter's key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values used to limit the execution information associated with the filter's key.
     * </p>
     * 
     * @param values
     *        The values used to limit the execution information associated with the filter's key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecutionFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecutionFilter == false)
            return false;
        AutomationExecutionFilter other = (AutomationExecutionFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public AutomationExecutionFilter clone() {
        try {
            return (AutomationExecutionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AutomationExecutionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
