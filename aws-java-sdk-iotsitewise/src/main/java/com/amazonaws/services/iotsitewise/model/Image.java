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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an image that is available at a URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the image.
     * </p>
     */
    private String locationUrl;
    /**
     * <p>
     * The date the image was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the image.
     * </p>
     * 
     * @param locationUrl
     *        A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the
     *        image.
     */

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    /**
     * <p>
     * A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the image.
     * </p>
     * 
     * @return A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the
     *         image.
     */

    public String getLocationUrl() {
        return this.locationUrl;
    }

    /**
     * <p>
     * A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the image.
     * </p>
     * 
     * @param locationUrl
     *        A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withLocationUrl(String locationUrl) {
        setLocationUrl(locationUrl);
        return this;
    }

    /**
     * <p>
     * The date the image was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the image was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the image was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the image was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the image was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the image was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
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
        if (getLocationUrl() != null)
            sb.append("LocationUrl: ").append(getLocationUrl()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getLocationUrl() == null ^ this.getLocationUrl() == null)
            return false;
        if (other.getLocationUrl() != null && other.getLocationUrl().equals(this.getLocationUrl()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationUrl() == null) ? 0 : getLocationUrl().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
