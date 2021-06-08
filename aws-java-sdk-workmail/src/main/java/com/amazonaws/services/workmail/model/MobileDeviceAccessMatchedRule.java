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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rule that a simulated user matches.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/MobileDeviceAccessMatchedRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MobileDeviceAccessMatchedRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the rule that a simulated user matches.
     * </p>
     */
    private String mobileDeviceAccessRuleId;
    /**
     * <p>
     * Name of a rule that a simulated user matches.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Identifier of the rule that a simulated user matches.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        Identifier of the rule that a simulated user matches.
     */

    public void setMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        this.mobileDeviceAccessRuleId = mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * Identifier of the rule that a simulated user matches.
     * </p>
     * 
     * @return Identifier of the rule that a simulated user matches.
     */

    public String getMobileDeviceAccessRuleId() {
        return this.mobileDeviceAccessRuleId;
    }

    /**
     * <p>
     * Identifier of the rule that a simulated user matches.
     * </p>
     * 
     * @param mobileDeviceAccessRuleId
     *        Identifier of the rule that a simulated user matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessMatchedRule withMobileDeviceAccessRuleId(String mobileDeviceAccessRuleId) {
        setMobileDeviceAccessRuleId(mobileDeviceAccessRuleId);
        return this;
    }

    /**
     * <p>
     * Name of a rule that a simulated user matches.
     * </p>
     * 
     * @param name
     *        Name of a rule that a simulated user matches.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a rule that a simulated user matches.
     * </p>
     * 
     * @return Name of a rule that a simulated user matches.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a rule that a simulated user matches.
     * </p>
     * 
     * @param name
     *        Name of a rule that a simulated user matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileDeviceAccessMatchedRule withName(String name) {
        setName(name);
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
        if (getMobileDeviceAccessRuleId() != null)
            sb.append("MobileDeviceAccessRuleId: ").append(getMobileDeviceAccessRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MobileDeviceAccessMatchedRule == false)
            return false;
        MobileDeviceAccessMatchedRule other = (MobileDeviceAccessMatchedRule) obj;
        if (other.getMobileDeviceAccessRuleId() == null ^ this.getMobileDeviceAccessRuleId() == null)
            return false;
        if (other.getMobileDeviceAccessRuleId() != null && other.getMobileDeviceAccessRuleId().equals(this.getMobileDeviceAccessRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMobileDeviceAccessRuleId() == null) ? 0 : getMobileDeviceAccessRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public MobileDeviceAccessMatchedRule clone() {
        try {
            return (MobileDeviceAccessMatchedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.MobileDeviceAccessMatchedRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
