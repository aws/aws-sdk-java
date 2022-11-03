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
 * Object for the summarized details of the layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/LayoutSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayoutSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the layout.
     * </p>
     */
    private String layoutArn;
    /**
     * <p>
     * The unique identifier for of the layout.
     * </p>
     */
    private String layoutId;
    /**
     * <p>
     * The name of the layout.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the layout.
     */

    public void setLayoutArn(String layoutArn) {
        this.layoutArn = layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the layout.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the layout.
     */

    public String getLayoutArn() {
        return this.layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutSummary withLayoutArn(String layoutArn) {
        setLayoutArn(layoutArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier for of the layout.
     */

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * <p>
     * The unique identifier for of the layout.
     * </p>
     * 
     * @return The unique identifier for of the layout.
     */

    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * <p>
     * The unique identifier for of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier for of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutSummary withLayoutId(String layoutId) {
        setLayoutId(layoutId);
        return this;
    }

    /**
     * <p>
     * The name of the layout.
     * </p>
     * 
     * @param name
     *        The name of the layout.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the layout.
     * </p>
     * 
     * @return The name of the layout.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the layout.
     * </p>
     * 
     * @param name
     *        The name of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutSummary withName(String name) {
        setName(name);
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
        if (getLayoutArn() != null)
            sb.append("LayoutArn: ").append(getLayoutArn()).append(",");
        if (getLayoutId() != null)
            sb.append("LayoutId: ").append(getLayoutId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayoutSummary == false)
            return false;
        LayoutSummary other = (LayoutSummary) obj;
        if (other.getLayoutArn() == null ^ this.getLayoutArn() == null)
            return false;
        if (other.getLayoutArn() != null && other.getLayoutArn().equals(this.getLayoutArn()) == false)
            return false;
        if (other.getLayoutId() == null ^ this.getLayoutId() == null)
            return false;
        if (other.getLayoutId() != null && other.getLayoutId().equals(this.getLayoutId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayoutArn() == null) ? 0 : getLayoutArn().hashCode());
        hashCode = prime * hashCode + ((getLayoutId() == null) ? 0 : getLayoutId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public LayoutSummary clone() {
        try {
            return (LayoutSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.LayoutSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
