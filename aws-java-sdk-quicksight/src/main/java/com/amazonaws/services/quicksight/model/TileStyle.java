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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Display options related to tiles on a sheet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TileStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TileStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The border around a tile.
     * </p>
     */
    private BorderStyle border;

    /**
     * <p>
     * The border around a tile.
     * </p>
     * 
     * @param border
     *        The border around a tile.
     */

    public void setBorder(BorderStyle border) {
        this.border = border;
    }

    /**
     * <p>
     * The border around a tile.
     * </p>
     * 
     * @return The border around a tile.
     */

    public BorderStyle getBorder() {
        return this.border;
    }

    /**
     * <p>
     * The border around a tile.
     * </p>
     * 
     * @param border
     *        The border around a tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TileStyle withBorder(BorderStyle border) {
        setBorder(border);
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
        if (getBorder() != null)
            sb.append("Border: ").append(getBorder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TileStyle == false)
            return false;
        TileStyle other = (TileStyle) obj;
        if (other.getBorder() == null ^ this.getBorder() == null)
            return false;
        if (other.getBorder() != null && other.getBorder().equals(this.getBorder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBorder() == null) ? 0 : getBorder().hashCode());
        return hashCode;
    }

    @Override
    public TileStyle clone() {
        try {
            return (TileStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TileStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
