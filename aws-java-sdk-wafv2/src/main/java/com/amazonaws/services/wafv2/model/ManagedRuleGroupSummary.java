/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * High-level information about a managed rule group, returned by <a>ListAvailableManagedRuleGroups</a>. This provides
 * information like the name and vendor name, that you provide when you add a <a>ManagedRuleGroupStatement</a> to a web
 * ACL. Managed rule groups include AWS Managed Rules rule groups, which are free of charge to AWS WAF customers, and
 * AWS Marketplace managed rule groups, which you can subscribe to through AWS Marketplace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     */
    private String vendorName;
    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     * manages it.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @return The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *         rule group.
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify the
     *        rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupSummary withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @return The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * </p>
     * 
     * @param name
     *        The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     * manages it.
     * </p>
     * 
     * @param description
     *        The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     *        manages it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     * manages it.
     * </p>
     * 
     * @return The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller
     *         who manages it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     * manages it.
     * </p>
     * 
     * @param description
     *        The description of the managed rule group, provided by AWS Managed Rules or the AWS Marketplace seller who
     *        manages it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupSummary withDescription(String description) {
        setDescription(description);
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
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleGroupSummary == false)
            return false;
        ManagedRuleGroupSummary other = (ManagedRuleGroupSummary) obj;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleGroupSummary clone() {
        try {
            return (ManagedRuleGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
