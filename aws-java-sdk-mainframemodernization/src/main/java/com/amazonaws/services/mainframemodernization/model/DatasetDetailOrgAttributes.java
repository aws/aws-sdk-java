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
 * Additional details about the data set. Different attributes correspond to different data set organizations. The
 * values are populated based on datasetOrg, storageType and backend (Blu Age or Micro Focus).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DatasetDetailOrgAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetDetailOrgAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The generation data group of the data set.
     * </p>
     */
    private GdgDetailAttributes gdg;
    /**
     * <p>
     * The details of a VSAM data set.
     * </p>
     */
    private VsamDetailAttributes vsam;

    /**
     * <p>
     * The generation data group of the data set.
     * </p>
     * 
     * @param gdg
     *        The generation data group of the data set.
     */

    public void setGdg(GdgDetailAttributes gdg) {
        this.gdg = gdg;
    }

    /**
     * <p>
     * The generation data group of the data set.
     * </p>
     * 
     * @return The generation data group of the data set.
     */

    public GdgDetailAttributes getGdg() {
        return this.gdg;
    }

    /**
     * <p>
     * The generation data group of the data set.
     * </p>
     * 
     * @param gdg
     *        The generation data group of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDetailOrgAttributes withGdg(GdgDetailAttributes gdg) {
        setGdg(gdg);
        return this;
    }

    /**
     * <p>
     * The details of a VSAM data set.
     * </p>
     * 
     * @param vsam
     *        The details of a VSAM data set.
     */

    public void setVsam(VsamDetailAttributes vsam) {
        this.vsam = vsam;
    }

    /**
     * <p>
     * The details of a VSAM data set.
     * </p>
     * 
     * @return The details of a VSAM data set.
     */

    public VsamDetailAttributes getVsam() {
        return this.vsam;
    }

    /**
     * <p>
     * The details of a VSAM data set.
     * </p>
     * 
     * @param vsam
     *        The details of a VSAM data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDetailOrgAttributes withVsam(VsamDetailAttributes vsam) {
        setVsam(vsam);
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
        if (getGdg() != null)
            sb.append("Gdg: ").append(getGdg()).append(",");
        if (getVsam() != null)
            sb.append("Vsam: ").append(getVsam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetDetailOrgAttributes == false)
            return false;
        DatasetDetailOrgAttributes other = (DatasetDetailOrgAttributes) obj;
        if (other.getGdg() == null ^ this.getGdg() == null)
            return false;
        if (other.getGdg() != null && other.getGdg().equals(this.getGdg()) == false)
            return false;
        if (other.getVsam() == null ^ this.getVsam() == null)
            return false;
        if (other.getVsam() != null && other.getVsam().equals(this.getVsam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGdg() == null) ? 0 : getGdg().hashCode());
        hashCode = prime * hashCode + ((getVsam() == null) ? 0 : getVsam().hashCode());
        return hashCode;
    }

    @Override
    public DatasetDetailOrgAttributes clone() {
        try {
            return (DatasetDetailOrgAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DatasetDetailOrgAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
