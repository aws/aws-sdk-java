/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAccountSettingDefault" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountSettingDefaultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN for
     * your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID for
     * your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances are affected.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     * <code>disabled</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN for
     * your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID for
     * your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances are affected.
     * </p>
     * 
     * @param name
     *        The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN
     *        for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and
     *        resource ID for your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances are affected.
     * @see SettingName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN for
     * your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID for
     * your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances are affected.
     * </p>
     * 
     * @return The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the
     *         ARN for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and
     *         resource ID for your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is
     *         specified, the ARN and resource ID for your Amazon ECS container instances are affected.
     * @see SettingName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN for
     * your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID for
     * your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances are affected.
     * </p>
     * 
     * @param name
     *        The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN
     *        for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and
     *        resource ID for your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances are affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public PutAccountSettingDefaultRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN for
     * your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and resource ID for
     * your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is specified, the ARN and
     * resource ID for your Amazon ECS container instances are affected.
     * </p>
     * 
     * @param name
     *        The resource type to enable the new format for. If <code>serviceLongArnFormat</code> is specified, the ARN
     *        for your Amazon ECS services is affected. If <code>taskLongArnFormat</code> is specified, the ARN and
     *        resource ID for your Amazon ECS tasks are affected. If <code>containerInstanceLongArnFormat</code> is
     *        specified, the ARN and resource ID for your Amazon ECS container instances are affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public PutAccountSettingDefaultRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     * <code>disabled</code>.
     * </p>
     * 
     * @param value
     *        The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     *        <code>disabled</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     * <code>disabled</code>.
     * </p>
     * 
     * @return The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     *         <code>disabled</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     * <code>disabled</code>.
     * </p>
     * 
     * @param value
     *        The account setting value for the specified principal ARN. Accepted values are <code>enabled</code> and
     *        <code>disabled</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountSettingDefaultRequest withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountSettingDefaultRequest == false)
            return false;
        PutAccountSettingDefaultRequest other = (PutAccountSettingDefaultRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountSettingDefaultRequest clone() {
        return (PutAccountSettingDefaultRequest) super.clone();
    }

}
