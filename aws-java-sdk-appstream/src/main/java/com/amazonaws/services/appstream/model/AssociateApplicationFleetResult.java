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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateApplicationFleet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateApplicationFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If fleet name is specified, this returns the list of applications that are associated to it. If application ARN
     * is specified, this returns the list of fleets to which it is associated.
     * </p>
     */
    private ApplicationFleetAssociation applicationFleetAssociation;

    /**
     * <p>
     * If fleet name is specified, this returns the list of applications that are associated to it. If application ARN
     * is specified, this returns the list of fleets to which it is associated.
     * </p>
     * 
     * @param applicationFleetAssociation
     *        If fleet name is specified, this returns the list of applications that are associated to it. If
     *        application ARN is specified, this returns the list of fleets to which it is associated.
     */

    public void setApplicationFleetAssociation(ApplicationFleetAssociation applicationFleetAssociation) {
        this.applicationFleetAssociation = applicationFleetAssociation;
    }

    /**
     * <p>
     * If fleet name is specified, this returns the list of applications that are associated to it. If application ARN
     * is specified, this returns the list of fleets to which it is associated.
     * </p>
     * 
     * @return If fleet name is specified, this returns the list of applications that are associated to it. If
     *         application ARN is specified, this returns the list of fleets to which it is associated.
     */

    public ApplicationFleetAssociation getApplicationFleetAssociation() {
        return this.applicationFleetAssociation;
    }

    /**
     * <p>
     * If fleet name is specified, this returns the list of applications that are associated to it. If application ARN
     * is specified, this returns the list of fleets to which it is associated.
     * </p>
     * 
     * @param applicationFleetAssociation
     *        If fleet name is specified, this returns the list of applications that are associated to it. If
     *        application ARN is specified, this returns the list of fleets to which it is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateApplicationFleetResult withApplicationFleetAssociation(ApplicationFleetAssociation applicationFleetAssociation) {
        setApplicationFleetAssociation(applicationFleetAssociation);
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
        if (getApplicationFleetAssociation() != null)
            sb.append("ApplicationFleetAssociation: ").append(getApplicationFleetAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateApplicationFleetResult == false)
            return false;
        AssociateApplicationFleetResult other = (AssociateApplicationFleetResult) obj;
        if (other.getApplicationFleetAssociation() == null ^ this.getApplicationFleetAssociation() == null)
            return false;
        if (other.getApplicationFleetAssociation() != null && other.getApplicationFleetAssociation().equals(this.getApplicationFleetAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationFleetAssociation() == null) ? 0 : getApplicationFleetAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateApplicationFleetResult clone() {
        try {
            return (AssociateApplicationFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
