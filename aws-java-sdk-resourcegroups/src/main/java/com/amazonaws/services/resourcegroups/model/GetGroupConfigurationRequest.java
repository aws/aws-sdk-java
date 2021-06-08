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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the ARN of the resource group.
     * </p>
     */
    private String group;

    /**
     * <p>
     * The name or the ARN of the resource group.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group.
     * </p>
     * 
     * @return The name or the ARN of the resource group.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupConfigurationRequest withGroup(String group) {
        setGroup(group);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupConfigurationRequest == false)
            return false;
        GetGroupConfigurationRequest other = (GetGroupConfigurationRequest) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupConfigurationRequest clone() {
        return (GetGroupConfigurationRequest) super.clone();
    }

}
