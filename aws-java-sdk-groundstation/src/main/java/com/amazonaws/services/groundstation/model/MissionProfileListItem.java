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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Item in a list of mission profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/MissionProfileListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MissionProfileListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     */
    private String missionProfileArn;
    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     */
    private String missionProfileId;
    /**
     * <p>
     * Name of a mission profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Region of a mission profile.
     * </p>
     */
    private String region;

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @param missionProfileArn
     *        ARN of a mission profile.
     */

    public void setMissionProfileArn(String missionProfileArn) {
        this.missionProfileArn = missionProfileArn;
    }

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @return ARN of a mission profile.
     */

    public String getMissionProfileArn() {
        return this.missionProfileArn;
    }

    /**
     * <p>
     * ARN of a mission profile.
     * </p>
     * 
     * @param missionProfileArn
     *        ARN of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissionProfileListItem withMissionProfileArn(String missionProfileArn) {
        setMissionProfileArn(missionProfileArn);
        return this;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @param missionProfileId
     *        UUID of a mission profile.
     */

    public void setMissionProfileId(String missionProfileId) {
        this.missionProfileId = missionProfileId;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @return UUID of a mission profile.
     */

    public String getMissionProfileId() {
        return this.missionProfileId;
    }

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     * 
     * @param missionProfileId
     *        UUID of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissionProfileListItem withMissionProfileId(String missionProfileId) {
        setMissionProfileId(missionProfileId);
        return this;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @param name
     *        Name of a mission profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @return Name of a mission profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a mission profile.
     * </p>
     * 
     * @param name
     *        Name of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissionProfileListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Region of a mission profile.
     * </p>
     * 
     * @param region
     *        Region of a mission profile.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Region of a mission profile.
     * </p>
     * 
     * @return Region of a mission profile.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Region of a mission profile.
     * </p>
     * 
     * @param region
     *        Region of a mission profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MissionProfileListItem withRegion(String region) {
        setRegion(region);
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
        if (getMissionProfileArn() != null)
            sb.append("MissionProfileArn: ").append(getMissionProfileArn()).append(",");
        if (getMissionProfileId() != null)
            sb.append("MissionProfileId: ").append(getMissionProfileId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MissionProfileListItem == false)
            return false;
        MissionProfileListItem other = (MissionProfileListItem) obj;
        if (other.getMissionProfileArn() == null ^ this.getMissionProfileArn() == null)
            return false;
        if (other.getMissionProfileArn() != null && other.getMissionProfileArn().equals(this.getMissionProfileArn()) == false)
            return false;
        if (other.getMissionProfileId() == null ^ this.getMissionProfileId() == null)
            return false;
        if (other.getMissionProfileId() != null && other.getMissionProfileId().equals(this.getMissionProfileId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMissionProfileArn() == null) ? 0 : getMissionProfileArn().hashCode());
        hashCode = prime * hashCode + ((getMissionProfileId() == null) ? 0 : getMissionProfileId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public MissionProfileListItem clone() {
        try {
            return (MissionProfileListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.MissionProfileListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
