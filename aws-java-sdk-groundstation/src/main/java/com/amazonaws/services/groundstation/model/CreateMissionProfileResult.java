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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateMissionProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMissionProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * UUID of a mission profile.
     * </p>
     */
    private String missionProfileId;

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

    public CreateMissionProfileResult withMissionProfileId(String missionProfileId) {
        setMissionProfileId(missionProfileId);
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
        if (getMissionProfileId() != null)
            sb.append("MissionProfileId: ").append(getMissionProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMissionProfileResult == false)
            return false;
        CreateMissionProfileResult other = (CreateMissionProfileResult) obj;
        if (other.getMissionProfileId() == null ^ this.getMissionProfileId() == null)
            return false;
        if (other.getMissionProfileId() != null && other.getMissionProfileId().equals(this.getMissionProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMissionProfileId() == null) ? 0 : getMissionProfileId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMissionProfileResult clone() {
        try {
            return (CreateMissionProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
