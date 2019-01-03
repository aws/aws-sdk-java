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
public class ValidateSecurityProfileBehaviorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     */
    private java.util.List<Behavior> behaviors;

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public java.util.List<Behavior> getBehaviors() {
        return behaviors;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     */

    public void setBehaviors(java.util.Collection<Behavior> behaviors) {
        if (behaviors == null) {
            this.behaviors = null;
            return;
        }

        this.behaviors = new java.util.ArrayList<Behavior>(behaviors);
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBehaviors(java.util.Collection)} or {@link #withBehaviors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSecurityProfileBehaviorsRequest withBehaviors(Behavior... behaviors) {
        if (this.behaviors == null) {
            setBehaviors(new java.util.ArrayList<Behavior>(behaviors.length));
        }
        for (Behavior ele : behaviors) {
            this.behaviors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * </p>
     * 
     * @param behaviors
     *        Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSecurityProfileBehaviorsRequest withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
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
        if (getBehaviors() != null)
            sb.append("Behaviors: ").append(getBehaviors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateSecurityProfileBehaviorsRequest == false)
            return false;
        ValidateSecurityProfileBehaviorsRequest other = (ValidateSecurityProfileBehaviorsRequest) obj;
        if (other.getBehaviors() == null ^ this.getBehaviors() == null)
            return false;
        if (other.getBehaviors() != null && other.getBehaviors().equals(this.getBehaviors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        return hashCode;
    }

    @Override
    public ValidateSecurityProfileBehaviorsRequest clone() {
        return (ValidateSecurityProfileBehaviorsRequest) super.clone();
    }

}
