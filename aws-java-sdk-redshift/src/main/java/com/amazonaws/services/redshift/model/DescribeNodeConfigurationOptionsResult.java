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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeNodeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeConfigurationOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeConfigurationOption> nodeConfigurationOptionList;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * 
     * @return A list of valid node configurations.
     */

    public java.util.List<NodeConfigurationOption> getNodeConfigurationOptionList() {
        if (nodeConfigurationOptionList == null) {
            nodeConfigurationOptionList = new com.amazonaws.internal.SdkInternalList<NodeConfigurationOption>();
        }
        return nodeConfigurationOptionList;
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * 
     * @param nodeConfigurationOptionList
     *        A list of valid node configurations.
     */

    public void setNodeConfigurationOptionList(java.util.Collection<NodeConfigurationOption> nodeConfigurationOptionList) {
        if (nodeConfigurationOptionList == null) {
            this.nodeConfigurationOptionList = null;
            return;
        }

        this.nodeConfigurationOptionList = new com.amazonaws.internal.SdkInternalList<NodeConfigurationOption>(nodeConfigurationOptionList);
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeConfigurationOptionList(java.util.Collection)} or
     * {@link #withNodeConfigurationOptionList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nodeConfigurationOptionList
     *        A list of valid node configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsResult withNodeConfigurationOptionList(NodeConfigurationOption... nodeConfigurationOptionList) {
        if (this.nodeConfigurationOptionList == null) {
            setNodeConfigurationOptionList(new com.amazonaws.internal.SdkInternalList<NodeConfigurationOption>(nodeConfigurationOptionList.length));
        }
        for (NodeConfigurationOption ele : nodeConfigurationOptionList) {
            this.nodeConfigurationOptionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of valid node configurations.
     * </p>
     * 
     * @param nodeConfigurationOptionList
     *        A list of valid node configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsResult withNodeConfigurationOptionList(java.util.Collection<NodeConfigurationOption> nodeConfigurationOptionList) {
        setNodeConfigurationOptionList(nodeConfigurationOptionList);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeConfigurationOptionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getNodeConfigurationOptionList() != null)
            sb.append("NodeConfigurationOptionList: ").append(getNodeConfigurationOptionList()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeConfigurationOptionsResult == false)
            return false;
        DescribeNodeConfigurationOptionsResult other = (DescribeNodeConfigurationOptionsResult) obj;
        if (other.getNodeConfigurationOptionList() == null ^ this.getNodeConfigurationOptionList() == null)
            return false;
        if (other.getNodeConfigurationOptionList() != null && other.getNodeConfigurationOptionList().equals(this.getNodeConfigurationOptionList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeConfigurationOptionList() == null) ? 0 : getNodeConfigurationOptionList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeConfigurationOptionsResult clone() {
        try {
            return (DescribeNodeConfigurationOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
