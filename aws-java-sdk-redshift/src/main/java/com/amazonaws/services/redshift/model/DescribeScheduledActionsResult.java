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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeScheduledActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * List of retrieved scheduled actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledAction> scheduledActions;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>
     *        , AWS returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeScheduledActions</a> request exceed the value specified in
     *         <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeScheduledActions</a> request exceed the value specified in <code>MaxRecords</code>
     *        , AWS returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * List of retrieved scheduled actions.
     * </p>
     * 
     * @return List of retrieved scheduled actions.
     */

    public java.util.List<ScheduledAction> getScheduledActions() {
        if (scheduledActions == null) {
            scheduledActions = new com.amazonaws.internal.SdkInternalList<ScheduledAction>();
        }
        return scheduledActions;
    }

    /**
     * <p>
     * List of retrieved scheduled actions.
     * </p>
     * 
     * @param scheduledActions
     *        List of retrieved scheduled actions.
     */

    public void setScheduledActions(java.util.Collection<ScheduledAction> scheduledActions) {
        if (scheduledActions == null) {
            this.scheduledActions = null;
            return;
        }

        this.scheduledActions = new com.amazonaws.internal.SdkInternalList<ScheduledAction>(scheduledActions);
    }

    /**
     * <p>
     * List of retrieved scheduled actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledActions(java.util.Collection)} or {@link #withScheduledActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduledActions
     *        List of retrieved scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledActions(ScheduledAction... scheduledActions) {
        if (this.scheduledActions == null) {
            setScheduledActions(new com.amazonaws.internal.SdkInternalList<ScheduledAction>(scheduledActions.length));
        }
        for (ScheduledAction ele : scheduledActions) {
            this.scheduledActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of retrieved scheduled actions.
     * </p>
     * 
     * @param scheduledActions
     *        List of retrieved scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledActions(java.util.Collection<ScheduledAction> scheduledActions) {
        setScheduledActions(scheduledActions);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getScheduledActions() != null)
            sb.append("ScheduledActions: ").append(getScheduledActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledActionsResult == false)
            return false;
        DescribeScheduledActionsResult other = (DescribeScheduledActionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getScheduledActions() == null ^ this.getScheduledActions() == null)
            return false;
        if (other.getScheduledActions() != null && other.getScheduledActions().equals(this.getScheduledActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getScheduledActions() == null) ? 0 : getScheduledActions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledActionsResult clone() {
        try {
            return (DescribeScheduledActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
