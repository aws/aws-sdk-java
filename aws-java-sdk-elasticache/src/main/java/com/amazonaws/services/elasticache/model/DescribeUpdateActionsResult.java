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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUpdateActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returns a list of update actions
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpdateAction> updateActions;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returns a list of update actions
     * </p>
     * 
     * @return Returns a list of update actions
     */

    public java.util.List<UpdateAction> getUpdateActions() {
        if (updateActions == null) {
            updateActions = new com.amazonaws.internal.SdkInternalList<UpdateAction>();
        }
        return updateActions;
    }

    /**
     * <p>
     * Returns a list of update actions
     * </p>
     * 
     * @param updateActions
     *        Returns a list of update actions
     */

    public void setUpdateActions(java.util.Collection<UpdateAction> updateActions) {
        if (updateActions == null) {
            this.updateActions = null;
            return;
        }

        this.updateActions = new com.amazonaws.internal.SdkInternalList<UpdateAction>(updateActions);
    }

    /**
     * <p>
     * Returns a list of update actions
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateActions(java.util.Collection)} or {@link #withUpdateActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param updateActions
     *        Returns a list of update actions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsResult withUpdateActions(UpdateAction... updateActions) {
        if (this.updateActions == null) {
            setUpdateActions(new com.amazonaws.internal.SdkInternalList<UpdateAction>(updateActions.length));
        }
        for (UpdateAction ele : updateActions) {
            this.updateActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of update actions
     * </p>
     * 
     * @param updateActions
     *        Returns a list of update actions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateActionsResult withUpdateActions(java.util.Collection<UpdateAction> updateActions) {
        setUpdateActions(updateActions);
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
        if (getUpdateActions() != null)
            sb.append("UpdateActions: ").append(getUpdateActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUpdateActionsResult == false)
            return false;
        DescribeUpdateActionsResult other = (DescribeUpdateActionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getUpdateActions() == null ^ this.getUpdateActions() == null)
            return false;
        if (other.getUpdateActions() != null && other.getUpdateActions().equals(this.getUpdateActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getUpdateActions() == null) ? 0 : getUpdateActions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUpdateActionsResult clone() {
        try {
            return (DescribeUpdateActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
