/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of components that defines the time-series.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TimeSeriesConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column representing the target variable that you want to predict for each item in your dataset.
     * The data type of the target variable must be numerical.
     * </p>
     */
    private String targetAttributeName;
    /**
     * <p>
     * The name of the column indicating a point in time at which the target value of a given item is recorded.
     * </p>
     */
    private String timestampAttributeName;
    /**
     * <p>
     * The name of the column that represents the set of item identifiers for which you want to predict the target
     * value.
     * </p>
     */
    private String itemIdentifierAttributeName;
    /**
     * <p>
     * A set of columns names that can be grouped with the item identifier column to create a composite key for which a
     * target value is predicted.
     * </p>
     */
    private java.util.List<String> groupingAttributeNames;

    /**
     * <p>
     * The name of the column representing the target variable that you want to predict for each item in your dataset.
     * The data type of the target variable must be numerical.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the column representing the target variable that you want to predict for each item in your
     *        dataset. The data type of the target variable must be numerical.
     */

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The name of the column representing the target variable that you want to predict for each item in your dataset.
     * The data type of the target variable must be numerical.
     * </p>
     * 
     * @return The name of the column representing the target variable that you want to predict for each item in your
     *         dataset. The data type of the target variable must be numerical.
     */

    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }

    /**
     * <p>
     * The name of the column representing the target variable that you want to predict for each item in your dataset.
     * The data type of the target variable must be numerical.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the column representing the target variable that you want to predict for each item in your
     *        dataset. The data type of the target variable must be numerical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesConfig withTargetAttributeName(String targetAttributeName) {
        setTargetAttributeName(targetAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the column indicating a point in time at which the target value of a given item is recorded.
     * </p>
     * 
     * @param timestampAttributeName
     *        The name of the column indicating a point in time at which the target value of a given item is recorded.
     */

    public void setTimestampAttributeName(String timestampAttributeName) {
        this.timestampAttributeName = timestampAttributeName;
    }

    /**
     * <p>
     * The name of the column indicating a point in time at which the target value of a given item is recorded.
     * </p>
     * 
     * @return The name of the column indicating a point in time at which the target value of a given item is recorded.
     */

    public String getTimestampAttributeName() {
        return this.timestampAttributeName;
    }

    /**
     * <p>
     * The name of the column indicating a point in time at which the target value of a given item is recorded.
     * </p>
     * 
     * @param timestampAttributeName
     *        The name of the column indicating a point in time at which the target value of a given item is recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesConfig withTimestampAttributeName(String timestampAttributeName) {
        setTimestampAttributeName(timestampAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the column that represents the set of item identifiers for which you want to predict the target
     * value.
     * </p>
     * 
     * @param itemIdentifierAttributeName
     *        The name of the column that represents the set of item identifiers for which you want to predict the
     *        target value.
     */

    public void setItemIdentifierAttributeName(String itemIdentifierAttributeName) {
        this.itemIdentifierAttributeName = itemIdentifierAttributeName;
    }

    /**
     * <p>
     * The name of the column that represents the set of item identifiers for which you want to predict the target
     * value.
     * </p>
     * 
     * @return The name of the column that represents the set of item identifiers for which you want to predict the
     *         target value.
     */

    public String getItemIdentifierAttributeName() {
        return this.itemIdentifierAttributeName;
    }

    /**
     * <p>
     * The name of the column that represents the set of item identifiers for which you want to predict the target
     * value.
     * </p>
     * 
     * @param itemIdentifierAttributeName
     *        The name of the column that represents the set of item identifiers for which you want to predict the
     *        target value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesConfig withItemIdentifierAttributeName(String itemIdentifierAttributeName) {
        setItemIdentifierAttributeName(itemIdentifierAttributeName);
        return this;
    }

    /**
     * <p>
     * A set of columns names that can be grouped with the item identifier column to create a composite key for which a
     * target value is predicted.
     * </p>
     * 
     * @return A set of columns names that can be grouped with the item identifier column to create a composite key for
     *         which a target value is predicted.
     */

    public java.util.List<String> getGroupingAttributeNames() {
        return groupingAttributeNames;
    }

    /**
     * <p>
     * A set of columns names that can be grouped with the item identifier column to create a composite key for which a
     * target value is predicted.
     * </p>
     * 
     * @param groupingAttributeNames
     *        A set of columns names that can be grouped with the item identifier column to create a composite key for
     *        which a target value is predicted.
     */

    public void setGroupingAttributeNames(java.util.Collection<String> groupingAttributeNames) {
        if (groupingAttributeNames == null) {
            this.groupingAttributeNames = null;
            return;
        }

        this.groupingAttributeNames = new java.util.ArrayList<String>(groupingAttributeNames);
    }

    /**
     * <p>
     * A set of columns names that can be grouped with the item identifier column to create a composite key for which a
     * target value is predicted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupingAttributeNames(java.util.Collection)} or
     * {@link #withGroupingAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param groupingAttributeNames
     *        A set of columns names that can be grouped with the item identifier column to create a composite key for
     *        which a target value is predicted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesConfig withGroupingAttributeNames(String... groupingAttributeNames) {
        if (this.groupingAttributeNames == null) {
            setGroupingAttributeNames(new java.util.ArrayList<String>(groupingAttributeNames.length));
        }
        for (String ele : groupingAttributeNames) {
            this.groupingAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of columns names that can be grouped with the item identifier column to create a composite key for which a
     * target value is predicted.
     * </p>
     * 
     * @param groupingAttributeNames
     *        A set of columns names that can be grouped with the item identifier column to create a composite key for
     *        which a target value is predicted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesConfig withGroupingAttributeNames(java.util.Collection<String> groupingAttributeNames) {
        setGroupingAttributeNames(groupingAttributeNames);
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
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: ").append(getTargetAttributeName()).append(",");
        if (getTimestampAttributeName() != null)
            sb.append("TimestampAttributeName: ").append(getTimestampAttributeName()).append(",");
        if (getItemIdentifierAttributeName() != null)
            sb.append("ItemIdentifierAttributeName: ").append(getItemIdentifierAttributeName()).append(",");
        if (getGroupingAttributeNames() != null)
            sb.append("GroupingAttributeNames: ").append(getGroupingAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesConfig == false)
            return false;
        TimeSeriesConfig other = (TimeSeriesConfig) obj;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        if (other.getTimestampAttributeName() == null ^ this.getTimestampAttributeName() == null)
            return false;
        if (other.getTimestampAttributeName() != null && other.getTimestampAttributeName().equals(this.getTimestampAttributeName()) == false)
            return false;
        if (other.getItemIdentifierAttributeName() == null ^ this.getItemIdentifierAttributeName() == null)
            return false;
        if (other.getItemIdentifierAttributeName() != null && other.getItemIdentifierAttributeName().equals(this.getItemIdentifierAttributeName()) == false)
            return false;
        if (other.getGroupingAttributeNames() == null ^ this.getGroupingAttributeNames() == null)
            return false;
        if (other.getGroupingAttributeNames() != null && other.getGroupingAttributeNames().equals(this.getGroupingAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        hashCode = prime * hashCode + ((getTimestampAttributeName() == null) ? 0 : getTimestampAttributeName().hashCode());
        hashCode = prime * hashCode + ((getItemIdentifierAttributeName() == null) ? 0 : getItemIdentifierAttributeName().hashCode());
        hashCode = prime * hashCode + ((getGroupingAttributeNames() == null) ? 0 : getGroupingAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesConfig clone() {
        try {
            return (TimeSeriesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TimeSeriesConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
