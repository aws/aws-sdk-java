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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOTAUpdatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     */
    private java.util.List<OTAUpdateSummary> otaUpdates;
    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * 
     * @return A list of OTA update jobs.
     */

    public java.util.List<OTAUpdateSummary> getOtaUpdates() {
        return otaUpdates;
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * 
     * @param otaUpdates
     *        A list of OTA update jobs.
     */

    public void setOtaUpdates(java.util.Collection<OTAUpdateSummary> otaUpdates) {
        if (otaUpdates == null) {
            this.otaUpdates = null;
            return;
        }

        this.otaUpdates = new java.util.ArrayList<OTAUpdateSummary>(otaUpdates);
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOtaUpdates(java.util.Collection)} or {@link #withOtaUpdates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param otaUpdates
     *        A list of OTA update jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOTAUpdatesResult withOtaUpdates(OTAUpdateSummary... otaUpdates) {
        if (this.otaUpdates == null) {
            setOtaUpdates(new java.util.ArrayList<OTAUpdateSummary>(otaUpdates.length));
        }
        for (OTAUpdateSummary ele : otaUpdates) {
            this.otaUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * 
     * @param otaUpdates
     *        A list of OTA update jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOTAUpdatesResult withOtaUpdates(java.util.Collection<OTAUpdateSummary> otaUpdates) {
        setOtaUpdates(otaUpdates);
        return this;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to use to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     * 
     * @return A token to use to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to use to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOTAUpdatesResult withNextToken(String nextToken) {
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
        if (getOtaUpdates() != null)
            sb.append("OtaUpdates: ").append(getOtaUpdates()).append(",");
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

        if (obj instanceof ListOTAUpdatesResult == false)
            return false;
        ListOTAUpdatesResult other = (ListOTAUpdatesResult) obj;
        if (other.getOtaUpdates() == null ^ this.getOtaUpdates() == null)
            return false;
        if (other.getOtaUpdates() != null && other.getOtaUpdates().equals(this.getOtaUpdates()) == false)
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

        hashCode = prime * hashCode + ((getOtaUpdates() == null) ? 0 : getOtaUpdates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOTAUpdatesResult clone() {
        try {
            return (ListOTAUpdatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
