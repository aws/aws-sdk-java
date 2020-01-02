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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that contains details about when a principal in the reported AWS Organizations entity last attempted to
 * access an AWS service. A principal can be an IAM user, an IAM role, or the AWS account root user within the reported
 * Organizations entity.
 * </p>
 * <p>
 * This data type is a response element in the <a>GetOrganizationsAccessReport</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/AccessDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     * principal last attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String entityPath;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAuthenticatedTime;
    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to
     * access the service in the reporting period.
     * </p>
     */
    private Integer totalAuthenticatedEntities;

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in which access was attempted.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @return The name of the service in which access was attempted.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * 
     * @param serviceName
     *        The name of the service in which access was attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the service in which access was attempted.</p>
     *        <p>
     *        To learn the service namespace of a service, go to <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name
     *        of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The namespace of the service in which access was attempted.</p>
     *         <p>
     *         To learn the service namespace of a service, go to <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the
     *         name of the service to view details for that service. In the first paragraph, find the service prefix.
     *         For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *         href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the service in which access was attempted.</p>
     *        <p>
     *        To learn the service namespace of a service, go to <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name
     *        of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param region
     *        The Region where the last service access attempt occurred.</p>
     *        <p>
     *        This field is null if no principals in the reported Organizations entity attempted to access the service
     *        within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The Region where the last service access attempt occurred.</p>
     *         <p>
     *         This field is null if no principals in the reported Organizations entity attempted to access the service
     *         within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param region
     *        The Region where the last service access attempt occurred.</p>
     *        <p>
     *        This field is null if no principals in the reported Organizations entity attempted to access the service
     *        within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     * principal last attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param entityPath
     *        The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     *        principal last attempted to access the service. AWS does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations
     *        entity attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setEntityPath(String entityPath) {
        this.entityPath = entityPath;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     * principal last attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     *         principal last attempted to access the service. AWS does not report unauthenticated requests.</p>
     *         <p>
     *         This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations
     *         entity attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public String getEntityPath() {
        return this.entityPath;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     * principal last attempted to access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param entityPath
     *        The path of the Organizations entity (root, organizational unit, or account) from which an authenticated
     *        principal last attempted to access the service. AWS does not report unauthenticated requests.</p>
     *        <p>
     *        This field is null if no principals (IAM users, IAM roles, or root users) in the reported Organizations
     *        entity attempted to access the service within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withEntityPath(String entityPath) {
        setEntityPath(entityPath);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     *        requests.</p>
     *        <p>
     *        This field is null if no principals in the reported Organizations entity attempted to access the service
     *        within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     */

    public void setLastAuthenticatedTime(java.util.Date lastAuthenticatedTime) {
        this.lastAuthenticatedTime = lastAuthenticatedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *         authenticated principal most recently attempted to access the service. AWS does not report
     *         unauthenticated requests.</p>
     *         <p>
     *         This field is null if no principals in the reported Organizations entity attempted to access the service
     *         within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     */

    public java.util.Date getLastAuthenticatedTime() {
        return this.lastAuthenticatedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     * authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity attempted to access the service within
     * the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * 
     * @param lastAuthenticatedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when an
     *        authenticated principal most recently attempted to access the service. AWS does not report unauthenticated
     *        requests.</p>
     *        <p>
     *        This field is null if no principals in the reported Organizations entity attempted to access the service
     *        within the <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *        >reporting period</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withLastAuthenticatedTime(java.util.Date lastAuthenticatedTime) {
        setLastAuthenticatedTime(lastAuthenticatedTime);
        return this;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to
     * access the service in the reporting period.
     * </p>
     * 
     * @param totalAuthenticatedEntities
     *        The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted
     *        to access the service in the reporting period.
     */

    public void setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to
     * access the service in the reporting period.
     * </p>
     * 
     * @return The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that
     *         attempted to access the service in the reporting period.
     */

    public Integer getTotalAuthenticatedEntities() {
        return this.totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted to
     * access the service in the reporting period.
     * </p>
     * 
     * @param totalAuthenticatedEntities
     *        The number of accounts with authenticated principals (root users, IAM users, and IAM roles) that attempted
     *        to access the service in the reporting period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDetail withTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        setTotalAuthenticatedEntities(totalAuthenticatedEntities);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getEntityPath() != null)
            sb.append("EntityPath: ").append(getEntityPath()).append(",");
        if (getLastAuthenticatedTime() != null)
            sb.append("LastAuthenticatedTime: ").append(getLastAuthenticatedTime()).append(",");
        if (getTotalAuthenticatedEntities() != null)
            sb.append("TotalAuthenticatedEntities: ").append(getTotalAuthenticatedEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessDetail == false)
            return false;
        AccessDetail other = (AccessDetail) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getEntityPath() == null ^ this.getEntityPath() == null)
            return false;
        if (other.getEntityPath() != null && other.getEntityPath().equals(this.getEntityPath()) == false)
            return false;
        if (other.getLastAuthenticatedTime() == null ^ this.getLastAuthenticatedTime() == null)
            return false;
        if (other.getLastAuthenticatedTime() != null && other.getLastAuthenticatedTime().equals(this.getLastAuthenticatedTime()) == false)
            return false;
        if (other.getTotalAuthenticatedEntities() == null ^ this.getTotalAuthenticatedEntities() == null)
            return false;
        if (other.getTotalAuthenticatedEntities() != null && other.getTotalAuthenticatedEntities().equals(this.getTotalAuthenticatedEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getEntityPath() == null) ? 0 : getEntityPath().hashCode());
        hashCode = prime * hashCode + ((getLastAuthenticatedTime() == null) ? 0 : getLastAuthenticatedTime().hashCode());
        hashCode = prime * hashCode + ((getTotalAuthenticatedEntities() == null) ? 0 : getTotalAuthenticatedEntities().hashCode());
        return hashCode;
    }

    @Override
    public AccessDetail clone() {
        try {
            return (AccessDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
