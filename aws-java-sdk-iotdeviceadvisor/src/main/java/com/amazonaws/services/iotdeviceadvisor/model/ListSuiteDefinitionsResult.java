/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSuiteDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that provide summaries of information about the suite definitions in the list.
     * </p>
     */
    private java.util.List<SuiteDefinitionInformation> suiteDefinitionInformationList;
    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that provide summaries of information about the suite definitions in the list.
     * </p>
     * 
     * @return An array of objects that provide summaries of information about the suite definitions in the list.
     */

    public java.util.List<SuiteDefinitionInformation> getSuiteDefinitionInformationList() {
        return suiteDefinitionInformationList;
    }

    /**
     * <p>
     * An array of objects that provide summaries of information about the suite definitions in the list.
     * </p>
     * 
     * @param suiteDefinitionInformationList
     *        An array of objects that provide summaries of information about the suite definitions in the list.
     */

    public void setSuiteDefinitionInformationList(java.util.Collection<SuiteDefinitionInformation> suiteDefinitionInformationList) {
        if (suiteDefinitionInformationList == null) {
            this.suiteDefinitionInformationList = null;
            return;
        }

        this.suiteDefinitionInformationList = new java.util.ArrayList<SuiteDefinitionInformation>(suiteDefinitionInformationList);
    }

    /**
     * <p>
     * An array of objects that provide summaries of information about the suite definitions in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuiteDefinitionInformationList(java.util.Collection)} or
     * {@link #withSuiteDefinitionInformationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param suiteDefinitionInformationList
     *        An array of objects that provide summaries of information about the suite definitions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteDefinitionsResult withSuiteDefinitionInformationList(SuiteDefinitionInformation... suiteDefinitionInformationList) {
        if (this.suiteDefinitionInformationList == null) {
            setSuiteDefinitionInformationList(new java.util.ArrayList<SuiteDefinitionInformation>(suiteDefinitionInformationList.length));
        }
        for (SuiteDefinitionInformation ele : suiteDefinitionInformationList) {
            this.suiteDefinitionInformationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provide summaries of information about the suite definitions in the list.
     * </p>
     * 
     * @param suiteDefinitionInformationList
     *        An array of objects that provide summaries of information about the suite definitions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteDefinitionsResult withSuiteDefinitionInformationList(java.util.Collection<SuiteDefinitionInformation> suiteDefinitionInformationList) {
        setSuiteDefinitionInformationList(suiteDefinitionInformationList);
        return this;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @return A token used to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteDefinitionsResult withNextToken(String nextToken) {
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
        if (getSuiteDefinitionInformationList() != null)
            sb.append("SuiteDefinitionInformationList: ").append(getSuiteDefinitionInformationList()).append(",");
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

        if (obj instanceof ListSuiteDefinitionsResult == false)
            return false;
        ListSuiteDefinitionsResult other = (ListSuiteDefinitionsResult) obj;
        if (other.getSuiteDefinitionInformationList() == null ^ this.getSuiteDefinitionInformationList() == null)
            return false;
        if (other.getSuiteDefinitionInformationList() != null
                && other.getSuiteDefinitionInformationList().equals(this.getSuiteDefinitionInformationList()) == false)
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

        hashCode = prime * hashCode + ((getSuiteDefinitionInformationList() == null) ? 0 : getSuiteDefinitionInformationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSuiteDefinitionsResult clone() {
        try {
            return (ListSuiteDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
