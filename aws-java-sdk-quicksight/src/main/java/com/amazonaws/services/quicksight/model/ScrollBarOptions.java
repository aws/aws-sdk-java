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
 * The visual display options for a data zoom scroll bar.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScrollBarOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScrollBarOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of the data zoom scroll bar.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The visibility range for the data zoom scroll bar.
     * </p>
     */
    private VisibleRangeOptions visibleRange;

    /**
     * <p>
     * The visibility of the data zoom scroll bar.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data zoom scroll bar.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the data zoom scroll bar.
     * </p>
     * 
     * @return The visibility of the data zoom scroll bar.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the data zoom scroll bar.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data zoom scroll bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ScrollBarOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the data zoom scroll bar.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data zoom scroll bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ScrollBarOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility range for the data zoom scroll bar.
     * </p>
     * 
     * @param visibleRange
     *        The visibility range for the data zoom scroll bar.
     */

    public void setVisibleRange(VisibleRangeOptions visibleRange) {
        this.visibleRange = visibleRange;
    }

    /**
     * <p>
     * The visibility range for the data zoom scroll bar.
     * </p>
     * 
     * @return The visibility range for the data zoom scroll bar.
     */

    public VisibleRangeOptions getVisibleRange() {
        return this.visibleRange;
    }

    /**
     * <p>
     * The visibility range for the data zoom scroll bar.
     * </p>
     * 
     * @param visibleRange
     *        The visibility range for the data zoom scroll bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScrollBarOptions withVisibleRange(VisibleRangeOptions visibleRange) {
        setVisibleRange(visibleRange);
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getVisibleRange() != null)
            sb.append("VisibleRange: ").append(getVisibleRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScrollBarOptions == false)
            return false;
        ScrollBarOptions other = (ScrollBarOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getVisibleRange() == null ^ this.getVisibleRange() == null)
            return false;
        if (other.getVisibleRange() != null && other.getVisibleRange().equals(this.getVisibleRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getVisibleRange() == null) ? 0 : getVisibleRange().hashCode());
        return hashCode;
    }

    @Override
    public ScrollBarOptions clone() {
        try {
            return (ScrollBarOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScrollBarOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
