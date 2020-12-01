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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the Regions that are configured for multi-Region replication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegionsInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionsInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where the AWS Managed Microsoft AD directory was originally created.
     * </p>
     */
    private String primaryRegion;
    /**
     * <p>
     * Lists the Regions where the directory has been replicated, excluding the primary Region.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalRegions;

    /**
     * <p>
     * The Region where the AWS Managed Microsoft AD directory was originally created.
     * </p>
     * 
     * @param primaryRegion
     *        The Region where the AWS Managed Microsoft AD directory was originally created.
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The Region where the AWS Managed Microsoft AD directory was originally created.
     * </p>
     * 
     * @return The Region where the AWS Managed Microsoft AD directory was originally created.
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The Region where the AWS Managed Microsoft AD directory was originally created.
     * </p>
     * 
     * @param primaryRegion
     *        The Region where the AWS Managed Microsoft AD directory was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionsInfo withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
        return this;
    }

    /**
     * <p>
     * Lists the Regions where the directory has been replicated, excluding the primary Region.
     * </p>
     * 
     * @return Lists the Regions where the directory has been replicated, excluding the primary Region.
     */

    public java.util.List<String> getAdditionalRegions() {
        if (additionalRegions == null) {
            additionalRegions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalRegions;
    }

    /**
     * <p>
     * Lists the Regions where the directory has been replicated, excluding the primary Region.
     * </p>
     * 
     * @param additionalRegions
     *        Lists the Regions where the directory has been replicated, excluding the primary Region.
     */

    public void setAdditionalRegions(java.util.Collection<String> additionalRegions) {
        if (additionalRegions == null) {
            this.additionalRegions = null;
            return;
        }

        this.additionalRegions = new com.amazonaws.internal.SdkInternalList<String>(additionalRegions);
    }

    /**
     * <p>
     * Lists the Regions where the directory has been replicated, excluding the primary Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalRegions(java.util.Collection)} or {@link #withAdditionalRegions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param additionalRegions
     *        Lists the Regions where the directory has been replicated, excluding the primary Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionsInfo withAdditionalRegions(String... additionalRegions) {
        if (this.additionalRegions == null) {
            setAdditionalRegions(new com.amazonaws.internal.SdkInternalList<String>(additionalRegions.length));
        }
        for (String ele : additionalRegions) {
            this.additionalRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the Regions where the directory has been replicated, excluding the primary Region.
     * </p>
     * 
     * @param additionalRegions
     *        Lists the Regions where the directory has been replicated, excluding the primary Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionsInfo withAdditionalRegions(java.util.Collection<String> additionalRegions) {
        setAdditionalRegions(additionalRegions);
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
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion()).append(",");
        if (getAdditionalRegions() != null)
            sb.append("AdditionalRegions: ").append(getAdditionalRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionsInfo == false)
            return false;
        RegionsInfo other = (RegionsInfo) obj;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        if (other.getAdditionalRegions() == null ^ this.getAdditionalRegions() == null)
            return false;
        if (other.getAdditionalRegions() != null && other.getAdditionalRegions().equals(this.getAdditionalRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        hashCode = prime * hashCode + ((getAdditionalRegions() == null) ? 0 : getAdditionalRegions().hashCode());
        return hashCode;
    }

    @Override
    public RegionsInfo clone() {
        try {
            return (RegionsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.RegionsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
