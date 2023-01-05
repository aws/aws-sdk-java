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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options that determine the sizing of the canvas used in a grid layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GridLayoutScreenCanvasSizeOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GridLayoutScreenCanvasSizeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This value determines the layout behavior when the viewport is resized.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this
     * option is called <code>Classic</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the Amazon
     * QuickSight console, this option is called <code>Tiled</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String resizeOption;
    /**
     * <p>
     * The width that the view port will be optimized for when the layout renders.
     * </p>
     */
    private String optimizedViewPortWidth;

    /**
     * <p>
     * This value determines the layout behavior when the viewport is resized.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this
     * option is called <code>Classic</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the Amazon
     * QuickSight console, this option is called <code>Tiled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeOption
     *        This value determines the layout behavior when the viewport is resized.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight
     *        console, this option is called <code>Classic</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the
     *        Amazon QuickSight console, this option is called <code>Tiled</code>.
     *        </p>
     *        </li>
     * @see ResizeOption
     */

    public void setResizeOption(String resizeOption) {
        this.resizeOption = resizeOption;
    }

    /**
     * <p>
     * This value determines the layout behavior when the viewport is resized.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this
     * option is called <code>Classic</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the Amazon
     * QuickSight console, this option is called <code>Tiled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This value determines the layout behavior when the viewport is resized.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight
     *         console, this option is called <code>Classic</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In
     *         the Amazon QuickSight console, this option is called <code>Tiled</code>.
     *         </p>
     *         </li>
     * @see ResizeOption
     */

    public String getResizeOption() {
        return this.resizeOption;
    }

    /**
     * <p>
     * This value determines the layout behavior when the viewport is resized.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this
     * option is called <code>Classic</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the Amazon
     * QuickSight console, this option is called <code>Tiled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeOption
     *        This value determines the layout behavior when the viewport is resized.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight
     *        console, this option is called <code>Classic</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the
     *        Amazon QuickSight console, this option is called <code>Tiled</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResizeOption
     */

    public GridLayoutScreenCanvasSizeOptions withResizeOption(String resizeOption) {
        setResizeOption(resizeOption);
        return this;
    }

    /**
     * <p>
     * This value determines the layout behavior when the viewport is resized.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight console, this
     * option is called <code>Classic</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the Amazon
     * QuickSight console, this option is called <code>Tiled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeOption
     *        This value determines the layout behavior when the viewport is resized.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIXED</code>: A fixed width will be used when optimizing the layout. In the Amazon QuickSight
     *        console, this option is called <code>Classic</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESPONSIVE</code>: The width of the canvas will be responsive and optimized to the view port. In the
     *        Amazon QuickSight console, this option is called <code>Tiled</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResizeOption
     */

    public GridLayoutScreenCanvasSizeOptions withResizeOption(ResizeOption resizeOption) {
        this.resizeOption = resizeOption.toString();
        return this;
    }

    /**
     * <p>
     * The width that the view port will be optimized for when the layout renders.
     * </p>
     * 
     * @param optimizedViewPortWidth
     *        The width that the view port will be optimized for when the layout renders.
     */

    public void setOptimizedViewPortWidth(String optimizedViewPortWidth) {
        this.optimizedViewPortWidth = optimizedViewPortWidth;
    }

    /**
     * <p>
     * The width that the view port will be optimized for when the layout renders.
     * </p>
     * 
     * @return The width that the view port will be optimized for when the layout renders.
     */

    public String getOptimizedViewPortWidth() {
        return this.optimizedViewPortWidth;
    }

    /**
     * <p>
     * The width that the view port will be optimized for when the layout renders.
     * </p>
     * 
     * @param optimizedViewPortWidth
     *        The width that the view port will be optimized for when the layout renders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridLayoutScreenCanvasSizeOptions withOptimizedViewPortWidth(String optimizedViewPortWidth) {
        setOptimizedViewPortWidth(optimizedViewPortWidth);
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
        if (getResizeOption() != null)
            sb.append("ResizeOption: ").append(getResizeOption()).append(",");
        if (getOptimizedViewPortWidth() != null)
            sb.append("OptimizedViewPortWidth: ").append(getOptimizedViewPortWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GridLayoutScreenCanvasSizeOptions == false)
            return false;
        GridLayoutScreenCanvasSizeOptions other = (GridLayoutScreenCanvasSizeOptions) obj;
        if (other.getResizeOption() == null ^ this.getResizeOption() == null)
            return false;
        if (other.getResizeOption() != null && other.getResizeOption().equals(this.getResizeOption()) == false)
            return false;
        if (other.getOptimizedViewPortWidth() == null ^ this.getOptimizedViewPortWidth() == null)
            return false;
        if (other.getOptimizedViewPortWidth() != null && other.getOptimizedViewPortWidth().equals(this.getOptimizedViewPortWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResizeOption() == null) ? 0 : getResizeOption().hashCode());
        hashCode = prime * hashCode + ((getOptimizedViewPortWidth() == null) ? 0 : getOptimizedViewPortWidth().hashCode());
        return hashCode;
    }

    @Override
    public GridLayoutScreenCanvasSizeOptions clone() {
        try {
            return (GridLayoutScreenCanvasSizeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GridLayoutScreenCanvasSizeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
