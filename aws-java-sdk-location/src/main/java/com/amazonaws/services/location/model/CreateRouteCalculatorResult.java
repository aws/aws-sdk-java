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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateRouteCalculator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteCalculatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource across
     * all AWS.
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
     * The name of the route calculator resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
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
     * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource across
     * all AWS.
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
     *        The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource
     *        across all AWS.</p>
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
     * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource across
     * all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource
     *         across all AWS.</p>
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
     * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource across
     * all AWS.
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
     *        The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource
     *        across all AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:route-calculator/ExampleCalculator</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteCalculatorResult withCalculatorArn(String calculatorArn) {
        setCalculatorArn(calculatorArn);
        return this;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorName
     *        The name of the route calculator resource. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>ExampleRouteCalculator</code>.
     *        </p>
     *        </li>
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the route calculator resource. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>ExampleRouteCalculator</code>.
     *         </p>
     *         </li>
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>ExampleRouteCalculator</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorName
     *        The name of the route calculator resource. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>ExampleRouteCalculator</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteCalculatorResult withCalculatorName(String calculatorName) {
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

    public CreateRouteCalculatorResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteCalculatorResult == false)
            return false;
        CreateRouteCalculatorResult other = (CreateRouteCalculatorResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculatorArn() == null) ? 0 : getCalculatorArn().hashCode());
        hashCode = prime * hashCode + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteCalculatorResult clone() {
        try {
            return (CreateRouteCalculatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
