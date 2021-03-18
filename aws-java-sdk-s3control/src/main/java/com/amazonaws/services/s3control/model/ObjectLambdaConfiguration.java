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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A configuration used when creating an Object Lambda Access Point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ObjectLambdaConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Standard access point associated with the Object Lambda Access Point.
     * </p>
     */
    private String supportingAccessPoint;
    /**
     * <p>
     * A container for whether the CloudWatch metrics configuration is enabled.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;
    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     */
    private java.util.List<String> allowedFeatures;
    /**
     * <p>
     * A container for transformation configurations for an Object Lambda Access Point.
     * </p>
     */
    private java.util.List<ObjectLambdaTransformationConfiguration> transformationConfigurations;

    /**
     * <p>
     * Standard access point associated with the Object Lambda Access Point.
     * </p>
     * 
     * @param supportingAccessPoint
     *        Standard access point associated with the Object Lambda Access Point.
     */

    public void setSupportingAccessPoint(String supportingAccessPoint) {
        this.supportingAccessPoint = supportingAccessPoint;
    }

    /**
     * <p>
     * Standard access point associated with the Object Lambda Access Point.
     * </p>
     * 
     * @return Standard access point associated with the Object Lambda Access Point.
     */

    public String getSupportingAccessPoint() {
        return this.supportingAccessPoint;
    }

    /**
     * <p>
     * Standard access point associated with the Object Lambda Access Point.
     * </p>
     * 
     * @param supportingAccessPoint
     *        Standard access point associated with the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaConfiguration withSupportingAccessPoint(String supportingAccessPoint) {
        setSupportingAccessPoint(supportingAccessPoint);
        return this;
    }

    /**
     * <p>
     * A container for whether the CloudWatch metrics configuration is enabled.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A container for whether the CloudWatch metrics configuration is enabled.
     */

    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A container for whether the CloudWatch metrics configuration is enabled.
     * </p>
     * 
     * @return A container for whether the CloudWatch metrics configuration is enabled.
     */

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A container for whether the CloudWatch metrics configuration is enabled.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A container for whether the CloudWatch metrics configuration is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaConfiguration withCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        setCloudWatchMetricsEnabled(cloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * A container for whether the CloudWatch metrics configuration is enabled.
     * </p>
     * 
     * @return A container for whether the CloudWatch metrics configuration is enabled.
     */

    public Boolean isCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     * 
     * @return A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     *         <code>GetObject-PartNumber</code>.
     * @see ObjectLambdaAllowedFeature
     */

    public java.util.List<String> getAllowedFeatures() {
        return allowedFeatures;
    }

    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     * 
     * @param allowedFeatures
     *        A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     *        <code>GetObject-PartNumber</code>.
     * @see ObjectLambdaAllowedFeature
     */

    public void setAllowedFeatures(java.util.Collection<String> allowedFeatures) {
        if (allowedFeatures == null) {
            this.allowedFeatures = null;
            return;
        }

        this.allowedFeatures = new java.util.ArrayList<String>(allowedFeatures);
    }

    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedFeatures(java.util.Collection)} or {@link #withAllowedFeatures(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedFeatures
     *        A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     *        <code>GetObject-PartNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaAllowedFeature
     */

    public ObjectLambdaConfiguration withAllowedFeatures(String... allowedFeatures) {
        if (this.allowedFeatures == null) {
            setAllowedFeatures(new java.util.ArrayList<String>(allowedFeatures.length));
        }
        for (String ele : allowedFeatures) {
            this.allowedFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     * 
     * @param allowedFeatures
     *        A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     *        <code>GetObject-PartNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaAllowedFeature
     */

    public ObjectLambdaConfiguration withAllowedFeatures(java.util.Collection<String> allowedFeatures) {
        setAllowedFeatures(allowedFeatures);
        return this;
    }

    /**
     * <p>
     * A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     * <code>GetObject-PartNumber</code>.
     * </p>
     * 
     * @param allowedFeatures
     *        A container for allowed features. Valid inputs are <code>GetObject-Range</code> and
     *        <code>GetObject-PartNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaAllowedFeature
     */

    public ObjectLambdaConfiguration withAllowedFeatures(ObjectLambdaAllowedFeature... allowedFeatures) {
        java.util.ArrayList<String> allowedFeaturesCopy = new java.util.ArrayList<String>(allowedFeatures.length);
        for (ObjectLambdaAllowedFeature value : allowedFeatures) {
            allowedFeaturesCopy.add(value.toString());
        }
        if (getAllowedFeatures() == null) {
            setAllowedFeatures(allowedFeaturesCopy);
        } else {
            getAllowedFeatures().addAll(allowedFeaturesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A container for transformation configurations for an Object Lambda Access Point.
     * </p>
     * 
     * @return A container for transformation configurations for an Object Lambda Access Point.
     */

    public java.util.List<ObjectLambdaTransformationConfiguration> getTransformationConfigurations() {
        return transformationConfigurations;
    }

    /**
     * <p>
     * A container for transformation configurations for an Object Lambda Access Point.
     * </p>
     * 
     * @param transformationConfigurations
     *        A container for transformation configurations for an Object Lambda Access Point.
     */

    public void setTransformationConfigurations(java.util.Collection<ObjectLambdaTransformationConfiguration> transformationConfigurations) {
        if (transformationConfigurations == null) {
            this.transformationConfigurations = null;
            return;
        }

        this.transformationConfigurations = new java.util.ArrayList<ObjectLambdaTransformationConfiguration>(transformationConfigurations);
    }

    /**
     * <p>
     * A container for transformation configurations for an Object Lambda Access Point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransformationConfigurations(java.util.Collection)} or
     * {@link #withTransformationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transformationConfigurations
     *        A container for transformation configurations for an Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaConfiguration withTransformationConfigurations(ObjectLambdaTransformationConfiguration... transformationConfigurations) {
        if (this.transformationConfigurations == null) {
            setTransformationConfigurations(new java.util.ArrayList<ObjectLambdaTransformationConfiguration>(transformationConfigurations.length));
        }
        for (ObjectLambdaTransformationConfiguration ele : transformationConfigurations) {
            this.transformationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for transformation configurations for an Object Lambda Access Point.
     * </p>
     * 
     * @param transformationConfigurations
     *        A container for transformation configurations for an Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaConfiguration withTransformationConfigurations(java.util.Collection<ObjectLambdaTransformationConfiguration> transformationConfigurations) {
        setTransformationConfigurations(transformationConfigurations);
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
        if (getSupportingAccessPoint() != null)
            sb.append("SupportingAccessPoint: ").append(getSupportingAccessPoint()).append(",");
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: ").append(getCloudWatchMetricsEnabled()).append(",");
        if (getAllowedFeatures() != null)
            sb.append("AllowedFeatures: ").append(getAllowedFeatures()).append(",");
        if (getTransformationConfigurations() != null)
            sb.append("TransformationConfigurations: ").append(getTransformationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLambdaConfiguration == false)
            return false;
        ObjectLambdaConfiguration other = (ObjectLambdaConfiguration) obj;
        if (other.getSupportingAccessPoint() == null ^ this.getSupportingAccessPoint() == null)
            return false;
        if (other.getSupportingAccessPoint() != null && other.getSupportingAccessPoint().equals(this.getSupportingAccessPoint()) == false)
            return false;
        if (other.getCloudWatchMetricsEnabled() == null ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getAllowedFeatures() == null ^ this.getAllowedFeatures() == null)
            return false;
        if (other.getAllowedFeatures() != null && other.getAllowedFeatures().equals(this.getAllowedFeatures()) == false)
            return false;
        if (other.getTransformationConfigurations() == null ^ this.getTransformationConfigurations() == null)
            return false;
        if (other.getTransformationConfigurations() != null && other.getTransformationConfigurations().equals(this.getTransformationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportingAccessPoint() == null) ? 0 : getSupportingAccessPoint().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAllowedFeatures() == null) ? 0 : getAllowedFeatures().hashCode());
        hashCode = prime * hashCode + ((getTransformationConfigurations() == null) ? 0 : getTransformationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ObjectLambdaConfiguration clone() {
        try {
            return (ObjectLambdaConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
