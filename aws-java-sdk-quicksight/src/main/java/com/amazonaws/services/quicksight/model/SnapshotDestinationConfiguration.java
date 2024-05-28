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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information on the Amazon S3 destinations of the generated snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     * configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * </p>
     */
    private java.util.List<SnapshotS3DestinationConfiguration> s3Destinations;

    /**
     * <p>
     * A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     * configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * </p>
     * 
     * @return A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     *         configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     */

    public java.util.List<SnapshotS3DestinationConfiguration> getS3Destinations() {
        return s3Destinations;
    }

    /**
     * <p>
     * A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     * configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * </p>
     * 
     * @param s3Destinations
     *        A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     *        configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     */

    public void setS3Destinations(java.util.Collection<SnapshotS3DestinationConfiguration> s3Destinations) {
        if (s3Destinations == null) {
            this.s3Destinations = null;
            return;
        }

        this.s3Destinations = new java.util.ArrayList<SnapshotS3DestinationConfiguration>(s3Destinations);
    }

    /**
     * <p>
     * A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     * configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Destinations(java.util.Collection)} or {@link #withS3Destinations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param s3Destinations
     *        A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     *        configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotDestinationConfiguration withS3Destinations(SnapshotS3DestinationConfiguration... s3Destinations) {
        if (this.s3Destinations == null) {
            setS3Destinations(new java.util.ArrayList<SnapshotS3DestinationConfiguration>(s3Destinations.length));
        }
        for (SnapshotS3DestinationConfiguration ele : s3Destinations) {
            this.s3Destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     * configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * </p>
     * 
     * @param s3Destinations
     *        A list of <code>SnapshotS3DestinationConfiguration</code> objects that contain Amazon S3 destination
     *        configurations. This structure can hold a maximum of 1 <code>S3DestinationConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotDestinationConfiguration withS3Destinations(java.util.Collection<SnapshotS3DestinationConfiguration> s3Destinations) {
        setS3Destinations(s3Destinations);
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
        if (getS3Destinations() != null)
            sb.append("S3Destinations: ").append(getS3Destinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotDestinationConfiguration == false)
            return false;
        SnapshotDestinationConfiguration other = (SnapshotDestinationConfiguration) obj;
        if (other.getS3Destinations() == null ^ this.getS3Destinations() == null)
            return false;
        if (other.getS3Destinations() != null && other.getS3Destinations().equals(this.getS3Destinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Destinations() == null) ? 0 : getS3Destinations().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotDestinationConfiguration clone() {
        try {
            return (SnapshotDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
