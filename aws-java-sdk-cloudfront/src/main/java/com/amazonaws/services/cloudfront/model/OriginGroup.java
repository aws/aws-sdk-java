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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An origin group includes two origins (a primary origin and a second origin to failover to) and a failover criteria
 * that you specify. You create an origin group to support origin failover in CloudFront. When you create or update a
 * distribution, you can specifiy the origin group instead of a single origin, and CloudFront will failover from the
 * primary origin to the second origin under the failover conditions that you've chosen.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/OriginGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The origin group's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A complex type that contains information about the failover criteria for an origin group.
     * </p>
     */
    private OriginGroupFailoverCriteria failoverCriteria;
    /**
     * <p>
     * A complex type that contains information about the origins in an origin group.
     * </p>
     */
    private OriginGroupMembers members;

    /**
     * <p>
     * The origin group's ID.
     * </p>
     * 
     * @param id
     *        The origin group's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The origin group's ID.
     * </p>
     * 
     * @return The origin group's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The origin group's ID.
     * </p>
     * 
     * @param id
     *        The origin group's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for an origin group.
     * </p>
     * 
     * @param failoverCriteria
     *        A complex type that contains information about the failover criteria for an origin group.
     */

    public void setFailoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for an origin group.
     * </p>
     * 
     * @return A complex type that contains information about the failover criteria for an origin group.
     */

    public OriginGroupFailoverCriteria getFailoverCriteria() {
        return this.failoverCriteria;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for an origin group.
     * </p>
     * 
     * @param failoverCriteria
     *        A complex type that contains information about the failover criteria for an origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroup withFailoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
        setFailoverCriteria(failoverCriteria);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin group.
     * </p>
     * 
     * @param members
     *        A complex type that contains information about the origins in an origin group.
     */

    public void setMembers(OriginGroupMembers members) {
        this.members = members;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin group.
     * </p>
     * 
     * @return A complex type that contains information about the origins in an origin group.
     */

    public OriginGroupMembers getMembers() {
        return this.members;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin group.
     * </p>
     * 
     * @param members
     *        A complex type that contains information about the origins in an origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroup withMembers(OriginGroupMembers members) {
        setMembers(members);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFailoverCriteria() != null)
            sb.append("FailoverCriteria: ").append(getFailoverCriteria()).append(",");
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroup == false)
            return false;
        OriginGroup other = (OriginGroup) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFailoverCriteria() == null ^ this.getFailoverCriteria() == null)
            return false;
        if (other.getFailoverCriteria() != null && other.getFailoverCriteria().equals(this.getFailoverCriteria()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFailoverCriteria() == null) ? 0 : getFailoverCriteria().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        return hashCode;
    }

    @Override
    public OriginGroup clone() {
        try {
            return (OriginGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
