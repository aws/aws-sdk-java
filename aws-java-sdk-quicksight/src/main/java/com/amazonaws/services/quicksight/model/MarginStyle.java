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
 * The display options for margins around the outside edge of sheets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MarginStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MarginStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This Boolean value controls whether to display sheet margins.
     * </p>
     */
    private Boolean show;

    /**
     * <p>
     * This Boolean value controls whether to display sheet margins.
     * </p>
     * 
     * @param show
     *        This Boolean value controls whether to display sheet margins.
     */

    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * <p>
     * This Boolean value controls whether to display sheet margins.
     * </p>
     * 
     * @return This Boolean value controls whether to display sheet margins.
     */

    public Boolean getShow() {
        return this.show;
    }

    /**
     * <p>
     * This Boolean value controls whether to display sheet margins.
     * </p>
     * 
     * @param show
     *        This Boolean value controls whether to display sheet margins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarginStyle withShow(Boolean show) {
        setShow(show);
        return this;
    }

    /**
     * <p>
     * This Boolean value controls whether to display sheet margins.
     * </p>
     * 
     * @return This Boolean value controls whether to display sheet margins.
     */

    public Boolean isShow() {
        return this.show;
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
        if (getShow() != null)
            sb.append("Show: ").append(getShow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MarginStyle == false)
            return false;
        MarginStyle other = (MarginStyle) obj;
        if (other.getShow() == null ^ this.getShow() == null)
            return false;
        if (other.getShow() != null && other.getShow().equals(this.getShow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShow() == null) ? 0 : getShow().hashCode());
        return hashCode;
    }

    @Override
    public MarginStyle clone() {
        try {
            return (MarginStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MarginStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
