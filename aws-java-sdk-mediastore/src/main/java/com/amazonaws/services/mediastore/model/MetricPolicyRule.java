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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A setting that enables metrics at the object level. Each rule contains an object group and an object group name. If
 * the policy includes the MetricPolicyRules parameter, you must include at least one rule. Each metric policy can
 * include up to five rules by default. You can also <a
 * href="https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas">request a
 * quota increase</a> to allow up to 300 rules per policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/MetricPolicyRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricPolicyRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     * </p>
     */
    private String objectGroup;
    /**
     * <p>
     * A name that allows you to refer to the object group.
     * </p>
     */
    private String objectGroupName;

    /**
     * <p>
     * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     * </p>
     * 
     * @param objectGroup
     *        A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     */

    public void setObjectGroup(String objectGroup) {
        this.objectGroup = objectGroup;
    }

    /**
     * <p>
     * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     * </p>
     * 
     * @return A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     */

    public String getObjectGroup() {
        return this.objectGroup;
    }

    /**
     * <p>
     * A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     * </p>
     * 
     * @param objectGroup
     *        A path or file name that defines which objects to include in the group. Wildcards (*) are acceptable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPolicyRule withObjectGroup(String objectGroup) {
        setObjectGroup(objectGroup);
        return this;
    }

    /**
     * <p>
     * A name that allows you to refer to the object group.
     * </p>
     * 
     * @param objectGroupName
     *        A name that allows you to refer to the object group.
     */

    public void setObjectGroupName(String objectGroupName) {
        this.objectGroupName = objectGroupName;
    }

    /**
     * <p>
     * A name that allows you to refer to the object group.
     * </p>
     * 
     * @return A name that allows you to refer to the object group.
     */

    public String getObjectGroupName() {
        return this.objectGroupName;
    }

    /**
     * <p>
     * A name that allows you to refer to the object group.
     * </p>
     * 
     * @param objectGroupName
     *        A name that allows you to refer to the object group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPolicyRule withObjectGroupName(String objectGroupName) {
        setObjectGroupName(objectGroupName);
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
        if (getObjectGroup() != null)
            sb.append("ObjectGroup: ").append(getObjectGroup()).append(",");
        if (getObjectGroupName() != null)
            sb.append("ObjectGroupName: ").append(getObjectGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricPolicyRule == false)
            return false;
        MetricPolicyRule other = (MetricPolicyRule) obj;
        if (other.getObjectGroup() == null ^ this.getObjectGroup() == null)
            return false;
        if (other.getObjectGroup() != null && other.getObjectGroup().equals(this.getObjectGroup()) == false)
            return false;
        if (other.getObjectGroupName() == null ^ this.getObjectGroupName() == null)
            return false;
        if (other.getObjectGroupName() != null && other.getObjectGroupName().equals(this.getObjectGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectGroup() == null) ? 0 : getObjectGroup().hashCode());
        hashCode = prime * hashCode + ((getObjectGroupName() == null) ? 0 : getObjectGroupName().hashCode());
        return hashCode;
    }

    @Override
    public MetricPolicyRule clone() {
        try {
            return (MetricPolicyRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediastore.model.transform.MetricPolicyRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
