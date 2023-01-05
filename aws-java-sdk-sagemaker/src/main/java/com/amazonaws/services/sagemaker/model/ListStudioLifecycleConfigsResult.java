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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListStudioLifecycleConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioLifecycleConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token for getting the next set of actions, if there are any.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of Lifecycle Configurations and their properties.
     * </p>
     */
    private java.util.List<StudioLifecycleConfigDetails> studioLifecycleConfigs;

    /**
     * <p>
     * A token for getting the next set of actions, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of actions, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of actions, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of actions, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of actions, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of actions, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioLifecycleConfigsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of Lifecycle Configurations and their properties.
     * </p>
     * 
     * @return A list of Lifecycle Configurations and their properties.
     */

    public java.util.List<StudioLifecycleConfigDetails> getStudioLifecycleConfigs() {
        return studioLifecycleConfigs;
    }

    /**
     * <p>
     * A list of Lifecycle Configurations and their properties.
     * </p>
     * 
     * @param studioLifecycleConfigs
     *        A list of Lifecycle Configurations and their properties.
     */

    public void setStudioLifecycleConfigs(java.util.Collection<StudioLifecycleConfigDetails> studioLifecycleConfigs) {
        if (studioLifecycleConfigs == null) {
            this.studioLifecycleConfigs = null;
            return;
        }

        this.studioLifecycleConfigs = new java.util.ArrayList<StudioLifecycleConfigDetails>(studioLifecycleConfigs);
    }

    /**
     * <p>
     * A list of Lifecycle Configurations and their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudioLifecycleConfigs(java.util.Collection)} or
     * {@link #withStudioLifecycleConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param studioLifecycleConfigs
     *        A list of Lifecycle Configurations and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioLifecycleConfigsResult withStudioLifecycleConfigs(StudioLifecycleConfigDetails... studioLifecycleConfigs) {
        if (this.studioLifecycleConfigs == null) {
            setStudioLifecycleConfigs(new java.util.ArrayList<StudioLifecycleConfigDetails>(studioLifecycleConfigs.length));
        }
        for (StudioLifecycleConfigDetails ele : studioLifecycleConfigs) {
            this.studioLifecycleConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Lifecycle Configurations and their properties.
     * </p>
     * 
     * @param studioLifecycleConfigs
     *        A list of Lifecycle Configurations and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioLifecycleConfigsResult withStudioLifecycleConfigs(java.util.Collection<StudioLifecycleConfigDetails> studioLifecycleConfigs) {
        setStudioLifecycleConfigs(studioLifecycleConfigs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStudioLifecycleConfigs() != null)
            sb.append("StudioLifecycleConfigs: ").append(getStudioLifecycleConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudioLifecycleConfigsResult == false)
            return false;
        ListStudioLifecycleConfigsResult other = (ListStudioLifecycleConfigsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStudioLifecycleConfigs() == null ^ this.getStudioLifecycleConfigs() == null)
            return false;
        if (other.getStudioLifecycleConfigs() != null && other.getStudioLifecycleConfigs().equals(this.getStudioLifecycleConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStudioLifecycleConfigs() == null) ? 0 : getStudioLifecycleConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioLifecycleConfigsResult clone() {
        try {
            return (ListStudioLifecycleConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
