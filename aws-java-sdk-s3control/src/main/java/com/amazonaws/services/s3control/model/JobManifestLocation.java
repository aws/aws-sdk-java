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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the information required to locate a manifest object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobManifestLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobManifestLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a manifest object.
     * </p>
     */
    private String objectArn;
    /**
     * <p>
     * The optional version ID to identify a specific version of the manifest object.
     * </p>
     */
    private String objectVersionId;
    /**
     * <p>
     * The ETag for the specified manifest object.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a manifest object.
     * </p>
     * 
     * @param objectArn
     *        The Amazon Resource Name (ARN) for a manifest object.
     */

    public void setObjectArn(String objectArn) {
        this.objectArn = objectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a manifest object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a manifest object.
     */

    public String getObjectArn() {
        return this.objectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a manifest object.
     * </p>
     * 
     * @param objectArn
     *        The Amazon Resource Name (ARN) for a manifest object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestLocation withObjectArn(String objectArn) {
        setObjectArn(objectArn);
        return this;
    }

    /**
     * <p>
     * The optional version ID to identify a specific version of the manifest object.
     * </p>
     * 
     * @param objectVersionId
     *        The optional version ID to identify a specific version of the manifest object.
     */

    public void setObjectVersionId(String objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    /**
     * <p>
     * The optional version ID to identify a specific version of the manifest object.
     * </p>
     * 
     * @return The optional version ID to identify a specific version of the manifest object.
     */

    public String getObjectVersionId() {
        return this.objectVersionId;
    }

    /**
     * <p>
     * The optional version ID to identify a specific version of the manifest object.
     * </p>
     * 
     * @param objectVersionId
     *        The optional version ID to identify a specific version of the manifest object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestLocation withObjectVersionId(String objectVersionId) {
        setObjectVersionId(objectVersionId);
        return this;
    }

    /**
     * <p>
     * The ETag for the specified manifest object.
     * </p>
     * 
     * @param eTag
     *        The ETag for the specified manifest object.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The ETag for the specified manifest object.
     * </p>
     * 
     * @return The ETag for the specified manifest object.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The ETag for the specified manifest object.
     * </p>
     * 
     * @param eTag
     *        The ETag for the specified manifest object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestLocation withETag(String eTag) {
        setETag(eTag);
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
        if (getObjectArn() != null)
            sb.append("ObjectArn: ").append(getObjectArn()).append(",");
        if (getObjectVersionId() != null)
            sb.append("ObjectVersionId: ").append(getObjectVersionId()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobManifestLocation == false)
            return false;
        JobManifestLocation other = (JobManifestLocation) obj;
        if (other.getObjectArn() == null ^ this.getObjectArn() == null)
            return false;
        if (other.getObjectArn() != null && other.getObjectArn().equals(this.getObjectArn()) == false)
            return false;
        if (other.getObjectVersionId() == null ^ this.getObjectVersionId() == null)
            return false;
        if (other.getObjectVersionId() != null && other.getObjectVersionId().equals(this.getObjectVersionId()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectArn() == null) ? 0 : getObjectArn().hashCode());
        hashCode = prime * hashCode + ((getObjectVersionId() == null) ? 0 : getObjectVersionId().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public JobManifestLocation clone() {
        try {
            return (JobManifestLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
