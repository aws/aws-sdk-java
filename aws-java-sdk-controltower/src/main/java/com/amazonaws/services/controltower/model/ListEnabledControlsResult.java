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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnabledControlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     */
    private java.util.List<EnabledControlSummary> enabledControls;
    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the current response is the end of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     * 
     * @return Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     *         contains.
     */

    public java.util.List<EnabledControlSummary> getEnabledControls() {
        return enabledControls;
    }

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     * 
     * @param enabledControls
     *        Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     *        contains.
     */

    public void setEnabledControls(java.util.Collection<EnabledControlSummary> enabledControls) {
        if (enabledControls == null) {
            this.enabledControls = null;
            return;
        }

        this.enabledControls = new java.util.ArrayList<EnabledControlSummary>(enabledControls);
    }

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledControls(java.util.Collection)} or {@link #withEnabledControls(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param enabledControls
     *        Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     *        contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsResult withEnabledControls(EnabledControlSummary... enabledControls) {
        if (this.enabledControls == null) {
            setEnabledControls(new java.util.ArrayList<EnabledControlSummary>(enabledControls.length));
        }
        for (EnabledControlSummary ele : enabledControls) {
            this.enabledControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     * 
     * @param enabledControls
     *        Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     *        contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsResult withEnabledControls(java.util.Collection<EnabledControlSummary> enabledControls) {
        setEnabledControls(enabledControls);
        return this;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the current response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the current response is the end of the
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the current response is the end of the results.
     * </p>
     * 
     * @return Retrieves the next page of results. If the string is empty, the current response is the end of the
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the current response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the current response is the end of the
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnabledControlsResult withNextToken(String nextToken) {
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
        if (getEnabledControls() != null)
            sb.append("EnabledControls: ").append(getEnabledControls()).append(",");
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

        if (obj instanceof ListEnabledControlsResult == false)
            return false;
        ListEnabledControlsResult other = (ListEnabledControlsResult) obj;
        if (other.getEnabledControls() == null ^ this.getEnabledControls() == null)
            return false;
        if (other.getEnabledControls() != null && other.getEnabledControls().equals(this.getEnabledControls()) == false)
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

        hashCode = prime * hashCode + ((getEnabledControls() == null) ? 0 : getEnabledControls().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnabledControlsResult clone() {
        try {
            return (ListEnabledControlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
