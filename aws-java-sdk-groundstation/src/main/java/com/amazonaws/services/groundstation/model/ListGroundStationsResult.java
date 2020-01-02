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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListGroundStations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroundStationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of ground stations.
     * </p>
     */
    private java.util.List<GroundStationData> groundStationList;
    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of ground stations.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of ground stations.
     * </p>
     * 
     * @return List of ground stations.
     */

    public java.util.List<GroundStationData> getGroundStationList() {
        return groundStationList;
    }

    /**
     * <p>
     * List of ground stations.
     * </p>
     * 
     * @param groundStationList
     *        List of ground stations.
     */

    public void setGroundStationList(java.util.Collection<GroundStationData> groundStationList) {
        if (groundStationList == null) {
            this.groundStationList = null;
            return;
        }

        this.groundStationList = new java.util.ArrayList<GroundStationData>(groundStationList);
    }

    /**
     * <p>
     * List of ground stations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroundStationList(java.util.Collection)} or {@link #withGroundStationList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param groundStationList
     *        List of ground stations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroundStationsResult withGroundStationList(GroundStationData... groundStationList) {
        if (this.groundStationList == null) {
            setGroundStationList(new java.util.ArrayList<GroundStationData>(groundStationList.length));
        }
        for (GroundStationData ele : groundStationList) {
            this.groundStationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ground stations.
     * </p>
     * 
     * @param groundStationList
     *        List of ground stations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroundStationsResult withGroundStationList(java.util.Collection<GroundStationData> groundStationList) {
        setGroundStationList(groundStationList);
        return this;
    }

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of ground stations.
     * </p>
     * 
     * @param nextToken
     *        Next token that can be supplied in the next call to get the next page of ground stations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of ground stations.
     * </p>
     * 
     * @return Next token that can be supplied in the next call to get the next page of ground stations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of ground stations.
     * </p>
     * 
     * @param nextToken
     *        Next token that can be supplied in the next call to get the next page of ground stations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroundStationsResult withNextToken(String nextToken) {
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
        if (getGroundStationList() != null)
            sb.append("GroundStationList: ").append(getGroundStationList()).append(",");
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

        if (obj instanceof ListGroundStationsResult == false)
            return false;
        ListGroundStationsResult other = (ListGroundStationsResult) obj;
        if (other.getGroundStationList() == null ^ this.getGroundStationList() == null)
            return false;
        if (other.getGroundStationList() != null && other.getGroundStationList().equals(this.getGroundStationList()) == false)
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

        hashCode = prime * hashCode + ((getGroundStationList() == null) ? 0 : getGroundStationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroundStationsResult clone() {
        try {
            return (ListGroundStationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
