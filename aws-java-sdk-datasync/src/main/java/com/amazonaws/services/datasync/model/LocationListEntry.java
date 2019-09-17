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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in a list of locations. <code>LocationListEntry</code> returns an array that contains a
 * list of locations when the <a>ListLocations</a> operation is called.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/LocationListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the
     * export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the
     * location.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     * locations when the <a>ListLocations</a> operation is called.
     * </p>
     * <p>
     * Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     * </p>
     * <p>
     * TYPE designates the type of location. Valid values: NFS | EFS | S3.
     * </p>
     * <p>
     * GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     * <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as <code>myBucket</code>.
     * An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS).
     * </p>
     * <p>
     * SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon
     * EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat
     * as the root of the location.
     * </p>
     * <p/>
     */
    private String locationUri;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the
     * export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the
     * location.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location
     *        is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the
     *        root of the location.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the
     * export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the
     * location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location
     *         is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the
     *         root of the location.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the
     * export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the
     * location.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location
     *        is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the
     *        root of the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationListEntry withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     * locations when the <a>ListLocations</a> operation is called.
     * </p>
     * <p>
     * Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     * </p>
     * <p>
     * TYPE designates the type of location. Valid values: NFS | EFS | S3.
     * </p>
     * <p>
     * GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     * <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as <code>myBucket</code>.
     * An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS).
     * </p>
     * <p>
     * SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon
     * EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat
     * as the root of the location.
     * </p>
     * <p/>
     * 
     * @param locationUri
     *        Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     *        locations when the <a>ListLocations</a> operation is called.
     *        </p>
     *        <p>
     *        Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     *        </p>
     *        <p>
     *        TYPE designates the type of location. Valid values: NFS | EFS | S3.
     *        </p>
     *        <p>
     *        GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     *        <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as
     *        <code>myBucket</code>. An example for NFS is a valid IPv4 address or a host name compliant with Domain
     *        Name Service (DNS).
     *        </p>
     *        <p>
     *        SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and
     *        Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount
     *        to and treat as the root of the location.
     *        </p>
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     * locations when the <a>ListLocations</a> operation is called.
     * </p>
     * <p>
     * Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     * </p>
     * <p>
     * TYPE designates the type of location. Valid values: NFS | EFS | S3.
     * </p>
     * <p>
     * GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     * <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as <code>myBucket</code>.
     * An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS).
     * </p>
     * <p>
     * SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon
     * EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat
     * as the root of the location.
     * </p>
     * <p/>
     * 
     * @return Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list
     *         of locations when the <a>ListLocations</a> operation is called.
     *         </p>
     *         <p>
     *         Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     *         </p>
     *         <p>
     *         TYPE designates the type of location. Valid values: NFS | EFS | S3.
     *         </p>
     *         <p>
     *         GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS
     *         is <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as
     *         <code>myBucket</code>. An example for NFS is a valid IPv4 address or a host name compliant with Domain
     *         Name Service (DNS).
     *         </p>
     *         <p>
     *         SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and
     *         Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you
     *         mount to and treat as the root of the location.
     *         </p>
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     * locations when the <a>ListLocations</a> operation is called.
     * </p>
     * <p>
     * Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     * </p>
     * <p>
     * TYPE designates the type of location. Valid values: NFS | EFS | S3.
     * </p>
     * <p>
     * GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     * <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as <code>myBucket</code>.
     * An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS).
     * </p>
     * <p>
     * SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon
     * EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat
     * as the root of the location.
     * </p>
     * <p/>
     * 
     * @param locationUri
     *        Represents a list of URLs of a location. <code>LocationUri</code> returns an array that contains a list of
     *        locations when the <a>ListLocations</a> operation is called.
     *        </p>
     *        <p>
     *        Format: <code>TYPE://GLOBAL_ID/SUBDIR</code>.
     *        </p>
     *        <p>
     *        TYPE designates the type of location. Valid values: NFS | EFS | S3.
     *        </p>
     *        <p>
     *        GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is
     *        <code>us-east-2.fs-abcd1234</code>. An example for Amazon S3 is the bucket name, such as
     *        <code>myBucket</code>. An example for NFS is a valid IPv4 address or a host name compliant with Domain
     *        Name Service (DNS).
     *        </p>
     *        <p>
     *        SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and
     *        Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount
     *        to and treat as the root of the location.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationListEntry withLocationUri(String locationUri) {
        setLocationUri(locationUri);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationListEntry == false)
            return false;
        LocationListEntry other = (LocationListEntry) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        return hashCode;
    }

    @Override
    public LocationListEntry clone() {
        try {
            return (LocationListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.LocationListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
