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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventCategories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventCategoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of event categories.
     * </p>
     */
    private java.util.List<EventCategoryGroup> eventCategoryGroupList;

    /**
     * <p>
     * A list of event categories.
     * </p>
     * 
     * @return A list of event categories.
     */

    public java.util.List<EventCategoryGroup> getEventCategoryGroupList() {
        return eventCategoryGroupList;
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     * 
     * @param eventCategoryGroupList
     *        A list of event categories.
     */

    public void setEventCategoryGroupList(java.util.Collection<EventCategoryGroup> eventCategoryGroupList) {
        if (eventCategoryGroupList == null) {
            this.eventCategoryGroupList = null;
            return;
        }

        this.eventCategoryGroupList = new java.util.ArrayList<EventCategoryGroup>(eventCategoryGroupList);
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategoryGroupList(java.util.Collection)} or
     * {@link #withEventCategoryGroupList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventCategoryGroupList
     *        A list of event categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventCategoriesResult withEventCategoryGroupList(EventCategoryGroup... eventCategoryGroupList) {
        if (this.eventCategoryGroupList == null) {
            setEventCategoryGroupList(new java.util.ArrayList<EventCategoryGroup>(eventCategoryGroupList.length));
        }
        for (EventCategoryGroup ele : eventCategoryGroupList) {
            this.eventCategoryGroupList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     * 
     * @param eventCategoryGroupList
     *        A list of event categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventCategoriesResult withEventCategoryGroupList(java.util.Collection<EventCategoryGroup> eventCategoryGroupList) {
        setEventCategoryGroupList(eventCategoryGroupList);
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
        if (getEventCategoryGroupList() != null)
            sb.append("EventCategoryGroupList: ").append(getEventCategoryGroupList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesResult == false)
            return false;
        DescribeEventCategoriesResult other = (DescribeEventCategoriesResult) obj;
        if (other.getEventCategoryGroupList() == null ^ this.getEventCategoryGroupList() == null)
            return false;
        if (other.getEventCategoryGroupList() != null && other.getEventCategoryGroupList().equals(this.getEventCategoryGroupList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventCategoryGroupList() == null) ? 0 : getEventCategoryGroupList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventCategoriesResult clone() {
        try {
            return (DescribeEventCategoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
