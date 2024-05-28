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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The source image set identifier.
     * </p>
     */
    private String sourceImageSetId;
    /**
     * <p>
     * Copy image set information.
     * </p>
     */
    private CopyImageSetInformation copyImageSetInformation;

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

    public CopyImageSetRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The source image set identifier.
     * </p>
     * 
     * @param sourceImageSetId
     *        The source image set identifier.
     */

    public void setSourceImageSetId(String sourceImageSetId) {
        this.sourceImageSetId = sourceImageSetId;
    }

    /**
     * <p>
     * The source image set identifier.
     * </p>
     * 
     * @return The source image set identifier.
     */

    public String getSourceImageSetId() {
        return this.sourceImageSetId;
    }

    /**
     * <p>
     * The source image set identifier.
     * </p>
     * 
     * @param sourceImageSetId
     *        The source image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetRequest withSourceImageSetId(String sourceImageSetId) {
        setSourceImageSetId(sourceImageSetId);
        return this;
    }

    /**
     * <p>
     * Copy image set information.
     * </p>
     * 
     * @param copyImageSetInformation
     *        Copy image set information.
     */

    public void setCopyImageSetInformation(CopyImageSetInformation copyImageSetInformation) {
        this.copyImageSetInformation = copyImageSetInformation;
    }

    /**
     * <p>
     * Copy image set information.
     * </p>
     * 
     * @return Copy image set information.
     */

    public CopyImageSetInformation getCopyImageSetInformation() {
        return this.copyImageSetInformation;
    }

    /**
     * <p>
     * Copy image set information.
     * </p>
     * 
     * @param copyImageSetInformation
     *        Copy image set information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageSetRequest withCopyImageSetInformation(CopyImageSetInformation copyImageSetInformation) {
        setCopyImageSetInformation(copyImageSetInformation);
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
        if (getSourceImageSetId() != null)
            sb.append("SourceImageSetId: ").append(getSourceImageSetId()).append(",");
        if (getCopyImageSetInformation() != null)
            sb.append("CopyImageSetInformation: ").append(getCopyImageSetInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageSetRequest == false)
            return false;
        CopyImageSetRequest other = (CopyImageSetRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getSourceImageSetId() == null ^ this.getSourceImageSetId() == null)
            return false;
        if (other.getSourceImageSetId() != null && other.getSourceImageSetId().equals(this.getSourceImageSetId()) == false)
            return false;
        if (other.getCopyImageSetInformation() == null ^ this.getCopyImageSetInformation() == null)
            return false;
        if (other.getCopyImageSetInformation() != null && other.getCopyImageSetInformation().equals(this.getCopyImageSetInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getSourceImageSetId() == null) ? 0 : getSourceImageSetId().hashCode());
        hashCode = prime * hashCode + ((getCopyImageSetInformation() == null) ? 0 : getCopyImageSetInformation().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageSetRequest clone() {
        return (CopyImageSetRequest) super.clone();
    }

}
