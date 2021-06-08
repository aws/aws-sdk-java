/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an
 * ad break. To learn more about bumpers, see <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html">Bumpers</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Bumper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bumper implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     */
    private String endUrl;
    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     */
    private String startUrl;

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     * 
     * @param endUrl
     *        The URL for the end bumper asset.
     */

    public void setEndUrl(String endUrl) {
        this.endUrl = endUrl;
    }

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     * 
     * @return The URL for the end bumper asset.
     */

    public String getEndUrl() {
        return this.endUrl;
    }

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     * 
     * @param endUrl
     *        The URL for the end bumper asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bumper withEndUrl(String endUrl) {
        setEndUrl(endUrl);
        return this;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     * 
     * @param startUrl
     *        The URL for the start bumper asset.
     */

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     * 
     * @return The URL for the start bumper asset.
     */

    public String getStartUrl() {
        return this.startUrl;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     * 
     * @param startUrl
     *        The URL for the start bumper asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bumper withStartUrl(String startUrl) {
        setStartUrl(startUrl);
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
        if (getEndUrl() != null)
            sb.append("EndUrl: ").append(getEndUrl()).append(",");
        if (getStartUrl() != null)
            sb.append("StartUrl: ").append(getStartUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bumper == false)
            return false;
        Bumper other = (Bumper) obj;
        if (other.getEndUrl() == null ^ this.getEndUrl() == null)
            return false;
        if (other.getEndUrl() != null && other.getEndUrl().equals(this.getEndUrl()) == false)
            return false;
        if (other.getStartUrl() == null ^ this.getStartUrl() == null)
            return false;
        if (other.getStartUrl() != null && other.getStartUrl().equals(this.getStartUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndUrl() == null) ? 0 : getEndUrl().hashCode());
        hashCode = prime * hashCode + ((getStartUrl() == null) ? 0 : getStartUrl().hashCode());
        return hashCode;
    }

    @Override
    public Bumper clone() {
        try {
            return (Bumper) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.BumperMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
