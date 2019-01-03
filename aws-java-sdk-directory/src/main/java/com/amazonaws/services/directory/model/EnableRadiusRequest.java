/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>EnableRadius</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableRadius" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableRadiusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to enable MFA.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     */
    private RadiusSettings radiusSettings;

    /**
     * <p>
     * The identifier of the directory for which to enable MFA.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to enable MFA.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to enable MFA.
     * </p>
     * 
     * @return The identifier of the directory for which to enable MFA.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to enable MFA.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to enable MFA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableRadiusRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     */

    public void setRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @return A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     */

    public RadiusSettings getRadiusSettings() {
        return this.radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableRadiusRequest withRadiusSettings(RadiusSettings radiusSettings) {
        setRadiusSettings(radiusSettings);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getRadiusSettings() != null)
            sb.append("RadiusSettings: ").append(getRadiusSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableRadiusRequest == false)
            return false;
        EnableRadiusRequest other = (EnableRadiusRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRadiusSettings() == null ^ this.getRadiusSettings() == null)
            return false;
        if (other.getRadiusSettings() != null && other.getRadiusSettings().equals(this.getRadiusSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRadiusSettings() == null) ? 0 : getRadiusSettings().hashCode());
        return hashCode;
    }

    @Override
    public EnableRadiusRequest clone() {
        return (EnableRadiusRequest) super.clone();
    }

}
