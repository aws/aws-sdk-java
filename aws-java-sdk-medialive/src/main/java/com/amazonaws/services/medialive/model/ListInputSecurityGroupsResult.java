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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListInputSecurityGroupsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputSecurityGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of input security groups */
    private java.util.List<InputSecurityGroup> inputSecurityGroups;

    private String nextToken;

    /**
     * List of input security groups
     * 
     * @return List of input security groups
     */

    public java.util.List<InputSecurityGroup> getInputSecurityGroups() {
        return inputSecurityGroups;
    }

    /**
     * List of input security groups
     * 
     * @param inputSecurityGroups
     *        List of input security groups
     */

    public void setInputSecurityGroups(java.util.Collection<InputSecurityGroup> inputSecurityGroups) {
        if (inputSecurityGroups == null) {
            this.inputSecurityGroups = null;
            return;
        }

        this.inputSecurityGroups = new java.util.ArrayList<InputSecurityGroup>(inputSecurityGroups);
    }

    /**
     * List of input security groups
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSecurityGroups(java.util.Collection)} or {@link #withInputSecurityGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inputSecurityGroups
     *        List of input security groups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputSecurityGroupsResult withInputSecurityGroups(InputSecurityGroup... inputSecurityGroups) {
        if (this.inputSecurityGroups == null) {
            setInputSecurityGroups(new java.util.ArrayList<InputSecurityGroup>(inputSecurityGroups.length));
        }
        for (InputSecurityGroup ele : inputSecurityGroups) {
            this.inputSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * List of input security groups
     * 
     * @param inputSecurityGroups
     *        List of input security groups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputSecurityGroupsResult withInputSecurityGroups(java.util.Collection<InputSecurityGroup> inputSecurityGroups) {
        setInputSecurityGroups(inputSecurityGroups);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputSecurityGroupsResult withNextToken(String nextToken) {
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
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: ").append(getInputSecurityGroups()).append(",");
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

        if (obj instanceof ListInputSecurityGroupsResult == false)
            return false;
        ListInputSecurityGroupsResult other = (ListInputSecurityGroupsResult) obj;
        if (other.getInputSecurityGroups() == null ^ this.getInputSecurityGroups() == null)
            return false;
        if (other.getInputSecurityGroups() != null && other.getInputSecurityGroups().equals(this.getInputSecurityGroups()) == false)
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

        hashCode = prime * hashCode + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputSecurityGroupsResult clone() {
        try {
            return (ListInputSecurityGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
