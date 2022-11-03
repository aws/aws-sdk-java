/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object to store union of different versions of layout content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/LayoutContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayoutContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of
     * Cases user interface.
     * </p>
     */
    private BasicLayout basic;

    /**
     * <p>
     * Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of
     * Cases user interface.
     * </p>
     * 
     * @param basic
     *        Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab
     *        of Cases user interface.
     */

    public void setBasic(BasicLayout basic) {
        this.basic = basic;
    }

    /**
     * <p>
     * Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of
     * Cases user interface.
     * </p>
     * 
     * @return Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info
     *         tab of Cases user interface.
     */

    public BasicLayout getBasic() {
        return this.basic;
    }

    /**
     * <p>
     * Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of
     * Cases user interface.
     * </p>
     * 
     * @param basic
     *        Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab
     *        of Cases user interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutContent withBasic(BasicLayout basic) {
        setBasic(basic);
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
        if (getBasic() != null)
            sb.append("Basic: ").append(getBasic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayoutContent == false)
            return false;
        LayoutContent other = (LayoutContent) obj;
        if (other.getBasic() == null ^ this.getBasic() == null)
            return false;
        if (other.getBasic() != null && other.getBasic().equals(this.getBasic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasic() == null) ? 0 : getBasic().hashCode());
        return hashCode;
    }

    @Override
    public LayoutContent clone() {
        try {
            return (LayoutContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.LayoutContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
