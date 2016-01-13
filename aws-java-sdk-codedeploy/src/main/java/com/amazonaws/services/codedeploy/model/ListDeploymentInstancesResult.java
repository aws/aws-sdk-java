/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a list deployment instances operation.
 * </p>
 */
public class ListDeploymentInstancesResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of instances IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instancesList;
    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * deployment instances call to return the next set of deployment instances
     * in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of instances IDs.
     * </p>
     * 
     * @return A list of instances IDs.
     */
    public java.util.List<String> getInstancesList() {
        if (instancesList == null) {
            instancesList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instancesList;
    }

    /**
     * <p>
     * A list of instances IDs.
     * </p>
     * 
     * @param instancesList
     *        A list of instances IDs.
     */
    public void setInstancesList(java.util.Collection<String> instancesList) {
        if (instancesList == null) {
            this.instancesList = null;
            return;
        }

        this.instancesList = new com.amazonaws.internal.SdkInternalList<String>(
                instancesList);
    }

    /**
     * <p>
     * A list of instances IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstancesList(java.util.Collection)} or
     * {@link #withInstancesList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instancesList
     *        A list of instances IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesResult withInstancesList(
            String... instancesList) {
        if (this.instancesList == null) {
            setInstancesList(new com.amazonaws.internal.SdkInternalList<String>(
                    instancesList.length));
        }
        for (String ele : instancesList) {
            this.instancesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of instances IDs.
     * </p>
     * 
     * @param instancesList
     *        A list of instances IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesResult withInstancesList(
            java.util.Collection<String> instancesList) {
        setInstancesList(instancesList);
        return this;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * deployment instances call to return the next set of deployment instances
     * in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of information that is returned is significantly
     *        large, an identifier will also be returned, which can be used in a
     *        subsequent list deployment instances call to return the next set
     *        of deployment instances in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * deployment instances call to return the next set of deployment instances
     * in the list.
     * </p>
     * 
     * @return If the amount of information that is returned is significantly
     *         large, an identifier will also be returned, which can be used in
     *         a subsequent list deployment instances call to return the next
     *         set of deployment instances in the list.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the amount of information that is returned is significantly large, an
     * identifier will also be returned, which can be used in a subsequent list
     * deployment instances call to return the next set of deployment instances
     * in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of information that is returned is significantly
     *        large, an identifier will also be returned, which can be used in a
     *        subsequent list deployment instances call to return the next set
     *        of deployment instances in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListDeploymentInstancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstancesList() != null)
            sb.append("InstancesList: " + getInstancesList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentInstancesResult == false)
            return false;
        ListDeploymentInstancesResult other = (ListDeploymentInstancesResult) obj;
        if (other.getInstancesList() == null ^ this.getInstancesList() == null)
            return false;
        if (other.getInstancesList() != null
                && other.getInstancesList().equals(this.getInstancesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstancesList() == null) ? 0 : getInstancesList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentInstancesResult clone() {
        try {
            return (ListDeploymentInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}