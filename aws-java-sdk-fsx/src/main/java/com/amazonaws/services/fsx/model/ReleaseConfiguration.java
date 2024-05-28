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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that specifies a minimum amount of time since last access for an exported file to be eligible for
 * release from an Amazon FSx for Lustre file system. Only files that were last accessed before this point-in-time can
 * be released. For example, if you specify a last accessed time criteria of 9 days, only files that were last accessed
 * 9.00001 or more days ago can be released.
 * </p>
 * <p>
 * Only file data that has been exported to S3 can be released. Files that have not yet been exported to S3, such as new
 * or changed files that have not been exported, are not eligible for release. When files are released, their metadata
 * stays on the file system, so they can still be accessed later. Users and applications can access a released file by
 * reading the file again, which restores data from Amazon S3 to the FSx for Lustre file system.
 * </p>
 * <note>
 * <p>
 * If a file meets the last accessed time criteria, its file or directory path must also be specified with the
 * <code>Paths</code> parameter of the operation in order for the file to be released.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ReleaseConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible for
     * release. Only files that were last accessed before this point-in-time are eligible to be released from the file
     * system.
     * </p>
     */
    private DurationSinceLastAccess durationSinceLastAccess;

    /**
     * <p>
     * Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible for
     * release. Only files that were last accessed before this point-in-time are eligible to be released from the file
     * system.
     * </p>
     * 
     * @param durationSinceLastAccess
     *        Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible
     *        for release. Only files that were last accessed before this point-in-time are eligible to be released from
     *        the file system.
     */

    public void setDurationSinceLastAccess(DurationSinceLastAccess durationSinceLastAccess) {
        this.durationSinceLastAccess = durationSinceLastAccess;
    }

    /**
     * <p>
     * Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible for
     * release. Only files that were last accessed before this point-in-time are eligible to be released from the file
     * system.
     * </p>
     * 
     * @return Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible
     *         for release. Only files that were last accessed before this point-in-time are eligible to be released
     *         from the file system.
     */

    public DurationSinceLastAccess getDurationSinceLastAccess() {
        return this.durationSinceLastAccess;
    }

    /**
     * <p>
     * Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible for
     * release. Only files that were last accessed before this point-in-time are eligible to be released from the file
     * system.
     * </p>
     * 
     * @param durationSinceLastAccess
     *        Defines the point-in-time since an exported file was last accessed, in order for that file to be eligible
     *        for release. Only files that were last accessed before this point-in-time are eligible to be released from
     *        the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseConfiguration withDurationSinceLastAccess(DurationSinceLastAccess durationSinceLastAccess) {
        setDurationSinceLastAccess(durationSinceLastAccess);
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
        if (getDurationSinceLastAccess() != null)
            sb.append("DurationSinceLastAccess: ").append(getDurationSinceLastAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseConfiguration == false)
            return false;
        ReleaseConfiguration other = (ReleaseConfiguration) obj;
        if (other.getDurationSinceLastAccess() == null ^ this.getDurationSinceLastAccess() == null)
            return false;
        if (other.getDurationSinceLastAccess() != null && other.getDurationSinceLastAccess().equals(this.getDurationSinceLastAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationSinceLastAccess() == null) ? 0 : getDurationSinceLastAccess().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseConfiguration clone() {
        try {
            return (ReleaseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.ReleaseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
