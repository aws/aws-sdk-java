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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about the application snapshot.
     * </p>
     */
    private SnapshotDetails snapshotDetails;

    /**
     * <p>
     * An object containing information about the application snapshot.
     * </p>
     * 
     * @param snapshotDetails
     *        An object containing information about the application snapshot.
     */

    public void setSnapshotDetails(SnapshotDetails snapshotDetails) {
        this.snapshotDetails = snapshotDetails;
    }

    /**
     * <p>
     * An object containing information about the application snapshot.
     * </p>
     * 
     * @return An object containing information about the application snapshot.
     */

    public SnapshotDetails getSnapshotDetails() {
        return this.snapshotDetails;
    }

    /**
     * <p>
     * An object containing information about the application snapshot.
     * </p>
     * 
     * @param snapshotDetails
     *        An object containing information about the application snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationSnapshotResult withSnapshotDetails(SnapshotDetails snapshotDetails) {
        setSnapshotDetails(snapshotDetails);
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
        if (getSnapshotDetails() != null)
            sb.append("SnapshotDetails: ").append(getSnapshotDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationSnapshotResult == false)
            return false;
        DescribeApplicationSnapshotResult other = (DescribeApplicationSnapshotResult) obj;
        if (other.getSnapshotDetails() == null ^ this.getSnapshotDetails() == null)
            return false;
        if (other.getSnapshotDetails() != null && other.getSnapshotDetails().equals(this.getSnapshotDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotDetails() == null) ? 0 : getSnapshotDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationSnapshotResult clone() {
        try {
            return (DescribeApplicationSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
