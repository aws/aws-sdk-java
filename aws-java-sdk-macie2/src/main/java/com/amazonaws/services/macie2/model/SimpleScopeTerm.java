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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a property-based condition that determines whether an S3 object is included or excluded from a
 * classification job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SimpleScopeTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleScopeTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - STARTS_WITH
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - Any operator except CONTAINS
     * </p>
     * </li>
     * </ul>
     */
    private String comparator;
    /**
     * <p>
     * The object property to use in the condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or
     * OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise,
     * this array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or
     * awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or
     * last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator to use in the condition. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - STARTS_WITH
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - Any operator except CONTAINS
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - STARTS_WITH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - Any operator except CONTAINS
     *        </p>
     *        </li>
     * @see JobComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - STARTS_WITH
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - Any operator except CONTAINS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operator to use in the condition. Valid values for each supported property (key) are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_KEY - STARTS_WITH
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_SIZE - Any operator except CONTAINS
     *         </p>
     *         </li>
     * @see JobComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - STARTS_WITH
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - Any operator except CONTAINS
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - STARTS_WITH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - Any operator except CONTAINS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleScopeTerm withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - STARTS_WITH
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - Any operator except CONTAINS
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values for each supported property (key) are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - EQ (equals) or NE (not equals)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - STARTS_WITH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - Any operator except CONTAINS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public SimpleScopeTerm withComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The object property to use in the condition.
     * </p>
     * 
     * @param key
     *        The object property to use in the condition.
     * @see ScopeFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object property to use in the condition.
     * </p>
     * 
     * @return The object property to use in the condition.
     * @see ScopeFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The object property to use in the condition.
     * </p>
     * 
     * @param key
     *        The object property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeFilterKey
     */

    public SimpleScopeTerm withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The object property to use in the condition.
     * </p>
     * 
     * @param key
     *        The object property to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeFilterKey
     */

    public SimpleScopeTerm withKey(ScopeFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or
     * OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise,
     * this array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or
     * awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or
     * last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * </p>
     * 
     * @return An array that lists the values to use in the condition. If the value for the key property is
     *         OBJECT_EXTENSION or OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to
     *         join the values. Otherwise, this array can specify only one value.</p>
     *         <p>
     *         Valid values for each supported property (key) are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or
     *         pdf
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example:
     *         logs or awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the
     *         specified value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was
     *         created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or
     * OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise,
     * this array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or
     * awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or
     * last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * </p>
     * 
     * @param values
     *        An array that lists the values to use in the condition. If the value for the key property is
     *        OBJECT_EXTENSION or OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to
     *        join the values. Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported property (key) are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs
     *        or awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the
     *        specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was
     *        created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or
     * OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise,
     * this array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or
     * awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or
     * last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array that lists the values to use in the condition. If the value for the key property is
     *        OBJECT_EXTENSION or OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to
     *        join the values. Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported property (key) are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs
     *        or awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the
     *        specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was
     *        created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleScopeTerm withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or
     * OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise,
     * this array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported property (key) are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or
     * awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or
     * last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     * </p>
     * </li>
     * <li>
     * <p>
     * OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * </p>
     * 
     * @param values
     *        An array that lists the values to use in the condition. If the value for the key property is
     *        OBJECT_EXTENSION or OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to
     *        join the values. Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported property (key) are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs
     *        or awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the
     *        specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was
     *        created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleScopeTerm withValues(java.util.Collection<String> values) {
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
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

        if (obj instanceof SimpleScopeTerm == false)
            return false;
        SimpleScopeTerm other = (SimpleScopeTerm) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SimpleScopeTerm clone() {
        try {
            return (SimpleScopeTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SimpleScopeTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
