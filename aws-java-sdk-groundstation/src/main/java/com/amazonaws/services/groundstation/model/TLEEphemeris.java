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
 * Two-line element set (TLE) ephemeris.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TLEEphemeris" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLEEphemeris implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the S3 object to be used as the ephemeris.
     * </p>
     */
    private S3Object s3Object;
    /**
     * <p>
     * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     */
    private java.util.List<TLEData> tleData;

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

    public TLEEphemeris withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
        return this;
    }

    /**
     * <p>
     * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @return The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     */

    public java.util.List<TLEData> getTleData() {
        return tleData;
    }

    /**
     * <p>
     * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @param tleData
     *        The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     */

    public void setTleData(java.util.Collection<TLEData> tleData) {
        if (tleData == null) {
            this.tleData = null;
            return;
        }

        this.tleData = new java.util.ArrayList<TLEData>(tleData);
    }

    /**
     * <p>
     * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTleData(java.util.Collection)} or {@link #withTleData(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tleData
     *        The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLEEphemeris withTleData(TLEData... tleData) {
        if (this.tleData == null) {
            setTleData(new java.util.ArrayList<TLEData>(tleData.length));
        }
        for (TLEData ele : tleData) {
            this.tleData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * </p>
     * 
     * @param tleData
     *        The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLEEphemeris withTleData(java.util.Collection<TLEData> tleData) {
        setTleData(tleData);
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
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object()).append(",");
        if (getTleData() != null)
            sb.append("TleData: ").append(getTleData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TLEEphemeris == false)
            return false;
        TLEEphemeris other = (TLEEphemeris) obj;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        if (other.getTleData() == null ^ this.getTleData() == null)
            return false;
        if (other.getTleData() != null && other.getTleData().equals(this.getTleData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        hashCode = prime * hashCode + ((getTleData() == null) ? 0 : getTleData().hashCode());
        return hashCode;
    }

    @Override
    public TLEEphemeris clone() {
        try {
            return (TLEEphemeris) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.TLEEphemerisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
