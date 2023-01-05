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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Ephemeris data in Orbit Ephemeris Message (OEM) format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/OEMEphemeris" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OEMEphemeris implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     */
    private String oemData;
    /**
     * <p>
     * Identifies the S3 object to be used as the ephemeris.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @param oemData
     *        The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     */

    public void setOemData(String oemData) {
        this.oemData = oemData;
    }

    /**
     * <p>
     * The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @return The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     */

    public String getOemData() {
        return this.oemData;
    }

    /**
     * <p>
     * The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @param oemData
     *        The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OEMEphemeris withOemData(String oemData) {
        setOemData(oemData);
        return this;
    }

    /**
     * <p>
     * Identifies the S3 object to be used as the ephemeris.
     * </p>
     * 
     * @param s3Object
     *        Identifies the S3 object to be used as the ephemeris.
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Identifies the S3 object to be used as the ephemeris.
     * </p>
     * 
     * @return Identifies the S3 object to be used as the ephemeris.
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * <p>
     * Identifies the S3 object to be used as the ephemeris.
     * </p>
     * 
     * @param s3Object
     *        Identifies the S3 object to be used as the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OEMEphemeris withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
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
        if (getOemData() != null)
            sb.append("OemData: ").append(getOemData()).append(",");
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OEMEphemeris == false)
            return false;
        OEMEphemeris other = (OEMEphemeris) obj;
        if (other.getOemData() == null ^ this.getOemData() == null)
            return false;
        if (other.getOemData() != null && other.getOemData().equals(this.getOemData()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOemData() == null) ? 0 : getOemData().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public OEMEphemeris clone() {
        try {
            return (OEMEphemeris) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.OEMEphemerisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
