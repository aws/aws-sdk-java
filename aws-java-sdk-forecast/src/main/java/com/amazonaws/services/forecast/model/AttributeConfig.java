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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the method used to transform attributes.
 * </p>
 * <p>
 * The following is an example using the RETAIL domain:
 * </p>
 * <p>
 * <code>{</code>
 * </p>
 * <p>
 * <code>"AttributeName": "demand",</code>
 * </p>
 * <p>
 * <code>"Transformations": {"aggregation": "sum", "middlefill": "zero", "backfill": "zero"}</code>
 * </p>
 * <p>
 * <code>}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/AttributeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the target
     * time series and the related time series datasets. For example, for the RETAIL domain, the target is
     * <code>demand</code>.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to
     * override the default values. Related Time Series attributes do not accept aggregation parameters.
     * </p>
     * <p>
     * The following list shows the parameters and their valid values for the "filling" featurization method for a
     * <b>Target Time Series</b> dataset. Default values are bolded.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>frontfill</code>: <b>none</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>, <code>median</code>,
     * <code>mean</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following list shows the parameters and their valid values for a <b>Related Time Series</b> featurization
     * method (there are no defaults):
     * </p>
     * <ul>
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
     * To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the value in
     * a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2, include the
     * following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     */
    private java.util.Map<String, String> transformations;

    /**
     * <p>
     * The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the target
     * time series and the related time series datasets. For example, for the RETAIL domain, the target is
     * <code>demand</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the
     *        target time series and the related time series datasets. For example, for the RETAIL domain, the target is
     *        <code>demand</code>.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the target
     * time series and the related time series datasets. For example, for the RETAIL domain, the target is
     * <code>demand</code>.
     * </p>
     * 
     * @return The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the
     *         target time series and the related time series datasets. For example, for the RETAIL domain, the target
     *         is <code>demand</code>.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the target
     * time series and the related time series datasets. For example, for the RETAIL domain, the target is
     * <code>demand</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute as specified in the schema. Amazon Forecast supports the target field of the
     *        target time series and the related time series datasets. For example, for the RETAIL domain, the target is
     *        <code>demand</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeConfig withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to
     * override the default values. Related Time Series attributes do not accept aggregation parameters.
     * </p>
     * <p>
     * The following list shows the parameters and their valid values for the "filling" featurization method for a
     * <b>Target Time Series</b> dataset. Default values are bolded.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>frontfill</code>: <b>none</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>, <code>median</code>,
     * <code>mean</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following list shows the parameters and their valid values for a <b>Related Time Series</b> featurization
     * method (there are no defaults):
     * </p>
     * <ul>
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
     * To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the value in
     * a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2, include the
     * following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @return The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters
     *         to override the default values. Related Time Series attributes do not accept aggregation parameters.</p>
     *         <p>
     *         The following list shows the parameters and their valid values for the "filling" featurization method for
     *         a <b>Target Time Series</b> dataset. Default values are bolded.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>,
     *         <code>max</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>frontfill</code>: <b>none</b>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>,
     *         <code>median</code>, <code>mean</code>, <code>min</code>, <code>max</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>,
     *         <code>mean</code>, <code>min</code>, <code>max</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following list shows the parameters and their valid values for a <b>Related Time Series</b>
     *         featurization method (there are no defaults):
     *         </p>
     *         <ul>
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
     *         To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the
     *         value in a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2,
     *         include the following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     */

    public java.util.Map<String, String> getTransformations() {
        return transformations;
    }

    /**
     * <p>
     * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to
     * override the default values. Related Time Series attributes do not accept aggregation parameters.
     * </p>
     * <p>
     * The following list shows the parameters and their valid values for the "filling" featurization method for a
     * <b>Target Time Series</b> dataset. Default values are bolded.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>frontfill</code>: <b>none</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>, <code>median</code>,
     * <code>mean</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following list shows the parameters and their valid values for a <b>Related Time Series</b> featurization
     * method (there are no defaults):
     * </p>
     * <ul>
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
     * To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the value in
     * a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2, include the
     * following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @param transformations
     *        The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters
     *        to override the default values. Related Time Series attributes do not accept aggregation parameters.</p>
     *        <p>
     *        The following list shows the parameters and their valid values for the "filling" featurization method for
     *        a <b>Target Time Series</b> dataset. Default values are bolded.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>,
     *        <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>frontfill</code>: <b>none</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>,
     *        <code>median</code>, <code>mean</code>, <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>,
     *        <code>mean</code>, <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following list shows the parameters and their valid values for a <b>Related Time Series</b>
     *        featurization method (there are no defaults):
     *        </p>
     *        <ul>
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
     *        To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the
     *        value in a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2,
     *        include the following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     */

    public void setTransformations(java.util.Map<String, String> transformations) {
        this.transformations = transformations;
    }

    /**
     * <p>
     * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to
     * override the default values. Related Time Series attributes do not accept aggregation parameters.
     * </p>
     * <p>
     * The following list shows the parameters and their valid values for the "filling" featurization method for a
     * <b>Target Time Series</b> dataset. Default values are bolded.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>frontfill</code>: <b>none</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>, <code>median</code>,
     * <code>mean</code>, <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>, <code>mean</code>,
     * <code>min</code>, <code>max</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following list shows the parameters and their valid values for a <b>Related Time Series</b> featurization
     * method (there are no defaults):
     * </p>
     * <ul>
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
     * To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the value in
     * a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2, include the
     * following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * </p>
     * 
     * @param transformations
     *        The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters
     *        to override the default values. Related Time Series attributes do not accept aggregation parameters.</p>
     *        <p>
     *        The following list shows the parameters and their valid values for the "filling" featurization method for
     *        a <b>Target Time Series</b> dataset. Default values are bolded.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aggregation</code>: <b>sum</b>, <code>avg</code>, <code>first</code>, <code>min</code>,
     *        <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>frontfill</code>: <b>none</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number), <code>value</code>,
     *        <code>median</code>, <code>mean</code>, <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <b>zero</b>, <code>nan</code>, <code>value</code>, <code>median</code>,
     *        <code>mean</code>, <code>min</code>, <code>max</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following list shows the parameters and their valid values for a <b>Related Time Series</b>
     *        featurization method (there are no defaults):
     *        </p>
     *        <ul>
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
     *        To set a filling method to a specific value, set the fill parameter to <code>value</code> and define the
     *        value in a corresponding <code>_value</code> parameter. For example, to set backfilling to a value of 2,
     *        include the following: <code>"backfill": "value"</code> and <code>"backfill_value":"2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeConfig withTransformations(java.util.Map<String, String> transformations) {
        setTransformations(transformations);
        return this;
    }

    /**
     * Add a single Transformations entry
     *
     * @see AttributeConfig#withTransformations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AttributeConfig addTransformationsEntry(String key, String value) {
        if (null == this.transformations) {
            this.transformations = new java.util.HashMap<String, String>();
        }
        if (this.transformations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.transformations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Transformations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeConfig clearTransformationsEntries() {
        this.transformations = null;
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getTransformations() != null)
            sb.append("Transformations: ").append(getTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeConfig == false)
            return false;
        AttributeConfig other = (AttributeConfig) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getTransformations() == null ^ this.getTransformations() == null)
            return false;
        if (other.getTransformations() != null && other.getTransformations().equals(this.getTransformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getTransformations() == null) ? 0 : getTransformations().hashCode());
        return hashCode;
    }

    @Override
    public AttributeConfig clone() {
        try {
            return (AttributeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.AttributeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
