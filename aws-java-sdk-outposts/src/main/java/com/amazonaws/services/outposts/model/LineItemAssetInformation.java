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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a line item asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/LineItemAssetInformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineItemAssetInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The MAC addresses of the asset.
     * </p>
     */
    private java.util.List<String> macAddressList;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemAssetInformation withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The MAC addresses of the asset.
     * </p>
     * 
     * @return The MAC addresses of the asset.
     */

    public java.util.List<String> getMacAddressList() {
        return macAddressList;
    }

    /**
     * <p>
     * The MAC addresses of the asset.
     * </p>
     * 
     * @param macAddressList
     *        The MAC addresses of the asset.
     */

    public void setMacAddressList(java.util.Collection<String> macAddressList) {
        if (macAddressList == null) {
            this.macAddressList = null;
            return;
        }

        this.macAddressList = new java.util.ArrayList<String>(macAddressList);
    }

    /**
     * <p>
     * The MAC addresses of the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacAddressList(java.util.Collection)} or {@link #withMacAddressList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param macAddressList
     *        The MAC addresses of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemAssetInformation withMacAddressList(String... macAddressList) {
        if (this.macAddressList == null) {
            setMacAddressList(new java.util.ArrayList<String>(macAddressList.length));
        }
        for (String ele : macAddressList) {
            this.macAddressList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MAC addresses of the asset.
     * </p>
     * 
     * @param macAddressList
     *        The MAC addresses of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemAssetInformation withMacAddressList(java.util.Collection<String> macAddressList) {
        setMacAddressList(macAddressList);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getMacAddressList() != null)
            sb.append("MacAddressList: ").append(getMacAddressList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemAssetInformation == false)
            return false;
        LineItemAssetInformation other = (LineItemAssetInformation) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getMacAddressList() == null ^ this.getMacAddressList() == null)
            return false;
        if (other.getMacAddressList() != null && other.getMacAddressList().equals(this.getMacAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getMacAddressList() == null) ? 0 : getMacAddressList().hashCode());
        return hashCode;
    }

    @Override
    public LineItemAssetInformation clone() {
        try {
            return (LineItemAssetInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.LineItemAssetInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
