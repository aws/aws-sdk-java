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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tile operation.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The particular assets or bands to tile.
     * </p>
     */
    private java.util.List<String> imageAssets;
    /**
     * <p>
     * Determines whether or not to return a valid data mask.
     * </p>
     */
    private Boolean imageMask;
    /**
     * <p>
     * The output data type of the tile operation.
     * </p>
     */
    private String outputDataType;
    /**
     * <p>
     * The data format of the output tile. The formats include .npy, .png and .jpg.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * Property filters for the imagery to tile.
     * </p>
     */
    private String propertyFilters;
    /**
     * <p>
     * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * </p>
     */
    private String target;
    /**
     * <p>
     * Time range filter applied to imagery to find the images to tile.
     * </p>
     */
    private String timeRangeFilter;
    /**
     * <p>
     * The x coordinate of the tile input.
     * </p>
     */
    private Integer x;
    /**
     * <p>
     * The y coordinate of the tile input.
     * </p>
     */
    private Integer y;
    /**
     * <p>
     * The z coordinate of the tile input.
     * </p>
     */
    private Integer z;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tile operation.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the tile operation.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tile operation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the tile operation.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tile operation.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the tile operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The particular assets or bands to tile.
     * </p>
     * 
     * @return The particular assets or bands to tile.
     */

    public java.util.List<String> getImageAssets() {
        return imageAssets;
    }

    /**
     * <p>
     * The particular assets or bands to tile.
     * </p>
     * 
     * @param imageAssets
     *        The particular assets or bands to tile.
     */

    public void setImageAssets(java.util.Collection<String> imageAssets) {
        if (imageAssets == null) {
            this.imageAssets = null;
            return;
        }

        this.imageAssets = new java.util.ArrayList<String>(imageAssets);
    }

    /**
     * <p>
     * The particular assets or bands to tile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageAssets(java.util.Collection)} or {@link #withImageAssets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageAssets
     *        The particular assets or bands to tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withImageAssets(String... imageAssets) {
        if (this.imageAssets == null) {
            setImageAssets(new java.util.ArrayList<String>(imageAssets.length));
        }
        for (String ele : imageAssets) {
            this.imageAssets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The particular assets or bands to tile.
     * </p>
     * 
     * @param imageAssets
     *        The particular assets or bands to tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withImageAssets(java.util.Collection<String> imageAssets) {
        setImageAssets(imageAssets);
        return this;
    }

    /**
     * <p>
     * Determines whether or not to return a valid data mask.
     * </p>
     * 
     * @param imageMask
     *        Determines whether or not to return a valid data mask.
     */

    public void setImageMask(Boolean imageMask) {
        this.imageMask = imageMask;
    }

    /**
     * <p>
     * Determines whether or not to return a valid data mask.
     * </p>
     * 
     * @return Determines whether or not to return a valid data mask.
     */

    public Boolean getImageMask() {
        return this.imageMask;
    }

    /**
     * <p>
     * Determines whether or not to return a valid data mask.
     * </p>
     * 
     * @param imageMask
     *        Determines whether or not to return a valid data mask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withImageMask(Boolean imageMask) {
        setImageMask(imageMask);
        return this;
    }

    /**
     * <p>
     * Determines whether or not to return a valid data mask.
     * </p>
     * 
     * @return Determines whether or not to return a valid data mask.
     */

    public Boolean isImageMask() {
        return this.imageMask;
    }

    /**
     * <p>
     * The output data type of the tile operation.
     * </p>
     * 
     * @param outputDataType
     *        The output data type of the tile operation.
     * @see OutputType
     */

    public void setOutputDataType(String outputDataType) {
        this.outputDataType = outputDataType;
    }

    /**
     * <p>
     * The output data type of the tile operation.
     * </p>
     * 
     * @return The output data type of the tile operation.
     * @see OutputType
     */

    public String getOutputDataType() {
        return this.outputDataType;
    }

    /**
     * <p>
     * The output data type of the tile operation.
     * </p>
     * 
     * @param outputDataType
     *        The output data type of the tile operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public GetTileRequest withOutputDataType(String outputDataType) {
        setOutputDataType(outputDataType);
        return this;
    }

    /**
     * <p>
     * The output data type of the tile operation.
     * </p>
     * 
     * @param outputDataType
     *        The output data type of the tile operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public GetTileRequest withOutputDataType(OutputType outputDataType) {
        this.outputDataType = outputDataType.toString();
        return this;
    }

    /**
     * <p>
     * The data format of the output tile. The formats include .npy, .png and .jpg.
     * </p>
     * 
     * @param outputFormat
     *        The data format of the output tile. The formats include .npy, .png and .jpg.
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The data format of the output tile. The formats include .npy, .png and .jpg.
     * </p>
     * 
     * @return The data format of the output tile. The formats include .npy, .png and .jpg.
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The data format of the output tile. The formats include .npy, .png and .jpg.
     * </p>
     * 
     * @param outputFormat
     *        The data format of the output tile. The formats include .npy, .png and .jpg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * Property filters for the imagery to tile.
     * </p>
     * 
     * @param propertyFilters
     *        Property filters for the imagery to tile.
     */

    public void setPropertyFilters(String propertyFilters) {
        this.propertyFilters = propertyFilters;
    }

    /**
     * <p>
     * Property filters for the imagery to tile.
     * </p>
     * 
     * @return Property filters for the imagery to tile.
     */

    public String getPropertyFilters() {
        return this.propertyFilters;
    }

    /**
     * <p>
     * Property filters for the imagery to tile.
     * </p>
     * 
     * @param propertyFilters
     *        Property filters for the imagery to tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withPropertyFilters(String propertyFilters) {
        setPropertyFilters(propertyFilters);
        return this;
    }

    /**
     * <p>
     * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * </p>
     * 
     * @param target
     *        Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * @see TargetOptions
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * </p>
     * 
     * @return Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * @see TargetOptions
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * </p>
     * 
     * @param target
     *        Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetOptions
     */

    public GetTileRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * </p>
     * 
     * @param target
     *        Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetOptions
     */

    public GetTileRequest withTarget(TargetOptions target) {
        this.target = target.toString();
        return this;
    }

    /**
     * <p>
     * Time range filter applied to imagery to find the images to tile.
     * </p>
     * 
     * @param timeRangeFilter
     *        Time range filter applied to imagery to find the images to tile.
     */

    public void setTimeRangeFilter(String timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    /**
     * <p>
     * Time range filter applied to imagery to find the images to tile.
     * </p>
     * 
     * @return Time range filter applied to imagery to find the images to tile.
     */

    public String getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    /**
     * <p>
     * Time range filter applied to imagery to find the images to tile.
     * </p>
     * 
     * @param timeRangeFilter
     *        Time range filter applied to imagery to find the images to tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withTimeRangeFilter(String timeRangeFilter) {
        setTimeRangeFilter(timeRangeFilter);
        return this;
    }

    /**
     * <p>
     * The x coordinate of the tile input.
     * </p>
     * 
     * @param x
     *        The x coordinate of the tile input.
     */

    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * <p>
     * The x coordinate of the tile input.
     * </p>
     * 
     * @return The x coordinate of the tile input.
     */

    public Integer getX() {
        return this.x;
    }

    /**
     * <p>
     * The x coordinate of the tile input.
     * </p>
     * 
     * @param x
     *        The x coordinate of the tile input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withX(Integer x) {
        setX(x);
        return this;
    }

    /**
     * <p>
     * The y coordinate of the tile input.
     * </p>
     * 
     * @param y
     *        The y coordinate of the tile input.
     */

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * <p>
     * The y coordinate of the tile input.
     * </p>
     * 
     * @return The y coordinate of the tile input.
     */

    public Integer getY() {
        return this.y;
    }

    /**
     * <p>
     * The y coordinate of the tile input.
     * </p>
     * 
     * @param y
     *        The y coordinate of the tile input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withY(Integer y) {
        setY(y);
        return this;
    }

    /**
     * <p>
     * The z coordinate of the tile input.
     * </p>
     * 
     * @param z
     *        The z coordinate of the tile input.
     */

    public void setZ(Integer z) {
        this.z = z;
    }

    /**
     * <p>
     * The z coordinate of the tile input.
     * </p>
     * 
     * @return The z coordinate of the tile input.
     */

    public Integer getZ() {
        return this.z;
    }

    /**
     * <p>
     * The z coordinate of the tile input.
     * </p>
     * 
     * @param z
     *        The z coordinate of the tile input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTileRequest withZ(Integer z) {
        setZ(z);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getImageAssets() != null)
            sb.append("ImageAssets: ").append(getImageAssets()).append(",");
        if (getImageMask() != null)
            sb.append("ImageMask: ").append(getImageMask()).append(",");
        if (getOutputDataType() != null)
            sb.append("OutputDataType: ").append(getOutputDataType()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getPropertyFilters() != null)
            sb.append("PropertyFilters: ").append(getPropertyFilters()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTimeRangeFilter() != null)
            sb.append("TimeRangeFilter: ").append(getTimeRangeFilter()).append(",");
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY()).append(",");
        if (getZ() != null)
            sb.append("Z: ").append(getZ());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTileRequest == false)
            return false;
        GetTileRequest other = (GetTileRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getImageAssets() == null ^ this.getImageAssets() == null)
            return false;
        if (other.getImageAssets() != null && other.getImageAssets().equals(this.getImageAssets()) == false)
            return false;
        if (other.getImageMask() == null ^ this.getImageMask() == null)
            return false;
        if (other.getImageMask() != null && other.getImageMask().equals(this.getImageMask()) == false)
            return false;
        if (other.getOutputDataType() == null ^ this.getOutputDataType() == null)
            return false;
        if (other.getOutputDataType() != null && other.getOutputDataType().equals(this.getOutputDataType()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getPropertyFilters() == null ^ this.getPropertyFilters() == null)
            return false;
        if (other.getPropertyFilters() != null && other.getPropertyFilters().equals(this.getPropertyFilters()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTimeRangeFilter() == null ^ this.getTimeRangeFilter() == null)
            return false;
        if (other.getTimeRangeFilter() != null && other.getTimeRangeFilter().equals(this.getTimeRangeFilter()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        if (other.getZ() == null ^ this.getZ() == null)
            return false;
        if (other.getZ() != null && other.getZ().equals(this.getZ()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getImageAssets() == null) ? 0 : getImageAssets().hashCode());
        hashCode = prime * hashCode + ((getImageMask() == null) ? 0 : getImageMask().hashCode());
        hashCode = prime * hashCode + ((getOutputDataType() == null) ? 0 : getOutputDataType().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getPropertyFilters() == null) ? 0 : getPropertyFilters().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        hashCode = prime * hashCode + ((getZ() == null) ? 0 : getZ().hashCode());
        return hashCode;
    }

    @Override
    public GetTileRequest clone() {
        return (GetTileRequest) super.clone();
    }

}
