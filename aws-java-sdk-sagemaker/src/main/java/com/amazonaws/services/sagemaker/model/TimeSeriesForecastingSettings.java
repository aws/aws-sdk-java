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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Time series forecast settings for the SageMaker Canvas app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TimeSeriesForecastingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesForecastingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the
     * execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution role is
     * not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the Domain that owns
     * the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     * > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in the
     * trust relationship as a service principal.
     * </p>
     */
    private String amazonForecastRoleArn;

    /**
     * <p>
     * Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * </p>
     * 
     * @param status
     *        Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * </p>
     * 
     * @return Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * </p>
     * 
     * @param status
     *        Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public TimeSeriesForecastingSettings withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * </p>
     * 
     * @param status
     *        Describes whether time series forecasting is enabled or disabled in the Canvas app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public TimeSeriesForecastingSettings withStatus(FeatureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the
     * execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution role is
     * not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the Domain that owns
     * the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     * > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in the
     * trust relationship as a service principal.
     * </p>
     * 
     * @param amazonForecastRoleArn
     *        The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses
     *        the execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution
     *        role is not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the
     *        Domain that owns the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have
     *        the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     *        > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in
     *        the trust relationship as a service principal.
     */

    public void setAmazonForecastRoleArn(String amazonForecastRoleArn) {
        this.amazonForecastRoleArn = amazonForecastRoleArn;
    }

    /**
     * <p>
     * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the
     * execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution role is
     * not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the Domain that owns
     * the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     * > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in the
     * trust relationship as a service principal.
     * </p>
     * 
     * @return The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses
     *         the execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an
     *         execution role is not specified in the <code>UserProfile</code>, Canvas uses the execution role specified
     *         in the Domain that owns the <code>UserProfile</code>. To allow time series forecasting, this IAM role
     *         should have the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     *         > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added
     *         in the trust relationship as a service principal.
     */

    public String getAmazonForecastRoleArn() {
        return this.amazonForecastRoleArn;
    }

    /**
     * <p>
     * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the
     * execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution role is
     * not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the Domain that owns
     * the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     * > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in the
     * trust relationship as a service principal.
     * </p>
     * 
     * @param amazonForecastRoleArn
     *        The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses
     *        the execution role specified in the <code>UserProfile</code> that launches the Canvas app. If an execution
     *        role is not specified in the <code>UserProfile</code>, Canvas uses the execution role specified in the
     *        Domain that owns the <code>UserProfile</code>. To allow time series forecasting, this IAM role should have
     *        the <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-canvas.html#security-iam-awsmanpol-AmazonSageMakerCanvasForecastAccess"
     *        > AmazonSageMakerCanvasForecastAccess</a> policy attached and <code>forecast.amazonaws.com</code> added in
     *        the trust relationship as a service principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesForecastingSettings withAmazonForecastRoleArn(String amazonForecastRoleArn) {
        setAmazonForecastRoleArn(amazonForecastRoleArn);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAmazonForecastRoleArn() != null)
            sb.append("AmazonForecastRoleArn: ").append(getAmazonForecastRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesForecastingSettings == false)
            return false;
        TimeSeriesForecastingSettings other = (TimeSeriesForecastingSettings) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAmazonForecastRoleArn() == null ^ this.getAmazonForecastRoleArn() == null)
            return false;
        if (other.getAmazonForecastRoleArn() != null && other.getAmazonForecastRoleArn().equals(this.getAmazonForecastRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAmazonForecastRoleArn() == null) ? 0 : getAmazonForecastRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesForecastingSettings clone() {
        try {
            return (TimeSeriesForecastingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TimeSeriesForecastingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
