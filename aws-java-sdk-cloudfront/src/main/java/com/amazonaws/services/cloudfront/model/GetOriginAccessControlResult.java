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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginAccessControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOriginAccessControlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains an origin access control, including its unique identifier.
     * </p>
     */
    private OriginAccessControl originAccessControl;
    /**
     * <p>
     * The version identifier for the current version of the origin access control.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Contains an origin access control, including its unique identifier.
     * </p>
     * 
     * @param originAccessControl
     *        Contains an origin access control, including its unique identifier.
     */

    public void setOriginAccessControl(OriginAccessControl originAccessControl) {
        this.originAccessControl = originAccessControl;
    }

    /**
     * <p>
     * Contains an origin access control, including its unique identifier.
     * </p>
     * 
     * @return Contains an origin access control, including its unique identifier.
     */

    public OriginAccessControl getOriginAccessControl() {
        return this.originAccessControl;
    }

    /**
     * <p>
     * Contains an origin access control, including its unique identifier.
     * </p>
     * 
     * @param originAccessControl
     *        Contains an origin access control, including its unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginAccessControlResult withOriginAccessControl(OriginAccessControl originAccessControl) {
        setOriginAccessControl(originAccessControl);
        return this;
    }

    /**
     * <p>
     * The version identifier for the current version of the origin access control.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the origin access control.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the origin access control.
     * </p>
     * 
     * @return The version identifier for the current version of the origin access control.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the origin access control.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the origin access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginAccessControlResult withETag(String eTag) {
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
        if (getOriginAccessControl() != null)
            sb.append("OriginAccessControl: ").append(getOriginAccessControl()).append(",");
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

        if (obj instanceof GetOriginAccessControlResult == false)
            return false;
        GetOriginAccessControlResult other = (GetOriginAccessControlResult) obj;
        if (other.getOriginAccessControl() == null ^ this.getOriginAccessControl() == null)
            return false;
        if (other.getOriginAccessControl() != null && other.getOriginAccessControl().equals(this.getOriginAccessControl()) == false)
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

        hashCode = prime * hashCode + ((getOriginAccessControl() == null) ? 0 : getOriginAccessControl().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetOriginAccessControlResult clone() {
        try {
            return (GetOriginAccessControlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
