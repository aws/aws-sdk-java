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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resources produced by this image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/OutputResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     */
    private java.util.List<Ami> amis;

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * 
     * @return The EC2 AMIs created by this image.
     */

    public java.util.List<Ami> getAmis() {
        return amis;
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * 
     * @param amis
     *        The EC2 AMIs created by this image.
     */

    public void setAmis(java.util.Collection<Ami> amis) {
        if (amis == null) {
            this.amis = null;
            return;
        }

        this.amis = new java.util.ArrayList<Ami>(amis);
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAmis(java.util.Collection)} or {@link #withAmis(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param amis
     *        The EC2 AMIs created by this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputResources withAmis(Ami... amis) {
        if (this.amis == null) {
            setAmis(new java.util.ArrayList<Ami>(amis.length));
        }
        for (Ami ele : amis) {
            this.amis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * 
     * @param amis
     *        The EC2 AMIs created by this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputResources withAmis(java.util.Collection<Ami> amis) {
        setAmis(amis);
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
        if (getAmis() != null)
            sb.append("Amis: ").append(getAmis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputResources == false)
            return false;
        OutputResources other = (OutputResources) obj;
        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        return hashCode;
    }

    @Override
    public OutputResources clone() {
        try {
            return (OutputResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.OutputResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
