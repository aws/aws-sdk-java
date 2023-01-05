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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateRouteCalculator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRouteCalculatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     */
    private String calculatorArn;
    /**
     * <p>
     * The name of the updated route calculator resource.
     * </p>
     */
    private String calculatorName;
    /**
     * <p>
     * The timestamp for when the route calculator was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorArn
     *        The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     *        </p>
     *        </li>
     */

    public void setCalculatorArn(String calculatorArn) {
        this.calculatorArn = calculatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource
     *         across AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     *         </p>
     *         </li>
     */

    public String getCalculatorArn() {
        return this.calculatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculatorArn
     *        The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:route- calculator/ExampleCalculator</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteCalculatorResult withCalculatorArn(String calculatorArn) {
        setCalculatorArn(calculatorArn);
        return this;
    }

    /**
     * <p>
     * The name of the updated route calculator resource.
     * </p>
     * 
     * @param calculatorName
     *        The name of the updated route calculator resource.
     */

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the updated route calculator resource.
     * </p>
     * 
     * @return The name of the updated route calculator resource.
     */

    public String getCalculatorName() {
        return this.calculatorName;
    }

    /**
     * <p>
     * The name of the updated route calculator resource.
     * </p>
     * 
     * @param calculatorName
     *        The name of the updated route calculator resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteCalculatorResult withCalculatorName(String calculatorName) {
        setCalculatorName(calculatorName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the route calculator was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the route calculator was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the route calculator was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the route calculator was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the route calculator was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the route calculator was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRouteCalculatorResult withUpdateTime(java.util.Date updateTime) {
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

        if (obj instanceof UpdateRouteCalculatorResult == false)
            return false;
        UpdateRouteCalculatorResult other = (UpdateRouteCalculatorResult) obj;
        if (other.getCalculatorArn() == null ^ this.getCalculatorArn() == null)
            return false;
        if (other.getCalculatorArn() != null && other.getCalculatorArn().equals(this.getCalculatorArn()) == false)
            return false;
        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null && other.getCalculatorName().equals(this.getCalculatorName()) == false)
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
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRouteCalculatorResult clone() {
        try {
            return (UpdateRouteCalculatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
