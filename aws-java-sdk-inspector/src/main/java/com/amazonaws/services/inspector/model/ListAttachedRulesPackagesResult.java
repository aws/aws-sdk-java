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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAttachedRulesPackagesResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs specifying the rules packages returned by the action.
     * </p>
     */
    private java.util.List<String> rulesPackageArnList;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ARNs specifying the rules packages returned by the action.
     * </p>
     * 
     * @return A list of ARNs specifying the rules packages returned by the
     *         action.
     */
    public java.util.List<String> getRulesPackageArnList() {
        return rulesPackageArnList;
    }

    /**
     * <p>
     * A list of ARNs specifying the rules packages returned by the action.
     * </p>
     * 
     * @param rulesPackageArnList
     *        A list of ARNs specifying the rules packages returned by the
     *        action.
     */
    public void setRulesPackageArnList(
            java.util.Collection<String> rulesPackageArnList) {
        if (rulesPackageArnList == null) {
            this.rulesPackageArnList = null;
            return;
        }

        this.rulesPackageArnList = new java.util.ArrayList<String>(
                rulesPackageArnList);
    }

    /**
     * <p>
     * A list of ARNs specifying the rules packages returned by the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackageArnList(java.util.Collection)} or
     * {@link #withRulesPackageArnList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesPackageArnList
     *        A list of ARNs specifying the rules packages returned by the
     *        action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedRulesPackagesResult withRulesPackageArnList(
            String... rulesPackageArnList) {
        if (this.rulesPackageArnList == null) {
            setRulesPackageArnList(new java.util.ArrayList<String>(
                    rulesPackageArnList.length));
        }
        for (String ele : rulesPackageArnList) {
            this.rulesPackageArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs specifying the rules packages returned by the action.
     * </p>
     * 
     * @param rulesPackageArnList
     *        A list of ARNs specifying the rules packages returned by the
     *        action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedRulesPackagesResult withRulesPackageArnList(
            java.util.Collection<String> rulesPackageArnList) {
        setRulesPackageArnList(rulesPackageArnList);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the <b>nextToken</b> parameter in a subsequent
     *         pagination request. If there is no more data to be listed, this
     *         parameter is set to 'null'.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedRulesPackagesResult withNextToken(String nextToken) {
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
        if (getRulesPackageArnList() != null)
            sb.append("RulesPackageArnList: " + getRulesPackageArnList() + ",");
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

        if (obj instanceof ListAttachedRulesPackagesResult == false)
            return false;
        ListAttachedRulesPackagesResult other = (ListAttachedRulesPackagesResult) obj;
        if (other.getRulesPackageArnList() == null
                ^ this.getRulesPackageArnList() == null)
            return false;
        if (other.getRulesPackageArnList() != null
                && other.getRulesPackageArnList().equals(
                        this.getRulesPackageArnList()) == false)
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
                + ((getRulesPackageArnList() == null) ? 0
                        : getRulesPackageArnList().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachedRulesPackagesResult clone() {
        try {
            return (ListAttachedRulesPackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}