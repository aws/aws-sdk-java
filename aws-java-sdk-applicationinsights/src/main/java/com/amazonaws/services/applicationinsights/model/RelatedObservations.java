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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes observations related to the problem.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/RelatedObservations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedObservations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of observations related to the problem.
     * </p>
     */
    private java.util.List<Observation> observationList;

    /**
     * <p>
     * The list of observations related to the problem.
     * </p>
     * 
     * @return The list of observations related to the problem.
     */

    public java.util.List<Observation> getObservationList() {
        return observationList;
    }

    /**
     * <p>
     * The list of observations related to the problem.
     * </p>
     * 
     * @param observationList
     *        The list of observations related to the problem.
     */

    public void setObservationList(java.util.Collection<Observation> observationList) {
        if (observationList == null) {
            this.observationList = null;
            return;
        }

        this.observationList = new java.util.ArrayList<Observation>(observationList);
    }

    /**
     * <p>
     * The list of observations related to the problem.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObservationList(java.util.Collection)} or {@link #withObservationList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param observationList
     *        The list of observations related to the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedObservations withObservationList(Observation... observationList) {
        if (this.observationList == null) {
            setObservationList(new java.util.ArrayList<Observation>(observationList.length));
        }
        for (Observation ele : observationList) {
            this.observationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of observations related to the problem.
     * </p>
     * 
     * @param observationList
     *        The list of observations related to the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedObservations withObservationList(java.util.Collection<Observation> observationList) {
        setObservationList(observationList);
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
        if (getObservationList() != null)
            sb.append("ObservationList: ").append(getObservationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedObservations == false)
            return false;
        RelatedObservations other = (RelatedObservations) obj;
        if (other.getObservationList() == null ^ this.getObservationList() == null)
            return false;
        if (other.getObservationList() != null && other.getObservationList().equals(this.getObservationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservationList() == null) ? 0 : getObservationList().hashCode());
        return hashCode;
    }

    @Override
    public RelatedObservations clone() {
        try {
            return (RelatedObservations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.RelatedObservationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
