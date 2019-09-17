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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that contains details about when the IAM entities (users or roles) were last used in an attempt to access
 * the specified AWS service.
 * </p>
 * <p>
 * This data type is a response element in the <a>GetServiceLastAccessedDetailsWithEntities</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/EntityDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity (user or role).
     * </p>
     */
    private EntityInfo entityInfo;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAuthenticated;

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity (user or role).
     * </p>
     * 
     * @param entityInfo
     *        The <code>EntityInfo</code> object that contains details about the entity (user or role).
     */

    public void setEntityInfo(EntityInfo entityInfo) {
        this.entityInfo = entityInfo;
    }

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity (user or role).
     * </p>
     * 
     * @return The <code>EntityInfo</code> object that contains details about the entity (user or role).
     */

    public EntityInfo getEntityInfo() {
        return this.entityInfo;
    }

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity (user or role).
     * </p>
     * 
     * @param entityInfo
     *        The <code>EntityInfo</code> object that contains details about the entity (user or role).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetails withEntityInfo(EntityInfo entityInfo) {
        setEntityInfo(entityInfo);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticated
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAuthenticated(java.util.Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public java.util.Date getLastAuthenticated() {
        return this.lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticated
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDetails withLastAuthenticated(java.util.Date lastAuthenticated) {
        setLastAuthenticated(lastAuthenticated);
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
        if (getEntityInfo() != null)
            sb.append("EntityInfo: ").append(getEntityInfo()).append(",");
        if (getLastAuthenticated() != null)
            sb.append("LastAuthenticated: ").append(getLastAuthenticated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDetails == false)
            return false;
        EntityDetails other = (EntityDetails) obj;
        if (other.getEntityInfo() == null ^ this.getEntityInfo() == null)
            return false;
        if (other.getEntityInfo() != null && other.getEntityInfo().equals(this.getEntityInfo()) == false)
            return false;
        if (other.getLastAuthenticated() == null ^ this.getLastAuthenticated() == null)
            return false;
        if (other.getLastAuthenticated() != null && other.getLastAuthenticated().equals(this.getLastAuthenticated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityInfo() == null) ? 0 : getEntityInfo().hashCode());
        hashCode = prime * hashCode + ((getLastAuthenticated() == null) ? 0 : getLastAuthenticated().hashCode());
        return hashCode;
    }

    @Override
    public EntityDetails clone() {
        try {
            return (EntityDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
