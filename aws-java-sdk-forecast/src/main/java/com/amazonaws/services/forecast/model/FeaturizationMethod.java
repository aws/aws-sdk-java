/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the method that featurizes (transforms) a dataset field. The method is part of the
 * <code>FeaturizationPipeline</code> of the <a>Featurization</a> object. If you don't specify
 * <code>FeaturizationMethodParameters</code>, Amazon Forecast uses default parameters.
 * </p>
 * <p>
 * The following is an example of how you specify a <code>FeaturizationMethod</code> object.
 * </p>
 * <p>
 * <code>{</code>
 * </p>
 * <p>
 * <code>"FeaturizationMethodName": "filling",</code>
 * </p>
 * <p>
 * <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code>
 * </p>
 * <p>
 * <code>}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/FeaturizationMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturizationMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the method. The "filling" method is the only supported method.
     * </p>
     */
    private String featurizationMethodName;
    /**
     * <p>
     * The method parameters (key-value pairs). Specify these parameters to override the default values. The following
     * list shows the parameters and their valid values. Bold signifies the default value.
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
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> featurizationMethodParameters;

    /**
     * <p>
     * The name of the method. The "filling" method is the only supported method.
     * </p>
     * 
     * @param featurizationMethodName
     *        The name of the method. The "filling" method is the only supported method.
     * @see FeaturizationMethodName
     */

    public void setFeaturizationMethodName(String featurizationMethodName) {
        this.featurizationMethodName = featurizationMethodName;
    }

    /**
     * <p>
     * The name of the method. The "filling" method is the only supported method.
     * </p>
     * 
     * @return The name of the method. The "filling" method is the only supported method.
     * @see FeaturizationMethodName
     */

    public String getFeaturizationMethodName() {
        return this.featurizationMethodName;
    }

    /**
     * <p>
     * The name of the method. The "filling" method is the only supported method.
     * </p>
     * 
     * @param featurizationMethodName
     *        The name of the method. The "filling" method is the only supported method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturizationMethodName
     */

    public FeaturizationMethod withFeaturizationMethodName(String featurizationMethodName) {
        setFeaturizationMethodName(featurizationMethodName);
        return this;
    }

    /**
     * <p>
     * The name of the method. The "filling" method is the only supported method.
     * </p>
     * 
     * @param featurizationMethodName
     *        The name of the method. The "filling" method is the only supported method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturizationMethodName
     */

    public FeaturizationMethod withFeaturizationMethodName(FeaturizationMethodName featurizationMethodName) {
        this.featurizationMethodName = featurizationMethodName.toString();
        return this;
    }

    /**
     * <p>
     * The method parameters (key-value pairs). Specify these parameters to override the default values. The following
     * list shows the parameters and their valid values. Bold signifies the default value.
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
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The method parameters (key-value pairs). Specify these parameters to override the default values. The
     *         following list shows the parameters and their valid values. Bold signifies the default value.</p>
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
     *         <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>backfill</code>: <b>zero</b>, <code>nan</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getFeaturizationMethodParameters() {
        return featurizationMethodParameters;
    }

    /**
     * <p>
     * The method parameters (key-value pairs). Specify these parameters to override the default values. The following
     * list shows the parameters and their valid values. Bold signifies the default value.
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
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param featurizationMethodParameters
     *        The method parameters (key-value pairs). Specify these parameters to override the default values. The
     *        following list shows the parameters and their valid values. Bold signifies the default value.</p>
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
     *        <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <b>zero</b>, <code>nan</code>
     *        </p>
     *        </li>
     */

    public void setFeaturizationMethodParameters(java.util.Map<String, String> featurizationMethodParameters) {
        this.featurizationMethodParameters = featurizationMethodParameters;
    }

    /**
     * <p>
     * The method parameters (key-value pairs). Specify these parameters to override the default values. The following
     * list shows the parameters and their valid values. Bold signifies the default value.
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
     * <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>backfill</code>: <b>zero</b>, <code>nan</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param featurizationMethodParameters
     *        The method parameters (key-value pairs). Specify these parameters to override the default values. The
     *        following list shows the parameters and their valid values. Bold signifies the default value.</p>
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
     *        <code>middlefill</code>: <b>zero</b>, <code>nan</code> (not a number)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>backfill</code>: <b>zero</b>, <code>nan</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationMethod withFeaturizationMethodParameters(java.util.Map<String, String> featurizationMethodParameters) {
        setFeaturizationMethodParameters(featurizationMethodParameters);
        return this;
    }

    /**
     * Add a single FeaturizationMethodParameters entry
     *
     * @see FeaturizationMethod#withFeaturizationMethodParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationMethod addFeaturizationMethodParametersEntry(String key, String value) {
        if (null == this.featurizationMethodParameters) {
            this.featurizationMethodParameters = new java.util.HashMap<String, String>();
        }
        if (this.featurizationMethodParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.featurizationMethodParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FeaturizationMethodParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationMethod clearFeaturizationMethodParametersEntries() {
        this.featurizationMethodParameters = null;
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
        if (getFeaturizationMethodName() != null)
            sb.append("FeaturizationMethodName: ").append(getFeaturizationMethodName()).append(",");
        if (getFeaturizationMethodParameters() != null)
            sb.append("FeaturizationMethodParameters: ").append(getFeaturizationMethodParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturizationMethod == false)
            return false;
        FeaturizationMethod other = (FeaturizationMethod) obj;
        if (other.getFeaturizationMethodName() == null ^ this.getFeaturizationMethodName() == null)
            return false;
        if (other.getFeaturizationMethodName() != null && other.getFeaturizationMethodName().equals(this.getFeaturizationMethodName()) == false)
            return false;
        if (other.getFeaturizationMethodParameters() == null ^ this.getFeaturizationMethodParameters() == null)
            return false;
        if (other.getFeaturizationMethodParameters() != null
                && other.getFeaturizationMethodParameters().equals(this.getFeaturizationMethodParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturizationMethodName() == null) ? 0 : getFeaturizationMethodName().hashCode());
        hashCode = prime * hashCode + ((getFeaturizationMethodParameters() == null) ? 0 : getFeaturizationMethodParameters().hashCode());
        return hashCode;
    }

    @Override
    public FeaturizationMethod clone() {
        try {
            return (FeaturizationMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.FeaturizationMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
