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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Synchronize Systems Manager Inventory data from multiple AWS accounts defined in AWS Organizations to a centralized
 * Amazon S3 bucket. Data is synchronized to individual key prefixes in the central bucket. Each key prefix represents a
 * different AWS account ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceDataSyncDestinationDataSharing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncDestinationDataSharing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sharing data type. Only <code>Organization</code> is supported.
     * </p>
     */
    private String destinationDataSharingType;

    /**
     * <p>
     * The sharing data type. Only <code>Organization</code> is supported.
     * </p>
     * 
     * @param destinationDataSharingType
     *        The sharing data type. Only <code>Organization</code> is supported.
     */

    public void setDestinationDataSharingType(String destinationDataSharingType) {
        this.destinationDataSharingType = destinationDataSharingType;
    }

    /**
     * <p>
     * The sharing data type. Only <code>Organization</code> is supported.
     * </p>
     * 
     * @return The sharing data type. Only <code>Organization</code> is supported.
     */

    public String getDestinationDataSharingType() {
        return this.destinationDataSharingType;
    }

    /**
     * <p>
     * The sharing data type. Only <code>Organization</code> is supported.
     * </p>
     * 
     * @param destinationDataSharingType
     *        The sharing data type. Only <code>Organization</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncDestinationDataSharing withDestinationDataSharingType(String destinationDataSharingType) {
        setDestinationDataSharingType(destinationDataSharingType);
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
        if (getDestinationDataSharingType() != null)
            sb.append("DestinationDataSharingType: ").append(getDestinationDataSharingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncDestinationDataSharing == false)
            return false;
        ResourceDataSyncDestinationDataSharing other = (ResourceDataSyncDestinationDataSharing) obj;
        if (other.getDestinationDataSharingType() == null ^ this.getDestinationDataSharingType() == null)
            return false;
        if (other.getDestinationDataSharingType() != null && other.getDestinationDataSharingType().equals(this.getDestinationDataSharingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationDataSharingType() == null) ? 0 : getDestinationDataSharingType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataSyncDestinationDataSharing clone() {
        try {
            return (ResourceDataSyncDestinationDataSharing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceDataSyncDestinationDataSharingMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
