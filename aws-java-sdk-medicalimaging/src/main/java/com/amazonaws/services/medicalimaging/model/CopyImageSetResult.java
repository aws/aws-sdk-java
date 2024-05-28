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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The properties of the source image set.
     * </p>
     */
    private CopySourceImageSetProperties sourceImageSetProperties;
    /**
     * <p>
     * The properties of the destination image set.
     * </p>
     */
    private CopyDestinationImageSetProperties destinationImageSetProperties;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The properties of the source image set.
     * </p>
     * 
     * @param sourceImageSetProperties
     *        The properties of the source image set.
     */

    public void setSourceImageSetProperties(CopySourceImageSetProperties sourceImageSetProperties) {
        this.sourceImageSetProperties = sourceImageSetProperties;
    }

    /**
     * <p>
     * The properties of the source image set.
     * </p>
     * 
     * @return The properties of the source image set.
     */

    public CopySourceImageSetProperties getSourceImageSetProperties() {
        return this.sourceImageSetProperties;
    }

    /**
     * <p>
     * The properties of the source image set.
     * </p>
     * 
     * @param sourceImageSetProperties
     *        The properties of the source image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetResult withSourceImageSetProperties(CopySourceImageSetProperties sourceImageSetProperties) {
        setSourceImageSetProperties(sourceImageSetProperties);
        return this;
    }

    /**
     * <p>
     * The properties of the destination image set.
     * </p>
     * 
     * @param destinationImageSetProperties
     *        The properties of the destination image set.
     */

    public void setDestinationImageSetProperties(CopyDestinationImageSetProperties destinationImageSetProperties) {
        this.destinationImageSetProperties = destinationImageSetProperties;
    }

    /**
     * <p>
     * The properties of the destination image set.
     * </p>
     * 
     * @return The properties of the destination image set.
     */

    public CopyDestinationImageSetProperties getDestinationImageSetProperties() {
        return this.destinationImageSetProperties;
    }

    /**
     * <p>
     * The properties of the destination image set.
     * </p>
     * 
     * @param destinationImageSetProperties
     *        The properties of the destination image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetResult withDestinationImageSetProperties(CopyDestinationImageSetProperties destinationImageSetProperties) {
        setDestinationImageSetProperties(destinationImageSetProperties);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getSourceImageSetProperties() != null)
            sb.append("SourceImageSetProperties: ").append(getSourceImageSetProperties()).append(",");
        if (getDestinationImageSetProperties() != null)
            sb.append("DestinationImageSetProperties: ").append(getDestinationImageSetProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageSetResult == false)
            return false;
        CopyImageSetResult other = (CopyImageSetResult) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getSourceImageSetProperties() == null ^ this.getSourceImageSetProperties() == null)
            return false;
        if (other.getSourceImageSetProperties() != null && other.getSourceImageSetProperties().equals(this.getSourceImageSetProperties()) == false)
            return false;
        if (other.getDestinationImageSetProperties() == null ^ this.getDestinationImageSetProperties() == null)
            return false;
        if (other.getDestinationImageSetProperties() != null
                && other.getDestinationImageSetProperties().equals(this.getDestinationImageSetProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getSourceImageSetProperties() == null) ? 0 : getSourceImageSetProperties().hashCode());
        hashCode = prime * hashCode + ((getDestinationImageSetProperties() == null) ? 0 : getDestinationImageSetProperties().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageSetResult clone() {
        try {
            return (CopyImageSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
