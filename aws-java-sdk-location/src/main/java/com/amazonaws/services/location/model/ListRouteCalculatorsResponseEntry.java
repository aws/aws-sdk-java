/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A route calculator resource listed in your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListRouteCalculatorsResponseEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRouteCalculatorsResponseEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     */
    private String calculatorName;
    /**
     * <p>
     * The timestamp when the route calculator resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The data provider of traffic and road network data. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The optional description of the route calculator resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The pricing plan for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * The timestamp when the route calculator resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * 
     * @return The name of the route calculator resource.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRouteCalculatorsResponseEntry withCalculatorName(String calculatorName) {
        setCalculatorName(calculatorName);
        return this;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createTime
     *        The timestamp when the route calculator resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The timestamp when the route calculator resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *         </p>
     *         </li>
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createTime
     *        The timestamp when the route calculator resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRouteCalculatorsResponseEntry withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The data provider of traffic and road network data. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The data provider of traffic and road network data. Indicates one of the available providers:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @return The data provider of traffic and road network data. Indicates one of the available providers:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about data providers, see <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *         Location Service data providers</a>.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon Location
     * Service data providers</a>.
     * </p>
     * 
     * @param dataSource
     *        The data provider of traffic and road network data. Indicates one of the available providers:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about data providers, see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Amazon
     *        Location Service data providers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRouteCalculatorsResponseEntry withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The optional description of the route calculator resource.
     * </p>
     * 
     * @param description
     *        The optional description of the route calculator resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of the route calculator resource.
     * </p>
     * 
     * @return The optional description of the route calculator resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description of the route calculator resource.
     * </p>
     * 
     * @param description
     *        The optional description of the route calculator resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRouteCalculatorsResponseEntry withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The pricing plan for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan for the specified route calculator resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * The pricing plan for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @return The pricing plan for the specified route calculator resource.</p>
     *         <p>
     *         For additional details and restrictions on each pricing plan option, see <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * The pricing plan for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan for the specified route calculator resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public ListRouteCalculatorsResponseEntry withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * The pricing plan for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan for the specified route calculator resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public ListRouteCalculatorsResponseEntry withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateTime
     *        The timestamp when the route calculator resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The timestamp when the route calculator resource was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *         </p>
     *         </li>
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp when the route calculator resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateTime
     *        The timestamp when the route calculator resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRouteCalculatorsResponseEntry withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCalculatorName() != null)
            sb.append("CalculatorName: ").append(getCalculatorName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRouteCalculatorsResponseEntry == false)
            return false;
        ListRouteCalculatorsResponseEntry other = (ListRouteCalculatorsResponseEntry) obj;
        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null && other.getCalculatorName().equals(this.getCalculatorName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ListRouteCalculatorsResponseEntry clone() {
        try {
            return (ListRouteCalculatorsResponseEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.ListRouteCalculatorsResponseEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
