/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of filters by which to return Source Networks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceNetworksRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSourceNetworksRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter Source Networks by account ID containing the protected VPCs.
     * </p>
     */
    private String originAccountID;
    /**
     * <p>
     * Filter Source Networks by the region containing the protected VPCs.
     * </p>
     */
    private String originRegion;
    /**
     * <p>
     * An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * </p>
     */
    private java.util.List<String> sourceNetworkIDs;

    /**
     * <p>
     * Filter Source Networks by account ID containing the protected VPCs.
     * </p>
     * 
     * @param originAccountID
     *        Filter Source Networks by account ID containing the protected VPCs.
     */

    public void setOriginAccountID(String originAccountID) {
        this.originAccountID = originAccountID;
    }

    /**
     * <p>
     * Filter Source Networks by account ID containing the protected VPCs.
     * </p>
     * 
     * @return Filter Source Networks by account ID containing the protected VPCs.
     */

    public String getOriginAccountID() {
        return this.originAccountID;
    }

    /**
     * <p>
     * Filter Source Networks by account ID containing the protected VPCs.
     * </p>
     * 
     * @param originAccountID
     *        Filter Source Networks by account ID containing the protected VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceNetworksRequestFilters withOriginAccountID(String originAccountID) {
        setOriginAccountID(originAccountID);
        return this;
    }

    /**
     * <p>
     * Filter Source Networks by the region containing the protected VPCs.
     * </p>
     * 
     * @param originRegion
     *        Filter Source Networks by the region containing the protected VPCs.
     */

    public void setOriginRegion(String originRegion) {
        this.originRegion = originRegion;
    }

    /**
     * <p>
     * Filter Source Networks by the region containing the protected VPCs.
     * </p>
     * 
     * @return Filter Source Networks by the region containing the protected VPCs.
     */

    public String getOriginRegion() {
        return this.originRegion;
    }

    /**
     * <p>
     * Filter Source Networks by the region containing the protected VPCs.
     * </p>
     * 
     * @param originRegion
     *        Filter Source Networks by the region containing the protected VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceNetworksRequestFilters withOriginRegion(String originRegion) {
        setOriginRegion(originRegion);
        return this;
    }

    /**
     * <p>
     * An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * </p>
     * 
     * @return An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     */

    public java.util.List<String> getSourceNetworkIDs() {
        return sourceNetworkIDs;
    }

    /**
     * <p>
     * An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * </p>
     * 
     * @param sourceNetworkIDs
     *        An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     */

    public void setSourceNetworkIDs(java.util.Collection<String> sourceNetworkIDs) {
        if (sourceNetworkIDs == null) {
            this.sourceNetworkIDs = null;
            return;
        }

        this.sourceNetworkIDs = new java.util.ArrayList<String>(sourceNetworkIDs);
    }

    /**
     * <p>
     * An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceNetworkIDs(java.util.Collection)} or {@link #withSourceNetworkIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceNetworkIDs
     *        An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceNetworksRequestFilters withSourceNetworkIDs(String... sourceNetworkIDs) {
        if (this.sourceNetworkIDs == null) {
            setSourceNetworkIDs(new java.util.ArrayList<String>(sourceNetworkIDs.length));
        }
        for (String ele : sourceNetworkIDs) {
            this.sourceNetworkIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * </p>
     * 
     * @param sourceNetworkIDs
     *        An array of Source Network IDs that should be returned. An empty array means all Source Networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceNetworksRequestFilters withSourceNetworkIDs(java.util.Collection<String> sourceNetworkIDs) {
        setSourceNetworkIDs(sourceNetworkIDs);
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
        if (getOriginAccountID() != null)
            sb.append("OriginAccountID: ").append(getOriginAccountID()).append(",");
        if (getOriginRegion() != null)
            sb.append("OriginRegion: ").append(getOriginRegion()).append(",");
        if (getSourceNetworkIDs() != null)
            sb.append("SourceNetworkIDs: ").append(getSourceNetworkIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceNetworksRequestFilters == false)
            return false;
        DescribeSourceNetworksRequestFilters other = (DescribeSourceNetworksRequestFilters) obj;
        if (other.getOriginAccountID() == null ^ this.getOriginAccountID() == null)
            return false;
        if (other.getOriginAccountID() != null && other.getOriginAccountID().equals(this.getOriginAccountID()) == false)
            return false;
        if (other.getOriginRegion() == null ^ this.getOriginRegion() == null)
            return false;
        if (other.getOriginRegion() != null && other.getOriginRegion().equals(this.getOriginRegion()) == false)
            return false;
        if (other.getSourceNetworkIDs() == null ^ this.getSourceNetworkIDs() == null)
            return false;
        if (other.getSourceNetworkIDs() != null && other.getSourceNetworkIDs().equals(this.getSourceNetworkIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginAccountID() == null) ? 0 : getOriginAccountID().hashCode());
        hashCode = prime * hashCode + ((getOriginRegion() == null) ? 0 : getOriginRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceNetworkIDs() == null) ? 0 : getSourceNetworkIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSourceNetworksRequestFilters clone() {
        try {
            return (DescribeSourceNetworksRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.DescribeSourceNetworksRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
