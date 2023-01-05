/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of rules associated with a tag.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RowLevelPermissionTagRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowLevelPermissionTagRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique key for a tag.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The column name that a tag key is assigned to.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * A string that you want to use to delimit the values when you pass the values at run time. For example, you can
     * delimit the values with a comma.
     * </p>
     */
    private String tagMultiValueDelimiter;
    /**
     * <p>
     * A string that you want to use to filter by all the values in a column in the dataset and don’t want to list the
     * values one by one. For example, you can use an asterisk as your match all value.
     * </p>
     */
    private String matchAllValue;

    /**
     * <p>
     * The unique key for a tag.
     * </p>
     * 
     * @param tagKey
     *        The unique key for a tag.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The unique key for a tag.
     * </p>
     * 
     * @return The unique key for a tag.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The unique key for a tag.
     * </p>
     * 
     * @param tagKey
     *        The unique key for a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagRule withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The column name that a tag key is assigned to.
     * </p>
     * 
     * @param columnName
     *        The column name that a tag key is assigned to.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The column name that a tag key is assigned to.
     * </p>
     * 
     * @return The column name that a tag key is assigned to.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The column name that a tag key is assigned to.
     * </p>
     * 
     * @param columnName
     *        The column name that a tag key is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagRule withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * A string that you want to use to delimit the values when you pass the values at run time. For example, you can
     * delimit the values with a comma.
     * </p>
     * 
     * @param tagMultiValueDelimiter
     *        A string that you want to use to delimit the values when you pass the values at run time. For example, you
     *        can delimit the values with a comma.
     */

    public void setTagMultiValueDelimiter(String tagMultiValueDelimiter) {
        this.tagMultiValueDelimiter = tagMultiValueDelimiter;
    }

    /**
     * <p>
     * A string that you want to use to delimit the values when you pass the values at run time. For example, you can
     * delimit the values with a comma.
     * </p>
     * 
     * @return A string that you want to use to delimit the values when you pass the values at run time. For example,
     *         you can delimit the values with a comma.
     */

    public String getTagMultiValueDelimiter() {
        return this.tagMultiValueDelimiter;
    }

    /**
     * <p>
     * A string that you want to use to delimit the values when you pass the values at run time. For example, you can
     * delimit the values with a comma.
     * </p>
     * 
     * @param tagMultiValueDelimiter
     *        A string that you want to use to delimit the values when you pass the values at run time. For example, you
     *        can delimit the values with a comma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagRule withTagMultiValueDelimiter(String tagMultiValueDelimiter) {
        setTagMultiValueDelimiter(tagMultiValueDelimiter);
        return this;
    }

    /**
     * <p>
     * A string that you want to use to filter by all the values in a column in the dataset and don’t want to list the
     * values one by one. For example, you can use an asterisk as your match all value.
     * </p>
     * 
     * @param matchAllValue
     *        A string that you want to use to filter by all the values in a column in the dataset and don’t want to
     *        list the values one by one. For example, you can use an asterisk as your match all value.
     */

    public void setMatchAllValue(String matchAllValue) {
        this.matchAllValue = matchAllValue;
    }

    /**
     * <p>
     * A string that you want to use to filter by all the values in a column in the dataset and don’t want to list the
     * values one by one. For example, you can use an asterisk as your match all value.
     * </p>
     * 
     * @return A string that you want to use to filter by all the values in a column in the dataset and don’t want to
     *         list the values one by one. For example, you can use an asterisk as your match all value.
     */

    public String getMatchAllValue() {
        return this.matchAllValue;
    }

    /**
     * <p>
     * A string that you want to use to filter by all the values in a column in the dataset and don’t want to list the
     * values one by one. For example, you can use an asterisk as your match all value.
     * </p>
     * 
     * @param matchAllValue
     *        A string that you want to use to filter by all the values in a column in the dataset and don’t want to
     *        list the values one by one. For example, you can use an asterisk as your match all value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagRule withMatchAllValue(String matchAllValue) {
        setMatchAllValue(matchAllValue);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getTagMultiValueDelimiter() != null)
            sb.append("TagMultiValueDelimiter: ").append(getTagMultiValueDelimiter()).append(",");
        if (getMatchAllValue() != null)
            sb.append("MatchAllValue: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowLevelPermissionTagRule == false)
            return false;
        RowLevelPermissionTagRule other = (RowLevelPermissionTagRule) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getTagMultiValueDelimiter() == null ^ this.getTagMultiValueDelimiter() == null)
            return false;
        if (other.getTagMultiValueDelimiter() != null && other.getTagMultiValueDelimiter().equals(this.getTagMultiValueDelimiter()) == false)
            return false;
        if (other.getMatchAllValue() == null ^ this.getMatchAllValue() == null)
            return false;
        if (other.getMatchAllValue() != null && other.getMatchAllValue().equals(this.getMatchAllValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getTagMultiValueDelimiter() == null) ? 0 : getTagMultiValueDelimiter().hashCode());
        hashCode = prime * hashCode + ((getMatchAllValue() == null) ? 0 : getMatchAllValue().hashCode());
        return hashCode;
    }

    @Override
    public RowLevelPermissionTagRule clone() {
        try {
            return (RowLevelPermissionTagRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RowLevelPermissionTagRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
