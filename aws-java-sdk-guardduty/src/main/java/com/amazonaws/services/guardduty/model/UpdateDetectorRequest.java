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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     */
    @Deprecated
    private DataSourceConfigurations dataSources;
    /**
     * <p>
     * Provides the features that will be updated for the detector.
     * </p>
     */
    private java.util.List<DetectorFeatureConfiguration> features;

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * 
     * @return The unique ID of the detector to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector to update.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     * 
     * @param enable
     *        Specifies whether the detector is enabled or not enabled.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     * 
     * @return Specifies whether the detector is enabled or not enabled.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     * 
     * @param enable
     *        Specifies whether the detector is enabled or not enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the detector is enabled or not enabled.
     * </p>
     * 
     * @return Specifies whether the detector is enabled or not enabled.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * </p>
     * 
     * @return An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateDetectorRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public UpdateDetectorRequest withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.</p>
     *        <p>
     *        There might be regional differences because some data sources might not be available in all the Amazon Web
     *        Services Regions where GuardDuty is presently supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     */
    @Deprecated
    public void setDataSources(DataSourceConfigurations dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @return Describes which data sources will be updated.</p>
     *         <p>
     *         There might be regional differences because some data sources might not be available in all the Amazon
     *         Web Services Regions where GuardDuty is presently supported. For more information, see <a
     *         href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     */
    @Deprecated
    public DataSourceConfigurations getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.</p>
     *        <p>
     *        There might be regional differences because some data sources might not be available in all the Amazon Web
     *        Services Regions where GuardDuty is presently supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateDetectorRequest withDataSources(DataSourceConfigurations dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * Provides the features that will be updated for the detector.
     * </p>
     * 
     * @return Provides the features that will be updated for the detector.
     */

    public java.util.List<DetectorFeatureConfiguration> getFeatures() {
        return features;
    }

    /**
     * <p>
     * Provides the features that will be updated for the detector.
     * </p>
     * 
     * @param features
     *        Provides the features that will be updated for the detector.
     */

    public void setFeatures(java.util.Collection<DetectorFeatureConfiguration> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<DetectorFeatureConfiguration>(features);
    }

    /**
     * <p>
     * Provides the features that will be updated for the detector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        Provides the features that will be updated for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withFeatures(DetectorFeatureConfiguration... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<DetectorFeatureConfiguration>(features.length));
        }
        for (DetectorFeatureConfiguration ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the features that will be updated for the detector.
     * </p>
     * 
     * @param features
     *        Provides the features that will be updated for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorRequest withFeatures(java.util.Collection<DetectorFeatureConfiguration> features) {
        setFeatures(features);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorRequest == false)
            return false;
        UpdateDetectorRequest other = (UpdateDetectorRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDetectorRequest clone() {
        return (UpdateDetectorRequest) super.clone();
    }

}
