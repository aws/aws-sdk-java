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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input structure for the JobConfig in an EarthObservationJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/JobConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobConfigInput implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private BandMathConfigInput bandMathConfig;
    /**
     * <p>
     * An object containing information about the job configuration for cloud masking.
     * </p>
     */
    private CloudMaskingConfigInput cloudMaskingConfig;
    /**
     * <p>
     * An object containing information about the job configuration for cloud removal.
     * </p>
     */
    private CloudRemovalConfigInput cloudRemovalConfig;
    /**
     * <p>
     * An object containing information about the job configuration for geomosaic.
     * </p>
     */
    private GeoMosaicConfigInput geoMosaicConfig;
    /**
     * <p>
     * An object containing information about the job configuration for land cover segmentation.
     * </p>
     */
    private LandCoverSegmentationConfigInput landCoverSegmentationConfig;
    /**
     * <p>
     * An object containing information about the job configuration for resampling.
     * </p>
     */
    private ResamplingConfigInput resamplingConfig;
    /** <p/> */
    private StackConfigInput stackConfig;
    /**
     * <p>
     * An object containing information about the job configuration for temporal statistics.
     * </p>
     */
    private TemporalStatisticsConfigInput temporalStatisticsConfig;
    /**
     * <p>
     * An object containing information about the job configuration for zonal statistics.
     * </p>
     */
    private ZonalStatisticsConfigInput zonalStatisticsConfig;

    /**
     * <p/>
     * 
     * @param bandMathConfig
     */

    public void setBandMathConfig(BandMathConfigInput bandMathConfig) {
        this.bandMathConfig = bandMathConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public BandMathConfigInput getBandMathConfig() {
        return this.bandMathConfig;
    }

    /**
     * <p/>
     * 
     * @param bandMathConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withBandMathConfig(BandMathConfigInput bandMathConfig) {
        setBandMathConfig(bandMathConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud masking.
     * </p>
     * 
     * @param cloudMaskingConfig
     *        An object containing information about the job configuration for cloud masking.
     */

    public void setCloudMaskingConfig(CloudMaskingConfigInput cloudMaskingConfig) {
        this.cloudMaskingConfig = cloudMaskingConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud masking.
     * </p>
     * 
     * @return An object containing information about the job configuration for cloud masking.
     */

    public CloudMaskingConfigInput getCloudMaskingConfig() {
        return this.cloudMaskingConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud masking.
     * </p>
     * 
     * @param cloudMaskingConfig
     *        An object containing information about the job configuration for cloud masking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withCloudMaskingConfig(CloudMaskingConfigInput cloudMaskingConfig) {
        setCloudMaskingConfig(cloudMaskingConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud removal.
     * </p>
     * 
     * @param cloudRemovalConfig
     *        An object containing information about the job configuration for cloud removal.
     */

    public void setCloudRemovalConfig(CloudRemovalConfigInput cloudRemovalConfig) {
        this.cloudRemovalConfig = cloudRemovalConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud removal.
     * </p>
     * 
     * @return An object containing information about the job configuration for cloud removal.
     */

    public CloudRemovalConfigInput getCloudRemovalConfig() {
        return this.cloudRemovalConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for cloud removal.
     * </p>
     * 
     * @param cloudRemovalConfig
     *        An object containing information about the job configuration for cloud removal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withCloudRemovalConfig(CloudRemovalConfigInput cloudRemovalConfig) {
        setCloudRemovalConfig(cloudRemovalConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for geomosaic.
     * </p>
     * 
     * @param geoMosaicConfig
     *        An object containing information about the job configuration for geomosaic.
     */

    public void setGeoMosaicConfig(GeoMosaicConfigInput geoMosaicConfig) {
        this.geoMosaicConfig = geoMosaicConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for geomosaic.
     * </p>
     * 
     * @return An object containing information about the job configuration for geomosaic.
     */

    public GeoMosaicConfigInput getGeoMosaicConfig() {
        return this.geoMosaicConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for geomosaic.
     * </p>
     * 
     * @param geoMosaicConfig
     *        An object containing information about the job configuration for geomosaic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withGeoMosaicConfig(GeoMosaicConfigInput geoMosaicConfig) {
        setGeoMosaicConfig(geoMosaicConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for land cover segmentation.
     * </p>
     * 
     * @param landCoverSegmentationConfig
     *        An object containing information about the job configuration for land cover segmentation.
     */

    public void setLandCoverSegmentationConfig(LandCoverSegmentationConfigInput landCoverSegmentationConfig) {
        this.landCoverSegmentationConfig = landCoverSegmentationConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for land cover segmentation.
     * </p>
     * 
     * @return An object containing information about the job configuration for land cover segmentation.
     */

    public LandCoverSegmentationConfigInput getLandCoverSegmentationConfig() {
        return this.landCoverSegmentationConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for land cover segmentation.
     * </p>
     * 
     * @param landCoverSegmentationConfig
     *        An object containing information about the job configuration for land cover segmentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withLandCoverSegmentationConfig(LandCoverSegmentationConfigInput landCoverSegmentationConfig) {
        setLandCoverSegmentationConfig(landCoverSegmentationConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for resampling.
     * </p>
     * 
     * @param resamplingConfig
     *        An object containing information about the job configuration for resampling.
     */

    public void setResamplingConfig(ResamplingConfigInput resamplingConfig) {
        this.resamplingConfig = resamplingConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for resampling.
     * </p>
     * 
     * @return An object containing information about the job configuration for resampling.
     */

    public ResamplingConfigInput getResamplingConfig() {
        return this.resamplingConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for resampling.
     * </p>
     * 
     * @param resamplingConfig
     *        An object containing information about the job configuration for resampling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withResamplingConfig(ResamplingConfigInput resamplingConfig) {
        setResamplingConfig(resamplingConfig);
        return this;
    }

    /**
     * <p/>
     * 
     * @param stackConfig
     */

    public void setStackConfig(StackConfigInput stackConfig) {
        this.stackConfig = stackConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public StackConfigInput getStackConfig() {
        return this.stackConfig;
    }

    /**
     * <p/>
     * 
     * @param stackConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withStackConfig(StackConfigInput stackConfig) {
        setStackConfig(stackConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for temporal statistics.
     * </p>
     * 
     * @param temporalStatisticsConfig
     *        An object containing information about the job configuration for temporal statistics.
     */

    public void setTemporalStatisticsConfig(TemporalStatisticsConfigInput temporalStatisticsConfig) {
        this.temporalStatisticsConfig = temporalStatisticsConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for temporal statistics.
     * </p>
     * 
     * @return An object containing information about the job configuration for temporal statistics.
     */

    public TemporalStatisticsConfigInput getTemporalStatisticsConfig() {
        return this.temporalStatisticsConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for temporal statistics.
     * </p>
     * 
     * @param temporalStatisticsConfig
     *        An object containing information about the job configuration for temporal statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withTemporalStatisticsConfig(TemporalStatisticsConfigInput temporalStatisticsConfig) {
        setTemporalStatisticsConfig(temporalStatisticsConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration for zonal statistics.
     * </p>
     * 
     * @param zonalStatisticsConfig
     *        An object containing information about the job configuration for zonal statistics.
     */

    public void setZonalStatisticsConfig(ZonalStatisticsConfigInput zonalStatisticsConfig) {
        this.zonalStatisticsConfig = zonalStatisticsConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for zonal statistics.
     * </p>
     * 
     * @return An object containing information about the job configuration for zonal statistics.
     */

    public ZonalStatisticsConfigInput getZonalStatisticsConfig() {
        return this.zonalStatisticsConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration for zonal statistics.
     * </p>
     * 
     * @param zonalStatisticsConfig
     *        An object containing information about the job configuration for zonal statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobConfigInput withZonalStatisticsConfig(ZonalStatisticsConfigInput zonalStatisticsConfig) {
        setZonalStatisticsConfig(zonalStatisticsConfig);
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
        if (getBandMathConfig() != null)
            sb.append("BandMathConfig: ").append(getBandMathConfig()).append(",");
        if (getCloudMaskingConfig() != null)
            sb.append("CloudMaskingConfig: ").append(getCloudMaskingConfig()).append(",");
        if (getCloudRemovalConfig() != null)
            sb.append("CloudRemovalConfig: ").append(getCloudRemovalConfig()).append(",");
        if (getGeoMosaicConfig() != null)
            sb.append("GeoMosaicConfig: ").append(getGeoMosaicConfig()).append(",");
        if (getLandCoverSegmentationConfig() != null)
            sb.append("LandCoverSegmentationConfig: ").append(getLandCoverSegmentationConfig()).append(",");
        if (getResamplingConfig() != null)
            sb.append("ResamplingConfig: ").append(getResamplingConfig()).append(",");
        if (getStackConfig() != null)
            sb.append("StackConfig: ").append(getStackConfig()).append(",");
        if (getTemporalStatisticsConfig() != null)
            sb.append("TemporalStatisticsConfig: ").append(getTemporalStatisticsConfig()).append(",");
        if (getZonalStatisticsConfig() != null)
            sb.append("ZonalStatisticsConfig: ").append(getZonalStatisticsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobConfigInput == false)
            return false;
        JobConfigInput other = (JobConfigInput) obj;
        if (other.getBandMathConfig() == null ^ this.getBandMathConfig() == null)
            return false;
        if (other.getBandMathConfig() != null && other.getBandMathConfig().equals(this.getBandMathConfig()) == false)
            return false;
        if (other.getCloudMaskingConfig() == null ^ this.getCloudMaskingConfig() == null)
            return false;
        if (other.getCloudMaskingConfig() != null && other.getCloudMaskingConfig().equals(this.getCloudMaskingConfig()) == false)
            return false;
        if (other.getCloudRemovalConfig() == null ^ this.getCloudRemovalConfig() == null)
            return false;
        if (other.getCloudRemovalConfig() != null && other.getCloudRemovalConfig().equals(this.getCloudRemovalConfig()) == false)
            return false;
        if (other.getGeoMosaicConfig() == null ^ this.getGeoMosaicConfig() == null)
            return false;
        if (other.getGeoMosaicConfig() != null && other.getGeoMosaicConfig().equals(this.getGeoMosaicConfig()) == false)
            return false;
        if (other.getLandCoverSegmentationConfig() == null ^ this.getLandCoverSegmentationConfig() == null)
            return false;
        if (other.getLandCoverSegmentationConfig() != null && other.getLandCoverSegmentationConfig().equals(this.getLandCoverSegmentationConfig()) == false)
            return false;
        if (other.getResamplingConfig() == null ^ this.getResamplingConfig() == null)
            return false;
        if (other.getResamplingConfig() != null && other.getResamplingConfig().equals(this.getResamplingConfig()) == false)
            return false;
        if (other.getStackConfig() == null ^ this.getStackConfig() == null)
            return false;
        if (other.getStackConfig() != null && other.getStackConfig().equals(this.getStackConfig()) == false)
            return false;
        if (other.getTemporalStatisticsConfig() == null ^ this.getTemporalStatisticsConfig() == null)
            return false;
        if (other.getTemporalStatisticsConfig() != null && other.getTemporalStatisticsConfig().equals(this.getTemporalStatisticsConfig()) == false)
            return false;
        if (other.getZonalStatisticsConfig() == null ^ this.getZonalStatisticsConfig() == null)
            return false;
        if (other.getZonalStatisticsConfig() != null && other.getZonalStatisticsConfig().equals(this.getZonalStatisticsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandMathConfig() == null) ? 0 : getBandMathConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudMaskingConfig() == null) ? 0 : getCloudMaskingConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudRemovalConfig() == null) ? 0 : getCloudRemovalConfig().hashCode());
        hashCode = prime * hashCode + ((getGeoMosaicConfig() == null) ? 0 : getGeoMosaicConfig().hashCode());
        hashCode = prime * hashCode + ((getLandCoverSegmentationConfig() == null) ? 0 : getLandCoverSegmentationConfig().hashCode());
        hashCode = prime * hashCode + ((getResamplingConfig() == null) ? 0 : getResamplingConfig().hashCode());
        hashCode = prime * hashCode + ((getStackConfig() == null) ? 0 : getStackConfig().hashCode());
        hashCode = prime * hashCode + ((getTemporalStatisticsConfig() == null) ? 0 : getTemporalStatisticsConfig().hashCode());
        hashCode = prime * hashCode + ((getZonalStatisticsConfig() == null) ? 0 : getZonalStatisticsConfig().hashCode());
        return hashCode;
    }

    @Override
    public JobConfigInput clone() {
        try {
            return (JobConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.JobConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
