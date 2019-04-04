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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPoliciesGrantingServiceAccess"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesGrantingServiceAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceNamespaces;

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     * </p>
     * 
     * @param arn
     *        The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     * </p>
     * 
     * @return The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     * </p>
     * 
     * @param arn
     *        The ARN of the IAM identity (user, group, or role) whose policies you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The service namespace for the AWS services whose policies you want to list.</p>
     *         <p>
     *         To learn the service namespace for a service, go to <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the
     *         name of the service to view details for that service. In the first paragraph, find the service prefix.
     *         For example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *         href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public java.util.List<String> getServiceNamespaces() {
        if (serviceNamespaces == null) {
            serviceNamespaces = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceNamespaces;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespaces
     *        The service namespace for the AWS services whose policies you want to list.</p>
     *        <p>
     *        To learn the service namespace for a service, go to <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name
     *        of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setServiceNamespaces(java.util.Collection<String> serviceNamespaces) {
        if (serviceNamespaces == null) {
            this.serviceNamespaces = null;
            return;
        }

        this.serviceNamespaces = new com.amazonaws.internal.SdkInternalList<String>(serviceNamespaces);
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceNamespaces(java.util.Collection)} or {@link #withServiceNamespaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serviceNamespaces
     *        The service namespace for the AWS services whose policies you want to list.</p>
     *        <p>
     *        To learn the service namespace for a service, go to <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name
     *        of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessRequest withServiceNamespaces(String... serviceNamespaces) {
        if (this.serviceNamespaces == null) {
            setServiceNamespaces(new com.amazonaws.internal.SdkInternalList<String>(serviceNamespaces.length));
        }
        for (String ele : serviceNamespaces) {
            this.serviceNamespaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service namespace for the AWS services whose policies you want to list.
     * </p>
     * <p>
     * To learn the service namespace for a service, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name of the
     * service to view details for that service. In the first paragraph, find the service prefix. For example,
     * <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param serviceNamespaces
     *        The service namespace for the AWS services whose policies you want to list.</p>
     *        <p>
     *        To learn the service namespace for a service, go to <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, Resources, and Condition Keys for AWS Services</a> in the <i>IAM User Guide</i>. Choose the name
     *        of the service to view details for that service. In the first paragraph, find the service prefix. For
     *        example, <code>(service prefix: a4b)</code>. For more information about service namespaces, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesGrantingServiceAccessRequest withServiceNamespaces(java.util.Collection<String> serviceNamespaces) {
        setServiceNamespaces(serviceNamespaces);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getServiceNamespaces() != null)
            sb.append("ServiceNamespaces: ").append(getServiceNamespaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesGrantingServiceAccessRequest == false)
            return false;
        ListPoliciesGrantingServiceAccessRequest other = (ListPoliciesGrantingServiceAccessRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getServiceNamespaces() == null ^ this.getServiceNamespaces() == null)
            return false;
        if (other.getServiceNamespaces() != null && other.getServiceNamespaces().equals(this.getServiceNamespaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespaces() == null) ? 0 : getServiceNamespaces().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesGrantingServiceAccessRequest clone() {
        return (ListPoliciesGrantingServiceAccessRequest) super.clone();
    }

}
