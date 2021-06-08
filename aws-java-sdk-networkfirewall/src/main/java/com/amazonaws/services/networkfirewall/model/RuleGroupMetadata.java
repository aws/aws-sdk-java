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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * High-level information about a rule group, returned by <a>ListRuleGroups</a>. You can use the information provided in
 * the metadata to retrieve and manage a rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleGroupMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @return The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * </p>
     * 
     * @param name
     *        The descriptive name of the rule group. You can't change the name of a rule group after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupMetadata withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupMetadata == false)
            return false;
        RuleGroupMetadata other = (RuleGroupMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupMetadata clone() {
        try {
            return (RuleGroupMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleGroupMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
