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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingGroupsForThingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The thing groups.
     * </p>
     */
    private java.util.List<GroupNameAndArn> thingGroups;
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing groups.
     * </p>
     * 
     * @return The thing groups.
     */

    public java.util.List<GroupNameAndArn> getThingGroups() {
        return thingGroups;
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     * 
     * @param thingGroups
     *        The thing groups.
     */

    public void setThingGroups(java.util.Collection<GroupNameAndArn> thingGroups) {
        if (thingGroups == null) {
            this.thingGroups = null;
            return;
        }

        this.thingGroups = new java.util.ArrayList<GroupNameAndArn>(thingGroups);
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingGroups(java.util.Collection)} or {@link #withThingGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param thingGroups
     *        The thing groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsForThingResult withThingGroups(GroupNameAndArn... thingGroups) {
        if (this.thingGroups == null) {
            setThingGroups(new java.util.ArrayList<GroupNameAndArn>(thingGroups.length));
        }
        for (GroupNameAndArn ele : thingGroups) {
            this.thingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The thing groups.
     * </p>
     * 
     * @param thingGroups
     *        The thing groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsForThingResult withThingGroups(java.util.Collection<GroupNameAndArn> thingGroups) {
        setThingGroups(thingGroups);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingGroupsForThingResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getThingGroups() != null)
            sb.append("ThingGroups: ").append(getThingGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingGroupsForThingResult == false)
            return false;
        ListThingGroupsForThingResult other = (ListThingGroupsForThingResult) obj;
        if (other.getThingGroups() == null ^ this.getThingGroups() == null)
            return false;
        if (other.getThingGroups() != null && other.getThingGroups().equals(this.getThingGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroups() == null) ? 0 : getThingGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThingGroupsForThingResult clone() {
        try {
            return (ListThingGroupsForThingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
