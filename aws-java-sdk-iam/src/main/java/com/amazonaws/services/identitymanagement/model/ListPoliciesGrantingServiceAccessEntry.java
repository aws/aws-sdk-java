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
 * Contains details about the permissions policies that are attached to the specified identity (user, group, or role).
 * </p>
 * <p>
 * This data type is used as a response element in the <a>ListPoliciesGrantingServiceAccess</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPoliciesGrantingServiceAccessEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesGrantingServiceAccessEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the service that was accessed.
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
     * The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyGrantingServiceAccess> policies;

    /**
     * <p>
     * The namespace of the service that was accessed.
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
     *        The namespace of the service that was accessed.</p>
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
     * The namespace of the service that was accessed.
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
     * @return The namespace of the service that was accessed.</p>
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
     * The namespace of the service that was accessed.
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
     *        The namespace of the service that was accessed.</p>
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

    public ListPoliciesGrantingServiceAccessEntry withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * </p>
     * 
     * @return The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     */

    public java.util.List<PolicyGrantingServiceAccess> getPolicies() {
        if (policies == null) {
            policies = new com.amazonaws.internal.SdkInternalList<PolicyGrantingServiceAccess>();
        }
        return policies;
    }

    /**
     * <p>
     * The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * </p>
     * 
     * @param policies
     *        The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     */

    public void setPolicies(java.util.Collection<PolicyGrantingServiceAccess> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new com.amazonaws.internal.SdkInternalList<PolicyGrantingServiceAccess>(policies);
    }

    /**
     * <p>
     * The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessEntry withPolicies(PolicyGrantingServiceAccess... policies) {
        if (this.policies == null) {
            setPolicies(new com.amazonaws.internal.SdkInternalList<PolicyGrantingServiceAccess>(policies.length));
        }
        for (PolicyGrantingServiceAccess ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * </p>
     * 
     * @param policies
     *        The <code>PoliciesGrantingServiceAccess</code> object that contains details about the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessEntry withPolicies(java.util.Collection<PolicyGrantingServiceAccess> policies) {
        setPolicies(policies);
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesGrantingServiceAccessEntry == false)
            return false;
        ListPoliciesGrantingServiceAccessEntry other = (ListPoliciesGrantingServiceAccessEntry) obj;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesGrantingServiceAccessEntry clone() {
        try {
            return (ListPoliciesGrantingServiceAccessEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
