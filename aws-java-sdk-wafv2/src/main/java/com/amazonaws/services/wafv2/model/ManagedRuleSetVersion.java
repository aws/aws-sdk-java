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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for a single version of a managed rule set.
 * </p>
 * <note>
 * <p>
 * This is intended for use only by vendors of managed rule sets. Vendors are Amazon Web Services and Amazon Web
 * Services Marketplace sellers.
 * </p>
 * <p>
 * Vendors, you can use the managed rule set APIs to provide controlled rollout of your versioned managed rule group
 * offerings for your customers. The APIs are <code>ListManagedRuleSets</code>, <code>GetManagedRuleSet</code>,
 * <code>PutManagedRuleSetVersions</code>, and <code>UpdateManagedRuleSetVersionExpiryDate</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleSetVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleSetVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of your
     * managed rule group.
     * </p>
     */
    private String associatedRuleGroupArn;
    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     */
    private Long capacity;
    /**
     * <p>
     * The amount of time you expect this version of your managed rule group to last, in days.
     * </p>
     */
    private Integer forecastedLifetime;
    /**
     * <p>
     * The time that you first published this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     */
    private java.util.Date publishTimestamp;
    /**
     * <p>
     * The last time that you updated this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * The time that this version is set to expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     */
    private java.util.Date expiryTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of your
     * managed rule group.
     * </p>
     * 
     * @param associatedRuleGroupArn
     *        The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of
     *        your managed rule group.
     */

    public void setAssociatedRuleGroupArn(String associatedRuleGroupArn) {
        this.associatedRuleGroupArn = associatedRuleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of your
     * managed rule group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of
     *         your managed rule group.
     */

    public String getAssociatedRuleGroupArn() {
        return this.associatedRuleGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of your
     * managed rule group.
     * </p>
     * 
     * @param associatedRuleGroupArn
     *        The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of
     *        your managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withAssociatedRuleGroupArn(String associatedRuleGroupArn) {
        setAssociatedRuleGroupArn(associatedRuleGroupArn);
        return this;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.</p>
     *        <p>
     *        WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost
     *        of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more
     *        processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage
     *        when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @return The web ACL capacity units (WCUs) required for this rule group.</p>
     *         <p>
     *         WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *         groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative
     *         cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use
     *         more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU
     *         usage when they use a rule group. The WCU limit for web ACLs is 1,500.
     */

    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The web ACL capacity units (WCUs) required for this rule group.
     * </p>
     * <p>
     * WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and
     * web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule.
     * Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule
     * group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group.
     * The WCU limit for web ACLs is 1,500.
     * </p>
     * 
     * @param capacity
     *        The web ACL capacity units (WCUs) required for this rule group.</p>
     *        <p>
     *        WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule
     *        groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost
     *        of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more
     *        processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage
     *        when they use a rule group. The WCU limit for web ACLs is 1,500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withCapacity(Long capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The amount of time you expect this version of your managed rule group to last, in days.
     * </p>
     * 
     * @param forecastedLifetime
     *        The amount of time you expect this version of your managed rule group to last, in days.
     */

    public void setForecastedLifetime(Integer forecastedLifetime) {
        this.forecastedLifetime = forecastedLifetime;
    }

    /**
     * <p>
     * The amount of time you expect this version of your managed rule group to last, in days.
     * </p>
     * 
     * @return The amount of time you expect this version of your managed rule group to last, in days.
     */

    public Integer getForecastedLifetime() {
        return this.forecastedLifetime;
    }

    /**
     * <p>
     * The amount of time you expect this version of your managed rule group to last, in days.
     * </p>
     * 
     * @param forecastedLifetime
     *        The amount of time you expect this version of your managed rule group to last, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withForecastedLifetime(Integer forecastedLifetime) {
        setForecastedLifetime(forecastedLifetime);
        return this;
    }

    /**
     * <p>
     * The time that you first published this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param publishTimestamp
     *        The time that you first published this version. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     */

    public void setPublishTimestamp(java.util.Date publishTimestamp) {
        this.publishTimestamp = publishTimestamp;
    }

    /**
     * <p>
     * The time that you first published this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @return The time that you first published this version. </p>
     *         <p>
     *         Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *         example, "2016-09-27T14:50Z".
     */

    public java.util.Date getPublishTimestamp() {
        return this.publishTimestamp;
    }

    /**
     * <p>
     * The time that you first published this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param publishTimestamp
     *        The time that you first published this version. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withPublishTimestamp(java.util.Date publishTimestamp) {
        setPublishTimestamp(publishTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time that you updated this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The last time that you updated this version. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The last time that you updated this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @return The last time that you updated this version. </p>
     *         <p>
     *         Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *         example, "2016-09-27T14:50Z".
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The last time that you updated this version.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The last time that you updated this version. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * The time that this version is set to expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param expiryTimestamp
     *        The time that this version is set to expire.</p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     */

    public void setExpiryTimestamp(java.util.Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    /**
     * <p>
     * The time that this version is set to expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @return The time that this version is set to expire.</p>
     *         <p>
     *         Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *         example, "2016-09-27T14:50Z".
     */

    public java.util.Date getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /**
     * <p>
     * The time that this version is set to expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param expiryTimestamp
     *        The time that this version is set to expire.</p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleSetVersion withExpiryTimestamp(java.util.Date expiryTimestamp) {
        setExpiryTimestamp(expiryTimestamp);
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
        if (getAssociatedRuleGroupArn() != null)
            sb.append("AssociatedRuleGroupArn: ").append(getAssociatedRuleGroupArn()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getForecastedLifetime() != null)
            sb.append("ForecastedLifetime: ").append(getForecastedLifetime()).append(",");
        if (getPublishTimestamp() != null)
            sb.append("PublishTimestamp: ").append(getPublishTimestamp()).append(",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getExpiryTimestamp() != null)
            sb.append("ExpiryTimestamp: ").append(getExpiryTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleSetVersion == false)
            return false;
        ManagedRuleSetVersion other = (ManagedRuleSetVersion) obj;
        if (other.getAssociatedRuleGroupArn() == null ^ this.getAssociatedRuleGroupArn() == null)
            return false;
        if (other.getAssociatedRuleGroupArn() != null && other.getAssociatedRuleGroupArn().equals(this.getAssociatedRuleGroupArn()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getForecastedLifetime() == null ^ this.getForecastedLifetime() == null)
            return false;
        if (other.getForecastedLifetime() != null && other.getForecastedLifetime().equals(this.getForecastedLifetime()) == false)
            return false;
        if (other.getPublishTimestamp() == null ^ this.getPublishTimestamp() == null)
            return false;
        if (other.getPublishTimestamp() != null && other.getPublishTimestamp().equals(this.getPublishTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getExpiryTimestamp() == null ^ this.getExpiryTimestamp() == null)
            return false;
        if (other.getExpiryTimestamp() != null && other.getExpiryTimestamp().equals(this.getExpiryTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedRuleGroupArn() == null) ? 0 : getAssociatedRuleGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getForecastedLifetime() == null) ? 0 : getForecastedLifetime().hashCode());
        hashCode = prime * hashCode + ((getPublishTimestamp() == null) ? 0 : getPublishTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExpiryTimestamp() == null) ? 0 : getExpiryTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleSetVersion clone() {
        try {
            return (ManagedRuleSetVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleSetVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
