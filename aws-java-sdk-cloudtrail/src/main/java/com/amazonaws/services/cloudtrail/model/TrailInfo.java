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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a CloudTrail trail, including the trail's name, home region, and Amazon Resource Name (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/TrailInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrailInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a trail.
     * </p>
     */
    private String trailARN;
    /**
     * <p>
     * The name of a trail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS region in which a trail was created.
     * </p>
     */
    private String homeRegion;

    /**
     * <p>
     * The ARN of a trail.
     * </p>
     * 
     * @param trailARN
     *        The ARN of a trail.
     */

    public void setTrailARN(String trailARN) {
        this.trailARN = trailARN;
    }

    /**
     * <p>
     * The ARN of a trail.
     * </p>
     * 
     * @return The ARN of a trail.
     */

    public String getTrailARN() {
        return this.trailARN;
    }

    /**
     * <p>
     * The ARN of a trail.
     * </p>
     * 
     * @param trailARN
     *        The ARN of a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailInfo withTrailARN(String trailARN) {
        setTrailARN(trailARN);
        return this;
    }

    /**
     * <p>
     * The name of a trail.
     * </p>
     * 
     * @param name
     *        The name of a trail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a trail.
     * </p>
     * 
     * @return The name of a trail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a trail.
     * </p>
     * 
     * @param name
     *        The name of a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS region in which a trail was created.
     * </p>
     * 
     * @param homeRegion
     *        The AWS region in which a trail was created.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The AWS region in which a trail was created.
     * </p>
     * 
     * @return The AWS region in which a trail was created.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The AWS region in which a trail was created.
     * </p>
     * 
     * @param homeRegion
     *        The AWS region in which a trail was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrailInfo withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
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
        if (getTrailARN() != null)
            sb.append("TrailARN: ").append(getTrailARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrailInfo == false)
            return false;
        TrailInfo other = (TrailInfo) obj;
        if (other.getTrailARN() == null ^ this.getTrailARN() == null)
            return false;
        if (other.getTrailARN() != null && other.getTrailARN().equals(this.getTrailARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrailARN() == null) ? 0 : getTrailARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        return hashCode;
    }

    @Override
    public TrailInfo clone() {
        try {
            return (TrailInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.TrailInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
