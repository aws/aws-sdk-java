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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties associated with the Item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/Properties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Properties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Estimate of cloud cover.
     * </p>
     */
    private Float eoCloudCover;
    /**
     * <p>
     * Land cloud cover for Landsat Data Collection.
     * </p>
     */
    private Float landsatCloudCoverLand;
    /**
     * <p>
     * Platform property. Platform refers to the unique name of the specific platform the instrument is attached to. For
     * satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     * </p>
     */
    private Float viewOffNadir;
    /**
     * <p>
     * The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north and the
     * sun. Measured clockwise in degrees (0-360).
     * </p>
     */
    private Float viewSunAzimuth;
    /**
     * <p>
     * The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from the
     * horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation of -10°
     * means the data was captured during <a
     * href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     * </p>
     */
    private Float viewSunElevation;

    /**
     * <p>
     * Estimate of cloud cover.
     * </p>
     * 
     * @param eoCloudCover
     *        Estimate of cloud cover.
     */

    public void setEoCloudCover(Float eoCloudCover) {
        this.eoCloudCover = eoCloudCover;
    }

    /**
     * <p>
     * Estimate of cloud cover.
     * </p>
     * 
     * @return Estimate of cloud cover.
     */

    public Float getEoCloudCover() {
        return this.eoCloudCover;
    }

    /**
     * <p>
     * Estimate of cloud cover.
     * </p>
     * 
     * @param eoCloudCover
     *        Estimate of cloud cover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withEoCloudCover(Float eoCloudCover) {
        setEoCloudCover(eoCloudCover);
        return this;
    }

    /**
     * <p>
     * Land cloud cover for Landsat Data Collection.
     * </p>
     * 
     * @param landsatCloudCoverLand
     *        Land cloud cover for Landsat Data Collection.
     */

    public void setLandsatCloudCoverLand(Float landsatCloudCoverLand) {
        this.landsatCloudCoverLand = landsatCloudCoverLand;
    }

    /**
     * <p>
     * Land cloud cover for Landsat Data Collection.
     * </p>
     * 
     * @return Land cloud cover for Landsat Data Collection.
     */

    public Float getLandsatCloudCoverLand() {
        return this.landsatCloudCoverLand;
    }

    /**
     * <p>
     * Land cloud cover for Landsat Data Collection.
     * </p>
     * 
     * @param landsatCloudCoverLand
     *        Land cloud cover for Landsat Data Collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withLandsatCloudCoverLand(Float landsatCloudCoverLand) {
        setLandsatCloudCoverLand(landsatCloudCoverLand);
        return this;
    }

    /**
     * <p>
     * Platform property. Platform refers to the unique name of the specific platform the instrument is attached to. For
     * satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     * </p>
     * 
     * @param platform
     *        Platform property. Platform refers to the unique name of the specific platform the instrument is attached
     *        to. For satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Platform property. Platform refers to the unique name of the specific platform the instrument is attached to. For
     * satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     * </p>
     * 
     * @return Platform property. Platform refers to the unique name of the specific platform the instrument is attached
     *         to. For satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Platform property. Platform refers to the unique name of the specific platform the instrument is attached to. For
     * satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     * </p>
     * 
     * @param platform
     *        Platform property. Platform refers to the unique name of the specific platform the instrument is attached
     *        to. For satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     * </p>
     * 
     * @param viewOffNadir
     *        The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     */

    public void setViewOffNadir(Float viewOffNadir) {
        this.viewOffNadir = viewOffNadir;
    }

    /**
     * <p>
     * The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     * </p>
     * 
     * @return The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     */

    public Float getViewOffNadir() {
        return this.viewOffNadir;
    }

    /**
     * <p>
     * The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     * </p>
     * 
     * @param viewOffNadir
     *        The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withViewOffNadir(Float viewOffNadir) {
        setViewOffNadir(viewOffNadir);
        return this;
    }

    /**
     * <p>
     * The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north and the
     * sun. Measured clockwise in degrees (0-360).
     * </p>
     * 
     * @param viewSunAzimuth
     *        The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north
     *        and the sun. Measured clockwise in degrees (0-360).
     */

    public void setViewSunAzimuth(Float viewSunAzimuth) {
        this.viewSunAzimuth = viewSunAzimuth;
    }

    /**
     * <p>
     * The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north and the
     * sun. Measured clockwise in degrees (0-360).
     * </p>
     * 
     * @return The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north
     *         and the sun. Measured clockwise in degrees (0-360).
     */

    public Float getViewSunAzimuth() {
        return this.viewSunAzimuth;
    }

    /**
     * <p>
     * The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north and the
     * sun. Measured clockwise in degrees (0-360).
     * </p>
     * 
     * @param viewSunAzimuth
     *        The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north
     *        and the sun. Measured clockwise in degrees (0-360).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withViewSunAzimuth(Float viewSunAzimuth) {
        setViewSunAzimuth(viewSunAzimuth);
        return this;
    }

    /**
     * <p>
     * The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from the
     * horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation of -10°
     * means the data was captured during <a
     * href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     * </p>
     * 
     * @param viewSunElevation
     *        The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from
     *        the horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation
     *        of -10° means the data was captured during <a
     *        href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     */

    public void setViewSunElevation(Float viewSunElevation) {
        this.viewSunElevation = viewSunElevation;
    }

    /**
     * <p>
     * The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from the
     * horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation of -10°
     * means the data was captured during <a
     * href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     * </p>
     * 
     * @return The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from
     *         the horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun
     *         elevation of -10° means the data was captured during <a
     *         href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     */

    public Float getViewSunElevation() {
        return this.viewSunElevation;
    }

    /**
     * <p>
     * The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from the
     * horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation of -10°
     * means the data was captured during <a
     * href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     * </p>
     * 
     * @param viewSunElevation
     *        The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from
     *        the horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation
     *        of -10° means the data was captured during <a
     *        href="https://www.timeanddate.com/astronomy/different-types-twilight.html">nautical twilight</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Properties withViewSunElevation(Float viewSunElevation) {
        setViewSunElevation(viewSunElevation);
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
        if (getEoCloudCover() != null)
            sb.append("EoCloudCover: ").append(getEoCloudCover()).append(",");
        if (getLandsatCloudCoverLand() != null)
            sb.append("LandsatCloudCoverLand: ").append(getLandsatCloudCoverLand()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getViewOffNadir() != null)
            sb.append("ViewOffNadir: ").append(getViewOffNadir()).append(",");
        if (getViewSunAzimuth() != null)
            sb.append("ViewSunAzimuth: ").append(getViewSunAzimuth()).append(",");
        if (getViewSunElevation() != null)
            sb.append("ViewSunElevation: ").append(getViewSunElevation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Properties == false)
            return false;
        Properties other = (Properties) obj;
        if (other.getEoCloudCover() == null ^ this.getEoCloudCover() == null)
            return false;
        if (other.getEoCloudCover() != null && other.getEoCloudCover().equals(this.getEoCloudCover()) == false)
            return false;
        if (other.getLandsatCloudCoverLand() == null ^ this.getLandsatCloudCoverLand() == null)
            return false;
        if (other.getLandsatCloudCoverLand() != null && other.getLandsatCloudCoverLand().equals(this.getLandsatCloudCoverLand()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getViewOffNadir() == null ^ this.getViewOffNadir() == null)
            return false;
        if (other.getViewOffNadir() != null && other.getViewOffNadir().equals(this.getViewOffNadir()) == false)
            return false;
        if (other.getViewSunAzimuth() == null ^ this.getViewSunAzimuth() == null)
            return false;
        if (other.getViewSunAzimuth() != null && other.getViewSunAzimuth().equals(this.getViewSunAzimuth()) == false)
            return false;
        if (other.getViewSunElevation() == null ^ this.getViewSunElevation() == null)
            return false;
        if (other.getViewSunElevation() != null && other.getViewSunElevation().equals(this.getViewSunElevation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEoCloudCover() == null) ? 0 : getEoCloudCover().hashCode());
        hashCode = prime * hashCode + ((getLandsatCloudCoverLand() == null) ? 0 : getLandsatCloudCoverLand().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getViewOffNadir() == null) ? 0 : getViewOffNadir().hashCode());
        hashCode = prime * hashCode + ((getViewSunAzimuth() == null) ? 0 : getViewSunAzimuth().hashCode());
        hashCode = prime * hashCode + ((getViewSunElevation() == null) ? 0 : getViewSunElevation().hashCode());
        return hashCode;
    }

    @Override
    public Properties clone() {
        try {
            return (Properties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.PropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
