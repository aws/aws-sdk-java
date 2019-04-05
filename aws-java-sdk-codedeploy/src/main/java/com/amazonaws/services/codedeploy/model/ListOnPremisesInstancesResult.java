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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of the list on-premises instances operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListOnPremisesInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOnPremisesInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceNames;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * on-premises instances call to return the next set of on-premises instances in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * 
     * @return The list of matching on-premises instance names.
     */

    public java.util.List<String> getInstanceNames() {
        if (instanceNames == null) {
            instanceNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceNames;
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * 
     * @param instanceNames
     *        The list of matching on-premises instance names.
     */

    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new com.amazonaws.internal.SdkInternalList<String>(instanceNames);
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceNames(java.util.Collection)} or {@link #withInstanceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceNames
     *        The list of matching on-premises instance names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesResult withInstanceNames(String... instanceNames) {
        if (this.instanceNames == null) {
            setInstanceNames(new com.amazonaws.internal.SdkInternalList<String>(instanceNames.length));
        }
        for (String ele : instanceNames) {
            this.instanceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of matching on-premises instance names.
     * </p>
     * 
     * @param instanceNames
     *        The list of matching on-premises instance names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesResult withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * on-premises instances call to return the next set of on-premises instances in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list on-premises instances call to return the next set of on-premises instances in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * on-premises instances call to return the next set of on-premises instances in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent list on-premises instances call to return the next set of on-premises instances in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * on-premises instances call to return the next set of on-premises instances in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list on-premises instances call to return the next set of on-premises instances in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOnPremisesInstancesResult withNextToken(String nextToken) {
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
        if (getInstanceNames() != null)
            sb.append("InstanceNames: ").append(getInstanceNames()).append(",");
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

        if (obj instanceof ListOnPremisesInstancesResult == false)
            return false;
        ListOnPremisesInstancesResult other = (ListOnPremisesInstancesResult) obj;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false)
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

        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOnPremisesInstancesResult clone() {
        try {
            return (ListOnPremisesInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
