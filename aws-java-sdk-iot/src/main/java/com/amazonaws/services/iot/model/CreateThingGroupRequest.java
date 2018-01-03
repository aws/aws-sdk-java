/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The thing group name to create.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The name of the parent thing group.
     * </p>
     */
    private String parentGroupName;
    /**
     * <p>
     * The thing group properties.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;

    /**
     * <p>
     * The thing group name to create.
     * </p>
     * 
     * @param thingGroupName
     *        The thing group name to create.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The thing group name to create.
     * </p>
     * 
     * @return The thing group name to create.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The thing group name to create.
     * </p>
     * 
     * @param thingGroupName
     *        The thing group name to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingGroupRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the parent thing group.
     * </p>
     * 
     * @param parentGroupName
     *        The name of the parent thing group.
     */

    public void setParentGroupName(String parentGroupName) {
        this.parentGroupName = parentGroupName;
    }

    /**
     * <p>
     * The name of the parent thing group.
     * </p>
     * 
     * @return The name of the parent thing group.
     */

    public String getParentGroupName() {
        return this.parentGroupName;
    }

    /**
     * <p>
     * The name of the parent thing group.
     * </p>
     * 
     * @param parentGroupName
     *        The name of the parent thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingGroupRequest withParentGroupName(String parentGroupName) {
        setParentGroupName(parentGroupName);
        return this;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The thing group properties.
     */

    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @return The thing group properties.
     */

    public ThingGroupProperties getThingGroupProperties() {
        return this.thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The thing group properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingGroupRequest withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        setThingGroupProperties(thingGroupProperties);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName()).append(",");
        if (getParentGroupName() != null)
            sb.append("ParentGroupName: ").append(getParentGroupName()).append(",");
        if (getThingGroupProperties() != null)
            sb.append("ThingGroupProperties: ").append(getThingGroupProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingGroupRequest == false)
            return false;
        CreateThingGroupRequest other = (CreateThingGroupRequest) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getParentGroupName() == null ^ this.getParentGroupName() == null)
            return false;
        if (other.getParentGroupName() != null && other.getParentGroupName().equals(this.getParentGroupName()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getParentGroupName() == null) ? 0 : getParentGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateThingGroupRequest clone() {
        return (CreateThingGroupRequest) super.clone();
    }

}
