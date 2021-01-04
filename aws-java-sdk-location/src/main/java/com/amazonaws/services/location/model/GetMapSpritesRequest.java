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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapSprites" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapSpritesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document contain image offsets. Use the following ﬁle names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     */
    private String fileName;
    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     */
    private String mapName;

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document contain image offsets. Use the following ﬁle names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileName
     *        The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sprites.png</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sprites@2x.png</code> for high pixel density displays
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the JSON document contain image offsets. Use the following ﬁle names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sprites.json</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sprites@2x.json</code> for high pixel density displays
     *        </p>
     *        </li>
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document contain image offsets. Use the following ﬁle names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sprites.png</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sprites@2x.png</code> for high pixel density displays
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the JSON document contain image offsets. Use the following ﬁle names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sprites.json</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sprites@2x.json</code> for high pixel density displays
     *         </p>
     *         </li>
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document contain image offsets. Use the following ﬁle names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileName
     *        The name of the sprite ﬁle. Use the following ﬁle names for the sprite sheet:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sprites.png</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sprites@2x.png</code> for high pixel density displays
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the JSON document contain image offsets. Use the following ﬁle names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sprites.json</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sprites@2x.json</code> for high pixel density displays
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapSpritesRequest withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the sprite ﬁle.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * 
     * @return The map resource associated with the sprite ﬁle.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * 
     * @param mapName
     *        The map resource associated with the sprite ﬁle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapSpritesRequest withMapName(String mapName) {
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
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
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

        if (obj instanceof GetMapSpritesRequest == false)
            return false;
        GetMapSpritesRequest other = (GetMapSpritesRequest) obj;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
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

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public GetMapSpritesRequest clone() {
        return (GetMapSpritesRequest) super.clone();
    }

}
