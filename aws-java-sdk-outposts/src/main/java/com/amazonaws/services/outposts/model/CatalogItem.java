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
 * Information about a catalog item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CatalogItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     */
    private String catalogItemId;
    /**
     * <p>
     * The status of a catalog item.
     * </p>
     */
    private String itemStatus;
    /**
     * <p>
     * Information about the EC2 capacity of an item.
     * </p>
     */
    private java.util.List<EC2Capacity> eC2Capacities;
    /**
     * <p>
     * Information about the power draw of an item.
     * </p>
     */
    private Float powerKva;
    /**
     * <p>
     * The weight of the item in pounds.
     * </p>
     */
    private Integer weightLbs;
    /**
     * <p>
     * The uplink speed this catalog item requires for the connection to the Region.
     * </p>
     */
    private java.util.List<Integer> supportedUplinkGbps;
    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     */
    private java.util.List<String> supportedStorage;

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     */

    public void setCatalogItemId(String catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @return The ID of the catalog item.
     */

    public String getCatalogItemId() {
        return this.catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withCatalogItemId(String catalogItemId) {
        setCatalogItemId(catalogItemId);
        return this;
    }

    /**
     * <p>
     * The status of a catalog item.
     * </p>
     * 
     * @param itemStatus
     *        The status of a catalog item.
     * @see CatalogItemStatus
     */

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * <p>
     * The status of a catalog item.
     * </p>
     * 
     * @return The status of a catalog item.
     * @see CatalogItemStatus
     */

    public String getItemStatus() {
        return this.itemStatus;
    }

    /**
     * <p>
     * The status of a catalog item.
     * </p>
     * 
     * @param itemStatus
     *        The status of a catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogItemStatus
     */

    public CatalogItem withItemStatus(String itemStatus) {
        setItemStatus(itemStatus);
        return this;
    }

    /**
     * <p>
     * The status of a catalog item.
     * </p>
     * 
     * @param itemStatus
     *        The status of a catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogItemStatus
     */

    public CatalogItem withItemStatus(CatalogItemStatus itemStatus) {
        this.itemStatus = itemStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the EC2 capacity of an item.
     * </p>
     * 
     * @return Information about the EC2 capacity of an item.
     */

    public java.util.List<EC2Capacity> getEC2Capacities() {
        return eC2Capacities;
    }

    /**
     * <p>
     * Information about the EC2 capacity of an item.
     * </p>
     * 
     * @param eC2Capacities
     *        Information about the EC2 capacity of an item.
     */

    public void setEC2Capacities(java.util.Collection<EC2Capacity> eC2Capacities) {
        if (eC2Capacities == null) {
            this.eC2Capacities = null;
            return;
        }

        this.eC2Capacities = new java.util.ArrayList<EC2Capacity>(eC2Capacities);
    }

    /**
     * <p>
     * Information about the EC2 capacity of an item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2Capacities(java.util.Collection)} or {@link #withEC2Capacities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eC2Capacities
     *        Information about the EC2 capacity of an item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withEC2Capacities(EC2Capacity... eC2Capacities) {
        if (this.eC2Capacities == null) {
            setEC2Capacities(new java.util.ArrayList<EC2Capacity>(eC2Capacities.length));
        }
        for (EC2Capacity ele : eC2Capacities) {
            this.eC2Capacities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 capacity of an item.
     * </p>
     * 
     * @param eC2Capacities
     *        Information about the EC2 capacity of an item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withEC2Capacities(java.util.Collection<EC2Capacity> eC2Capacities) {
        setEC2Capacities(eC2Capacities);
        return this;
    }

    /**
     * <p>
     * Information about the power draw of an item.
     * </p>
     * 
     * @param powerKva
     *        Information about the power draw of an item.
     */

    public void setPowerKva(Float powerKva) {
        this.powerKva = powerKva;
    }

    /**
     * <p>
     * Information about the power draw of an item.
     * </p>
     * 
     * @return Information about the power draw of an item.
     */

    public Float getPowerKva() {
        return this.powerKva;
    }

    /**
     * <p>
     * Information about the power draw of an item.
     * </p>
     * 
     * @param powerKva
     *        Information about the power draw of an item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withPowerKva(Float powerKva) {
        setPowerKva(powerKva);
        return this;
    }

    /**
     * <p>
     * The weight of the item in pounds.
     * </p>
     * 
     * @param weightLbs
     *        The weight of the item in pounds.
     */

    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    /**
     * <p>
     * The weight of the item in pounds.
     * </p>
     * 
     * @return The weight of the item in pounds.
     */

    public Integer getWeightLbs() {
        return this.weightLbs;
    }

    /**
     * <p>
     * The weight of the item in pounds.
     * </p>
     * 
     * @param weightLbs
     *        The weight of the item in pounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withWeightLbs(Integer weightLbs) {
        setWeightLbs(weightLbs);
        return this;
    }

    /**
     * <p>
     * The uplink speed this catalog item requires for the connection to the Region.
     * </p>
     * 
     * @return The uplink speed this catalog item requires for the connection to the Region.
     */

    public java.util.List<Integer> getSupportedUplinkGbps() {
        return supportedUplinkGbps;
    }

    /**
     * <p>
     * The uplink speed this catalog item requires for the connection to the Region.
     * </p>
     * 
     * @param supportedUplinkGbps
     *        The uplink speed this catalog item requires for the connection to the Region.
     */

    public void setSupportedUplinkGbps(java.util.Collection<Integer> supportedUplinkGbps) {
        if (supportedUplinkGbps == null) {
            this.supportedUplinkGbps = null;
            return;
        }

        this.supportedUplinkGbps = new java.util.ArrayList<Integer>(supportedUplinkGbps);
    }

    /**
     * <p>
     * The uplink speed this catalog item requires for the connection to the Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedUplinkGbps(java.util.Collection)} or {@link #withSupportedUplinkGbps(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedUplinkGbps
     *        The uplink speed this catalog item requires for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withSupportedUplinkGbps(Integer... supportedUplinkGbps) {
        if (this.supportedUplinkGbps == null) {
            setSupportedUplinkGbps(new java.util.ArrayList<Integer>(supportedUplinkGbps.length));
        }
        for (Integer ele : supportedUplinkGbps) {
            this.supportedUplinkGbps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The uplink speed this catalog item requires for the connection to the Region.
     * </p>
     * 
     * @param supportedUplinkGbps
     *        The uplink speed this catalog item requires for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogItem withSupportedUplinkGbps(java.util.Collection<Integer> supportedUplinkGbps) {
        setSupportedUplinkGbps(supportedUplinkGbps);
        return this;
    }

    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     * 
     * @return The supported storage options for the catalog item.
     * @see SupportedStorageEnum
     */

    public java.util.List<String> getSupportedStorage() {
        return supportedStorage;
    }

    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     * 
     * @param supportedStorage
     *        The supported storage options for the catalog item.
     * @see SupportedStorageEnum
     */

    public void setSupportedStorage(java.util.Collection<String> supportedStorage) {
        if (supportedStorage == null) {
            this.supportedStorage = null;
            return;
        }

        this.supportedStorage = new java.util.ArrayList<String>(supportedStorage);
    }

    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedStorage(java.util.Collection)} or {@link #withSupportedStorage(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedStorage
     *        The supported storage options for the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public CatalogItem withSupportedStorage(String... supportedStorage) {
        if (this.supportedStorage == null) {
            setSupportedStorage(new java.util.ArrayList<String>(supportedStorage.length));
        }
        for (String ele : supportedStorage) {
            this.supportedStorage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     * 
     * @param supportedStorage
     *        The supported storage options for the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public CatalogItem withSupportedStorage(java.util.Collection<String> supportedStorage) {
        setSupportedStorage(supportedStorage);
        return this;
    }

    /**
     * <p>
     * The supported storage options for the catalog item.
     * </p>
     * 
     * @param supportedStorage
     *        The supported storage options for the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public CatalogItem withSupportedStorage(SupportedStorageEnum... supportedStorage) {
        java.util.ArrayList<String> supportedStorageCopy = new java.util.ArrayList<String>(supportedStorage.length);
        for (SupportedStorageEnum value : supportedStorage) {
            supportedStorageCopy.add(value.toString());
        }
        if (getSupportedStorage() == null) {
            setSupportedStorage(supportedStorageCopy);
        } else {
            getSupportedStorage().addAll(supportedStorageCopy);
        }
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
        if (getCatalogItemId() != null)
            sb.append("CatalogItemId: ").append(getCatalogItemId()).append(",");
        if (getItemStatus() != null)
            sb.append("ItemStatus: ").append(getItemStatus()).append(",");
        if (getEC2Capacities() != null)
            sb.append("EC2Capacities: ").append(getEC2Capacities()).append(",");
        if (getPowerKva() != null)
            sb.append("PowerKva: ").append(getPowerKva()).append(",");
        if (getWeightLbs() != null)
            sb.append("WeightLbs: ").append(getWeightLbs()).append(",");
        if (getSupportedUplinkGbps() != null)
            sb.append("SupportedUplinkGbps: ").append(getSupportedUplinkGbps()).append(",");
        if (getSupportedStorage() != null)
            sb.append("SupportedStorage: ").append(getSupportedStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogItem == false)
            return false;
        CatalogItem other = (CatalogItem) obj;
        if (other.getCatalogItemId() == null ^ this.getCatalogItemId() == null)
            return false;
        if (other.getCatalogItemId() != null && other.getCatalogItemId().equals(this.getCatalogItemId()) == false)
            return false;
        if (other.getItemStatus() == null ^ this.getItemStatus() == null)
            return false;
        if (other.getItemStatus() != null && other.getItemStatus().equals(this.getItemStatus()) == false)
            return false;
        if (other.getEC2Capacities() == null ^ this.getEC2Capacities() == null)
            return false;
        if (other.getEC2Capacities() != null && other.getEC2Capacities().equals(this.getEC2Capacities()) == false)
            return false;
        if (other.getPowerKva() == null ^ this.getPowerKva() == null)
            return false;
        if (other.getPowerKva() != null && other.getPowerKva().equals(this.getPowerKva()) == false)
            return false;
        if (other.getWeightLbs() == null ^ this.getWeightLbs() == null)
            return false;
        if (other.getWeightLbs() != null && other.getWeightLbs().equals(this.getWeightLbs()) == false)
            return false;
        if (other.getSupportedUplinkGbps() == null ^ this.getSupportedUplinkGbps() == null)
            return false;
        if (other.getSupportedUplinkGbps() != null && other.getSupportedUplinkGbps().equals(this.getSupportedUplinkGbps()) == false)
            return false;
        if (other.getSupportedStorage() == null ^ this.getSupportedStorage() == null)
            return false;
        if (other.getSupportedStorage() != null && other.getSupportedStorage().equals(this.getSupportedStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogItemId() == null) ? 0 : getCatalogItemId().hashCode());
        hashCode = prime * hashCode + ((getItemStatus() == null) ? 0 : getItemStatus().hashCode());
        hashCode = prime * hashCode + ((getEC2Capacities() == null) ? 0 : getEC2Capacities().hashCode());
        hashCode = prime * hashCode + ((getPowerKva() == null) ? 0 : getPowerKva().hashCode());
        hashCode = prime * hashCode + ((getWeightLbs() == null) ? 0 : getWeightLbs().hashCode());
        hashCode = prime * hashCode + ((getSupportedUplinkGbps() == null) ? 0 : getSupportedUplinkGbps().hashCode());
        hashCode = prime * hashCode + ((getSupportedStorage() == null) ? 0 : getSupportedStorage().hashCode());
        return hashCode;
    }

    @Override
    public CatalogItem clone() {
        try {
            return (CatalogItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.CatalogItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
