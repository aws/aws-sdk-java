/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration information of the grouping of Wisdom users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GroupingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The criteria used for grouping Wisdom users.
     * </p>
     * <p>
     * The following is the list of supported criteria values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RoutingProfileArn</code>: Grouping the users by their <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profile ARN</a>. User should have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     * >SearchRoutingProfile</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     * >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     * </p>
     * </li>
     * </ul>
     */
    private String criteria;
    /**
     * <p>
     * The list of values that define different groups of Wisdom users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs of <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profiles</a> as values of this parameter.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The criteria used for grouping Wisdom users.
     * </p>
     * <p>
     * The following is the list of supported criteria values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RoutingProfileArn</code>: Grouping the users by their <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profile ARN</a>. User should have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     * >SearchRoutingProfile</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     * >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param criteria
     *        The criteria used for grouping Wisdom users.</p>
     *        <p>
     *        The following is the list of supported criteria values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RoutingProfileArn</code>: Grouping the users by their <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect
     *        routing profile ARN</a>. User should have <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     *        >SearchRoutingProfile</a> and <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     *        >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     *        </p>
     *        </li>
     */

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria used for grouping Wisdom users.
     * </p>
     * <p>
     * The following is the list of supported criteria values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RoutingProfileArn</code>: Grouping the users by their <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profile ARN</a>. User should have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     * >SearchRoutingProfile</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     * >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The criteria used for grouping Wisdom users.</p>
     *         <p>
     *         The following is the list of supported criteria values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RoutingProfileArn</code>: Grouping the users by their <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect
     *         routing profile ARN</a>. User should have <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     *         >SearchRoutingProfile</a> and <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     *         >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     *         </p>
     *         </li>
     */

    public String getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * The criteria used for grouping Wisdom users.
     * </p>
     * <p>
     * The following is the list of supported criteria values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RoutingProfileArn</code>: Grouping the users by their <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profile ARN</a>. User should have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     * >SearchRoutingProfile</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     * >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param criteria
     *        The criteria used for grouping Wisdom users.</p>
     *        <p>
     *        The following is the list of supported criteria values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RoutingProfileArn</code>: Grouping the users by their <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect
     *        routing profile ARN</a>. User should have <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html"
     *        >SearchRoutingProfile</a> and <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html"
     *        >DescribeRoutingProfile</a> permissions when setting criteria to this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupingConfiguration withCriteria(String criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * The list of values that define different groups of Wisdom users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs of <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profiles</a> as values of this parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The list of values that define different groups of Wisdom users.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs
     *         of <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon
     *         Connect routing profiles</a> as values of this parameter.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of values that define different groups of Wisdom users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs of <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profiles</a> as values of this parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The list of values that define different groups of Wisdom users.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs
     *        of <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon
     *        Connect routing profiles</a> as values of this parameter.
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The list of values that define different groups of Wisdom users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs of <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profiles</a> as values of this parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of values that define different groups of Wisdom users.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs
     *        of <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon
     *        Connect routing profiles</a> as values of this parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupingConfiguration withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values that define different groups of Wisdom users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs of <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon Connect routing
     * profiles</a> as values of this parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The list of values that define different groups of Wisdom users.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        When setting <code>criteria</code> to <code>RoutingProfileArn</code>, you need to provide a list of ARNs
     *        of <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html">Amazon
     *        Connect routing profiles</a> as values of this parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupingConfiguration withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getCriteria() != null)
            sb.append("Criteria: ").append("***Sensitive Data Redacted***").append(",");
        if (getValues() != null)
            sb.append("Values: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupingConfiguration == false)
            return false;
        GroupingConfiguration other = (GroupingConfiguration) obj;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public GroupingConfiguration clone() {
        try {
            return (GroupingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.GroupingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
