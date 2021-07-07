/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains details about the most recent attempt to access an action within the service.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/TrackedActionLastAccessed" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackedActionLastAccessed implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to
     * IAM.
     * </p>
     */
    private String actionName;

    private String lastAccessedEntity;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAccessedTime;
    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. Amazon
     * Web Services does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String lastAccessedRegion;

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to
     * IAM.
     * </p>
     * 
     * @param actionName
     *        The name of the tracked action to which access was attempted. Tracked actions are actions that report
     *        activity to IAM.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to
     * IAM.
     * </p>
     * 
     * @return The name of the tracked action to which access was attempted. Tracked actions are actions that report
     *         activity to IAM.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to
     * IAM.
     * </p>
     * 
     * @param actionName
     *        The name of the tracked action to which access was attempted. Tracked actions are actions that report
     *        activity to IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackedActionLastAccessed withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * @param lastAccessedEntity
     */

    public void setLastAccessedEntity(String lastAccessedEntity) {
        this.lastAccessedEntity = lastAccessedEntity;
    }

    /**
     * @return
     */

    public String getLastAccessedEntity() {
        return this.lastAccessedEntity;
    }

    /**
     * @param lastAccessedEntity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackedActionLastAccessed withLastAccessedEntity(String lastAccessedEntity) {
        setLastAccessedEntity(lastAccessedEntity);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAccessedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not
     *        report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *         authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not
     *         report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public java.util.Date getLastAccessedTime() {
        return this.lastAccessedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAccessedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not
     *        report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackedActionLastAccessed withLastAccessedTime(java.util.Date lastAccessedTime) {
        setLastAccessedTime(lastAccessedTime);
        return this;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. Amazon
     * Web Services does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAccessedRegion
     *        The Region from which the authenticated entity (user or role) last attempted to access the tracked action.
     *        Amazon Web Services does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAccessedRegion(String lastAccessedRegion) {
        this.lastAccessedRegion = lastAccessedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. Amazon
     * Web Services does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The Region from which the authenticated entity (user or role) last attempted to access the tracked
     *         action. Amazon Web Services does not report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public String getLastAccessedRegion() {
        return this.lastAccessedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. Amazon
     * Web Services does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAccessedRegion
     *        The Region from which the authenticated entity (user or role) last attempted to access the tracked action.
     *        Amazon Web Services does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no IAM entities attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackedActionLastAccessed withLastAccessedRegion(String lastAccessedRegion) {
        setLastAccessedRegion(lastAccessedRegion);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getLastAccessedEntity() != null)
            sb.append("LastAccessedEntity: ").append(getLastAccessedEntity()).append(",");
        if (getLastAccessedTime() != null)
            sb.append("LastAccessedTime: ").append(getLastAccessedTime()).append(",");
        if (getLastAccessedRegion() != null)
            sb.append("LastAccessedRegion: ").append(getLastAccessedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackedActionLastAccessed == false)
            return false;
        TrackedActionLastAccessed other = (TrackedActionLastAccessed) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getLastAccessedEntity() == null ^ this.getLastAccessedEntity() == null)
            return false;
        if (other.getLastAccessedEntity() != null && other.getLastAccessedEntity().equals(this.getLastAccessedEntity()) == false)
            return false;
        if (other.getLastAccessedTime() == null ^ this.getLastAccessedTime() == null)
            return false;
        if (other.getLastAccessedTime() != null && other.getLastAccessedTime().equals(this.getLastAccessedTime()) == false)
            return false;
        if (other.getLastAccessedRegion() == null ^ this.getLastAccessedRegion() == null)
            return false;
        if (other.getLastAccessedRegion() != null && other.getLastAccessedRegion().equals(this.getLastAccessedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedEntity() == null) ? 0 : getLastAccessedEntity().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedTime() == null) ? 0 : getLastAccessedTime().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedRegion() == null) ? 0 : getLastAccessedRegion().hashCode());
        return hashCode;
    }

    @Override
    public TrackedActionLastAccessed clone() {
        try {
            return (TrackedActionLastAccessed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
