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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeRouteCalculator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouteCalculatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource across
     * AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     */
    private String calculatorArn;
    /**
     * <p>
     * The name of the route calculator resource being described.
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
     * The pricing plan selected for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Tags associated with route calculator resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
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
     * The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource across
     * AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorArn
     *        The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource
     *        across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     *        </p>
     *        </li>
     */

    public void setCalculatorArn(String calculatorArn) {
        this.calculatorArn = calculatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource across
     * AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource
     *         across AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     *         </p>
     *         </li>
     */

    public String getCalculatorArn() {
        return this.calculatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource across
     * AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorArn
     *        The Amazon Resource Name (ARN) for the Route calculator resource. Use the ARN when you specify a resource
     *        across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteCalculatorResult withCalculatorArn(String calculatorArn) {
        setCalculatorArn(calculatorArn);
        return this;
    }

    /**
     * <p>
     * The name of the route calculator resource being described.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource being described.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource being described.
     * </p>
     * 
     * @return The name of the route calculator resource being described.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource being described.
     * </p>
     * 
     * @param calculatorName
     *        The name of the route calculator resource being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteCalculatorResult withCalculatorName(String calculatorName) {
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

    public DescribeRouteCalculatorResult withCreateTime(java.util.Date createTime) {
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

    public DescribeRouteCalculatorResult withDataSource(String dataSource) {
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

    public DescribeRouteCalculatorResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified route calculator resource.</p>
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
     * The pricing plan selected for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @return The pricing plan selected for the specified route calculator resource.</p>
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
     * The pricing plan selected for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified route calculator resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeRouteCalculatorResult withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified route calculator resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified route calculator resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeRouteCalculatorResult withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Tags associated with route calculator resource.
     * </p>
     * 
     * @return Tags associated with route calculator resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with route calculator resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with route calculator resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with route calculator resource.
     * </p>
     * 
     * @param tags
     *        Tags associated with route calculator resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteCalculatorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeRouteCalculatorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteCalculatorResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRouteCalculatorResult clearTagsEntries() {
        this.tags = null;
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

    public DescribeRouteCalculatorResult withUpdateTime(java.util.Date updateTime) {
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
        if (getCalculatorArn() != null)
            sb.append("CalculatorArn: ").append(getCalculatorArn()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof DescribeRouteCalculatorResult == false)
            return false;
        DescribeRouteCalculatorResult other = (DescribeRouteCalculatorResult) obj;
        if (other.getCalculatorArn() == null ^ this.getCalculatorArn() == null)
            return false;
        if (other.getCalculatorArn() != null && other.getCalculatorArn().equals(this.getCalculatorArn()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getCalculatorArn() == null) ? 0 : getCalculatorArn().hashCode());
        hashCode = prime * hashCode + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRouteCalculatorResult clone() {
        try {
            return (DescribeRouteCalculatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
