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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of a location
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/LocationModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location's name.
     * </p>
     */
    private String locationName;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift location resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String locationArn;

    /**
     * <p>
     * The location's name.
     * </p>
     * 
     * @param locationName
     *        The location's name.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The location's name.
     * </p>
     * 
     * @return The location's name.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The location's name.
     * </p>
     * 
     * @param locationName
     *        The location's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationModel withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift location resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift location resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift location resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift location resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift location resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift location resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationModel withLocationArn(String locationArn) {
        setLocationArn(locationArn);
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
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName()).append(",");
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationModel == false)
            return false;
        LocationModel other = (LocationModel) obj;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        return hashCode;
    }

    @Override
    public LocationModel clone() {
        try {
            return (LocationModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.LocationModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
