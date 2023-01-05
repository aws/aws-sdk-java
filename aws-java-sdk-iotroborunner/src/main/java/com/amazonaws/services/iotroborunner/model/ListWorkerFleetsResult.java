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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkerFleets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkerFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextToken;

    private java.util.List<WorkerFleet> workerFleets;

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

    public ListWorkerFleetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<WorkerFleet> getWorkerFleets() {
        return workerFleets;
    }

    /**
     * @param workerFleets
     */

    public void setWorkerFleets(java.util.Collection<WorkerFleet> workerFleets) {
        if (workerFleets == null) {
            this.workerFleets = null;
            return;
        }

        this.workerFleets = new java.util.ArrayList<WorkerFleet>(workerFleets);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkerFleets(java.util.Collection)} or {@link #withWorkerFleets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workerFleets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerFleetsResult withWorkerFleets(WorkerFleet... workerFleets) {
        if (this.workerFleets == null) {
            setWorkerFleets(new java.util.ArrayList<WorkerFleet>(workerFleets.length));
        }
        for (WorkerFleet ele : workerFleets) {
            this.workerFleets.add(ele);
        }
        return this;
    }

    /**
     * @param workerFleets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkerFleetsResult withWorkerFleets(java.util.Collection<WorkerFleet> workerFleets) {
        setWorkerFleets(workerFleets);
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
        if (getWorkerFleets() != null)
            sb.append("WorkerFleets: ").append(getWorkerFleets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkerFleetsResult == false)
            return false;
        ListWorkerFleetsResult other = (ListWorkerFleetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkerFleets() == null ^ this.getWorkerFleets() == null)
            return false;
        if (other.getWorkerFleets() != null && other.getWorkerFleets().equals(this.getWorkerFleets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkerFleets() == null) ? 0 : getWorkerFleets().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkerFleetsResult clone() {
        try {
            return (ListWorkerFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
