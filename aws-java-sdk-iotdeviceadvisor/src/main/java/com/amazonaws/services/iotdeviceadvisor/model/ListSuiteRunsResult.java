/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSuiteRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite.
     * </p>
     */
    private java.util.List<SuiteRunInformation> suiteRunsList;
    /**
     * <p>
     * Next pagination token for list suite run response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite.
     * </p>
     * 
     * @return Lists the runs of the specified Device Advisor test suite.
     */

    public java.util.List<SuiteRunInformation> getSuiteRunsList() {
        return suiteRunsList;
    }

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite.
     * </p>
     * 
     * @param suiteRunsList
     *        Lists the runs of the specified Device Advisor test suite.
     */

    public void setSuiteRunsList(java.util.Collection<SuiteRunInformation> suiteRunsList) {
        if (suiteRunsList == null) {
            this.suiteRunsList = null;
            return;
        }

        this.suiteRunsList = new java.util.ArrayList<SuiteRunInformation>(suiteRunsList);
    }

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuiteRunsList(java.util.Collection)} or {@link #withSuiteRunsList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param suiteRunsList
     *        Lists the runs of the specified Device Advisor test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsResult withSuiteRunsList(SuiteRunInformation... suiteRunsList) {
        if (this.suiteRunsList == null) {
            setSuiteRunsList(new java.util.ArrayList<SuiteRunInformation>(suiteRunsList.length));
        }
        for (SuiteRunInformation ele : suiteRunsList) {
            this.suiteRunsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite.
     * </p>
     * 
     * @param suiteRunsList
     *        Lists the runs of the specified Device Advisor test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsResult withSuiteRunsList(java.util.Collection<SuiteRunInformation> suiteRunsList) {
        setSuiteRunsList(suiteRunsList);
        return this;
    }

    /**
     * <p>
     * Next pagination token for list suite run response.
     * </p>
     * 
     * @param nextToken
     *        Next pagination token for list suite run response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next pagination token for list suite run response.
     * </p>
     * 
     * @return Next pagination token for list suite run response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next pagination token for list suite run response.
     * </p>
     * 
     * @param nextToken
     *        Next pagination token for list suite run response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSuiteRunsResult withNextToken(String nextToken) {
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
        if (getSuiteRunsList() != null)
            sb.append("SuiteRunsList: ").append(getSuiteRunsList()).append(",");
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

        if (obj instanceof ListSuiteRunsResult == false)
            return false;
        ListSuiteRunsResult other = (ListSuiteRunsResult) obj;
        if (other.getSuiteRunsList() == null ^ this.getSuiteRunsList() == null)
            return false;
        if (other.getSuiteRunsList() != null && other.getSuiteRunsList().equals(this.getSuiteRunsList()) == false)
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

        hashCode = prime * hashCode + ((getSuiteRunsList() == null) ? 0 : getSuiteRunsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSuiteRunsResult clone() {
        try {
            return (ListSuiteRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
