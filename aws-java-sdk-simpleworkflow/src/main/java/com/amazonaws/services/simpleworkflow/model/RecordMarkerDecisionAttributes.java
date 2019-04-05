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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>RecordMarker</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an <code>Action</code> element to allow or deny permission to call this action.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot use an IAM policy to constrain this action's parameters.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
 * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RecordMarkerDecisionAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordMarkerDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the marker.
     * </p>
     */
    private String markerName;
    /**
     * <p>
     * The details of the marker.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @param markerName
     *        The name of the marker.
     */

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @return The name of the marker.
     */

    public String getMarkerName() {
        return this.markerName;
    }

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @param markerName
     *        The name of the marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordMarkerDecisionAttributes withMarkerName(String markerName) {
        setMarkerName(markerName);
        return this;
    }

    /**
     * <p>
     * The details of the marker.
     * </p>
     * 
     * @param details
     *        The details of the marker.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details of the marker.
     * </p>
     * 
     * @return The details of the marker.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details of the marker.
     * </p>
     * 
     * @param details
     *        The details of the marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordMarkerDecisionAttributes withDetails(String details) {
        setDetails(details);
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
        if (getMarkerName() != null)
            sb.append("MarkerName: ").append(getMarkerName()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordMarkerDecisionAttributes == false)
            return false;
        RecordMarkerDecisionAttributes other = (RecordMarkerDecisionAttributes) obj;
        if (other.getMarkerName() == null ^ this.getMarkerName() == null)
            return false;
        if (other.getMarkerName() != null && other.getMarkerName().equals(this.getMarkerName()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkerName() == null) ? 0 : getMarkerName().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public RecordMarkerDecisionAttributes clone() {
        try {
            return (RecordMarkerDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.RecordMarkerDecisionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
