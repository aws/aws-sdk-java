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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter object, used to optionally filter results from calls to the <code>ListEntities</code> and
 * <code>ListChangeSets</code> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     */
    private String name;
    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     * <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended before
     * the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended after
     * the filter value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> valueList;

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * 
     * @param name
     *        For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.</p>
     *        <p>
     *        For <code>ListChangeSets</code>, the supported values are as follows:
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * 
     * @return For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.</p>
     *         <p>
     *         For <code>ListChangeSets</code>, the supported values are as follows:
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, the supported values are as follows:
     * </p>
     * 
     * @param name
     *        For <code>ListEntities</code>, the supported value for this is an <code>EntityId</code>.</p>
     *        <p>
     *        For <code>ListChangeSets</code>, the supported values are as follows:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     * <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended before
     * the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended after
     * the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.</p>
     *         <p>
     *         <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as
     *         follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     *         <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set
     *         requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *         started before the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *         started after the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *         before the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *         after the filter value.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValueList() {
        return valueList;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     * <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended before
     * the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended after
     * the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueList
     *        <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.</p>
     *        <p>
     *        <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as
     *        follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     *        <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started after the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        after the filter value.
     *        </p>
     *        </li>
     */

    public void setValueList(java.util.Collection<String> valueList) {
        if (valueList == null) {
            this.valueList = null;
            return;
        }

        this.valueList = new java.util.ArrayList<String>(valueList);
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     * <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended before
     * the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended after
     * the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueList(java.util.Collection)} or {@link #withValueList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param valueList
     *        <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.</p>
     *        <p>
     *        <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as
     *        follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     *        <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started after the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        after the filter value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValueList(String... valueList) {
        if (this.valueList == null) {
            setValueList(new java.util.ArrayList<String>(valueList.length));
        }
        for (String ele : valueList) {
            this.valueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.
     * </p>
     * <p>
     * <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     * <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * before the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that started
     * after the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended before
     * the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended after
     * the filter value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueList
     *        <code>ListEntities</code> - This is a list of unique <code>EntityId</code>s.</p>
     *        <p>
     *        <code>ListChangeSets</code> - The supported filter names and associated <code>ValueList</code>s is as
     *        follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ChangeSetName</code> - The supported <code>ValueList</code> is a list of non-unique
     *        <code>ChangeSetName</code>s. These are defined when you call the <code>StartChangeSet</code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> - The supported <code>ValueList</code> is a list of statuses for all change set
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EntityId</code> - The supported <code>ValueList</code> is a list of unique <code>EntityId</code>s.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterStartTime</code> - The supported <code>ValueList</code> is a list of all change sets that
     *        started after the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        before the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> - The supported <code>ValueList</code> is a list of all change sets that ended
     *        after the filter value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValueList(java.util.Collection<String> valueList) {
        setValueList(valueList);
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
        if (getValueList() != null)
            sb.append("ValueList: ").append(getValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValueList() == null ^ this.getValueList() == null)
            return false;
        if (other.getValueList() != null && other.getValueList().equals(this.getValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValueList() == null) ? 0 : getValueList().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
