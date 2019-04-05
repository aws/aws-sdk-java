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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveThingFromThingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The group name.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The group ARN.
     * </p>
     */
    private String thingGroupArn;
    /**
     * <p>
     * The name of the thing to remove from the group.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ARN of the thing to remove from the group.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param thingGroupName
     *        The group name.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @return The group name.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param thingGroupName
     *        The group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveThingFromThingGroupRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The group ARN.
     */

    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @return The group ARN.
     */

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveThingFromThingGroupRequest withThingGroupArn(String thingGroupArn) {
        setThingGroupArn(thingGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the thing to remove from the group.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to remove from the group.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to remove from the group.
     * </p>
     * 
     * @return The name of the thing to remove from the group.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing to remove from the group.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to remove from the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveThingFromThingGroupRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing to remove from the group.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to remove from the group.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to remove from the group.
     * </p>
     * 
     * @return The ARN of the thing to remove from the group.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to remove from the group.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to remove from the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveThingFromThingGroupRequest withThingArn(String thingArn) {
        setThingArn(thingArn);
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
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName()).append(",");
        if (getThingGroupArn() != null)
            sb.append("ThingGroupArn: ").append(getThingGroupArn()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveThingFromThingGroupRequest == false)
            return false;
        RemoveThingFromThingGroupRequest other = (RemoveThingFromThingGroupRequest) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public RemoveThingFromThingGroupRequest clone() {
        return (RemoveThingFromThingGroupRequest) super.clone();
    }

}
