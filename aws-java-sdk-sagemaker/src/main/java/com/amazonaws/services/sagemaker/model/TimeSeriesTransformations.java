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
 * Transformations allowed on the dataset. Supported transformations are <code>Filling</code> and
 * <code>Aggregation</code>. <code>Filling</code> specifies how to add values to missing values in the dataset.
 * <code>Aggregation</code> defines how to aggregate data that does not align with forecast frequency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TimeSeriesTransformations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesTransformations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A key value pair defining the filling method for a column, where the key is the column name and the value is an
     * object which defines the filling logic. You can specify multiple filling methods for a single column.
     * </p>
     * <p>
     * The supported filling methods and their corresponding options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>frontfill</code>: <code>none</code> (Supported only for target column)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To set a filling method to a specific value, set the fill parameter to the chosen filling method value (for
     * example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter prefixed with
     * "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must include two
     * parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> filling;
    /**
     * <p>
     * A key value pair defining the aggregation method for a column, where the key is the column name and the value is
     * the aggregation method.
     * </p>
     * <p>
     * The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     * <code>min</code>, <code>max</code>.
     * </p>
     * <note>
     * <p>
     * Aggregation is only supported for the target column.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> aggregation;

    /**
     * <p>
     * A key value pair defining the filling method for a column, where the key is the column name and the value is an
     * object which defines the filling logic. You can specify multiple filling methods for a single column.
     * </p>
     * <p>
     * The supported filling methods and their corresponding options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>frontfill</code>: <code>none</code> (Supported only for target column)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To set a filling method to a specific value, set the fill parameter to the chosen filling method value (for
     * example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter prefixed with
     * "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must include two
     * parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @return A key value pair defining the filling method for a column, where the key is the column name and the value
     *         is an object which defines the filling logic. You can specify multiple filling methods for a single
     *         column.</p>
     *         <p>
     *         The supported filling methods and their corresponding options are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>frontfill</code>: <code>none</code> (Supported only for target column)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *         <code>min</code>, <code>max</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *         <code>min</code>, <code>max</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *         <code>min</code>, <code>max</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To set a filling method to a specific value, set the fill parameter to the chosen filling method value
     *         (for example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter
     *         prefixed with "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must
     *         include two parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     */

    public java.util.Map<String, java.util.Map<String, String>> getFilling() {
        return filling;
    }

    /**
     * <p>
     * A key value pair defining the filling method for a column, where the key is the column name and the value is an
     * object which defines the filling logic. You can specify multiple filling methods for a single column.
     * </p>
     * <p>
     * The supported filling methods and their corresponding options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>frontfill</code>: <code>none</code> (Supported only for target column)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To set a filling method to a specific value, set the fill parameter to the chosen filling method value (for
     * example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter prefixed with
     * "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must include two
     * parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @param filling
     *        A key value pair defining the filling method for a column, where the key is the column name and the value
     *        is an object which defines the filling logic. You can specify multiple filling methods for a single
     *        column.</p>
     *        <p>
     *        The supported filling methods and their corresponding options are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>frontfill</code>: <code>none</code> (Supported only for target column)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To set a filling method to a specific value, set the fill parameter to the chosen filling method value
     *        (for example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter
     *        prefixed with "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must
     *        include two parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     */

    public void setFilling(java.util.Map<String, java.util.Map<String, String>> filling) {
        this.filling = filling;
    }

    /**
     * <p>
     * A key value pair defining the filling method for a column, where the key is the column name and the value is an
     * object which defines the filling logic. You can specify multiple filling methods for a single column.
     * </p>
     * <p>
     * The supported filling methods and their corresponding options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>frontfill</code>: <code>none</code> (Supported only for target column)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To set a filling method to a specific value, set the fill parameter to the chosen filling method value (for
     * example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter prefixed with
     * "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must include two
     * parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @param filling
     *        A key value pair defining the filling method for a column, where the key is the column name and the value
     *        is an object which defines the filling logic. You can specify multiple filling methods for a single
     *        column.</p>
     *        <p>
     *        The supported filling methods and their corresponding options are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>frontfill</code>: <code>none</code> (Supported only for target column)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>middlefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>futurefill</code>: <code>zero</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     *        <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To set a filling method to a specific value, set the fill parameter to the chosen filling method value
     *        (for example <code>"backfill" : "value"</code>), and define the filling value in an additional parameter
     *        prefixed with "_value". For example, to set <code>backfill</code> to a value of <code>2</code>, you must
     *        include two parameters: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations withFilling(java.util.Map<String, java.util.Map<String, String>> filling) {
        setFilling(filling);
        return this;
    }

    /**
     * Add a single Filling entry
     *
     * @see TimeSeriesTransformations#withFilling
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations addFillingEntry(String key, java.util.Map<String, String> value) {
        if (null == this.filling) {
            this.filling = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.filling.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filling.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filling.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations clearFillingEntries() {
        this.filling = null;
        return this;
    }

    /**
     * <p>
     * A key value pair defining the aggregation method for a column, where the key is the column name and the value is
     * the aggregation method.
     * </p>
     * <p>
     * The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     * <code>min</code>, <code>max</code>.
     * </p>
     * <note>
     * <p>
     * Aggregation is only supported for the target column.
     * </p>
     * </note>
     * 
     * @return A key value pair defining the aggregation method for a column, where the key is the column name and the
     *         value is the aggregation method.</p>
     *         <p>
     *         The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     *         <code>min</code>, <code>max</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Aggregation is only supported for the target column.
     *         </p>
     */

    public java.util.Map<String, String> getAggregation() {
        return aggregation;
    }

    /**
     * <p>
     * A key value pair defining the aggregation method for a column, where the key is the column name and the value is
     * the aggregation method.
     * </p>
     * <p>
     * The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     * <code>min</code>, <code>max</code>.
     * </p>
     * <note>
     * <p>
     * Aggregation is only supported for the target column.
     * </p>
     * </note>
     * 
     * @param aggregation
     *        A key value pair defining the aggregation method for a column, where the key is the column name and the
     *        value is the aggregation method.</p>
     *        <p>
     *        The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     *        <code>min</code>, <code>max</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Aggregation is only supported for the target column.
     *        </p>
     */

    public void setAggregation(java.util.Map<String, String> aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * A key value pair defining the aggregation method for a column, where the key is the column name and the value is
     * the aggregation method.
     * </p>
     * <p>
     * The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     * <code>min</code>, <code>max</code>.
     * </p>
     * <note>
     * <p>
     * Aggregation is only supported for the target column.
     * </p>
     * </note>
     * 
     * @param aggregation
     *        A key value pair defining the aggregation method for a column, where the key is the column name and the
     *        value is the aggregation method.</p>
     *        <p>
     *        The supported aggregation methods are <code>sum</code> (default), <code>avg</code>, <code>first</code>,
     *        <code>min</code>, <code>max</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Aggregation is only supported for the target column.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations withAggregation(java.util.Map<String, String> aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * Add a single Aggregation entry
     *
     * @see TimeSeriesTransformations#withAggregation
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations addAggregationEntry(String key, String value) {
        if (null == this.aggregation) {
            this.aggregation = new java.util.HashMap<String, String>();
        }
        if (this.aggregation.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.aggregation.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Aggregation.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesTransformations clearAggregationEntries() {
        this.aggregation = null;
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
        if (getFilling() != null)
            sb.append("Filling: ").append(getFilling()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesTransformations == false)
            return false;
        TimeSeriesTransformations other = (TimeSeriesTransformations) obj;
        if (other.getFilling() == null ^ this.getFilling() == null)
            return false;
        if (other.getFilling() != null && other.getFilling().equals(this.getFilling()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilling() == null) ? 0 : getFilling().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesTransformations clone() {
        try {
            return (TimeSeriesTransformations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TimeSeriesTransformationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
