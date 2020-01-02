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
 * In a <a>CreatePredictor</a> operation, the specified algorithm trains a model using the specified dataset group. You
 * can optionally tell the operation to modify data fields prior to training a model. These modifications are referred
 * to as <i>featurization</i>.
 * </p>
 * <p>
 * You define featurization using the <code>FeaturizationConfig</code> object. You specify an array of transformations,
 * one for each field that you want to featurize. You then include the <code>FeaturizationConfig</code> object in your
 * <code>CreatePredictor</code> request. Amazon Forecast applies the featurization to the
 * <code>TARGET_TIME_SERIES</code> dataset before model training.
 * </p>
 * <p>
 * You can create multiple featurization configurations. For example, you might call the <code>CreatePredictor</code>
 * operation twice by specifying different featurization configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/FeaturizationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturizationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     */
    private String forecastFrequency;
    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     * dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you would
     * specify <code>store_id</code> as the dimension.
     * </p>
     * <p>
     * All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be specified in
     * the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     * <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * </p>
     */
    private java.util.List<String> forecastDimensions;
    /**
     * <p>
     * An array of featurization (transformation) information for the fields of a dataset. Only a single featurization
     * is supported.
     * </p>
     */
    private java.util.List<Featurization> featurizations;

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
     *        </p>
     *        <p>
     *        The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *        </p>
     *        <p>
     *        When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *        dataset frequency.
     */

    public void setForecastFrequency(String forecastFrequency) {
        this.forecastFrequency = forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @return The frequency of predictions in a forecast.</p>
     *         <p>
     *         Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *         minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every
     *         year and "5min" indicates every five minutes.
     *         </p>
     *         <p>
     *         The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *         </p>
     *         <p>
     *         When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *         dataset frequency.
     */

    public String getForecastFrequency() {
        return this.forecastFrequency;
    }

    /**
     * <p>
     * The frequency of predictions in a forecast.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min"
     * indicates every five minutes.
     * </p>
     * <p>
     * The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     * </p>
     * <p>
     * When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset
     * frequency.
     * </p>
     * 
     * @param forecastFrequency
     *        The frequency of predictions in a forecast.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year
     *        and "5min" indicates every five minutes.
     *        </p>
     *        <p>
     *        The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency.
     *        </p>
     *        <p>
     *        When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES
     *        dataset frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationConfig withForecastFrequency(String forecastFrequency) {
        setForecastFrequency(forecastFrequency);
        return this;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     * dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you would
     * specify <code>store_id</code> as the dimension.
     * </p>
     * <p>
     * All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be specified in
     * the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     * <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * </p>
     * 
     * @return An array of dimension (field) names that specify how to group the generated forecast.</p>
     *         <p>
     *         For example, suppose that you are generating a forecast for item sales across all of your stores, and
     *         your dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by
     *         store, you would specify <code>store_id</code> as the dimension.
     *         </p>
     *         <p>
     *         All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be
     *         specified in the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     *         <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     */

    public java.util.List<String> getForecastDimensions() {
        return forecastDimensions;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     * dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you would
     * specify <code>store_id</code> as the dimension.
     * </p>
     * <p>
     * All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be specified in
     * the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     * <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     *        dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you
     *        would specify <code>store_id</code> as the dimension.
     *        </p>
     *        <p>
     *        All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be
     *        specified in the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     *        <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     */

    public void setForecastDimensions(java.util.Collection<String> forecastDimensions) {
        if (forecastDimensions == null) {
            this.forecastDimensions = null;
            return;
        }

        this.forecastDimensions = new java.util.ArrayList<String>(forecastDimensions);
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     * dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you would
     * specify <code>store_id</code> as the dimension.
     * </p>
     * <p>
     * All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be specified in
     * the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     * <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastDimensions(java.util.Collection)} or {@link #withForecastDimensions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     *        dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you
     *        would specify <code>store_id</code> as the dimension.
     *        </p>
     *        <p>
     *        All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be
     *        specified in the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     *        <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationConfig withForecastDimensions(String... forecastDimensions) {
        if (this.forecastDimensions == null) {
            setForecastDimensions(new java.util.ArrayList<String>(forecastDimensions.length));
        }
        for (String ele : forecastDimensions) {
            this.forecastDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of dimension (field) names that specify how to group the generated forecast.
     * </p>
     * <p>
     * For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     * dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you would
     * specify <code>store_id</code> as the dimension.
     * </p>
     * <p>
     * All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be specified in
     * the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     * <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * </p>
     * 
     * @param forecastDimensions
     *        An array of dimension (field) names that specify how to group the generated forecast.</p>
     *        <p>
     *        For example, suppose that you are generating a forecast for item sales across all of your stores, and your
     *        dataset contains a <code>store_id</code> field. If you want the sales forecast for each item by store, you
     *        would specify <code>store_id</code> as the dimension.
     *        </p>
     *        <p>
     *        All forecast dimensions specified in the <code>TARGET_TIME_SERIES</code> dataset don't need to be
     *        specified in the <code>CreatePredictor</code> request. All forecast dimensions specified in the
     *        <code>RELATED_TIME_SERIES</code> dataset must be specified in the <code>CreatePredictor</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationConfig withForecastDimensions(java.util.Collection<String> forecastDimensions) {
        setForecastDimensions(forecastDimensions);
        return this;
    }

    /**
     * <p>
     * An array of featurization (transformation) information for the fields of a dataset. Only a single featurization
     * is supported.
     * </p>
     * 
     * @return An array of featurization (transformation) information for the fields of a dataset. Only a single
     *         featurization is supported.
     */

    public java.util.List<Featurization> getFeaturizations() {
        return featurizations;
    }

    /**
     * <p>
     * An array of featurization (transformation) information for the fields of a dataset. Only a single featurization
     * is supported.
     * </p>
     * 
     * @param featurizations
     *        An array of featurization (transformation) information for the fields of a dataset. Only a single
     *        featurization is supported.
     */

    public void setFeaturizations(java.util.Collection<Featurization> featurizations) {
        if (featurizations == null) {
            this.featurizations = null;
            return;
        }

        this.featurizations = new java.util.ArrayList<Featurization>(featurizations);
    }

    /**
     * <p>
     * An array of featurization (transformation) information for the fields of a dataset. Only a single featurization
     * is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturizations(java.util.Collection)} or {@link #withFeaturizations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param featurizations
     *        An array of featurization (transformation) information for the fields of a dataset. Only a single
     *        featurization is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationConfig withFeaturizations(Featurization... featurizations) {
        if (this.featurizations == null) {
            setFeaturizations(new java.util.ArrayList<Featurization>(featurizations.length));
        }
        for (Featurization ele : featurizations) {
            this.featurizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of featurization (transformation) information for the fields of a dataset. Only a single featurization
     * is supported.
     * </p>
     * 
     * @param featurizations
     *        An array of featurization (transformation) information for the fields of a dataset. Only a single
     *        featurization is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturizationConfig withFeaturizations(java.util.Collection<Featurization> featurizations) {
        setFeaturizations(featurizations);
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
        if (getForecastFrequency() != null)
            sb.append("ForecastFrequency: ").append(getForecastFrequency()).append(",");
        if (getForecastDimensions() != null)
            sb.append("ForecastDimensions: ").append(getForecastDimensions()).append(",");
        if (getFeaturizations() != null)
            sb.append("Featurizations: ").append(getFeaturizations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturizationConfig == false)
            return false;
        FeaturizationConfig other = (FeaturizationConfig) obj;
        if (other.getForecastFrequency() == null ^ this.getForecastFrequency() == null)
            return false;
        if (other.getForecastFrequency() != null && other.getForecastFrequency().equals(this.getForecastFrequency()) == false)
            return false;
        if (other.getForecastDimensions() == null ^ this.getForecastDimensions() == null)
            return false;
        if (other.getForecastDimensions() != null && other.getForecastDimensions().equals(this.getForecastDimensions()) == false)
            return false;
        if (other.getFeaturizations() == null ^ this.getFeaturizations() == null)
            return false;
        if (other.getFeaturizations() != null && other.getFeaturizations().equals(this.getFeaturizations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastFrequency() == null) ? 0 : getForecastFrequency().hashCode());
        hashCode = prime * hashCode + ((getForecastDimensions() == null) ? 0 : getForecastDimensions().hashCode());
        hashCode = prime * hashCode + ((getFeaturizations() == null) ? 0 : getFeaturizations().hashCode());
        return hashCode;
    }

    @Override
    public FeaturizationConfig clone() {
        try {
            return (FeaturizationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.FeaturizationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
