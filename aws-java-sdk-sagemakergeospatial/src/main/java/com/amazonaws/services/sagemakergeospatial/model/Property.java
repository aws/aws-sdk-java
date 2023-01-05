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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/Property" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Property implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private EoCloudCoverInput eoCloudCover;
    /** <p/> */
    private LandsatCloudCoverLandInput landsatCloudCoverLand;
    /** <p/> */
    private PlatformInput platform;
    /** <p/> */
    private ViewOffNadirInput viewOffNadir;
    /** <p/> */
    private ViewSunAzimuthInput viewSunAzimuth;
    /** <p/> */
    private ViewSunElevationInput viewSunElevation;

    /**
     * <p/>
     * 
     * @param eoCloudCover
     */

    public void setEoCloudCover(EoCloudCoverInput eoCloudCover) {
        this.eoCloudCover = eoCloudCover;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public EoCloudCoverInput getEoCloudCover() {
        return this.eoCloudCover;
    }

    /**
     * <p/>
     * 
     * @param eoCloudCover
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withEoCloudCover(EoCloudCoverInput eoCloudCover) {
        setEoCloudCover(eoCloudCover);
        return this;
    }

    /**
     * <p/>
     * 
     * @param landsatCloudCoverLand
     */

    public void setLandsatCloudCoverLand(LandsatCloudCoverLandInput landsatCloudCoverLand) {
        this.landsatCloudCoverLand = landsatCloudCoverLand;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public LandsatCloudCoverLandInput getLandsatCloudCoverLand() {
        return this.landsatCloudCoverLand;
    }

    /**
     * <p/>
     * 
     * @param landsatCloudCoverLand
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withLandsatCloudCoverLand(LandsatCloudCoverLandInput landsatCloudCoverLand) {
        setLandsatCloudCoverLand(landsatCloudCoverLand);
        return this;
    }

    /**
     * <p/>
     * 
     * @param platform
     */

    public void setPlatform(PlatformInput platform) {
        this.platform = platform;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public PlatformInput getPlatform() {
        return this.platform;
    }

    /**
     * <p/>
     * 
     * @param platform
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withPlatform(PlatformInput platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p/>
     * 
     * @param viewOffNadir
     */

    public void setViewOffNadir(ViewOffNadirInput viewOffNadir) {
        this.viewOffNadir = viewOffNadir;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ViewOffNadirInput getViewOffNadir() {
        return this.viewOffNadir;
    }

    /**
     * <p/>
     * 
     * @param viewOffNadir
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withViewOffNadir(ViewOffNadirInput viewOffNadir) {
        setViewOffNadir(viewOffNadir);
        return this;
    }

    /**
     * <p/>
     * 
     * @param viewSunAzimuth
     */

    public void setViewSunAzimuth(ViewSunAzimuthInput viewSunAzimuth) {
        this.viewSunAzimuth = viewSunAzimuth;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ViewSunAzimuthInput getViewSunAzimuth() {
        return this.viewSunAzimuth;
    }

    /**
     * <p/>
     * 
     * @param viewSunAzimuth
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withViewSunAzimuth(ViewSunAzimuthInput viewSunAzimuth) {
        setViewSunAzimuth(viewSunAzimuth);
        return this;
    }

    /**
     * <p/>
     * 
     * @param viewSunElevation
     */

    public void setViewSunElevation(ViewSunElevationInput viewSunElevation) {
        this.viewSunElevation = viewSunElevation;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ViewSunElevationInput getViewSunElevation() {
        return this.viewSunElevation;
    }

    /**
     * <p/>
     * 
     * @param viewSunElevation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withViewSunElevation(ViewSunElevationInput viewSunElevation) {
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

        if (obj instanceof Property == false)
            return false;
        Property other = (Property) obj;
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
    public Property clone() {
        try {
            return (Property) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.PropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
