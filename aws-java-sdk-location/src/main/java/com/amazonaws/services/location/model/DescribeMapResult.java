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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMapResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the map tile style selected from a partner data provider.
     * </p>
     */
    private MapConfiguration configuration;
    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Specifies the data provider for the associated map tiles.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The optional description for the map resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     */
    private String mapArn;
    /**
     * <p>
     * The map style selected from an available provider.
     * </p>
     */
    private String mapName;
    /**
     * <p>
     * The pricing plan selected for the specified map resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private String pricingPlan;
    /**
     * <p>
     * The timestamp for when the map resource was last update in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * Specifies the map tile style selected from a partner data provider.
     * </p>
     * 
     * @param configuration
     *        Specifies the map tile style selected from a partner data provider.
     */

    public void setConfiguration(MapConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies the map tile style selected from a partner data provider.
     * </p>
     * 
     * @return Specifies the map tile style selected from a partner data provider.
     */

    public MapConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Specifies the map tile style selected from a partner data provider.
     * </p>
     * 
     * @param configuration
     *        Specifies the map tile style selected from a partner data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withConfiguration(MapConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the map resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the map resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the map resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Specifies the data provider for the associated map tiles.
     * </p>
     * 
     * @param dataSource
     *        Specifies the data provider for the associated map tiles.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the associated map tiles.
     * </p>
     * 
     * @return Specifies the data provider for the associated map tiles.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the associated map tiles.
     * </p>
     * 
     * @param dataSource
     *        Specifies the data provider for the associated map tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The optional description for the map resource.
     * </p>
     * 
     * @param description
     *        The optional description for the map resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the map resource.
     * </p>
     * 
     * @return The optional description for the map resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the map resource.
     * </p>
     * 
     * @param description
     *        The optional description for the map resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *        AWS.
     */

    public void setMapArn(String mapArn) {
        this.mapArn = mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *         AWS.
     */

    public String getMapArn() {
        return this.mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) for the map resource. Used when you need to specify a resource across all
     *        AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withMapArn(String mapArn) {
        setMapArn(mapArn);
        return this;
    }

    /**
     * <p>
     * The map style selected from an available provider.
     * </p>
     * 
     * @param mapName
     *        The map style selected from an available provider.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map style selected from an available provider.
     * </p>
     * 
     * @return The map style selected from an available provider.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map style selected from an available provider.
     * </p>
     * 
     * @param mapName
     *        The map style selected from an available provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withMapName(String mapName) {
        setMapName(mapName);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified map resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified map resource.</p>
     * 
     *        <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * The pricing plan selected for the specified map resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return The pricing plan selected for the specified map resource.</p>
     * 
     *         <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * The pricing plan selected for the specified map resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified map resource.</p>
     * 
     *        <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeMapResult withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified map resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified map resource.</p>
     * 
     *        <pre>
     * <code> &lt;p&gt;For additional details and restrictions on each pricing plan option, see the &lt;a href=&quot;https://aws.amazon.com/location/pricing/&quot;&gt;Amazon Location Service pricing page&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeMapResult withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last update in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the map resource was last update in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last update in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the map resource was last update in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last update in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the map resource was last update in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMapResult withUpdateTime(java.util.Date updateTime) {
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMapArn() != null)
            sb.append("MapArn: ").append(getMapArn()).append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName()).append(",");
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

        if (obj instanceof DescribeMapResult == false)
            return false;
        DescribeMapResult other = (DescribeMapResult) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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
        if (other.getMapArn() == null ^ this.getMapArn() == null)
            return false;
        if (other.getMapArn() != null && other.getMapArn().equals(this.getMapArn()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
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

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMapArn() == null) ? 0 : getMapArn().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMapResult clone() {
        try {
            return (DescribeMapResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
