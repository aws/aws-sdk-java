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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlowModules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactFlowModulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the flow module.
     * </p>
     */
    private java.util.List<ContactFlowModuleSummary> contactFlowModulesSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the flow module.
     * </p>
     * 
     * @return Information about the flow module.
     */

    public java.util.List<ContactFlowModuleSummary> getContactFlowModulesSummaryList() {
        return contactFlowModulesSummaryList;
    }

    /**
     * <p>
     * Information about the flow module.
     * </p>
     * 
     * @param contactFlowModulesSummaryList
     *        Information about the flow module.
     */

    public void setContactFlowModulesSummaryList(java.util.Collection<ContactFlowModuleSummary> contactFlowModulesSummaryList) {
        if (contactFlowModulesSummaryList == null) {
            this.contactFlowModulesSummaryList = null;
            return;
        }

        this.contactFlowModulesSummaryList = new java.util.ArrayList<ContactFlowModuleSummary>(contactFlowModulesSummaryList);
    }

    /**
     * <p>
     * Information about the flow module.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactFlowModulesSummaryList(java.util.Collection)} or
     * {@link #withContactFlowModulesSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contactFlowModulesSummaryList
     *        Information about the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowModulesResult withContactFlowModulesSummaryList(ContactFlowModuleSummary... contactFlowModulesSummaryList) {
        if (this.contactFlowModulesSummaryList == null) {
            setContactFlowModulesSummaryList(new java.util.ArrayList<ContactFlowModuleSummary>(contactFlowModulesSummaryList.length));
        }
        for (ContactFlowModuleSummary ele : contactFlowModulesSummaryList) {
            this.contactFlowModulesSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the flow module.
     * </p>
     * 
     * @param contactFlowModulesSummaryList
     *        Information about the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowModulesResult withContactFlowModulesSummaryList(java.util.Collection<ContactFlowModuleSummary> contactFlowModulesSummaryList) {
        setContactFlowModulesSummaryList(contactFlowModulesSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowModulesResult withNextToken(String nextToken) {
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
        if (getContactFlowModulesSummaryList() != null)
            sb.append("ContactFlowModulesSummaryList: ").append(getContactFlowModulesSummaryList()).append(",");
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

        if (obj instanceof ListContactFlowModulesResult == false)
            return false;
        ListContactFlowModulesResult other = (ListContactFlowModulesResult) obj;
        if (other.getContactFlowModulesSummaryList() == null ^ this.getContactFlowModulesSummaryList() == null)
            return false;
        if (other.getContactFlowModulesSummaryList() != null
                && other.getContactFlowModulesSummaryList().equals(this.getContactFlowModulesSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getContactFlowModulesSummaryList() == null) ? 0 : getContactFlowModulesSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactFlowModulesResult clone() {
        try {
            return (ListContactFlowModulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
