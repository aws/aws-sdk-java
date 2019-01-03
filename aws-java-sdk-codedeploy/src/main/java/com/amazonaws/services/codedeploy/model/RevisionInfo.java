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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an application revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RevisionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevisionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     */
    private RevisionLocation revisionLocation;
    /**
     * <p>
     * Information about an application revision, including usage details and associated deployment groups.
     * </p>
     */
    private GenericRevisionInfo genericRevisionInfo;

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     * 
     * @param revisionLocation
     *        Information about the location and type of an application revision.
     */

    public void setRevisionLocation(RevisionLocation revisionLocation) {
        this.revisionLocation = revisionLocation;
    }

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     * 
     * @return Information about the location and type of an application revision.
     */

    public RevisionLocation getRevisionLocation() {
        return this.revisionLocation;
    }

    /**
     * <p>
     * Information about the location and type of an application revision.
     * </p>
     * 
     * @param revisionLocation
     *        Information about the location and type of an application revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionInfo withRevisionLocation(RevisionLocation revisionLocation) {
        setRevisionLocation(revisionLocation);
        return this;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and associated deployment groups.
     * </p>
     * 
     * @param genericRevisionInfo
     *        Information about an application revision, including usage details and associated deployment groups.
     */

    public void setGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        this.genericRevisionInfo = genericRevisionInfo;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and associated deployment groups.
     * </p>
     * 
     * @return Information about an application revision, including usage details and associated deployment groups.
     */

    public GenericRevisionInfo getGenericRevisionInfo() {
        return this.genericRevisionInfo;
    }

    /**
     * <p>
     * Information about an application revision, including usage details and associated deployment groups.
     * </p>
     * 
     * @param genericRevisionInfo
     *        Information about an application revision, including usage details and associated deployment groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionInfo withGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        setGenericRevisionInfo(genericRevisionInfo);
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
        if (getRevisionLocation() != null)
            sb.append("RevisionLocation: ").append(getRevisionLocation()).append(",");
        if (getGenericRevisionInfo() != null)
            sb.append("GenericRevisionInfo: ").append(getGenericRevisionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionInfo == false)
            return false;
        RevisionInfo other = (RevisionInfo) obj;
        if (other.getRevisionLocation() == null ^ this.getRevisionLocation() == null)
            return false;
        if (other.getRevisionLocation() != null && other.getRevisionLocation().equals(this.getRevisionLocation()) == false)
            return false;
        if (other.getGenericRevisionInfo() == null ^ this.getGenericRevisionInfo() == null)
            return false;
        if (other.getGenericRevisionInfo() != null && other.getGenericRevisionInfo().equals(this.getGenericRevisionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionLocation() == null) ? 0 : getRevisionLocation().hashCode());
        hashCode = prime * hashCode + ((getGenericRevisionInfo() == null) ? 0 : getGenericRevisionInfo().hashCode());
        return hashCode;
    }

    @Override
    public RevisionInfo clone() {
        try {
            return (RevisionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.RevisionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
