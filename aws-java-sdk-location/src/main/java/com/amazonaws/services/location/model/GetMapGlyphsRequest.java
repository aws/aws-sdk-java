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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapGlyphsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     * <code>Noto Sans, Arial Unicode</code>.
     * </p>
     */
    private String fontStack;
    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     */
    private String fontUnicodeRange;
    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     */
    private String mapName;

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     * <code>Noto Sans, Arial Unicode</code>.
     * </p>
     * 
     * @param fontStack
     *        A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     *        <code>Noto Sans, Arial Unicode</code>.
     */

    public void setFontStack(String fontStack) {
        this.fontStack = fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     * <code>Noto Sans, Arial Unicode</code>.
     * </p>
     * 
     * @return A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     *         <code>Noto Sans, Arial Unicode</code>.
     */

    public String getFontStack() {
        return this.fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     * <code>Noto Sans, Arial Unicode</code>.
     * </p>
     * 
     * @param fontStack
     *        A comma-separated list of fonts to load glyphs from in order of preference.. For example,
     *        <code>Noto Sans, Arial Unicode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withFontStack(String fontStack) {
        setFontStack(fontStack);
        return this;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @param fontUnicodeRange
     *        A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *        example, 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *        aligned to multiples of 256.
     */

    public void setFontUnicodeRange(String fontUnicodeRange) {
        this.fontUnicodeRange = fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @return A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *         example, 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *         aligned to multiples of 256.
     */

    public String getFontUnicodeRange() {
        return this.fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For example,
     * 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be aligned to multiples
     * of 256.
     * </p>
     * 
     * @param fontUnicodeRange
     *        A Unicode range of characters to download glyphs for. Each response will contain 256 characters. For
     *        example, 0-255 includes all characters from range <code>U+0000</code> to <code>00FF</code>. Must be
     *        aligned to multiples of 256.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withFontUnicodeRange(String fontUnicodeRange) {
        setFontUnicodeRange(fontUnicodeRange);
        return this;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the glyph ﬁle.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @return The map resource associated with the glyph ﬁle.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the glyph ﬁle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapGlyphsRequest withMapName(String mapName) {
        setMapName(mapName);
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
        if (getFontStack() != null)
            sb.append("FontStack: ").append(getFontStack()).append(",");
        if (getFontUnicodeRange() != null)
            sb.append("FontUnicodeRange: ").append(getFontUnicodeRange()).append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapGlyphsRequest == false)
            return false;
        GetMapGlyphsRequest other = (GetMapGlyphsRequest) obj;
        if (other.getFontStack() == null ^ this.getFontStack() == null)
            return false;
        if (other.getFontStack() != null && other.getFontStack().equals(this.getFontStack()) == false)
            return false;
        if (other.getFontUnicodeRange() == null ^ this.getFontUnicodeRange() == null)
            return false;
        if (other.getFontUnicodeRange() != null && other.getFontUnicodeRange().equals(this.getFontUnicodeRange()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontStack() == null) ? 0 : getFontStack().hashCode());
        hashCode = prime * hashCode + ((getFontUnicodeRange() == null) ? 0 : getFontUnicodeRange().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public GetMapGlyphsRequest clone() {
        return (GetMapGlyphsRequest) super.clone();
    }

}
