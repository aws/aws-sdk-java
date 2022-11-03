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
 * Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of agent
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BasicLayout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BasicLayout implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This represents sections in a tab of the page layout.
     * </p>
     */
    private LayoutSections moreInfo;
    /**
     * <p>
     * This represents sections in a panel of the page layout.
     * </p>
     */
    private LayoutSections topPanel;

    /**
     * <p>
     * This represents sections in a tab of the page layout.
     * </p>
     * 
     * @param moreInfo
     *        This represents sections in a tab of the page layout.
     */

    public void setMoreInfo(LayoutSections moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * <p>
     * This represents sections in a tab of the page layout.
     * </p>
     * 
     * @return This represents sections in a tab of the page layout.
     */

    public LayoutSections getMoreInfo() {
        return this.moreInfo;
    }

    /**
     * <p>
     * This represents sections in a tab of the page layout.
     * </p>
     * 
     * @param moreInfo
     *        This represents sections in a tab of the page layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicLayout withMoreInfo(LayoutSections moreInfo) {
        setMoreInfo(moreInfo);
        return this;
    }

    /**
     * <p>
     * This represents sections in a panel of the page layout.
     * </p>
     * 
     * @param topPanel
     *        This represents sections in a panel of the page layout.
     */

    public void setTopPanel(LayoutSections topPanel) {
        this.topPanel = topPanel;
    }

    /**
     * <p>
     * This represents sections in a panel of the page layout.
     * </p>
     * 
     * @return This represents sections in a panel of the page layout.
     */

    public LayoutSections getTopPanel() {
        return this.topPanel;
    }

    /**
     * <p>
     * This represents sections in a panel of the page layout.
     * </p>
     * 
     * @param topPanel
     *        This represents sections in a panel of the page layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicLayout withTopPanel(LayoutSections topPanel) {
        setTopPanel(topPanel);
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
        if (getMoreInfo() != null)
            sb.append("MoreInfo: ").append(getMoreInfo()).append(",");
        if (getTopPanel() != null)
            sb.append("TopPanel: ").append(getTopPanel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BasicLayout == false)
            return false;
        BasicLayout other = (BasicLayout) obj;
        if (other.getMoreInfo() == null ^ this.getMoreInfo() == null)
            return false;
        if (other.getMoreInfo() != null && other.getMoreInfo().equals(this.getMoreInfo()) == false)
            return false;
        if (other.getTopPanel() == null ^ this.getTopPanel() == null)
            return false;
        if (other.getTopPanel() != null && other.getTopPanel().equals(this.getTopPanel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMoreInfo() == null) ? 0 : getMoreInfo().hashCode());
        hashCode = prime * hashCode + ((getTopPanel() == null) ? 0 : getTopPanel().hashCode());
        return hashCode;
    }

    @Override
    public BasicLayout clone() {
        try {
            return (BasicLayout) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.BasicLayoutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
