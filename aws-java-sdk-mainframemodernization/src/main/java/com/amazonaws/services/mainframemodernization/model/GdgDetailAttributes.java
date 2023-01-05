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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The required attributes for a generation data group data set. A generation data set is one of a collection of
 * successive, historically related, catalogued data sets that together are known as a generation data group (GDG). Use
 * this structure when you want to import a GDG. For more information on GDG, see <a
 * href="https://www.ibm.com/docs/en/zos/2.3.0?topic=guide-generation-data-sets">Generation data sets</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GdgDetailAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GdgDetailAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of generation data sets, up to 255, in a GDG.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The disposition of the data set in the catalog.
     * </p>
     */
    private String rollDisposition;

    /**
     * <p>
     * The maximum number of generation data sets, up to 255, in a GDG.
     * </p>
     * 
     * @param limit
     *        The maximum number of generation data sets, up to 255, in a GDG.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of generation data sets, up to 255, in a GDG.
     * </p>
     * 
     * @return The maximum number of generation data sets, up to 255, in a GDG.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of generation data sets, up to 255, in a GDG.
     * </p>
     * 
     * @param limit
     *        The maximum number of generation data sets, up to 255, in a GDG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GdgDetailAttributes withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The disposition of the data set in the catalog.
     * </p>
     * 
     * @param rollDisposition
     *        The disposition of the data set in the catalog.
     */

    public void setRollDisposition(String rollDisposition) {
        this.rollDisposition = rollDisposition;
    }

    /**
     * <p>
     * The disposition of the data set in the catalog.
     * </p>
     * 
     * @return The disposition of the data set in the catalog.
     */

    public String getRollDisposition() {
        return this.rollDisposition;
    }

    /**
     * <p>
     * The disposition of the data set in the catalog.
     * </p>
     * 
     * @param rollDisposition
     *        The disposition of the data set in the catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GdgDetailAttributes withRollDisposition(String rollDisposition) {
        setRollDisposition(rollDisposition);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getRollDisposition() != null)
            sb.append("RollDisposition: ").append(getRollDisposition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GdgDetailAttributes == false)
            return false;
        GdgDetailAttributes other = (GdgDetailAttributes) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getRollDisposition() == null ^ this.getRollDisposition() == null)
            return false;
        if (other.getRollDisposition() != null && other.getRollDisposition().equals(this.getRollDisposition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getRollDisposition() == null) ? 0 : getRollDisposition().hashCode());
        return hashCode;
    }

    @Override
    public GdgDetailAttributes clone() {
        try {
            return (GdgDetailAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.GdgDetailAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
