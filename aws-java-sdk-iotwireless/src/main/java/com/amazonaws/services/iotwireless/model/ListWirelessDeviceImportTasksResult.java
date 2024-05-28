/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDeviceImportTasks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWirelessDeviceImportTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of import tasks and summary information of onboarding status of devices in each import task.
     * </p>
     */
    private java.util.List<WirelessDeviceImportTask> wirelessDeviceImportTaskList;

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <code>null</code> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDeviceImportTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of import tasks and summary information of onboarding status of devices in each import task.
     * </p>
     * 
     * @return List of import tasks and summary information of onboarding status of devices in each import task.
     */

    public java.util.List<WirelessDeviceImportTask> getWirelessDeviceImportTaskList() {
        return wirelessDeviceImportTaskList;
    }

    /**
     * <p>
     * List of import tasks and summary information of onboarding status of devices in each import task.
     * </p>
     * 
     * @param wirelessDeviceImportTaskList
     *        List of import tasks and summary information of onboarding status of devices in each import task.
     */

    public void setWirelessDeviceImportTaskList(java.util.Collection<WirelessDeviceImportTask> wirelessDeviceImportTaskList) {
        if (wirelessDeviceImportTaskList == null) {
            this.wirelessDeviceImportTaskList = null;
            return;
        }

        this.wirelessDeviceImportTaskList = new java.util.ArrayList<WirelessDeviceImportTask>(wirelessDeviceImportTaskList);
    }

    /**
     * <p>
     * List of import tasks and summary information of onboarding status of devices in each import task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDeviceImportTaskList(java.util.Collection)} or
     * {@link #withWirelessDeviceImportTaskList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessDeviceImportTaskList
     *        List of import tasks and summary information of onboarding status of devices in each import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDeviceImportTasksResult withWirelessDeviceImportTaskList(WirelessDeviceImportTask... wirelessDeviceImportTaskList) {
        if (this.wirelessDeviceImportTaskList == null) {
            setWirelessDeviceImportTaskList(new java.util.ArrayList<WirelessDeviceImportTask>(wirelessDeviceImportTaskList.length));
        }
        for (WirelessDeviceImportTask ele : wirelessDeviceImportTaskList) {
            this.wirelessDeviceImportTaskList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of import tasks and summary information of onboarding status of devices in each import task.
     * </p>
     * 
     * @param wirelessDeviceImportTaskList
     *        List of import tasks and summary information of onboarding status of devices in each import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessDeviceImportTasksResult withWirelessDeviceImportTaskList(java.util.Collection<WirelessDeviceImportTask> wirelessDeviceImportTaskList) {
        setWirelessDeviceImportTaskList(wirelessDeviceImportTaskList);
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
        if (getWirelessDeviceImportTaskList() != null)
            sb.append("WirelessDeviceImportTaskList: ").append(getWirelessDeviceImportTaskList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWirelessDeviceImportTasksResult == false)
            return false;
        ListWirelessDeviceImportTasksResult other = (ListWirelessDeviceImportTasksResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWirelessDeviceImportTaskList() == null ^ this.getWirelessDeviceImportTaskList() == null)
            return false;
        if (other.getWirelessDeviceImportTaskList() != null && other.getWirelessDeviceImportTaskList().equals(this.getWirelessDeviceImportTaskList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceImportTaskList() == null) ? 0 : getWirelessDeviceImportTaskList().hashCode());
        return hashCode;
    }

    @Override
    public ListWirelessDeviceImportTasksResult clone() {
        try {
            return (ListWirelessDeviceImportTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
