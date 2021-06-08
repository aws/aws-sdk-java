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
 * The display options for the layout of tiles on a sheet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TileLayoutStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TileLayoutStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The gutter settings that apply between tiles.
     * </p>
     */
    private GutterStyle gutter;
    /**
     * <p>
     * The margin settings that apply around the outside edge of sheets.
     * </p>
     */
    private MarginStyle margin;

    /**
     * <p>
     * The gutter settings that apply between tiles.
     * </p>
     * 
     * @param gutter
     *        The gutter settings that apply between tiles.
     */

    public void setGutter(GutterStyle gutter) {
        this.gutter = gutter;
    }

    /**
     * <p>
     * The gutter settings that apply between tiles.
     * </p>
     * 
     * @return The gutter settings that apply between tiles.
     */

    public GutterStyle getGutter() {
        return this.gutter;
    }

    /**
     * <p>
     * The gutter settings that apply between tiles.
     * </p>
     * 
     * @param gutter
     *        The gutter settings that apply between tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TileLayoutStyle withGutter(GutterStyle gutter) {
        setGutter(gutter);
        return this;
    }

    /**
     * <p>
     * The margin settings that apply around the outside edge of sheets.
     * </p>
     * 
     * @param margin
     *        The margin settings that apply around the outside edge of sheets.
     */

    public void setMargin(MarginStyle margin) {
        this.margin = margin;
    }

    /**
     * <p>
     * The margin settings that apply around the outside edge of sheets.
     * </p>
     * 
     * @return The margin settings that apply around the outside edge of sheets.
     */

    public MarginStyle getMargin() {
        return this.margin;
    }

    /**
     * <p>
     * The margin settings that apply around the outside edge of sheets.
     * </p>
     * 
     * @param margin
     *        The margin settings that apply around the outside edge of sheets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TileLayoutStyle withMargin(MarginStyle margin) {
        setMargin(margin);
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
        if (getGutter() != null)
            sb.append("Gutter: ").append(getGutter()).append(",");
        if (getMargin() != null)
            sb.append("Margin: ").append(getMargin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TileLayoutStyle == false)
            return false;
        TileLayoutStyle other = (TileLayoutStyle) obj;
        if (other.getGutter() == null ^ this.getGutter() == null)
            return false;
        if (other.getGutter() != null && other.getGutter().equals(this.getGutter()) == false)
            return false;
        if (other.getMargin() == null ^ this.getMargin() == null)
            return false;
        if (other.getMargin() != null && other.getMargin().equals(this.getMargin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGutter() == null) ? 0 : getGutter().hashCode());
        hashCode = prime * hashCode + ((getMargin() == null) ? 0 : getMargin().hashCode());
        return hashCode;
    }

    @Override
    public TileLayoutStyle clone() {
        try {
            return (TileLayoutStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TileLayoutStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
