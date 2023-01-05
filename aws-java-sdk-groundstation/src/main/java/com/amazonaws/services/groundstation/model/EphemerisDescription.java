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
 * Description of ephemeris.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/EphemerisDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EphemerisDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     */
    private String ephemerisData;
    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     */
    private S3Object sourceS3Object;

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @param ephemerisData
     *        Supplied ephemeris data.
     */

    public void setEphemerisData(String ephemerisData) {
        this.ephemerisData = ephemerisData;
    }

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @return Supplied ephemeris data.
     */

    public String getEphemerisData() {
        return this.ephemerisData;
    }

    /**
     * <p>
     * Supplied ephemeris data.
     * </p>
     * 
     * @param ephemerisData
     *        Supplied ephemeris data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisDescription withEphemerisData(String ephemerisData) {
        setEphemerisData(ephemerisData);
        return this;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @param sourceS3Object
     *        Source S3 object used for the ephemeris.
     */

    public void setSourceS3Object(S3Object sourceS3Object) {
        this.sourceS3Object = sourceS3Object;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @return Source S3 object used for the ephemeris.
     */

    public S3Object getSourceS3Object() {
        return this.sourceS3Object;
    }

    /**
     * <p>
     * Source S3 object used for the ephemeris.
     * </p>
     * 
     * @param sourceS3Object
     *        Source S3 object used for the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisDescription withSourceS3Object(S3Object sourceS3Object) {
        setSourceS3Object(sourceS3Object);
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
        if (getEphemerisData() != null)
            sb.append("EphemerisData: ").append(getEphemerisData()).append(",");
        if (getSourceS3Object() != null)
            sb.append("SourceS3Object: ").append(getSourceS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EphemerisDescription == false)
            return false;
        EphemerisDescription other = (EphemerisDescription) obj;
        if (other.getEphemerisData() == null ^ this.getEphemerisData() == null)
            return false;
        if (other.getEphemerisData() != null && other.getEphemerisData().equals(this.getEphemerisData()) == false)
            return false;
        if (other.getSourceS3Object() == null ^ this.getSourceS3Object() == null)
            return false;
        if (other.getSourceS3Object() != null && other.getSourceS3Object().equals(this.getSourceS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEphemerisData() == null) ? 0 : getEphemerisData().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Object() == null) ? 0 : getSourceS3Object().hashCode());
        return hashCode;
    }

    @Override
    public EphemerisDescription clone() {
        try {
            return (EphemerisDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EphemerisDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
